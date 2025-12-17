package me.serbob.kodaridocs.service;

import com.anthropic.client.AnthropicClient;
import com.anthropic.client.okhttp.AnthropicOkHttpClient;
import com.anthropic.models.messages.MessageCountTokensParams;
import com.anthropic.models.messages.MessageTokensCount;
import com.anthropic.models.messages.Model;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TokenCountService {

    /*
     * We are using anthropic's tokenizer for all models
     * We absorb 90% of input tokens so the clients don't have
     * to spend a lot of tokens just for the AI to read documentation
     */
    private final AnthropicClient anthropicClient;

    public TokenCountService(
            @Value("${anthropic.api-key}") String apiKey
    ) {
        if (apiKey == null || apiKey.isEmpty())
            throw new IllegalStateException("Missing ANTHROPIC_API_KEY");

        this.anthropicClient = AnthropicOkHttpClient.builder()
                .apiKey(apiKey)
                .build();
    }

    public long countTokens(
            String text
    ) {
        try {
            MessageCountTokensParams params = MessageCountTokensParams.builder()
                    .model(Model.CLAUDE_4_SONNET_20250514)
                    .addUserMessage(text)
                    .build();

            MessageTokensCount count = anthropicClient.messages().countTokens(params);

            return count.inputTokens();
        } catch (Exception e) {
            throw new RuntimeException("Failed to count tokens", e);
        }
    }
}
