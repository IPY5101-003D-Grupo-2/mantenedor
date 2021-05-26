package controlador;

import bd.*;
import modelo.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import jdk.nashorn.internal.objects.NativeArray;

public class RegistroTecnico {
    
    ArrayList<Tecnico> listaTecnico = new ArrayList();
    
    public String buscarTecnico(String Rut) {
        for (int i = 0; i < listaTecnico.size(); i++) {
            if (listaTecnico.get(i).getRun().equals(Rut)) {
                return listaTecnico.get(i).getNombre();
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
    
    public String agregarTecnico(){
        Tecnico tecnicoADD = new Tecnico();
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
            "HorarioTrabajo", f5,
            "Email", f6,
            "Password", f7,
                
                    };
        JOptionPane.showConfirmDialog(null, fields,"Agregar Tecnico", JOptionPane.OK_CANCEL_OPTION);
        tecnicoADD.setNombre(f1.getText());
        tecnicoADD.setApellido(f2.getText());
        tecnicoADD.setRun(f3.getText());
        tecnicoADD.setFono(f4.getText());
        tecnicoADD.setHorarioTrabajo(f5.getText());
        tecnicoADD.setEmail(f6.getText());
        tecnicoADD.setPassword(f7.getText());
        if(validarRut(tecnicoADD.getRun())){
            listaTecnico.add(tecnicoADD);
            return "Tecnico agregado exitosamente";
        }else {
            return "Run no valido, intentelo otra ves";
        }
    }
    
    public ArrayList getTecnicos(){
        return listaTecnico;
    }
}
