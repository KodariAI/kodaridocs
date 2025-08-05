# KodariDocs

Official documentation service for [Kodari.ai](https://kodari.ai) - providing AI with up-to-date API knowledge for Minecraft plugin development.

## What is this?

This microservice serves API documentation that helps Kodari understand the latest Minecraft/Bukkit/Spigot/Paper APIs without relying on outdated training data.

## Contributing Documentation

We welcome community contributions! Add your documentation to help make Kodari smarter.

### Quick Start

1. Fork this repository
2. Add your `.md` file to `src/main/resources/docs/`
3. Submit a pull request

### Documentation Format

Create markdown files with clear API references:

```markdown
# YourPlugin API

## Classes

### com.example.YourMainClass
Methods:
- void doSomething(String param)
- String getSomething()
```

### Naming Convention

- File: `your-plugin-name.md` (lowercase, hyphens)
- Content: Focus on method signatures and basic usage

## Auto-generating Documentation
We provide a tool to automatically generate docs from JAR files.

### Using the Auto-generator

1. Place your JAR files in `autogen/src/main/resources/input/`
2. Choose your scanning mode and run from project root:

#### Mode 1: Full JAR Scan (default)
```bash
# Scan entire JAR
./gradlew :autogen:run

# Or explicitly
./gradlew :autogen:run --args="full"
```

### Mode 2: Package-Specific Scan
```bash
# Scan only specific package
./gradlew :autogen:run --args="package com.example.api"

# Works with both dot and slash notation
./gradlew :autogen:run --args="package com/example/api"
```

3. Check `autogen/src/main/resources/output/` for generated docs
4. Review and copy good docs to `src/main/resources/docs/`

## Examples

### Example 1: Full JAR Scan
```bash
# Clone the repo
git clone https://github.com/KodariAI/kodaridocs.git
cd kodaridocs

# Add your JAR
cp ~/spigot-api-1.20.4.jar autogen/src/main/resources/input/

# Generate complete docs
./gradlew :autogen:run

# Check output
cat autogen/src/main/resources/output/spigot-api-1.20.4.md
```

## Example 2: Package-Specific Scan
```bash
# Add your JAR
cp ~/EcoPets.jar autogen/src/main/resources/input/

# Generate docs only for the API package
./gradlew :autogen:run --args="package com.willfp.ecopets.api"

# Output will be named with package suffix
cat autogen/src/main/resources/output/EcoPets-com-willfp-ecopets-api.md
```

## Running Locally

### Prerequisites

1. Create a `.env` file in the project root:
   ```bash
   cp .env.example .env
   ```

2. Add your Anthropic API key to `.env`:
   ```env
   ANTHROPIC_API_KEY=your-api-key-here
   ```

3. Start the service:
   ```gradle
   ./gradlew bootRun
   ```

### Test Endpoints

```bash
# List available docs
curl http://localhost:8083/api/v1/available-docs

# Get specific doc
curl http://localhost:8083/api/v1/docs/minecraft-commands
```

## API Endpoints

- `GET /api/v1/available-docs` - List all available documentation
- `GET /api/v1/docs/{docId}` - Get specific documentation

### Example Responses

**GET /api/v1/available-docs**
```json
[
  "luckperms"
]
```
**GET /api/v1/docs/bukkit-api**
```json
{
  "content": "# Luckperms API Reference\n\n## Package: net.luckperms...",
  "tokens": 4523
}
```

## Guidelines

- ✅ **DO** contribute API references and method signatures
- ✅ **DO** include basic usage examples
- ✅ **DO** keep docs factual and concise
- ❌ **DON'T** include tutorials or opinions
- ❌ **DON'T** commit JAR files
- ❌ **DON'T** include sensitive information

## License

MIT License

---

Built with ❤️ for the Minecraft development community by [Kodari.ai](https://kodari.ai)
