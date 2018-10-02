package primer_punto;

public class ordenamiento {
	
	public void ordenamineto(int [] array) {
		
		int aux;
		boolean cambiar=false;
		while(true) {
			cambiar = false;
			int i = 0;
			
			for (i=1;i<array.length;i++){
				
			
			if(array[i]< array[i-1]) {
				
				aux = array[i];
				array[i]=array[i-1];
				array[i-1]=aux;
				cambiar = true;
			}
		}
			if(cambiar == false)
				break;
	}
	}
	}

