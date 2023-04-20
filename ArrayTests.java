import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
    int[] input2 = {1, 2, 3, 4};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals("4 elements", new int[] {4, 3, 2, 1}, input2);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    int[] input2 = {1, 2, 3, 4};
    assertArrayEquals("regular int array", new int[]{4, 3, 2, 1}, 
    ArrayExamples.reversed(input2));
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input1 = {};
    double actual1 = ArrayExamples.averageWithoutLowest(input1);
    assertEquals("empty array", "0.00", String.format("%.2f", actual1));
    double[] input2 = {1};
    double actual2 = ArrayExamples.averageWithoutLowest(input2);
    assertEquals("one element array", "0.00", String.format("%.2f", actual2));
    double[] input3 = {1, 2};
    double actual3 = ArrayExamples.averageWithoutLowest(input3);
    assertEquals("two element array", "2.00", String.format("%.2f", actual3));
    double[] input4 = {1, 2, 3};
    double actual4 = ArrayExamples.averageWithoutLowest(input4);
    assertEquals("three element array", "2.50", String.format("%.2f", actual4));
    double[] input5 = {1, 1, 3};
    double actual5 = ArrayExamples.averageWithoutLowest(input5);
    assertEquals("repeated lowest element array", "3.00", 
    String.format("%.2f", actual5));
  }
  
}
