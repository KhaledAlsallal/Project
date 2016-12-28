package HW1;
 
import java.util.Scanner ; 
public class Temperature {
 int Temp[];


public Temperature (int size){
Temp = new int [size];
}
public void Read (int n){
Scanner input= new Scanner(System.in);
System.out.print("Please Enter The Temperature :" );
for (int i = 0 ; i<Temp.length ; i++ )
Temp[i]= input.nextInt(); }
public void Display (){
System.out.print("the Temperatures is : ");
for (int i = 0 ;i<Temp.length ; i++){
System.out.print(Temp[i] +" , ");
}}
public int Max_temp(){
int max = 0 ; 
for(int i = 0 ; i <Temp.length ; i++){
if (Temp[i]>max)
max = Temp[i];}
return max ; }
public int Count(){
int count = 0 ; 
for(int i = 0 ; i <Temp.length ; i++){
if (Temp[i]== 26)
count ++ ;}
return count ; }}
