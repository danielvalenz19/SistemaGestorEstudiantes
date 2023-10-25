/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CapaPresentacion;

import CapaDatos.Conexion;
import CapaLogica.FuncionesEstudiantes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Reportes extends javax.swing.JFrame {

    /**
     * Creates new form Reportes
     */
    public Reportes() {
        initComponents();
        FuncionesEstudiantes funcionesEstudiantes = new FuncionesEstudiantes();
        funcionesEstudiantes.mostrarEstudiantesEnTabla(TablaResultados, btnGuardarReporte, btnGuardarReporte);
        this.setLocationRelativeTo(this);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaResultados = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIdEstudiante = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtGrado = new javax.swing.JTextField();
        txtSeccioni = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtReporte = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnGuardarReporte = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TablaResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Apellido", "Fecha Nacimiento", "Sexo", "grado", "seccion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaResultados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaResultadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaResultados);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jLabel1.setText("Reportes");

        jLabel2.setText("Codigo de identificacion del estudiante");

        txtIdEstudiante.setEditable(false);

        jLabel3.setText("Nombre del estudiante");

        txtNombre.setEditable(false);

        jLabel4.setText("Grado");

        txtGrado.setEditable(false);

        txtSeccioni.setEditable(false);

        jLabel5.setText("Seccion");

        jLabel6.setText("Reporte");

        btnGuardarReporte.setText("Guardar reporte");
        btnGuardarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarReporteActionPerformed(evt);
            }
        });

        btnReporte.setText("Ver reporte");
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });

        jButton1.setText("Pagina principal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtIdEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtSeccioni, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnGuardarReporte)
                                    .addComponent(btnReporte))
                                .addGap(0, 34, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtReporte))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(344, 344, 344)
                        .addComponent(jLabel1)
                        .addGap(95, 95, 95)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIdEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(txtGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnReporte)
                                .addGap(37, 37, 37)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtSeccioni, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardarReporte))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TablaResultadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaResultadosMouseClicked

        // Obtener el modelo de la tabla
        DefaultTableModel modelo = (DefaultTableModel) TablaResultados.getModel();

        // Obtener la fila seleccionada
        int filaSeleccionada = TablaResultados.getSelectedRow();

        // Verificar si hay una fila seleccionada
        if (filaSeleccionada != -1) {
            // Obtener los valores de las celdas en la fila seleccionada
            Object id = modelo.getValueAt(filaSeleccionada, 0);
            Object nombre = modelo.getValueAt(filaSeleccionada, 1);
            Object grado = modelo.getValueAt(filaSeleccionada, 5);
            Object seccion = modelo.getValueAt(filaSeleccionada, 6);

            // Asignar los valores a los campos de texto y combobox
            txtIdEstudiante.setText(id.toString());
            txtNombre.setText(nombre.toString());
            txtGrado.setText(grado.toString());
            txtSeccioni.setText(seccion.toString());

        }
    }//GEN-LAST:event_TablaResultadosMouseClicked
    private void actualizarReporteEstudiante(int idEstudiante, String reporte) {
        Conexion db = new Conexion();

        try {
            Connection cn = db.getConnection();
            String consultaSQL = "UPDATE estudiantes SET reporte=? WHERE id_estudiante=?";
            PreparedStatement pst = cn.prepareStatement(consultaSQL);

            pst.setString(1, reporte);
            pst.setInt(2, idEstudiante);

            int filasActualizadas = pst.executeUpdate();

            if (filasActualizadas > 0) {
                JOptionPane.showMessageDialog(null, "Reporte del estudiante guardado correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo guardar el reporte del estudiante.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar el reporte del estudiante: " + e);
        } finally {
            db.close(); // Cerrar la conexión al finalizar
        }
    }
    private void btnGuardarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarReporteActionPerformed

        // Obtener el modelo de la tabla
        DefaultTableModel modelo = (DefaultTableModel) TablaResultados.getModel();

        // Obtener la fila seleccionada
        int filaSeleccionada = TablaResultados.getSelectedRow();

        // Verificar si hay una fila seleccionada
        if (filaSeleccionada != -1) {
            // Obtener el valor de la celda en la columna del campo reporte
            Object id = modelo.getValueAt(filaSeleccionada, 0);

            // Obtener el texto del txtReporte
            String reporte = txtReporte.getText();

            // Verificar si el campo reporte no está vacío
            if (!reporte.isEmpty()) {
                // Actualizar la información en la base de datos
                actualizarReporteEstudiante(Integer.parseInt(id.toString()), reporte);

                // Limpiar el txtReporte después de guardar
                txtReporte.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "El campo de reporte está vacío. Por favor, ingrese un reporte.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, selecciona una fila para agregar un reporte.");
        }

    }//GEN-LAST:event_btnGuardarReporteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        AgregarReCon agregarReCon = new AgregarReCon();
        agregarReCon.setVisible(true);
        dispose();


    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        int idEstudiante = Integer.parseInt(txtIdEstudiante.getText());

        FuncionesEstudiantes funcionesEstudiantes = new FuncionesEstudiantes();

        String reporte = funcionesEstudiantes.obtenerReportePorId(idEstudiante);

        // Muestra el reporte en una ventana flotante
        JOptionPane.showMessageDialog(this, "Reporte: " + reporte, "Reporte del Estudiante", JOptionPane.INFORMATION_MESSAGE);


    }//GEN-LAST:event_btnReporteActionPerformed

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
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaResultados;
    private javax.swing.JButton btnGuardarReporte;
    private javax.swing.JButton btnReporte;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtGrado;
    private javax.swing.JTextField txtIdEstudiante;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtReporte;
    private javax.swing.JTextField txtSeccioni;
    // End of variables declaration//GEN-END:variables
}
