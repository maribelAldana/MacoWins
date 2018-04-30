package proyecto;

public class Nueva implements Estado{

	@Override
	public float cobrarPrenda(Prenda prenda) {
		// TODO Auto-generated method stub
		return prenda.getPrecio();
	}
	

}
