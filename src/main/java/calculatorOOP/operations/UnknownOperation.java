package calculatorOOP.operations;

public class UnknownOperation extends Exception {
    private String operation;

    public String getOperation() {
        return operation;
    }

    public UnknownOperation(String operation) {
        this.operation = operation;
    }
}
