
/* This program provides methods to calculate averages, find maximum values,count occurrences,
 * and compute cumulative sums for stock prices using both arrays and ArrayLists.  */




package application;
import java.util.ArrayList;
import java.util.Arrays;

public class StockPriceAnalysis {
	
//** Calculate Average Method for ARRAY**
	
	public static float calculateAveragePrice(float[] array) {   
		
		float arraySum=0;
		
		for(int i= 0; i < array.length; i++) {
			arraySum += array[i];
			}
		
		float averagePrice = (float) arraySum/array.length; //Average is calculated by the total sum of the array 
		return averagePrice;                                //and then divided by the length.Average returned.
		
	}//average array end
	
	
//** Calculate Average Method for ARRAYLIST**
	
	public static float calculateAveragePrice(ArrayList<Float> stockPrices) {
        float sum = 0;
        
        for (int i = 0 ; i <stockPrices.size();i++ ) {
            sum += stockPrices.get(i); // method for getting all the elements in the list
        }
        
        return sum / stockPrices.size(); // average for arrayList diving the sum by the size() method.
    }//average (arrayList) end
	
	
//**Maximum Price for ARRAY **
	public static float findMaximumPrice(float[]array) {
		float maxPrice=array[0];    // starting with the first element
		for(int i=1; i < array.length; i++) {
			if(array[i]> maxPrice) { //After looping through the array, the highest price is found 
				maxPrice=array[i];   // assigns the highest number to maxPrice variable
			}
		}
		
		return maxPrice;
		
		
	}//max Price (array) end
	
	
// **Maximum Price for ArrayList**
	
	public static float findMaximumPrice(ArrayList<Float> stockPrices) {
        float maxPrice = stockPrices.get(0); // Initialize maxPrice with the first element

        for (int i = 1; i < stockPrices.size(); i++) {
            if (stockPrices.get(i) > maxPrice) { //After looping through the array, the highest price is found
                maxPrice = stockPrices.get(i);  //assigning to the max variable
            }
        }

        return maxPrice;
    }//max Price (arrayList) end
	
	
// ** Count Occurrences for ARRAY **
	
	public static float countOccurences(float[] array,float targetPrice) {
		float count=0; //initializing counter variable
		for(int i=0; i < array.length; i++) {
			if (array[i] == targetPrice) {  //incrementing counter whenever an element matches the target price
			count++;
			}
			
		}
		
		return count;
		
	}//count end
	
//** Computer Cumulative Sum for ArrayList**
	
	public static ArrayList <Float> computeCumulativeSum(ArrayList<Float>stockPrices){
		ArrayList<Float> cumulativeSumPrices = new ArrayList<>(); //initializing new Array
		
		float sum=0;
		for(int i=0; i< stockPrices.size(); i++ ) {
			sum += stockPrices.get(i); // Calculating the cumulative sum
			cumulativeSumPrices.add(sum); //Adding the sum to the arrayList
			
		}
		
		return cumulativeSumPrices;
	}//ArrayList end
	
	
//** MAIN METHOD **//
	
	public static void main(String[]args) {
		
//**Sample Data
		
		// Daily Stock Price Array
		
		float[] arrayStockPrices = {432.2f, 876.5f, 109.7f, 543.6f, 234.0f, 543.6f, 321.0f, 654.5f, 987.7f, 543.6f};
		
		// Stock Price Array List
		ArrayList<Float> stockPricesList= new ArrayList<>(Arrays.asList(258.4f,345.4f,563.5f,527.4f,356.7f,546.24f,431.5f,323.11f,654.32f,654.32f));
		
//Displaying results
		
		System.out.println("Average Stock Prices for Daily Stock Prices: " + calculateAveragePrice(arrayStockPrices));
		System.out.println();
		System.out.println("Average Stock Prices for Price List: " + calculateAveragePrice(stockPricesList));
		System.out.println();
		System.out.println("Maximum Price for Daily Stock Prices : " + findMaximumPrice(arrayStockPrices));
		System.out.println();
		System.out.println("Maximum Price for Price List: " + findMaximumPrice(stockPricesList));
		System.out.println();
		System.out.println("The count occurrences of the number 543.6 is: " + countOccurences(arrayStockPrices,543.6f));
		System.out.println();
		System.out.println("The Cumulative Sum is: " +  computeCumulativeSum(stockPricesList));
		
		
	}
	
	
	
	
	
	
}
