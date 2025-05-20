package java1;

import java.util.Scanner;

public class Problem3 {
public static void main(String [] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number : ");
	int a=sc.nextInt();
	

	int count=0;
	int num=1;
	
	while(count<a){
		System.out.println(num + " ");
		num=num+2;
		count++;
	}
}
}
