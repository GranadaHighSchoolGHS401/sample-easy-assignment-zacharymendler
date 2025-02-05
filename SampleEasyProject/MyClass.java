import java.util.Scanner;
public class MyClass
{
     //write a for loop that will output the numbers 1 through 100
    //by 5s, each number separated by a comma
    //example 5,10,15......95,100
    public static void main(){
        Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    for(int i=1;i<n1;i++){
        System.out.print(i+",");
    }
    System.out.print(n1);
    }
}
