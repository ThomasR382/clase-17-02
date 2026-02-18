import java.util.Scanner;

public class Metodos {

    Scanner sc = new Scanner(System.in);

    public objcomida [][] Llenarmatriz(objcomida[][] m)
    {
        Double total = 0.0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                objcomida o = new objcomida();
                System.out.println("Ingrese tipo de comida");
                o.setTipo(sc.next());
                System.out.println("Ingrese tamaño");
                o.setTamaño(sc.next());
                System.out.println("Ingrese el Precio");
                o.setPrecio(sc.nextDouble());
                System.out.println("Ingrese cantidad");
                o.setCantidad(sc.nextInt());
                System.out.println("Ingrese descripcion");
                o.setDescrip(sc.next());
                total = o.getCantidad() * o.getPrecio();
                o.setPrecio(total);
                m[i][j] = o;
                
            }
        }
        return m;
    }

    public void mostrarmatriz(objcomida[][]m){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
            System.out.println("Tipo: " + m[i][j].getTipo());
            System.out.println("Tamaño: " + m[i][j].getTamaño());
            System.out.println("Cantidad: " + m[i][j].getCantidad());
            System.out.println("Descripcion: " + m[i][j].getDescrip());
            System.out.println("Precio: " + m[i][j].getPrecio());
            System.out.println("--------------------------------------------");
            }
        }
    }

    
}
