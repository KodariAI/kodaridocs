# bStats-API-Complete-Documentation

**Library:** bStats
**Package:** org.bstats
**Purpose:** Analytics and metrics for Minecraft plugins

## Plugin Setup

### Repository Configuration
repositories {
mavenCentral()
// your other repositories
}

### Dependency Configuration
dependencies {
implementation("org.bstats:bstats-bukkit:3.1.0")
// your other dependencies
}

### Manifest Configuration (IMPORTANT)
Add bstats-bukkit to your manifest.kod to include it in your plugin:
Class-Path: bstats-bukkit.jar

## Getting Started

### Basic Implementation
```java
import org.bstats.bukkit.Metrics;
import org.bstats.charts.SimplePie;
import org.bukkit.plugin.java.JavaPlugin;

public class ExamplePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // You can find the plugin id of your plugins on
        // the page https://bstats.org/what-is-my-plugin-id
        int pluginId = /* INSERT PLUGIN ID HERE */;
        Metrics metrics = new Metrics(this, pluginId);

        // Optional: Add custom charts
        metrics.addCustomChart(
            new SimplePie("chart_id", () -> "My value")
        );
    }
}
```

## API Components Documentation

### Metrics Class
Package: org.bstats.bukkit.Metrics
Type: Class

Constructor:
- Metrics(JavaPlugin plugin, int serviceId) - Create metrics instance with your plugin ID

Methods:
- void addCustomChart(CustomChart chart) - Add a custom chart to track data

### SimplePie Chart
Package: org.bstats.charts.SimplePie
Type: Class

Constructor:
- SimplePie(String chartId, Callable<String> callable) - Create simple pie chart

Usage:
Returns a single string value that represents a pie slice on your bStats page

### Getting Your Plugin ID
1. Register your plugin at https://bstats.org/getting-started
2. Find your plugin ID at https://bstats.org/what-is-my-plugin-id
3. Replace `/* INSERT PLUGIN ID HERE */` with your actual numeric plugin ID

### Important Notes
- Metrics are collected every 30 minutes
- First data appears after ~3-7 minutes
- Users can opt-out via plugins/bStats/config.yml