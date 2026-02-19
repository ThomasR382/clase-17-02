public class objcomida {
    private int Tipo;
    private int Tamaño;
    private Double Precio;
    private int Cantidad;
    private String Descrip;
    private int Pedido;
    private int Estado;

    public int getTipo() {
        return Tipo;
    }

    public int getPedido() {
        return Pedido;
    }

    public void setPedido(int pedido) {
        Pedido = pedido;
    }

    public void setTipo(int Tipo) {
        this.Tipo = Tipo;
    }

    public int getTamaño() {
        return Tamaño;
    }

    public void setTamaño(int Tamaño) {
        this.Tamaño = Tamaño;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double Precio) {
        this.Precio = Precio;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getDescrip() {
        return Descrip;
    }

    public void setDescrip(String Descrip) {
        this.Descrip = Descrip;
    }

    public int getEstado() {
        return Estado;
    }

    public void setEstado(int estado) {
        Estado = estado;
    }

}