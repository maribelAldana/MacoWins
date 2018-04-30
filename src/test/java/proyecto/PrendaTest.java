package proyecto;

import org.junit.Assert;
import org.junit.Test;


public class PrendaTest {
	
	@Test
	public void unaPrendaEsDeTipoLiquidacion() {
		Prenda pantalon = new Prenda("pantalon",800,new Liquidacion());
		Assert.assertTrue(400 == pantalon.cobroDeVenta());
		
	}
	
	@Test
	public void listadeVentasEnCiertasFechas(){
		
	}
}
