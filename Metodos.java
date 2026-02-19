import java.util.Scanner;

public class Metodos {

    Metodos mt = new Metodos();
    Scanner sc = new Scanner(System.in);

    public objcomida[][] Llenarmatriz(objcomida[][] m) {
        Double total = 0.0;
        int Numero_pedido = 1;
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
                o.setPrecio(mt.validardouble(sc));
                System.out.println("Ingrese cantidad");
                o.setCantidad(sc.nextInt());
                System.out.println("Ingrese descripcion");
                o.setDescrip(sc.next());
                total = o.getCantidad() * o.getPrecio();
                o.setPrecio(total);
                o.setPedido(Numero_pedido);
                o.setEstado(0);
                Numero_pedido++;
                m[i][j] = o;

            }
        }
        return m;
    }

    public int validarnumero(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Ingrese un numero valido");
        }
        return sc.nextInt();

    }

    public Double validardouble(Scanner sc) {
        while (!sc.hasNextDouble()) {
            System.out.println("Ingrese un numero valido");
        }
        return sc.nextDouble();

    }

    public objcomida Buscarpedido(objcomida[][] m, int Numero_pedido) {
        objcomida o = new objcomida();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][j].getPedido() == Numero_pedido) {
                    m[i][j].setPedido(Numero_pedido);
                }
            }
        }

        return o;
    }

    public void mostrarmatriz(objcomida[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                switch (m[i][j].getTipo()) {
                    case 1:
                        System.out.println("Perro");                        
                        break;
                    case 2:
                        System.out.println("Perra");                        
                        break;  
                    case 3:
                        System.out.println("Salchipapa");                        
                        break;
                    default:
                        System.out.println("Hamburguesa");
                        break;
                }
                switch (m[i][j].getTamaño()) {
                    case 1:
                        System.out.println("Pequeño");
                        
                        break;
                    case 2:
                        System.out.println("Mediano");
                
                    default:
                        System.out.println("Grande");
                        break;
                }
                System.out.println("Tipo" + m[i][j].getTipo());
                System.out.println("Tamaño: " + m[i][j].getTamaño());
                System.out.println("Cantidad: " + m[i][j].getCantidad());
                System.out.println("Descripcion: " + m[i][j].getDescrip());
                System.out.println("Precio: " + m[i][j].getPrecio());
                System.out.println("--------------------------------------------");
                if (m[i][j].getEstado() == 0){
                    System.out.println("Pendiente");

                else{
                    System.out.println("Despachado");
                }
                    
                }
            }
        }
    }

    public objcomida[][] actualizarpedido(objcomida[][] m) {
        int opt = 1;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (opt == 1) {
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
                    o.setPrecio(mt.validardouble(sc));

                    System.out.println("Ingrese cantidad");
                    o.setCantidad(sc.nextInt());
                    System.out.println("Ingrese descripcion");
                    o.setDescrip(sc.next());

                }
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
                o.setPrecio(mt.validardouble(sc));
                System.out.println("Ingrese cantidad");
                o.setCantidad(sc.nextInt());
                System.out.println("Ingrese descripcion");
                o.setDescrip(sc.next());
                total = o.getCantidad() * o.getPrecio();
                o.setPrecio(total);
                o.setPedido(Numero_pedido);
                o.setEstado(0);
            }
        }
        return m;
    }

}
