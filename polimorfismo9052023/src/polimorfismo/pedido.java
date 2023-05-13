package polimorfismo;

/**
 *
 * @author angel
 */
import java.util.Calendar;

public class pedido{

    private Calendar fechaPedido;
    private String folioPedido;
    private String idProveedor;

    public pedido(Calendar fechaPedido, String folioPedido, String idProveedor) {
        this.fechaPedido = fechaPedido;
        this.folioPedido = folioPedido;
        this.idProveedor = idProveedor;
    }
            
    public Calendar getFechaPedido() {
        return fechaPedido;
    }
    public String getFolioPedido() {
        return folioPedido;
    }

    public String getIdProveedor() {
        return idProveedor;
    }
    

    public void mostrarDatos() {
        System.out.println("Informacion de pedido: \n"+getFolioPedido()+" Fecha:"+fechaPedido.getTime().toString()+" Proveedor: "+getIdProveedor());    
    }
}
