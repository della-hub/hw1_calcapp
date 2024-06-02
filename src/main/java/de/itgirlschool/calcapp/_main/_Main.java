package de.itgirlschool.calcapp._main;

import java.util.Scanner;
import de.itgirlschool.calcapp.util.Calculator;
import de.itgirlschool.calcapp.service.ResultWriterService;

public class _Main {
    public static void main(String[] args) {

        Calculator myCalc = new Calculator();
        ResultWriterService myResult = new ResultWriterService();

        System.out.println("Enter an integer and press enter");
        Scanner num = new Scanner(System.in);

        int num1 = num.nextInt();

        System.out.println("Enter another integer and press enter");
        int num2 = num.nextInt();

        int resultSum = myCalc.mySum(num1, num2);
        float resultDiv = myCalc.MyDiv(num1, num2);
        int resultMulti = myCalc.myMulti(num1, num2);

        myResult.resultWriter(num1, num2, resultSum, resultMulti, resultDiv);



        //System.out.println(num1 + num2);


    }
}
