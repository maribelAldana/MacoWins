package proyecto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ganancia {
	
	private List<Venta> ventas = new ArrayList<Venta>();
	
	public void agregarVenta(Venta unaVenta) {
		ventas.add(unaVenta);
	}

	public void setVentas(List<Venta> ventas) {
		this.ventas = ventas;
	}

	public Stream<Venta> ventaPorFecha(Date fecha){
	
		return ventas.stream().filter(venta -> venta.laVentaSeEfectuoEnEstaFecha(fecha));
	}
	
	/*public double ganaciaPorFecha(Date unaFecha) {
		
		return this.ventaPorFecha(unaFecha).stream().sum(venta -> venta.importePorVenta());
	}
	*/
	

}
