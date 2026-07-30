package dashboard

import dashboard.services.SensorService

fun main() {

    val service = SensorService()

    println("Home Sensor Dashboard")
    println("=====================")

    service.printStatus()

}
