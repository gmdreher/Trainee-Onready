package ejerciciotraineeonready;


import java.util.ArrayList;


public class EjercicioTraineeOnready {
    
    public static ArrayList<Vehiculo> lista = new ArrayList<Vehiculo>();

    public static void main(String[] args) {
        
        Vehiculo auto1 = new Auto(4, "Peugeot", "206", 200000);
        Vehiculo moto1 = new Moto("125cc", "Honda", "Titan", 60000);
        Vehiculo auto2 = new Auto(5, "Peugeot", "208", 250000);
        Vehiculo moto2 = new Moto("160cc", "Yamaha", "YBR", 80500.50);
        
        lista.add(auto1);
        lista.add(moto1);
        lista.add(auto2);
        lista.add(moto2);
        
        for (Vehiculo ver : lista) {
	ver.mostrarmarca();
	ver.mostrarmodelo();
        ver.puertaocilindrara();
        ver.mostrarprecio();
        }
        
        System.out.println("======================================================================");
        
        
        lista.sort( new Orden());
        String letra = " ";
        
        for (Vehiculo lis : lista) {
	    if(lis.getModelo() != null && lis.getModelo().contains("Y")) {
	    letra = lis.getMarca()+" "+lis.getModelo()+ " " + lis.getPrecio();
	    }   	
	}
        
        System.out.println("Vehículo más caro: " + lista.get(0).getMarca()+ " " + lista.get(0).getModelo());
        System.out.println("Vehículo más barato: " + lista.get(3).getMarca()+ " " + lista.get(3).getModelo());
        System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: " + letra);

        
        System.out.println("======================================================================");

        System.out.println("Vehículos ordenados por precio de mayor a menor: " );
        
        for(Vehiculo lis : lista) {
	System.out.println(lis.getMarca() + " "+ lis.getModelo());
	}
    }       
}
    

