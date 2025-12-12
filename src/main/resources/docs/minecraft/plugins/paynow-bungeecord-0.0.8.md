# paynow-bungeecord-0.0.8 API Reference

## Package: gg.paynow.paynowbungee

### Class: gg.paynow.paynowbungee.PayNowBungee
Type: Class
Extends: net.md_5.bungee.api.plugin.Plugin

Methods:
- void triggerConfigUpdate()
- void onEnable()
- void onDisable()
- PayNowLib getPayNowLib()

### Class: gg.paynow.paynowbungee.PayNowBungeeCommand
Type: Class
Extends: net.md_5.bungee.api.plugin.Command

Methods:
- void execute(CommandSender, String[])

## Package: gg.paynow.paynowlib

### Class: gg.paynow.paynowlib.CommandHistory
Type: Class

Methods:
- void add(String)
- boolean contains(String)
- void clear()

### Class: gg.paynow.paynowlib.HttpDeleteWithBody
Type: Class
Extends: org.apache.http.client.methods.HttpEntityEnclosingRequestBase

Methods:
- String getMethod()

### Class: gg.paynow.paynowlib.PayNowConfig
Type: Class

Methods:
- boolean isDebug()
- String getApiToken()
- void setLogCommandExecutions(boolean)
- boolean doesLogCommandExecutions()
- int getApiCheckInterval()
- void setApiCheckInterval(int)
- void setDebug(boolean)
- void setApiToken(String)

### Class: gg.paynow.paynowlib.PayNowLib
Type: Class

Methods:
- void savePayNowConfig(File)
- void updateConfig()
- V setLogCallback(BiConsumer<String, Level>)
- void loadPayNowConfig(File)
- V onUpdateConfig(Consumer<PayNowConfig>)
- V fetchPendingCommands(List<String>, List<UUID>)
- PayNowConfig getConfig()
- int handleResponse(String)
- void setConfig(PayNowConfig)

### Class: gg.paynow.paynowlib.PayNowUtils
Type: Class

Methods:
- **static** boolean isSuccess(int)

### Class: gg.paynow.paynowlib.QueuedCommand
Type: Class

Methods:
- String getCommand()
- String getCustomerName()
- String getAttemptId()
- boolean isOnlineOnly()
- String getQueuedAt()
- void setAttemptId(String)

## Package: gg.paynow.paynowlib.dto

### Class: gg.paynow.paynowlib.dto.CommandAttempt
Type: Class

No public methods found

### Class: gg.paynow.paynowlib.dto.LinkRequest
Type: Class

No public methods found

### Class: gg.paynow.paynowlib.dto.PlayerList
Type: Class

No public methods found

## Package: org.apache.commons.codec

### Class: org.apache.commons.codec.BinaryDecoder
Type: Interface
Implements: org.apache.commons.codec.Decoder

Methods:
- byte[] decode(byte[]) throws DecoderException

### Class: org.apache.commons.codec.BinaryEncoder
Type: Interface
Implements: org.apache.commons.codec.Encoder

Methods:
- byte[] encode(byte[]) throws EncoderException

### Class: org.apache.commons.codec.Decoder
Type: Interface

Methods:
- Object decode(Object) throws DecoderException

### Class: org.apache.commons.codec.Encoder
Type: Interface

Methods:
- Object encode(Object) throws EncoderException

### Class: org.apache.commons.codec.StringDecoder
Type: Interface
Implements: org.apache.commons.codec.Decoder

Methods:
- String decode(String) throws DecoderException

### Class: org.apache.commons.codec.StringEncoder
Type: Interface
Implements: org.apache.commons.codec.Encoder

Methods:
- String encode(String) throws EncoderException

### Class: org.apache.commons.codec.CharEncoding
Type: Class

No public methods found

### Class: org.apache.commons.codec.Charsets
Type: Class

Methods:
- **static** Charset toCharset(Charset)
- **static** Charset toCharset(String)

### Class: org.apache.commons.codec.DecoderException
Type: Class
Extends: java.lang.Exception

No public methods found

### Class: org.apache.commons.codec.EncoderException
Type: Class
Extends: java.lang.Exception

No public methods found

### Class: org.apache.commons.codec.StringEncoderComparator
Type: Class
Implements: java.util.Comparator

Methods:
- int compare(Object, Object)

## Package: org.apache.commons.codec.binary

### Class: org.apache.commons.codec.binary.Base32
Type: Class
Extends: org.apache.commons.codec.binary.BaseNCodec

Methods:
- boolean isInAlphabet(byte)

### Class: org.apache.commons.codec.binary.Base32InputStream
Type: Class
Extends: org.apache.commons.codec.binary.BaseNCodecInputStream

No public methods found

### Class: org.apache.commons.codec.binary.Base32OutputStream
Type: Class
Extends: org.apache.commons.codec.binary.BaseNCodecOutputStream

No public methods found

### Class: org.apache.commons.codec.binary.Base64
Type: Class
Extends: org.apache.commons.codec.binary.BaseNCodec

Methods:
- **static** byte[] encodeBase64(byte[])
- **static** byte[] encodeBase64(byte[], boolean)
- **static** byte[] encodeBase64(byte[], boolean, boolean)
- **static** byte[] encodeBase64(byte[], boolean, boolean, int)
- **static** byte[] encodeBase64Chunked(byte[])
- **static** byte[] decodeBase64(String)
- **static** byte[] decodeBase64(byte[])
- **static** byte[] encodeInteger(BigInteger)
- **static** boolean isArrayByteBase64(byte[])
- boolean isUrlSafe()
- **static** byte[] encodeBase64URLSafe(byte[])
- **static** String encodeBase64URLSafeString(byte[])
- **static** String encodeBase64String(byte[])
- **static** boolean isBase64(byte)
- **static** boolean isBase64(String)
- **static** boolean isBase64(byte[])
- **static** BigInteger decodeInteger(byte[])

### Class: org.apache.commons.codec.binary.Base64InputStream
Type: Class
Extends: org.apache.commons.codec.binary.BaseNCodecInputStream

No public methods found

### Class: org.apache.commons.codec.binary.Base64OutputStream
Type: Class
Extends: org.apache.commons.codec.binary.BaseNCodecOutputStream

No public methods found

### Class: org.apache.commons.codec.binary.BaseNCodec
Type: Abstract Class
Implements: org.apache.commons.codec.BinaryEncoder, org.apache.commons.codec.BinaryDecoder

Methods:
- Object encode(Object) throws EncoderException
- byte[] encode(byte[])
- byte[] encode(byte[], int, int)
- String encodeAsString(byte[])
- boolean isInAlphabet(byte[], boolean)
- boolean isInAlphabet(String)
- String encodeToString(byte[])
- Object decode(Object) throws DecoderException
- byte[] decode(String)
- byte[] decode(byte[])
- long getEncodedLength(byte[])

### Class: org.apache.commons.codec.binary.BaseNCodecInputStream
Type: Class
Extends: java.io.FilterInputStream

Methods:
- int read() throws IOException
- int read(byte[], int, int) throws IOException
- boolean markSupported()
- int available() throws IOException
- void reset() throws IOException
- long skip(long) throws IOException
- void mark(int)

### Class: org.apache.commons.codec.binary.BaseNCodecOutputStream
Type: Class
Extends: java.io.FilterOutputStream

Methods:
- void flush() throws IOException
- void eof() throws IOException
- void close() throws IOException
- void write(int) throws IOException
- void write(byte[], int, int) throws IOException

### Class: org.apache.commons.codec.binary.BinaryCodec
Type: Class
Implements: org.apache.commons.codec.BinaryDecoder, org.apache.commons.codec.BinaryEncoder

Methods:
- **static** byte[] fromAscii(char[])
- **static** byte[] fromAscii(byte[])
- byte[] encode(byte[])
- Object encode(Object) throws EncoderException
- **static** byte[] toAsciiBytes(byte[])
- byte[] toByteArray(String)
- **static** String toAsciiString(byte[])
- **static** char[] toAsciiChars(byte[])
- Object decode(Object) throws DecoderException
- byte[] decode(byte[])

### Class: org.apache.commons.codec.binary.CharSequenceUtils
Type: Class

No public methods found

### Class: org.apache.commons.codec.binary.Hex
Type: Class
Implements: org.apache.commons.codec.BinaryEncoder, org.apache.commons.codec.BinaryDecoder

Methods:
- byte[] encode(byte[])
- byte[] encode(ByteBuffer)
- Object encode(Object) throws EncoderException
- **static** char[] encodeHex(byte[])
- **static** char[] encodeHex(ByteBuffer)
- **static** char[] encodeHex(byte[], boolean)
- **static** char[] encodeHex(ByteBuffer, boolean)
- **static** byte[] decodeHex(String) throws DecoderException
- **static** byte[] decodeHex(char[]) throws DecoderException
- String toString()
- Charset getCharset()
- byte[] decode(byte[]) throws DecoderException
- byte[] decode(ByteBuffer) throws DecoderException
- Object decode(Object) throws DecoderException
- **static** String encodeHexString(byte[])
- **static** String encodeHexString(byte[], boolean)
- **static** String encodeHexString(ByteBuffer)
- **static** String encodeHexString(ByteBuffer, boolean)
- String getCharsetName()

### Class: org.apache.commons.codec.binary.StringUtils
Type: Class

Methods:
- **static** byte[] getBytesUtf16Le(String)
- **static** byte[] getBytesUtf16(String)
- **static** String newStringUtf8(byte[])
- **static** String newStringUsAscii(byte[])
- **static** byte[] getBytesUnchecked(String, String)
- **static** byte[] getBytesIso8859_1(String)
- **static** byte[] getBytesUtf16Be(String)
- **static** String newStringIso8859_1(byte[])
- **static** byte[] getBytesUsAscii(String)
- **static** String newString(byte[], String)
- **static** byte[] getBytesUtf8(String)
- **static** String newStringUtf16(byte[])
- **static** String newStringUtf16Le(byte[])
- **static** ByteBuffer getByteBufferUtf8(String)
- **static** boolean equals(CharSequence, CharSequence)
- **static** String newStringUtf16Be(byte[])

## Package: org.apache.commons.codec.cli

### Class: org.apache.commons.codec.cli.Digest
Type: Class

Methods:
- String toString()
- **static** void main(String[]) throws IOException

## Package: org.apache.commons.codec.digest

### Class: org.apache.commons.codec.digest.Crypt
Type: Class

Methods:
- **static** String crypt(byte[])
- **static** String crypt(byte[], String)
- **static** String crypt(String)
- **static** String crypt(String, String)

### Class: org.apache.commons.codec.digest.DigestUtils
Type: Class

Methods:
- **static** boolean isAvailable(String)
- **static** byte[] sha256(byte[])
- **static** byte[] sha256(InputStream) throws IOException
- **static** byte[] sha256(String)
- **static** String sha1Hex(byte[])
- **static** String sha1Hex(InputStream) throws IOException
- **static** String sha1Hex(String)
- **static** byte[] sha512(byte[])
- **static** byte[] sha512(InputStream) throws IOException
- **static** byte[] sha512(String)
- **static** MessageDigest getDigest(String)
- **static** MessageDigest getDigest(String, MessageDigest)
- **static** MessageDigest getSha256Digest()
- **static** MessageDigest updateDigest(MessageDigest, byte[])
- **static** MessageDigest updateDigest(MessageDigest, ByteBuffer)
- **static** MessageDigest updateDigest(MessageDigest, File) throws IOException
- **static** MessageDigest updateDigest(MessageDigest, InputStream) throws IOException
- **static** MessageDigest updateDigest(MessageDigest, String)
- **static** MessageDigest getMd2Digest()
- **static** byte[] digest(MessageDigest, byte[])
- **static** byte[] digest(MessageDigest, ByteBuffer)
- **static** byte[] digest(MessageDigest, File) throws IOException
- **static** byte[] digest(MessageDigest, InputStream) throws IOException
- byte[] digest(byte[])
- byte[] digest(String)
- byte[] digest(ByteBuffer)
- byte[] digest(File) throws IOException
- byte[] digest(InputStream) throws IOException
- String digestAsHex(byte[])
- String digestAsHex(String)
- String digestAsHex(ByteBuffer)
- String digestAsHex(File) throws IOException
- String digestAsHex(InputStream) throws IOException
- **static** MessageDigest getMd5Digest()
- **static** byte[] sha384(byte[])
- **static** byte[] sha384(InputStream) throws IOException
- **static** byte[] sha384(String)
- MessageDigest getMessageDigest()
- **static** String md5Hex(byte[])
- **static** String md5Hex(InputStream) throws IOException
- **static** String md5Hex(String)
- **static** String shaHex(byte[])
- **static** String shaHex(InputStream) throws IOException
- **static** String shaHex(String)
- **static** byte[] sha(byte[])
- **static** byte[] sha(InputStream) throws IOException
- **static** byte[] sha(String)
- **static** MessageDigest getSha1Digest()
- **static** byte[] sha1(byte[])
- **static** byte[] sha1(InputStream) throws IOException
- **static** byte[] sha1(String)
- **static** String sha384Hex(byte[])
- **static** String sha384Hex(InputStream) throws IOException
- **static** String sha384Hex(String)
- **static** MessageDigest getSha384Digest()
- **static** String md2Hex(byte[])
- **static** String md2Hex(InputStream) throws IOException
- **static** String md2Hex(String)
- **static** MessageDigest getShaDigest()
- **static** byte[] md2(byte[])
- **static** byte[] md2(InputStream) throws IOException
- **static** byte[] md2(String)
- **static** String sha512Hex(byte[])
- **static** String sha512Hex(InputStream) throws IOException
- **static** String sha512Hex(String)
- **static** MessageDigest getSha512Digest()
- **static** String sha256Hex(byte[])
- **static** String sha256Hex(InputStream) throws IOException
- **static** String sha256Hex(String)
- **static** byte[] md5(byte[])
- **static** byte[] md5(InputStream) throws IOException
- **static** byte[] md5(String)

### Class: org.apache.commons.codec.digest.HmacAlgorithms
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- HMAC_MD5
- HMAC_SHA_1
- HMAC_SHA_224
- HMAC_SHA_256
- HMAC_SHA_384
- HMAC_SHA_512

Methods:
- String getName()
- **static** HmacAlgorithms valueOf(String)
- **static** HmacAlgorithms[] values()
- String toString()

### Class: org.apache.commons.codec.digest.HmacUtils
Type: Class

Methods:
- **static** boolean isAvailable(String)
- **static** boolean isAvailable(HmacAlgorithms)
- **static** String hmacSha512Hex(byte[], byte[])
- **static** String hmacSha512Hex(byte[], InputStream) throws IOException
- **static** String hmacSha512Hex(String, String)
- **static** Mac updateHmac(Mac, byte[])
- **static** Mac updateHmac(Mac, InputStream) throws IOException
- **static** Mac updateHmac(Mac, String)
- **static** String hmacSha256Hex(byte[], byte[])
- **static** String hmacSha256Hex(byte[], InputStream) throws IOException
- **static** String hmacSha256Hex(String, String)
- **static** byte[] hmacSha512(byte[], byte[])
- **static** byte[] hmacSha512(byte[], InputStream) throws IOException
- **static** byte[] hmacSha512(String, String)
- **static** byte[] hmacSha1(byte[], byte[])
- **static** byte[] hmacSha1(byte[], InputStream) throws IOException
- **static** byte[] hmacSha1(String, String)
- **static** Mac getInitializedMac(HmacAlgorithms, byte[])
- **static** Mac getInitializedMac(String, byte[])
- **static** byte[] hmacSha256(byte[], byte[])
- **static** byte[] hmacSha256(byte[], InputStream) throws IOException
- **static** byte[] hmacSha256(String, String)
- **static** String hmacSha1Hex(byte[], byte[])
- **static** String hmacSha1Hex(byte[], InputStream) throws IOException
- **static** String hmacSha1Hex(String, String)
- **static** byte[] hmacSha384(byte[], byte[])
- **static** byte[] hmacSha384(byte[], InputStream) throws IOException
- **static** byte[] hmacSha384(String, String)
- byte[] hmac(byte[])
- byte[] hmac(String)
- byte[] hmac(ByteBuffer)
- byte[] hmac(InputStream) throws IOException
- byte[] hmac(File) throws IOException
- **static** String hmacMd5Hex(byte[], byte[])
- **static** String hmacMd5Hex(byte[], InputStream) throws IOException
- **static** String hmacMd5Hex(String, String)
- String hmacHex(byte[])
- String hmacHex(String)
- String hmacHex(ByteBuffer)
- String hmacHex(InputStream) throws IOException
- String hmacHex(File) throws IOException
- **static** String hmacSha384Hex(byte[], byte[])
- **static** String hmacSha384Hex(byte[], InputStream) throws IOException
- **static** String hmacSha384Hex(String, String)
- **static** Mac getHmacSha256(byte[])
- **static** byte[] hmacMd5(byte[], byte[])
- **static** byte[] hmacMd5(byte[], InputStream) throws IOException
- **static** byte[] hmacMd5(String, String)
- **static** Mac getHmacSha512(byte[])
- **static** Mac getHmacMd5(byte[])
- **static** Mac getHmacSha384(byte[])
- **static** Mac getHmacSha1(byte[])

### Class: org.apache.commons.codec.digest.Md5Crypt
Type: Class

Methods:
- **static** String md5Crypt(byte[])
- **static** String md5Crypt(byte[], String)
- **static** String md5Crypt(byte[], String, String)
- **static** String apr1Crypt(byte[])
- **static** String apr1Crypt(byte[], String)
- **static** String apr1Crypt(String)
- **static** String apr1Crypt(String, String)

### Class: org.apache.commons.codec.digest.MessageDigestAlgorithms
Type: Class

Methods:
- **static** String[] values()

### Class: org.apache.commons.codec.digest.PureJavaCrc32
Type: Class
Implements: java.util.zip.Checksum

Methods:
- long getValue()
- void update(byte[], int, int)
- void update(int)
- void reset()

### Class: org.apache.commons.codec.digest.PureJavaCrc32C
Type: Class
Implements: java.util.zip.Checksum

Methods:
- long getValue()
- void update(byte[], int, int)
- void update(int)
- void reset()

### Class: org.apache.commons.codec.digest.Sha2Crypt
Type: Class

Methods:
- **static** String sha256Crypt(byte[])
- **static** String sha256Crypt(byte[], String)
- **static** String sha512Crypt(byte[])
- **static** String sha512Crypt(byte[], String)

### Class: org.apache.commons.codec.digest.UnixCrypt
Type: Class

Methods:
- **static** String crypt(byte[])
- **static** String crypt(byte[], String)
- **static** String crypt(String)
- **static** String crypt(String, String)

### Class: org.apache.commons.codec.digest.XXHash32
Type: Class
Implements: java.util.zip.Checksum

Methods:
- long getValue()
- void update(int)
- void update(byte[], int, int)
- void reset()

## Package: org.apache.commons.codec.language

### Class: org.apache.commons.codec.language.AbstractCaverphone
Type: Abstract Class
Implements: org.apache.commons.codec.StringEncoder

Methods:
- Object encode(Object) throws EncoderException
- boolean isEncodeEqual(String, String) throws EncoderException

### Class: org.apache.commons.codec.language.Caverphone
Type: Class
Implements: org.apache.commons.codec.StringEncoder

Methods:
- Object encode(Object) throws EncoderException
- String encode(String)
- String caverphone(String)
- boolean isCaverphoneEqual(String, String)

### Class: org.apache.commons.codec.language.Caverphone1
Type: Class
Extends: org.apache.commons.codec.language.AbstractCaverphone

Methods:
- String encode(String)

### Class: org.apache.commons.codec.language.Caverphone2
Type: Class
Extends: org.apache.commons.codec.language.AbstractCaverphone

Methods:
- String encode(String)

### Class: org.apache.commons.codec.language.ColognePhonetic
Type: Class
Implements: org.apache.commons.codec.StringEncoder

Methods:
- Object encode(Object) throws EncoderException
- String encode(String)
- boolean isEncodeEqual(String, String)
- String colognePhonetic(String)

### Class: org.apache.commons.codec.language.DaitchMokotoffSoundex
Type: Class
Implements: org.apache.commons.codec.StringEncoder

Methods:
- Object encode(Object) throws EncoderException
- String encode(String)
- String soundex(String)

### Class: org.apache.commons.codec.language.DoubleMetaphone
Type: Class
Implements: org.apache.commons.codec.StringEncoder

Methods:
- Object encode(Object) throws EncoderException
- String encode(String)
- String doubleMetaphone(String)
- String doubleMetaphone(String, boolean)
- boolean isDoubleMetaphoneEqual(String, String)
- boolean isDoubleMetaphoneEqual(String, String, boolean)
- void setMaxCodeLen(int)
- int getMaxCodeLen()

### Class: org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult
Type: Class

Methods:
- void appendPrimary(char)
- void appendPrimary(String)
- String getAlternate()
- String getPrimary()
- void appendAlternate(char)
- void appendAlternate(String)
- void append(char)
- void append(char, char)
- void append(String)
- void append(String, String)
- boolean isComplete()

### Class: org.apache.commons.codec.language.MatchRatingApproachEncoder
Type: Class
Implements: org.apache.commons.codec.StringEncoder

Methods:
- Object encode(Object) throws EncoderException
- String encode(String)
- boolean isEncodeEquals(String, String)

### Class: org.apache.commons.codec.language.Metaphone
Type: Class
Implements: org.apache.commons.codec.StringEncoder

Methods:
- Object encode(Object) throws EncoderException
- String encode(String)
- void setMaxCodeLen(int)
- int getMaxCodeLen()
- String metaphone(String)
- boolean isMetaphoneEqual(String, String)

### Class: org.apache.commons.codec.language.Nysiis
Type: Class
Implements: org.apache.commons.codec.StringEncoder

Methods:
- Object encode(Object) throws EncoderException
- String encode(String)
- boolean isStrict()
- String nysiis(String)

### Class: org.apache.commons.codec.language.RefinedSoundex
Type: Class
Implements: org.apache.commons.codec.StringEncoder

Methods:
- Object encode(Object) throws EncoderException
- String encode(String)
- String soundex(String)
- int difference(String, String) throws EncoderException

### Class: org.apache.commons.codec.language.Soundex
Type: Class
Implements: org.apache.commons.codec.StringEncoder

Methods:
- Object encode(Object) throws EncoderException
- String encode(String)
- int getMaxLength()
- String soundex(String)
- int difference(String, String) throws EncoderException
- void setMaxLength(int)

## Package: org.apache.commons.codec.language.bm

### Class: org.apache.commons.codec.language.bm.Rule$PhonemeExpr
Type: Interface

Methods:
- Iterable<Rule$Phoneme> getPhonemes()

### Class: org.apache.commons.codec.language.bm.Rule$RPattern
Type: Interface

Methods:
- boolean isMatch(CharSequence)

### Class: org.apache.commons.codec.language.bm.BeiderMorseEncoder
Type: Class
Implements: org.apache.commons.codec.StringEncoder

Methods:
- void setNameType(NameType)
- Object encode(Object) throws EncoderException
- String encode(String) throws EncoderException
- boolean isConcat()
- NameType getNameType()
- RuleType getRuleType()
- void setRuleType(RuleType)
- void setConcat(boolean)
- void setMaxPhonemes(int)

### Class: org.apache.commons.codec.language.bm.Lang
Type: Class

Methods:
- **static** Lang instance(NameType)
- Languages$LanguageSet guessLanguages(String)
- String guessLanguage(String)
- **static** Lang loadFromResource(String, Languages)

### Class: org.apache.commons.codec.language.bm.Languages
Type: Class

Methods:
- Set<String> getLanguages()
- **static** Languages getInstance(NameType)
- **static** Languages getInstance(String)

### Class: org.apache.commons.codec.language.bm.Languages$LanguageSet
Type: Abstract Class

Methods:
- boolean contains(String)
- boolean isEmpty()
- boolean isSingleton()
- Languages$LanguageSet restrictTo(Languages$LanguageSet)
- **static** Languages$LanguageSet from(Set<String>)
- String getAny()

### Class: org.apache.commons.codec.language.bm.Languages$SomeLanguages
Type: Class
Extends: org.apache.commons.codec.language.bm.Languages$LanguageSet

Methods:
- boolean contains(String)
- Languages$LanguageSet merge(Languages$LanguageSet)
- boolean isEmpty()
- Set<String> getLanguages()
- boolean isSingleton()
- String toString()
- Languages$LanguageSet restrictTo(Languages$LanguageSet)
- String getAny()

### Class: org.apache.commons.codec.language.bm.NameType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- ASHKENAZI
- GENERIC
- SEPHARDIC

Methods:
- String getName()
- **static** NameType valueOf(String)
- **static** NameType[] values()

### Class: org.apache.commons.codec.language.bm.PhoneticEngine
Type: Class

Methods:
- int getMaxPhonemes()
- String encode(String)
- String encode(String, Languages$LanguageSet)
- boolean isConcat()
- NameType getNameType()
- Lang getLang()
- RuleType getRuleType()

### Class: org.apache.commons.codec.language.bm.Rule
Type: Class

Methods:
- Rule$RPattern getLContext()
- Rule$RPattern getRContext()
- boolean patternAndContextMatches(CharSequence, int)
- **static** List<Rule> getInstance(NameType, RuleType, Languages$LanguageSet)
- **static** List<Rule> getInstance(NameType, RuleType, String)
- String getPattern()
- **static** Map<String, List<Rule>> getInstanceMap(NameType, RuleType, Languages$LanguageSet)
- **static** Map<String, List<Rule>> getInstanceMap(NameType, RuleType, String)
- Rule$PhonemeExpr getPhoneme()

### Class: org.apache.commons.codec.language.bm.Rule$Phoneme
Type: Class
Implements: org.apache.commons.codec.language.bm.Rule$PhonemeExpr

Methods:
- Rule$Phoneme mergeWithLanguage(Languages$LanguageSet)
- Languages$LanguageSet getLanguages()
- CharSequence getPhonemeText()
- String toString()
- Rule$Phoneme join(Rule$Phoneme)
- Iterable<Rule$Phoneme> getPhonemes()
- Rule$Phoneme append(CharSequence)

### Class: org.apache.commons.codec.language.bm.Rule$PhonemeList
Type: Class
Implements: org.apache.commons.codec.language.bm.Rule$PhonemeExpr

Methods:
- List<Rule$Phoneme> getPhonemes()
- Iterable getPhonemes()

### Class: org.apache.commons.codec.language.bm.RuleType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- APPROX
- EXACT
- RULES

Methods:
- String getName()
- **static** RuleType valueOf(String)
- **static** RuleType[] values()

## Package: org.apache.commons.codec.net

### Class: org.apache.commons.codec.net.BCodec
Type: Class
Extends: org.apache.commons.codec.net.RFC1522Codec
Implements: org.apache.commons.codec.StringEncoder, org.apache.commons.codec.StringDecoder

Methods:
- String encode(String, Charset) throws EncoderException
- String encode(String, String) throws EncoderException
- String encode(String) throws EncoderException
- Object encode(Object) throws EncoderException
- String getDefaultCharset()
- Charset getCharset()
- String decode(String) throws DecoderException
- Object decode(Object) throws DecoderException

### Class: org.apache.commons.codec.net.QCodec
Type: Class
Extends: org.apache.commons.codec.net.RFC1522Codec
Implements: org.apache.commons.codec.StringEncoder, org.apache.commons.codec.StringDecoder

Methods:
- String encode(String, Charset) throws EncoderException
- String encode(String, String) throws EncoderException
- String encode(String) throws EncoderException
- Object encode(Object) throws EncoderException
- void setEncodeBlanks(boolean)
- boolean isEncodeBlanks()
- String getDefaultCharset()
- Charset getCharset()
- String decode(String) throws DecoderException
- Object decode(Object) throws DecoderException

### Class: org.apache.commons.codec.net.QuotedPrintableCodec
Type: Class
Implements: org.apache.commons.codec.BinaryEncoder, org.apache.commons.codec.BinaryDecoder, org.apache.commons.codec.StringEncoder, org.apache.commons.codec.StringDecoder

Methods:
- byte[] encode(byte[])
- String encode(String) throws EncoderException
- Object encode(Object) throws EncoderException
- String encode(String, Charset)
- String encode(String, String) throws UnsupportedEncodingException
- **static** byte[] decodeQuotedPrintable(byte[]) throws DecoderException
- **static** byte[] encodeQuotedPrintable(BitSet, byte[])
- **static** byte[] encodeQuotedPrintable(BitSet, byte[], boolean)
- String getDefaultCharset()
- Charset getCharset()
- byte[] decode(byte[]) throws DecoderException
- String decode(String, Charset) throws DecoderException
- String decode(String, String) throws DecoderException, UnsupportedEncodingException
- String decode(String) throws DecoderException
- Object decode(Object) throws DecoderException

### Class: org.apache.commons.codec.net.URLCodec
Type: Class
Implements: org.apache.commons.codec.BinaryEncoder, org.apache.commons.codec.BinaryDecoder, org.apache.commons.codec.StringEncoder, org.apache.commons.codec.StringDecoder

Methods:
- String getEncoding()
- byte[] encode(byte[])
- String encode(String, String) throws UnsupportedEncodingException
- String encode(String) throws EncoderException
- Object encode(Object) throws EncoderException
- **static** byte[] decodeUrl(byte[]) throws DecoderException
- String getDefaultCharset()
- byte[] decode(byte[]) throws DecoderException
- String decode(String, String) throws DecoderException, UnsupportedEncodingException
- String decode(String) throws DecoderException
- Object decode(Object) throws DecoderException
- **static** byte[] encodeUrl(BitSet, byte[])

## Package: org.apache.commons.logging

### Class: org.apache.commons.logging.Log
Type: Interface

Methods:
- void warn(Object)
- void warn(Object, Throwable)
- void trace(Object)
- void trace(Object, Throwable)
- void debug(Object)
- void debug(Object, Throwable)
- boolean isInfoEnabled()
- boolean isErrorEnabled()
- boolean isTraceEnabled()
- boolean isWarnEnabled()
- boolean isDebugEnabled()
- void error(Object)
- void error(Object, Throwable)
- boolean isFatalEnabled()
- void info(Object)
- void info(Object, Throwable)
- void fatal(Object)
- void fatal(Object, Throwable)

### Class: org.apache.commons.logging.LogConfigurationException
Type: Class
Extends: java.lang.RuntimeException

Methods:
- Throwable getCause()

### Class: org.apache.commons.logging.LogFactory
Type: Abstract Class

Methods:
- void setAttribute(String, Object)
- Object getAttribute(String)
- String[] getAttributeNames()
- **static** Log getLog(Class) throws LogConfigurationException
- **static** Log getLog(String) throws LogConfigurationException
- void release()
- **static** void release(ClassLoader)
- **static** void releaseAll()
- Log getInstance(Class) throws LogConfigurationException
- Log getInstance(String) throws LogConfigurationException
- **static** LogFactory getFactory() throws LogConfigurationException
- void removeAttribute(String)
- **static** String objectId(Object)

### Class: org.apache.commons.logging.LogSource
Type: Class

