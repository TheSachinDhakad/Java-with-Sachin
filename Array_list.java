import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Array_list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 5 array element : ");
        ArrayList<Integer> list = new ArrayList<>(5);
//        list.add(235);
//        list.add(345);
//        list.add(534);
//        list.add(534);
////        System.out.println(list.contains(5));
//        System.out.println(list);
//        list.set(0,123);
//        list.remove(2);

        for (int i = 0; i < 5; i++) {

            list.add(sc.nextInt());

        }
//        for (int i = 0; i < 5; i++) {
//
//            System.out.print(list.get(i) + " ");
//
//        }


        System.out.println(list);
    }
}
