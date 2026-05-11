# GuardianBeam

GuardianBeam is a single-file shaded utility library for spawning client-side guardian and ender-crystal laser beams via packets and reflection. It has zero external dependencies and supports Minecraft 1.9 through 1.21+.

## REQUIRED SETUP

**Add `guardianbeam` to `manifest.kod`**

GuardianBeam is a shaded library. It MUST be included in your manifest.kod so it is bundled into your plugin JAR:

```yaml
include:
  - guardianbeam
```

Without this, imports like `fr.skytasul.guardianbeam.Laser` will fail at runtime with `ClassNotFoundException`.

---

## Library Structure

This is a single-class library. The entire API lives in one file:

- **Package:** `fr.skytasul.guardianbeam`
- **File:** `Laser.java`
- **Public types:** abstract class `Laser`, inner class `GuardianLaser`, inner class `CrystalLaser`, enum `LaserType`, functional interface `ReflectiveConsumer<T>`

---

## Imports

```java
import fr.skytasul.guardianbeam.Laser;
import fr.skytasul.guardianbeam.Laser.GuardianLaser;
import fr.skytasul.guardianbeam.Laser.CrystalLaser;
import fr.skytasul.guardianbeam.Laser.LaserType;
```

---

## Class Reference

### `Laser` (abstract)

Base class for all laser types.

**Constructors (protected — use subclasses directly):**

```java
protected Laser(Location start, Location end, int duration, int distance)
```

**Public methods:**

```java
Laser executeEnd(Runnable runnable)           // Register a callback to run when the laser expires
Laser durationInTicks()                      // Treat the duration parameter as ticks instead of seconds
void start(Plugin plugin)                    // Start displaying the laser to nearby players
void stop()                                  // Stop the laser immediately
boolean isStarted()                          // Whether the laser is currently active
abstract LaserType getLaserType()            // Returns GUARDIAN or ENDER_CRYSTAL
Location getStart()                          // Get the current start location
Location getEnd()                            // Get the current end location
abstract void moveStart(Location location) throws ReflectiveOperationException
abstract void moveEnd(Location location) throws ReflectiveOperationException
void moveStart(Location location, int ticks, Runnable callback)  // Smooth animated move over N ticks
void moveEnd(Location location, int ticks, Runnable callback)    // Smooth animated move over N ticks
```

**Parameters:**
- `duration` — seconds the laser lives; `-1` for infinite
- `distance` — render distance in blocks; `-1` for infinite

---

### `GuardianLaser` extends `Laser`

Renders a guardian beam laser. Supports entity tracking.

**Constructors:**

```java
GuardianLaser(Location start, Location end, int duration, int distance)
    throws ReflectiveOperationException

GuardianLaser(Location start, LivingEntity endEntity, int duration, int distance)
    throws ReflectiveOperationException
```

**Additional public methods:**

```java
void attachEndEntity(LivingEntity entity) throws ReflectiveOperationException  // Make the end track a living entity
Entity getEndEntity()                                                           // Returns the tracked end entity, or null
void callColorChange() throws ReflectiveOperationException                      // Triggers a beam color refresh
LaserType getLaserType()                                                        // Returns LaserType.GUARDIAN
void moveStart(Location location) throws ReflectiveOperationException
void moveEnd(Location location) throws ReflectiveOperationException
```

---

### `CrystalLaser` extends `Laser`

Renders an ender-crystal laser beam. Coordinates are rounded to block positions automatically.

**Constructor:**

```java
CrystalLaser(Location start, Location end, int duration, int distance)
    throws ReflectiveOperationException
```

**Additional public methods:**

```java
LaserType getLaserType()                              // Returns LaserType.ENDER_CRYSTAL
void moveStart(Location location) throws ReflectiveOperationException
void moveEnd(Location location) throws ReflectiveOperationException
```

---

### `LaserType` (enum)

```java
GUARDIAN
ENDER_CRYSTAL
```

**Method:**

```java
Laser create(Location start, Location end, int duration, int distance)
    throws ReflectiveOperationException  // Factory: creates the appropriate Laser subclass
```

---

### `ReflectiveConsumer<T>` (functional interface)

```java
void accept(T t) throws ReflectiveOperationException
```

Used internally; rarely needed in plugin code.

---

## Usage Examples

### Spawn a Guardian Beam

```java
import fr.skytasul.guardianbeam.Laser.GuardianLaser;

Location start = player.getLocation();
Location end = target.getLocation();

try {
    GuardianLaser laser = new GuardianLaser(start, end, 10, 64); // 10 seconds, 64-block range
    laser.start(plugin);
} catch (ReflectiveOperationException e) {
    e.printStackTrace();
}
```

### Spawn an Ender Crystal Beam

```java
import fr.skytasul.guardianbeam.Laser.CrystalLaser;

try {
    CrystalLaser laser = new CrystalLaser(start, end, 5, 64);
    laser.start(plugin);
} catch (ReflectiveOperationException e) {
    e.printStackTrace();
}
```

### Spawn Using the Factory Enum

```java
import fr.skytasul.guardianbeam.Laser;
import fr.skytasul.guardianbeam.Laser.LaserType;

try {
    Laser laser = LaserType.GUARDIAN.create(start, end, 10, 64);
    laser.start(plugin);
} catch (ReflectiveOperationException e) {
    e.printStackTrace();
}
```

### Move Endpoints Instantly

```java
laser.moveStart(newStartLocation);
laser.moveEnd(newEndLocation);
```

Both throw `ReflectiveOperationException` — wrap in try/catch.

### Move Endpoints Smoothly (Animated)

```java
// Slide the end point over 20 ticks, then run a callback
laser.moveEnd(newEndLocation, 20, () -> {
    // called when animation finishes
});
```

### Track a Living Entity at the Endpoint

```java
// Constructor variant
GuardianLaser laser = new GuardianLaser(start, someEntity, 30, 64);

// Or attach after creation
laser.attachEndEntity(someEntity);
```

### Stop a Laser Early

```java
laser.stop();
```

### Run Code When the Laser Expires

```java
laser.executeEnd(() -> player.sendMessage("Beam expired!"));
laser.start(plugin);
```

### Duration in Ticks Instead of Seconds

```java
laser.durationInTicks(); // call BEFORE start(); duration parameter now means ticks
laser.start(plugin);
```

### Check if a Laser is Active

```java
if (laser.isStarted()) {
    laser.stop();
}
```

---

## Visibility

Visibility is managed automatically by the scheduler started via `start(Plugin)`. Every tick it checks which players are within the configured `distance` and sends show/hide packets accordingly. There is no public `showForPlayer` or `hideForPlayer` API — control visibility by adjusting the `distance` parameter at construction time, or by calling `stop()` to remove the laser from all players.