Methods:
- **static** String[] getLogNames()
- **static** void setLogImplementation(String) throws LinkageError, NoSuchMethodException, SecurityException, ClassNotFoundException
- **static** void setLogImplementation(Class) throws LinkageError, ExceptionInInitializerError, NoSuchMethodException, SecurityException
- **static** Log makeNewLogInstance(String)
- **static** Log getInstance(String)
- **static** Log getInstance(Class)

## Package: org.apache.commons.logging.impl

### Class: org.apache.commons.logging.impl.AvalonLogger
Type: Class
Implements: org.apache.commons.logging.Log

Methods:
- void debug(Object, Throwable)
- void debug(Object)
- Logger getLogger()
- boolean isWarnEnabled()
- void error(Object, Throwable)
- void error(Object)
- **static** void setDefaultLogger(Logger)
- boolean isFatalEnabled()
- void fatal(Object, Throwable)
- void fatal(Object)
- void warn(Object, Throwable)
- void warn(Object)
- void trace(Object, Throwable)
- void trace(Object)
- boolean isInfoEnabled()
- boolean isErrorEnabled()
- boolean isTraceEnabled()
- boolean isDebugEnabled()
- void info(Object, Throwable)
- void info(Object)

### Class: org.apache.commons.logging.impl.Jdk13LumberjackLogger
Type: Class
Implements: org.apache.commons.logging.Log, java.io.Serializable

Methods:
- void debug(Object)
- void debug(Object, Throwable)
- Logger getLogger()
- boolean isWarnEnabled()
- void error(Object)
- void error(Object, Throwable)
- boolean isFatalEnabled()
- void fatal(Object)
- void fatal(Object, Throwable)
- void warn(Object)
- void warn(Object, Throwable)
- void trace(Object)
- void trace(Object, Throwable)
- boolean isInfoEnabled()
- boolean isErrorEnabled()
- boolean isTraceEnabled()
- boolean isDebugEnabled()
- void info(Object)
- void info(Object, Throwable)

### Class: org.apache.commons.logging.impl.Jdk14Logger
Type: Class
Implements: org.apache.commons.logging.Log, java.io.Serializable

Methods:
- void debug(Object)
- void debug(Object, Throwable)
- Logger getLogger()
- boolean isWarnEnabled()
- void error(Object)
- void error(Object, Throwable)
- boolean isFatalEnabled()
- void fatal(Object)
- void fatal(Object, Throwable)
- void warn(Object)
- void warn(Object, Throwable)
- void trace(Object)
- void trace(Object, Throwable)
- boolean isInfoEnabled()
- boolean isErrorEnabled()
- boolean isTraceEnabled()
- boolean isDebugEnabled()
- void info(Object)
- void info(Object, Throwable)

### Class: org.apache.commons.logging.impl.Log4JLogger
Type: Class
Implements: org.apache.commons.logging.Log, java.io.Serializable

Methods:
- void warn(Object)
- void warn(Object, Throwable)
- void trace(Object)
- void trace(Object, Throwable)
- void debug(Object)
- void debug(Object, Throwable)
- boolean isInfoEnabled()
- boolean isErrorEnabled()
- boolean isTraceEnabled()
- Logger getLogger()
- boolean isWarnEnabled()
- boolean isDebugEnabled()
- void error(Object)
- void error(Object, Throwable)
- boolean isFatalEnabled()
- void fatal(Object)
- void fatal(Object, Throwable)
- void info(Object)
- void info(Object, Throwable)

### Class: org.apache.commons.logging.impl.LogFactoryImpl
Type: Class
Extends: org.apache.commons.logging.LogFactory

Methods:
- void setAttribute(String, Object)
- Object getAttribute(String)
- String[] getAttributeNames()
- void release()
- Log getInstance(Class) throws LogConfigurationException
- Log getInstance(String) throws LogConfigurationException
- void removeAttribute(String)

### Class: org.apache.commons.logging.impl.LogKitLogger
Type: Class
Implements: org.apache.commons.logging.Log, java.io.Serializable

Methods:
- void warn(Object)
- void warn(Object, Throwable)
- void trace(Object)
- void trace(Object, Throwable)
- void debug(Object)
- void debug(Object, Throwable)
- boolean isInfoEnabled()
- boolean isErrorEnabled()
- boolean isTraceEnabled()
- Logger getLogger()
- boolean isWarnEnabled()
- boolean isDebugEnabled()
- void error(Object)
- void error(Object, Throwable)
- boolean isFatalEnabled()
- void fatal(Object)
- void fatal(Object, Throwable)
- void info(Object)
- void info(Object, Throwable)

### Class: org.apache.commons.logging.impl.NoOpLog
Type: Class
Implements: org.apache.commons.logging.Log, java.io.Serializable

Methods:
- void warn(Object)
- void warn(Object, Throwable)
- void trace(Object)
- void trace(Object, Throwable)
- void debug(Object)
- void debug(Object, Throwable)
- boolean isInfoEnabled()
- boolean isErrorEnabled()
- boolean isTraceEnabled()
- boolean isWarnEnabled()
- boolean isDebugEnabled()
- void error(Object)
- void error(Object, Throwable)
- boolean isFatalEnabled()
- void fatal(Object)
- void fatal(Object, Throwable)
- void info(Object)
- void info(Object, Throwable)

### Class: org.apache.commons.logging.impl.ServletContextCleaner
Type: Class
Implements: javax.servlet.ServletContextListener

Methods:
- void contextInitialized(ServletContextEvent)
- void contextDestroyed(ServletContextEvent)

### Class: org.apache.commons.logging.impl.SimpleLog
Type: Class
Implements: org.apache.commons.logging.Log, java.io.Serializable

Methods:
- void debug(Object)
- void debug(Object, Throwable)
- boolean isWarnEnabled()
- void error(Object)
- void error(Object, Throwable)
- boolean isFatalEnabled()
- void fatal(Object)
- void fatal(Object, Throwable)
- void setLevel(int)
- void warn(Object)
- void warn(Object, Throwable)
- int getLevel()
- void trace(Object)
- void trace(Object, Throwable)
- boolean isInfoEnabled()
- boolean isErrorEnabled()
- boolean isTraceEnabled()
- boolean isDebugEnabled()
- void info(Object)
- void info(Object, Throwable)

### Class: org.apache.commons.logging.impl.WeakHashtable
Type: Class
Extends: java.util.Hashtable

Methods:
- int size()
- Set entrySet()
- Enumeration keys()
- boolean containsKey(Object)
- Collection values()
- void putAll(Map)
- Object get(Object)
- Enumeration elements()
- boolean isEmpty()
- String toString()
- Set keySet()
- Object remove(Object)
- Object put(Object, Object)

## Package: org.apache.http

### Class: org.apache.http.ConnectionReuseStrategy
Type: Interface

Methods:
- boolean keepAlive(HttpResponse, HttpContext)

### Class: org.apache.http.ExceptionLogger
Type: Interface

Methods:
- void log(Exception)

### Class: org.apache.http.FormattedHeader
Type: Interface
Implements: org.apache.http.Header

Methods:
- CharArrayBuffer getBuffer()
- int getValuePos()

### Class: org.apache.http.Header
Type: Interface
Implements: org.apache.http.NameValuePair

Methods:
- HeaderElement[] getElements() throws ParseException

### Class: org.apache.http.HeaderElement
Type: Interface

Methods:
- String getValue()
- String getName()
- int getParameterCount()
- NameValuePair[] getParameters()
- NameValuePair getParameterByName(String)
- NameValuePair getParameter(int)

### Class: org.apache.http.HeaderElementIterator
Type: Interface
Implements: java.util.Iterator

Methods:
- boolean hasNext()
- HeaderElement nextElement()

### Class: org.apache.http.HeaderIterator
Type: Interface
Implements: java.util.Iterator

Methods:
- Header nextHeader()
- boolean hasNext()

### Class: org.apache.http.HttpClientConnection
Type: Interface
Implements: org.apache.http.HttpConnection

Methods:
- void flush() throws IOException
- boolean isResponseAvailable(int) throws IOException
- HttpResponse receiveResponseHeader() throws HttpException, IOException
- void sendRequestEntity(HttpEntityEnclosingRequest) throws HttpException, IOException
- void receiveResponseEntity(HttpResponse) throws HttpException, IOException
- void sendRequestHeader(HttpRequest) throws HttpException, IOException

### Class: org.apache.http.HttpConnection
Type: Interface
Implements: java.io.Closeable

Methods:
- void setSocketTimeout(int)
- boolean isOpen()
- HttpConnectionMetrics getMetrics()
- boolean isStale()
- int getSocketTimeout()
- void close() throws IOException
- void shutdown() throws IOException

### Class: org.apache.http.HttpConnectionFactory
Type: Interface

Methods:
- TT createConnection(Socket) throws IOException

### Class: org.apache.http.HttpConnectionMetrics
Type: Interface

Methods:
- long getRequestCount()
- void reset()
- long getReceivedBytesCount()
- long getSentBytesCount()
- Object getMetric(String)
- long getResponseCount()

### Class: org.apache.http.HttpEntity
Type: Interface

Methods:
- void writeTo(OutputStream) throws IOException
- Header getContentEncoding()
- boolean isRepeatable()
- boolean isChunked()
- boolean isStreaming()
- InputStream getContent() throws IOException, UnsupportedOperationException
- Header getContentType()
- long getContentLength()
- void consumeContent() throws IOException

### Class: org.apache.http.HttpEntityEnclosingRequest
Type: Interface
Implements: org.apache.http.HttpRequest

Methods:
- boolean expectContinue()
- HttpEntity getEntity()
- void setEntity(HttpEntity)

### Class: org.apache.http.HttpInetConnection
Type: Interface
Implements: org.apache.http.HttpConnection

Methods:
- int getLocalPort()
- InetAddress getRemoteAddress()
- int getRemotePort()
- InetAddress getLocalAddress()

### Class: org.apache.http.HttpMessage
Type: Interface

Methods:
- HeaderIterator headerIterator()
- HeaderIterator headerIterator(String)
- void setHeaders(Header[])
- void addHeader(Header)
- void addHeader(String, String)
- Header[] getHeaders(String)
- Header getFirstHeader(String)
- Header getLastHeader(String)
- Header[] getAllHeaders()
- void removeHeaders(String)
- void setHeader(Header)
- void setHeader(String, String)
- void removeHeader(Header)
- ProtocolVersion getProtocolVersion()
- boolean containsHeader(String)
- HttpParams getParams()
- void setParams(HttpParams)

### Class: org.apache.http.HttpRequest
Type: Interface
Implements: org.apache.http.HttpMessage

Methods:
- RequestLine getRequestLine()

### Class: org.apache.http.HttpRequestFactory
Type: Interface

Methods:
- HttpRequest newHttpRequest(RequestLine) throws MethodNotSupportedException
- HttpRequest newHttpRequest(String, String) throws MethodNotSupportedException

### Class: org.apache.http.HttpRequestInterceptor
Type: Interface

Methods:
- void process(HttpRequest, HttpContext) throws HttpException, IOException

### Class: org.apache.http.HttpResponse
Type: Interface
Implements: org.apache.http.HttpMessage

Methods:
- void setStatusLine(StatusLine)
- void setStatusLine(ProtocolVersion, int)
- void setStatusLine(ProtocolVersion, int, String)
- void setStatusCode(int) throws IllegalStateException
- StatusLine getStatusLine()
- void setReasonPhrase(String) throws IllegalStateException
- HttpEntity getEntity()
- Locale getLocale()
- void setLocale(Locale)
- void setEntity(HttpEntity)

### Class: org.apache.http.HttpResponseFactory
Type: Interface

Methods:
- HttpResponse newHttpResponse(ProtocolVersion, int, HttpContext)
- HttpResponse newHttpResponse(StatusLine, HttpContext)

### Class: org.apache.http.HttpResponseInterceptor
Type: Interface

Methods:
- void process(HttpResponse, HttpContext) throws HttpException, IOException

### Class: org.apache.http.HttpServerConnection
Type: Interface
Implements: org.apache.http.HttpConnection

Methods:
- void receiveRequestEntity(HttpEntityEnclosingRequest) throws HttpException, IOException
- void flush() throws IOException
- void sendResponseEntity(HttpResponse) throws HttpException, IOException
- void sendResponseHeader(HttpResponse) throws HttpException, IOException
- HttpRequest receiveRequestHeader() throws HttpException, IOException

### Class: org.apache.http.HttpStatus
Type: Interface

No public methods found

### Class: org.apache.http.NameValuePair
Type: Interface

Methods:
- String getValue()
- String getName()

### Class: org.apache.http.ReasonPhraseCatalog
Type: Interface

Methods:
- String getReason(int, Locale)

### Class: org.apache.http.RequestLine
Type: Interface

Methods:
- ProtocolVersion getProtocolVersion()
- String getMethod()
- String getUri()

### Class: org.apache.http.StatusLine
Type: Interface

Methods:
- ProtocolVersion getProtocolVersion()
- int getStatusCode()
- String getReasonPhrase()

### Class: org.apache.http.TokenIterator
Type: Interface
Implements: java.util.Iterator

Methods:
- String nextToken()
- boolean hasNext()

### Class: org.apache.http.ConnectionClosedException
Type: Class
Extends: java.io.IOException

No public methods found

### Class: org.apache.http.Consts
Type: Class

No public methods found

### Class: org.apache.http.ContentTooLongException
Type: Class
Extends: java.io.IOException

No public methods found

### Class: org.apache.http.HttpException
Type: Class
Extends: java.lang.Exception

No public methods found

### Class: org.apache.http.HttpHeaders
Type: Class

No public methods found

### Class: org.apache.http.HttpHost
Type: Class
Implements: java.lang.Cloneable, java.io.Serializable

Methods:
- int getPort()
- String toHostString()
- String getHostName()
- int hashCode()
- boolean equals(Object)
- String toURI()
- Object clone() throws CloneNotSupportedException
- **static** HttpHost create(String)
- String toString()
- InetAddress getAddress()
- String getSchemeName()

### Class: org.apache.http.HttpVersion
Type: Class
Extends: org.apache.http.ProtocolVersion

Methods:
- ProtocolVersion forVersion(int, int)

### Class: org.apache.http.MalformedChunkCodingException
Type: Class
Extends: java.io.IOException

No public methods found

### Class: org.apache.http.MessageConstraintException
Type: Class
Extends: java.nio.charset.CharacterCodingException

Methods:
- String getMessage()

### Class: org.apache.http.MethodNotSupportedException
Type: Class
Extends: org.apache.http.HttpException

No public methods found

### Class: org.apache.http.NoHttpResponseException
Type: Class
Extends: java.io.IOException

No public methods found

### Class: org.apache.http.ParseException
Type: Class
Extends: java.lang.RuntimeException

No public methods found

### Class: org.apache.http.ProtocolException
Type: Class
Extends: org.apache.http.HttpException

No public methods found

### Class: org.apache.http.ProtocolVersion
Type: Class
Implements: java.io.Serializable, java.lang.Cloneable

Methods:
- int getMinor()
- boolean lessEquals(ProtocolVersion)
- boolean isComparable(ProtocolVersion)
- int hashCode()
- boolean greaterEquals(ProtocolVersion)
- boolean equals(Object)
- Object clone() throws CloneNotSupportedException
- int getMajor()
- String toString()
- String getProtocol()
- int compareToVersion(ProtocolVersion)
- ProtocolVersion forVersion(int, int)

### Class: org.apache.http.TruncatedChunkException
Type: Class
Extends: org.apache.http.MalformedChunkCodingException

No public methods found

### Class: org.apache.http.UnsupportedHttpVersionException
Type: Class
Extends: org.apache.http.ProtocolException

No public methods found

## Package: org.apache.http.annotation

### Class: org.apache.http.annotation.Contract
Type: Interface
Implements: java.lang.annotation.Annotation

Methods:
- ThreadingBehavior threading()

### Class: org.apache.http.annotation.Experimental
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: org.apache.http.annotation.Obsolete
Type: Interface
Implements: java.lang.annotation.Annotation

No public methods found

### Class: org.apache.http.annotation.ThreadingBehavior
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- IMMUTABLE
- IMMUTABLE_CONDITIONAL
- SAFE
- SAFE_CONDITIONAL
- UNSAFE

Methods:
- **static** ThreadingBehavior valueOf(String)
- **static** ThreadingBehavior[] values()

## Package: org.apache.http.auth

### Class: org.apache.http.auth.AuthScheme
Type: Interface

Methods:
- Header authenticate(Credentials, HttpRequest) throws AuthenticationException
- boolean isConnectionBased()
- String getRealm()
- void processChallenge(Header) throws MalformedChallengeException
- boolean isComplete()
- String getParameter(String)
- String getSchemeName()

### Class: org.apache.http.auth.AuthSchemeFactory
Type: Interface

Methods:
- AuthScheme newInstance(HttpParams)

### Class: org.apache.http.auth.AuthSchemeProvider
Type: Interface

Methods:
- AuthScheme create(HttpContext)

### Class: org.apache.http.auth.ContextAwareAuthScheme
Type: Interface
Implements: org.apache.http.auth.AuthScheme

Methods:
- Header authenticate(Credentials, HttpRequest, HttpContext) throws AuthenticationException

### Class: org.apache.http.auth.Credentials
Type: Interface

Methods:
- String getPassword()
- Principal getUserPrincipal()

### Class: org.apache.http.auth.AUTH
Type: Class

No public methods found

### Class: org.apache.http.auth.AuthOption
Type: Class

Methods:
- AuthScheme getAuthScheme()
- Credentials getCredentials()
- String toString()

### Class: org.apache.http.auth.AuthProtocolState
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- UNCHALLENGED
- CHALLENGED
- HANDSHAKE
- FAILURE
- SUCCESS

Methods:
- **static** AuthProtocolState valueOf(String)
- **static** AuthProtocolState[] values()

### Class: org.apache.http.auth.AuthSchemeRegistry
Type: Class
Implements: org.apache.http.config.Lookup

Methods:
- AuthSchemeProvider lookup(String)
- Object lookup(String)
- AuthScheme getAuthScheme(String, HttpParams) throws IllegalStateException
- V setItems(Map<String, AuthSchemeFactory>)
- void unregister(String)
- List<String> getSchemeNames()
- void register(String, AuthSchemeFactory)

### Class: org.apache.http.auth.AuthScope
Type: Class

Methods:
- String getScheme()
- int getPort()
- HttpHost getOrigin()
- int hashCode()
- boolean equals(Object)
- int match(AuthScope)
- String toString()
- String getRealm()
- String getHost()

### Class: org.apache.http.auth.AuthState
Type: Class

Methods:
- AuthScope getAuthScope()
- boolean isValid()
- boolean isConnectionBased()
- void setAuthScope(AuthScope)
- void update(AuthScheme, Credentials)
- V update(Queue<AuthOption>)
- Credentials getCredentials()
- Queue<AuthOption> getAuthOptions()
- void invalidate()
- void setCredentials(Credentials)
- AuthScheme getAuthScheme()
- AuthProtocolState getState()
- boolean hasAuthOptions()
- void setAuthScheme(AuthScheme)
- void setState(AuthProtocolState)
- void reset()
- String toString()

### Class: org.apache.http.auth.AuthenticationException
Type: Class
Extends: org.apache.http.ProtocolException

No public methods found

### Class: org.apache.http.auth.BasicUserPrincipal
Type: Class
Implements: java.security.Principal, java.io.Serializable

Methods:
- String getName()
- int hashCode()
- boolean equals(Object)
- String toString()

### Class: org.apache.http.auth.ChallengeState
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- TARGET
- PROXY

Methods:
- **static** ChallengeState valueOf(String)
- **static** ChallengeState[] values()

### Class: org.apache.http.auth.InvalidCredentialsException
Type: Class
Extends: org.apache.http.auth.AuthenticationException

No public methods found

### Class: org.apache.http.auth.KerberosCredentials
Type: Class
Implements: org.apache.http.auth.Credentials, java.io.Serializable

Methods:
- String getPassword()
- Principal getUserPrincipal()
- GSSCredential getGSSCredential()

### Class: org.apache.http.auth.MalformedChallengeException
Type: Class
Extends: org.apache.http.ProtocolException

No public methods found

### Class: org.apache.http.auth.NTCredentials
Type: Class
Implements: org.apache.http.auth.Credentials, java.io.Serializable

Methods:
- String getDomain()
- String getPassword()
- Principal getUserPrincipal()
- int hashCode()
- boolean equals(Object)
- String getUserName()
- String toString()
- String getWorkstation()

### Class: org.apache.http.auth.NTUserPrincipal
Type: Class
Implements: java.security.Principal, java.io.Serializable

Methods:
- String getDomain()
- String getName()
- int hashCode()
- boolean equals(Object)
- String toString()
- String getUsername()

### Class: org.apache.http.auth.UsernamePasswordCredentials
Type: Class
Implements: org.apache.http.auth.Credentials, java.io.Serializable

Methods:
- String getPassword()
- Principal getUserPrincipal()
- int hashCode()
- boolean equals(Object)
- String getUserName()
- String toString()

## Package: org.apache.http.auth.params

### Class: org.apache.http.auth.params.AuthPNames
Type: Interface

No public methods found

### Class: org.apache.http.auth.params.AuthParamBean
Type: Class
Extends: org.apache.http.params.HttpAbstractParamBean

Methods:
- void setCredentialCharset(String)

### Class: org.apache.http.auth.params.AuthParams
Type: Class

Methods:
- **static** String getCredentialCharset(HttpParams)
- **static** void setCredentialCharset(HttpParams, String)

## Package: org.apache.http.client

### Class: org.apache.http.client.AuthCache
Type: Interface

Methods:
- AuthScheme get(HttpHost)
- void clear()
- void remove(HttpHost)
- void put(HttpHost, AuthScheme)

### Class: org.apache.http.client.AuthenticationHandler
Type: Interface

Methods:
- AuthScheme selectScheme(Map<String, Header>, HttpResponse, HttpContext) throws AuthenticationException
- Map<String, Header> getChallenges(HttpResponse, HttpContext) throws MalformedChallengeException
- boolean isAuthenticationRequested(HttpResponse, HttpContext)

### Class: org.apache.http.client.AuthenticationStrategy
Type: Interface

Methods:
- void authFailed(HttpHost, AuthScheme, HttpContext)
- Queue<AuthOption> select(Map<String, Header>, HttpHost, HttpResponse, HttpContext) throws MalformedChallengeException
- Map<String, Header> getChallenges(HttpHost, HttpResponse, HttpContext) throws MalformedChallengeException
- void authSucceeded(HttpHost, AuthScheme, HttpContext)
- boolean isAuthenticationRequested(HttpHost, HttpResponse, HttpContext)

### Class: org.apache.http.client.BackoffManager
Type: Interface

Methods:
- void backOff(HttpRoute)
- void probe(HttpRoute)

### Class: org.apache.http.client.ConnectionBackoffStrategy
Type: Interface

Methods:
- boolean shouldBackoff(Throwable)
- boolean shouldBackoff(HttpResponse)

### Class: org.apache.http.client.CookieStore
Type: Interface

Methods:
- void addCookie(Cookie)
- boolean clearExpired(Date)
- List<Cookie> getCookies()
- void clear()

### Class: org.apache.http.client.CredentialsProvider
Type: Interface

Methods:
- void clear()
- Credentials getCredentials(AuthScope)
- void setCredentials(AuthScope, Credentials)

### Class: org.apache.http.client.HttpClient
Type: Interface

Methods:
- ClientConnectionManager getConnectionManager()
- HttpResponse execute(HttpUriRequest) throws IOException, ClientProtocolException
- HttpResponse execute(HttpUriRequest, HttpContext) throws IOException, ClientProtocolException
- HttpResponse execute(HttpHost, HttpRequest) throws IOException, ClientProtocolException
- HttpResponse execute(HttpHost, HttpRequest, HttpContext) throws IOException, ClientProtocolException
- TT execute(HttpUriRequest, ResponseHandler<+TT>) throws IOException, ClientProtocolException
- TT execute(HttpUriRequest, ResponseHandler<+TT>, HttpContext) throws IOException, ClientProtocolException
- TT execute(HttpHost, HttpRequest, ResponseHandler<+TT>) throws IOException, ClientProtocolException
- TT execute(HttpHost, HttpRequest, ResponseHandler<+TT>, HttpContext) throws IOException, ClientProtocolException
- HttpParams getParams()

### Class: org.apache.http.client.HttpRequestRetryHandler
Type: Interface

Methods:
- boolean retryRequest(IOException, int, HttpContext)

### Class: org.apache.http.client.RedirectHandler
Type: Interface

Methods:
- URI getLocationURI(HttpResponse, HttpContext) throws ProtocolException
- boolean isRedirectRequested(HttpResponse, HttpContext)

### Class: org.apache.http.client.RedirectStrategy
Type: Interface

Methods:
- HttpUriRequest getRedirect(HttpRequest, HttpResponse, HttpContext) throws ProtocolException
- boolean isRedirected(HttpRequest, HttpResponse, HttpContext) throws ProtocolException

### Class: org.apache.http.client.RequestDirector
Type: Interface

Methods:
- HttpResponse execute(HttpHost, HttpRequest, HttpContext) throws HttpException, IOException

### Class: org.apache.http.client.ResponseHandler
Type: Interface

Methods:
- TT handleResponse(HttpResponse) throws ClientProtocolException, IOException

### Class: org.apache.http.client.ServiceUnavailableRetryStrategy
Type: Interface

Methods:
- long getRetryInterval()
- boolean retryRequest(HttpResponse, int, HttpContext)

### Class: org.apache.http.client.UserTokenHandler
Type: Interface

Methods:
- Object getUserToken(HttpContext)

### Class: org.apache.http.client.CircularRedirectException
Type: Class
Extends: org.apache.http.client.RedirectException

No public methods found

### Class: org.apache.http.client.ClientProtocolException
Type: Class
Extends: java.io.IOException

No public methods found

### Class: org.apache.http.client.HttpResponseException
Type: Class
Extends: org.apache.http.client.ClientProtocolException

Methods:
- int getStatusCode()
- String getReasonPhrase()

### Class: org.apache.http.client.NonRepeatableRequestException
Type: Class
Extends: org.apache.http.ProtocolException

No public methods found

### Class: org.apache.http.client.RedirectException
Type: Class
Extends: org.apache.http.ProtocolException

No public methods found

## Package: org.apache.http.client.config

### Class: org.apache.http.client.config.AuthSchemes
Type: Class

No public methods found

### Class: org.apache.http.client.config.CookieSpecs
Type: Class

No public methods found

### Class: org.apache.http.client.config.RequestConfig
Type: Class
Implements: java.lang.Cloneable

Methods:
- Collection<String> getProxyPreferredAuthSchemes()
- String getCookieSpec()
- boolean isDecompressionEnabled()
- HttpHost getProxy()
- **static** RequestConfig$Builder custom()
- boolean isAuthenticationEnabled()
- boolean isRedirectsEnabled()
- int getConnectTimeout()
- int getSocketTimeout()
- InetAddress getLocalAddress()
- int getConnectionRequestTimeout()
- boolean isNormalizeUri()
- int getMaxRedirects()
- boolean isStaleConnectionCheckEnabled()
- Collection<String> getTargetPreferredAuthSchemes()
- String toString()
- **static** RequestConfig$Builder copy(RequestConfig)
- boolean isContentCompressionEnabled()
- boolean isCircularRedirectsAllowed()
- boolean isRelativeRedirectsAllowed()
- boolean isExpectContinueEnabled()

### Class: org.apache.http.client.config.RequestConfig$Builder
Type: Class

Methods:
- RequestConfig$Builder setSocketTimeout(int)
- RequestConfig$Builder setConnectTimeout(int)
- RequestConfig$Builder setRedirectsEnabled(boolean)
- RequestConfig$Builder setExpectContinueEnabled(boolean)
- RequestConfig$Builder setProxy(HttpHost)
- RequestConfig$Builder setCircularRedirectsAllowed(boolean)
- RequestConfig$Builder setTargetPreferredAuthSchemes(Collection<String>)
- RequestConfig$Builder setAuthenticationEnabled(boolean)
- RequestConfig$Builder setDecompressionEnabled(boolean)
- RequestConfig$Builder setConnectionRequestTimeout(int)
- RequestConfig$Builder setLocalAddress(InetAddress)
- RequestConfig$Builder setMaxRedirects(int)
- RequestConfig$Builder setRelativeRedirectsAllowed(boolean)
- RequestConfig build()
- RequestConfig$Builder setProxyPreferredAuthSchemes(Collection<String>)
- RequestConfig$Builder setNormalizeUri(boolean)
- RequestConfig$Builder setCookieSpec(String)
- RequestConfig$Builder setContentCompressionEnabled(boolean)
- RequestConfig$Builder setStaleConnectionCheckEnabled(boolean)

## Package: org.apache.http.client.entity

### Class: org.apache.http.client.entity.InputStreamFactory
Type: Interface

Methods:
- InputStream create(InputStream) throws IOException

### Class: org.apache.http.client.entity.DecompressingEntity
Type: Class
Extends: org.apache.http.entity.HttpEntityWrapper

Methods:
- Header getContentEncoding()
- void writeTo(OutputStream) throws IOException
- InputStream getContent() throws IOException
- long getContentLength()

### Class: org.apache.http.client.entity.DeflateDecompressingEntity
Type: Class
Extends: org.apache.http.client.entity.DecompressingEntity

No public methods found

### Class: org.apache.http.client.entity.DeflateInputStream
Type: Class
Extends: java.io.InputStream

Methods:
- int read() throws IOException
- int read(byte[]) throws IOException
- int read(byte[], int, int) throws IOException
- boolean markSupported()
- int available() throws IOException
- void reset() throws IOException
- long skip(long) throws IOException
- void close() throws IOException
- void mark(int)

### Class: org.apache.http.client.entity.DeflateInputStreamFactory
Type: Class
Implements: org.apache.http.client.entity.InputStreamFactory

Methods:
- InputStream create(InputStream) throws IOException
- **static** DeflateInputStreamFactory getInstance()

### Class: org.apache.http.client.entity.EntityBuilder
Type: Class

Methods:
- boolean isGzipCompress()
- String getContentEncoding()
- EntityBuilder setBinary(byte[])
- EntityBuilder setStream(InputStream)
- String getText()
- EntityBuilder setContentEncoding(String)
- EntityBuilder chunked()
- EntityBuilder setSerializable(Serializable)
- File getFile()
- EntityBuilder setParameters(List<NameValuePair>)
- EntityBuilder setParameters(NameValuePair[])
- Serializable getSerializable()
- EntityBuilder gzipCompress()
- boolean isChunked()
- EntityBuilder setFile(File)
- HttpEntity build()
- List<NameValuePair> getParameters()
- ContentType getContentType()
- **static** EntityBuilder create()
- InputStream getStream()
- byte[] getBinary()
- EntityBuilder setContentType(ContentType)
- EntityBuilder setText(String)

### Class: org.apache.http.client.entity.GZIPInputStreamFactory
Type: Class
Implements: org.apache.http.client.entity.InputStreamFactory

