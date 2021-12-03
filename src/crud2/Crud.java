package crud2;

import Conexion.conexion;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Crud extends javax.swing.JFrame {

    conexion con = new conexion();
    Connection cc;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    int ID;

    public Crud() {
        initComponents();
        this.setLocationRelativeTo(null);
        consultar();  
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        datoss = new javax.swing.JScrollPane();
        datos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        Actualizar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txtNumeroTelefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtUsuarioNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCorreoElectronico = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\kelvy\\OneDrive\\Escritorio\\Mis programas\\city.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(697, 0, 180, 490));

        jLabel2.setFont(new java.awt.Font("Roboto Bk", 0, 24)); // NOI18N
        jLabel2.setText("CRUD-REGISTRO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Bk", 1, 14)); // NOI18N
        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 160, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Bk", 1, 14)); // NOI18N
        jLabel4.setText("Apellido");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, -1, -1));

        datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre de usuario", "Nombre", "Apellido", "Numero de telefono", "Correo electronico", "Contraseña"
            }
        ));
        datos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                datosMouseClicked(evt);
            }
        });
        datoss.setViewportView(datos);

        jPanel1.add(datoss, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 690, 190));

        jButton1.setText("Nuevo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        Actualizar.setText("Actualizar");
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, -1, -1));

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        jPanel1.add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 460, -1, -1));

        jButton4.setText("Cerrar sesion");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 460, -1, -1));
        jPanel1.add(txtNumeroTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 160, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Bk", 1, 14)); // NOI18N
        jLabel5.setText("Nombre de usuario");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 160, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Bk", 1, 14)); // NOI18N
        jLabel6.setText("Numero de telefono");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));
        jPanel1.add(txtUsuarioNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 160, -1));

        jLabel7.setFont(new java.awt.Font("Roboto Bk", 1, 14)); // NOI18N
        jLabel7.setText("Correo electronico");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, -1, -1));
        jPanel1.add(txtCorreoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 160, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Bk", 1, 14)); // NOI18N
        jLabel8.setText("ID");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel9.setFont(new java.awt.Font("Roboto Bk", 1, 14)); // NOI18N
        jLabel9.setText("Contraseña");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, -1, -1));
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 160, -1));

        txtID.setEditable(false);
        txtID.setEnabled(false);
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 70, -1));

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));

        exit.setFont(new java.awt.Font("Roboto Bk", 1, 14)); // NOI18N
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("X");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
           login a = new login();
                a.setVisible(true);
                this.setVisible(false);

    }//GEN-LAST:event_jButton4MouseClicked

      
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
        modificar();
        consultar();
    }//GEN-LAST:event_ActualizarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        eliminar();
        consultar();
        nuevo();
    }//GEN-LAST:event_EliminarActionPerformed

    private void datosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datosMouseClicked
        int fila = datos.getSelectedRow();
        if (fila==-1){
            JOptionPane.showMessageDialog(null,"Usuario no seleccionado");
        } else {
            ID = Integer.parseInt((String)datos.getValueAt(fila, 0).toString());
            String userName = (String)datos.getValueAt(fila,1);
            String name = (String)datos.getValueAt(fila,2);
            String lastname = (String)datos.getValueAt(fila,3);
            String number = (String)datos.getValueAt(fila,4);
            String email = (String)datos.getValueAt(fila,5);
            String password = (String)datos.getValueAt(fila,6);
            txtID.setText(""+ID);
            txtUsuarioNombre.setText(userName);
            txtNombre.setText(name);
            txtApellido.setText(lastname);
            txtNumeroTelefono.setText(number);
            txtCorreoElectronico.setText(email);
            txtContraseña.setText(password);
        }
    }//GEN-LAST:event_datosMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked

             System.exit(0);

    }//GEN-LAST:event_exitMouseClicked

    
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
            java.util.logging.Logger.getLogger(Crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crud().setVisible(true);
            }
        });
    }
    
    private void consultar(){
        String sql = "select * from persona";
        try{
            cc = con.conexion();
            st = cc.createStatement();
            rs = st.executeQuery(sql);
            Object[]persona = new Object[7];
            modelo = (DefaultTableModel)datos.getModel();
            while (rs.next()){
                persona[0] = rs.getInt("ID");
                persona[1] = rs.getString("Nombre de usuario");
                persona[2] = rs.getString("Nombre");
                persona[3] = rs.getString("Apellido");
                persona[4] = rs.getString("Numero de telefono");
                persona[5] = rs.getString("Correo electronico");
                persona[6] = rs.getString("Contraseña");
                modelo.addRow(persona);
            }
        } catch (SQLException e){
            System.out.println("Error al conectarse a la base de datos"+e);
                    }
    }
    
     void modificar(){
        String userName = txtUsuarioNombre.getText();
        String name = txtNombre.getText();
        String lastName = txtApellido.getText();
        String number = txtNumeroTelefono.getText();
        String email = txtCorreoElectronico.getText();
        String password = txtContraseña.getText();
        String sql = "update persona set Nombre de usuario='"+userName+"', Nombre='"+name+"', Apellido='"+lastName+"', Numero de telefono='"+number+"', Correo electronico='"+email+"', Contraseña='"+password+"' where ID="+ID;
        try{
            cc = con.conexion();
            st = cc.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Usuario actualizado");
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Ocurrio un error al actualizar el usuario");
                    }
    } 
     
     void eliminar(){
        int filas = datos.getSelectedRow();
        if (filas == -1){
            JOptionPane.showMessageDialog(null,"Seleccione por lo menos una fila antes de proceder");
        } else {
            String sql = "delete from persona where ID="+ID;
            try{
            cc = con.conexion();
            st = cc.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Usuario eliminado");
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Ocurrio un error al eliminar el usuario");
                    }
        }
    }
     
     void nuevo(){
        txtUsuarioNombre.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtNumeroTelefono.setText("");
        txtCorreoElectronico.setText("");
        txtContraseña.setText("");
    }
     
     
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JTable datos;
    private javax.swing.JScrollPane datoss;
    private javax.swing.JLabel exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtCorreoElectronico;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumeroTelefono;
    private javax.swing.JTextField txtUsuarioNombre;
    // End of variables declaration//GEN-END:variables

}


