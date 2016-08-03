import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Renat_Gubaidullin on 8/3/2016.
 */

/*
  Я использую на своей машине Java 7, поэтому запуск данного кода вызывает у меня
  java.lang.OutOfMemoryError: PermGen space
  В Java8 данный код должен вызвать
  java.lang.OutOfMemoryError: Metaspace
 */

public class MetaspaceError {


        public static void main(String[] args) throws Exception{
            Random rnd = new Random();
            List<String> interned = new ArrayList<String>();
            for (;;) {
                int length = rnd.nextInt(100);
                StringBuilder builder = new StringBuilder();
                String chars = "abcdefghijklmnopqrstuvwxyz";
                for ( int i = 0; i < length; i++ ) {
                    builder.append(chars.charAt(rnd.nextInt(chars.length())));
                }
                interned.add(builder.toString().intern());
            }
        }
    }

