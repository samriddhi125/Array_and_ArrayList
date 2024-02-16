package final_class;

import java.util.*;
import java.io.*;
class ArrayInput{
    public double[] arrayInputt(int n) throws IOException{
        int i=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner scan = new Scanner(System.in);
        double[] inputArray = new double[n];
        double[] odd = new double[n];
        double[] even = new double[n];
        int index_even=0;
        int index_odd=0;
        int count = 0;
        System.out.println("Enter "+n+" numbers in a single line separated by a space");
                String array = br.readLine();
        String[] input = array.trim().split("\\s+"); //Regular expressions are patterns to identify as text
//The + means 1 or more. Trim is there to remove the trailing spaces
        for (i=0; i<n; i++){
            inputArray[i]= Double.parseDouble(input[i]); //parseDouble is a wrapper class.
        }
        return inputArray;
    }
}
