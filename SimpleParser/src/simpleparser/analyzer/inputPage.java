package simpleparser.analyzer;

import java.util.ArrayList;
import simpleparser.MainMenu;

public class inputPage extends javax.swing.JFrame {

    //mengumpulkan token yg disimpan untuk diinisialisasi
    public static ArrayList<Tahap1> lex = new ArrayList<Tahap1>();
    //mengumpulkan token sblm disimpan
    public static ArrayList<Integer> token = new ArrayList<Integer>();

    //untuk debug
    private int count;
    
    //variabel
    public static String temp = "";
    public static String inp;
    private int i = 0;
    
    //bawaan java gui
    public inputPage() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        analyzerbutton = new javax.swing.JButton();
        back = new javax.swing.JButton();
        field = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        analyzerbutton.setText("Analyze");
        analyzerbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analyzerbuttonActionPerformed(evt);
            }
        });

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel1.setText("Token Analyzer");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(analyzerbutton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(field, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(analyzerbutton)
                .addGap(83, 83, 83)
                .addComponent(back)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void analyzerbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analyzerbuttonActionPerformed
        // TODO add your handling code here:
        
        //ambil input
        inp = field.getText();
        
        //untuk debug
        printchar();
        
        //menginisialisasi token dari input
        analyzer();
        
        //menampilkan output
        outputPage a = new outputPage(lex);
        this.setVisible(false);
        a.setLocationRelativeTo(null);
        a.setVisible(true);
    }//GEN-LAST:event_analyzerbuttonActionPerformed

    //kembali ke menu
    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        MainMenu m = new MainMenu();
        this.setVisible(false);
        m.setVisible(true);
        m.setLocationRelativeTo(null);
    }//GEN-LAST:event_backActionPerformed

    //debug menentukan panjang input
    private void printchar(){
        temp = (inp).toString();
        count = (temp).length();
        System.out.println("Length = "+(temp).length());
    }
    
    
    //menginisialisasi jenis input kedalam array token
    public void analyzer(){
        i = 0;
        while (i<temp.length()){
            if(temp.charAt(i)=='p' || temp.charAt(i)=='q' || temp.charAt(i)=='r' || temp.charAt(i)=='s'){
                i++;
                if(i !=temp.length()){
                    if(temp.charAt(i)==' '){
                        token.add(1);
                        i++;
                    } else {
                        System.out.println("error"); break;
                    }
                } else {
                    token.add(1);
                }
            } else if (temp.charAt(i)=='n') {
                i++;
                if(temp.charAt(i)=='o'){
                    i++;
                    if(temp.charAt(i)=='t'){
                        i++;
                        if(i!=temp.length()){
                            if(temp.charAt(i)==' '){
                                token.add(2);
                                i++;
                            } else {
                                System.out.println("error"); break;
                            }
                        } else {
                            token.add(2); i++;
                        }
                    } else {
                        System.out.println("error"); break;
                    }
                } else {
                    System.out.println("error"); break;
                }
            } else if (temp.charAt(i)=='a'){
                i++;
                if(temp.charAt(i)=='n'){
                    i++;
                    if(temp.charAt(i)=='d'){
                        i++;
                        if(i!=temp.length()){
                            if(temp.charAt(i)==' '){
                                token.add(3);
                                i++;
                            } else {
                                System.out.println("error"); break;
                            }
                        } else {
                            token.add(3);
                            break;
                        }
                    } else {
                        System.out.println("error"); break;
                    }
                } else {
                    System.out.println("error"); break;
                }
            } else if(temp.charAt(i)=='x' && i!=temp.length()){
                i++;
                if(i!=temp.length()&&temp.charAt(i)=='o'){
                    i++;
                    if(i!=temp.length()&&temp.charAt(i)=='r'){
                        i++;
                        if(i!=temp.length()){
                            if(temp.charAt(i)==' '){
                                token.add(5);
                                i++;
                            } else {
                                System.out.println("error"); break;
                            }
                        } else {
                            token.add(3); i++;
                        }
                    } else {
                        System.out.println("error"); break;
                    }
                } else {
                    System.out.println("error"); break;
                }
            } else if(temp.charAt(i)=='o' & i!=temp.length()){
                i++;
                if(i!=temp.length()&&temp.charAt(i)=='r'){
                    i++;
                    if(i!=temp.length()){
                        if(temp.charAt(i)==' '){
                            token.add(4);
                            i++;
                        } else {
                            System.out.println("error"); break;
                        }
                    } else {
                        token.add(4);
                        i++;
                    }
                } else {
                    System.out.println("error"); break;
                }
            } else if(i!=temp.length()&&temp.charAt(i)=='i'){
                i++;
                if(i!=temp.length()&&temp.charAt(i)=='f'){
                    i++;
                    if(i!=temp.length()){
                        if(temp.charAt(i)=='f'){
                            i++;
                            if(i!=temp.length()){
                                if(temp.charAt(i)==' '){
                                token.add(8);
                                i++;
                            } else {
                                System.out.println("error"); break;
                            }
                        } else {
                            token.add(8);
                            i++;
                        }
                    } else if(i!=temp.length()){
                        if(temp.charAt(i)==' '){
                            token.add(6);
                            i++;
                        } else {
                            System.out.println("error"); break;
                        }
                    } else {
                        token.add(6);
                        i++;
                    }
                } else {
                    System.out.println("error"); break;
                }
            } else {
                    System.out.println("error"); break;
            }
        } else if(i!=temp.length()&&temp.charAt(i)=='t'){
            i++;
            if(i!=temp.length()&&temp.charAt(i)=='h'){
                i++;
                if(i!=temp.length()&&temp.charAt(i)=='e'){
                    i++;
                    if(i!=temp.length()&&temp.charAt(i)=='n'){
                        i++;
                        if(i!=temp.length()){
                            if(temp.charAt(i)==' '){
                                token.add(7);
                                i++;
                            } else {
                                System.out.println("error"); break;
                            }
                        } else {
                            token.add(7);
                            i++;
                        }
                    } else {
                        System.out.println("error"); break;
                    }
                } else {
                    System.out.println("error"); break;
                }
            } else {
                System.out.println("error"); break;
            }
        } else if(i!=temp.length()&&temp.charAt(i)=='('){
            i++;
            if(i!=temp.length()){
                if(temp.charAt(i)==' '){
                    token.add(9);
                    i++;
                } else {
                    System.out.println("error"); break;
                }
            } else {
                token.add(9);
                i++;
            }
        } else if(i!=temp.length()&&temp.charAt(i)==')'){
            i++;
            if(i!=temp.length()){
                if(temp.charAt(i) == ' '){
                    token.add(10);
                    i++;
                } else {
                    System.out.println("error"); break;
                }
            } else {
                token.add(10);
                i++;
            }
        } else {
                System.out.println("error"); break;
        }
    }
        
        //menyimpan data input dan array token kedalam class biasa
        Tahap1 a = new Tahap1(temp,token);
        lex.add(a);
        
        //reset untuk next use
        a = null;
        temp = "";
    }
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
            java.util.logging.Logger.getLogger(inputPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inputPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inputPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inputPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inputPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton analyzerbutton;
    private javax.swing.JButton back;
    private javax.swing.JTextField field;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
