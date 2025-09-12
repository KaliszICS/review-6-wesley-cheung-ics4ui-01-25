import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;
import java.lang.reflect.Method;

public class PracticeProblemTest {

   @Test
   @DisplayName("")
   void removeFirstTest3() {
     Class<?> testClass = PracticeProblem.class;
     try {
         Class<?>[] cArg = {String.class};
         Method method = testClass.getDeclaredMethod("removeFirst", cArg);
         // Enter code here
         assertEquals("ello", (String)method.invoke(null, "Hello"));
     }
     catch (NoSuchMethodException e) {
         fail("Method does not exist");
     }
     catch(Exception e) {
         fail("Something weird happened");
     }
   }
   
   @Test
   @DisplayName("")
   void removeFirstTest2() {
     Class<?> testClass = PracticeProblem.class;
     try {
         Class<?>[] cArg = {String.class};
         Method method = testClass.getDeclaredMethod("removeFirst", cArg);
         // Enter code here
         assertEquals("", (String)method.invoke(null, "a"));
     }
     catch (NoSuchMethodException e) {
         fail("Method does not exist");
     }
     catch(Exception e) {
         fail("Something weird happened");
     }
   }
   
   @Test
   @DisplayName("")
   void removeFirstTest1() {
     Class<?> testClass = PracticeProblem.class;
     try {
         Class<?>[] cArg = {String.class};
         Method method = testClass.getDeclaredMethod("removeFirst", cArg);
         // Enter code here
         assertEquals("a", (String)method.invoke(null, "ba"));
     }
     catch (NoSuchMethodException e) {
         fail("Method does not exist");
     }
     catch(Exception e) {
         fail("Something weird happened");
     }
   }
   
   @Test
   @DisplayName("")
   void productTest6() {
     Class<?> testClass = PracticeProblem.class;
     try {
         Class<?>[] cArg = {double.class, double.class};
         Method method = testClass.getDeclaredMethod("product", cArg);
         // Enter code here
         assertEquals(-9.2, (double)method.invoke(null, -4, 2.3), 0.1);
     }
     catch (NoSuchMethodException e) {
         fail("Method does not exist");
     }
     catch(Exception e) {
         fail("Something weird happened");
     }
   }
   
   @Test
   @DisplayName("")
   void productTest5() {
     Class<?> testClass = PracticeProblem.class;
     try {
         Class<?>[] cArg = {double.class, double.class};
         Method method = testClass.getDeclaredMethod("product", cArg);
         // Enter code here
         assertEquals(7.0, (double)method.invoke(null, -2, -3.5), 0.1);
     }
     catch (NoSuchMethodException e) {
         fail("Method does not exist");
     }
     catch(Exception e) {
         fail("Something weird happened");
     }
   }
   
   @Test
   @DisplayName("")
   void productTest4() {
     Class<?> testClass = PracticeProblem.class;
     try {
         Class<?>[] cArg = {double.class, double.class};
         Method method = testClass.getDeclaredMethod("product", cArg);
         // Enter code here
         assertEquals(0.0, (double)method.invoke(null, 0, 0.0), 0.1);
     }
     catch (NoSuchMethodException e) {
         fail("Method does not exist");
     }
     catch(Exception e) {
         fail("Something weird happened");
     }
   }
   
   @Test
   @DisplayName("")
   void productTest3() {
     Class<?> testClass = PracticeProblem.class;
     try {
         Class<?>[] cArg = {double.class, double.class};
         Method method = testClass.getDeclaredMethod("product", cArg);
         // Enter code here
         assertEquals(0.0, (double)method.invoke(null, -2, 0), 0.1);
     }
     catch (NoSuchMethodException e) {
         fail("Method does not exist");
     }
     catch(Exception e) {
         fail("Something weird happened");
     }
   }
   
   @Test
   @DisplayName("")
   void productTest2() {
     Class<?> testClass = PracticeProblem.class;
     try {
         Class<?>[] cArg = {double.class, double.class};
         Method method = testClass.getDeclaredMethod("product", cArg);
         // Enter code here
         assertEquals(0.0, (double)method.invoke(null, 0, 14), 0.1);
     }
     catch (NoSuchMethodException e) {
         fail("Method does not exist");
     }
     catch(Exception e) {
         fail("Something weird happened");
     }
   }
   
