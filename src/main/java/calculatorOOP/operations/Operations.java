package calculatorOOP.operations;

public interface Operations {
    static float sum(float var1, float var2){
        return var1 + var2;
    };

    static float mult (float var1, float var2) {
        return var1 * var2;
    };

    static float sub (float var1, float var2){
        return var1 - var2;
    };

    static float div (float var1, float var2){
        return var1 / var2;
    };

}
