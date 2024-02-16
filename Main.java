package final_class;
//Creating odd and even arrays from user input
import java.util.*;
import java.io.*;
import java.lang.Math;
class Main{
    public static void main(String[] args) throws IOException{ //IOException because input should not be empty
        Scanner scan = new Scanner(System.in);
        int i;
        int index_even=0;
        int index_odd=0;
        int count = 0;
        System.out.println("Enter the number of elements: ");
        int n = scan.nextInt();
        double[] inputArray = new double[n];
        double[] odd = new double[n];
        double[] even = new double[n];
        ArrayInput inp = new ArrayInput();
        inputArray= inp.arrayInputt(n);
        for (i=0;i<n;i++){
            if (inputArray[i]%2==0){
                even[index_even++]=inputArray[i];
            }
            else{
                odd[index_odd++]=inputArray[i];
            }
        }
        System.out.println("\nEven array:");
        for (i=0;i<index_even;i++){
            System.out.print(even[i]+" ");
        }
        System.out.println("\nOdd array:");
        for (i=0;i<index_odd;i++){
            System.out.print(odd[i]+" ");
        }
        double min= Integer.MAX_VALUE;
        int min_ind=0;
        for (int j=0; j<n-1;j++){
            if (Math.abs((inputArray[j]-inputArray[j+1]))<min){
                min=Math.abs(inputArray[j]-inputArray[j+1]);
                min_ind=j;
            }
        }
        System.out.println("\nThe 2 neighbouring numbers that are nearest to each other are "+inputArray[min_ind]+" and "+inputArray[min_ind+1]);
        List<Double> al = new ArrayList<>();
        for (double d : inputArray) {
            al.add(d);
        }
        System.out.println("ArrayList\n"+al);
        double newArr[] = new double[al.size()];
        for (i=0;i<al.size();i++){
            newArr[i] = al.get(i);
        }
        System.out.println("New array converted back from ArrayList:");
        for (i=0;i<al.size();i++){
            System.out.print(newArr[i]+" ");
        }
    }
}
