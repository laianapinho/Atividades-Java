package trabs;

public class GoogleMain {
    public static void main(String[] args) {
        ListaInvertida listaInvertida = new ListaInvertida();
        listaInvertida.insere("banana", "alimentos.txt");
        boolean resultado = listaInvertida.insere("banana", "alimentos.txt");
        System.out.println("Inserção repetida (banana, alimentos.txt): " + resultado); 
        System.out.println("Documentos que contêm a palavra 'banana': " + listaInvertida.busca("banana"));
        System.out.println("Documentos que contêm a palavra 'limao': " + listaInvertida.busca("limao"));
        String representacao = listaInvertida.toString();
    }
}

