package com.boeing;
import java.util.Scanner;

public class ExceptionDemo {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String exceptionWord = scan.nextLine();
        try {
            System.out.println(exceptionWord);
            throw new MyException("CreatingException");
        } catch (MyException ex) {
            System.out.println("Caught");
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("code is in final block");
        }
    }
}

class MyException extends Exception {
    public MyException(String s) {
        super(s);
    }
}
