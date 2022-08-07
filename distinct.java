package add;

import java.util.*;
import java.util.stream.*;

public class distinct {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr=Stream.of(sc.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
		int c=0,max=Integer.MIN_VALUE,ind=0,f=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) c++;
			}
			if(arr[ind]!=arr[i] && max==c) {f=1; c=0; continue; }
			if(max<c) { f=0; max=c; c=0; ind=i; continue;}
			c=0;
		}
		if(f==1) { System.out.print("no distinct highest repeating elements"); return ;}
		System.out.print(arr[ind]);
	}
}