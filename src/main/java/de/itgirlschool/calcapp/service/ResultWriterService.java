package de.itgirlschool.calcapp.service;


public class ResultWriterService {

    public void resultWriter(int num1, int num2, int resultSum, int resultMulti, float resultDiv) {

        System.out.println("The result for the integers "+num1+" "+"and "+num2+" will be: "
        +"sum "+resultSum+", multiplication "+resultMulti+" and divided "+resultDiv);
    }
}
