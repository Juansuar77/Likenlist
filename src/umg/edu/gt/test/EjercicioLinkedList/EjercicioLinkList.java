package umg.edu.gt.test.EjercicioLinkedList;

public class EjercicioLinkList {

	import java.util.Iterator;
	import java.util.LinkedList;
	import java.util.HashSet;



	    public static void eliminarDuplicados(LinkedList<Integer> lista) {
	        HashSet<Integer> vistos = new HashSet<>();
	        Iterator<Integer> it = lista.iterator();
	        while (it.hasNext()) {
	            Integer val = it.next();
	            if (vistos.contains(val)) {
	                it.remove();
	            } else {
	                vistos.add(val);
	            }
	        }
	    }

	   
	    public static void invertirLista(LinkedList<String> lista) {
	        int n = lista.size();
	        for (int i = 0; i < n / 2; i++) {
	            String temp = lista.get(i);
	            lista.set(i, lista.get(n - 1 - i));
	            lista.set(n - 1 - i, temp);
	        }
	    }

	   
	    public static LinkedList<Integer> intercalarOrdenado(LinkedList<Integer> l1, LinkedList<Integer> l2) {
	        LinkedList<Integer> resultado = new LinkedList<>();
	        Iterator<Integer> it1 = l1.iterator();
	        Iterator<Integer> it2 = l2.iterator();

	        Integer a = it1.hasNext() ? it1.next() : null;
	        Integer b = it2.hasNext() ? it2.next() : null;

	        while (a != null || b != null) {
	            if (a != null && (b == null || a <= b)) {
	                resultado.add(a);
	                a = it1.hasNext() ? it1.next() : null;
	            } else {
	                resultado.add(b);
	                b = it2.hasNext() ? it2.next() : null;
	            }
	        }

	        return resultado;
	    }