Methods:
- InputStream create(InputStream) throws IOException
- **static** GZIPInputStreamFactory getInstance()

### Class: org.apache.http.client.entity.GzipCompressingEntity
Type: Class
Extends: org.apache.http.entity.HttpEntityWrapper

Methods:
- void writeTo(OutputStream) throws IOException
- Header getContentEncoding()
- boolean isChunked()
- InputStream getContent() throws IOException
- long getContentLength()

### Class: org.apache.http.client.entity.GzipDecompressingEntity
Type: Class
Extends: org.apache.http.client.entity.DecompressingEntity

No public methods found

### Class: org.apache.http.client.entity.UrlEncodedFormEntity
Type: Class
Extends: org.apache.http.entity.StringEntity

No public methods found

## Package: org.apache.http.client.methods

### Class: org.apache.http.client.methods.AbortableHttpRequest
Type: Interface

Methods:
- void abort()
- void setReleaseTrigger(ConnectionReleaseTrigger) throws IOException
- void setConnectionRequest(ClientConnectionRequest) throws IOException

### Class: org.apache.http.client.methods.CloseableHttpResponse
Type: Interface
Implements: org.apache.http.HttpResponse, java.io.Closeable

No public methods found

### Class: org.apache.http.client.methods.Configurable
Type: Interface

Methods:
- RequestConfig getConfig()

### Class: org.apache.http.client.methods.HttpExecutionAware
Type: Interface

Methods:
- void setCancellable(Cancellable)
- boolean isAborted()

### Class: org.apache.http.client.methods.HttpUriRequest
Type: Interface
Implements: org.apache.http.HttpRequest

Methods:
- void abort() throws UnsupportedOperationException
- String getMethod()
- URI getURI()
- boolean isAborted()

### Class: org.apache.http.client.methods.AbstractExecutionAwareRequest
Type: Abstract Class
Extends: org.apache.http.message.AbstractHttpMessage
Implements: org.apache.http.client.methods.HttpExecutionAware, org.apache.http.client.methods.AbortableHttpRequest, java.lang.Cloneable, org.apache.http.HttpRequest

Methods:
- void abort()
- void setCancellable(Cancellable)
- void setReleaseTrigger(ConnectionReleaseTrigger)
- void setConnectionRequest(ClientConnectionRequest)
- Object clone() throws CloneNotSupportedException
- void reset()
- void completed()
- boolean isAborted()

### Class: org.apache.http.client.methods.HttpDelete
Type: Class
Extends: org.apache.http.client.methods.HttpRequestBase

Methods:
- String getMethod()

### Class: org.apache.http.client.methods.HttpEntityEnclosingRequestBase
Type: Abstract Class
Extends: org.apache.http.client.methods.HttpRequestBase
Implements: org.apache.http.HttpEntityEnclosingRequest

Methods:
- boolean expectContinue()
- Object clone() throws CloneNotSupportedException
- HttpEntity getEntity()
- void setEntity(HttpEntity)

### Class: org.apache.http.client.methods.HttpGet
Type: Class
Extends: org.apache.http.client.methods.HttpRequestBase

Methods:
- String getMethod()

### Class: org.apache.http.client.methods.HttpHead
Type: Class
Extends: org.apache.http.client.methods.HttpRequestBase

Methods:
- String getMethod()

### Class: org.apache.http.client.methods.HttpOptions
Type: Class
Extends: org.apache.http.client.methods.HttpRequestBase

Methods:
- Set<String> getAllowedMethods(HttpResponse)
- String getMethod()

### Class: org.apache.http.client.methods.HttpPatch
Type: Class
Extends: org.apache.http.client.methods.HttpEntityEnclosingRequestBase

Methods:
- String getMethod()

### Class: org.apache.http.client.methods.HttpPost
Type: Class
Extends: org.apache.http.client.methods.HttpEntityEnclosingRequestBase

Methods:
- String getMethod()

### Class: org.apache.http.client.methods.HttpPut
Type: Class
Extends: org.apache.http.client.methods.HttpEntityEnclosingRequestBase

Methods:
- String getMethod()

### Class: org.apache.http.client.methods.HttpRequestBase
Type: Abstract Class
Extends: org.apache.http.client.methods.AbstractExecutionAwareRequest
Implements: org.apache.http.client.methods.HttpUriRequest, org.apache.http.client.methods.Configurable

Methods:
- ProtocolVersion getProtocolVersion()
- RequestLine getRequestLine()
- void releaseConnection()
- void setURI(URI)
- String toString()
- void started()
- String getMethod()
- void setProtocolVersion(ProtocolVersion)
- RequestConfig getConfig()
- URI getURI()
- void setConfig(RequestConfig)

### Class: org.apache.http.client.methods.HttpRequestWrapper
Type: Class
Extends: org.apache.http.message.AbstractHttpMessage
Implements: org.apache.http.client.methods.HttpUriRequest

Methods:
- ProtocolVersion getProtocolVersion()
- HttpHost getTarget()
- RequestLine getRequestLine()
- void abort() throws UnsupportedOperationException
- void setURI(URI)
- String toString()
- HttpRequest getOriginal()
- String getMethod()
- void setProtocolVersion(ProtocolVersion)
- **static** HttpRequestWrapper wrap(HttpRequest)
- **static** HttpRequestWrapper wrap(HttpRequest, HttpHost)
- HttpParams getParams()
- URI getURI()
- boolean isAborted()

### Class: org.apache.http.client.methods.HttpTrace
Type: Class
Extends: org.apache.http.client.methods.HttpRequestBase

Methods:
- String getMethod()

### Class: org.apache.http.client.methods.RequestBuilder
Type: Class

Methods:
- RequestBuilder setCharset(Charset)
- Header getFirstHeader(String)
- Header getLastHeader(String)
- RequestBuilder removeHeaders(String)
- String getMethod()
- Charset getCharset()
- **static** RequestBuilder delete()
- **static** RequestBuilder delete(URI)
- **static** RequestBuilder delete(String)
- RequestBuilder addParameter(NameValuePair)
- RequestBuilder addParameter(String, String)
- RequestBuilder setHeader(Header)
- RequestBuilder setHeader(String, String)
- **static** RequestBuilder put()
- **static** RequestBuilder put(URI)
- **static** RequestBuilder put(String)
- RequestBuilder setConfig(RequestConfig)
- RequestBuilder setEntity(HttpEntity)
- **static** RequestBuilder patch()
- **static** RequestBuilder patch(URI)
- **static** RequestBuilder patch(String)
- **static** RequestBuilder head()
- **static** RequestBuilder head(URI)
- **static** RequestBuilder head(String)
- **static** RequestBuilder trace()
- **static** RequestBuilder trace(URI)
- **static** RequestBuilder trace(String)
- **static** RequestBuilder post()
- **static** RequestBuilder post(URI)
- **static** RequestBuilder post(String)
- **static** RequestBuilder get()
- **static** RequestBuilder get(URI)
- **static** RequestBuilder get(String)
- **static** RequestBuilder options()
- **static** RequestBuilder options(URI)
- **static** RequestBuilder options(String)
- **static** RequestBuilder create(String)
- **static** RequestBuilder copy(HttpRequest)
- ProtocolVersion getVersion()
- RequestBuilder addParameters(NameValuePair[])
- RequestBuilder addHeader(Header)
- RequestBuilder addHeader(String, String)
- Header[] getHeaders(String)
- RequestBuilder setVersion(ProtocolVersion)
- RequestBuilder setUri(URI)
- RequestBuilder setUri(String)
- HttpEntity getEntity()
- RequestConfig getConfig()
- RequestBuilder removeHeader(Header)
- HttpUriRequest build()
- List<NameValuePair> getParameters()
- String toString()
- URI getUri()

## Package: org.apache.http.client.params

### Class: org.apache.http.client.params.AllClientPNames
Type: Interface
Implements: org.apache.http.params.CoreConnectionPNames, org.apache.http.params.CoreProtocolPNames, org.apache.http.client.params.ClientPNames, org.apache.http.auth.params.AuthPNames, org.apache.http.cookie.params.CookieSpecPNames, org.apache.http.conn.params.ConnConnectionPNames, org.apache.http.conn.params.ConnManagerPNames, org.apache.http.conn.params.ConnRoutePNames

No public methods found

### Class: org.apache.http.client.params.ClientPNames
Type: Interface

No public methods found

### Class: org.apache.http.client.params.AuthPolicy
Type: Class

No public methods found

### Class: org.apache.http.client.params.ClientParamBean
Type: Class
Extends: org.apache.http.params.HttpAbstractParamBean

Methods:
- void setHandleAuthentication(boolean)
- void setAllowCircularRedirects(boolean)
- void setMaxRedirects(int)
- void setHandleRedirects(boolean)
- void setConnectionManagerTimeout(long)
- void setCookiePolicy(String)
- void setVirtualHost(HttpHost)
- void setDefaultHost(HttpHost)
- V setDefaultHeaders(Collection<Header>)
- void setRejectRelativeRedirect(boolean)
- void setConnectionManagerFactoryClassName(String)

### Class: org.apache.http.client.params.CookiePolicy
Type: Class

No public methods found

### Class: org.apache.http.client.params.HttpClientParamConfig
Type: Class

Methods:
- **static** RequestConfig getRequestConfig(HttpParams)
- **static** RequestConfig getRequestConfig(HttpParams, RequestConfig)

### Class: org.apache.http.client.params.HttpClientParams
Type: Class

Methods:
- **static** void setAuthenticating(HttpParams, boolean)
- **static** void setConnectionManagerTimeout(HttpParams, long)
- **static** void setCookiePolicy(HttpParams, String)
- **static** String getCookiePolicy(HttpParams)
- **static** void setRedirecting(HttpParams, boolean)
- **static** boolean isRedirecting(HttpParams)
- **static** long getConnectionManagerTimeout(HttpParams)
- **static** boolean isAuthenticating(HttpParams)

## Package: org.apache.http.client.protocol

### Class: org.apache.http.client.protocol.ClientContext
Type: Interface

No public methods found

### Class: org.apache.http.client.protocol.ClientContextConfigurer
Type: Class
Implements: org.apache.http.client.protocol.ClientContext

Methods:
- void setCookieStore(CookieStore)
- void setCookieSpecRegistry(CookieSpecRegistry)
- void setCredentialsProvider(CredentialsProvider)
- void setAuthSchemeRegistry(AuthSchemeRegistry)

### Class: org.apache.http.client.protocol.HttpClientContext
Type: Class
Extends: org.apache.http.protocol.HttpCoreContext

Methods:
- CookieSpec getCookieSpec()
- AuthState getTargetAuthState()
- void setCookieStore(CookieStore)
- RouteInfo getHttpRoute()
- **static** HttpClientContext adapt(HttpContext)
- void setRequestConfig(RequestConfig)
- AuthCache getAuthCache()
- RequestConfig getRequestConfig()
- Lookup<CookieSpecProvider> getCookieSpecRegistry()
- void setUserToken(Object)
- void setCredentialsProvider(CredentialsProvider)
- V setAuthSchemeRegistry(Lookup<AuthSchemeProvider>)
- TT getUserToken(Class<TT>)
- Object getUserToken()
- CredentialsProvider getCredentialsProvider()
- Lookup<AuthSchemeProvider> getAuthSchemeRegistry()
- AuthState getProxyAuthState()
- CookieOrigin getCookieOrigin()
- void setAuthCache(AuthCache)
- **static** HttpClientContext create()
- V setCookieSpecRegistry(Lookup<CookieSpecProvider>)
- List<URI> getRedirectLocations()
- CookieStore getCookieStore()

### Class: org.apache.http.client.protocol.RequestAcceptEncoding
Type: Class
Implements: org.apache.http.HttpRequestInterceptor

Methods:
- void process(HttpRequest, HttpContext) throws HttpException, IOException

### Class: org.apache.http.client.protocol.RequestAddCookies
Type: Class
Implements: org.apache.http.HttpRequestInterceptor

Methods:
- void process(HttpRequest, HttpContext) throws HttpException, IOException

### Class: org.apache.http.client.protocol.RequestAuthCache
Type: Class
Implements: org.apache.http.HttpRequestInterceptor

Methods:
- void process(HttpRequest, HttpContext) throws HttpException, IOException

### Class: org.apache.http.client.protocol.RequestClientConnControl
Type: Class
Implements: org.apache.http.HttpRequestInterceptor

Methods:
- void process(HttpRequest, HttpContext) throws HttpException, IOException

### Class: org.apache.http.client.protocol.RequestDefaultHeaders
Type: Class
Implements: org.apache.http.HttpRequestInterceptor

Methods:
- void process(HttpRequest, HttpContext) throws HttpException, IOException

### Class: org.apache.http.client.protocol.RequestExpectContinue
Type: Class
Implements: org.apache.http.HttpRequestInterceptor

Methods:
- void process(HttpRequest, HttpContext) throws HttpException, IOException

### Class: org.apache.http.client.protocol.RequestProxyAuthentication
Type: Class
Extends: org.apache.http.client.protocol.RequestAuthenticationBase

Methods:
- void process(HttpRequest, HttpContext) throws HttpException, IOException

### Class: org.apache.http.client.protocol.RequestTargetAuthentication
Type: Class
Extends: org.apache.http.client.protocol.RequestAuthenticationBase

Methods:
- void process(HttpRequest, HttpContext) throws HttpException, IOException

### Class: org.apache.http.client.protocol.ResponseAuthCache
Type: Class
Implements: org.apache.http.HttpResponseInterceptor

Methods:
- void process(HttpResponse, HttpContext) throws HttpException, IOException

### Class: org.apache.http.client.protocol.ResponseContentEncoding
Type: Class
Implements: org.apache.http.HttpResponseInterceptor

Methods:
- void process(HttpResponse, HttpContext) throws HttpException, IOException

### Class: org.apache.http.client.protocol.ResponseProcessCookies
Type: Class
Implements: org.apache.http.HttpResponseInterceptor

Methods:
- void process(HttpResponse, HttpContext) throws HttpException, IOException

## Package: org.apache.http.client.utils

### Class: org.apache.http.client.utils.Idn
Type: Interface

Methods:
- String toUnicode(String)

### Class: org.apache.http.client.utils.CloneUtils
Type: Class

Methods:
- **static** Object clone(Object) throws CloneNotSupportedException
- **static** TT cloneObject(T) throws CloneNotSupportedException

### Class: org.apache.http.client.utils.DateUtils
Type: Class

Methods:
- **static** String formatDate(Date)
- **static** String formatDate(Date, String)
- **static** void clearThreadLocal()
- **static** Date parseDate(String)
- **static** Date parseDate(String, String[])
- **static** Date parseDate(String, String[], Date)

### Class: org.apache.http.client.utils.HttpClientUtils
Type: Class

Methods:
- **static** void closeQuietly(HttpResponse)
- **static** void closeQuietly(CloseableHttpResponse)
- **static** void closeQuietly(HttpClient)

### Class: org.apache.http.client.utils.JdkIdn
Type: Class
Implements: org.apache.http.client.utils.Idn

Methods:
- String toUnicode(String)

### Class: org.apache.http.client.utils.Punycode
Type: Class

Methods:
- **static** String toUnicode(String)

### Class: org.apache.http.client.utils.Rfc3492Idn
Type: Class
Implements: org.apache.http.client.utils.Idn

Methods:
- String toUnicode(String)

### Class: org.apache.http.client.utils.URIBuilder
Type: Class

Methods:
- URIBuilder setCharset(Charset)
- boolean isOpaque()
- URIBuilder setScheme(String)
- Charset getCharset()
- URIBuilder setPort(int)
- URIBuilder addParameter(String, String)
- URIBuilder setParameters(List<NameValuePair>)
- URIBuilder setParameters(NameValuePair[])
- boolean isPathEmpty()
- URIBuilder setCustomQuery(String)
- String getPath()
- URIBuilder setParameter(String, String)
- boolean isQueryEmpty()
- URIBuilder setQuery(String)
- String getHost()
- URIBuilder setPathSegments(String[])
- URIBuilder setPathSegments(List<String>)
- URIBuilder removeQuery()
- URIBuilder setHost(String)
- URIBuilder addParameters(List<NameValuePair>)
- String getScheme()
- URIBuilder setFragment(String)
- URIBuilder setPath(String)
- List<String> getPathSegments()
- URIBuilder setUserInfo(String)
- URIBuilder setUserInfo(String, String)
- int getPort()
- URI build() throws URISyntaxException
- List<NameValuePair> getQueryParams()
- boolean isAbsolute()
- String toString()
- URIBuilder clearParameters()
- String getFragment()
- String getUserInfo()

### Class: org.apache.http.client.utils.URIUtils
Type: Class

Methods:
- **static** URI resolve(URI, String)
- **static** URI resolve(URI, URI)
- **static** URI resolve(URI, HttpHost, List<URI>) throws URISyntaxException
- **static** URI rewriteURI(URI, HttpHost, boolean) throws URISyntaxException
- **static** URI rewriteURI(URI, HttpHost, EnumSet<URIUtils$UriFlag>) throws URISyntaxException
- **static** URI rewriteURI(URI, HttpHost) throws URISyntaxException
- **static** URI rewriteURI(URI) throws URISyntaxException
- **static** URI normalizeSyntax(URI) throws URISyntaxException
- **static** HttpHost extractHost(URI)
- **static** URI createURI(String, String, int, String, String, String) throws URISyntaxException
- **static** URI rewriteURIForRoute(URI, RouteInfo) throws URISyntaxException
- **static** URI rewriteURIForRoute(URI, RouteInfo, boolean) throws URISyntaxException

### Class: org.apache.http.client.utils.URIUtils$UriFlag
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- DROP_FRAGMENT
- NORMALIZE

Methods:
- **static** URIUtils$UriFlag valueOf(String)
- **static** URIUtils$UriFlag[] values()

### Class: org.apache.http.client.utils.URLEncodedUtils
Type: Class

