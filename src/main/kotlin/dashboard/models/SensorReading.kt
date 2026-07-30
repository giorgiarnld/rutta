package dashboard.models

import java.time.LocalDateTime

data class SensorReading(

    val sensor: Sensor,

    val value: Double,

    val status: String,

    val timestamp: LocalDateTime

)
