package pacotetestejavaoito;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenarString {
    public static void main(String[] args) {

        List<String> palavras = new ArrayList<String>();
        palavras.add("alura online");
        palavras.add("editora casa do codigo");
        palavras.add("caelum");

        Comparator<String> comparador = new ComparadorPorTamanho();
        palavras.sort(comparador);

        //Collections.sort(palavras);
        System.out.println(palavras);

        for(String p : palavras){
            System.out.println(p);
        }

        Consumer<String> consumidor = new ImprimeNaLinha();
        palavras.forEach(consumidor);


    }
}

class ComparadorPorTamanho implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if(o1.length() < o2.length())
            return -1;
        if(o1.length() < o2.length())
            return 1;
        return 0;
    }
}
class ImprimeNaLinha implements Consumer<String>{

    @Override
    public void accept(String s) {

    }
}