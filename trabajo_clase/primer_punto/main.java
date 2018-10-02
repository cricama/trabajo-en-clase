package primer_punto;

public class main {
public static void main(String[] args) {
	
	int arreglo[]= {5,3,4,2};
	
	ordenamiento o = new ordenamiento();
	
	o.ordenamineto(arreglo);
	for(int i=0;i<arreglo.length;i++) {
		System.out.println(arreglo[i]);
	}
}
}
