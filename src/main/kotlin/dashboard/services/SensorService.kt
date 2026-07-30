package dashboard.services

import dashboard.models.Sensor
import dashboard.models.SensorReading
import dashboard.models.SensorType
import java.time.LocalDateTime

class SensorService {

    private val alerts = AlertService()

    private val battery = BatteryService()

    private val statistics = StatisticsService()

    private val readings = mutableListOf(

        SensorReading(
            Sensor(
                "T-01",
                "Temperature",
                SensorType.TEMPERATURE,
                "Living Room"
            ),
            24.5,
            "OK",
            LocalDateTime.now()
        ),

        SensorReading(
            Sensor(
                "M-01",
                "Motion",
                SensorType.MOTION,
                "Hall"
            ),
            0.0,
            "CLEAR",
            LocalDateTime.now()
        ),

        SensorReading(
            Sensor(
                "S-01",
                "Smoke",
                SensorType.SMOKE,
                "Kitchen"
            ),
            0.0,
            "SAFE",
            LocalDateTime.now()
        ),

        SensorReading(
            Sensor(
                "W-01",
                "Leak",
                SensorType.WATER_LEAK,
                "Bathroom"
            ),
            0.0,
            "DRY",
            LocalDateTime.now()
        )
    )

    fun printStatus() {

        readings.forEach {

            println(it)

            alerts.check(it)

        }

        println()

        println(

            "Average temperature: " +

            statistics.averageTemperature(readings)

        )

        println(

            "Battery level: " +

            battery.level()

        )

    }

}
