package weight1;
import java.util.Scanner;

public class WeightCalc {
	
	    static Scanner keyboard = new Scanner(System.in);

	    public static void main(String[] args)
	    {
	        double weight = getEarthWeight();       
	        double newWeight = CalculateWeight(weight);
	        System.out.println("Your weight is " + weight + " on earth");
	        System.out.println("Your weight would be " + newWeight + " on Mars. ");
	        System.exit(0);
	    }

	    static double getEarthWeight()
	    {
	        System.out.println("Please enter your current Earth weight: ");
	        return keyboard.nextDouble();
	    }

	    static double CalculateWeight(double weight)
	        {
	            double newWeight = 0;
	    
	            newWeight = (weight * 0.39);
	                
	            return newWeight;
	            
	        }
	    
	}
