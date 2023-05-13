package polimorfismo;

/**
 *
 * @author angel
 */
import java.util.Calendar;

public class cliente extends persona {

    private String idCliente;
    private Calendar fechaRegistro;

    public cliente(String nombre, String apellidoPaterno, String apellidoMaterno, int curp, String telefono, String calleNo, String colonia, String ciudad, String pais) {
        super(nombre, apellidoPaterno, apellidoMaterno, curp, telefono, calleNo, colonia, ciudad, pais);
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public Calendar getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Calendar fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    
    
    @Override
    public void mostrarDatos() {
        System.out.println("Datos empleado: \n Nombre: "+getNombre()+" "+getApellidoPaterno()+" "+getApellidoMaterno()+" ID Cliente: "+getIdCliente()+"Fecha de ingreso:  "+fechaRegistro.getTime().toString()+" Sueldo: "+" CURP: "+ getCurp()+" Telefono: "+getTelefono()+" Calle: "+getCalleNo()+" Colonia: "+getColonia()+" Ciudad: "+getCiudad()+"Pais:  "+getPais());
    }
}
