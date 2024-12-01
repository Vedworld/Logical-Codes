
public class NumberAndStarPattenV {

	public static void main(String[] args) {
		int row =4;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println("");
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
// output
//1
//*
//12
//**
//123
//***
//1234
//****
