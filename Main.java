import Threads.ThreadOne;
import Threads.ThreadTwo;

import java.io.OutputStreamWriter;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
      // TaskOne();
        TaskTwo();
    }
    public static  void TaskTwo(){
        int v=(new Random()).nextInt(10);
        ThreadTwo one=new ThreadTwo(v);
       // one.setDaemon(true);
        v=(new Random()).nextInt(10);
        ThreadTwo two=new ThreadTwo(v);
       // two.setDaemon(true);
        one.start();
        two.start();
    }

    public static void  TaskOne(){
        String s="Hello";
        System.out.println(s);
        ThreadOne one=new ThreadOne();
        one.setDaemon(true);
        one.setPriority(Thread.MIN_PRIORITY);
        one.start();
        int laps=10000;
        while (0<laps){
            System.out.print(".");
            laps--;
        }
    }
}
