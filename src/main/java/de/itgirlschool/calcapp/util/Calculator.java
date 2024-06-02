package de.itgirlschool.calcapp.util;


public class Calculator {

    public int mySum(int num1, int num2){


        int resultSum = num1 + num2;
        return resultSum;
    }

    public int myMulti(int num1, int num2){


        int resultMulti = num1 * num2;
        return resultMulti;
    }

    public float MyDiv(int num1, int num2){

        float resultDiv = num1 / num2;

        return resultDiv;
    }



    /*public int sumAll(int... nums) { //var-args to let the caller pass an arbitrary number of int

        int sum = 0; //start with 0

        for(int n : nums) { //this won't execute if no argument is passed
            sum += n; // this will repeat for all the arguments
        }
        return sum; //return the sum
    }*/


    }

