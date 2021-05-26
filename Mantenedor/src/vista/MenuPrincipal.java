package vista;

import controlador.*;
import modelo.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.*;

public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
    }
    ArrayList<Cliente> listaCliente = new ArrayList();
    ArrayList<Tecnico> listaTecnico = new ArrayList();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuCliente = new javax.swing.JMenuBar();
        Cliente = new javax.swing.JMenu();
        AgregarCliente = new javax.swing.JMenuItem();
        ListarCliente = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        AgregarTecnico = new javax.swing.JMenuItem();
        ListarTecnico = new javax.swing.JMenuItem();
        Exit2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Cliente.setText("Cliente");

        AgregarCliente.setText("Agregar");
        AgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarClienteActionPerformed(evt);
            }
        });
        Cliente.add(AgregarCliente);

        ListarCliente.setText("Listar");
        ListarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarClienteActionPerformed(evt);
            }
        });
        Cliente.add(ListarCliente);

        Exit.setText("Salir");
        Cliente.add(Exit);

        MenuCliente.add(Cliente);

        jMenu1.setText("Tecnico");

        AgregarTecnico.setText("Agregar");
        AgregarTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarTecnicoActionPerformed(evt);
            }
        });
        jMenu1.add(AgregarTecnico);

        ListarTecnico.setText("Listar");
        ListarTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarTecnicoActionPerformed(evt);
            }
        });
        jMenu1.add(ListarTecnico);

        Exit2.setText("Salir");
        jMenu1.add(Exit2);

        MenuCliente.add(jMenu1);

        setJMenuBar(MenuCliente);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 643, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 449, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarClienteActionPerformed
        // Agregar Cliente
        RegistroCliente agregar = new RegistroCliente();
        Cliente cliente = agregar.agregarCliente();
        JOptionPane.showMessageDialog(null, "Hola");
    }//GEN-LAST:event_AgregarClienteActionPerformed

    private void AgregarTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarTecnicoActionPerformed
        // Agregar Tecnico
        RegistroTecnico agregar = new RegistroTecnico();
        String status = agregar.agregarTecnico();
        JOptionPane.showMessageDialog(null, status);
    }//GEN-LAST:event_AgregarTecnicoActionPerformed

    private void ListarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarClienteActionPerformed
        Listar abrir = new Listar();
        abrir.setVisible(true);
    }//GEN-LAST:event_ListarClienteActionPerformed

    private void ListarTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarTecnicoActionPerformed
        Listar abrir = new Listar();
        abrir.setVisible(true);
    }//GEN-LAST:event_ListarTecnicoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AgregarCliente;
    private javax.swing.JMenuItem AgregarTecnico;
    private javax.swing.JMenu Cliente;
    private javax.swing.JMenuItem Exit;
    private javax.swing.JMenuItem Exit2;
    private javax.swing.JMenuItem ListarCliente;
    private javax.swing.JMenuItem ListarTecnico;
    private javax.swing.JMenuBar MenuCliente;
    private javax.swing.JMenu jMenu1;
    // End of variables declaration//GEN-END:variables
}
