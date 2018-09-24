import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        List<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 2_000_000_000; i++) {
            String str = "";
            str += i;
            arrayList.add(str);
            if(random() != 0){
                arrayList.remove(arrayList.size()-1);
            }
        }
        System.out.println("OK");
        scanner.nextLine();
    }

    static int random(){
        Random random = new Random();
        return random.nextInt(7);
    }
}
