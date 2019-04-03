import java.util.Scanner;
class BigSmallNum {
public static void main(String arg[]) {
int range,num,big,small;
System.out.println("to find biggest and smallest number");
System.out.print("Enter the no.of values:");
Scanner var=new Scanner(System.in);
range=var.nextInt();
System.out.print("Enter the values:");
num=var.nextInt();
small=big=num;
for(int i=1;i<range;i++) {
num=var.nextInt();
if(num>big)
big=num;
if(num<small)
small=num;
}
System.out.println("the biggest number is "+big);
System.out.println("the smallest number is "+small);
}
}