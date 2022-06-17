package ru.netology.sqr;

public class SQRService {
    public int calculate(int num1, int num2) {

        int number = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= num1 && i * i <= num2) {
                number++;
            }
        }
        return number;
    }

}






