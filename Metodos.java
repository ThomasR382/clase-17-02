import java.util.Scanner;

public class Metodos {
    
    Metodos mt = new Metodos();
    Scanner sc = new Scanner(System.in);

    public objcomida [][] Llenarmatriz(objcomida[][] m)
    {
        Double total = 0.0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                objcomida o = new objcomida();
                System.out.println("Ingrese tipo de comida");
                System.out.println("1) Perro");
                System.out.println("2) Perra");
                System.out.println("3) Salchipapa");
                System.out.println("4) Hamburguesa");
                o.setTipo(mt.validarnumero(sc));
                System.out.println("Ingrese tamaño");
                System.out.println("1) Pequeño");
                System.out.println("2) Mediano");
                System.out.println("3) Grande");
                o.setTamaño(mt.validarnumero(sc));
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
    
    public int validarnumero(Scanner sc)
    {
        while(!sc.hasNextInt()){
            System.out.println("Ingrese un numero valido");
        }
        return sc.nextInt();

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
