
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
        Path path = Paths.get(System.getProperty("user.dir") + "/src/com/company/txt");
        two.freakCount(path);
    }

    private static void three(){
        String str1 = "anna";
        String str2 = "patrik";
        Three three = new Three();
        three.mergString(str1,str2);
    }

    public static void main(String[] args) {
        two();
    }
}
