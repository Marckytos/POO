import java.util.Scanner;

public class DriverCafetera {
    public static void main(String[] args) {
        Cafetera cafetera = new Cafetera();



        Scanner entrada = new Scanner(System.in);




        while (true) {
            System.out.println("\nQue tipo de cafe deseas?\nTenemos americano, expreso y capuchino\n");
            String tipo = entrada.nextLine();

            if (tipo.equals("salir")) {
                break;
            }



            cafetera.hacerCafe(tipo);
        }
    }
}

