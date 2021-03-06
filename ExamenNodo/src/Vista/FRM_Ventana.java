/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador_FRM_Ventana;

/**
 *
 * @author JoséFabián
 */
public class FRM_Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
   Controlador_FRM_Ventana control;
    public FRM_Ventana() {
        
        control = new Controlador_FRM_Ventana(this);
        initComponents();
        setLocationRelativeTo(null);
        agregarEventos(control);
        setCombo();
    }
    
    
    
    public void agregarEventos(Controlador_FRM_Ventana control){
        this.btn_AtenderCliente.addActionListener(control);
        this.btn_Buscar.addActionListener(control);
        this.btn_Cancelar.addActionListener(control);
        this.btn_MayorMenor.addActionListener(control);
        this.btn_MenorMayor.addActionListener(control);
        this.btn_Modificar.addActionListener(control);
        this.btn_Registrar.addActionListener(control);
        this.btn_Reportes.addActionListener(control);
    }

    public String[] regresarInfoPantalla(){
        String info[];
        info= new String[]{this.jt_Cedula.getText().trim(),this.jt_Nombre.getText().trim(),this.jt_Edad.getText().trim(),this.jt_FechaSolicitud.getText().trim(),this.jcb_Prioridad.getSelectedItem().toString()};
        return info;
    }
    
    public void setearInfo(String[] info){
         this.jt_Cedula.setText(info[0]);
         this.jt_Edad.setText(info[2]);
         this.jt_FechaSolicitud.setText(info[4]);
         this.jt_Nombre.setText(info[1]);
         this.jcb_Prioridad.setSelectedIndex(Integer.parseInt(info[3]));
    }
    
    public void desActivarCedula(){
        this.jt_Cedula.setEditable(false);
        this.jt_Cedula.setEnabled(false);
    }
    public void activarCedula(){
        this.jt_Cedula.setEditable(true);
        this.jt_Cedula.setEnabled(true);
    }
    
    public void activarModificarCancelar(){
          this.btn_Modificar.setEnabled(true);
          this.btn_Cancelar.setEnabled(true);
    }
    public void desActivarModificarCancelar(){
          this.btn_Modificar.setEnabled(false);
          this.btn_Cancelar.setEnabled(false);
    }
    
     public void setCombo(){
         this.jcb_Prioridad.removeAllItems();
         this.jcb_Prioridad.addItem("Normal");
         this.jcb_Prioridad.addItem("7600");
     }
     
     public void clear(){
         this.jt_Cedula.setText("");
         this.jt_Edad.setText("");
         this.jt_FechaSolicitud.setText("");
         this.jt_Nombre.setText("");
     }
    
    public void mostrarInfoEnPantalla(String mensaje){
        this.jta_Pizarra.setText("");
        this.jta_Pizarra.setText(mensaje);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_Titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta_Pizarra = new javax.swing.JTextArea();
        jl_Nombre = new javax.swing.JLabel();
        jl_Cedula = new javax.swing.JLabel();
        jl_Edad = new javax.swing.JLabel();
        jl_FechaSolicitud = new javax.swing.JLabel();
        jt_Cedula = new javax.swing.JTextField();
        jt_Nombre = new javax.swing.JTextField();
        jt_Edad = new javax.swing.JTextField();
        jt_FechaSolicitud = new javax.swing.JTextField();
        btn_Registrar = new javax.swing.JButton();
        btn_AtenderCliente = new javax.swing.JButton();
        btn_Cancelar = new javax.swing.JButton();
        btn_Modificar = new javax.swing.JButton();
        btn_Reportes = new javax.swing.JButton();
        btn_MenorMayor = new javax.swing.JButton();
        btn_MayorMenor = new javax.swing.JButton();
        btn_Buscar = new javax.swing.JButton();
        jl_Prioridad = new javax.swing.JLabel();
        jcb_Prioridad = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jl_Titulo.setText("Departamento de migración");

        jta_Pizarra.setColumns(20);
        jta_Pizarra.setRows(5);
        jScrollPane1.setViewportView(jta_Pizarra);

        jl_Nombre.setText("Nombre");

        jl_Cedula.setText("Cedula");

        jl_Edad.setText("Edad");

        jl_FechaSolicitud.setText("Fecha solicitud");

        btn_Registrar.setText("Registrar cita");

        btn_AtenderCliente.setText("Atender cliente siguiente");

        btn_Cancelar.setText("Cancelar cita");
        btn_Cancelar.setEnabled(false);

        btn_Modificar.setText("Modificar información cita");
        btn_Modificar.setEnabled(false);

        btn_Reportes.setText("Mostrar reportes");

        btn_MenorMayor.setText("<");

        btn_MayorMenor.setText(">");

        btn_Buscar.setText("Buscar");

        jl_Prioridad.setText("Prioridad");

        jcb_Prioridad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(177, 177, 177)
                                .addComponent(jl_Titulo))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jl_Cedula)
                                    .addComponent(jl_Nombre)
                                    .addComponent(jl_Edad))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jt_Cedula)
                                    .addComponent(jt_Nombre)
                                    .addComponent(jt_Edad)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jl_FechaSolicitud)
                                    .addComponent(jl_Prioridad))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jt_FechaSolicitud)
                                    .addComponent(jcb_Prioridad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Modificar)
                            .addComponent(btn_Cancelar)
                            .addComponent(btn_Registrar)
                            .addComponent(btn_Buscar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btn_AtenderCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_MenorMayor)
                        .addGap(18, 18, 18)
                        .addComponent(btn_MayorMenor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Reportes)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jl_Titulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_Cedula)
                            .addComponent(jt_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Registrar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_Nombre)
                            .addComponent(jt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Buscar))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_Edad)
                            .addComponent(jt_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Cancelar))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_FechaSolicitud)
                            .addComponent(jt_FechaSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Modificar))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Prioridad)
                    .addComponent(jcb_Prioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_AtenderCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_MenorMayor, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_MayorMenor)
                        .addComponent(btn_Reportes)))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FRM_Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AtenderCliente;
    private javax.swing.JButton btn_Buscar;
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JButton btn_MayorMenor;
    private javax.swing.JButton btn_MenorMayor;
    private javax.swing.JButton btn_Modificar;
    private javax.swing.JButton btn_Registrar;
    private javax.swing.JButton btn_Reportes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcb_Prioridad;
    private javax.swing.JLabel jl_Cedula;
    private javax.swing.JLabel jl_Edad;
    private javax.swing.JLabel jl_FechaSolicitud;
    private javax.swing.JLabel jl_Nombre;
    private javax.swing.JLabel jl_Prioridad;
    private javax.swing.JLabel jl_Titulo;
    private javax.swing.JTextField jt_Cedula;
    private javax.swing.JTextField jt_Edad;
    private javax.swing.JTextField jt_FechaSolicitud;
    private javax.swing.JTextField jt_Nombre;
    private javax.swing.JTextArea jta_Pizarra;
    // End of variables declaration//GEN-END:variables
}
