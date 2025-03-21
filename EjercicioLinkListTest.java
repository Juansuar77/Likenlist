package umg.edu.gt.test.EjercicioLinkedList;

public class EjercicioLinkListTest {


	import org.junit.Test;
	import static org.junit.Assert.*;
	import java.util.LinkedList;
	import java.util.Arrays;



	   
	    public void testEliminarDuplicados() {
	        LinkedList<Integer> lista = new LinkedList<>(Arrays.asList(1, 2, 2, 3, 1, 4));
	        EjercicioLinkList.eliminarDuplicados(lista);
	        LinkedList<Integer> esperado = new LinkedList<>(Arrays.asList(1, 2, 3, 4));
	        assertEquals(esperado, lista);
	    }

	    
	    public void testInvertirLista() {
	        LinkedList<String> lista = new LinkedList<>(Arrays.asList("a", "b", "c", "d"));
	        EjercicioLinkList.invertirLista(lista);
	        LinkedList<String> esperado = new LinkedList<>(Arrays.asList("d", "c", "b", "a"));
	        assertEquals(esperado, lista);
	    }

	    
	    public void testIntercalarOrdenado() {
	        LinkedList<Integer> l1 = new LinkedList<>(Arrays.asList(1, 3, 5));
	        LinkedList<Integer> l2 = new LinkedList<>(Arrays.asList(2, 4, 6));
	        LinkedList<Integer> resultado = EjercicioLinkList.intercalarOrdenado(l1, l2);

	       
	        LinkedList<Integer> esperado = new LinkedList<>(Arrays.asList(1, 2, 4, 3, 5, 6));
	        assertEquals(esperado, resultado);
	    }
	

