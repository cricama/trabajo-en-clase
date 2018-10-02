package segundo_punto;

public class main {
	
public static void main(String[] args) {
	
	int arreglo[]= {5,11,13,15,4,12,23,3,4,2,1,45,13};
     
	insercion o = new insercion ();
	o.insercion(arreglo);
	
	for(int i=0;i<arreglo.length;i++) {
		
		System.out.println(arreglo[i]);
	}
	
}
}