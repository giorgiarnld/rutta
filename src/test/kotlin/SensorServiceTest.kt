package dashboard

import dashboard.services.SensorService
import kotlin.test.Test
import kotlin.test.assertNotNull

class SensorServiceTest {

    @Test
    fun serviceShouldBeCreated() {

        val service = SensorService()

        assertNotNull(service)

    }

}