   @Test
   @DisplayName("")
   void productTest1() {
     Class<?> testClass = PracticeProblem.class;
     try {
         Class<?>[] cArg = {double.class, double.class};
         Method method = testClass.getDeclaredMethod("product", cArg);
         // Enter code here
         assertEquals(7.0, (double)method.invoke(null, 2, 3.5), 0.1);
     }
     catch (NoSuchMethodException e) {
         fail("Method does not exist");
     }
     catch(Exception e) {
         fail("Something weird happened");
     }
   }
   
   @Test
   @DisplayName("")
   void differenceTest6() {
     Class<?> testClass = PracticeProblem.class;
     try {
         Class<?>[] cArg = {int.class, int.class};
         Method method = testClass.getDeclaredMethod("difference", cArg);
         // Enter code here
         assertEquals(1, (int)method.invoke(null, -2, -3));
     }
     catch (NoSuchMethodException e) {
         fail("Method does not exist");
     }
     catch(Exception e) {
         fail("Something weird happened");
     }
   }
   
   @Test
   @DisplayName("")
   void differenceTest5() {
     Class<?> testClass = PracticeProblem.class;
     try {
         Class<?>[] cArg = {int.class, int.class};
         Method method = testClass.getDeclaredMethod("difference", cArg);
         // Enter code here
         assertEquals(-2, (int)method.invoke(null, -2, 0));
     }
     catch (NoSuchMethodException e) {
         fail("Method does not exist");
     }
     catch(Exception e) {
         fail("Something weird happened");
     }
   }
   
   @Test
   @DisplayName("")
   void differenceTest4() {
     Class<?> testClass = PracticeProblem.class;
     try {
         Class<?>[] cArg = {int.class, int.class};
         Method method = testClass.getDeclaredMethod("difference", cArg);
         // Enter code here
         assertEquals(0, (int)method.invoke(null, 0, 0));
     }
     catch (NoSuchMethodException e) {
         fail("Method does not exist");
     }
     catch(Exception e) {
         fail("Something weird happened");
     }
   }
   
   @Test
   @DisplayName("")
   void differenceTest3() {
     Class<?> testClass = PracticeProblem.class;
     try {
         Class<?>[] cArg = {int.class, int.class};
         Method method = testClass.getDeclaredMethod("difference", cArg);
         // Enter code here
         assertEquals(3, (int)method.invoke(null, 3, 0));
     }
     catch (NoSuchMethodException e) {
         fail("Method does not exist");
     }
     catch(Exception e) {
         fail("Something weird happened");
     }
   }
   
   @Test
   @DisplayName("")
   void differenceTest2() {
     Class<?> testClass = PracticeProblem.class;
     try {
         Class<?>[] cArg = {int.class, int.class};
         Method method = testClass.getDeclaredMethod("difference", cArg);
         // Enter code here
         assertEquals(9, (int)method.invoke(null, 5, -4));
     }
     catch (NoSuchMethodException e) {
         fail("Method does not exist");
     }
     catch(Exception e) {
         fail("Something weird happened");
     }
   }
   
   @Test
   @DisplayName("")
   void differenceTest1() {
     Class<?> testClass = PracticeProblem.class;
     try {
         Class<?>[] cArg = {int.class, int.class};
         Method method = testClass.getDeclaredMethod("difference", cArg);
         // Enter code here
         assertEquals(-1, (int)method.invoke(null, 2, 3));
     }
     catch (NoSuchMethodException e) {
         fail("Method does not exist");
     }
     catch(Exception e) {
         fail("Something weird happened");
     }
   }
   
   @Test
   @DisplayName("")
   void sumTest6() {
     Class<?> testClass = PracticeProblem.class;
     try {
         Class<?>[] cArg = {int.class, int.class};
         Method method = testClass.getDeclaredMethod("sum", cArg);
         // Enter code here
         assertEquals(0, (int)method.invoke(null, 0, 0));
     }
     catch (NoSuchMethodException e) {
         fail("Method does not exist");
     }
     catch(Exception e) {
         fail("Something weird happened");
     }
   }
   
   @Test
   @DisplayName("")
   void sumTest5() {
     Class<?> testClass = PracticeProblem.class;
     try {
         Class<?>[] cArg = {int.class, int.class};
         Method method = testClass.getDeclaredMethod("sum", cArg);
         // Enter code here
         assertEquals(-6, (int)method.invoke(null, 0, -6));
     }
     catch (NoSuchMethodException e) {
         fail("Method does not exist");
     }
     catch(Exception e) {
         fail("Something weird happened");
     }
   }
   
