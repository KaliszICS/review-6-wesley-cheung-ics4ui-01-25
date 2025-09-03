import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;

public class PracticeProblemTest {

   @Test
   @DisplayName("")
   void removeFirstTest3() {
     // Enter code here
     assertEquals("ello", Main.removeFirst("Hello"));
   
   }
   
   @Test
   @DisplayName("")
   void removeFirstTest2() {
     // Enter code here
     assertEquals("", Main.removeFirst("a"));
   }
   
   @Test
   @DisplayName("")
   void removeFirstTest1() {
     // Enter code here
     assertEquals("a", Main.removeFirst("ba"));
   }
   
   @Test
   @DisplayName("")
   void productTest6() {
     // Enter code here
   assertEquals(-9.2, Main.product(-4, 2.3), 0.1);
   }
   
   @Test
   @DisplayName("")
   void productTest5() {
     // Enter code here
   assertEquals(7.0, Main.product(-2, -3.5), 0.1);
   }
   
   @Test
   @DisplayName("")
   void productTest4() {
     // Enter code here
     assertEquals(0.0, Main.product(0, 0.0), 0.1);
   }
   
   @Test
   @DisplayName("")
   void productTest3() {
     // Enter code here
     assertEquals(0.0, Main.product(-2, 0), 0.1);
   }
   
   @Test
   @DisplayName("")
   void productTest2() {
     // Enter code here
     assertEquals(0.0, Main.product(0, 14), 0.1);
   }
   
   @Test
   @DisplayName("")
   void productTest1() {
     // Enter code here
     assertEquals(7.0, Main.product(2, 3.5), 0.1);
   }
   
   @Test
   @DisplayName("")
   void differenceTest6() {
     // Enter code here
     assertEquals(1, Main.difference(-2, -3));
   }
   
   @Test
   @DisplayName("")
   void differenceTest5() {
     // Enter code here
     assertEquals(-2, Main.difference(-2, 0));
   }
   
   @Test
   @DisplayName("")
   void differenceTest4() {
     // Enter code here
     assertEquals(0, Main.difference(0, 0));
   }
   
   @Test
   @DisplayName("")
   void differenceTest3() {
     // Enter code here
     assertEquals(3, Main.difference(3, 0));
   }
   
   @Test
   @DisplayName("")
   void differenceTest2() {
     // Enter code here
     assertEquals(9, Main.difference(5, -4));
   }
   
   @Test
   @DisplayName("")
   void differenceTest1() {
     // Enter code here
     assertEquals(-1, Main.difference(2, 3));
   }
   
   @Test
   @DisplayName("")
   void sumTest6() {
     // Enter code here
     assertEquals(0, Main.sum(0, 0));
   }
   
   @Test
   @DisplayName("")
   void sumTest5() {
     // Enter code here
     assertEquals(-6, Main.sum(0, -6));
   }
   
   @Test
   @DisplayName("")
   void sumTest4() {
     // Enter code here
     assertEquals(-5, Main.sum(-3, -2));
   }
   
   @Test
   @DisplayName("")
   void sumTest3() {
     // Enter code here
     assertEquals(15, Main.sum(0, 15));
   }
   
   @Test
   @DisplayName("")
   void sumTest2() {
     // Enter code here
     assertEquals(-1, Main.sum(2, -3));
   }
   
   @Test
   @DisplayName("")
   void sumTest1() {
     // Enter code here
     assertEquals(5, Main.sum(2, 3));
   }
   
   @Test
   @DisplayName("")
   void combinedLengthTest6() {
     // Enter code here
     assertEquals(7, Main.combinedLength("Hello ", " "));
   }
   
   @Test
   @DisplayName("")
   void combinedLengthTest5() {
     // Enter code here
     assertEquals(3, Main.combinedLength("bad", ""));
   }
   
   @Test
   @DisplayName("")
   void combinedLengthTest4() {
     // Enter code here
     assertEquals(1, Main.combinedLength("", "a"));
   }
   
   @Test
   @DisplayName("")
   void combinedLengthTest3() {
     // Enter code here
     assertEquals(0, Main.combinedLength("", ""));
   }
   
   @Test
   @DisplayName("")
   void combinedLengthTest2() {
     // Enter code here
     assertEquals(2, Main.combinedLength("a", "b"));
   }
   
   @Test
   @DisplayName("")
   void combinedLengthTest1() {
     // Enter code here
   
     assertEquals(10, Main.combinedLength("Hello", "World"));
   }
   
   @Test
   @DisplayName("")
   void isEvenTest1() {
     // Enter code here
     assertEquals(true, Main.isEven(4));
   }
   
   @Test
   @DisplayName("")
   void isOddTest3() {
     // Enter code here
     assertEquals(false, Main.isOdd(0));
   }
   
   @Test
   @DisplayName("")
   void isOddTest2() {
     // Enter code here
     assertEquals(true, Main.isOdd(99));
   }
   
   @Test
   @DisplayName("")
   void isOddTest1() {
     // Enter code here
     assertEquals(false, Main.isOdd(4));
   }
   
   @Test
   @DisplayName("")
   void isEvenTest5() {
     // Enter code here
     assertEquals(false, Main.isEven(-53));
   }
   
   @Test
   @DisplayName("")
   void isEvenTest4() {
     // Enter code here
     assertEquals(true, Main.isEven(-4));
   }
   
   @Test
   @DisplayName("")
   void isEvenTest3() {
     // Enter code here
     assertEquals(true, Main.isEven(0));
   }
   
   @Test
   @DisplayName("")
   void isEvenTest2() {
     // Enter code here
     assertEquals(false, Main.isEven(3));
   }
   
   @Test
   @DisplayName("")
   void isNegativeTest3() {
     // Enter code here
     assertEquals(false, Main.isNegative(54));
   }
   
   @Test
   @DisplayName("")
   void isNegativeTest2() {
     // Enter code here
     assertEquals(false, Main.isNegative(0));
   }
   
   @Test
   @DisplayName("")
   void isNegativeTest1() {
     // Enter code here
     assertEquals(true, Main.isNegative(-4));
   }
   
   @Test
   @DisplayName("")
   void isPositiveTest3() {
     // Enter code here
     assertEquals(false, Main.isPositive(-55));
   }
   
   @Test
   @DisplayName("")
   void isPositiveTest2() {
     // Enter code here
     assertEquals(false, Main.isPositive(0));
   }
   
   @Test
   @DisplayName("")
   void isPositiveTest1() {
     // Enter code here
     assertEquals(true, Main.isPositive(9));
   }
   
   @Test
   @DisplayName("")
   void isOddTest5() {
     // Enter code here
     assertEquals(true, Main.isOdd(-5));
   }
   
   @Test
   @DisplayName("")
   void isOddTest4() {
     // Enter code here
     assertEquals(false, Main.isOdd(-4));
   }

}
