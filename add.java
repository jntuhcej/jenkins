public class add{
public static void main(String[] args){
if(args.length < 2){
System.out.println("provide 2 numbers as Arguments");
return;
}
int num1= Integer.parseInt(args[0]);
int num2= Integer.parseInt(args[0]);
int sum = num1 + num2;
System.out.println("The sum of" + num1 +"and" + num2 +"is" + sum);
}
}
