package com.masai.Mar11.Problem2;

public class Main {

    public static boolean isprime(int x){

        int count = 0;
        for(int i=1; i<=x; i++){
            if( (x%i) == 0)
                count++;

            if(count>2){
                return false;
            }
        }

        return true;
    }

    public int[] findAndReturnPrimeNumbers(int[] inputArray){

        int[] prime = new int[inputArray.length];
        int index = 0;
        //int[] empty = new int[0];

        for(int i=0; i<inputArray.length; i++){

            if(isprime(inputArray[i])){
                prime[index] = inputArray[i];
                index++;
            }

        }

        /*if(count==0)
            return empty;*/

        return prime;
    }


    public static void main(String[] args) {
        Main obj = new Main();
        int[] arr = {10,12,5,50,11,14,15};

        int[] result = obj.findAndReturnPrimeNumbers(arr);

        for(int el:result){
            if(el!=0)
            System.out.print(el + " ");
        }
    }


}
