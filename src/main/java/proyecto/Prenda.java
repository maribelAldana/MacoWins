package proyecto;

public class Prenda {
	private String nombre;
	public String getNombre() {
		return nombre;
	}

	private float precio;
	private Estado estado ;
	public Prenda(String _nombre,float _precio, Estado _estado) {
		// TODO Auto-generated constructor stub
		this.nombre = _nombre;
		this.precio = _precio;
		this.estado = _estado;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public float getPrecio() {
		return precio;
	}
	
	public float cobroDeVenta() {
		return estado.cobrarPrenda(this);
	}

}
