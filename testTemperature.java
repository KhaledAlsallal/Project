package HW1;


import java.util.Scanner;
public class testTemperature {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);
System.out.print("Please Enter The times :" );
int n = input.nextInt();
Temperature tt = new Temperature (n);
tt.Read(n);
int count = tt.Count();
int max = tt.Max_temp();
System.out.println("the count of 26 : "+count ); 
System.out.println("the Max Temperature is  : "+ max ); 
tt.Display();
}

}
