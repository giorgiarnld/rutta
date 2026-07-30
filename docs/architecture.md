# Architecture

```
               Main
                 │
                 ▼
          SensorService
      ┌──────┼─────────┐
      ▼      ▼         ▼
 AlertService Battery Statistics
      │
      ▼
ConsoleFormatter
```

## Components

### SensorService

Coordinates sensor monitoring.

### AlertService

Generates alerts based on sensor values.

### StatisticsService

Calculates dashboard statistics.

### BatteryService

Tracks battery levels.

### ConsoleFormatter

Displays formatted sensor information.
