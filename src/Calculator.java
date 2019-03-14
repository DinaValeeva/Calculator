import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    private Scanner scanner = new Scanner(System.in);
    private double a;
    private double b;

    public void readA(){
        System.out.println("Введите 'a'");
        try {
            a = scanner.nextDouble();
        } catch (InputMismatchException e) {
            throw new NotNumberException("Нельзя вводить не число");
        }
    }

    public void readB(){
        System.out.println("Введите 'b'");
        try {
            b = scanner.nextDouble();
        } catch (InputMismatchException e) {
            throw new NotNumberException("Нельзя вводить не число");
        }
    }


    public void div(){
        if (b==0) throw new RuntimeException("Делить на 0 нельзя");
        else System.out.println(a/b);
    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.readA();
        calculator.readB();
        calculator.div();
    }
}
