package nev22;
import java.util.Scanner;

public class nev22 {
	public static void main(String[] args) {
		//1st problem____________________________________________________________________________________________**
		Scanner sc=new Scanner(System.in);
		int d=0;
		
		System.out.print("enter the size of array");
		int a=sc.nextInt();
		int[] arr=new int[a];
		for(int i=0; i<arr.length;i++) {
			System.out.println("enter the element");
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<arr.length;i++) {
			d=d+arr[i];
			
			
		}
		System.out.println("sum of array"+d);
		
		//2nd problem____________________________________________________________________________________________**
		System.out.println("enter the arr2 size");
		int num=sc.nextInt();
		
		//1234567890
		int[] arr2=new int[num];
		
		for(int i=0;i<arr2.length;i++) {
			System.out.println("emter the arr2 values");
			arr2[i]=sc.nextInt();
			
			
		}
		int f=arr2.length/2;
		
		
		for(int i=0;i<arr2.length;i++) {
			if(i==f) {
				System.out.println("midle number" +arr2[i]);
			}
		}
		System.out.print("enter the size of array3");
		int size=sc.nextInt();
		int[] arr3=new int[size];
		for(int i=0;i<arr3.length;i++) {
			System.out.print("enter arr3 values");
			arr3[i]=sc.nextInt();
			
		}
		for(int i=0;i<arr3.length;i++) {
			if(arr3[i]%2==0) {
				System.out.println(arr3[i]);
			}
		}
		
		//3rd problem_____________________________________________________________________****
		int[] user= new int[6];
		for(int i=0;i<user.length;i++) {
			System.out.print("enter the arrays number");
			user[i]=sc.nextInt();
			
		
			
		}
		for(int i=0;i<user.length;i++) {
			
			if(user[i]%2==0) {
				System.out.println("positive number"+user[i]);
			}
			
		}
	
		
		
		
		
		
		
		
		
				

		
		
		
		
		
		

		
	}
	

}
