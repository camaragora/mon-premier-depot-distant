package sn.objis.calcul;

import junit.framework.TestCase;

public class CalculMetierTest extends TestCase {
	private CalculMetier calcul;
	protected void setUp() throws Exception {
		super.setUp();
		calcul=new CalculMetier();
	}
	public void testSomme() {
		assertTrue(calcul.somme(6, 9)==15);
		}
		public void testProduit() {
		assertTrue(calcul.produit(7, 4)==28);
		}
}
