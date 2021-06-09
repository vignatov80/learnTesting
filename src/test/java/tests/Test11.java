package tests;

import org.junit.Test;
import utils.RandomGeneration;

public class Test11 {

    /**
     * Import random generation
     */
    RandomGeneration random = new RandomGeneration();

    /**
     * Test random string generation
     */
    @Test
    public void testRandomString() {
        random.randomString(100);
    }

    /**
     * Test random boolean generation
     */
    @Test
    public void testRandomBool() {
        random.randomBool();
    }
    /**
     * Test random number generation
     * This method below returns max 19 numbers
     */
    @Test
    public void getRandomNumber() {
        random.getRandomNumber(19);
    }

    /**
     * Test random number generation but it returns it like string
     * and the max number is higher than in getRandomNumber
     */
    @Test
    public void getRandomStringNumbers(){
        random.randomStringNumbers(100);
    }
}
