
package ejerciciotraineeonready;


public class Moto extends Vehiculo {
    
    String cilindrada;

    public Moto() {
    }

    public Moto(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public Moto(String cilindrada, String marca, String modelo, double precio) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
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
    
    public void puertaocilindrara() {
    System.out.print("Cilindrada: " + cilindrada + " // ");
    }
}
