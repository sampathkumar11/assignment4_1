package assignment4_1;
import java.util.Scanner;

public class PrnRev {

	public static void main(String[] args) {
	System.out.println("This will print the entered numbers in reverse order!");
	//int[]a=new int[6];
	Scanner snr=new Scanner(System.in);
	System.out.println("Enter the Size(Integer Number) of Array to be initialised :");
	int az=snr.nextInt();
	int[]a=new int[az];
	int sno=0;
	for (int i=0;i<a.length;i++){
		sno++;
		System.out.println("Enter integer number for order "+sno+" to store in array");
		
		a[i]=snr.nextInt();
	}
	snr.close();
	for (int j=a.length-1; j>=0; j--){
		System.out.println("Order "+sno+" entered value :"+a[j]);
		sno--;
	}
	}

}
