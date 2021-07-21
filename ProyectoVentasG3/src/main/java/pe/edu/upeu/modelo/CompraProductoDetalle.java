package pe.edu.upeu.modelo;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CompraProductoDetalle {

    public String Producto, UnidMed, Cantidad, IGV, TotalSoles, FechaVenta;
    public int IDCompra;
    
}
