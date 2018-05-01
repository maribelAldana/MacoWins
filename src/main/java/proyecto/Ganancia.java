package proyecto;

import static org.junit.Assume.assumeFalse;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;


public class Ganancia {
	
	private List<Venta> ventas = new ArrayList<Venta>();
	
	public void agregarVenta(Venta unaVenta) {
		ventas.add(unaVenta);
	}

	public void setVentas(List<Venta> ventas) {
		this.ventas = ventas;
	}

	public List<Venta> ventaPorFecha(Date fecha){
	
		return ventas.stream()
				.filter(venta -> venta.laVentaSeEfectuoEnEstaFecha(fecha))
				.collect(Collectors.toList());
	}
	
	public double ganaciaPorFecha(Date unaFecha) {
		
		return this.ventaPorFecha(unaFecha).stream().mapToDouble(Venta::importePorVenta).sum();
	}
	
	

}
