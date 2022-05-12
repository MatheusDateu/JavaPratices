package pacotetestejavaoito;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenarString {
    public static void main(String[] args) {

        List<String> palavras = new ArrayList<String>();
        palavras.add("alura online");
        palavras.add("editora casa do codigo");
        palavras.add("caelum");

        Comparator<String> comparador = new ComparadorPorTamanho();

        Collections.sort(palavras);
        System.out.println(palavras);


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
