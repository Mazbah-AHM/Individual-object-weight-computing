package weight2;
import java.util.Scanner;

public class StreamWeight{
		
		public static void main(String[] args) {    
			
			int x;
		
			Scanner y = new Scanner(System.in);
		
			System.out.print("Enter the number of weights: ");  
			//getting number of element from user
			x = y.nextInt();  
			//initialing an array 
			double[] array1 = new double[x];  
			System.out.println("Enter the weights: ");  
				for(int i=0; i<x; i++)  
					{  
						//reading elements of the array. User have to enter the elements.  
						array1[i]=y.nextInt();  
					}     
	      
				//Creating another array which is same size of previous one. 
				double array2[] = new double[array1.length];  
	      
					//storing values of another 
					for (int i = 0; i < array1.length; i++) {   
						array2[i] = array1[i]* 0.39;   
					}    
	      
					//Displaying elements first array   
					System.out.println("Weight on Earth: ");  
						for (int i = 0; i < array1.length; i++) {   
							System.out.print(array1[i] + " ");  
						}   
	      
						System.out.println();  
	      
						//Displaying elements of second array 
						System.out.println("Weight on Mars: ");  
							for (int i = 0; i < array2.length; i++) {   
								System.out.print(array2[i] + " ");  
							}   
		}  
	}
