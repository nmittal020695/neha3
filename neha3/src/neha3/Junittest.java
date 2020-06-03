package neha3;

import org.junit.Before;
import org.junit.Test;

public class Junittest  {
		@Before
		public void beforeTest(){
		System.out.println("Running before test");
		}
		 
		@Test
		public void junitTest(){
		System.out.println("Running Junit test");
		}
		 
		@Test
		public void secondJunitTest(){
		System.out.println("Running second Junit test");
		}
		}
	

