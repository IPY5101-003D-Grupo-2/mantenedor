package controlador;

import bd.*;
import modelo.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import jdk.nashorn.internal.objects.NativeArray;

public class RegistroCliente {

    public ArrayList<Cliente> listaCliente = new ArrayList();

    public String buscarCliente(String Rut) {
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
    
    public Cliente agregarCliente(){
        Cliente clienteADD = new Cliente();
        JTextField f1 = new JTextField();
        JTextField f2 = new JTextField();
        JTextField f3 = new JTextField();
        JTextField f4 = new JTextField();
        JTextField f5 = new JTextField();
        JTextField f6 = new JTextField();
        JTextField f7 = new JTextField();

        Object[] fields = {
            "Nombre", f1,
            "Apellido", f2,
            "Run", f3,
            "Fono", f4,
            "Direccion", f5,
            "Email", f6,
            "Password", f7,
                
                    };
        JOptionPane.showConfirmDialog(null, fields,"Agregar Cliente", JOptionPane.OK_CANCEL_OPTION);
        clienteADD.setNombre(f1.getText());
        clienteADD.setApellido(f2.getText());
        clienteADD.setRun(f3.getText());
        clienteADD.setFono(f4.getText());
        clienteADD.setDireccion(f5.getText());
        clienteADD.setEmail(f6.getText());
        clienteADD.setPassword(f7.getText());
        if(validarRut(clienteADD.getRun())){
            System.out.println(listaCliente.size());
            return clienteADD;
        }else {
            return clienteADD;
        }
    }
    
    public ArrayList getClientes(){
        System.out.println(listaCliente.size());
        return listaCliente;
    }
    
}
