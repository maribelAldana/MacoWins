package proyecto;

public class Efectivo implements Pago {

	@Override
	public double precioDeVenta(Prenda prenda) {
		// TODO Auto-generated method stub
		return prenda.cobroDeVenta();
	}
}
