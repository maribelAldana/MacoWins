package proyecto;

public class Tarjeta implements Pago{
	
	private int cuotas;
	private int coeficiente;

	public Tarjeta(int cuoatas, int coefiente) {
		super();
		this.cuotas = cuoatas;
		this.coeficiente = coefiente;
	}


	@Override
	public double precioDeVenta(Prenda prenda) {
		// TODO Auto-generated method stub
		return prenda.cobroDeVenta() + (cuotas * coeficiente + 0.01 * prenda.cobroDeVenta());
	}

}
