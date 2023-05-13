package polimorfismo;

/**
 * @author angel
 */
import java.util.Calendar;

public class main {

    public static void main(String[] args) {
                Calendar fecha1 = Calendar.getInstance();
        fecha1.set(2023, 04, 9);
        Calendar fecha2 = Calendar.getInstance();
        fecha2.set(2023, 05, 6);
        Calendar fecha3 = Calendar.getInstance();
        fecha3.set(2022, 12, 9);
        empleado empleado1 = new empleado("Juan","Juan","Juan",12345,"71112", "Calle", "Colonia", "Ciudad","Pais");
        empleado1.setIdEmpleado("201601094889d");
        empleado1.setFechaIngreso(fecha1);
        empleado profesor2 = new empleado("Angel", "Cordoba  Perez", 19);
        profesor2.setIdProfesor("16212671271");
        empleado profesor3 = new empleado("Messi Jesus", "Andres Blas", 13);
        profesor3.setIdProfesor("487487387943");

        proveedor profesor4 = new proveedor("Harry", "Potter", 17, fecha1);
        profesor4.setIdProfesor("123456789");
        proveedor profesor5 = new proveedor("El", "Bicho", 16, fecha2);
        profesor5.setIdProfesor("232422244242432");
        proveedor profesor6 = new proveedor("Han", "Solo ", 72, fecha3);
        profesor6.setIdProfesor("12324253535");
        Calendar fecha4 = Calendar.getInstance();
        fecha4.set(2020, 02, 9);
        Calendar fecha5 = Calendar.getInstance();
        fecha5.set(2010, 10, 6);
        Calendar fecha6 = Calendar.getInstance();
        fecha6.set(2015, 11, 9);
        pedido profesor7 = new pedido("Leo", "Fernandez ", 25, fecha4);
        profesor7.setIdProfesor("12324253535");
        pedido profesor8 = new pedido("Jean", "David ", 28, fecha5);
        profesor8.setIdProfesor("12324253535");
        pedido profesor9 = new pedido("Maxi", "Araujo ", 25, fecha6);
        profesor9.setIdProfesor("12324253535");
        lista l1 = new lista();
        l1.addProfesor(profesor1);
        l1.addProfesor(profesor2);
        l1.addProfesor(profesor3);
        l1.addProfesor(profesor4);
        l1.addProfesor(profesor5);
        l1.addProfesor(profesor6);
        l1.addProfesor(profesor7);
        l1.addProfesor(profesor8);
        l1.addProfesor(profesor9);
        l1.listar();
    }
}
