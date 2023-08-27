package sonarcubeIntegration;

public class SonarcubeIntegrationMain {

    public static void main(String[] args) {
        Calculator calc = new calculator();
        System.out.println("hello world..........!");
        System.out.println(calc.add(2,4));
        System.out.println(calc.multi(2,4));
        System.out.println(calc.square(3));
        System.out.println(calc.cube(3));
    }
}
