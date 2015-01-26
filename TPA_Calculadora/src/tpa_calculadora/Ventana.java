/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpa_calculadora;

import static java.lang.String.valueOf;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.text.StyleConstants.setIcon;


/**
 *
 * @author fimaz
 */
public class Ventana extends javax.swing.JFrame {
   
    //obtener para agarra el contenido de txtPanel
    //agregar para agregar un numero o punto a txtpanel
    //contadorBtns para validar el tamaño a un maximo de 9 digitos
    String obtener, agregar, contadorBtns;
    
   
        
    
    
    
    
    public Ventana() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnOcho = new javax.swing.JButton();
        btnSiete = new javax.swing.JButton();
        btnNueve = new javax.swing.JButton();
        btnCuatro = new javax.swing.JButton();
        btnSeis = new javax.swing.JButton();
        btnCinco = new javax.swing.JButton();
        btnUno = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnDos = new javax.swing.JButton();
        btnCero = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btnRestar = new javax.swing.JButton();
        btnSumar = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        txtPanel = new javax.swing.JFormattedTextField();
        txtPanel2 = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TPA Calculadora");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setType(java.awt.Window.Type.UTILITY);

        btnOcho.setBackground(new java.awt.Color(51, 153, 255));
        btnOcho.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnOcho.setText("8");
        btnOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOchoActionPerformed(evt);
            }
        });

        btnSiete.setBackground(new java.awt.Color(51, 153, 255));
        btnSiete.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnSiete.setText("7");
        btnSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSieteActionPerformed(evt);
            }
        });

        btnNueve.setBackground(new java.awt.Color(51, 153, 255));
        btnNueve.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnNueve.setText("9");
        btnNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNueveActionPerformed(evt);
            }
        });

        btnCuatro.setBackground(new java.awt.Color(51, 153, 255));
        btnCuatro.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnCuatro.setText("4");
        btnCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuatroActionPerformed(evt);
            }
        });

        btnSeis.setBackground(new java.awt.Color(51, 153, 255));
        btnSeis.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnSeis.setText("6");
        btnSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeisActionPerformed(evt);
            }
        });

        btnCinco.setBackground(new java.awt.Color(51, 153, 255));
        btnCinco.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnCinco.setText("5");
        btnCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCincoActionPerformed(evt);
            }
        });

        btnUno.setBackground(new java.awt.Color(51, 153, 255));
        btnUno.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnUno.setText("1");
        btnUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnoActionPerformed(evt);
            }
        });

        btnTres.setBackground(new java.awt.Color(51, 153, 255));
        btnTres.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnTres.setText("3");
        btnTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTresActionPerformed(evt);
            }
        });

        btnDos.setBackground(new java.awt.Color(51, 153, 255));
        btnDos.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnDos.setText("2");
        btnDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDosActionPerformed(evt);
            }
        });

        btnCero.setBackground(new java.awt.Color(51, 153, 255));
        btnCero.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnCero.setText("0");
        btnCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCeroActionPerformed(evt);
            }
        });

        btnPunto.setBackground(new java.awt.Color(51, 153, 255));
        btnPunto.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnPunto.setText(".");
        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });

        btnDividir.setBackground(new java.awt.Color(252, 195, 154));
        btnDividir.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnDividir.setText("/");
        btnDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDividirActionPerformed(evt);
            }
        });

        btnMultiplicar.setBackground(new java.awt.Color(252, 195, 154));
        btnMultiplicar.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnMultiplicar.setText("*");
        btnMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicarActionPerformed(evt);
            }
        });

        btnRestar.setBackground(new java.awt.Color(252, 195, 154));
        btnRestar.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnRestar.setText("-");
        btnRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestarActionPerformed(evt);
            }
        });

        btnSumar.setBackground(new java.awt.Color(252, 195, 154));
        btnSumar.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnSumar.setText("+");
        btnSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarActionPerformed(evt);
            }
        });

        btnIgual.setBackground(new java.awt.Color(0, 153, 51));
        btnIgual.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnIgual.setText("=");
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });

        btnBorrar.setBackground(new java.awt.Color(204, 0, 0));
        btnBorrar.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnBorrar.setText("c");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        txtPanel.setBorder(null);
        txtPanel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        txtPanel.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPanel.setText("0");
        txtPanel.setToolTipText("");
        txtPanel.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        txtPanel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPanelKeyTyped(evt);
            }
        });

        txtPanel2.setBorder(null);
        txtPanel2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        txtPanel2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPanel2.setEnabled(false);
        txtPanel2.setFocusable(false);
        txtPanel2.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPanel)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnUno, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(btnDos, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnCero, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTres, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRestar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSumar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtPanel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(txtPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUno, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDos, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(btnCero, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTres, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRestar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnSumar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private double suma(double valor1, double valor2){
        double resultado;
        resultado = valor1 + valor2;
        
        return(resultado);
    }
    
    private double resta(double valor1, double valor2){
        double resultado;
        resultado = valor1 - valor2;
        
        return(resultado);
    }
    
    private double multiplicacion(double valor1, double valor2){
        double resultado;
        resultado = valor1 * valor2;
        
        return(resultado);
    }
    
    private double division(double valor1, double valor2){
        double resultado;
        resultado = valor1 / valor2;
        
        return(resultado);
    }
    
    private void btnRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestarActionPerformed
        obtener = txtPanel.getText()+" -";
        txtPanel2.setText(obtener);
        txtPanel.setText("");
    }//GEN-LAST:event_btnRestarActionPerformed

    private void btnCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCeroActionPerformed
        obtener = txtPanel.getText();
        agregar = obtener+"0";
        
        txtPanel.setText(agregar);
    }//GEN-LAST:event_btnCeroActionPerformed

    private void btnUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnoActionPerformed
         obtener = txtPanel.getText();
        
        //Validar no mayor a 10 digitos por medio de botones
        
        if(obtener.length() <= 8){
        //Validar cuando sea cero eliminarlo
            if(obtener.equals("0")){
                agregar = "1";
            }else{
                agregar = obtener+"1";
            }
        
        txtPanel.setText(agregar);
        }
        
    }//GEN-LAST:event_btnUnoActionPerformed

    private void btnDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDosActionPerformed
        obtener = txtPanel.getText();
        
        //Validar no mayor a 10 digitos por medio de botones
        
        if(obtener.length() <= 8){
        //validar cuando sea cero eliminarlo
            if(obtener.equals("0")){
                agregar = "2";
            }else{
                agregar = obtener+"2";
            }
            txtPanel.setText(agregar);
        }
    }//GEN-LAST:event_btnDosActionPerformed

    private void btnTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTresActionPerformed
        obtener = txtPanel.getText();
        
        //Validar no mayor a 10 digitos por medio de botones
        
        if(obtener.length() <= 8){
        //validar cuando sea cero eliminarlo
            if(obtener.equals("0")){
                agregar = "3";
            }else{
                agregar = obtener+"3";
            }
        
            txtPanel.setText(agregar);
        }
    }//GEN-LAST:event_btnTresActionPerformed

    private void btnCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuatroActionPerformed
        obtener = txtPanel.getText();
        
        //Validar no mayor a 10 digitos por medio de botones
        
        if(obtener.length() <= 8){
        //validar cuando sea cero eliminarlo
            if(obtener.equals("0")){
                agregar = "4";
            }else{
                agregar = obtener+"4";
            }
            txtPanel.setText(agregar);
        }
    }//GEN-LAST:event_btnCuatroActionPerformed

    private void btnCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCincoActionPerformed
        obtener = txtPanel.getText();
        
        //Validar no mayor a 10 digitos por medio de botones
        
        if(obtener.length() <= 8){
        //validar cuando sea cero eliminarlo
            if(obtener.equals("0")){
                agregar = "5";
            }else{
                agregar = obtener+"5";
            }
            txtPanel.setText(agregar);
        }
    }//GEN-LAST:event_btnCincoActionPerformed

    private void btnSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeisActionPerformed
        obtener = txtPanel.getText();
        
        //Validar no mayor a 10 digitos por medio de botones
        
        if(obtener.length() <= 8){
        //validar cuando sea cero eliminarlo
            if(obtener.equals("0")){
                agregar = "6";
            }else{
                agregar = obtener+"6";
            }
            txtPanel.setText(agregar);
        }
    }//GEN-LAST:event_btnSeisActionPerformed

    private void btnSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSieteActionPerformed
        obtener = txtPanel.getText();
        
        //Validar no mayor a 10 digitos por medio de botones
        
        if(obtener.length() <= 8){
        //validar cuando sea cero eliminarlo
            if(obtener.equals("0")){
                agregar = "7";
            }else{
                agregar = obtener+"7";
            }
            txtPanel.setText(agregar);
        }
    }//GEN-LAST:event_btnSieteActionPerformed

    private void btnOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOchoActionPerformed
        obtener = txtPanel.getText();
        
        //Validar no mayor a 10 digitos por medio de botones
        
        if(obtener.length() <= 8){
        //validar cuando sea cero eliminarlo
            if(obtener.equals("0")){
                agregar = "8";
            }else{
                agregar = obtener+"8";
            }
            txtPanel.setText(agregar);
        }
    }//GEN-LAST:event_btnOchoActionPerformed

    private void btnNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNueveActionPerformed
        obtener = txtPanel.getText();
            
        //Validar no mayor a 10 digitos por medio de botones
        
        if(obtener.length() <= 8){
        //validar cuando sea cero eliminarlo
            if(obtener.equals("0")){
                agregar = "9";
            }else{
                agregar = obtener+"9";
            }
            txtPanel.setText(agregar);
        }
    }//GEN-LAST:event_btnNueveActionPerformed

    private void btnDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDividirActionPerformed
        obtener = txtPanel.getText()+" /";
        txtPanel2.setText(obtener);
        txtPanel.setText("");
    }//GEN-LAST:event_btnDividirActionPerformed

    private void btnMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicarActionPerformed
        obtener = txtPanel.getText()+" *";
        txtPanel2.setText(obtener);
        txtPanel.setText("");
    }//GEN-LAST:event_btnMultiplicarActionPerformed

    private void btnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarActionPerformed
        obtener = txtPanel.getText()+" +";
        txtPanel2.setText(obtener);
        txtPanel.setText("");
    }//GEN-LAST:event_btnSumarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        txtPanel.setText("0");
        txtPanel2.setText("");
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        System.out.print("lugo");
        String contenidoPanel = txtPanel.getText();
        String contenidoPanel2 = txtPanel2.getText();
        
        String numero1="", operacion="", resultadoString;
        double resultado=0;
        
        if(contenidoPanel2.equals("")){
            JOptionPane.showMessageDialog(null,"¡ERROR! No se encontraron paremetros. ");
        }else{
            if(contenidoPanel.equals("")){
                JOptionPane.showMessageDialog(null,"¡ERROR! No se encontraron paremetros. ");

            }else{
                
                for(int i=0; i<contenidoPanel2.length(); i++){
                   
                    char c = contenidoPanel2.charAt(i);

                    //agrupamos los numeros
                    if(c == '0' || c == '1'|| c == '2'|| c == '3'|| c == '4'|| c == '5'|| c == '6'|| c == '7'|| c == '8'|| c == '9' || c == '.'){
                        numero1 =numero1+c; 
                    }

                    //definimos la operacion que se realizara
                    if(c == '+'){
                        operacion ="suma"; 
                    }
                    if(c == '-'){
                        operacion ="resta"; 
                    }
                    if(c == '*'){
                        operacion ="multiplicacion"; 
                    }
                    if(c == '/'){
                        operacion ="division"; 
                }
            }
                
                   //cast de primer valor de String a double
                   double valor1 = Double.parseDouble(numero1);
                   //cast del segundo valor de String a double
                   double valor2 = Double.parseDouble(contenidoPanel);
                   
                 //Seleccion del metodo de operacion para suma, resta, multiplicacion y division
                if(operacion.equals("suma")){
                    
                    resultado = suma(valor1, valor2);
                    
                }
                
                if(operacion.equals("resta")){
                    
                    resultado = resta(valor1, valor2);
                    
                }
                
                if(operacion.equals("multiplicacion")){
                    
                    resultado = multiplicacion(valor1, valor2);
                    
                }
                
                if(operacion.equals("division")){
                    
                    resultado = division(valor1, valor2);
                    
                }
                
                    //insertamos el resultado y limpiamos!
                    resultadoString = valueOf(resultado);
                    txtPanel.setText(resultadoString);
                    txtPanel2.setText("");
            
        
        }
        }
    }//GEN-LAST:event_btnIgualActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
        obtener = txtPanel.getText();
        //validar cuando sea cero eliminarlo
        if(obtener.equals("0")){
            agregar = "0.";
        }else{
            agregar = obtener+".";
        }
        txtPanel.setText(agregar);
    }//GEN-LAST:event_btnPuntoActionPerformed

    private void txtPanelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPanelKeyTyped
        
        
        //Validacion por teclado solo numeros
        char c = evt.getKeyChar();
        if(c<'0' || c>'9'){
            evt.consume();
        }
        
        //Validacion por teclado no mayor a 10 
        String tamañoNumero =txtPanel.getText();
        if (tamañoNumero.length()>=9){
            evt.consume();
        }
        
    }//GEN-LAST:event_txtPanelKeyTyped

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCero;
    private javax.swing.JButton btnCinco;
    private javax.swing.JButton btnCuatro;
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnDos;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnNueve;
    private javax.swing.JButton btnOcho;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnRestar;
    private javax.swing.JButton btnSeis;
    private javax.swing.JButton btnSiete;
    private javax.swing.JButton btnSumar;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnUno;
    private javax.swing.JFormattedTextField txtPanel;
    private javax.swing.JFormattedTextField txtPanel2;
    // End of variables declaration//GEN-END:variables
}
