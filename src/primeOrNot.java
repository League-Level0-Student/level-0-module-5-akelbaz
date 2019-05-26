import javax.swing.JOptionPane;

public class primeOrNot {
public static void main(String[] args) {
String num = JOptionPane.showInputDialog("Give me a number, any number");	
int number = Integer.parseInt(num);
int nuum = 1;
for(int i=number-1;i>1;i--) {
if(number%i==0) {
	JOptionPane.showMessageDialog(null,"Your number is not prime");
	System.exit(0);
System.out.println(i);
}
}
JOptionPane.showMessageDialog(null,"Your number is prime");
}
}
