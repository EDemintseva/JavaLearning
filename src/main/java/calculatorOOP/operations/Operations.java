package calculatorOOP.operations;

import java.util.InputMismatchException;

public class Operations {
    private float var1 = 0.0f;
    private float var2 = 0.0f;
    private String resultType;

    public String getResultType() {
        return resultType;
    }

    public void setVar1(float var1) throws InputMismatchException{
        this.var1 = var1;
    }

    public void setVar2(float var2) throws InputMismatchException{
        this.var2 = var2;
    }

    public float operation(String mathOperation) throws UnknownOperation{
        float result;
        switch (mathOperation) {
            case "+":
                result = sum();
                this.resultType = "Sum";
                break;
            case "-":
                result = sub();
                this.resultType = "Difference";
                break;
            case "*":
                result = mult();
                this.resultType = "Product";
                break;
            case "/":
                result = div();
                this.resultType = "Quotient";
                break;
            default: throw new UnknownOperation(mathOperation);
        }
        return result;
    }

    public float sum(){
        return this.var1 + this.var2;
    }

    public float sub(){
        return this.var1 - this.var2;
    }

    public float mult(){
        return this.var1 * this.var2;
    }

    public float div() throws ArithmeticException{
        return this.var1 / this.var2;
    }

}
