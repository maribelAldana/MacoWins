package proyecto;

import java.util.Date;

public class Venta {
	
	private Prenda prenda;
	private Date fecha;
	private Pago formaDePago;
	private int cantidad;
	
	public Venta(Prenda prenda, Pago formaDePago, int cantidad) {
		super();
		this.prenda = prenda;
		this.formaDePago = formaDePago;
		this.cantidad = cantidad;
		this.fecha = new Date();
	}
	
	public Pago getFormaDePago() {
		return formaDePago;
	}
	
	public boolean laVentaSeEfectuoEnEstaFecha(Date unaFecha) {
		
		return fecha == unaFecha;
	}

	public double importePorVenta() {
		return cantidad * this.getFormaDePago().precioDeVenta(prenda);
	}

	public Date getFecha() {
		return fecha;
	}
	
}
