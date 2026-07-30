package dashboard.services

import dashboard.models.SensorReading
import dashboard.models.SensorType

class StatisticsService {

    fun averageTemperature(

        readings: List<SensorReading>

    ): Double {

        val temperature = readings.filter {

            it.sensor.type == SensorType.TEMPERATURE

        }

        if (temperature.isEmpty()) {

            return 0.0

        }

        return temperature.map {

            it.value

        }.average()

    }

    fun totalSensors(

        readings: List<SensorReading>

    ): Int {

        return readings.size

    }

}
