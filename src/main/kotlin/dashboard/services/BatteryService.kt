package dashboard.services

class BatteryService {

    private var batteryLevel = 92

    fun level(): Int {

        return batteryLevel

    }

    fun consume(

        amount: Int

    ) {

        batteryLevel =

            (batteryLevel - amount)

                .coerceAtLeast(0)

    }

}