   @Test
   @DisplayName("")
   void sumTest4() {
     Class<?> testClass = PracticeProblem.class;
     try {
         Class<?>[] cArg = {int.class, int.class};
         Method method = testClass.getDeclaredMethod("sum", cArg);
         // Enter code here
         assertEquals(-5, (int)method.invoke(null, -3, -2));
     }
     catch (NoSuchMethodException e) {
         fail("Method does not exist");
     }
     catch(Exception e) {
         fail("Something weird happened");
     }
   }
   
   @Test
   @DisplayName("")
   void sumTest3() {
     Class<?> testClass = PracticeProblem.class;
     try {
         Class<?>[] cArg = {int.class, int.class};
         Method method = testClass.getDeclaredMethod("sum", cArg);
         // Enter code here
         assertEquals(15, (int)method.invoke(null, 0, 15));
     }
     catch (NoSuchMethodException e) {
         fail("Method does not exist");
     }
     catch(Exception e) {
         fail("Something weird happened");
     }
   }
   
   @Test
   @DisplayName("")
   void sumTest2() {
     Class<?> testClass = PracticeProblem.class;
     try {
         Class<?>[] cArg = {int.class, int.class};
         Method method = testClass.getDeclaredMethod("sum", cArg);
         // Enter code here
         assertEquals(-1, (int)method.invoke(null, 2, -3));
     }
     catch (NoSuchMethodException e) {
         fail("Method does not exist");
     }
     catch(Exception e) {
         fail("Something weird happened");
     }
   }
   
   @Test
   @DisplayName("")
   void sumTest1() {
     Class<?> testClass = PracticeProblem.class;
     try {
         Class<?>[] cArg = {int.class, int.class};
         Method method = testClass.getDeclaredMethod("sum", cArg);
         // Enter code here
         assertEquals(5, (int)method.invoke(null, 2, 3));
     }
     catch (NoSuchMethodException e) {
         fail("Method does not exist");
     }
     catch(Exception e) {
         fail("Something weird happened");
     }
   }
   
   @Test
   @DisplayName("")
   void combinedLengthTest6() {
     Class<?> testClass = PracticeProblem.class;
     try {
         Class<?>[] cArg = {String.class, String.class};
         Method method = testClass.getDeclaredMethod("combinedLength", cArg);
         // Enter code here
         assertEquals(7, (int)method.invoke(null, "Hello ", " "));
     }
     catch (NoSuchMethodException e) {
         fail("Method does not exist");
     }
     catch(Exception e) {
         fail("Something weird happened");
     }
   }
   
   @Test
   @DisplayName("")
   void combinedLengthTest5() {
     Class<?> testClass = PracticeProblem.class;
     try {
         Class<?>[] cArg = {String.class, String.class};
         Method method = testClass.getDeclaredMethod("combinedLength", cArg);
         // Enter code here
         assertEquals(3, (int)method.invoke(null, "bad", ""));
     }
     catch (NoSuchMethodException e) {
         fail("Method does not exist");
     }
     catch(Exception e) {
         fail("Something weird happened");
     }
   }
   
   @Test
   @DisplayName("")
   void combinedLengthTest4() {
     Class<?> testClass = PracticeProblem.class;
     try {
         Class<?>[] cArg = {String.class, String.class};
         Method method = testClass.getDeclaredMethod("combinedLength", cArg);
         // Enter code here
         assertEquals(1, (int)method.invoke(null, "", "a"));
     }
     catch (NoSuchMethodException e) {
         fail("Method does not exist");
     }
     catch(Exception e) {
         fail("Something weird happened");
     }
   }
   
   @Test
   @DisplayName("")
   void combinedLengthTest3() {
     Class<?> testClass = PracticeProblem.class;
     try {
         Class<?>[] cArg = {String.class, String.class};
         Method method = testClass.getDeclaredMethod("combinedLength", cArg);
         // Enter code here
         assertEquals(0, (int)method.invoke(null, "", ""));
     }
     catch (NoSuchMethodException e) {
         fail("Method does not exist");
     }
     catch(Exception e) {
         fail("Something weird happened");
     }
   }
   
