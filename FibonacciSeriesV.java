
public class FibonacciSeriesV {

	public static void main(String[] args) {
		int Num1=0,Num2=1,Num3,count=10;
		System.out.print(Num1+" "+Num2);
		for(int i=2;i<=count;i++) {
			Num3=Num1+Num2;
			Num1=Num2;
			Num2=Num3;
			System.out.print(" "+Num3);
		}

	}

}
