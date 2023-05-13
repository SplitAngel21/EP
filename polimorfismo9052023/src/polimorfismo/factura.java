package polimorfismo;

/**
 *
 * @author angel
 */
import java.util.Calendar;

public class factura {

    private Calendar fechaFactura;
    private String folioFactura;
    private String idCliente;

    public factura(Calendar fechaFactura, String folioFactura, String idCliente) {
        this.fechaFactura = fechaFactura;
        this.folioFactura = folioFactura;
        this.idCliente = idCliente;
    }

    public String getIdCliente() {
        return idCliente;
    }
    

    public Calendar getFechaFactura() {
        return fechaFactura;
    }

    public String getFolioFactura() {
        return folioFactura;
    }
    
    public void mostrarDatos() {
        System.out.println("Informacion de factura: \n"+getFolioFactura()+" Fecha:"+fechaFactura.getTime().toString()+" Proveedor: "+getIdCliente());    
    }
}
