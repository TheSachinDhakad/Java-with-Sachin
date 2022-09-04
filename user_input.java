import java.util.Arrays;
import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int size = in.nextInt();

   /*     int [] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element of array " + i +"th index :");
            arr[i] = in.nextInt();

        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//
//        }

//        for(int element : arr){
//            System.out.print(element + " ");
//        }

        System.out.println(Arrays.toString(arr));
        */


        String [] str = new String[size];
        for (int i = 0; i < str.length; i++) {
            System.out.println("Enter the element of array " + i +"th index :");
            str[i] = in.next();

        }
        System.out.println(Arrays.toString(str));
//
//        for(int i = 0 ; i< str.length; i++){
//            System.out.println(str[i]);
//        }
//        for(String name : str){
//            System.out.println(name);
//        }




    }

}