/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package someexercises;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Pablo
 */
public class GameHacked {
    //Some solutions to exercises in Java this awesome Coding Game
    
    public int increment(int number){
        // Increment in one an input number value
        return number = number + 1;
    }
    
    public boolean positive(int number){
        //Return true if input number is positive
        return number > 0 ;
    }
    
    public int absolute(int number){
        //Return the absolute value of an input number
        if(number>0)
            return number;
        return (-number);
    }
    
    public int absoluteTwo(int number){
        //Return the absolute value of an input number using the method abs() of Math class
        return Math.abs(number);
    }
    
    public int power(int number){
        //Return the power of two of input number using a loop sums 
        int result = 0;
        int i = 0;
        while(i<number){
            result = result + number;
            i++;
        }
        return result;
    }
    
    public int powerTwo(int number){
        //Return the power of two of input number using the method pow of Math class
        return (int) Math.pow(number, 2);
    }
    
    public int lenght(int[] arr){
        //Return the lenght of an array calculated using a loop
        int cont = 0;
        for(int i=0;i<arr.length;i++){
            cont++;
        }
        return cont;
    }
    public String pushIt(int lenght){
        //Return an array numbers of size according to the input number
        int[] arr = new int[lenght];
        for(int i=0;i<arr.length;i++){
            arr[i] = i;
        }
        return Arrays.toString(arr);
    }
    
    public int max(int[] array){
        //Given an array of 2 size, return the biggest number
        int max = 0, aux = 0;
        max = array[0];
        aux = array[1];
        if(max>aux){
            return max;
        }else{
            max = aux;
        }
        return max;        
    }
    public int maxxxxxArray(int[] array){
        //Given an array of x size, return the biggest number
        int max = 0;
        max = array[0];
        for(int i=1;i<array.length;i++){
            int aux = array[i];
            if(aux>max){
                max=aux;
            }
        }
        return max;
    }
    
    public boolean thisIsOdd(int number){
        //Check if an input number is odd
        boolean check = false;
        /*if we subtract from 2 the input number within a loop until the number is 0, this is an even number, or
        or if is 1, the number is odd. */
        while(number>1){
            number = number - 2;
        }
        if(number==1)
            check = true;
        return check;
    }
    
    public boolean canalPanama(String word){
        /*This is better known as a Palindrome function, returns true if the letters of the input word 
        being spelled the backwards and forewards are equals, not counting the letter that is placed 
        in the middle of the array. */
        String[] ary = word.split("");
        int lenght = ary.length;
        boolean check = true;
        int i=0, j = (lenght-1);
        while(i<=((lenght/2)-1) && j>=((lenght/2)+1)){
                if(!ary[i].equals(ary[j])){
                    check = false;
                    break;
                }                   
            i++;
            j--;
        }
        return check;
    }
    
    public String bringingSomeOrder(int[] array){
        /*Sort numbers in ascending order
        bubble sort algorithm was implemented */
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[j]<array[i]){
                    int aux = array[j];
                    array[j] = array[i];
                    array[i] = aux;
                }
            }
        }
        return Arrays.toString(array);
    }
    
    public void missingNumbers(int[] array){
        //Return a list array with missing numbers
        Arrays.sort(array);
        ArrayList<Integer> missing = new ArrayList<Integer>();  
        int max = getMaxValue(array);
        for(int i=0;i<max;i++){
            if(findMissingNumber(array,i)==false){
                missing.add(i);
            }
        }
        System.out.println("Missing array: " + missing.toString()); 
    }
    
    private int getMaxValue(int[] array){
        int maxValue = 0;
        maxValue = array[0];
        for(int i=1;i<array.length;i++){            
            if(array[i]>maxValue){
                maxValue=array[i];
            }
        }
        return maxValue;
    }
    
    private boolean findMissingNumber(int[] arr, int number){
        boolean check = false;
        for(int i=0;i<arr.length;i++){
            if(number==arr[i])
                check = true;
        }
        return check;
    }
    public int calculateBinaryValue(int[] arr){
        int binary = 0;
        int lenght = arr.length;
        for(int i=(lenght-1);i>=0;i--){
            binary = (int) (binary + arr[i]*Math.pow(2, i));
        }
        return binary;
    }
    
    public boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < (n/2); ++i) {
           if (s.charAt(i) != s.charAt(n - i - 1)) {
               return false;
           }
        }
        return true;
    }
    
    public static void main(String[]args){
        GameHacked hacked = new GameHacked();
        int number = 5;
        int [] arr = {5,6,1,9,3};
        int [] arrTwoSize = {6,9};
        String palindromeWord = "deleveled";
        
        System.out.println("The number"+number+" increment in one is "+hacked.increment(number));
        
        System.out.println("the number "+number+((hacked.positive(number)==true)?" is positive":" isn't positive"));
        
        System.out.println("the absolute value of number "+number+" is "+hacked.absolute(number));
        
        System.out.println("the absolute value of number "+number+" using abs method is "+hacked.absoluteTwo(number));
        
        System.out.println("the power of two of "+number+" is "+hacked.power(number));
        
        System.out.println("the power of two of "+number+" using pow method is "+hacked.powerTwo(number));
        
        System.out.println("the lenght of the array "+Arrays.toString(arr)+" using loop is "+hacked.lenght(arr));
        
        System.out.println("the array of number of size "+number+" is "+hacked.pushIt(number));
        
        System.out.println("the max of array of two size "+Arrays.toString(arrTwoSize)+" is "+hacked.max(arrTwoSize));
        
        System.out.println("the max of array of x size "+Arrays.toString(arr)+" is "+hacked.maxxxxxArray(arr));
        
        System.out.println("the number "+number+((hacked.thisIsOdd(number)==true)?" is odd":" isn't odd"));
        
        System.out.println("the word "+palindromeWord+((hacked.canalPanama(palindromeWord)==true)?" is palindrome":" isn't palindrome"));
        
        System.out.println("the disordered array "+Arrays.toString(arr)+" is sort ascending "+hacked.bringingSomeOrder(arr));
        
        System.out.print("the array "+Arrays.toString(arr)+" has forgotten the next list of numbers");
        hacked.missingNumbers(arr);
                
    }
    
}