   @Test
   @DisplayName("")
   void combinedLengthTest2() {
     Class<?> testClass = PracticeProblem.class;
     try {
         Class<?>[] cArg = {String.class, String.class};
         Method method = testClass.getDeclaredMethod("combinedLength", cArg);
         // Enter code here
         assertEquals(2, (int)method.invoke(null, "a", "b"));
     }
     catch (NoSuchMethodException e) {
         fail("Method does not exist");
     }
     catch(Exception e) {
         fail("Something weird happened");
     }
   }
   
   @Test
   @DisplayName("")
   void combinedLengthTest1() {
     Class<?> testClass = PracticeProblem.class;
     try {
         Class<?>[] cArg = {String.class, String.class};
         Method method = testClass.getDeclaredMethod("combinedLength", cArg);
         // Enter code here
         assertEquals(10, (int)method.invoke(null, "Hello", "World"));
     }
     catch (NoSuchMethodException e) {
         fail("Method does not exist");
     }
     catch(Exception e) {
         fail("Something weird happened");
     }
   }
   
   @Test
   @DisplayName("")
   void isEvenTest1() {
     Class<?> testClass = PracticeProblem.class;
     try {
         Class<?>[] cArg = {int.class};
         Method method = testClass.getDeclaredMethod("isEven", cArg);
         // Enter code here
         assertEquals(true, (boolean)method.invoke(null, 4));
     }
     catch (NoSuchMethodException e) {
         fail("Method does not exist");
     }
     catch(Exception e) {
         fail("Something weird happened");
     }
   }
   
   @Test
   @DisplayName("")
   void isOddTest3() {
     Class<?> testClass = PracticeProblem.class;
     try {
         Class<?>[] cArg = {int.class};
         Method method = testClass.getDeclaredMethod("isOdd", cArg);
         // Enter code here
         assertEquals(false, (boolean)method.invoke(null, 0));
     }
     catch (NoSuchMethodException e) {
         fail("Method does not exist");
     }
     catch(Exception e) {
         fail("Something weird happened");
     }
   }
   
   @Test
   @DisplayName("")
   void isOddTest2() {
     Class<?> testClass = PracticeProblem.class;
     try {
         Class<?>[] cArg = {int.class};
         Method method = testClass.getDeclaredMethod("isOdd", cArg);
         // Enter code here
         assertEquals(true, (boolean)method.invoke(null, 99));
     }
     catch (NoSuchMethodException e) {
         fail("Method does not exist");
     }
     catch(Exception e) {
         fail("Something weird happened");
     }
   }
   
   @Test
   @DisplayName("")
   void isOddTest1() {
     Class<?> testClass = PracticeProblem.class;
     try {
         Class<?>[] cArg = {int.class};
         Method method = testClass.getDeclaredMethod("isOdd", cArg);
         // Enter code here
         assertEquals(false, (boolean)method.invoke(null, 4));
     }
     catch (NoSuchMethodException e) {
         fail("Method does not exist");
     }
     catch(Exception e) {
         fail("Something weird happened");
     }
   }
   
   @Test
   @DisplayName("")
   void isEvenTest5() {
     Class<?> testClass = PracticeProblem.class;
     try {
         Class<?>[] cArg = {int.class};
         Method method = testClass.getDeclaredMethod("isEven", cArg);
         // Enter code here
         assertEquals(false, (boolean)method.invoke(null, -53));
     }
     catch (NoSuchMethodException e) {
         fail("Method does not exist");
     }
     catch(Exception e) {
         fail("Something weird happened");
     }
   }
   
   @Test
   @DisplayName("")
   void isEvenTest4() {
     Class<?> testClass = PracticeProblem.class;
     try {
         Class<?>[] cArg = {int.class};
         Method method = testClass.getDeclaredMethod("isEven", cArg);
         // Enter code here
         assertEquals(true, (boolean)method.invoke(null, -4));
     }
     catch (NoSuchMethodException e) {
         fail("Method does not exist");
     }
     catch(Exception e) {
         fail("Something weird happened");
     }
   }
   
   @Test
   @DisplayName("")
   void isEvenTest3() {
     Class<?> testClass = PracticeProblem.class;
     try {
         Class<?>[] cArg = {int.class};
         Method method = testClass.getDeclaredMethod("isEven", cArg);
         // Enter code here
         assertEquals(true, (boolean)method.invoke(null, 0));
     }
     catch (NoSuchMethodException e) {
         fail("Method does not exist");
     }
     catch(Exception e) {
         fail("Something weird happened");
     }
   }
   
