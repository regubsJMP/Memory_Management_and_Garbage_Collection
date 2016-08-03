import java.sql.Clob;

/**
 * Created by Renat_Gubaidullin on 8/3/2016.
 */
/* main method was run in IDEA with VM options: -Xmx5m  -Xss1m -XX:SurvivorRatio=1
   Error:  Exception in thread "main" java.lang.OutOfMemoryError: Java heap space

   Для достижения Java heap space error без применения коллекций можно использовать Deadlock или рекурсию.
   В данном случае использован Deadlock, вариант с рекурсией закомитан чуть ниже.
   Для того, чтобы в данном случае JavaHeapSpaceError случилась раньше, чем StackOverflowError,
   необходимо, чтобы создаваемые объекты весили больше 40 байт, т.к. соотношение размера стэка к хипу
   при запуске задано как 1:5, а    одна ссылка на объект из другого объекта в стэке занимает 8 бит
   (в моем случае 64-bit JVM).  Объекты заданных классов при создании весят больше 100 байт,
   таким образом первым переполняется heap, a не stack.
*/
public class JavaHeapSpaceError {


    public static void main(String[] a) {

        Class1 c = new Class1();
    }

    public static class Class1{
        Integer q1=2147483647;Integer q2=2147483647;Integer q3=2147483647;Integer q4=2147483647;Integer q5=2147483647;
        Integer q6=2147483647;Integer q7=2147483647;Integer q8=2147483647;Integer q9=2147483647;Integer q10=2147483647;
        Integer q11=2147483647;Integer q12=2147483647;Integer q13=2147483647;Integer q14=2147483647;Integer q15=2147483647;
        Integer q16=2147483647;Integer q17=2147483647;Integer q18=2147483647;Integer q19=2147483647;Integer q=2047483647;
        Integer q21=2147483647;Integer q22=2147483647;Integer q23=2147483647;Integer q24=2147483647;Integer q25=2147483647;

        Class2 a = new Class2();
    }

    public static class Class2 {

        Integer w1=2147483647;Integer w2=2147483647;Integer w3=2147483647;Integer w4=2147483647;Integer w5=2147483647;
        Integer w6=2147483647;Integer w7=2147483647;Integer w8=2147483647;Integer w9=2147483647;Integer w10=2147483647;
        Integer w11=2147483647;Integer w12=2147483647;Integer w13=2147483647;Integer w14=2147483647;Integer w15=2147483647;
        Integer w16=2147483647;Integer w17=2147483647;Integer w18=2147483647;Integer w19=2147483647;Integer w=2047483647;
        Integer w21=2147483647;Integer w22=2147483647;Integer w23=2147483647;Integer w24=2147483647;Integer w25=2147483647;

        Class1 b = new Class1();
    }

/*
    public static void main(String[] a) {

        Class1 c = new Class1();
    }

    public static class Class1{
        Integer q1=2147483647;Integer q2=2147483647;Integer q3=2147483647;Integer q4=2147483647;Integer q5=2147483647;
        Integer q6=2147483647;Integer q7=2147483647;Integer q8=2147483647;Integer q9=2147483647;Integer q10=2147483647;
        Integer q11=2147483647;Integer q12=2147483647;Integer q13=2147483647;Integer q14=2147483647;Integer q15=2147483647;
        Integer q16=2147483647;Integer q17=2147483647;Integer q18=2147483647;Integer q19=2147483647;Integer q=2047483647;
        Integer q21=2147483647;Integer q22=2147483647;Integer q23=2147483647;Integer q24=2147483647;Integer q25=2147483647;

        Class1 a = new Class1();
    }
*/

}
