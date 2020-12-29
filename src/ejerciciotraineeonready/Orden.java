
package ejerciciotraineeonready;

import java.util.Comparator;

public class Orden implements Comparator<Vehiculo> {
    
     public int compare(Vehiculo primero, Vehiculo segundo) { 
    	return primero.precio > segundo.precio ? -1 :(primero.precio < segundo.precio ? 1 : 0); 
    } 
}
