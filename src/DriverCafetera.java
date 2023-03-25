import java.util.Scanner;

public class DriverCafetera {
    public static void main(String[] args) {
        Cafetera cafetera = new Cafetera();



        Scanner entradacafe = new Scanner(System.in);





        while (true) {
            System.out.println("\nQue tipo de cafe deseas?\nTenemos americano, expreso y capuchino\n" +
                    "o escribe \"estado\" para ver las cantidades de la maquina\n");
            String tipo = entradacafe.nextLine();

            if (tipo.equals("salir")) {
                break;
            }



            cafetera.hacerCafe(tipo);
        }
    }
}

