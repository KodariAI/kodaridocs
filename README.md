# KodariDocs

Documentation service for [Kodari.ai](https://kodari.ai) that provides the AI with up-to-date API knowledge for Minecraft plugin development.

## What is this?

A gRPC microservice that serves markdown API references to Kodari. When Kodari generates a plugin that depends on, say, Citizens or WorldGuard, it fetches the relevant doc from here so the generated code uses correct package paths, real method signatures, and idiomatic patterns, instead of relying on stale training data.

## Requesting Documentation

**Want a plugin added?** Open an issue: **[github.com/KodariAI/kodaridocs/issues](https://github.com/KodariAI/kodaridocs/issues)**

Tell us:
- **Plugin name** and link (GitHub repo, Spigot/BukkitDev page, or wiki)
- **Why**: what functionality do you want Kodari to be able to generate code for?
- **Is the API public?** Link to the Maven/JitPack coordinates or the API JAR download page if you know them

That's all we need. We'll research the plugin's API from its source/docs and add the doc file. Paid/closed-source plugins can still be added if the API is reachable (e.g. SpigotMC API downloads, JavaDoc pages, or official docs).

## Project Structure

```
kodaridocs/
├── app/                           ← Spring Boot bootstrap (the bootable module)
│   └── src/main/
│       ├── java/.../KodaridocsApplication.java
│       └── resources/application.yml
└── docs/                          ← docs library module
    └── src/main/
        ├── java/.../              ← DocsService, TokenCountService, gRPC service
        ├── proto/                 ← gRPC protobuf definitions
        └── resources/docs/        ← the markdown docs themselves
            ├── hytale/mods/
            └── minecraft/
                ├── configs/
                └── plugins/
```

All markdown docs live under `docs/src/main/resources/docs/`. Categories are:
- `minecraft/plugins/`: Bukkit/Spigot/Paper plugins
- `minecraft/configs/`: GUI/menu/config plugins
- `hytale/mods/`: Hytale mods

## Running Locally

```bash
./gradlew :app:bootRun
```

The gRPC server listens on port `9093` (configurable in `app/src/main/resources/application.yml`). Requires an `ANTHROPIC_API_KEY` in a `.env` file at the project root (used by `TokenCountService` for token counting).

## Building

```bash
./gradlew :app:bootJar
```

Output goes to `app/build/libs/`. The `Dockerfile` builds and ships this as a standalone container.

## Contributing Docs Directly

If you want to contribute a doc yourself instead of opening an issue:

1. Fork the repo
2. Add your `.md` file under `docs/src/main/resources/docs/<category>/<subcategory>/`
3. Follow the format of existing docs (short description, code examples with full imports, trimmed API reference table at the bottom, no Maven/Gradle setup sections)
4. Open a PR

Naming convention: `pluginname.md`, all lowercase, no dashes or underscores, no version suffixes. Example: `worldguard.md`, not `world-guard.md` or `world_guard.md`.

## License

See [LICENSE](LICENSE).

---

Built for the Minecraft development community by [Kodari.ai](https://kodari.ai)
