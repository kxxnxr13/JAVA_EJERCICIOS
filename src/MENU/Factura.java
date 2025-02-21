package MENU;

public class Factura {
    //ATRIBUTOS
    private String nombreCliente;
    private String producto;
    private int cantidad;
    private double precioUnitario;
    private boolean esEstudiante;
    private char tipoCliente;
//constructor
    public Factura(String nombreCliente, String producto, int cantidad, double precioUnitario, boolean esEstudiante, char tipoCliente){
        this.nombreCliente = nombreCliente;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.esEstudiante = esEstudiante;
        this.tipoCliente = tipoCliente;
    }
    
    // Getters y Setters
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public boolean isEsEstudiante() {
        return esEstudiante;
    }

    public void setEsEstudiante(boolean esEstudiante) {
        this.esEstudiante = esEstudiante;
    }

    public char getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(char tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
    //método para calcular el subtotal
    public double calcularSubtotal() {
        return cantidad * precioUnitario;
    }
    //metodo para calcular el impuesto
    public double calcularImpuesto() {
        return esEstudiante ? calcularSubtotal() * 0.05 : calcularSubtotal() * 0.13;
    }
    //metodo para calcular total
    public double calcularTotal() {
        return calcularSubtotal() + calcularImpuesto();
    }
    //metodo para mostrar la factura
    public void mostrarFactura() {
        System.out.println("------------------------");
        System.out.println("         FACTURA        ");
        System.out.println("------------------------");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Tipo de Cliente: " + tipoCliente);
        System.out.println("Producto: " + producto);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio Unitario: $" + precioUnitario);
        System.out.println("Subtotal: $" + calcularSubtotal());
        System.out.println("Impuesto: $" + calcularImpuesto());
        System.out.println("Total a Pagar: $" + calcularTotal());
        System.out.println("------------------------");
    }
}

