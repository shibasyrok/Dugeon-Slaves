
package helloleha;

/**
 *
 * @author Student
 */
public class CustomMath {
    public static int sum(int x, int y) {
    return x + y; //возвращает результат сложения двух чисел
    }
    public static int division(int x, int y) {
     if (y==0) {//если делитель равен нулю
         throw new IllegalArgumentException("divider is 0");
     } //бросается исключение
     return x / y; //возвращает результат
     }
    public static void main (String[] args) {
        try {
            System.out.println("Test3 failed.");
        } catch (IllegalArgumentException e){
            //тест считается успешным,если при попытке деления на 0
            //генерируется ожидаемое исключение
            System.out.println("Test3 passed.");
        }
    }
}

   
