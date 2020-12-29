
package ejerciciotraineeonready;


public class Vehiculo {
    
    String marca;
    String modelo;
    double precio;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void mostrarmarca() {
    System.out.print("Marca: " + marca + " // ");
    }
	
    public void mostrarmodelo() {
    System.out.print("Modelo: " + modelo + " // ");
    }

    public void puertaocilindrara() {
    }
	
    public void mostrarprecio() {
    System.out.print("Precio: $" + precio + "\n");
    }
        
}

