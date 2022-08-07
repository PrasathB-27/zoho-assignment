package add;

import java.util.*;

public class great {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number = ");
		int a=sc.nextInt();
		int arr[] = new int[a];
		for(int i=0;i<a;i++) arr[i]=sc.nextInt();
		int s=1,i=0;
		while(true) {
			if(i==a) { break; }
			if(s==a) {arr[i] = -1; i++; continue; }
			if(arr[i]<arr[s]) { 
				arr[i] = arr[s];  i++; s=i+1; continue;}
			s++;
		}
		arr[a-1] = -1;
		for(int k=0;k<a;k++) System.out.print(arr[k]+" ");
	}

}
