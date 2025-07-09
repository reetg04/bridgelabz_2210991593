// import java.util.Scanner;

// class MyFirstClass{
//     public static void main(String args[]){
//         //System.out.println("Hello Family");
//         int number;
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt();
        

//     }
// }
import java.util.Scanner;
class MyFirstClass{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = sc.nextInt();
        System.out.println("What is your bage?");
        int bage = sc.nextInt();
        System.out.println("what is your address?");
        sc.nextLine();
        String address = sc.nextLine();
        System.out.println("My age is " + age + ' '+  "and my brother's age is " + bage);
        System.out.println("I live in " + address);
    }
}