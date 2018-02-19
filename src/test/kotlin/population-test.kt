import org.junit.Assert.assertEquals
import org.junit.Test

class PopulationTest {

    @Test
    fun testPopulation0() {
        assertEquals(0, population(0))
    }

    @Test
    fun testPopulation5() {
        assertEquals(2, population(5))
    }

    @Test
    fun testPopulation8() {
        assertEquals(1, population(8))
    }
    @Test
    fun testPopulation15() {
        assertEquals(4, population(15))
    }
    @Test
    fun testPopulation19() {
        assertEquals(3, population(19))
    }

    @Test(expected = IllegalArgumentException::class)
    fun testException() {
        population(-1);
    }
}