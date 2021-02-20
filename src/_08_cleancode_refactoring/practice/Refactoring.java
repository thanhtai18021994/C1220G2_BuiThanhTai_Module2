package _08_cleancode_refactoring.practice;

import java.net.PortUnreachableException;

public class Refactoring {
    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';

    public static int caculator(int firstOperand, int secondOperand, char operator) {
        switch (operator) {
            case ADDITION:
                return firstOperand + secondOperand;
            case SUBTRACTION:
                return firstOperand - secondOperand;
            case MULTIPLICATION:
                return firstOperand*secondOperand;
            case DIVISION:
                if(firstOperand/0!=0)
                return firstOperand/secondOperand;
                else throw new RuntimeException("Can not divece for 0");
            default:
                throw new RuntimeException("unsupported operation");
        }
    }
}
