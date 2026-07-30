package dashboard.services

import dashboard.models.SensorReading
import dashboard.models.SensorType

class AlertService {

    fun check(reading: SensorReading) {

        when (reading.sensor.type) {

            SensorType.TEMPERATURE ->

                if (reading.value > 30)

                    println("High temperature detected")

            SensorType.SMOKE ->

                if (reading.status != "SAFE")

                    println("Smoke detected")

            SensorType.WATER_LEAK ->

                if (reading.status != "DRY")

                    println("Water leak detected")

            SensorType.MOTION ->

                if (reading.status == "MOTION")

                    println("Motion detected")

            else -> {}

        }

    }

}