   @Test
   @DisplayName("")
   void isEvenTest2() {
     Class<?> testClass = PracticeProblem.class;
     try {
         Class<?>[] cArg = {int.class};
         Method method = testClass.getDeclaredMethod("isEven", cArg);
         // Enter code here
         assertEquals(false, (boolean)method.invoke(null, 3));
     }
     catch (NoSuchMethodException e) {
         fail("Method does not exist");
     }
     catch(Exception e) {
         fail("Something weird happened");
     }
   }
   
   @Test
   @DisplayName("")
   void isNegativeTest3() {
     Class<?> testClass = PracticeProblem.class;
     try {
         Class<?>[] cArg = {int.class};
         Method method = testClass.getDeclaredMethod("isNegative", cArg);
         // Enter code here
         assertEquals(false, (boolean)method.invoke(null, 54));
     }
     catch (NoSuchMethodException e) {
         fail("Method does not exist");
     }
     catch(Exception e) {
         fail("Something weird happened");
     }
   }
   
   @Test
   @DisplayName("")
   void isNegativeTest2() {
     Class<?> testClass = PracticeProblem.class;
     try {
         Class<?>[] cArg = {int.class};
         Method method = testClass.getDeclaredMethod("isNegative", cArg);
         // Enter code here
         assertEquals(false, (boolean)method.invoke(null, 0));
     }
     catch (NoSuchMethodException e) {
         fail("Method does not exist");
     }
     catch(Exception e) {
         fail("Something weird happened");
     }
   }
   
   @Test
   @DisplayName("")
   void isNegativeTest1() {
     Class<?> testClass = PracticeProblem.class;
     try {
         Class<?>[] cArg = {int.class};
         Method method = testClass.getDeclaredMethod("isNegative", cArg);
         // Enter code here
         assertEquals(true, (boolean)method.invoke(null, -4));
     }
     catch (NoSuchMethodException e) {
         fail("Method does not exist");
     }
     catch(Exception e) {
         fail("Something weird happened");
     }
   }
   
   @Test
   @DisplayName("")
   void isPositiveTest3() {
     Class<?> testClass = PracticeProblem.class;
     try {
         Class<?>[] cArg = {int.class};
         Method method = testClass.getDeclaredMethod("isPositive", cArg);
         // Enter code here
         assertEquals(false, (boolean)method.invoke(null, -55));
     }
     catch (NoSuchMethodException e) {
         fail("Method does not exist");
     }
     catch(Exception e) {
         fail("Something weird happened");
     }
   }
   
   @Test
   @DisplayName("")
   void isPositiveTest2() {
     Class<?> testClass = PracticeProblem.class;
     try {
         Class<?>[] cArg = {int.class};
         Method method = testClass.getDeclaredMethod("isPositive", cArg);
         // Enter code here
         assertEquals(false, (boolean)method.invoke(null, 0));
     }
     catch (NoSuchMethodException e) {
         fail("Method does not exist");
     }
     catch(Exception e) {
         fail("Something weird happened");
     }
   }
   
   @Test
   @DisplayName("")
   void isPositiveTest1() {
     Class<?> testClass = PracticeProblem.class;
     try {
         Class<?>[] cArg = {int.class};
         Method method = testClass.getDeclaredMethod("isPositive", cArg);
         // Enter code here
         assertEquals(true, (boolean)method.invoke(null, 9));
     }
     catch (NoSuchMethodException e) {
         fail("Method does not exist");
     }
     catch(Exception e) {
         fail("Something weird happened");
     }
   }
   
   @Test
   @DisplayName("")
   void isOddTest5() {
     Class<?> testClass = PracticeProblem.class;
     try {
         Class<?>[] cArg = {int.class};
         Method method = testClass.getDeclaredMethod("isOdd", cArg);
         // Enter code here
         assertEquals(true, (boolean)method.invoke(null, -5));
     }
     catch (NoSuchMethodException e) {
         fail("Method does not exist");
     }
     catch(Exception e) {
         fail("Something weird happened");
     }
   }
   
   @Test
   @DisplayName("")
   void isOddTest4() {
     Class<?> testClass = PracticeProblem.class;
     try {
         Class<?>[] cArg = {int.class};
         Method method = testClass.getDeclaredMethod("isOdd", cArg);
         // Enter code here
         assertEquals(false, (boolean)method.invoke(null, -4));
     }
     catch (NoSuchMethodException e) {
         fail("Method does not exist");
     }
     catch(Exception e) {
         fail("Something weird happened");
     }
   }

}
