/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package someexercises;

/**
 *
 * @author Pablo
 */
public class ArmstrongNumber {
    // More information http://www.programmingsimplified.com/c-program-find-armstrong-number
    
    private int number;
    
    public ArmstrongNumber(int inputNumber){
        this.number = inputNumber;
    }
    
    private int getLenght(int number){
        int count = 0;        
        while((number)>0){
            number = number/10;
            count++;
        }
        return count;
    } 
    
    public boolean isArmstrong(int number){
        boolean check = false;
        int sum = 0, digit = 0, lenght, saveNumber;
        lenght = getLenght(number);
        saveNumber = number; 
        while(number>0){
            digit = number%10; 
            sum = (int) (sum + Math.pow((digit), lenght));
            number = number/10;
        }        
        if(sum==saveNumber)
            check = true;
        return check;
    }
    
    public static void main(String[]args){
        
        //Some examples 0, 1, 4, 5, 9, 153, 371, 407, 1634, 8208 etc.
        int number = 407;
        ArmstrongNumber numberObject = new ArmstrongNumber(number);
        if(numberObject.isArmstrong(number)==true){
            System.out.println("The number "+number+" is Armstrong Number");
        }else{
            System.out.println("The number "+number+" isn't Armstrong Number");
        }
        
    }    
}
