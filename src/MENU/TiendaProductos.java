package MENU;


class TiendaProducto {
    private char tipoProducto;
    private int cantidad;
    private double precioUnitario;
    private double costoSinDescuento;
    private double descuento;
    private double costoTotal;

    public TiendaProducto(char tipoProducto, int cantidad, double precioUnitario) {
        this.tipoProducto = tipoProducto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public void calcularCosto() {
        if (cantidad <= 0 || precioUnitario <= 0) {
            System.out.println("Error: La cantidad y el precio deben ser valores positivos.");
            return;
        }

        costoSinDescuento = cantidad * precioUnitario;
        descuento = 0;

        switch (tipoProducto) {
            case 'A':
                descuento = costoSinDescuento * 0.10;
                break;
            case 'V':
                descuento = costoSinDescuento * 0.05;
                break;
            case 'E':
                descuento = 0;
                break;
            default:
                System.out.println("Tipo de producto no válido.");
                return;
        }

        costoTotal = costoSinDescuento - descuento;
    }

    public void mostrarResumen() {
        System.out.println("\n===== Resumen de la Compra =====");
        System.out.println("Costo sin descuento: $" + costoSinDescuento);
        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Costo total a pagar: $" + costoTotal);
    }
}

    
   

