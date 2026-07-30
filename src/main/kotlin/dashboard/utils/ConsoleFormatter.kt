package dashboard.utils

import dashboard.models.SensorReading

object ConsoleFormatter {

    fun print(

        reading: SensorReading

    ) {

        println("-----------------------")

        println("Sensor : ${reading.sensor.name}")

        println("Room   : ${reading.sensor.location}")

        println("Value  : ${reading.value}")

        println("Status : ${reading.status}")

        println("-----------------------")

    }

}
