package pe.edu.upeu.modelo;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class VentaDetalleTO {

    public String Producto, UnidadMedida, PrecioUnidMed, CantidadVenta, IGV, TotalSoles, FechaVenta;
    public int IDVenta;
    
}
