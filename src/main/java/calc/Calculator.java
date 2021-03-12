package calc;

public class Calculator {

    // variables initialization
    float add;
    float sub;
    float mul;
    float div;
    float randomNum;

    // method "+"
    public float addition(float num1, float num2) {
        add = num1 + num2;
        return add;

    }

    // method "-"
    public float subtraction(float num1, float num2) {
        sub = num1 - num2;
        return sub;

    }

    // method "*"
    public float multiplication(float num1, float num2) {
        mul = num1 * num2;
        return mul;

    }

    // method "/"
    public float division(float num1, float num2) {
        div = num1 / num2;
        return div;

    }

    // method "random"
    public float random(float num1) {
        randomNum = (float) (Math.random() * num1);
        return randomNum;

    }
}