Methods:
- **static** List<String> parsePathSegments(CharSequence, Charset)
- **static** List<String> parsePathSegments(CharSequence)
- **static** boolean isEncoded(HttpEntity)
- **static** String format(List<NameValuePair>, String)
- **static** String format(List<NameValuePair>, char, String)
- **static** String format(Iterable<NameValuePair>, Charset)
- **static** String format(Iterable<NameValuePair>, char, Charset)
- **static** List<NameValuePair> parse(URI, String)
- **static** List<NameValuePair> parse(URI, Charset)
- **static** List<NameValuePair> parse(HttpEntity) throws IOException
- **static** V parse(List<NameValuePair>, Scanner, String)
- **static** V parse(List<NameValuePair>, Scanner, String, String)
- **static** List<NameValuePair> parse(String, Charset)
- **static** List<NameValuePair> parse(String, Charset, [C)
- **static** List<NameValuePair> parse(CharArrayBuffer, Charset, [C)
- **static** String formatSegments(Iterable<String>, Charset)
- **static** String formatSegments(String[])

## Package: org.apache.http.concurrent

### Class: org.apache.http.concurrent.Cancellable
Type: Interface

Methods:
- boolean cancel()

### Class: org.apache.http.concurrent.FutureCallback
Type: Interface

Methods:
- void cancelled()
- void failed(Exception)
- V completed(T)

### Class: org.apache.http.concurrent.BasicFuture
Type: Class
Implements: java.util.concurrent.Future, org.apache.http.concurrent.Cancellable

Methods:
- boolean cancel(boolean)
- boolean cancel()
- boolean isCancelled()
- TT get() throws InterruptedException, ExecutionException
- TT get(long, TimeUnit) throws InterruptedException, ExecutionException, TimeoutException
- boolean failed(Exception)
- Z completed(T)
- boolean isDone()

## Package: org.apache.http.config

### Class: org.apache.http.config.Lookup
Type: Interface

Methods:
- TI lookup(String)

### Class: org.apache.http.config.ConnectionConfig
Type: Class
Implements: java.lang.Cloneable

Methods:
- int getFragmentSizeHint()
- CodingErrorAction getUnmappableInputAction()
- CodingErrorAction getMalformedInputAction()
- **static** ConnectionConfig$Builder custom()
- MessageConstraints getMessageConstraints()
- int getBufferSize()
- String toString()
- **static** ConnectionConfig$Builder copy(ConnectionConfig)
- Charset getCharset()

### Class: org.apache.http.config.ConnectionConfig$Builder
Type: Class

Methods:
- ConnectionConfig$Builder setBufferSize(int)
- ConnectionConfig$Builder setCharset(Charset)
- ConnectionConfig$Builder setFragmentSizeHint(int)
- ConnectionConfig$Builder setUnmappableInputAction(CodingErrorAction)
- ConnectionConfig build()
- ConnectionConfig$Builder setMalformedInputAction(CodingErrorAction)
- ConnectionConfig$Builder setMessageConstraints(MessageConstraints)

### Class: org.apache.http.config.MessageConstraints
Type: Class
Implements: java.lang.Cloneable

Methods:
- **static** MessageConstraints$Builder custom()
- int getMaxHeaderCount()
- **static** MessageConstraints lineLen(int)
- String toString()
- **static** MessageConstraints$Builder copy(MessageConstraints)
- int getMaxLineLength()

### Class: org.apache.http.config.MessageConstraints$Builder
Type: Class

Methods:
- MessageConstraints$Builder setMaxLineLength(int)
- MessageConstraints build()
- MessageConstraints$Builder setMaxHeaderCount(int)

### Class: org.apache.http.config.Registry
Type: Class
Implements: org.apache.http.config.Lookup

Methods:
- TI lookup(String)
- String toString()

### Class: org.apache.http.config.RegistryBuilder
Type: Class

Methods:
- Registry<TI> build()
- **static** RegistryBuilder<TI> create()
- String toString()
- RegistryBuilder<TI> register(String, T)

### Class: org.apache.http.config.SocketConfig
Type: Class
Implements: java.lang.Cloneable

Methods:
- int getBacklogSize()
- boolean isTcpNoDelay()
- int getSndBufSize()
- boolean isSoKeepAlive()
- int getSoLinger()
- boolean isSoReuseAddress()
- **static** SocketConfig$Builder custom()
- int getRcvBufSize()
- String toString()
- int getSoTimeout()
- **static** SocketConfig$Builder copy(SocketConfig)

### Class: org.apache.http.config.SocketConfig$Builder
Type: Class

Methods:
- SocketConfig$Builder setRcvBufSize(int)
- SocketConfig$Builder setBacklogSize(int)
- SocketConfig$Builder setSoKeepAlive(boolean)
- SocketConfig build()
- SocketConfig$Builder setTcpNoDelay(boolean)
- SocketConfig$Builder setSoReuseAddress(boolean)
- SocketConfig$Builder setSoLinger(int)
- SocketConfig$Builder setSndBufSize(int)
- SocketConfig$Builder setSoTimeout(int)

## Package: org.apache.http.conn

### Class: org.apache.http.conn.ClientConnectionManager
Type: Interface

Methods:
- void closeIdleConnections(long, TimeUnit)
- void releaseConnection(ManagedClientConnection, long, TimeUnit)
- ClientConnectionRequest requestConnection(HttpRoute, Object)
- void shutdown()
- SchemeRegistry getSchemeRegistry()
- void closeExpiredConnections()

### Class: org.apache.http.conn.ClientConnectionManagerFactory
Type: Interface

Methods:
- ClientConnectionManager newInstance(HttpParams, SchemeRegistry)

### Class: org.apache.http.conn.ClientConnectionOperator
Type: Interface

Methods:
- void updateSecureConnection(OperatedClientConnection, HttpHost, HttpContext, HttpParams) throws IOException
- void openConnection(OperatedClientConnection, HttpHost, InetAddress, HttpContext, HttpParams) throws IOException
- OperatedClientConnection createConnection()

### Class: org.apache.http.conn.ClientConnectionRequest
Type: Interface

Methods:
- ManagedClientConnection getConnection(long, TimeUnit) throws InterruptedException, ConnectionPoolTimeoutException
- void abortRequest()

### Class: org.apache.http.conn.ConnectionKeepAliveStrategy
Type: Interface

Methods:
- long getKeepAliveDuration(HttpResponse, HttpContext)

### Class: org.apache.http.conn.ConnectionReleaseTrigger
Type: Interface

Methods:
- void abortConnection() throws IOException
- void releaseConnection() throws IOException

### Class: org.apache.http.conn.ConnectionRequest
Type: Interface
Implements: org.apache.http.concurrent.Cancellable

Methods:
- HttpClientConnection get(long, TimeUnit) throws InterruptedException, ExecutionException, ConnectionPoolTimeoutException

### Class: org.apache.http.conn.DnsResolver
Type: Interface

Methods:
- InetAddress[] resolve(String) throws UnknownHostException

### Class: org.apache.http.conn.EofSensorWatcher
Type: Interface

Methods:
- boolean streamAbort(InputStream) throws IOException
- boolean eofDetected(InputStream) throws IOException
- boolean streamClosed(InputStream) throws IOException

### Class: org.apache.http.conn.HttpClientConnectionManager
Type: Interface

Methods:
- void closeIdleConnections(long, TimeUnit)
- void releaseConnection(HttpClientConnection, Object, long, TimeUnit)
- ConnectionRequest requestConnection(HttpRoute, Object)
- void upgrade(HttpClientConnection, HttpRoute, HttpContext) throws IOException
- void routeComplete(HttpClientConnection, HttpRoute, HttpContext) throws IOException
- void shutdown()
- void connect(HttpClientConnection, HttpRoute, int, HttpContext) throws IOException
- void closeExpiredConnections()

### Class: org.apache.http.conn.HttpClientConnectionOperator
Type: Interface

Methods:
- void upgrade(ManagedHttpClientConnection, HttpHost, HttpContext) throws IOException
- void connect(ManagedHttpClientConnection, HttpHost, InetSocketAddress, int, SocketConfig, HttpContext) throws IOException

### Class: org.apache.http.conn.HttpConnectionFactory
Type: Interface

Methods:
- TC create(T, T)

### Class: org.apache.http.conn.HttpRoutedConnection
Type: Interface
Implements: org.apache.http.HttpInetConnection

Methods:
- SSLSession getSSLSession()
- boolean isSecure()
- HttpRoute getRoute()

### Class: org.apache.http.conn.ManagedClientConnection
Type: Interface
Implements: org.apache.http.conn.HttpRoutedConnection, org.apache.http.conn.ManagedHttpClientConnection, org.apache.http.conn.ConnectionReleaseTrigger

Methods:
- void markReusable()
- SSLSession getSSLSession()
- void setIdleDuration(long, TimeUnit)
- Object getState()
- void unmarkReusable()
- boolean isMarkedReusable()
- void setState(Object)
- boolean isSecure()
- HttpRoute getRoute()
- void tunnelProxy(HttpHost, boolean, HttpParams) throws IOException
- void open(HttpRoute, HttpContext, HttpParams) throws IOException
- void layerProtocol(HttpContext, HttpParams) throws IOException
- void tunnelTarget(boolean, HttpParams) throws IOException

### Class: org.apache.http.conn.ManagedHttpClientConnection
Type: Interface
Implements: org.apache.http.HttpClientConnection, org.apache.http.HttpInetConnection

Methods:
- SSLSession getSSLSession()
- void bind(Socket) throws IOException
- Socket getSocket()
- String getId()

### Class: org.apache.http.conn.OperatedClientConnection
Type: Interface
Implements: org.apache.http.HttpClientConnection, org.apache.http.HttpInetConnection

Methods:
- HttpHost getTargetHost()
- void openCompleted(boolean, HttpParams) throws IOException
- Socket getSocket()
- void update(Socket, HttpHost, boolean, HttpParams) throws IOException
- boolean isSecure()
- void opening(Socket, HttpHost) throws IOException

### Class: org.apache.http.conn.SchemePortResolver
Type: Interface

Methods:
- int resolve(HttpHost) throws UnsupportedSchemeException

### Class: org.apache.http.conn.BasicEofSensorWatcher
Type: Class
Implements: org.apache.http.conn.EofSensorWatcher

Methods:
- boolean streamAbort(InputStream) throws IOException
- boolean eofDetected(InputStream) throws IOException
- boolean streamClosed(InputStream) throws IOException

### Class: org.apache.http.conn.BasicManagedEntity
Type: Class
Extends: org.apache.http.entity.HttpEntityWrapper
Implements: org.apache.http.conn.ConnectionReleaseTrigger, org.apache.http.conn.EofSensorWatcher

Methods:
- void writeTo(OutputStream) throws IOException
- boolean isRepeatable()
- boolean streamAbort(InputStream) throws IOException
- boolean eofDetected(InputStream) throws IOException
- void abortConnection() throws IOException
- void releaseConnection() throws IOException
- InputStream getContent() throws IOException
- boolean streamClosed(InputStream) throws IOException
- void consumeContent() throws IOException

### Class: org.apache.http.conn.ConnectTimeoutException
Type: Class
Extends: java.io.InterruptedIOException

Methods:
- HttpHost getHost()

### Class: org.apache.http.conn.ConnectionPoolTimeoutException
Type: Class
Extends: org.apache.http.conn.ConnectTimeoutException

No public methods found

### Class: org.apache.http.conn.EofSensorInputStream
Type: Class
Extends: java.io.InputStream
Implements: org.apache.http.conn.ConnectionReleaseTrigger

Methods:
- void abortConnection() throws IOException
- void releaseConnection() throws IOException
- int read() throws IOException
- int read(byte[], int, int) throws IOException
- int read(byte[]) throws IOException
- int available() throws IOException
- void close() throws IOException

### Class: org.apache.http.conn.HttpHostConnectException
Type: Class
Extends: java.net.ConnectException

Methods:
- HttpHost getHost()

### Class: org.apache.http.conn.HttpInetSocketAddress
Type: Class
Extends: java.net.InetSocketAddress

Methods:
- HttpHost getHttpHost()
- String toString()

### Class: org.apache.http.conn.MultihomePlainSocketFactory
Type: Class
Implements: org.apache.http.conn.scheme.SocketFactory

Methods:
- **static** MultihomePlainSocketFactory getSocketFactory()
- Socket createSocket()
- Socket connectSocket(Socket, String, int, InetAddress, int, HttpParams) throws IOException
- boolean isSecure(Socket) throws IllegalArgumentException

### Class: org.apache.http.conn.UnsupportedSchemeException
Type: Class
Extends: java.io.IOException

No public methods found

## Package: org.apache.http.conn.params

### Class: org.apache.http.conn.params.ConnConnectionPNames
Type: Interface

No public methods found

### Class: org.apache.http.conn.params.ConnManagerPNames
Type: Interface

No public methods found

### Class: org.apache.http.conn.params.ConnPerRoute
Type: Interface

Methods:
- int getMaxForRoute(HttpRoute)

### Class: org.apache.http.conn.params.ConnRoutePNames
Type: Interface

No public methods found

### Class: org.apache.http.conn.params.ConnConnectionParamBean
Type: Class
Extends: org.apache.http.params.HttpAbstractParamBean

Methods:
- void setMaxStatusLineGarbage(int)

### Class: org.apache.http.conn.params.ConnManagerParamBean
Type: Class
Extends: org.apache.http.params.HttpAbstractParamBean

Methods:
- void setConnectionsPerRoute(ConnPerRouteBean)
- void setMaxTotalConnections(int)
- void setTimeout(long)

### Class: org.apache.http.conn.params.ConnManagerParams
Type: Class
Implements: org.apache.http.conn.params.ConnManagerPNames

Methods:
- **static** void setMaxTotalConnections(HttpParams, int)
- **static** int getMaxTotalConnections(HttpParams)
- **static** void setTimeout(HttpParams, long)
- **static** long getTimeout(HttpParams)
- **static** ConnPerRoute getMaxConnectionsPerRoute(HttpParams)
- **static** void setMaxConnectionsPerRoute(HttpParams, ConnPerRoute)

### Class: org.apache.http.conn.params.ConnPerRouteBean
Type: Class
Implements: org.apache.http.conn.params.ConnPerRoute

Methods:
- V setMaxForRoutes(Map<HttpRoute, Integer>)
- int getDefaultMaxPerRoute()
- void setDefaultMaxPerRoute(int)
- String toString()
- int getMaxForRoute(HttpRoute)
- int getDefaultMax()
- void setMaxForRoute(HttpRoute, int)

### Class: org.apache.http.conn.params.ConnRouteParamBean
Type: Class
Extends: org.apache.http.params.HttpAbstractParamBean

Methods:
- void setLocalAddress(InetAddress)
- void setDefaultProxy(HttpHost)
- void setForcedRoute(HttpRoute)

### Class: org.apache.http.conn.params.ConnRouteParams
Type: Class
Implements: org.apache.http.conn.params.ConnRoutePNames

Methods:
- **static** void setLocalAddress(HttpParams, InetAddress)
- **static** HttpRoute getForcedRoute(HttpParams)
- **static** void setDefaultProxy(HttpParams, HttpHost)
- **static** void setForcedRoute(HttpParams, HttpRoute)
- **static** InetAddress getLocalAddress(HttpParams)
- **static** HttpHost getDefaultProxy(HttpParams)

## Package: org.apache.http.conn.routing

### Class: org.apache.http.conn.routing.HttpRouteDirector
Type: Interface

Methods:
- int nextStep(RouteInfo, RouteInfo)

### Class: org.apache.http.conn.routing.HttpRoutePlanner
Type: Interface

Methods:
- HttpRoute determineRoute(HttpHost, HttpRequest, HttpContext) throws HttpException

### Class: org.apache.http.conn.routing.RouteInfo
Type: Interface

Methods:
- HttpHost getTargetHost()
- boolean isTunnelled()
- boolean isLayered()
- int getHopCount()
- RouteInfo$TunnelType getTunnelType()
- HttpHost getProxyHost()
- boolean isSecure()
- RouteInfo$LayerType getLayerType()
- HttpHost getHopTarget(int)
- InetAddress getLocalAddress()

### Class: org.apache.http.conn.routing.BasicRouteDirector
Type: Class
Implements: org.apache.http.conn.routing.HttpRouteDirector

Methods:
- int nextStep(RouteInfo, RouteInfo)

### Class: org.apache.http.conn.routing.HttpRoute
Type: Class
Implements: org.apache.http.conn.routing.RouteInfo, java.lang.Cloneable

Methods:
- InetSocketAddress getLocalSocketAddress()
- RouteInfo$TunnelType getTunnelType()
- HttpHost getProxyHost()
- boolean isSecure()
- RouteInfo$LayerType getLayerType()
- InetAddress getLocalAddress()
- HttpHost getTargetHost()
- boolean isTunnelled()
- int hashCode()
- boolean equals(Object)
- boolean isLayered()
- int getHopCount()
- Object clone() throws CloneNotSupportedException
- String toString()
- HttpHost getHopTarget(int)

### Class: org.apache.http.conn.routing.RouteInfo$LayerType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- PLAIN
- LAYERED

Methods:
- **static** RouteInfo$LayerType valueOf(String)
- **static** RouteInfo$LayerType[] values()

### Class: org.apache.http.conn.routing.RouteInfo$TunnelType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- PLAIN
- TUNNELLED

Methods:
- **static** RouteInfo$TunnelType valueOf(String)
- **static** RouteInfo$TunnelType[] values()

### Class: org.apache.http.conn.routing.RouteTracker
Type: Class
Implements: org.apache.http.conn.routing.RouteInfo, java.lang.Cloneable

Methods:
- void connectProxy(HttpHost, boolean)
- RouteInfo$TunnelType getTunnelType()
- boolean isConnected()
- HttpHost getProxyHost()
- boolean isSecure()
- RouteInfo$LayerType getLayerType()
- InetAddress getLocalAddress()
- void layerProtocol(boolean)
- void tunnelTarget(boolean)
- HttpHost getTargetHost()
- boolean isTunnelled()
- void connectTarget(boolean)
- int hashCode()
- boolean equals(Object)
- boolean isLayered()
- int getHopCount()
- Object clone() throws CloneNotSupportedException
- void reset()
- String toString()
- HttpRoute toRoute()
- HttpHost getHopTarget(int)
- void tunnelProxy(HttpHost, boolean)

## Package: org.apache.http.conn.scheme

### Class: org.apache.http.conn.scheme.HostNameResolver
Type: Interface

Methods:
- InetAddress resolve(String) throws IOException

### Class: org.apache.http.conn.scheme.LayeredSchemeSocketFactory
Type: Interface
Implements: org.apache.http.conn.scheme.SchemeSocketFactory

Methods:
- Socket createLayeredSocket(Socket, String, int, boolean) throws IOException, UnknownHostException

### Class: org.apache.http.conn.scheme.LayeredSocketFactory
Type: Interface
Implements: org.apache.http.conn.scheme.SocketFactory

Methods:
- Socket createSocket(Socket, String, int, boolean) throws IOException, UnknownHostException

### Class: org.apache.http.conn.scheme.SchemeLayeredSocketFactory
Type: Interface
Implements: org.apache.http.conn.scheme.SchemeSocketFactory

Methods:
- Socket createLayeredSocket(Socket, String, int, HttpParams) throws IOException, UnknownHostException

### Class: org.apache.http.conn.scheme.SchemeSocketFactory
Type: Interface

Methods:
- Socket createSocket(HttpParams) throws IOException
- Socket connectSocket(Socket, InetSocketAddress, InetSocketAddress, HttpParams) throws IOException, UnknownHostException, ConnectTimeoutException
- boolean isSecure(Socket) throws IllegalArgumentException

### Class: org.apache.http.conn.scheme.SocketFactory
Type: Interface

Methods:
- Socket createSocket() throws IOException
- Socket connectSocket(Socket, String, int, InetAddress, int, HttpParams) throws IOException, UnknownHostException, ConnectTimeoutException
- boolean isSecure(Socket) throws IllegalArgumentException

### Class: org.apache.http.conn.scheme.PlainSocketFactory
Type: Class
Implements: org.apache.http.conn.scheme.SocketFactory, org.apache.http.conn.scheme.SchemeSocketFactory

Methods:
- **static** PlainSocketFactory getSocketFactory()
- Socket createSocket(HttpParams)
- Socket createSocket()
- Socket connectSocket(Socket, InetSocketAddress, InetSocketAddress, HttpParams) throws IOException, ConnectTimeoutException
- Socket connectSocket(Socket, String, int, InetAddress, int, HttpParams) throws IOException, UnknownHostException, ConnectTimeoutException
- boolean isSecure(Socket)

### Class: org.apache.http.conn.scheme.Scheme
Type: Class

Methods:
- SocketFactory getSocketFactory()
- String getName()
- int getDefaultPort()
- int hashCode()
- boolean equals(Object)
- boolean isLayered()
- String toString()
- SchemeSocketFactory getSchemeSocketFactory()
- int resolvePort(int)

### Class: org.apache.http.conn.scheme.SchemeRegistry
Type: Class

Methods:
- Scheme getScheme(String)
- Scheme getScheme(HttpHost)
- V setItems(Map<String, Scheme>)
- Scheme get(String)
- Scheme unregister(String)
- List<String> getSchemeNames()
- Scheme register(Scheme)

## Package: org.apache.http.conn.socket

### Class: org.apache.http.conn.socket.ConnectionSocketFactory
Type: Interface

Methods:
- Socket createSocket(HttpContext) throws IOException
- Socket connectSocket(int, Socket, HttpHost, InetSocketAddress, InetSocketAddress, HttpContext) throws IOException

### Class: org.apache.http.conn.socket.LayeredConnectionSocketFactory
Type: Interface
Implements: org.apache.http.conn.socket.ConnectionSocketFactory

Methods:
- Socket createLayeredSocket(Socket, String, int, HttpContext) throws IOException, UnknownHostException

### Class: org.apache.http.conn.socket.PlainConnectionSocketFactory
Type: Class
Implements: org.apache.http.conn.socket.ConnectionSocketFactory

Methods:
- **static** PlainConnectionSocketFactory getSocketFactory()
- Socket createSocket(HttpContext) throws IOException
- Socket connectSocket(int, Socket, HttpHost, InetSocketAddress, InetSocketAddress, HttpContext) throws IOException

## Package: org.apache.http.conn.ssl

### Class: org.apache.http.conn.ssl.PrivateKeyStrategy
Type: Interface

Methods:
- String chooseAlias(Map<String, PrivateKeyDetails>, Socket)

### Class: org.apache.http.conn.ssl.TrustStrategy
Type: Interface
Implements: org.apache.http.ssl.TrustStrategy

No public methods found

### Class: org.apache.http.conn.ssl.X509HostnameVerifier
Type: Interface
Implements: javax.net.ssl.HostnameVerifier

Methods:
- void verify(String, SSLSocket) throws IOException
- void verify(String, X509Certificate) throws SSLException
- void verify(String, String[], String[]) throws SSLException

### Class: org.apache.http.conn.ssl.AbstractVerifier
Type: Abstract Class
Implements: org.apache.http.conn.ssl.X509HostnameVerifier

Methods:
- **static** int countDots(String)
- **static** String[] getDNSSubjectAlts(X509Certificate)
- void verify(String, SSLSocket) throws IOException
- boolean verify(String, SSLSession)
- void verify(String, X509Certificate) throws SSLException
- void verify(String, String[], String[], boolean) throws SSLException
- **static** String[] getCNs(X509Certificate)
- **static** boolean acceptableCountryWildcard(String)

### Class: org.apache.http.conn.ssl.AllowAllHostnameVerifier
Type: Class
Extends: org.apache.http.conn.ssl.AbstractVerifier

Methods:
- void verify(String, String[], String[])
- String toString()

### Class: org.apache.http.conn.ssl.BrowserCompatHostnameVerifier
Type: Class
Extends: org.apache.http.conn.ssl.AbstractVerifier

Methods:
- void verify(String, String[], String[]) throws SSLException
- String toString()

### Class: org.apache.http.conn.ssl.DefaultHostnameVerifier
Type: Class
Implements: javax.net.ssl.HostnameVerifier

Methods:
- boolean verify(String, SSLSession)
- void verify(String, X509Certificate) throws SSLException

### Class: org.apache.http.conn.ssl.NoopHostnameVerifier
Type: Class
Implements: javax.net.ssl.HostnameVerifier

Methods:
- boolean verify(String, SSLSession)
- String toString()

### Class: org.apache.http.conn.ssl.PrivateKeyDetails
Type: Class

Methods:
- X509Certificate[] getCertChain()
- String getType()
- String toString()

### Class: org.apache.http.conn.ssl.SSLConnectionSocketFactory
Type: Class
Implements: org.apache.http.conn.socket.LayeredConnectionSocketFactory

Methods:
- **static** SSLConnectionSocketFactory getSocketFactory() throws SSLInitializationException
- Socket createLayeredSocket(Socket, String, int, HttpContext) throws IOException
- Socket createSocket(HttpContext) throws IOException
- Socket connectSocket(int, Socket, HttpHost, InetSocketAddress, InetSocketAddress, HttpContext) throws IOException
- **static** SSLConnectionSocketFactory getSystemSocketFactory() throws SSLInitializationException
- **static** HostnameVerifier getDefaultHostnameVerifier()

### Class: org.apache.http.conn.ssl.SSLContextBuilder
Type: Class

Methods:
- SSLContext build() throws NoSuchAlgorithmException, KeyManagementException
- SSLContextBuilder loadKeyMaterial(KeyStore, char[]) throws NoSuchAlgorithmException, KeyStoreException, UnrecoverableKeyException
- SSLContextBuilder loadKeyMaterial(KeyStore, char[], PrivateKeyStrategy) throws NoSuchAlgorithmException, KeyStoreException, UnrecoverableKeyException
- SSLContextBuilder loadTrustMaterial(KeyStore, TrustStrategy) throws NoSuchAlgorithmException, KeyStoreException
- SSLContextBuilder loadTrustMaterial(KeyStore) throws NoSuchAlgorithmException, KeyStoreException
- SSLContextBuilder useProtocol(String)
- SSLContextBuilder setSecureRandom(SecureRandom)
- SSLContextBuilder useTLS()
- SSLContextBuilder useSSL()

### Class: org.apache.http.conn.ssl.SSLContexts
Type: Class

Methods:
- **static** SSLContext createSystemDefault() throws SSLInitializationException
- **static** SSLContextBuilder custom()
- **static** SSLContext createDefault() throws SSLInitializationException

### Class: org.apache.http.conn.ssl.SSLInitializationException
Type: Class
Extends: java.lang.IllegalStateException

No public methods found

### Class: org.apache.http.conn.ssl.SSLSocketFactory
Type: Class
Implements: org.apache.http.conn.socket.LayeredConnectionSocketFactory, org.apache.http.conn.scheme.SchemeLayeredSocketFactory, org.apache.http.conn.scheme.LayeredSchemeSocketFactory, org.apache.http.conn.scheme.LayeredSocketFactory

Methods:
- **static** SSLSocketFactory getSocketFactory() throws SSLInitializationException
- Socket createLayeredSocket(Socket, String, int, HttpParams) throws IOException, UnknownHostException
- Socket createLayeredSocket(Socket, String, int, boolean) throws IOException, UnknownHostException
- Socket createLayeredSocket(Socket, String, int, HttpContext) throws IOException
- Socket createSocket(HttpParams) throws IOException
- Socket createSocket() throws IOException
- Socket createSocket(Socket, String, int, boolean) throws IOException, UnknownHostException
- Socket createSocket(HttpContext) throws IOException
- Socket connectSocket(Socket, InetSocketAddress, InetSocketAddress, HttpParams) throws IOException, UnknownHostException, ConnectTimeoutException
- Socket connectSocket(Socket, String, int, InetAddress, int, HttpParams) throws IOException, UnknownHostException, ConnectTimeoutException
- Socket connectSocket(int, Socket, HttpHost, InetSocketAddress, InetSocketAddress, HttpContext) throws IOException
- X509HostnameVerifier getHostnameVerifier()
- **static** SSLSocketFactory getSystemSocketFactory() throws SSLInitializationException
- boolean isSecure(Socket) throws IllegalArgumentException
- void setHostnameVerifier(X509HostnameVerifier)

### Class: org.apache.http.conn.ssl.StrictHostnameVerifier
Type: Class
Extends: org.apache.http.conn.ssl.AbstractVerifier

Methods:
- void verify(String, String[], String[]) throws SSLException
- String toString()

### Class: org.apache.http.conn.ssl.TrustAllStrategy
Type: Class
Implements: org.apache.http.conn.ssl.TrustStrategy

Methods:
- boolean isTrusted(X509Certificate[], String) throws CertificateException

### Class: org.apache.http.conn.ssl.TrustSelfSignedStrategy
Type: Class
Implements: org.apache.http.conn.ssl.TrustStrategy

Methods:
- boolean isTrusted(X509Certificate[], String) throws CertificateException

## Package: org.apache.http.conn.util

### Class: org.apache.http.conn.util.DnsUtils
Type: Class

Methods:
- **static** String normalize(String)

### Class: org.apache.http.conn.util.DomainType
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- UNKNOWN
- ICANN
- PRIVATE

Methods:
- **static** DomainType valueOf(String)
- **static** DomainType[] values()

### Class: org.apache.http.conn.util.InetAddressUtils
Type: Class

Methods:
- **static** boolean isIPv6Address(String)
- **static** boolean isIPv4Address(String)
- **static** boolean isIPv4MappedIPv64Address(String)
- **static** boolean isIPv6HexCompressedAddress(String)
- **static** boolean isIPv6StdAddress(String)

### Class: org.apache.http.conn.util.PublicSuffixList
Type: Class

Methods:
- List<String> getExceptions()
- DomainType getType()
- List<String> getRules()

### Class: org.apache.http.conn.util.PublicSuffixListParser
Type: Class

Methods:
- PublicSuffixList parse(Reader) throws IOException
- List<PublicSuffixList> parseByType(Reader) throws IOException

### Class: org.apache.http.conn.util.PublicSuffixMatcher
Type: Class

Methods:
- String getDomainRoot(String)
- String getDomainRoot(String, DomainType)
- boolean matches(String)
- boolean matches(String, DomainType)

### Class: org.apache.http.conn.util.PublicSuffixMatcherLoader
Type: Class

Methods:
- **static** PublicSuffixMatcher load(URL) throws IOException
- **static** PublicSuffixMatcher load(File) throws IOException
- **static** PublicSuffixMatcher getDefault()

## Package: org.apache.http.cookie

### Class: org.apache.http.cookie.ClientCookie
Type: Interface
Implements: org.apache.http.cookie.Cookie

Methods:
- String getAttribute(String)
- boolean containsAttribute(String)

### Class: org.apache.http.cookie.CommonCookieAttributeHandler
Type: Interface
Implements: org.apache.http.cookie.CookieAttributeHandler

Methods:
- String getAttributeName()

### Class: org.apache.http.cookie.Cookie
Type: Interface

Methods:
- int getVersion()
- int[] getPorts()
- String getDomain()
- String getValue()
- String getName()
- Date getExpiryDate()
- boolean isPersistent()
- String getPath()
- boolean isSecure()
- String getComment()
- boolean isExpired(Date)
- String getCommentURL()

### Class: org.apache.http.cookie.CookieAttributeHandler
Type: Interface

Methods:
- boolean match(Cookie, CookieOrigin)
- void parse(SetCookie, String) throws MalformedCookieException
- void validate(Cookie, CookieOrigin) throws MalformedCookieException

### Class: org.apache.http.cookie.CookieSpec
Type: Interface

Methods:
- List<Header> formatCookies(List<Cookie>)
- int getVersion()
- Header getVersionHeader()
- boolean match(Cookie, CookieOrigin)
- List<Cookie> parse(Header, CookieOrigin) throws MalformedCookieException
- void validate(Cookie, CookieOrigin) throws MalformedCookieException

### Class: org.apache.http.cookie.CookieSpecFactory
Type: Interface

Methods:
- CookieSpec newInstance(HttpParams)

### Class: org.apache.http.cookie.CookieSpecProvider
Type: Interface

Methods:
- CookieSpec create(HttpContext)

### Class: org.apache.http.cookie.SM
Type: Interface

No public methods found

### Class: org.apache.http.cookie.SetCookie
Type: Interface
Implements: org.apache.http.cookie.Cookie

Methods:
- void setVersion(int)
- void setExpiryDate(Date)
- void setDomain(String)
- void setValue(String)
- void setPath(String)
- void setComment(String)
- void setSecure(boolean)

### Class: org.apache.http.cookie.SetCookie2
Type: Interface
Implements: org.apache.http.cookie.SetCookie

Methods:
- void setDiscard(boolean)
- void setPorts(int[])
- void setCommentURL(String)

### Class: org.apache.http.cookie.CookieIdentityComparator
Type: Class
Implements: java.io.Serializable, java.util.Comparator

Methods:
- int compare(Cookie, Cookie)
- int compare(Object, Object)

### Class: org.apache.http.cookie.CookieOrigin
Type: Class

Methods:
- int getPort()
- String getPath()
- boolean isSecure()
- String toString()
- String getHost()

### Class: org.apache.http.cookie.CookiePathComparator
Type: Class
Implements: java.io.Serializable, java.util.Comparator

Methods:
- int compare(Cookie, Cookie)
- int compare(Object, Object)

### Class: org.apache.http.cookie.CookiePriorityComparator
Type: Class
Implements: java.util.Comparator

Methods:
- int compare(Cookie, Cookie)
- int compare(Object, Object)

### Class: org.apache.http.cookie.CookieRestrictionViolationException
Type: Class
Extends: org.apache.http.cookie.MalformedCookieException

No public methods found

### Class: org.apache.http.cookie.CookieSpecRegistry
Type: Class
Implements: org.apache.http.config.Lookup

Methods:
- CookieSpecProvider lookup(String)
- Object lookup(String)
- CookieSpec getCookieSpec(String, HttpParams) throws IllegalStateException
- CookieSpec getCookieSpec(String) throws IllegalStateException
- V setItems(Map<String, CookieSpecFactory>)
- void unregister(String)
- List<String> getSpecNames()
- void register(String, CookieSpecFactory)

### Class: org.apache.http.cookie.MalformedCookieException
Type: Class
Extends: org.apache.http.ProtocolException

No public methods found

## Package: org.apache.http.cookie.params

### Class: org.apache.http.cookie.params.CookieSpecPNames
Type: Interface

No public methods found

### Class: org.apache.http.cookie.params.CookieSpecParamBean
Type: Class
Extends: org.apache.http.params.HttpAbstractParamBean

Methods:
- void setSingleHeader(boolean)
- V setDatePatterns(Collection<String>)

## Package: org.apache.http.entity

### Class: org.apache.http.entity.ContentLengthStrategy
Type: Interface

Methods:
- long determineLength(HttpMessage) throws HttpException

### Class: org.apache.http.entity.ContentProducer
Type: Interface

Methods:
- void writeTo(OutputStream) throws IOException

### Class: org.apache.http.entity.AbstractHttpEntity
Type: Abstract Class
Implements: org.apache.http.HttpEntity

Methods:
- Header getContentEncoding()
- boolean isChunked()
- void setContentEncoding(Header)
- void setContentEncoding(String)
- void setChunked(boolean)
- Header getContentType()
- String toString()
- void setContentType(Header)
- void setContentType(String)
- void consumeContent() throws IOException

### Class: org.apache.http.entity.BasicHttpEntity
Type: Class
Extends: org.apache.http.entity.AbstractHttpEntity

Methods:
- void writeTo(OutputStream) throws IOException
- boolean isRepeatable()
- void setContent(InputStream)
- boolean isStreaming()
- void setContentLength(long)
- InputStream getContent() throws IllegalStateException
- long getContentLength()

### Class: org.apache.http.entity.BufferedHttpEntity
Type: Class
Extends: org.apache.http.entity.HttpEntityWrapper

Methods:
- void writeTo(OutputStream) throws IOException
- boolean isRepeatable()
- boolean isChunked()
- boolean isStreaming()
- InputStream getContent() throws IOException
- long getContentLength()

### Class: org.apache.http.entity.ByteArrayEntity
Type: Class
Extends: org.apache.http.entity.AbstractHttpEntity
Implements: java.lang.Cloneable

Methods:
- void writeTo(OutputStream) throws IOException
- boolean isRepeatable()
- boolean isStreaming()
- InputStream getContent()
- Object clone() throws CloneNotSupportedException
- long getContentLength()

### Class: org.apache.http.entity.ContentType
Type: Class
Implements: java.io.Serializable

Methods:
- **static** ContentType getOrDefault(HttpEntity) throws ParseException, UnsupportedCharsetException
- String getMimeType()
- ContentType withCharset(Charset)
- ContentType withCharset(String)
- **static** ContentType getLenient(HttpEntity)
- ContentType withParameters(NameValuePair[]) throws UnsupportedCharsetException
- **static** ContentType get(HttpEntity) throws ParseException, UnsupportedCharsetException
- **static** ContentType create(String, Charset)
- **static** ContentType create(String)
- **static** ContentType create(String, String) throws UnsupportedCharsetException
- **static** ContentType create(String, NameValuePair[]) throws UnsupportedCharsetException
- String toString()
- **static** ContentType parse(String) throws ParseException, UnsupportedCharsetException
- Charset getCharset()
- **static** ContentType getByMimeType(String)
- **static** ContentType getLenientOrDefault(HttpEntity) throws ParseException, UnsupportedCharsetException
- String getParameter(String)

### Class: org.apache.http.entity.EntityTemplate
Type: Class
Extends: org.apache.http.entity.AbstractHttpEntity

Methods:
- void writeTo(OutputStream) throws IOException
- boolean isRepeatable()
- boolean isStreaming()
- InputStream getContent() throws IOException
- long getContentLength()

### Class: org.apache.http.entity.FileEntity
Type: Class
Extends: org.apache.http.entity.AbstractHttpEntity
Implements: java.lang.Cloneable

Methods:
- void writeTo(OutputStream) throws IOException
- boolean isRepeatable()
- boolean isStreaming()
- InputStream getContent() throws IOException
- Object clone() throws CloneNotSupportedException
- long getContentLength()

### Class: org.apache.http.entity.HttpEntityWrapper
Type: Class
Implements: org.apache.http.HttpEntity

Methods:
- void writeTo(OutputStream) throws IOException
- Header getContentEncoding()
- boolean isRepeatable()
- boolean isChunked()
- boolean isStreaming()
- InputStream getContent() throws IOException
- Header getContentType()
- long getContentLength()
- void consumeContent() throws IOException

### Class: org.apache.http.entity.InputStreamEntity
Type: Class
Extends: org.apache.http.entity.AbstractHttpEntity

Methods:
- void writeTo(OutputStream) throws IOException
- boolean isRepeatable()
- boolean isStreaming()
- InputStream getContent() throws IOException
- long getContentLength()

### Class: org.apache.http.entity.SerializableEntity
Type: Class
Extends: org.apache.http.entity.AbstractHttpEntity

Methods:
- void writeTo(OutputStream) throws IOException
- boolean isRepeatable()
- boolean isStreaming()
- InputStream getContent() throws IOException, IllegalStateException
- long getContentLength()

### Class: org.apache.http.entity.StringEntity
Type: Class
Extends: org.apache.http.entity.AbstractHttpEntity
Implements: java.lang.Cloneable

Methods:
- void writeTo(OutputStream) throws IOException
- boolean isRepeatable()
- boolean isStreaming()
- InputStream getContent() throws IOException
- Object clone() throws CloneNotSupportedException
- long getContentLength()

## Package: org.apache.http.impl

### Class: org.apache.http.impl.AbstractHttpClientConnection
Type: Abstract Class
Implements: org.apache.http.HttpClientConnection

Methods:
- void flush() throws IOException
- HttpConnectionMetrics getMetrics()
- boolean isResponseAvailable(int) throws IOException
- boolean isStale()
- HttpResponse receiveResponseHeader() throws HttpException, IOException
- void sendRequestEntity(HttpEntityEnclosingRequest) throws HttpException, IOException
- void receiveResponseEntity(HttpResponse) throws HttpException, IOException
- void sendRequestHeader(HttpRequest) throws HttpException, IOException

### Class: org.apache.http.impl.AbstractHttpServerConnection
Type: Abstract Class
Implements: org.apache.http.HttpServerConnection

Methods:
- void receiveRequestEntity(HttpEntityEnclosingRequest) throws HttpException, IOException
- void flush() throws IOException
- HttpConnectionMetrics getMetrics()
- void sendResponseEntity(HttpResponse) throws HttpException, IOException
- void sendResponseHeader(HttpResponse) throws HttpException, IOException
- boolean isStale()
- HttpRequest receiveRequestHeader() throws HttpException, IOException

### Class: org.apache.http.impl.BHttpConnectionBase
Type: Class
Implements: org.apache.http.HttpInetConnection

Methods:
- void setSocketTimeout(int)
- int getLocalPort()
- boolean isOpen()
- HttpConnectionMetrics getMetrics()
- InetAddress getRemoteAddress()
- String toString()
- boolean isStale()
- void close() throws IOException
- int getSocketTimeout()
- int getRemotePort()
- void shutdown() throws IOException
- InetAddress getLocalAddress()

### Class: org.apache.http.impl.ConnSupport
Type: Class

Methods:
- **static** CharsetEncoder createEncoder(ConnectionConfig)
- **static** CharsetDecoder createDecoder(ConnectionConfig)

### Class: org.apache.http.impl.DefaultBHttpClientConnection
Type: Class
Extends: org.apache.http.impl.BHttpConnectionBase
Implements: org.apache.http.HttpClientConnection

Methods:
- void bind(Socket) throws IOException
- void flush() throws IOException
- boolean isResponseAvailable(int) throws IOException
- HttpResponse receiveResponseHeader() throws HttpException, IOException
- void sendRequestEntity(HttpEntityEnclosingRequest) throws HttpException, IOException
- void receiveResponseEntity(HttpResponse) throws HttpException, IOException
- void sendRequestHeader(HttpRequest) throws HttpException, IOException

### Class: org.apache.http.impl.DefaultBHttpClientConnectionFactory
Type: Class
Implements: org.apache.http.HttpConnectionFactory

Methods:
- DefaultBHttpClientConnection createConnection(Socket) throws IOException
- HttpConnection createConnection(Socket) throws IOException

### Class: org.apache.http.impl.DefaultBHttpServerConnection
Type: Class
Extends: org.apache.http.impl.BHttpConnectionBase
Implements: org.apache.http.HttpServerConnection

Methods:
- void receiveRequestEntity(HttpEntityEnclosingRequest) throws HttpException, IOException
- void bind(Socket) throws IOException
- void flush() throws IOException
- void sendResponseEntity(HttpResponse) throws HttpException, IOException
- void sendResponseHeader(HttpResponse) throws HttpException, IOException
- HttpRequest receiveRequestHeader() throws HttpException, IOException

### Class: org.apache.http.impl.DefaultBHttpServerConnectionFactory
Type: Class
Implements: org.apache.http.HttpConnectionFactory

Methods:
- DefaultBHttpServerConnection createConnection(Socket) throws IOException
- HttpConnection createConnection(Socket) throws IOException

### Class: org.apache.http.impl.DefaultConnectionReuseStrategy
Type: Class
Implements: org.apache.http.ConnectionReuseStrategy

Methods:
- boolean keepAlive(HttpResponse, HttpContext)

### Class: org.apache.http.impl.DefaultHttpClientConnection
Type: Class
Extends: org.apache.http.impl.SocketHttpClientConnection

Methods:
- void bind(Socket, HttpParams) throws IOException

### Class: org.apache.http.impl.DefaultHttpRequestFactory
Type: Class
Implements: org.apache.http.HttpRequestFactory

Methods:
- HttpRequest newHttpRequest(RequestLine) throws MethodNotSupportedException
- HttpRequest newHttpRequest(String, String) throws MethodNotSupportedException

### Class: org.apache.http.impl.DefaultHttpResponseFactory
Type: Class
Implements: org.apache.http.HttpResponseFactory

Methods:
- HttpResponse newHttpResponse(ProtocolVersion, int, HttpContext)
- HttpResponse newHttpResponse(StatusLine, HttpContext)

### Class: org.apache.http.impl.DefaultHttpServerConnection
Type: Class
Extends: org.apache.http.impl.SocketHttpServerConnection

Methods:
- void bind(Socket, HttpParams) throws IOException

### Class: org.apache.http.impl.EnglishReasonPhraseCatalog
Type: Class
Implements: org.apache.http.ReasonPhraseCatalog

Methods:
- String getReason(int, Locale)

### Class: org.apache.http.impl.HttpConnectionMetricsImpl
Type: Class
Implements: org.apache.http.HttpConnectionMetrics

Methods:
- void setMetric(String, Object)
- long getRequestCount()
- void incrementRequestCount()
- void reset()
- long getSentBytesCount()
- long getReceivedBytesCount()
- Object getMetric(String)
- long getResponseCount()
- void incrementResponseCount()

### Class: org.apache.http.impl.NoConnectionReuseStrategy
Type: Class
Implements: org.apache.http.ConnectionReuseStrategy

Methods:
- boolean keepAlive(HttpResponse, HttpContext)

### Class: org.apache.http.impl.SocketHttpClientConnection
Type: Class
Extends: org.apache.http.impl.AbstractHttpClientConnection
Implements: org.apache.http.HttpInetConnection

Methods:
- void setSocketTimeout(int)
- int getLocalPort()
- boolean isOpen()
- InetAddress getRemoteAddress()
- String toString()
- void close() throws IOException
- int getSocketTimeout()
- int getRemotePort()
- void shutdown() throws IOException
- InetAddress getLocalAddress()

### Class: org.apache.http.impl.SocketHttpServerConnection
Type: Class
Extends: org.apache.http.impl.AbstractHttpServerConnection
Implements: org.apache.http.HttpInetConnection

Methods:
- void setSocketTimeout(int)
- int getLocalPort()
- boolean isOpen()
- InetAddress getRemoteAddress()
- String toString()
- void close() throws IOException
- int getSocketTimeout()
- int getRemotePort()
- void shutdown() throws IOException
- InetAddress getLocalAddress()

## Package: org.apache.http.impl.auth

### Class: org.apache.http.impl.auth.NTLMEngine
Type: Interface

Methods:
- String generateType3Msg(String, String, String, String, String) throws NTLMEngineException
- String generateType1Msg(String, String) throws NTLMEngineException

### Class: org.apache.http.impl.auth.SpnegoTokenGenerator
Type: Interface

Methods:
- byte[] generateSpnegoDERObject(byte[]) throws IOException

### Class: org.apache.http.impl.auth.AuthSchemeBase
Type: Abstract Class
Implements: org.apache.http.auth.ContextAwareAuthScheme

Methods:
- Header authenticate(Credentials, HttpRequest, HttpContext) throws AuthenticationException
- ChallengeState getChallengeState()
- String toString()
- boolean isProxy()
- void processChallenge(Header) throws MalformedChallengeException

### Class: org.apache.http.impl.auth.BasicScheme
Type: Class
Extends: org.apache.http.impl.auth.RFC2617Scheme

Methods:
- Header authenticate(Credentials, HttpRequest) throws AuthenticationException
- Header authenticate(Credentials, HttpRequest, HttpContext) throws AuthenticationException
- **static** Header authenticate(Credentials, String, boolean)
- boolean isConnectionBased()
- String toString()
- void processChallenge(Header) throws MalformedChallengeException
- boolean isComplete()
- String getSchemeName()

### Class: org.apache.http.impl.auth.BasicSchemeFactory
Type: Class
Implements: org.apache.http.auth.AuthSchemeFactory, org.apache.http.auth.AuthSchemeProvider

Methods:
- AuthScheme create(HttpContext)
- AuthScheme newInstance(HttpParams)

### Class: org.apache.http.impl.auth.DigestScheme
Type: Class
Extends: org.apache.http.impl.auth.RFC2617Scheme

Methods:
- void overrideParamter(String, String)
- Header authenticate(Credentials, HttpRequest) throws AuthenticationException
- Header authenticate(Credentials, HttpRequest, HttpContext) throws AuthenticationException
- boolean isConnectionBased()
- String toString()
- void processChallenge(Header) throws MalformedChallengeException
- **static** String createCnonce()
- String getSchemeName()
- boolean isComplete()

### Class: org.apache.http.impl.auth.DigestSchemeFactory
Type: Class
Implements: org.apache.http.auth.AuthSchemeFactory, org.apache.http.auth.AuthSchemeProvider

Methods:
- AuthScheme create(HttpContext)
- AuthScheme newInstance(HttpParams)

### Class: org.apache.http.impl.auth.GGSSchemeBase
Type: Abstract Class
Extends: org.apache.http.impl.auth.AuthSchemeBase

Methods:
- Header authenticate(Credentials, HttpRequest) throws AuthenticationException
- Header authenticate(Credentials, HttpRequest, HttpContext) throws AuthenticationException
- boolean isComplete()

### Class: org.apache.http.impl.auth.HttpAuthenticator
Type: Class

Methods:
- boolean handleAuthChallenge(HttpHost, HttpResponse, AuthenticationStrategy, AuthState, HttpContext)
- void generateAuthResponse(HttpRequest, AuthState, HttpContext) throws HttpException, IOException
- boolean isAuthenticationRequested(HttpHost, HttpResponse, AuthenticationStrategy, AuthState, HttpContext)

### Class: org.apache.http.impl.auth.KerberosScheme
Type: Class
Extends: org.apache.http.impl.auth.GGSSchemeBase

Methods:
- Header authenticate(Credentials, HttpRequest, HttpContext) throws AuthenticationException
- boolean isConnectionBased()
- String getRealm()
- String getParameter(String)
- String getSchemeName()

### Class: org.apache.http.impl.auth.KerberosSchemeFactory
Type: Class
Implements: org.apache.http.auth.AuthSchemeFactory, org.apache.http.auth.AuthSchemeProvider

Methods:
- boolean isUseCanonicalHostname()
- boolean isStripPort()
- AuthScheme create(HttpContext)
- AuthScheme newInstance(HttpParams)

### Class: org.apache.http.impl.auth.NTLMEngineException
Type: Class
Extends: org.apache.http.auth.AuthenticationException

No public methods found

### Class: org.apache.http.impl.auth.NTLMEngineImpl$CipherGen
Type: Class

Methods:
- byte[] getLMv2Response() throws NTLMEngineException
- byte[] getSecondaryKey() throws NTLMEngineException
- byte[] getLMHash() throws NTLMEngineException
- byte[] getNTLMv2UserSessionKey() throws NTLMEngineException
- byte[] getLMUserSessionKey() throws NTLMEngineException
- byte[] getNTLMv2Response() throws NTLMEngineException
- byte[] getClientChallenge2() throws NTLMEngineException
- byte[] getNTLM2SessionResponseUserSessionKey() throws NTLMEngineException
- byte[] getNTLMv2Blob() throws NTLMEngineException
- byte[] getNTLM2SessionResponse() throws NTLMEngineException
- byte[] getLanManagerSessionKey() throws NTLMEngineException
- byte[] getNTLMUserSessionKey() throws NTLMEngineException
- byte[] getLM2SessionResponse() throws NTLMEngineException
- byte[] getTimestamp()
- byte[] getLMv2Hash() throws NTLMEngineException
- byte[] getNTLMResponse() throws NTLMEngineException
- byte[] getLMResponse() throws NTLMEngineException
- byte[] getClientChallenge() throws NTLMEngineException
- byte[] getNTLMv2Hash() throws NTLMEngineException
- byte[] getNTLMHash() throws NTLMEngineException

### Class: org.apache.http.impl.auth.NTLMScheme
Type: Class
Extends: org.apache.http.impl.auth.AuthSchemeBase

Methods:
- Header authenticate(Credentials, HttpRequest) throws AuthenticationException
- boolean isConnectionBased()
- String getRealm()
- boolean isComplete()
- String getParameter(String)
- String getSchemeName()

### Class: org.apache.http.impl.auth.NTLMSchemeFactory
Type: Class
Implements: org.apache.http.auth.AuthSchemeFactory, org.apache.http.auth.AuthSchemeProvider

Methods:
- AuthScheme create(HttpContext)
- AuthScheme newInstance(HttpParams)

### Class: org.apache.http.impl.auth.NegotiateScheme
Type: Class
Extends: org.apache.http.impl.auth.GGSSchemeBase

Methods:
- Header authenticate(Credentials, HttpRequest) throws AuthenticationException
- Header authenticate(Credentials, HttpRequest, HttpContext) throws AuthenticationException
- boolean isConnectionBased()
- String getRealm()
- String getParameter(String)
- String getSchemeName()

### Class: org.apache.http.impl.auth.NegotiateSchemeFactory
Type: Class
Implements: org.apache.http.auth.AuthSchemeFactory

Methods:
- SpnegoTokenGenerator getSpengoGenerator()
- boolean isStripPort()
- AuthScheme newInstance(HttpParams)

### Class: org.apache.http.impl.auth.RFC2617Scheme
Type: Abstract Class
Extends: org.apache.http.impl.auth.AuthSchemeBase
Implements: java.io.Serializable

Methods:
- Charset getCredentialsCharset()
- String getRealm()
- String getParameter(String)

### Class: org.apache.http.impl.auth.SPNegoScheme
Type: Class
Extends: org.apache.http.impl.auth.GGSSchemeBase

Methods:
- Header authenticate(Credentials, HttpRequest, HttpContext) throws AuthenticationException
- boolean isConnectionBased()
- String getRealm()
- String getParameter(String)
- String getSchemeName()

### Class: org.apache.http.impl.auth.SPNegoSchemeFactory
Type: Class
Implements: org.apache.http.auth.AuthSchemeFactory, org.apache.http.auth.AuthSchemeProvider

Methods:
- boolean isUseCanonicalHostname()
- boolean isStripPort()
- AuthScheme create(HttpContext)
- AuthScheme newInstance(HttpParams)

### Class: org.apache.http.impl.auth.UnsupportedDigestAlgorithmException
Type: Class
Extends: java.lang.RuntimeException

No public methods found

## Package: org.apache.http.impl.bootstrap

### Class: org.apache.http.impl.bootstrap.SSLServerSetupHandler
Type: Interface

Methods:
- void initialize(SSLServerSocket) throws SSLException

### Class: org.apache.http.impl.bootstrap.HttpServer
Type: Class

Methods:
- InetAddress getInetAddress()
- int getLocalPort()
- void stop()
- void start() throws IOException
- void awaitTermination(long, TimeUnit) throws InterruptedException
- void shutdown(long, TimeUnit)

### Class: org.apache.http.impl.bootstrap.ServerBootstrap
Type: Class

Methods:
- ServerBootstrap setServerSocketFactory(ServerSocketFactory)
- ServerBootstrap setExpectationVerifier(HttpExpectationVerifier)
- ServerBootstrap addInterceptorLast(HttpResponseInterceptor)
- ServerBootstrap addInterceptorLast(HttpRequestInterceptor)
- ServerBootstrap setExceptionLogger(ExceptionLogger)
- ServerBootstrap setSslContext(SSLContext)
- ServerBootstrap setHandlerMapper(HttpRequestHandlerMapper)
- ServerBootstrap setHttpProcessor(HttpProcessor)
- **static** ServerBootstrap bootstrap()
- ServerBootstrap setConnectionConfig(ConnectionConfig)
- ServerBootstrap setSslSetupHandler(SSLServerSetupHandler)
- ServerBootstrap setConnectionFactory(HttpConnectionFactory<DefaultBHttpServerConnection>)
- ServerBootstrap registerHandler(String, HttpRequestHandler)
- ServerBootstrap setLocalAddress(InetAddress)
- ServerBootstrap addInterceptorFirst(HttpResponseInterceptor)
- ServerBootstrap addInterceptorFirst(HttpRequestInterceptor)
- ServerBootstrap setListenerPort(int)
- ServerBootstrap setResponseFactory(HttpResponseFactory)
- ServerBootstrap setSocketConfig(SocketConfig)
- HttpServer create()
- ServerBootstrap setServerInfo(String)
- ServerBootstrap setConnectionReuseStrategy(ConnectionReuseStrategy)

## Package: org.apache.http.impl.client

### Class: org.apache.http.impl.client.AIMDBackoffManager
Type: Class
Implements: org.apache.http.client.BackoffManager

Methods:
- void backOff(HttpRoute)
- void setPerHostConnectionCap(int)
- void setCooldownMillis(long)
- void setBackoffFactor(double)
- void probe(HttpRoute)

### Class: org.apache.http.impl.client.AbstractAuthenticationHandler
Type: Abstract Class
Implements: org.apache.http.client.AuthenticationHandler

Methods:
- AuthScheme selectScheme(Map<String, Header>, HttpResponse, HttpContext) throws AuthenticationException

### Class: org.apache.http.impl.client.AbstractHttpClient
Type: Abstract Class
Extends: org.apache.http.impl.client.CloseableHttpClient

Methods:
- RedirectStrategy getRedirectStrategy()
- void setRedirectHandler(RedirectHandler)
- void setCookieStore(CookieStore)
- V removeResponseInterceptorByClass(Class<HttpResponseInterceptor>)
- void setAuthSchemes(AuthSchemeRegistry)
- void setProxyAuthenticationHandler(AuthenticationHandler)
- void setTargetAuthenticationHandler(AuthenticationHandler)
- void clearResponseInterceptors()
- int getResponseInterceptorCount()
- void setCredentialsProvider(CredentialsProvider)
- void setCookieSpecs(CookieSpecRegistry)
- void addRequestInterceptor(HttpRequestInterceptor)
- void addRequestInterceptor(HttpRequestInterceptor, int)
- void setTargetAuthenticationStrategy(AuthenticationStrategy)
- ConnectionBackoffStrategy getConnectionBackoffStrategy()
- CredentialsProvider getCredentialsProvider()
- void setRedirectStrategy(RedirectStrategy)
- HttpRoutePlanner getRoutePlanner()
- AuthenticationHandler getTargetAuthenticationHandler()
- void setReuseStrategy(ConnectionReuseStrategy)
- BackoffManager getBackoffManager()
- HttpResponseInterceptor getResponseInterceptor(int)
- ConnectionReuseStrategy getConnectionReuseStrategy()
- void setConnectionBackoffStrategy(ConnectionBackoffStrategy)
- HttpRequestRetryHandler getHttpRequestRetryHandler()
- void addResponseInterceptor(HttpResponseInterceptor)
- void addResponseInterceptor(HttpResponseInterceptor, int)
- void close()
- void setBackoffManager(BackoffManager)
- CookieStore getCookieStore()
- void setProxyAuthenticationStrategy(AuthenticationStrategy)
- ConnectionKeepAliveStrategy getConnectionKeepAliveStrategy()
- CookieSpecRegistry getCookieSpecs()
- void setUserTokenHandler(UserTokenHandler)
- UserTokenHandler getUserTokenHandler()
- V removeRequestInterceptorByClass(Class<HttpRequestInterceptor>)
- void setKeepAliveStrategy(ConnectionKeepAliveStrategy)
- RedirectHandler getRedirectHandler()
- AuthenticationStrategy getTargetAuthenticationStrategy()
- AuthenticationHandler getProxyAuthenticationHandler()
- void clearRequestInterceptors()
- HttpRequestExecutor getRequestExecutor()
- ClientConnectionManager getConnectionManager()
- void setRoutePlanner(HttpRoutePlanner)
- AuthSchemeRegistry getAuthSchemes()
- HttpRequestInterceptor getRequestInterceptor(int)
- int getRequestInterceptorCount()
- HttpParams getParams()
- AuthenticationStrategy getProxyAuthenticationStrategy()
- void setHttpRequestRetryHandler(HttpRequestRetryHandler)
- void setParams(HttpParams)

### Class: org.apache.http.impl.client.AbstractResponseHandler
Type: Abstract Class
Implements: org.apache.http.client.ResponseHandler

Methods:
- TT handleResponse(HttpResponse) throws HttpResponseException, IOException
- TT handleEntity(HttpEntity) throws IOException

### Class: org.apache.http.impl.client.AutoRetryHttpClient
Type: Class
Implements: org.apache.http.client.HttpClient

Methods:
- ClientConnectionManager getConnectionManager()
- HttpResponse execute(HttpHost, HttpRequest) throws IOException
- TT execute(HttpHost, HttpRequest, ResponseHandler<+TT>) throws IOException
- TT execute(HttpHost, HttpRequest, ResponseHandler<+TT>, HttpContext) throws IOException
- HttpResponse execute(HttpUriRequest) throws IOException
- HttpResponse execute(HttpUriRequest, HttpContext) throws IOException
- TT execute(HttpUriRequest, ResponseHandler<+TT>) throws IOException
- TT execute(HttpUriRequest, ResponseHandler<+TT>, HttpContext) throws IOException
- HttpResponse execute(HttpHost, HttpRequest, HttpContext) throws IOException
- HttpParams getParams()

### Class: org.apache.http.impl.client.BasicAuthCache
Type: Class
Implements: org.apache.http.client.AuthCache

Methods:
- AuthScheme get(HttpHost)
- void clear()
- String toString()
- void remove(HttpHost)
- void put(HttpHost, AuthScheme)

### Class: org.apache.http.impl.client.BasicCookieStore
Type: Class
Implements: org.apache.http.client.CookieStore, java.io.Serializable

Methods:
- void addCookies(Cookie[])
- void addCookie(Cookie)
- boolean clearExpired(Date)
- List<Cookie> getCookies()
- void clear()
- String toString()

### Class: org.apache.http.impl.client.BasicCredentialsProvider
Type: Class
Implements: org.apache.http.client.CredentialsProvider

Methods:
- void clear()
- Credentials getCredentials(AuthScope)
- String toString()
- void setCredentials(AuthScope, Credentials)

### Class: org.apache.http.impl.client.BasicResponseHandler
Type: Class
Extends: org.apache.http.impl.client.AbstractResponseHandler

Methods:
- String handleResponse(HttpResponse) throws HttpResponseException, IOException
- Object handleResponse(HttpResponse) throws HttpResponseException, IOException
- String handleEntity(HttpEntity) throws IOException
- Object handleEntity(HttpEntity) throws IOException

### Class: org.apache.http.impl.client.ClientParamsStack
Type: Class
Extends: org.apache.http.params.AbstractHttpParams

Methods:
- HttpParams getRequestParams()
- HttpParams getClientParams()
- HttpParams getApplicationParams()
- HttpParams setParameter(String, Object) throws UnsupportedOperationException
- HttpParams copy()
- HttpParams getOverrideParams()
- boolean removeParameter(String)
- Object getParameter(String)

### Class: org.apache.http.impl.client.CloseableHttpClient
Type: Abstract Class
Implements: org.apache.http.client.HttpClient, java.io.Closeable

Methods:
- CloseableHttpResponse execute(HttpHost, HttpRequest, HttpContext) throws IOException, ClientProtocolException
- CloseableHttpResponse execute(HttpUriRequest, HttpContext) throws IOException, ClientProtocolException
- CloseableHttpResponse execute(HttpUriRequest) throws IOException, ClientProtocolException
- CloseableHttpResponse execute(HttpHost, HttpRequest) throws IOException, ClientProtocolException
- TT execute(HttpUriRequest, ResponseHandler<+TT>) throws IOException, ClientProtocolException
- TT execute(HttpUriRequest, ResponseHandler<+TT>, HttpContext) throws IOException, ClientProtocolException
- TT execute(HttpHost, HttpRequest, ResponseHandler<+TT>) throws IOException, ClientProtocolException
- TT execute(HttpHost, HttpRequest, ResponseHandler<+TT>, HttpContext) throws IOException, ClientProtocolException
- HttpResponse execute(HttpHost, HttpRequest, HttpContext) throws IOException, ClientProtocolException
- HttpResponse execute(HttpHost, HttpRequest) throws IOException, ClientProtocolException
- HttpResponse execute(HttpUriRequest, HttpContext) throws IOException, ClientProtocolException
- HttpResponse execute(HttpUriRequest) throws IOException, ClientProtocolException

### Class: org.apache.http.impl.client.ContentEncodingHttpClient
Type: Class
Extends: org.apache.http.impl.client.DefaultHttpClient

No public methods found

### Class: org.apache.http.impl.client.CookieSpecRegistries
Type: Class

Methods:
- **static** Lookup<CookieSpecProvider> createDefault()
- **static** Lookup<CookieSpecProvider> createDefault(PublicSuffixMatcher)
- **static** RegistryBuilder<CookieSpecProvider> createDefaultBuilder(PublicSuffixMatcher)
- **static** RegistryBuilder<CookieSpecProvider> createDefaultBuilder()

### Class: org.apache.http.impl.client.DecompressingHttpClient
Type: Class
Implements: org.apache.http.client.HttpClient

Methods:
- ClientConnectionManager getConnectionManager()
- HttpClient getHttpClient()
- HttpResponse execute(HttpUriRequest) throws IOException, ClientProtocolException
- HttpResponse execute(HttpUriRequest, HttpContext) throws IOException, ClientProtocolException
- HttpResponse execute(HttpHost, HttpRequest) throws IOException, ClientProtocolException
- HttpResponse execute(HttpHost, HttpRequest, HttpContext) throws IOException, ClientProtocolException
- TT execute(HttpUriRequest, ResponseHandler<+TT>) throws IOException, ClientProtocolException
- TT execute(HttpUriRequest, ResponseHandler<+TT>, HttpContext) throws IOException, ClientProtocolException
- TT execute(HttpHost, HttpRequest, ResponseHandler<+TT>) throws IOException, ClientProtocolException
- TT execute(HttpHost, HttpRequest, ResponseHandler<+TT>, HttpContext) throws IOException, ClientProtocolException
- HttpParams getParams()

### Class: org.apache.http.impl.client.DefaultBackoffStrategy
Type: Class
Implements: org.apache.http.client.ConnectionBackoffStrategy

Methods:
- boolean shouldBackoff(Throwable)
- boolean shouldBackoff(HttpResponse)

### Class: org.apache.http.impl.client.DefaultClientConnectionReuseStrategy
Type: Class
Extends: org.apache.http.impl.DefaultConnectionReuseStrategy

Methods:
- boolean keepAlive(HttpResponse, HttpContext)

### Class: org.apache.http.impl.client.DefaultConnectionKeepAliveStrategy
Type: Class
Implements: org.apache.http.conn.ConnectionKeepAliveStrategy

Methods:
- long getKeepAliveDuration(HttpResponse, HttpContext)

### Class: org.apache.http.impl.client.DefaultHttpClient
Type: Class
Extends: org.apache.http.impl.client.AbstractHttpClient

Methods:
- **static** void setDefaultHttpParams(HttpParams)

### Class: org.apache.http.impl.client.DefaultHttpRequestRetryHandler
Type: Class
Implements: org.apache.http.client.HttpRequestRetryHandler

Methods:
- boolean isRequestSentRetryEnabled()
- boolean retryRequest(IOException, int, HttpContext)
- int getRetryCount()

### Class: org.apache.http.impl.client.DefaultProxyAuthenticationHandler
Type: Class
Extends: org.apache.http.impl.client.AbstractAuthenticationHandler

Methods:
- Map<String, Header> getChallenges(HttpResponse, HttpContext) throws MalformedChallengeException
- boolean isAuthenticationRequested(HttpResponse, HttpContext)

### Class: org.apache.http.impl.client.DefaultRedirectHandler
Type: Class
Implements: org.apache.http.client.RedirectHandler

Methods:
- URI getLocationURI(HttpResponse, HttpContext) throws ProtocolException
- boolean isRedirectRequested(HttpResponse, HttpContext)

### Class: org.apache.http.impl.client.DefaultRedirectStrategy
Type: Class
Implements: org.apache.http.client.RedirectStrategy

Methods:
- URI getLocationURI(HttpRequest, HttpResponse, HttpContext) throws ProtocolException
- HttpUriRequest getRedirect(HttpRequest, HttpResponse, HttpContext) throws ProtocolException
- boolean isRedirected(HttpRequest, HttpResponse, HttpContext) throws ProtocolException

### Class: org.apache.http.impl.client.DefaultRequestDirector
Type: Class
Implements: org.apache.http.client.RequestDirector

Methods:
- HttpResponse execute(HttpHost, HttpRequest, HttpContext) throws HttpException, IOException

### Class: org.apache.http.impl.client.DefaultServiceUnavailableRetryStrategy
Type: Class
Implements: org.apache.http.client.ServiceUnavailableRetryStrategy

Methods:
- long getRetryInterval()
- boolean retryRequest(HttpResponse, int, HttpContext)

### Class: org.apache.http.impl.client.DefaultTargetAuthenticationHandler
Type: Class
Extends: org.apache.http.impl.client.AbstractAuthenticationHandler

Methods:
- Map<String, Header> getChallenges(HttpResponse, HttpContext) throws MalformedChallengeException
- boolean isAuthenticationRequested(HttpResponse, HttpContext)

### Class: org.apache.http.impl.client.DefaultUserTokenHandler
Type: Class
Implements: org.apache.http.client.UserTokenHandler

Methods:
- Object getUserToken(HttpContext)

### Class: org.apache.http.impl.client.EntityEnclosingRequestWrapper
Type: Class
Extends: org.apache.http.impl.client.RequestWrapper
Implements: org.apache.http.HttpEntityEnclosingRequest

Methods:
- boolean isRepeatable()
- boolean expectContinue()
- HttpEntity getEntity()
- void setEntity(HttpEntity)

### Class: org.apache.http.impl.client.FutureRequestExecutionMetrics
Type: Class

Methods:
- long getRequestAverageDuration()
- long getRequestCount()
- long getSuccessfulConnectionAverageDuration()
- long getTaskAverageDuration()
- String toString()
- long getSuccessfulConnectionCount()
- long getScheduledConnectionCount()
- long getActiveConnectionCount()
- long getTaskCount()
- long getFailedConnectionAverageDuration()
- long getFailedConnectionCount()

### Class: org.apache.http.impl.client.FutureRequestExecutionService
Type: Class
Implements: java.io.Closeable

Methods:
- FutureRequestExecutionMetrics metrics()
- void close() throws IOException
- HttpRequestFutureTask<TT> execute(HttpUriRequest, HttpContext, ResponseHandler<TT>)
- HttpRequestFutureTask<TT> execute(HttpUriRequest, HttpContext, ResponseHandler<TT>, FutureCallback<TT>)

### Class: org.apache.http.impl.client.HttpAuthenticator
Type: Class
Extends: org.apache.http.impl.auth.HttpAuthenticator

Methods:
- boolean authenticate(HttpHost, HttpResponse, AuthenticationStrategy, AuthState, HttpContext)

### Class: org.apache.http.impl.client.HttpClientBuilder
Type: Class

Methods:
- HttpClientBuilder setMaxConnTotal(int)
- HttpClientBuilder setDefaultRequestConfig(RequestConfig)
- HttpClientBuilder disableRedirectHandling()
- HttpClientBuilder setSSLHostnameVerifier(HostnameVerifier)
- HttpClientBuilder setRequestExecutor(HttpRequestExecutor)
- HttpClientBuilder setMaxConnPerRoute(int)
- HttpClientBuilder setContentDecoderRegistry(Map<String, InputStreamFactory>)
- HttpClientBuilder addInterceptorFirst(HttpResponseInterceptor)
- HttpClientBuilder addInterceptorFirst(HttpRequestInterceptor)
- HttpClientBuilder setTargetAuthenticationStrategy(AuthenticationStrategy)
- HttpClientBuilder evictExpiredConnections()
- HttpClientBuilder setServiceUnavailableRetryStrategy(ServiceUnavailableRetryStrategy)
- HttpClientBuilder disableDefaultUserAgent()
- HttpClientBuilder setRedirectStrategy(RedirectStrategy)
- HttpClientBuilder disableConnectionState()
- **static** HttpClientBuilder create()
- HttpClientBuilder setDefaultCookieSpecRegistry(Lookup<CookieSpecProvider>)
- HttpClientBuilder setConnectionTimeToLive(long, TimeUnit)
- HttpClientBuilder evictIdleConnections(Long, TimeUnit)
- HttpClientBuilder evictIdleConnections(long, TimeUnit)
- HttpClientBuilder addInterceptorLast(HttpResponseInterceptor)
- HttpClientBuilder addInterceptorLast(HttpRequestInterceptor)
- HttpClientBuilder setProxyAuthenticationStrategy(AuthenticationStrategy)
- HttpClientBuilder disableCookieManagement()
- HttpClientBuilder setDefaultCookieStore(CookieStore)
- HttpClientBuilder setProxy(HttpHost)
- HttpClientBuilder setDefaultConnectionConfig(ConnectionConfig)
- HttpClientBuilder setUserTokenHandler(UserTokenHandler)
- HttpClientBuilder setKeepAliveStrategy(ConnectionKeepAliveStrategy)
- HttpClientBuilder disableContentCompression()
- HttpClientBuilder disableAutomaticRetries()
- HttpClientBuilder setRetryHandler(HttpRequestRetryHandler)
- HttpClientBuilder setDefaultCredentialsProvider(CredentialsProvider)
- HttpClientBuilder setSSLSocketFactory(LayeredConnectionSocketFactory)
- HttpClientBuilder setHttpProcessor(HttpProcessor)
- HttpClientBuilder setConnectionManagerShared(boolean)
- HttpClientBuilder disableAuthCaching()
- HttpClientBuilder setConnectionManager(HttpClientConnectionManager)
- HttpClientBuilder setDefaultAuthSchemeRegistry(Lookup<AuthSchemeProvider>)
- HttpClientBuilder setConnectionBackoffStrategy(ConnectionBackoffStrategy)
- HttpClientBuilder setBackoffManager(BackoffManager)
- HttpClientBuilder setHostnameVerifier(X509HostnameVerifier)
- HttpClientBuilder setSSLContext(SSLContext)
- HttpClientBuilder setUserAgent(String)
- HttpClientBuilder useSystemProperties()
- HttpClientBuilder setDnsResolver(DnsResolver)
- HttpClientBuilder setDefaultHeaders(Collection<Header>)
- HttpClientBuilder setSslcontext(SSLContext)
- HttpClientBuilder setSchemePortResolver(SchemePortResolver)
- CloseableHttpClient build()
- HttpClientBuilder setPublicSuffixMatcher(PublicSuffixMatcher)
- HttpClientBuilder setRoutePlanner(HttpRoutePlanner)
- HttpClientBuilder setDefaultSocketConfig(SocketConfig)
- HttpClientBuilder setConnectionReuseStrategy(ConnectionReuseStrategy)

### Class: org.apache.http.impl.client.HttpClients
Type: Class

Methods:
- **static** HttpClientBuilder custom()
- **static** CloseableHttpClient createSystem()
- **static** CloseableHttpClient createMinimal()
- **static** CloseableHttpClient createMinimal(HttpClientConnectionManager)
- **static** CloseableHttpClient createDefault()

### Class: org.apache.http.impl.client.HttpRequestFutureTask
Type: Class
Extends: java.util.concurrent.FutureTask

Methods:
- boolean cancel(boolean)
- long startedTime()
- long scheduledTime()
- long taskDuration()
- long endedTime()
- long requestDuration()
- String toString()

### Class: org.apache.http.impl.client.IdleConnectionEvictor
Type: Class

Methods:
- boolean isRunning()
- void start()
- void awaitTermination(long, TimeUnit) throws InterruptedException
- void shutdown()

### Class: org.apache.http.impl.client.LaxRedirectStrategy
Type: Class
Extends: org.apache.http.impl.client.DefaultRedirectStrategy

No public methods found

### Class: org.apache.http.impl.client.NoopUserTokenHandler
Type: Class
Implements: org.apache.http.client.UserTokenHandler

Methods:
- Object getUserToken(HttpContext)

### Class: org.apache.http.impl.client.NullBackoffStrategy
Type: Class
Implements: org.apache.http.client.ConnectionBackoffStrategy

Methods:
- boolean shouldBackoff(Throwable)
- boolean shouldBackoff(HttpResponse)

### Class: org.apache.http.impl.client.ProxyAuthenticationStrategy
Type: Class
Extends: org.apache.http.impl.client.AuthenticationStrategyImpl

Methods:
- Map getChallenges(HttpHost, HttpResponse, HttpContext) throws MalformedChallengeException
- Queue select(Map, HttpHost, HttpResponse, HttpContext) throws MalformedChallengeException
- void authFailed(HttpHost, AuthScheme, HttpContext)
- void authSucceeded(HttpHost, AuthScheme, HttpContext)
- boolean isAuthenticationRequested(HttpHost, HttpResponse, HttpContext)

### Class: org.apache.http.impl.client.ProxyClient
Type: Class

Methods:
- AuthSchemeRegistry getAuthSchemeRegistry()
- Socket tunnel(HttpHost, HttpHost, Credentials) throws IOException, HttpException
- HttpParams getParams()

### Class: org.apache.http.impl.client.RedirectLocations
Type: Class
Extends: java.util.AbstractList

Methods:
- void add(URI)
- void add(int, Object)
- boolean contains(URI)
- boolean contains(Object)
- Object set(int, Object)
- List<URI> getAll()
- int size()
- URI get(int)
- Object get(int)
- boolean remove(URI)
- URI remove(int)
- Object remove(int)

### Class: org.apache.http.impl.client.RequestWrapper
Type: Class
Extends: org.apache.http.message.AbstractHttpMessage
Implements: org.apache.http.client.methods.HttpUriRequest

Methods:
- void setURI(URI)
- void incrementExecCount()
- int getExecCount()
- HttpRequest getOriginal()
- String getMethod()
- void resetHeaders()
- void setProtocolVersion(ProtocolVersion)
- boolean isRepeatable()
- ProtocolVersion getProtocolVersion()
- void setMethod(String)
- RequestLine getRequestLine()
- void abort() throws UnsupportedOperationException
- URI getURI()
- boolean isAborted()

### Class: org.apache.http.impl.client.RoutedRequest
Type: Class

Methods:
- RequestWrapper getRequest()
- HttpRoute getRoute()

### Class: org.apache.http.impl.client.StandardHttpRequestRetryHandler
Type: Class
Extends: org.apache.http.impl.client.DefaultHttpRequestRetryHandler

No public methods found

### Class: org.apache.http.impl.client.SystemDefaultCredentialsProvider
Type: Class
Implements: org.apache.http.client.CredentialsProvider

Methods:
- void clear()
- Credentials getCredentials(AuthScope)
- void setCredentials(AuthScope, Credentials)

### Class: org.apache.http.impl.client.SystemDefaultHttpClient
Type: Class
Extends: org.apache.http.impl.client.DefaultHttpClient

No public methods found

### Class: org.apache.http.impl.client.TargetAuthenticationStrategy
Type: Class
Extends: org.apache.http.impl.client.AuthenticationStrategyImpl

Methods:
- Map getChallenges(HttpHost, HttpResponse, HttpContext) throws MalformedChallengeException
- Queue select(Map, HttpHost, HttpResponse, HttpContext) throws MalformedChallengeException
- void authFailed(HttpHost, AuthScheme, HttpContext)
- void authSucceeded(HttpHost, AuthScheme, HttpContext)
- boolean isAuthenticationRequested(HttpHost, HttpResponse, HttpContext)

### Class: org.apache.http.impl.client.TunnelRefusedException
Type: Class
Extends: org.apache.http.HttpException

Methods:
- HttpResponse getResponse()

## Package: org.apache.http.impl.conn

### Class: org.apache.http.impl.conn.AbstractClientConnAdapter
Type: Abstract Class
Implements: org.apache.http.conn.ManagedClientConnection, org.apache.http.protocol.HttpContext

Methods:
- void setSocketTimeout(int)
- void setIdleDuration(long, TimeUnit)
- void abortConnection()
- void releaseConnection()
- int getLocalPort()
- boolean isMarkedReusable()
- HttpConnectionMetrics getMetrics()
- int getRemotePort()
- InetAddress getLocalAddress()
- void setAttribute(String, Object)
- Object getAttribute(String)
- void unmarkReusable()
- void bind(Socket) throws IOException
- void flush() throws IOException
- Object removeAttribute(String)
- void markReusable()
- InetAddress getRemoteAddress()
- boolean isSecure()
- int getSocketTimeout()
- SSLSession getSSLSession()
- boolean isOpen()
- Socket getSocket()
- boolean isResponseAvailable(int) throws IOException
- boolean isStale()
- void sendRequestEntity(HttpEntityEnclosingRequest) throws HttpException, IOException
- HttpResponse receiveResponseHeader() throws HttpException, IOException
- void sendRequestHeader(HttpRequest) throws HttpException, IOException
- void receiveResponseEntity(HttpResponse) throws HttpException, IOException

### Class: org.apache.http.impl.conn.AbstractPoolEntry
Type: Abstract Class

Methods:
- Object getState()
- void setState(Object)
- void tunnelProxy(HttpHost, boolean, HttpParams) throws IOException
- void open(HttpRoute, HttpContext, HttpParams) throws IOException
- void layerProtocol(HttpContext, HttpParams) throws IOException
- void tunnelTarget(boolean, HttpParams) throws IOException

### Class: org.apache.http.impl.conn.AbstractPooledConnAdapter
Type: Abstract Class
Extends: org.apache.http.impl.conn.AbstractClientConnAdapter

Methods:
- Object getState()
- void setState(Object)
- String getId()
- HttpRoute getRoute()
- void close() throws IOException
- void shutdown() throws IOException
- void tunnelProxy(HttpHost, boolean, HttpParams) throws IOException
- void open(HttpRoute, HttpContext, HttpParams) throws IOException
- void layerProtocol(HttpContext, HttpParams) throws IOException
- void tunnelTarget(boolean, HttpParams) throws IOException

### Class: org.apache.http.impl.conn.BasicClientConnectionManager
Type: Class
Implements: org.apache.http.conn.ClientConnectionManager

Methods:
- void closeIdleConnections(long, TimeUnit)
- void releaseConnection(ManagedClientConnection, long, TimeUnit)
- ClientConnectionRequest requestConnection(HttpRoute, Object)
- void shutdown()
- SchemeRegistry getSchemeRegistry()
- void closeExpiredConnections()

### Class: org.apache.http.impl.conn.BasicHttpClientConnectionManager
Type: Class
Implements: org.apache.http.conn.HttpClientConnectionManager, java.io.Closeable

Methods:
- void closeIdleConnections(long, TimeUnit)
- void releaseConnection(HttpClientConnection, Object, long, TimeUnit)
- ConnectionRequest requestConnection(HttpRoute, Object)
- SocketConfig getSocketConfig()
- void upgrade(HttpClientConnection, HttpRoute, HttpContext) throws IOException
- ConnectionConfig getConnectionConfig()
- void setSocketConfig(SocketConfig)
- void routeComplete(HttpClientConnection, HttpRoute, HttpContext) throws IOException
- void setConnectionConfig(ConnectionConfig)
- void close()
- void shutdown()
- void connect(HttpClientConnection, HttpRoute, int, HttpContext) throws IOException
- void closeExpiredConnections()

### Class: org.apache.http.impl.conn.ConnectionShutdownException
Type: Class
Extends: java.lang.IllegalStateException

No public methods found

### Class: org.apache.http.impl.conn.DefaultClientConnection
Type: Class
Extends: org.apache.http.impl.SocketHttpClientConnection
Implements: org.apache.http.conn.OperatedClientConnection, org.apache.http.conn.ManagedHttpClientConnection, org.apache.http.protocol.HttpContext

Methods:
- void openCompleted(boolean, HttpParams) throws IOException
- void update(Socket, HttpHost, boolean, HttpParams) throws IOException
- boolean isSecure()
- String getId()
- void opening(Socket, HttpHost) throws IOException
- SSLSession getSSLSession()
- void setAttribute(String, Object)
- Object getAttribute(String)
- void bind(Socket) throws IOException
- HttpHost getTargetHost()
- Socket getSocket()
- Object removeAttribute(String)
- void close() throws IOException
- HttpResponse receiveResponseHeader() throws HttpException, IOException
- void shutdown() throws IOException
- void sendRequestHeader(HttpRequest) throws HttpException, IOException

### Class: org.apache.http.impl.conn.DefaultClientConnectionOperator
Type: Class
Implements: org.apache.http.conn.ClientConnectionOperator

Methods:
- void updateSecureConnection(OperatedClientConnection, HttpHost, HttpContext, HttpParams) throws IOException
- void openConnection(OperatedClientConnection, HttpHost, InetAddress, HttpContext, HttpParams) throws IOException
- OperatedClientConnection createConnection()

### Class: org.apache.http.impl.conn.DefaultHttpClientConnectionOperator
Type: Class
Implements: org.apache.http.conn.HttpClientConnectionOperator

Methods:
- void upgrade(ManagedHttpClientConnection, HttpHost, HttpContext) throws IOException
- void connect(ManagedHttpClientConnection, HttpHost, InetSocketAddress, int, SocketConfig, HttpContext) throws IOException

### Class: org.apache.http.impl.conn.DefaultHttpResponseParser
Type: Class
Extends: org.apache.http.impl.io.AbstractMessageParser

No public methods found

### Class: org.apache.http.impl.conn.DefaultHttpResponseParserFactory
Type: Class
Implements: org.apache.http.io.HttpMessageParserFactory

Methods:
- HttpMessageParser<HttpResponse> create(SessionInputBuffer, MessageConstraints)

### Class: org.apache.http.impl.conn.DefaultHttpRoutePlanner
Type: Class
Implements: org.apache.http.conn.routing.HttpRoutePlanner

Methods:
- HttpRoute determineRoute(HttpHost, HttpRequest, HttpContext) throws HttpException

### Class: org.apache.http.impl.conn.DefaultManagedHttpClientConnection
Type: Class
Extends: org.apache.http.impl.DefaultBHttpClientConnection
Implements: org.apache.http.conn.ManagedHttpClientConnection, org.apache.http.protocol.HttpContext

Methods:
- SSLSession getSSLSession()
- void setAttribute(String, Object)
- void bind(Socket) throws IOException
- Object getAttribute(String)
- Socket getSocket()
- String getId()
- Object removeAttribute(String)
- void shutdown() throws IOException

### Class: org.apache.http.impl.conn.DefaultProxyRoutePlanner
Type: Class
Extends: org.apache.http.impl.conn.DefaultRoutePlanner

No public methods found

### Class: org.apache.http.impl.conn.DefaultResponseParser
Type: Class
Extends: org.apache.http.impl.io.AbstractMessageParser

No public methods found

### Class: org.apache.http.impl.conn.DefaultRoutePlanner
Type: Class
Implements: org.apache.http.conn.routing.HttpRoutePlanner

Methods:
- HttpRoute determineRoute(HttpHost, HttpRequest, HttpContext) throws HttpException

### Class: org.apache.http.impl.conn.DefaultSchemePortResolver
Type: Class
Implements: org.apache.http.conn.SchemePortResolver

Methods:
- int resolve(HttpHost) throws UnsupportedSchemeException

### Class: org.apache.http.impl.conn.IdleConnectionHandler
Type: Class

Methods:
- void closeIdleConnections(long)
- void add(HttpConnection, long, TimeUnit)
- void removeAll()
- boolean remove(HttpConnection)
- void closeExpiredConnections()

### Class: org.apache.http.impl.conn.InMemoryDnsResolver
Type: Class
Implements: org.apache.http.conn.DnsResolver

Methods:
- void add(String, InetAddress[])
- InetAddress[] resolve(String) throws UnknownHostException

### Class: org.apache.http.impl.conn.LoggingSessionInputBuffer
Type: Class
Implements: org.apache.http.io.SessionInputBuffer, org.apache.http.io.EofSensor

Methods:
- int read(byte[], int, int) throws IOException
- int read() throws IOException
- int read(byte[]) throws IOException
- boolean isDataAvailable(int) throws IOException
- HttpTransportMetrics getMetrics()
- String readLine() throws IOException
- int readLine(CharArrayBuffer) throws IOException
- boolean isEof()

### Class: org.apache.http.impl.conn.LoggingSessionOutputBuffer
Type: Class
Implements: org.apache.http.io.SessionOutputBuffer

Methods:
- void flush() throws IOException
- HttpTransportMetrics getMetrics()
- void writeLine(CharArrayBuffer) throws IOException
- void writeLine(String) throws IOException
- void write(byte[], int, int) throws IOException
- void write(int) throws IOException
- void write(byte[]) throws IOException

### Class: org.apache.http.impl.conn.ManagedHttpClientConnectionFactory
Type: Class
Implements: org.apache.http.conn.HttpConnectionFactory

Methods:
- ManagedHttpClientConnection create(HttpRoute, ConnectionConfig)
- HttpConnection create(Object, ConnectionConfig)

### Class: org.apache.http.impl.conn.PoolingClientConnectionManager
Type: Class
Implements: org.apache.http.conn.ClientConnectionManager, org.apache.http.pool.ConnPoolControl

Methods:
- PoolStats getStats(HttpRoute)
- PoolStats getStats(Object)
- int getDefaultMaxPerRoute()
- void setDefaultMaxPerRoute(int)
- void releaseConnection(ManagedClientConnection, long, TimeUnit)
- int getMaxTotal()
- void setMaxTotal(int)
- int getMaxPerRoute(HttpRoute)
- int getMaxPerRoute(Object)
- void closeExpiredConnections()
- void closeIdleConnections(long, TimeUnit)
- ClientConnectionRequest requestConnection(HttpRoute, Object)
- void setMaxPerRoute(HttpRoute, int)
- void setMaxPerRoute(Object, int)
- PoolStats getTotalStats()
- void shutdown()
- SchemeRegistry getSchemeRegistry()

### Class: org.apache.http.impl.conn.PoolingHttpClientConnectionManager
Type: Class
Implements: org.apache.http.conn.HttpClientConnectionManager, org.apache.http.pool.ConnPoolControl, java.io.Closeable

Methods:
- PoolStats getStats(HttpRoute)
- PoolStats getStats(Object)
- int getDefaultMaxPerRoute()
- void releaseConnection(HttpClientConnection, Object, long, TimeUnit)
- SocketConfig getDefaultSocketConfig()
- void setMaxTotal(int)
- void setConnectionConfig(HttpHost, ConnectionConfig)
- void closeIdleConnections(long, TimeUnit)
- ConnectionRequest requestConnection(HttpRoute, Object)
- int getValidateAfterInactivity()
- void setSocketConfig(HttpHost, SocketConfig)
- void setMaxPerRoute(HttpRoute, int)
- void setMaxPerRoute(Object, int)
- void close()
- void connect(HttpClientConnection, HttpRoute, int, HttpContext) throws IOException
- void setDefaultMaxPerRoute(int)
- ConnectionConfig getConnectionConfig(HttpHost)
- void upgrade(HttpClientConnection, HttpRoute, HttpContext) throws IOException
- int getMaxTotal()
- void setDefaultConnectionConfig(ConnectionConfig)
- void routeComplete(HttpClientConnection, HttpRoute, HttpContext) throws IOException
- int getMaxPerRoute(HttpRoute)
- int getMaxPerRoute(Object)
- ConnectionConfig getDefaultConnectionConfig()
- void closeExpiredConnections()
- Set<HttpRoute> getRoutes()
- SocketConfig getSocketConfig(HttpHost)
- void setValidateAfterInactivity(int)
- void setDefaultSocketConfig(SocketConfig)
- PoolStats getTotalStats()
- void shutdown()

### Class: org.apache.http.impl.conn.ProxySelectorRoutePlanner
Type: Class
Implements: org.apache.http.conn.routing.HttpRoutePlanner

Methods:
- void setProxySelector(ProxySelector)
- HttpRoute determineRoute(HttpHost, HttpRequest, HttpContext) throws HttpException
- ProxySelector getProxySelector()

### Class: org.apache.http.impl.conn.SchemeRegistryFactory
Type: Class

Methods:
- **static** SchemeRegistry createSystemDefault()
- **static** SchemeRegistry createDefault()

### Class: org.apache.http.impl.conn.SingleClientConnManager
Type: Class
Implements: org.apache.http.conn.ClientConnectionManager

Methods:
- void closeIdleConnections(long, TimeUnit)
- ManagedClientConnection getConnection(HttpRoute, Object)
- void releaseConnection(ManagedClientConnection, long, TimeUnit)
- ClientConnectionRequest requestConnection(HttpRoute, Object)
- void shutdown()
- SchemeRegistry getSchemeRegistry()
- void closeExpiredConnections()

### Class: org.apache.http.impl.conn.SingleClientConnManager$ConnAdapter
Type: Class
Extends: org.apache.http.impl.conn.AbstractPooledConnAdapter

No public methods found

### Class: org.apache.http.impl.conn.SingleClientConnManager$PoolEntry
Type: Class
Extends: org.apache.http.impl.conn.AbstractPoolEntry

No public methods found

### Class: org.apache.http.impl.conn.SystemDefaultDnsResolver
Type: Class
Implements: org.apache.http.conn.DnsResolver

Methods:
- InetAddress[] resolve(String) throws UnknownHostException

### Class: org.apache.http.impl.conn.SystemDefaultRoutePlanner
Type: Class
Extends: org.apache.http.impl.conn.DefaultRoutePlanner

No public methods found

### Class: org.apache.http.impl.conn.Wire
Type: Class

Methods:
- void output(InputStream) throws IOException
- void output(byte[], int, int) throws IOException
- void output(byte[]) throws IOException
- void output(int) throws IOException
- void output(String) throws IOException
- void input(InputStream) throws IOException
- void input(byte[], int, int) throws IOException
- void input(byte[]) throws IOException
- void input(int) throws IOException
- void input(String) throws IOException
- boolean enabled()

## Package: org.apache.http.impl.conn.tsccm

### Class: org.apache.http.impl.conn.tsccm.PoolEntryRequest
Type: Interface

Methods:
- void abortRequest()
- BasicPoolEntry getPoolEntry(long, TimeUnit) throws InterruptedException, ConnectionPoolTimeoutException

### Class: org.apache.http.impl.conn.tsccm.AbstractConnPool
Type: Abstract Class

Methods:
- void closeIdleConnections(long, TimeUnit)
- void enableConnectionGC() throws IllegalStateException
- V handleReference(Reference<*>)
- void deleteClosedConnections()
- PoolEntryRequest requestPoolEntry(HttpRoute, Object)
- BasicPoolEntry getEntry(HttpRoute, Object, long, TimeUnit) throws ConnectionPoolTimeoutException, InterruptedException
- void shutdown()
- void closeExpiredConnections()
- void freeEntry(BasicPoolEntry, boolean, long, TimeUnit)

### Class: org.apache.http.impl.conn.tsccm.BasicPoolEntry
Type: Class
Extends: org.apache.http.impl.conn.AbstractPoolEntry

Methods:
- long getUpdated()
- void updateExpiry(long, TimeUnit)
- long getValidUntil()
- long getExpiry()
- long getCreated()
- boolean isExpired(long)

### Class: org.apache.http.impl.conn.tsccm.BasicPoolEntryRef
Type: Class
Extends: java.lang.ref.WeakReference

Methods:
- HttpRoute getRoute()

### Class: org.apache.http.impl.conn.tsccm.BasicPooledConnAdapter
Type: Class
Extends: org.apache.http.impl.conn.AbstractPooledConnAdapter

No public methods found

### Class: org.apache.http.impl.conn.tsccm.ConnPoolByRoute
Type: Class
Extends: org.apache.http.impl.conn.tsccm.AbstractConnPool

Methods:
- void closeIdleConnections(long, TimeUnit)
- void setMaxTotalConnections(int)
- int getMaxTotalConnections()
- void deleteClosedConnections()
- PoolEntryRequest requestPoolEntry(HttpRoute, Object)
- int getConnectionsInPool(HttpRoute)
- int getConnectionsInPool()
- void shutdown()
- void closeExpiredConnections()
- void freeEntry(BasicPoolEntry, boolean, long, TimeUnit)

### Class: org.apache.http.impl.conn.tsccm.RouteSpecificPool
Type: Class

Methods:
- void removeThread(WaitingThread)
- BasicPoolEntry allocEntry(Object)
- WaitingThread nextThread()
- HttpRoute getRoute()
- void dropEntry()
- void queueThread(WaitingThread)
- boolean hasThread()
- boolean deleteEntry(BasicPoolEntry)
- boolean isUnused()
- int getEntryCount()
- void createdEntry(BasicPoolEntry)
- int getMaxEntries()
- void freeEntry(BasicPoolEntry)
- int getCapacity()

### Class: org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager
Type: Class
Implements: org.apache.http.conn.ClientConnectionManager

Methods:
- void closeIdleConnections(long, TimeUnit)
- int getDefaultMaxPerRoute()
- void setDefaultMaxPerRoute(int)
- void releaseConnection(ManagedClientConnection, long, TimeUnit)
- ClientConnectionRequest requestConnection(HttpRoute, Object)
- int getMaxTotal()
- int getMaxForRoute(HttpRoute)
- void setMaxTotal(int)
- void setMaxForRoute(HttpRoute, int)
- int getConnectionsInPool(HttpRoute)
- int getConnectionsInPool()
- void shutdown()
- SchemeRegistry getSchemeRegistry()
- void closeExpiredConnections()

### Class: org.apache.http.impl.conn.tsccm.WaitingThread
Type: Class

Methods:
- Condition getCondition()
- void wakeup()
- RouteSpecificPool getPool()
- void interrupt()
- boolean await(Date) throws InterruptedException
- Thread getThread()

### Class: org.apache.http.impl.conn.tsccm.WaitingThreadAborter
Type: Class

Methods:
- void abort()
- void setWaitingThread(WaitingThread)

## Package: org.apache.http.impl.cookie

### Class: org.apache.http.impl.cookie.AbstractCookieAttributeHandler
Type: Abstract Class
Implements: org.apache.http.cookie.CookieAttributeHandler

Methods:
- boolean match(Cookie, CookieOrigin)
- void validate(Cookie, CookieOrigin) throws MalformedCookieException

### Class: org.apache.http.impl.cookie.AbstractCookieSpec
Type: Abstract Class
Implements: org.apache.http.cookie.CookieSpec

Methods:
- void registerAttribHandler(String, CookieAttributeHandler)

### Class: org.apache.http.impl.cookie.BasicClientCookie
Type: Class
Implements: org.apache.http.cookie.SetCookie, org.apache.http.cookie.ClientCookie, java.lang.Cloneable, java.io.Serializable

Methods:
- String getName()
- void setDomain(String)
- boolean containsAttribute(String)
- Date getCreationDate()
- void setAttribute(String, String)
- String getAttribute(String)
- void setCreationDate(Date)
- boolean isPersistent()
- String getPath()
- String getComment()
- boolean removeAttribute(String)
- String getCommentURL()
- int getVersion()
- int[] getPorts()
- void setVersion(int)
- Date getExpiryDate()
- boolean isSecure()
- void setPath(String)
- String getDomain()
- String getValue()
- void setExpiryDate(Date)
- void setValue(String)
- Object clone() throws CloneNotSupportedException
- void setComment(String)
- String toString()
- boolean isExpired(Date)
- void setSecure(boolean)

### Class: org.apache.http.impl.cookie.BasicClientCookie2
Type: Class
Extends: org.apache.http.impl.cookie.BasicClientCookie
Implements: org.apache.http.cookie.SetCookie2

Methods:
- int[] getPorts()
- void setDiscard(boolean)
- boolean isPersistent()
- Object clone() throws CloneNotSupportedException
- void setPorts(int[])
- boolean isExpired(Date)
- void setCommentURL(String)
- String getCommentURL()

### Class: org.apache.http.impl.cookie.BasicCommentHandler
Type: Class
Extends: org.apache.http.impl.cookie.AbstractCookieAttributeHandler
Implements: org.apache.http.cookie.CommonCookieAttributeHandler

Methods:
- void parse(SetCookie, String) throws MalformedCookieException
- String getAttributeName()

### Class: org.apache.http.impl.cookie.BasicDomainHandler
Type: Class
Implements: org.apache.http.cookie.CommonCookieAttributeHandler

Methods:
- boolean match(Cookie, CookieOrigin)
- void parse(SetCookie, String) throws MalformedCookieException
- String getAttributeName()
- void validate(Cookie, CookieOrigin) throws MalformedCookieException

### Class: org.apache.http.impl.cookie.BasicExpiresHandler
Type: Class
Extends: org.apache.http.impl.cookie.AbstractCookieAttributeHandler
Implements: org.apache.http.cookie.CommonCookieAttributeHandler

Methods:
- void parse(SetCookie, String) throws MalformedCookieException
- String getAttributeName()

### Class: org.apache.http.impl.cookie.BasicMaxAgeHandler
Type: Class
Extends: org.apache.http.impl.cookie.AbstractCookieAttributeHandler
Implements: org.apache.http.cookie.CommonCookieAttributeHandler

Methods:
- void parse(SetCookie, String) throws MalformedCookieException
- String getAttributeName()

### Class: org.apache.http.impl.cookie.BasicPathHandler
Type: Class
Implements: org.apache.http.cookie.CommonCookieAttributeHandler

Methods:
- boolean match(Cookie, CookieOrigin)
- void parse(SetCookie, String) throws MalformedCookieException
- String getAttributeName()
- void validate(Cookie, CookieOrigin) throws MalformedCookieException

### Class: org.apache.http.impl.cookie.BasicSecureHandler
Type: Class
Extends: org.apache.http.impl.cookie.AbstractCookieAttributeHandler
Implements: org.apache.http.cookie.CommonCookieAttributeHandler

Methods:
- boolean match(Cookie, CookieOrigin)
- void parse(SetCookie, String) throws MalformedCookieException
- String getAttributeName()

### Class: org.apache.http.impl.cookie.BestMatchSpec
Type: Class
Extends: org.apache.http.impl.cookie.DefaultCookieSpec

Methods:
- String toString()

### Class: org.apache.http.impl.cookie.BestMatchSpecFactory
Type: Class
Implements: org.apache.http.cookie.CookieSpecFactory, org.apache.http.cookie.CookieSpecProvider

Methods:
- CookieSpec create(HttpContext)
- CookieSpec newInstance(HttpParams)

### Class: org.apache.http.impl.cookie.BrowserCompatSpec
Type: Class
Extends: org.apache.http.impl.cookie.CookieSpecBase

Methods:
- int getVersion()
- List<Header> formatCookies(List<Cookie>)
- Header getVersionHeader()
- String toString()
- List<Cookie> parse(Header, CookieOrigin) throws MalformedCookieException

### Class: org.apache.http.impl.cookie.BrowserCompatSpecFactory
Type: Class
Implements: org.apache.http.cookie.CookieSpecFactory, org.apache.http.cookie.CookieSpecProvider

Methods:
- CookieSpec create(HttpContext)
- CookieSpec newInstance(HttpParams)

### Class: org.apache.http.impl.cookie.BrowserCompatSpecFactory$SecurityLevel
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- SECURITYLEVEL_DEFAULT
- SECURITYLEVEL_IE_MEDIUM

Methods:
- **static** BrowserCompatSpecFactory$SecurityLevel valueOf(String)
- **static** BrowserCompatSpecFactory$SecurityLevel[] values()

### Class: org.apache.http.impl.cookie.BrowserCompatVersionAttributeHandler
Type: Class
Extends: org.apache.http.impl.cookie.AbstractCookieAttributeHandler
Implements: org.apache.http.cookie.CommonCookieAttributeHandler

Methods:
- void parse(SetCookie, String) throws MalformedCookieException
- String getAttributeName()

### Class: org.apache.http.impl.cookie.CookieSpecBase
Type: Abstract Class
Extends: org.apache.http.impl.cookie.AbstractCookieSpec

Methods:
- boolean match(Cookie, CookieOrigin)
- void validate(Cookie, CookieOrigin) throws MalformedCookieException

### Class: org.apache.http.impl.cookie.DateParseException
Type: Class
Extends: java.lang.Exception

No public methods found

### Class: org.apache.http.impl.cookie.DateUtils
Type: Class

Methods:
- **static** String formatDate(Date)
- **static** String formatDate(Date, String)
- **static** Date parseDate(String) throws DateParseException
- **static** Date parseDate(String, String[]) throws DateParseException
- **static** Date parseDate(String, String[], Date) throws DateParseException

### Class: org.apache.http.impl.cookie.DefaultCookieSpec
Type: Class
Implements: org.apache.http.cookie.CookieSpec

Methods:
- int getVersion()
- List<Header> formatCookies(List<Cookie>)
- Header getVersionHeader()
- boolean match(Cookie, CookieOrigin)
- String toString()
- List<Cookie> parse(Header, CookieOrigin) throws MalformedCookieException
- void validate(Cookie, CookieOrigin) throws MalformedCookieException

### Class: org.apache.http.impl.cookie.DefaultCookieSpecProvider
Type: Class
Implements: org.apache.http.cookie.CookieSpecProvider

Methods:
- CookieSpec create(HttpContext)

### Class: org.apache.http.impl.cookie.DefaultCookieSpecProvider$CompatibilityLevel
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- DEFAULT
- IE_MEDIUM_SECURITY

Methods:
- **static** DefaultCookieSpecProvider$CompatibilityLevel valueOf(String)
- **static** DefaultCookieSpecProvider$CompatibilityLevel[] values()

### Class: org.apache.http.impl.cookie.IgnoreSpec
Type: Class
Extends: org.apache.http.impl.cookie.CookieSpecBase

Methods:
- List<Header> formatCookies(List<Cookie>)
- int getVersion()
- Header getVersionHeader()
- boolean match(Cookie, CookieOrigin)
- List<Cookie> parse(Header, CookieOrigin) throws MalformedCookieException

### Class: org.apache.http.impl.cookie.IgnoreSpecFactory
Type: Class
Implements: org.apache.http.cookie.CookieSpecFactory, org.apache.http.cookie.CookieSpecProvider

Methods:
- CookieSpec create(HttpContext)
- CookieSpec newInstance(HttpParams)

### Class: org.apache.http.impl.cookie.IgnoreSpecProvider
Type: Class
Implements: org.apache.http.cookie.CookieSpecProvider

Methods:
- CookieSpec create(HttpContext)

### Class: org.apache.http.impl.cookie.LaxExpiresHandler
Type: Class
Extends: org.apache.http.impl.cookie.AbstractCookieAttributeHandler
Implements: org.apache.http.cookie.CommonCookieAttributeHandler

Methods:
- void parse(SetCookie, String) throws MalformedCookieException
- String getAttributeName()

### Class: org.apache.http.impl.cookie.LaxMaxAgeHandler
Type: Class
Extends: org.apache.http.impl.cookie.AbstractCookieAttributeHandler
Implements: org.apache.http.cookie.CommonCookieAttributeHandler

Methods:
- void parse(SetCookie, String) throws MalformedCookieException
- String getAttributeName()

### Class: org.apache.http.impl.cookie.NetscapeDomainHandler
Type: Class
Extends: org.apache.http.impl.cookie.BasicDomainHandler

Methods:
- boolean match(Cookie, CookieOrigin)
- void parse(SetCookie, String) throws MalformedCookieException
- String getAttributeName()
- void validate(Cookie, CookieOrigin) throws MalformedCookieException

### Class: org.apache.http.impl.cookie.NetscapeDraftHeaderParser
Type: Class

Methods:
- HeaderElement parseHeader(CharArrayBuffer, ParserCursor) throws ParseException

### Class: org.apache.http.impl.cookie.NetscapeDraftSpec
Type: Class
Extends: org.apache.http.impl.cookie.CookieSpecBase

Methods:
- int getVersion()
- List<Header> formatCookies(List<Cookie>)
- Header getVersionHeader()
- String toString()
- List<Cookie> parse(Header, CookieOrigin) throws MalformedCookieException

### Class: org.apache.http.impl.cookie.NetscapeDraftSpecFactory
Type: Class
Implements: org.apache.http.cookie.CookieSpecFactory, org.apache.http.cookie.CookieSpecProvider

Methods:
- CookieSpec create(HttpContext)
- CookieSpec newInstance(HttpParams)

### Class: org.apache.http.impl.cookie.NetscapeDraftSpecProvider
Type: Class
Implements: org.apache.http.cookie.CookieSpecProvider

Methods:
- CookieSpec create(HttpContext)

### Class: org.apache.http.impl.cookie.PublicSuffixDomainFilter
Type: Class
Implements: org.apache.http.cookie.CommonCookieAttributeHandler

Methods:
- **static** CommonCookieAttributeHandler decorate(CommonCookieAttributeHandler, PublicSuffixMatcher)
- boolean match(Cookie, CookieOrigin)
- void parse(SetCookie, String) throws MalformedCookieException
- String getAttributeName()
- void validate(Cookie, CookieOrigin) throws MalformedCookieException

### Class: org.apache.http.impl.cookie.PublicSuffixFilter
Type: Class
Implements: org.apache.http.cookie.CookieAttributeHandler

Methods:
- boolean match(Cookie, CookieOrigin)
- V setExceptions(Collection<String>)
- V setPublicSuffixes(Collection<String>)
- void parse(SetCookie, String) throws MalformedCookieException
- void validate(Cookie, CookieOrigin) throws MalformedCookieException

### Class: org.apache.http.impl.cookie.PublicSuffixListParser
Type: Class

Methods:
- void parse(Reader) throws IOException

### Class: org.apache.http.impl.cookie.RFC2109DomainHandler
Type: Class
Implements: org.apache.http.cookie.CommonCookieAttributeHandler

Methods:
- boolean match(Cookie, CookieOrigin)
- void parse(SetCookie, String) throws MalformedCookieException
- String getAttributeName()
- void validate(Cookie, CookieOrigin) throws MalformedCookieException

### Class: org.apache.http.impl.cookie.RFC2109Spec
Type: Class
Extends: org.apache.http.impl.cookie.CookieSpecBase

Methods:
- int getVersion()
- List<Header> formatCookies(List<Cookie>)
- Header getVersionHeader()
- String toString()
- List<Cookie> parse(Header, CookieOrigin) throws MalformedCookieException
- void validate(Cookie, CookieOrigin) throws MalformedCookieException

### Class: org.apache.http.impl.cookie.RFC2109SpecFactory
Type: Class
Implements: org.apache.http.cookie.CookieSpecFactory, org.apache.http.cookie.CookieSpecProvider

Methods:
- CookieSpec create(HttpContext)
- CookieSpec newInstance(HttpParams)

### Class: org.apache.http.impl.cookie.RFC2109SpecProvider
Type: Class
Implements: org.apache.http.cookie.CookieSpecProvider

Methods:
- CookieSpec create(HttpContext)

### Class: org.apache.http.impl.cookie.RFC2109VersionHandler
Type: Class
Extends: org.apache.http.impl.cookie.AbstractCookieAttributeHandler
Implements: org.apache.http.cookie.CommonCookieAttributeHandler

Methods:
- void parse(SetCookie, String) throws MalformedCookieException
- String getAttributeName()
- void validate(Cookie, CookieOrigin) throws MalformedCookieException

### Class: org.apache.http.impl.cookie.RFC2965CommentUrlAttributeHandler
Type: Class
Implements: org.apache.http.cookie.CommonCookieAttributeHandler

Methods:
- boolean match(Cookie, CookieOrigin)
- void parse(SetCookie, String) throws MalformedCookieException
- String getAttributeName()
- void validate(Cookie, CookieOrigin) throws MalformedCookieException

### Class: org.apache.http.impl.cookie.RFC2965DiscardAttributeHandler
Type: Class
Implements: org.apache.http.cookie.CommonCookieAttributeHandler

Methods:
- boolean match(Cookie, CookieOrigin)
- void parse(SetCookie, String) throws MalformedCookieException
- String getAttributeName()
- void validate(Cookie, CookieOrigin) throws MalformedCookieException

### Class: org.apache.http.impl.cookie.RFC2965DomainAttributeHandler
Type: Class
Implements: org.apache.http.cookie.CommonCookieAttributeHandler

Methods:
- boolean domainMatch(String, String)
- boolean match(Cookie, CookieOrigin)
- void parse(SetCookie, String) throws MalformedCookieException
- String getAttributeName()
- void validate(Cookie, CookieOrigin) throws MalformedCookieException

### Class: org.apache.http.impl.cookie.RFC2965PortAttributeHandler
Type: Class
Implements: org.apache.http.cookie.CommonCookieAttributeHandler

Methods:
- boolean match(Cookie, CookieOrigin)
- void parse(SetCookie, String) throws MalformedCookieException
- String getAttributeName()
- void validate(Cookie, CookieOrigin) throws MalformedCookieException

### Class: org.apache.http.impl.cookie.RFC2965Spec
Type: Class
Extends: org.apache.http.impl.cookie.RFC2109Spec

Methods:
- int getVersion()
- Header getVersionHeader()
- boolean match(Cookie, CookieOrigin)
- String toString()
- List<Cookie> parse(Header, CookieOrigin) throws MalformedCookieException
- void validate(Cookie, CookieOrigin) throws MalformedCookieException

### Class: org.apache.http.impl.cookie.RFC2965SpecFactory
Type: Class
Implements: org.apache.http.cookie.CookieSpecFactory, org.apache.http.cookie.CookieSpecProvider

Methods:
- CookieSpec create(HttpContext)
- CookieSpec newInstance(HttpParams)

### Class: org.apache.http.impl.cookie.RFC2965SpecProvider
Type: Class
Implements: org.apache.http.cookie.CookieSpecProvider

Methods:
- CookieSpec create(HttpContext)

### Class: org.apache.http.impl.cookie.RFC2965VersionAttributeHandler
Type: Class
Implements: org.apache.http.cookie.CommonCookieAttributeHandler

Methods:
- boolean match(Cookie, CookieOrigin)
- void parse(SetCookie, String) throws MalformedCookieException
- String getAttributeName()
- void validate(Cookie, CookieOrigin) throws MalformedCookieException

### Class: org.apache.http.impl.cookie.RFC6265CookieSpec
Type: Class
Implements: org.apache.http.cookie.CookieSpec

Methods:
- int getVersion()
- List<Header> formatCookies(List<Cookie>)
- Header getVersionHeader()
- boolean match(Cookie, CookieOrigin)
- List<Cookie> parse(Header, CookieOrigin) throws MalformedCookieException
- void validate(Cookie, CookieOrigin) throws MalformedCookieException

### Class: org.apache.http.impl.cookie.RFC6265CookieSpecProvider
Type: Class
Implements: org.apache.http.cookie.CookieSpecProvider

Methods:
- CookieSpec create(HttpContext)

### Class: org.apache.http.impl.cookie.RFC6265CookieSpecProvider$CompatibilityLevel
Type: Enum
Extends: java.lang.Enum

Enum Constants:
- STRICT
- RELAXED
- IE_MEDIUM_SECURITY

Methods:
- **static** RFC6265CookieSpecProvider$CompatibilityLevel valueOf(String)
- **static** RFC6265CookieSpecProvider$CompatibilityLevel[] values()

### Class: org.apache.http.impl.cookie.RFC6265LaxSpec
Type: Class
Extends: org.apache.http.impl.cookie.RFC6265CookieSpecBase

Methods:
- String toString()

### Class: org.apache.http.impl.cookie.RFC6265StrictSpec
Type: Class
Extends: org.apache.http.impl.cookie.RFC6265CookieSpecBase

Methods:
- String toString()

## Package: org.apache.http.impl.entity

### Class: org.apache.http.impl.entity.DisallowIdentityContentLengthStrategy
Type: Class
Implements: org.apache.http.entity.ContentLengthStrategy

Methods:
- long determineLength(HttpMessage) throws HttpException

### Class: org.apache.http.impl.entity.EntityDeserializer
Type: Class

Methods:
- HttpEntity deserialize(SessionInputBuffer, HttpMessage) throws HttpException, IOException

### Class: org.apache.http.impl.entity.EntitySerializer
Type: Class

Methods:
- void serialize(SessionOutputBuffer, HttpMessage, HttpEntity) throws HttpException, IOException

### Class: org.apache.http.impl.entity.LaxContentLengthStrategy
Type: Class
Implements: org.apache.http.entity.ContentLengthStrategy

Methods:
- long determineLength(HttpMessage) throws HttpException

### Class: org.apache.http.impl.entity.StrictContentLengthStrategy
Type: Class
Implements: org.apache.http.entity.ContentLengthStrategy

Methods:
- long determineLength(HttpMessage) throws HttpException

## Package: org.apache.http.impl.execchain

### Class: org.apache.http.impl.execchain.ClientExecChain
Type: Interface

Methods:
- CloseableHttpResponse execute(HttpRoute, HttpRequestWrapper, HttpClientContext, HttpExecutionAware) throws IOException, HttpException

### Class: org.apache.http.impl.execchain.BackoffStrategyExec
Type: Class
Implements: org.apache.http.impl.execchain.ClientExecChain

Methods:
- CloseableHttpResponse execute(HttpRoute, HttpRequestWrapper, HttpClientContext, HttpExecutionAware) throws IOException, HttpException

### Class: org.apache.http.impl.execchain.MainClientExec
Type: Class
Implements: org.apache.http.impl.execchain.ClientExecChain

Methods:
- CloseableHttpResponse execute(HttpRoute, HttpRequestWrapper, HttpClientContext, HttpExecutionAware) throws IOException, HttpException

### Class: org.apache.http.impl.execchain.MinimalClientExec
Type: Class
Implements: org.apache.http.impl.execchain.ClientExecChain

Methods:
- CloseableHttpResponse execute(HttpRoute, HttpRequestWrapper, HttpClientContext, HttpExecutionAware) throws IOException, HttpException

### Class: org.apache.http.impl.execchain.ProtocolExec
Type: Class
Implements: org.apache.http.impl.execchain.ClientExecChain

Methods:
- CloseableHttpResponse execute(HttpRoute, HttpRequestWrapper, HttpClientContext, HttpExecutionAware) throws IOException, HttpException

### Class: org.apache.http.impl.execchain.RedirectExec
Type: Class
Implements: org.apache.http.impl.execchain.ClientExecChain

Methods:
- CloseableHttpResponse execute(HttpRoute, HttpRequestWrapper, HttpClientContext, HttpExecutionAware) throws IOException, HttpException

### Class: org.apache.http.impl.execchain.RequestAbortedException
Type: Class
Extends: java.io.InterruptedIOException

No public methods found

### Class: org.apache.http.impl.execchain.RetryExec
Type: Class
Implements: org.apache.http.impl.execchain.ClientExecChain

Methods:
- CloseableHttpResponse execute(HttpRoute, HttpRequestWrapper, HttpClientContext, HttpExecutionAware) throws IOException, HttpException

### Class: org.apache.http.impl.execchain.ServiceUnavailableRetryExec
Type: Class
Implements: org.apache.http.impl.execchain.ClientExecChain

Methods:
- CloseableHttpResponse execute(HttpRoute, HttpRequestWrapper, HttpClientContext, HttpExecutionAware) throws IOException, HttpException

### Class: org.apache.http.impl.execchain.TunnelRefusedException
Type: Class
Extends: org.apache.http.HttpException

Methods:
- HttpResponse getResponse()

## Package: org.apache.http.impl.io

### Class: org.apache.http.impl.io.AbstractMessageParser
Type: Abstract Class
Implements: org.apache.http.io.HttpMessageParser

Methods:
- **static** Header[] parseHeaders(SessionInputBuffer, int, int, LineParser) throws HttpException, IOException
- **static** Header parseHeaders(SessionInputBuffer, int, int, LineParser, List<CharArrayBuffer>) throws HttpException, IOException
- TT parse() throws IOException, HttpException

### Class: org.apache.http.impl.io.AbstractMessageWriter
Type: Abstract Class
Implements: org.apache.http.io.HttpMessageWriter

Methods:
- V write(T) throws IOException, HttpException

### Class: org.apache.http.impl.io.AbstractSessionInputBuffer
Type: Abstract Class
Implements: org.apache.http.io.SessionInputBuffer, org.apache.http.io.BufferInfo

Methods:
- int read() throws IOException
- int read(byte[], int, int) throws IOException
- int read(byte[]) throws IOException
- HttpTransportMetrics getMetrics()
- int available()
- int length()
- int readLine(CharArrayBuffer) throws IOException
- String readLine() throws IOException
- int capacity()

### Class: org.apache.http.impl.io.AbstractSessionOutputBuffer
Type: Abstract Class
Implements: org.apache.http.io.SessionOutputBuffer, org.apache.http.io.BufferInfo

Methods:
- void flush() throws IOException
- HttpTransportMetrics getMetrics()
- int available()
- int length()
- void writeLine(String) throws IOException
- void writeLine(CharArrayBuffer) throws IOException
- void write(byte[], int, int) throws IOException
- void write(byte[]) throws IOException
- void write(int) throws IOException
- int capacity()

### Class: org.apache.http.impl.io.ChunkedInputStream
Type: Class
Extends: java.io.InputStream

Methods:
- int read() throws IOException
- int read(byte[], int, int) throws IOException
- int read(byte[]) throws IOException
- Header[] getFooters()
- int available() throws IOException
- void close() throws IOException

### Class: org.apache.http.impl.io.ChunkedOutputStream
Type: Class
Extends: java.io.OutputStream

Methods:
- void flush() throws IOException
- void finish() throws IOException
- void close() throws IOException
- void write(int) throws IOException
- void write(byte[]) throws IOException
- void write(byte[], int, int) throws IOException

### Class: org.apache.http.impl.io.ContentLengthInputStream
Type: Class
Extends: java.io.InputStream

Methods:
- int read() throws IOException
- int read(byte[], int, int) throws IOException
- int read(byte[]) throws IOException
- int available() throws IOException
- long skip(long) throws IOException
- void close() throws IOException

### Class: org.apache.http.impl.io.ContentLengthOutputStream
Type: Class
Extends: java.io.OutputStream

Methods:
- void flush() throws IOException
- void write(byte[], int, int) throws IOException
- void write(byte[]) throws IOException
- void write(int) throws IOException
- void close() throws IOException

### Class: org.apache.http.impl.io.DefaultHttpRequestParser
Type: Class
Extends: org.apache.http.impl.io.AbstractMessageParser

No public methods found

### Class: org.apache.http.impl.io.DefaultHttpRequestParserFactory
Type: Class
Implements: org.apache.http.io.HttpMessageParserFactory

Methods:
- HttpMessageParser<HttpRequest> create(SessionInputBuffer, MessageConstraints)

### Class: org.apache.http.impl.io.DefaultHttpRequestWriter
Type: Class
Extends: org.apache.http.impl.io.AbstractMessageWriter

No public methods found

### Class: org.apache.http.impl.io.DefaultHttpRequestWriterFactory
Type: Class
Implements: org.apache.http.io.HttpMessageWriterFactory

Methods:
- HttpMessageWriter<HttpRequest> create(SessionOutputBuffer)

### Class: org.apache.http.impl.io.DefaultHttpResponseParser
Type: Class
Extends: org.apache.http.impl.io.AbstractMessageParser

No public methods found

### Class: org.apache.http.impl.io.DefaultHttpResponseParserFactory
Type: Class
Implements: org.apache.http.io.HttpMessageParserFactory

Methods:
- HttpMessageParser<HttpResponse> create(SessionInputBuffer, MessageConstraints)

### Class: org.apache.http.impl.io.DefaultHttpResponseWriter
Type: Class
Extends: org.apache.http.impl.io.AbstractMessageWriter

No public methods found

### Class: org.apache.http.impl.io.DefaultHttpResponseWriterFactory
Type: Class
Implements: org.apache.http.io.HttpMessageWriterFactory

Methods:
- HttpMessageWriter<HttpResponse> create(SessionOutputBuffer)

### Class: org.apache.http.impl.io.EmptyInputStream
Type: Class
Extends: java.io.InputStream

Methods:
- int read()
- int read(byte[])
- int read(byte[], int, int)
- boolean markSupported()
- int available()
- void reset()
- long skip(long)
- void close()
- void mark(int)

### Class: org.apache.http.impl.io.HttpRequestParser
Type: Class
Extends: org.apache.http.impl.io.AbstractMessageParser

No public methods found

### Class: org.apache.http.impl.io.HttpRequestWriter
Type: Class
Extends: org.apache.http.impl.io.AbstractMessageWriter

No public methods found

### Class: org.apache.http.impl.io.HttpResponseParser
Type: Class
Extends: org.apache.http.impl.io.AbstractMessageParser

No public methods found

### Class: org.apache.http.impl.io.HttpResponseWriter
Type: Class
Extends: org.apache.http.impl.io.AbstractMessageWriter

No public methods found

### Class: org.apache.http.impl.io.HttpTransportMetricsImpl
Type: Class
Implements: org.apache.http.io.HttpTransportMetrics

Methods:
- void setBytesTransferred(long)
- long getBytesTransferred()
- void reset()
- void incrementBytesTransferred(long)

### Class: org.apache.http.impl.io.IdentityInputStream
Type: Class
Extends: java.io.InputStream

Methods:
- int read() throws IOException
- int read(byte[], int, int) throws IOException
- int available() throws IOException
- void close() throws IOException

### Class: org.apache.http.impl.io.IdentityOutputStream
Type: Class
Extends: java.io.OutputStream

Methods:
- void flush() throws IOException
- void write(byte[], int, int) throws IOException
- void write(byte[]) throws IOException
- void write(int) throws IOException
- void close() throws IOException

### Class: org.apache.http.impl.io.SessionInputBufferImpl
Type: Class
Implements: org.apache.http.io.SessionInputBuffer, org.apache.http.io.BufferInfo

Methods:
- boolean isDataAvailable(int) throws IOException
- int read() throws IOException
- int read(byte[], int, int) throws IOException
- int read(byte[]) throws IOException
- void bind(InputStream)
- boolean isBound()
- int fillBuffer() throws IOException
- HttpTransportMetrics getMetrics()
- void clear()
- int available()
- int length()
- boolean hasBufferedData()
- int readLine(CharArrayBuffer) throws IOException
- String readLine() throws IOException
- int capacity()

### Class: org.apache.http.impl.io.SessionOutputBufferImpl
Type: Class
Implements: org.apache.http.io.SessionOutputBuffer, org.apache.http.io.BufferInfo

Methods:
- void bind(OutputStream)
- void flush() throws IOException
- boolean isBound()
- HttpTransportMetrics getMetrics()
- int available()
- int length()
- void writeLine(String) throws IOException
- void writeLine(CharArrayBuffer) throws IOException
- void write(byte[], int, int) throws IOException
- void write(byte[]) throws IOException
- void write(int) throws IOException
- int capacity()

### Class: org.apache.http.impl.io.SocketInputBuffer
Type: Class
Extends: org.apache.http.impl.io.AbstractSessionInputBuffer
Implements: org.apache.http.io.EofSensor

Methods:
- boolean isDataAvailable(int) throws IOException
- boolean isEof()

### Class: org.apache.http.impl.io.SocketOutputBuffer
Type: Class
Extends: org.apache.http.impl.io.AbstractSessionOutputBuffer

No public methods found

## Package: org.apache.http.impl.pool

### Class: org.apache.http.impl.pool.BasicConnFactory
Type: Class
Implements: org.apache.http.pool.ConnFactory

Methods:
- HttpClientConnection create(HttpHost) throws IOException
- Object create(Object) throws IOException

### Class: org.apache.http.impl.pool.BasicConnPool
Type: Class
Extends: org.apache.http.pool.AbstractConnPool

No public methods found

### Class: org.apache.http.impl.pool.BasicPoolEntry
Type: Class
Extends: org.apache.http.pool.PoolEntry

Methods:
- boolean isClosed()
- void close()

## Package: org.apache.http.io

### Class: org.apache.http.io.BufferInfo
Type: Interface

Methods:
- int available()
- int length()
- int capacity()

### Class: org.apache.http.io.EofSensor
Type: Interface

Methods:
- boolean isEof()

### Class: org.apache.http.io.HttpMessageParser
Type: Interface

Methods:
- TT parse() throws IOException, HttpException

### Class: org.apache.http.io.HttpMessageParserFactory
Type: Interface

Methods:
- HttpMessageParser<TT> create(SessionInputBuffer, MessageConstraints)

### Class: org.apache.http.io.HttpMessageWriter
Type: Interface

Methods:
- V write(T) throws IOException, HttpException

### Class: org.apache.http.io.HttpMessageWriterFactory
Type: Interface

Methods:
- HttpMessageWriter<TT> create(SessionOutputBuffer)

### Class: org.apache.http.io.HttpTransportMetrics
Type: Interface

Methods:
- long getBytesTransferred()
- void reset()

### Class: org.apache.http.io.SessionInputBuffer
Type: Interface

Methods:
- boolean isDataAvailable(int) throws IOException
- int read(byte[], int, int) throws IOException
- int read(byte[]) throws IOException
- int read() throws IOException
- HttpTransportMetrics getMetrics()
- int readLine(CharArrayBuffer) throws IOException
- String readLine() throws IOException

### Class: org.apache.http.io.SessionOutputBuffer
Type: Interface

Methods:
- void flush() throws IOException
- HttpTransportMetrics getMetrics()
- void writeLine(String) throws IOException
- void writeLine(CharArrayBuffer) throws IOException
- void write(byte[], int, int) throws IOException
- void write(byte[]) throws IOException
- void write(int) throws IOException

## Package: org.apache.http.message

### Class: org.apache.http.message.HeaderValueFormatter
Type: Interface

Methods:
- CharArrayBuffer formatNameValuePair(CharArrayBuffer, NameValuePair, boolean)
- CharArrayBuffer formatElements(CharArrayBuffer, HeaderElement[], boolean)
- CharArrayBuffer formatParameters(CharArrayBuffer, NameValuePair[], boolean)
- CharArrayBuffer formatHeaderElement(CharArrayBuffer, HeaderElement, boolean)

### Class: org.apache.http.message.HeaderValueParser
Type: Interface

Methods:
- HeaderElement parseHeaderElement(CharArrayBuffer, ParserCursor) throws ParseException
- HeaderElement[] parseElements(CharArrayBuffer, ParserCursor) throws ParseException
- NameValuePair parseNameValuePair(CharArrayBuffer, ParserCursor) throws ParseException
- NameValuePair[] parseParameters(CharArrayBuffer, ParserCursor) throws ParseException

### Class: org.apache.http.message.LineFormatter
Type: Interface

Methods:
- CharArrayBuffer formatHeader(CharArrayBuffer, Header)
- CharArrayBuffer formatRequestLine(CharArrayBuffer, RequestLine)
- CharArrayBuffer appendProtocolVersion(CharArrayBuffer, ProtocolVersion)
- CharArrayBuffer formatStatusLine(CharArrayBuffer, StatusLine)

### Class: org.apache.http.message.LineParser
Type: Interface

Methods:
- Header parseHeader(CharArrayBuffer) throws ParseException
- boolean hasProtocolVersion(CharArrayBuffer, ParserCursor)
- StatusLine parseStatusLine(CharArrayBuffer, ParserCursor) throws ParseException
- ProtocolVersion parseProtocolVersion(CharArrayBuffer, ParserCursor) throws ParseException
- RequestLine parseRequestLine(CharArrayBuffer, ParserCursor) throws ParseException

### Class: org.apache.http.message.AbstractHttpMessage
Type: Abstract Class
Implements: org.apache.http.HttpMessage

Methods:
- void removeHeader(Header)
- HeaderIterator headerIterator()
- HeaderIterator headerIterator(String)
- void setHeaders(Header[])
- void addHeader(Header)
- void addHeader(String, String)
- Header[] getHeaders(String)
- Header getFirstHeader(String)
- Header getLastHeader(String)
- Header[] getAllHeaders()
- void removeHeaders(String)
- boolean containsHeader(String)
- HttpParams getParams()
- void setHeader(Header)
- void setHeader(String, String)
- void setParams(HttpParams)

### Class: org.apache.http.message.BasicHeader
Type: Class
Implements: org.apache.http.Header, java.lang.Cloneable, java.io.Serializable

Methods:
- String getValue()
- String getName()
- HeaderElement[] getElements() throws ParseException
- Object clone() throws CloneNotSupportedException
- String toString()

### Class: org.apache.http.message.BasicHeaderElement
Type: Class
Implements: org.apache.http.HeaderElement, java.lang.Cloneable

Methods:
- String getValue()
- String getName()
- int getParameterCount()
- int hashCode()
- boolean equals(Object)
- Object clone() throws CloneNotSupportedException
- NameValuePair[] getParameters()
- String toString()
- NameValuePair getParameterByName(String)
- NameValuePair getParameter(int)

### Class: org.apache.http.message.BasicHeaderElementIterator
Type: Class
Implements: org.apache.http.HeaderElementIterator

Methods:
- Object next() throws NoSuchElementException
- boolean hasNext()
- void remove() throws UnsupportedOperationException
- HeaderElement nextElement() throws NoSuchElementException

### Class: org.apache.http.message.BasicHeaderIterator
Type: Class
Implements: org.apache.http.HeaderIterator

Methods:
- Object next() throws NoSuchElementException
- Header nextHeader() throws NoSuchElementException
- boolean hasNext()
- void remove() throws UnsupportedOperationException

### Class: org.apache.http.message.BasicHeaderValueFormatter
Type: Class
Implements: org.apache.http.message.HeaderValueFormatter

Methods:
- **static** String formatNameValuePair(NameValuePair, boolean, HeaderValueFormatter)
- CharArrayBuffer formatNameValuePair(CharArrayBuffer, NameValuePair, boolean)
- **static** String formatElements(HeaderElement[], boolean, HeaderValueFormatter)
- CharArrayBuffer formatElements(CharArrayBuffer, HeaderElement[], boolean)
- **static** String formatParameters(NameValuePair[], boolean, HeaderValueFormatter)
- CharArrayBuffer formatParameters(CharArrayBuffer, NameValuePair[], boolean)
- **static** String formatHeaderElement(HeaderElement, boolean, HeaderValueFormatter)
- CharArrayBuffer formatHeaderElement(CharArrayBuffer, HeaderElement, boolean)

### Class: org.apache.http.message.BasicHeaderValueParser
Type: Class
Implements: org.apache.http.message.HeaderValueParser

Methods:
- **static** HeaderElement parseHeaderElement(String, HeaderValueParser) throws ParseException
- HeaderElement parseHeaderElement(CharArrayBuffer, ParserCursor)
- **static** HeaderElement[] parseElements(String, HeaderValueParser) throws ParseException
- HeaderElement[] parseElements(CharArrayBuffer, ParserCursor)
- **static** NameValuePair parseNameValuePair(String, HeaderValueParser) throws ParseException
- NameValuePair parseNameValuePair(CharArrayBuffer, ParserCursor)
- NameValuePair parseNameValuePair(CharArrayBuffer, ParserCursor, char[])
- **static** NameValuePair[] parseParameters(String, HeaderValueParser) throws ParseException
- NameValuePair[] parseParameters(CharArrayBuffer, ParserCursor)

### Class: org.apache.http.message.BasicHttpEntityEnclosingRequest
Type: Class
Extends: org.apache.http.message.BasicHttpRequest
Implements: org.apache.http.HttpEntityEnclosingRequest

Methods:
- boolean expectContinue()
- HttpEntity getEntity()
- void setEntity(HttpEntity)

### Class: org.apache.http.message.BasicHttpRequest
Type: Class
Extends: org.apache.http.message.AbstractHttpMessage
Implements: org.apache.http.HttpRequest

Methods:
- ProtocolVersion getProtocolVersion()
- RequestLine getRequestLine()
- String toString()

### Class: org.apache.http.message.BasicHttpResponse
Type: Class
Extends: org.apache.http.message.AbstractHttpMessage
Implements: org.apache.http.HttpResponse

Methods:
- void setStatusLine(StatusLine)
- void setStatusLine(ProtocolVersion, int)
- void setStatusLine(ProtocolVersion, int, String)
- ProtocolVersion getProtocolVersion()
- void setStatusCode(int)
- StatusLine getStatusLine()
- String toString()
- void setReasonPhrase(String)
- HttpEntity getEntity()
- Locale getLocale()
- void setLocale(Locale)
- void setEntity(HttpEntity)

### Class: org.apache.http.message.BasicLineFormatter
Type: Class
Implements: org.apache.http.message.LineFormatter

Methods:
- **static** String formatHeader(Header, LineFormatter)
- CharArrayBuffer formatHeader(CharArrayBuffer, Header)
- **static** String formatRequestLine(RequestLine, LineFormatter)
- CharArrayBuffer formatRequestLine(CharArrayBuffer, RequestLine)
- **static** String formatProtocolVersion(ProtocolVersion, LineFormatter)
- CharArrayBuffer appendProtocolVersion(CharArrayBuffer, ProtocolVersion)
- **static** String formatStatusLine(StatusLine, LineFormatter)
- CharArrayBuffer formatStatusLine(CharArrayBuffer, StatusLine)

### Class: org.apache.http.message.BasicLineParser
Type: Class
Implements: org.apache.http.message.LineParser

Methods:
- **static** Header parseHeader(String, LineParser) throws ParseException
- Header parseHeader(CharArrayBuffer) throws ParseException
- boolean hasProtocolVersion(CharArrayBuffer, ParserCursor)
- **static** StatusLine parseStatusLine(String, LineParser) throws ParseException
- StatusLine parseStatusLine(CharArrayBuffer, ParserCursor) throws ParseException
- **static** ProtocolVersion parseProtocolVersion(String, LineParser) throws ParseException
- ProtocolVersion parseProtocolVersion(CharArrayBuffer, ParserCursor) throws ParseException
- **static** RequestLine parseRequestLine(String, LineParser) throws ParseException
- RequestLine parseRequestLine(CharArrayBuffer, ParserCursor) throws ParseException

### Class: org.apache.http.message.BasicListHeaderIterator
Type: Class
Implements: org.apache.http.HeaderIterator

Methods:
- Object next() throws NoSuchElementException
- Header nextHeader() throws NoSuchElementException
- boolean hasNext()
- void remove() throws UnsupportedOperationException

### Class: org.apache.http.message.BasicNameValuePair
Type: Class
Implements: org.apache.http.NameValuePair, java.lang.Cloneable, java.io.Serializable

Methods:
- String getValue()
- String getName()
- int hashCode()
- boolean equals(Object)
- Object clone() throws CloneNotSupportedException
- String toString()

### Class: org.apache.http.message.BasicRequestLine
Type: Class
Implements: org.apache.http.RequestLine, java.lang.Cloneable, java.io.Serializable

Methods:
- ProtocolVersion getProtocolVersion()
- Object clone() throws CloneNotSupportedException
- String toString()
- String getMethod()
- String getUri()

### Class: org.apache.http.message.BasicStatusLine
Type: Class
Implements: org.apache.http.StatusLine, java.lang.Cloneable, java.io.Serializable

Methods:
- ProtocolVersion getProtocolVersion()
- int getStatusCode()
- Object clone() throws CloneNotSupportedException
- String toString()
- String getReasonPhrase()

### Class: org.apache.http.message.BasicTokenIterator
Type: Class
Implements: org.apache.http.TokenIterator

Methods:
- Object next() throws NoSuchElementException, ParseException
- String nextToken() throws NoSuchElementException, ParseException
- boolean hasNext()
- void remove() throws UnsupportedOperationException

### Class: org.apache.http.message.BufferedHeader
Type: Class
Implements: org.apache.http.FormattedHeader, java.lang.Cloneable, java.io.Serializable

Methods:
- String getValue()
- String getName()
- CharArrayBuffer getBuffer()
- int getValuePos()
- HeaderElement[] getElements() throws ParseException
- Object clone() throws CloneNotSupportedException
- String toString()

### Class: org.apache.http.message.HeaderGroup
Type: Class
Implements: java.lang.Cloneable, java.io.Serializable

Methods:
- Header getCondensedHeader(String)
- void setHeaders(Header[])
- void updateHeader(Header)
- void addHeader(Header)
- Header[] getHeaders(String)
- Header getFirstHeader(String)
- Header getLastHeader(String)
- void clear()
- Header[] getAllHeaders()
- void removeHeader(Header)
- HeaderIterator iterator()
- HeaderIterator iterator(String)
- Object clone() throws CloneNotSupportedException
- String toString()
- HeaderGroup copy()
- boolean containsHeader(String)

### Class: org.apache.http.message.ParserCursor
Type: Class

Methods:
- boolean atEnd()
- int getPos()
- String toString()
- void updatePos(int)
- int getUpperBound()
- int getLowerBound()

### Class: org.apache.http.message.TokenParser
Type: Class

Methods:
- void copyQuotedContent(CharArrayBuffer, ParserCursor, StringBuilder)
- void copyContent(CharArrayBuffer, ParserCursor, BitSet, StringBuilder)
- void copyUnquotedContent(CharArrayBuffer, ParserCursor, BitSet, StringBuilder)
- String parseToken(CharArrayBuffer, ParserCursor, BitSet)
- String parseValue(CharArrayBuffer, ParserCursor, BitSet)
- **static** boolean isWhitespace(char)
- void skipWhiteSpace(CharArrayBuffer, ParserCursor)
- **static** BitSet INIT_BITSET(int[])

## Package: org.apache.http.params

### Class: org.apache.http.params.CoreConnectionPNames
Type: Interface

No public methods found

### Class: org.apache.http.params.CoreProtocolPNames
Type: Interface

No public methods found

### Class: org.apache.http.params.HttpParams
Type: Interface

Methods:
- double getDoubleParameter(String, double)
- HttpParams setIntParameter(String, int)
- boolean isParameterFalse(String)
- boolean isParameterTrue(String)
- HttpParams setLongParameter(String, long)
- boolean getBooleanParameter(String, boolean)
- HttpParams setDoubleParameter(String, double)
- long getLongParameter(String, long)
- HttpParams setParameter(String, Object)
- HttpParams copy()
- int getIntParameter(String, int)
- HttpParams setBooleanParameter(String, boolean)
- boolean removeParameter(String)
- Object getParameter(String)

### Class: org.apache.http.params.HttpParamsNames
Type: Interface

Methods:
- Set<String> getNames()

### Class: org.apache.http.params.AbstractHttpParams
Type: Abstract Class
Implements: org.apache.http.params.HttpParams, org.apache.http.params.HttpParamsNames

Methods:
- boolean getBooleanParameter(String, boolean)
- HttpParams setDoubleParameter(String, double)
- double getDoubleParameter(String, double)
- long getLongParameter(String, long)
- HttpParams setIntParameter(String, int)
- Set<String> getNames()
- boolean isParameterFalse(String)
- boolean isParameterTrue(String)
- int getIntParameter(String, int)
- HttpParams setBooleanParameter(String, boolean)
- HttpParams setLongParameter(String, long)

### Class: org.apache.http.params.BasicHttpParams
Type: Class
Extends: org.apache.http.params.AbstractHttpParams
Implements: java.io.Serializable, java.lang.Cloneable

Methods:
- void setParameters(String[], Object)
- boolean isParameterSetLocally(String)
- void copyParams(HttpParams)
- Object clone() throws CloneNotSupportedException
- void clear()
- HttpParams setParameter(String, Object)
- String toString()
- Set<String> getNames()
- HttpParams copy()
- boolean isParameterSet(String)
- boolean removeParameter(String)
- Object getParameter(String)

### Class: org.apache.http.params.DefaultedHttpParams
Type: Class
Extends: org.apache.http.params.AbstractHttpParams

Methods:
- Set<String> getDefaultNames()
- HttpParams setParameter(String, Object)
- HttpParams getDefaults()
- Set<String> getNames()
- HttpParams copy()
- Set<String> getLocalNames()
- boolean removeParameter(String)
- Object getParameter(String)

### Class: org.apache.http.params.HttpAbstractParamBean
Type: Abstract Class

No public methods found

### Class: org.apache.http.params.HttpConnectionParamBean
Type: Class
Extends: org.apache.http.params.HttpAbstractParamBean

Methods:
- void setLinger(int)
- void setTcpNoDelay(boolean)
- void setConnectionTimeout(int)
- void setSocketBufferSize(int)
- void setSoTimeout(int)
- void setStaleCheckingEnabled(boolean)

### Class: org.apache.http.params.HttpConnectionParams
Type: Class
Implements: org.apache.http.params.CoreConnectionPNames

Methods:
- **static** void setSoReuseaddr(HttpParams, boolean)
- **static** int getLinger(HttpParams)
- **static** void setTcpNoDelay(HttpParams, boolean)
- **static** void setConnectionTimeout(HttpParams, int)
- **static** void setSoTimeout(HttpParams, int)
- **static** boolean getSoReuseaddr(HttpParams)
- **static** void setLinger(HttpParams, int)
- **static** boolean getTcpNoDelay(HttpParams)
- **static** int getSocketBufferSize(HttpParams)
- **static** void setSocketBufferSize(HttpParams, int)
- **static** int getSoTimeout(HttpParams)
- **static** void setSoKeepalive(HttpParams, boolean)
- **static** boolean isStaleCheckingEnabled(HttpParams)
- **static** boolean getSoKeepalive(HttpParams)
- **static** void setStaleCheckingEnabled(HttpParams, boolean)
- **static** int getConnectionTimeout(HttpParams)

### Class: org.apache.http.params.HttpParamConfig
Type: Class

Methods:
- **static** SocketConfig getSocketConfig(HttpParams)
- **static** ConnectionConfig getConnectionConfig(HttpParams)
- **static** MessageConstraints getMessageConstraints(HttpParams)

### Class: org.apache.http.params.HttpProtocolParamBean
Type: Class
Extends: org.apache.http.params.HttpAbstractParamBean

Methods:
- void setVersion(HttpVersion)
- void setHttpElementCharset(String)
- void setUserAgent(String)
- void setUseExpectContinue(boolean)
- void setContentCharset(String)

### Class: org.apache.http.params.HttpProtocolParams
Type: Class
Implements: org.apache.http.params.CoreProtocolPNames

Methods:
- **static** ProtocolVersion getVersion(HttpParams)
- **static** CodingErrorAction getUnmappableInputAction(HttpParams)
- **static** void setUnmappableInputAction(HttpParams, CodingErrorAction)
- **static** void setVersion(HttpParams, ProtocolVersion)
- **static** CodingErrorAction getMalformedInputAction(HttpParams)
- **static** void setUserAgent(HttpParams, String)
- **static** String getHttpElementCharset(HttpParams)
- **static** boolean useExpectContinue(HttpParams)
- **static** void setHttpElementCharset(HttpParams, String)
- **static** void setMalformedInputAction(HttpParams, CodingErrorAction)
- **static** String getUserAgent(HttpParams)
- **static** void setUseExpectContinue(HttpParams, boolean)
- **static** String getContentCharset(HttpParams)
- **static** void setContentCharset(HttpParams, String)

### Class: org.apache.http.params.SyncBasicHttpParams
Type: Class
Extends: org.apache.http.params.BasicHttpParams

Methods:
- void setParameters(String[], Object)
- boolean isParameterSetLocally(String)
- Object clone() throws CloneNotSupportedException
- void clear()
- HttpParams setParameter(String, Object)
- boolean isParameterSet(String)
- boolean removeParameter(String)
- Object getParameter(String)

## Package: org.apache.http.pool

### Class: org.apache.http.pool.ConnFactory
Type: Interface

Methods:
- TC create(T) throws IOException

### Class: org.apache.http.pool.ConnPool
Type: Interface

Methods:
- V release(T, E)
- Future<TE> lease(T, T, ;)

### Class: org.apache.http.pool.ConnPoolControl
Type: Interface

Methods:
- PoolStats getStats(T)
- int getDefaultMaxPerRoute()
- void setDefaultMaxPerRoute(int)
- int getMaxTotal()
- V setMaxPerRoute(T, T)
- void setMaxTotal(int)
- I getMaxPerRoute(T)
- PoolStats getTotalStats()

### Class: org.apache.http.pool.PoolEntryCallback
Type: Interface

Methods:
- V process(PoolEntry<TT, TC>)

### Class: org.apache.http.pool.AbstractConnPool
Type: Abstract Class
Implements: org.apache.http.pool.ConnPool, org.apache.http.pool.ConnPoolControl

Methods:
- PoolStats getStats(T)
- int getDefaultMaxPerRoute()
- void setDefaultMaxPerRoute(int)
- int getMaxTotal()
- V release(T, E)
- void release(Object, boolean)
- void closeExpired()
- void setMaxTotal(int)
- I getMaxPerRoute(T)
- Set<TT> getRoutes()
- void closeIdle(long, TimeUnit)
- int getValidateAfterInactivity()
- void setValidateAfterInactivity(int)
- V setMaxPerRoute(T, T)
- String toString()
- Future<TE> lease(T, T, ;)
- Future<TE> lease(T, T)
- PoolStats getTotalStats()
- void shutdown() throws IOException
- boolean isShutdown()

### Class: org.apache.http.pool.PoolEntry
Type: Abstract Class

Methods:
- long getExpiry()
- long getCreated()
- String getId()
- long getValidUnit()
- TT getRoute()
- long getUpdated()
- TC getConnection()
- Object getState()
- boolean isClosed()
- void updateExpiry(long, TimeUnit)
- long getValidityDeadline()
- void setState(Object)
- String toString()
- boolean isExpired(long)
- void close()

### Class: org.apache.http.pool.PoolStats
Type: Class
Implements: java.io.Serializable

Methods:
- int getMax()
- String toString()
- int getPending()
- int getAvailable()
- int getLeased()

## Package: org.apache.http.protocol

### Class: org.apache.http.protocol.ExecutionContext
Type: Interface

No public methods found

### Class: org.apache.http.protocol.HttpContext
Type: Interface

Methods:
- void setAttribute(String, Object)
- Object getAttribute(String)
- Object removeAttribute(String)

### Class: org.apache.http.protocol.HttpExpectationVerifier
Type: Interface

Methods:
- void verify(HttpRequest, HttpResponse, HttpContext) throws HttpException

### Class: org.apache.http.protocol.HttpProcessor
Type: Interface
Implements: org.apache.http.HttpRequestInterceptor, org.apache.http.HttpResponseInterceptor

No public methods found

### Class: org.apache.http.protocol.HttpRequestHandler
Type: Interface

Methods:
- void handle(HttpRequest, HttpResponse, HttpContext) throws HttpException, IOException

### Class: org.apache.http.protocol.HttpRequestHandlerMapper
Type: Interface

Methods:
- HttpRequestHandler lookup(HttpRequest)

### Class: org.apache.http.protocol.HttpRequestHandlerResolver
Type: Interface

Methods:
- HttpRequestHandler lookup(String)

### Class: org.apache.http.protocol.HttpRequestInterceptorList
Type: Interface

Methods:
- void clearRequestInterceptors()
- HttpRequestInterceptor getRequestInterceptor(int)
- int getRequestInterceptorCount()
- V setInterceptors(List<*>)
- V removeRequestInterceptorByClass(Class<HttpRequestInterceptor>)
- void addRequestInterceptor(HttpRequestInterceptor)
- void addRequestInterceptor(HttpRequestInterceptor, int)

### Class: org.apache.http.protocol.HttpResponseInterceptorList
Type: Interface

Methods:
- V removeResponseInterceptorByClass(Class<HttpResponseInterceptor>)
- HttpResponseInterceptor getResponseInterceptor(int)
- void clearResponseInterceptors()
- int getResponseInterceptorCount()
- void addResponseInterceptor(HttpResponseInterceptor)
- void addResponseInterceptor(HttpResponseInterceptor, int)
- V setInterceptors(List<*>)

### Class: org.apache.http.protocol.BasicHttpContext
Type: Class
Implements: org.apache.http.protocol.HttpContext

Methods:
- void setAttribute(String, Object)
- Object getAttribute(String)
- void clear()
- String toString()
- Object removeAttribute(String)

### Class: org.apache.http.protocol.BasicHttpProcessor
Type: Class
Implements: org.apache.http.protocol.HttpProcessor, org.apache.http.protocol.HttpRequestInterceptorList, org.apache.http.protocol.HttpResponseInterceptorList, java.lang.Cloneable

Methods:
- void process(HttpRequest, HttpContext) throws IOException, HttpException
- void process(HttpResponse, HttpContext) throws IOException, HttpException
- V removeResponseInterceptorByClass(Class<HttpResponseInterceptor>)
- void clearResponseInterceptors()
- int getResponseInterceptorCount()
- V removeRequestInterceptorByClass(Class<HttpRequestInterceptor>)
- void addRequestInterceptor(HttpRequestInterceptor)
- void addRequestInterceptor(HttpRequestInterceptor, int)
- void clearInterceptors()
- void addInterceptor(HttpRequestInterceptor)
- void addInterceptor(HttpRequestInterceptor, int)
- void addInterceptor(HttpResponseInterceptor)
- void addInterceptor(HttpResponseInterceptor, int)
- void clearRequestInterceptors()
- Object clone() throws CloneNotSupportedException
- HttpResponseInterceptor getResponseInterceptor(int)
- HttpRequestInterceptor getRequestInterceptor(int)
- BasicHttpProcessor copy()
- int getRequestInterceptorCount()
- void addResponseInterceptor(HttpResponseInterceptor, int)
- void addResponseInterceptor(HttpResponseInterceptor)
- V setInterceptors(List<*>)

### Class: org.apache.http.protocol.DefaultedHttpContext
Type: Class
Implements: org.apache.http.protocol.HttpContext

Methods:
- void setAttribute(String, Object)
- Object getAttribute(String)
- HttpContext getDefaults()
- String toString()
- Object removeAttribute(String)

### Class: org.apache.http.protocol.HTTP
Type: Class

Methods:
- **static** boolean isWhitespace(char)

### Class: org.apache.http.protocol.HttpCoreContext
Type: Class
Implements: org.apache.http.protocol.HttpContext

Methods:
- TT getConnection(Class<TT>)
- HttpConnection getConnection()
- void setAttribute(String, Object)
- HttpHost getTargetHost()
- Object getAttribute(String)
- TT getAttribute(String, Class<TT>)
- HttpRequest getRequest()
- HttpResponse getResponse()
- **static** HttpCoreContext adapt(HttpContext)
- **static** HttpCoreContext create()
- void setTargetHost(HttpHost)
- Object removeAttribute(String)
- boolean isRequestSent()

### Class: org.apache.http.protocol.HttpDateGenerator
Type: Class

Methods:
- String getCurrentDate()

### Class: org.apache.http.protocol.HttpProcessorBuilder
Type: Class

Methods:
- HttpProcessorBuilder add(HttpRequestInterceptor)
- HttpProcessorBuilder add(HttpResponseInterceptor)
- HttpProcessorBuilder addLast(HttpRequestInterceptor)
- HttpProcessorBuilder addLast(HttpResponseInterceptor)
- HttpProcessor build()
- HttpProcessorBuilder addAll(HttpRequestInterceptor[])
- HttpProcessorBuilder addAll(HttpResponseInterceptor[])
- HttpProcessorBuilder addAllFirst(HttpRequestInterceptor[])
- HttpProcessorBuilder addAllFirst(HttpResponseInterceptor[])
- **static** HttpProcessorBuilder create()
- HttpProcessorBuilder addAllLast(HttpRequestInterceptor[])
- HttpProcessorBuilder addAllLast(HttpResponseInterceptor[])
- HttpProcessorBuilder addFirst(HttpRequestInterceptor)
- HttpProcessorBuilder addFirst(HttpResponseInterceptor)

### Class: org.apache.http.protocol.HttpRequestExecutor
Type: Class

Methods:
- void preProcess(HttpRequest, HttpProcessor, HttpContext) throws HttpException, IOException
- void postProcess(HttpResponse, HttpProcessor, HttpContext) throws HttpException, IOException
- HttpResponse execute(HttpRequest, HttpClientConnection, HttpContext) throws IOException, HttpException

### Class: org.apache.http.protocol.HttpRequestHandlerRegistry
Type: Class
Implements: org.apache.http.protocol.HttpRequestHandlerResolver

Methods:
- HttpRequestHandler lookup(String)
- Map<String, HttpRequestHandler> getHandlers()
- void unregister(String)
- V setHandlers(Map<String, HttpRequestHandler>)
- void register(String, HttpRequestHandler)

### Class: org.apache.http.protocol.HttpService
Type: Class

Methods:
- void setExpectationVerifier(HttpExpectationVerifier)
- void setConnReuseStrategy(ConnectionReuseStrategy)
- void setResponseFactory(HttpResponseFactory)
- void setHandlerResolver(HttpRequestHandlerResolver)
- void handleRequest(HttpServerConnection, HttpContext) throws IOException, HttpException
- void setHttpProcessor(HttpProcessor)
- HttpParams getParams()
- void setParams(HttpParams)

### Class: org.apache.http.protocol.ImmutableHttpProcessor
Type: Class
Implements: org.apache.http.protocol.HttpProcessor

Methods:
- void process(HttpRequest, HttpContext) throws IOException, HttpException
- void process(HttpResponse, HttpContext) throws IOException, HttpException

### Class: org.apache.http.protocol.RequestConnControl
Type: Class
Implements: org.apache.http.HttpRequestInterceptor

Methods:
- void process(HttpRequest, HttpContext) throws HttpException, IOException

### Class: org.apache.http.protocol.RequestContent
Type: Class
Implements: org.apache.http.HttpRequestInterceptor

Methods:
- void process(HttpRequest, HttpContext) throws HttpException, IOException

### Class: org.apache.http.protocol.RequestDate
Type: Class
Implements: org.apache.http.HttpRequestInterceptor

Methods:
- void process(HttpRequest, HttpContext) throws HttpException, IOException

### Class: org.apache.http.protocol.RequestExpectContinue
Type: Class
Implements: org.apache.http.HttpRequestInterceptor

Methods:
- void process(HttpRequest, HttpContext) throws HttpException, IOException

### Class: org.apache.http.protocol.RequestTargetHost
Type: Class
Implements: org.apache.http.HttpRequestInterceptor

Methods:
- void process(HttpRequest, HttpContext) throws HttpException, IOException

### Class: org.apache.http.protocol.RequestUserAgent
Type: Class
Implements: org.apache.http.HttpRequestInterceptor

Methods:
- void process(HttpRequest, HttpContext) throws HttpException, IOException

### Class: org.apache.http.protocol.ResponseConnControl
Type: Class
Implements: org.apache.http.HttpResponseInterceptor

Methods:
- void process(HttpResponse, HttpContext) throws HttpException, IOException

### Class: org.apache.http.protocol.ResponseContent
Type: Class
Implements: org.apache.http.HttpResponseInterceptor

Methods:
- void process(HttpResponse, HttpContext) throws HttpException, IOException

### Class: org.apache.http.protocol.ResponseDate
Type: Class
Implements: org.apache.http.HttpResponseInterceptor

Methods:
- void process(HttpResponse, HttpContext) throws HttpException, IOException

### Class: org.apache.http.protocol.ResponseServer
Type: Class
Implements: org.apache.http.HttpResponseInterceptor

Methods:
- void process(HttpResponse, HttpContext) throws HttpException, IOException

### Class: org.apache.http.protocol.SyncBasicHttpContext
Type: Class
Extends: org.apache.http.protocol.BasicHttpContext

Methods:
- void setAttribute(String, Object)
- Object getAttribute(String)
- void clear()
- Object removeAttribute(String)

### Class: org.apache.http.protocol.UriHttpRequestHandlerMapper
Type: Class
Implements: org.apache.http.protocol.HttpRequestHandlerMapper

Methods:
- HttpRequestHandler lookup(HttpRequest)
- void unregister(String)
- void register(String, HttpRequestHandler)

### Class: org.apache.http.protocol.UriPatternMatcher
Type: Class

Methods:
- V setObjects(Map<String, TT>)
- TT lookup(String)
- Set<Map$Entry<String, TT>> entrySet()
- void unregister(String)
- V setHandlers(Map<String, TT>)
- String toString()
- Map<String, TT> getObjects()
- V register(String, T)

## Package: org.apache.http.ssl

### Class: org.apache.http.ssl.PrivateKeyStrategy
Type: Interface

Methods:
- String chooseAlias(Map<String, PrivateKeyDetails>, Socket)

### Class: org.apache.http.ssl.TrustStrategy
Type: Interface

Methods:
- boolean isTrusted(X509Certificate[], String) throws CertificateException

### Class: org.apache.http.ssl.PrivateKeyDetails
Type: Class

Methods:
- X509Certificate[] getCertChain()
- String getType()
- String toString()

### Class: org.apache.http.ssl.SSLContextBuilder
Type: Class

Methods:
- SSLContextBuilder setKeyManagerFactoryAlgorithm(String)
- SSLContext build() throws NoSuchAlgorithmException, KeyManagementException
- SSLContextBuilder loadKeyMaterial(KeyStore, char[], PrivateKeyStrategy) throws NoSuchAlgorithmException, KeyStoreException, UnrecoverableKeyException
- SSLContextBuilder loadKeyMaterial(KeyStore, char[]) throws NoSuchAlgorithmException, KeyStoreException, UnrecoverableKeyException
- SSLContextBuilder loadKeyMaterial(File, char[], char[], PrivateKeyStrategy) throws NoSuchAlgorithmException, KeyStoreException, UnrecoverableKeyException, CertificateException, IOException
- SSLContextBuilder loadKeyMaterial(File, char[], char[]) throws NoSuchAlgorithmException, KeyStoreException, UnrecoverableKeyException, CertificateException, IOException
- SSLContextBuilder loadKeyMaterial(URL, char[], char[], PrivateKeyStrategy) throws NoSuchAlgorithmException, KeyStoreException, UnrecoverableKeyException, CertificateException, IOException
- SSLContextBuilder loadKeyMaterial(URL, char[], char[]) throws NoSuchAlgorithmException, KeyStoreException, UnrecoverableKeyException, CertificateException, IOException
- SSLContextBuilder loadTrustMaterial(KeyStore, TrustStrategy) throws NoSuchAlgorithmException, KeyStoreException
- SSLContextBuilder loadTrustMaterial(TrustStrategy) throws NoSuchAlgorithmException, KeyStoreException
- SSLContextBuilder loadTrustMaterial(File, char[], TrustStrategy) throws NoSuchAlgorithmException, KeyStoreException, CertificateException, IOException
- SSLContextBuilder loadTrustMaterial(File, char[]) throws NoSuchAlgorithmException, KeyStoreException, CertificateException, IOException
- SSLContextBuilder loadTrustMaterial(File) throws NoSuchAlgorithmException, KeyStoreException, CertificateException, IOException
- SSLContextBuilder loadTrustMaterial(URL, char[], TrustStrategy) throws NoSuchAlgorithmException, KeyStoreException, CertificateException, IOException
- SSLContextBuilder loadTrustMaterial(URL, char[]) throws NoSuchAlgorithmException, KeyStoreException, CertificateException, IOException
- SSLContextBuilder setProvider(Provider)
- SSLContextBuilder setProvider(String)
- SSLContextBuilder setKeyStoreType(String)
- SSLContextBuilder setProtocol(String)
- SSLContextBuilder useProtocol(String)
- SSLContextBuilder setSecureRandom(SecureRandom)
- **static** SSLContextBuilder create()
- String toString()
- SSLContextBuilder setTrustManagerFactoryAlgorithm(String)

### Class: org.apache.http.ssl.SSLContexts
Type: Class

Methods:
- **static** SSLContext createSystemDefault() throws SSLInitializationException
- **static** SSLContextBuilder custom()
- **static** SSLContext createDefault() throws SSLInitializationException

### Class: org.apache.http.ssl.SSLInitializationException
Type: Class
Extends: java.lang.IllegalStateException

No public methods found

## Package: org.apache.http.util

### Class: org.apache.http.util.Args
Type: Class

Methods:
- **static** TT containsNoBlanks(T, T)
- **static** TT notNull(T, T)
- **static** int notNegative(int, String)
- **static** long notNegative(long, String)
- **static** TT notBlank(T, T)
- **static** int positive(int, String)
- **static** long positive(long, String)
- **static** void check(boolean, String)
- **static** void check(boolean, String, Object[])
- **static** void check(boolean, String, Object)
- **static** TT notEmpty(T, T)
- **static** TT notEmpty(T, T)

### Class: org.apache.http.util.Asserts
Type: Class

Methods:
- **static** void notNull(Object, String)
- **static** void notBlank(CharSequence, String)
- **static** void check(boolean, String)
- **static** void check(boolean, String, Object[])
- **static** void check(boolean, String, Object)
- **static** void notEmpty(CharSequence, String)

### Class: org.apache.http.util.ByteArrayBuffer
Type: Class
Implements: java.io.Serializable

Methods:
- int byteAt(int)
- void setLength(int)
- byte[] toByteArray()
- boolean isEmpty()
- int length()
- void clear()
- boolean isFull()
- byte[] buffer()
- void ensureCapacity(int)
- int indexOf(byte, int, int)
- int indexOf(byte)
- void append(byte[], int, int)
- void append(int)
- void append(char[], int, int)
- void append(CharArrayBuffer, int, int)
- int capacity()

### Class: org.apache.http.util.CharArrayBuffer
Type: Class
Implements: java.lang.CharSequence, java.io.Serializable

Methods:
- char[] toCharArray()
- boolean isEmpty()
- int length()
- void clear()
- CharSequence subSequence(int, int)
- String substring(int, int)
- String substringTrimmed(int, int)
- int capacity()
- void setLength(int)
- String toString()
- boolean isFull()
- void ensureCapacity(int)
- char[] buffer()
- int indexOf(int, int, int)
- int indexOf(int)
- char charAt(int)
- void append(char[], int, int)
- void append(String)
- void append(CharArrayBuffer, int, int)
- void append(CharArrayBuffer)
- void append(char)
- void append(byte[], int, int)
- void append(ByteArrayBuffer, int, int)
- void append(Object)

### Class: org.apache.http.util.CharsetUtils
Type: Class

Methods:
- **static** Charset lookup(String)
- **static** Charset get(String) throws UnsupportedEncodingException

### Class: org.apache.http.util.EncodingUtils
Type: Class

Methods:
- **static** String getAsciiString(byte[], int, int)
- **static** String getAsciiString(byte[])
- **static** String getString(byte[], int, int, String)
- **static** String getString(byte[], String)
- **static** byte[] getAsciiBytes(String)
- **static** byte[] getBytes(String, String)

### Class: org.apache.http.util.EntityUtils
Type: Class

Methods:
- **static** void updateEntity(HttpResponse, HttpEntity) throws IOException
- **static** void consumeQuietly(HttpEntity)
- **static** byte[] toByteArray(HttpEntity) throws IOException
- **static** String getContentCharSet(HttpEntity) throws ParseException
- **static** String toString(HttpEntity, Charset) throws IOException, ParseException
- **static** String toString(HttpEntity, String) throws IOException, ParseException
- **static** String toString(HttpEntity) throws IOException, ParseException
- **static** void consume(HttpEntity) throws IOException
- **static** String getContentMimeType(HttpEntity) throws ParseException

### Class: org.apache.http.util.ExceptionUtils
Type: Class

Methods:
- **static** void initCause(Throwable, Throwable)

### Class: org.apache.http.util.LangUtils
Type: Class

Methods:
- **static** int hashCode(int, int)
- **static** int hashCode(int, boolean)
- **static** int hashCode(int, Object)
- **static** boolean equals(Object, Object)
- **static** boolean equals(Object[], Object[])

### Class: org.apache.http.util.NetUtils
Type: Class

Methods:
- **static** void formatAddress(StringBuilder, SocketAddress)

### Class: org.apache.http.util.TextUtils
Type: Class

Methods:
- **static** boolean containsBlanks(CharSequence)
- **static** boolean isEmpty(CharSequence)
- **static** boolean isBlank(CharSequence)

### Class: org.apache.http.util.VersionInfo
Type: Class

Methods:
- String getModule()
- String getPackage()
- String getTimestamp()
- **static** String getUserAgent(String, String, Class<*>)
- String toString()
- **static** VersionInfo[] loadVersionInfo(String[], ClassLoader)
- **static** VersionInfo loadVersionInfo(String, ClassLoader)
- String getClassloader()
- String getRelease()

