package weight2;
import java.util.Scanner;

public class StreamWeight{
		
		public static void main(String[] args) {    
		int n;  
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number of elements you want to store: ");  
		//reading the number of elements from the that we want to enter  
		n=sc.nextInt();  
		//creates an array in the memory of length 10  
		double[] arr1 = new double[n];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{  
		//reading array elements from the user   
		arr1[i]=sc.nextInt();  
		}     
	      
	    //Create another array arr2 with size of arr1  
	    double arr2[] = new double[arr1.length];  
	      
	    //Copying all elements of one array into another  
	    for (int i = 0; i < arr1.length; i++) {   
	        arr2[i] = arr1[i]* 0.39;   
	    }    
	      
	    //Displaying elements of array arr1   
	    System.out.println("ON Earth: ");  
	    for (int i = 0; i < arr1.length; i++) {   
	       System.out.print(arr1[i] + " ");  
	    }   
	      
	    System.out.println();  
	      
	    //Displaying elements of array arr2   
	    System.out.println("On Mars: ");  
	    for (int i = 0; i < arr2.length; i++) {   
	       System.out.print(arr2[i] + " ");  
	    }   
	}  
	}
