package polimorfismo;

/**
 *
 * @author angel
 */
import java.util.Calendar;

public class proveedor extends persona {

    private Calendar fechaRegistro;
    private String idProveedor;

    public proveedor(String nombre, String apellidoPaterno, String apellidoMaterno, int curp, String telefono, String calleNo, String colonia, String ciudad, String pais) {
        super(nombre, apellidoPaterno, apellidoMaterno, curp, telefono, calleNo, colonia, ciudad, pais);
    }

    public Calendar getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Calendar fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }
    

    @Override
    public void mostrarDatos() {
        System.out.println("Datos empleado: \n Nombre: "+getNombre()+" "+getApellidoPaterno()+" "+getApellidoMaterno()+" ID Proveedor: "+getIdProveedor()+"Fecha de registro:  "+fechaRegistro.getTime().toString()+" CURP: "+ getCurp()+" Telefono: "+getTelefono()+" Calle: "+getCalleNo()+" Colonia: "+getColonia()+" Ciudad: "+getCiudad()+"Pais:  "+getPais());
    }
}
