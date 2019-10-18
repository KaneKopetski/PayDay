

import org.junit.Assert;
import org.junit.Test;

/**
 * The test class PayDayTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PayDayTest
{
    @Test
    public void payDayTest() {
       PayDay payday1 = new PayDay();

       String expected = "Kris 215.00 10.75 204.25";
       String actual = payday1.payDay("Kris", 21.5, 10, .05);
       Assert.assertEquals(expected, actual);
}

@Test
    public void payDayTest2() {
       PayDay payday2 = new PayDay();

       String expected = "Kane 0.00 0.00 0.00";
       String actual = payday2.payDay("Kane", 0, 0, 0);
       Assert.assertEquals(expected, actual);
}

@Test
    public void payDayTest3() {
       PayDay payday3 = new PayDay();

       String expected = "Kane Kopetski 600.00 120.00 480.00";
       String actual = payday3.payDay("Kane Kopetski", 15, 40, .2);
       Assert.assertEquals(expected, actual);
}

@Test
    public void payDayTest4() {
       PayDay payday4 = new PayDay();

       String expected = "Kane Kopetski 6666.00 2266.44 4399.56";
       String actual = payday4.payDay("Kane Kopetski", 55.55, 120, .34);
       Assert.assertEquals(expected, actual);
}

@Test
    public void payDayTest5() {
       PayDay payday5 = new PayDay();

       String expected = "Kane Kopetski 10904.63 3762.10 7142.53";
       String actual = payday5.payDay("Kane Kopetski", 90.555, 120.42, .345);
       Assert.assertEquals(expected, actual);
}
}
