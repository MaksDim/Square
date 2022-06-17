package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void schouldCalculateFor200And300() {
        SQRService service = new SQRService();
        int num1 = 200;
        int num2 = 300;
        int expected = 3;


        int actual = service.calculate(num1, num2);

        assertEquals(expected, actual);
    }

    @Test
    void schouldCalculateForDownMeaning() {
        SQRService service = new SQRService();
        int num1 = 100;
        int num2 = 200;
        int expected = 5;


        int actual = service.calculate(num1, num2);

        assertEquals(expected, actual);
    }

    @Test
    void schouldCalculateForUpMeaning() {
        SQRService service = new SQRService();
        int num1 = 9_500;
        int num2 = 10_000;
        int expected = 2 ;


        int actual = service.calculate(num1, num2);

        assertEquals(expected, actual);
    }
}