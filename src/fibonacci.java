
public class fibonacci {
public static void main(String[] args) {
	int num=0;
	int num2=1;
	System.out.println(num);
	System.out.println(num2);

		for (int i = 0; i < 10; i++) {
			System.out.println(num+num2);
			
			int num3=num2;
			num2=num+num2;
			num=num3;

		}
}
}
