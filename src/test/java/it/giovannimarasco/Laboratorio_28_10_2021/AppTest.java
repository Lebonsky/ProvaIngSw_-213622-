package it.giovannimarasco.Laboratorio_28_10_2021;

import static org.junit.Assert.assertTrue;

import java.util.Random;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
	private static MyListUtil list;
	@BeforeClass
	public static void prepareTest() {
		System.out.println("before class");
		list = new MyListUtil();
		Random r = new Random();
		int lenght = r .nextInt() % 300;
		for(int i = 0; i < lenght; ++i )
			list.getList().add(r.nextInt() % 400);
	}
//	@Before
//	public static void prepareTest() {
//		System.out.println("before class");
//		list = new MyListUtil();
//		Random r = new Random();
//		int lenght = r .nextInt() % 300;
//		for(int i = 0; i < lenght; ++i )
//			list.getList().add(r.nextInt() % 400);
//	}
	
	@Test
	public void shouldBeOrdered() {
		System.out.println("test ordinato");
		list.stampa(list);
		list.sort(list.getList(), 0);
		list.stampa(list);
		for(int i = 1; i < list.getList().size(); ++i)
			assert list.getList().get(i-1) < list.getList().get(i);		
	}
    
}
