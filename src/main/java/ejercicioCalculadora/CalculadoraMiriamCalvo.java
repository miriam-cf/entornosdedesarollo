package ejercicioCalculadora;

public class CalculadoraMiriamCalvo {
    private final int num1;
    private final int num2;
    public CalculadoraMiriamCalvo(int a, int b) {
        num1 = a;
        num2 = b;
    }
    public int suma() {
        return num1 + num2;
    }
    public int resta() {
        return num1 - num2;
    }
    public int multiplica() {
        return num1 * num2;
    }
    public int divide() {
        return num1 / num2;
    }
}
