package controlador;

import bd.*;
import modelo.*;
import java.sql.*;
import java.util.ArrayList;
import jdk.nashorn.internal.objects.NativeArray;

public class RegistroCliente {

    ArrayList<Cliente> listaCliente = new ArrayList();

    public String buscarCliente(String Rut) {
        Cliente cliente1 = new Cliente();
        cliente1.setNombre("JOSE ANTONIO");
        cliente1.setRun("14365847-3");
        Cliente cliente2 = new Cliente();
        cliente2.setNombre("LUIS ALBERTO ");
        cliente2.setRun("13338250-K");
        listaCliente.add(cliente1);
        listaCliente.add(cliente2);

        for (int i = 0; i < listaCliente.size(); i++) {
            if (listaCliente.get(i).getRun().equals(Rut)) {
                return listaCliente.get(i).getNombre();
            }
        }

        return "Anonimo";
    }

    public static boolean validarRut(String rut) {

        boolean validacion = false;
        try {
            rut = rut.toUpperCase();
            rut = rut.replace(".", "");
            rut = rut.replace("-", "");
            int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));

            char dv = rut.charAt(rut.length() - 1);

            int m = 0, s = 1;
            for (; rutAux != 0; rutAux /= 10) {
                s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
            }
            if (dv == (char) (s != 0 ? s + 47 : 75)) {
                validacion = true;
            }

        } catch (java.lang.NumberFormatException e) {
        } catch (Exception e) {
        }
        return validacion;
    }
}
