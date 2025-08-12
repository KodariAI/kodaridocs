# apollo-bungee-1.1.8 API Reference

## Package: com.lunarclient.apollo.loader

### Class: com.lunarclient.apollo.loader.PlatformPlugin
Type: Interface

Methods:
- void onEnable()
- void onDisable()

### Class: com.lunarclient.apollo.loader.BungeePlatformLoader
Type: Class
Extends: net.md_5.bungee.api.plugin.Plugin

Methods:
- void onLoad()
- void onEnable()
- void onDisable()

### Class: com.lunarclient.apollo.loader.DynamicAgent
Type: Class
Extends: sun.management.Agent

Methods:
- **static** void premain(String, Instrumentation)
- **static** void agentmain(String, Instrumentation)
- **static** Instrumentation getInstrumentation()

### Class: com.lunarclient.apollo.loader.DynamicDependencies
Type: Class

Methods:
- **static** String[] discoverDependencies()

### Class: com.lunarclient.apollo.loader.DynamicLoader
Type: Class

Methods:
- PlatformPlugin createPlugin(Class, Object, String)
- void loadJar(URL)
- void install(String[])

