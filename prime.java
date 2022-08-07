package add;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int arr[] = new int[a];
		int i=2,c=0;
		while(true) {
			if(c==a) break;
			boolean chk = prime(i);
			if(chk == true) arr[c++] = i;
			i++;
		}
//		for(int k=0;k<a;k++) System.out.print(arr[k]+" ");
		if(a%2==0) {
		  for(int k=0,l=a/2;k<a/2;k++,l++) { System.out.print(arr[k]+" "); System.out.print(arr[l]+" "); } 
		} else {
			for(int k=0,l=(a/2)+1;l<a;k++,l++) { System.out.print(arr[k]+" "); System.out.print(arr[l]+" "); } 
			System.out.print(arr[a/2]);
		}
	}
	public static boolean prime(int n) {
		for(int k=2;k<=n/2;k++) {
			if(n%k==0) return false;
		}
		return true;
	}

}
