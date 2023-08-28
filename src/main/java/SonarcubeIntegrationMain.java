import sonarcubeIntegration.Calculator;

public class SonarcubeIntegrationMain {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("hello world..........!");
        System.out.println(calc.add(2,4));
        System.out.println(calc.multi(2,4));
        System.out.println(calc.divide(2,4));
    }
}
