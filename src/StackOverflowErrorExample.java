
/**
 * Created by Renat_Gubaidullin on 8/3/2016.
 */

/*  main method was run in IDEA with VM options: -Xmx5m  -Xss1m -XX:SurvivorRatio=1
    Error:  Exception in thread "main" java.lang.StackOverflowError
    В данном случае так же использован Deadlock, чтобы уйти от рекурсии, однако создаваемые объекты классов пусты
    и весят минимально, поэтому первым переполняется stack, а не heap.
 */

public class StackOverflowErrorExample {
    public static void main(String[] a) {
        Class1 c = new Class1();
    }

    public static class Class1{
        Class2 a = new Class2();
    }

    public static class Class2{
        Class1 b = new Class1();
    }


}