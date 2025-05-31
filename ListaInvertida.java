package trabs;
import java.util.Hashtable;
import java.util.LinkedList;

public class ListaInvertida {
	private Hashtable<String, LinkedList<String>> tabela;
	
	public ListaInvertida() {
        tabela = new Hashtable<>();
    }
	
	public boolean insere(String palavra, String documento) {
		if (tabela.containsKey(palavra)) {
			LinkedList<String> lista = tabela.get(palavra);   
			if (lista.contains(documento)) {
				return false;
			}else {
				lista.add(documento);
				return true; 
			}
	    }else {
	    	LinkedList<String> lista2 = new LinkedList<>();
	    	lista2.add(documento);
	    	tabela.put(palavra, lista2);
	    	return true;
	    }
	}
	
	public LinkedList<String> busca(String palavra){
		return tabela.get(palavra);
	}
	
	public String toString() {
		return tabela.toString();
	}

}
