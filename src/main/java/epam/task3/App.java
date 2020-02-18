package epam.task3;
import java.util.Scanner;;
public class App 
{

    public static void main( String[] args )
    {
    	float c;
    	System.out.println("Instructions:");
    	System.out.println("1.enter 'on' to start calculations.");
    	System.out.println("2.give space after entering each operand and operator.");
    	System.out.println("3.Input should be in the form of '2 + 3'.");
    	System.out.println("4.to terminate calculations enter 'off' after entering one oprand eg.: 3 off");
    	Scanner scanner = new Scanner(System.in);
    	String condition=scanner.next();
    	System.out.println("welome");
    	while(condition!="off") {
        int a = scanner.nextInt();
        String ch=scanner.next();
        switch(ch) {
        case "+":
        	int b=scanner.nextInt();
        	c=a+b;
        	System.out.println(c);
        	break;
        case "-":
        	int d=scanner.nextInt();
        	c=a-d;
        	System.out.println(c);
        	break;
        case "*":
        	int e=scanner.nextInt();
        	c=a*e;
        	System.out.println(c);
        	break;
        case "/":
        	int f=scanner.nextInt();
        	c=a/f;
        	System.out.println(c);
        	break;
        case"off":
        	condition ="off";
        	System.out.println("end");
        default:
        	System.out.print("invalid operation");
        	
        }
        }
        scanner.close();
    }
}
