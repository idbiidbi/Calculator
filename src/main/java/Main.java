
import calc.Calculator;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        float num1 = 125.5f;
        float num2 = 20.5f;

        // calculator.addition(7.5f,4.3f);

        float resultAdd = calculator.addition(num1,num2);
        float resultSub = calculator.subtraction(num1,num2);
        float resultMul = calculator.multiplication(num1,num2);
        float resultDiv = calculator.division(num1,num2);
        float resultRan = calculator.random(num1);

        System.out.println(num1 +" + " + num2 + " = " + resultAdd);
        System.out.println(num1 +" - " + num2 + " = " + resultSub);
        System.out.println(num1 +" * " + num2 + " = " + resultMul);
        System.out.println(num1 +" / " + num2 + " = " + resultDiv);
        System.out.println("Random number between 0 and " + num1 + " is " + resultRan);

    }

}