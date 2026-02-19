import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("Ingrese la dimension de la matriz que va a realizar");
        n = sc.nextInt();
        Metodos mt = new Metodos();
        objcomida[][] m = new objcomida[n][n];
        m = mt.Llenarmatriz(m);
        mt.mostrarmatriz(m);

    }

}
