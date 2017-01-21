
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    private static void one(){
        int[] arr = {0,1,2,3,4,5,6,7} ;
        int index, a;
        a = 666;
        index = 2;
        One one = new One();
        one.f(arr,a,index);
    }

    private static void two(){
        Two two = new Two();
        //Path path = Paths.get(System.getProperty("user.dir") + "/src/com/company/txt");
        Path path = Paths.get(System.getProperty("user.dir") + "/txt");
        two.freakCount(path);
    }

    private static void three(){
        String str1 = "annab";
        String str2 = "patrik";
        Three three = new Three();

        /* Sunes B */
        three.recMergeString(str1,str2);

        /* Lisch B */
        three.mergStringA(str1,str2);
        three.printMergeString(str1,str2);
    }

    private static void four() {
        Four four = new Four();
        four.makeDate(2000, 3, 5);
        four.printDate();
        for (int i = 0; i < 5 ; i++) {
          four.incYear();
          four.printDate();
          four.incMonth();
          four.printDate();
          four.incDay();
          four.printDate();
        }
    }

    public static void main(String[] args) {
        four();
    }
}
