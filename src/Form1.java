
import javax.swing.JTextArea;


public class Form1 extends javax.swing.JFrame {
    
    
    
    public static int[][] user = {{1, 100, 0, 0, 0},
                        {2, 100, 0, 0, 0},
                        {3, 100, 0, 0, 0}};
        
        
    public static int[][] tovar = {{1, 5, 0, 0, 0},
                        {2, 8, 0, 0, 0},
                        {3, 11, 0, 0, 0}};
    
    public static int userID;
    public static int tovarID;
    public static int u1 = 0;
    public static int u2 = 0;
    public static int u3 = 0;
    public static int t1 = 0;
    public static int t2 = 0;
    public static int t3 = 0;
    public static int amount;
    public static int price;


    public Form1() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setText("Users");

        jLabel2.setText("Goods");

        jLabel3.setText("ID");

        jLabel4.setText("First Name");

        jLabel5.setText("Last Name");

        jLabel6.setText("Amount,USD");

        jLabel7.setText("Product 1");

        jLabel8.setText("Product2");

        jLabel9.setText("Product3");

        jLabel10.setText("jLabel10");

        jButton1.setText("Buy");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel11.setText("jLabel11");

        jLabel12.setText("jLabel12");

        jLabel13.setText("ID");

        jLabel14.setText("Name");

        jLabel15.setText("Price, USD");

        jLabel16.setText("jLabel16");

        jLabel17.setText("jLabel17");

        jLabel18.setText("jLabel18");

        jLabel19.setText("Enter User ID");

        jTextField1.setText("1");

        jLabel20.setText("Enter Product ID ");

        jTextField2.setText("1");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel21.setText("User 1, pcs");

        jLabel22.setText("User2, pcs");

        jLabel23.setText("User3, pcs");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel4)
                                            .addGap(42, 42, 42)
                                            .addComponent(jLabel5)
                                            .addGap(49, 49, 49)
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel7))
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(46, 46, 46)
                                    .addComponent(jLabel8)
                                    .addGap(36, 36, 36)
                                    .addComponent(jLabel9))
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addComponent(jLabel14)
                                        .addGap(88, 88, 88)
                                        .addComponent(jLabel15)))
                                .addGap(59, 59, 59)
                                .addComponent(jLabel21)
                                .addGap(38, 38, 38)
                                .addComponent(jLabel22)
                                .addGap(43, 43, 43)
                                .addComponent(jLabel23))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField2)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addContainerGap(147, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    int SuserID = Integer.parseInt(jTextField1.getText());
    int Spid = Integer.parseInt(jTextField2.getText());
     
    //System.out.println("Ryjgrf");
    
    
    if (SuserID == 1) {
        userID = 0;
        amount = user[0][1];
  
    
    };
    
    if (SuserID == 2) {
        userID = 1;
        amount = user[1][1];
  
        
    
    };
    
    if (SuserID == 3) {
        userID = 2;
        amount = user[2][1];
      
    
    };
    
    if (Spid == 1) {
        tovarID = 0;
        price = 5;
     
        
    
    };
    
     if (Spid == 2) {
        tovarID = 1;
        price = 8;
      
    
    };
    
     if (Spid == 3) {
        tovarID = 2;
        price = 11;
     
    
    };
    
    user[userID][1]= amount - price;
    if (user[userID][1] >= 0){jLabel25.setText("Congratulations! You have bought this product!");
    user[userID][tovarID+2]= user[userID][tovarID+2] + 1;
    tovar[tovarID][userID+2] = tovar[tovarID][userID+2] + 1;
     
    };
    if (user[userID][1] < 0){jLabel25.setText("You dont have enought money(((");
    user[userID][1]= amount;
    };
    
    
    
    
    String S1 = 1 + "             John" + "                        Connor                           " + user[0][1] +"                           "+user[0][2]+"                                 "+user[0][3]+"                           "+user[0][4];
      jLabel10.setText(S1);
      String S2 = 2 + "             Ivan" + "                          Osmith                           " + user[1][1] +"                           "+user[1][2]+"                                 "+user[1][3]+"                           "+user[1][4];
      jLabel11.setText(S2);
      String S3 = 3 + "             Tony" + "                         Darkos                           " + user[2][1] +"                           "+user[2][2]+"                                 "+user[2][3]+"                           "+user[2][4];
      jLabel12.setText(S3);
      
      String T1 = 1 + "               Tovar1" + "                             " + 5 + "                                           " + tovar[0][2] + "                               " + tovar[0][3] + "                                 " + tovar[0][4] ;
      jLabel16.setText(T1);
      String T2 = 2 + "               Tovar2" + "                             " + 8 + "                                           " + tovar[1][2] + "                               " + tovar[1][3] + "                                 " + tovar[1][4] ;
      jLabel17.setText(T2);
      String T3 = 3 + "               Tovar3" + "                             " + 11 + "                                         " + tovar[2][2] + "                               " + tovar[2][3] + "                                 " + tovar[2][4] ;
      jLabel18.setText(T3);
    
    
    
    
    
    
    
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
      
      //String S1 = 1 + "             John" + "                        Connor                           " + 100 +"                           "+0+"                                 "+0+"                           "+0;
      //jLabel10.setText(S1);
      //String S2 = 2 + "             Ivan" + "                          Osmith                           " + 100 +"                           "+0+"                                 "+0+"                           "+0;
      //jLabel11.setText(S2);
      //String S3 = 3 + "             Tony" + "                         Darkos                           " + 100 +"                           "+0+"                                 "+0+"                           "+0;
      //jLabel12.setText(S3);
       String S1 = 1 + "             John" + "                        Connor                           " + user[0][1] +"                           "+user[0][2]+"                                 "+user[0][3]+"                           "+user[0][4];
      jLabel10.setText(S1);
      String S2 = 2 + "             Ivan" + "                          Osmith                           " + user[1][1] +"                           "+user[1][2]+"                                 "+user[1][3]+"                           "+user[1][4];
      jLabel11.setText(S2);
      String S3 = 3 + "             Tony" + "                         Darkos                           " + user[2][1] +"                           "+user[2][2]+"                                 "+user[2][3]+"                           "+user[2][4];
      jLabel12.setText(S3);
      
      
      String T1 = 1 + "               Tovar1" + "                             " + 5 + "                                           " + tovar[0][2] + "                               " + tovar[0][3] + "                                 " + tovar[0][4] ;
      jLabel16.setText(T1);
      String T2 = 2 + "               Tovar2" + "                             " + 8 + "                                           " + tovar[1][2] + "                               " + tovar[1][3] + "                                 " + tovar[1][4] ;
      jLabel17.setText(T2);
      String T3 = 3 + "               Tovar3" + "                             " + 11 + "                                         " + tovar[2][2] + "                               " + tovar[2][3] + "                                 " + tovar[2][4] ;
      jLabel18.setText(T3);
      
    }//GEN-LAST:event_formWindowActivated

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

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
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
       
        
      
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
