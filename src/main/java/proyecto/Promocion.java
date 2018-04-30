package proyecto;

public class Promocion implements Estado {
	private float descuento;
	public Promocion(float _promocion) {
		// TODO Auto-generated constructor stub
		this.descuento = _promocion;
	}

	@Override
	public float cobrarPrenda(Prenda prenda) {
		// TODO Auto-generated method stub
		return prenda.getPrecio() - descuento;
	}

}
