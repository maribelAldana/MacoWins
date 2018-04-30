package proyecto;

public class Liquidacion implements Estado{
	
	@Override
	public float cobrarPrenda(Prenda prenda) {
		// TODO Auto-generated method stub
		return prenda.getPrecio() / 2;
	}
}
