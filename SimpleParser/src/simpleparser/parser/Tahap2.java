
package simpleparser.parser;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import simpleparser.MainMenu;

public class Tahap2 extends javax.swing.JFrame {
    //variabel
    String[] str = {"String","Token"};
    int count9 = 0;
    int count10 = 0;
    public Tahap2() {
        initComponents();
    }
    
    //untuk bantuin pas debugging
    public String cekString(String token){
        String s = "";
        switch(token){
            case "1":
                s = "p,q,r,s";
                break;
            case "2":
                s = "not";
                break;
            case "3":
                s = "and";
                break;
            case "4":
                s = "or";
                break;
            case "5":
                s = "xor";
                break;
            case "6":
                s = "if";
                break;
            case "7":
                s = "then";
                break;
            case "8":
                s = "nor";
                break;
            case "9":
                s = "(";
                break;
            case "10":
                s = ")";
                break;
        }
        return s;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        inputField = new javax.swing.JTextField();
        parserButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        conditionLabel = new javax.swing.JLabel();
        jgnGanti = new javax.swing.JLabel();
        resetButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        inputField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputFieldActionPerformed(evt);
            }
        });

        parserButton.setText("Parse");
        parserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parserButtonActionPerformed(evt);
            }
        });

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabel.setGridColor(new java.awt.Color(240, 240, 240));
        jScrollPane1.setViewportView(tabel);

        jLabel1.setText("Input");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("LEXICAL PARSER");

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        conditionLabel.setText("NO INPUT");

        jgnGanti.setText("Condition :");

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(backButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jgnGanti)
                        .addGap(18, 18, 18)
                        .addComponent(conditionLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(resetButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(46, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputField, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(parserButton)))))
                .addGap(68, 68, 68))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(parserButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(conditionLabel)
                    .addComponent(jgnGanti)
                    .addComponent(resetButton))
                .addGap(27, 27, 27)
                .addComponent(backButton)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    //menginit tabel
    public void initializeTable(JTable jt, String[] kolom){
        DefaultTableModel t = new DefaultTableModel(kolom,0){
            @Override
            public boolean isCellEditable(int baris, int kolom){
                return false;
            }
        };
        jt.setModel(t);
    }
   
    //untuk mengatur keluaran gui tabel
   public void TabelManager(ArrayList<Integer> token, JTable x){
       initializeTable(x,str);
       DefaultTableModel dtm = (DefaultTableModel) x.getModel();
       int i = 0;
       while (i<token.size()){
           String[] baris = {
               cekString(token.get(i).toString()), token.get(i).toString()
           };
           dtm.addRow(baris); i++;
       }
   }
 
    private void inputFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputFieldActionPerformed
    //set valid awal
    String valid = "NOT VALID";
    
    //variabel
    int cek2 = 0 ; int cek3 = 0;                                                                                            //cek2 dan cek3
   
    // untuk cek kurung tutup
    public void setCek2(int x ){
        this.cek2 = x;
    }    
    
    //untuk cek kurung buka
    public void setCek3(int x){
        this.cek3 = x;
    }
    
    //setter getter cek
    public int getCek2(){
        return cek2;
    }
    public int getCek3(){
        return cek3;
    }
    //tombol saat parser dipencet
    private void parserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parserButtonActionPerformed
        // TODO add your handling code here:
        
        //variabel lokal
        String input = inputField.getText();
        int i = 0; int e = 0;
        char[] pecahan = input.toCharArray();
        ArrayList<String> urutan = new ArrayList<>();
        ArrayList<Integer> token = new ArrayList<>();
        
        // method untuk mencocokkan input perkata ke array token
        while(i<input.length()){
            
            //proposisi
            if (i != input.length() && (pecahan[i] == 'p' || pecahan[i] == 'q' || pecahan[i] == 'r' || pecahan[i] == 's')){
                i++;
                if(i!= input.length()){
                    if(pecahan[i] == ' '){
                        token.add(1); i++;
                    } else {
                        e = 1;
                        System.out.println("error"); break;
                    }
                } else {
                    token.add(1);
                }
                
                //not
            } else if (i != input.length() && pecahan[i] == 'n'){
                i++;
                if(i != input.length() && pecahan[i] == 'o'){
                    i++;
                    if(i != input.length() && pecahan[i] == 't'){
                        i++;
                        if(i != input.length()){
                            if(pecahan[i] == ' '){
                                token.add(2);
                                i++;
                            } else {
                                e = 1;
                                System.out.println("error"); break;
                            }
                        } else {
                            token.add(2);
                            i++;
                        }
                    } else {
                        e = 1;
                        System.out.println("error"); break;
                    }
                } else {
                    e = 1;
                    System.out.println("error"); break;
                }
                
                //and
            } else if (i != input.length() && pecahan[i] == 'a'){
                i++;
                if (i != input.length() && pecahan[i] == 'n'){
                    i++;
                    if (i != input.length() && pecahan[i] == 'd'){
                        i++;
                        if(i!=input.length()){
                            if(pecahan[i]== ' '){
                                token.add(3);
                                i++;
                            }else {
                                e = 1;
                                System.out.println("Error"); break;
                            }
                        } else {
                            token.add(3);
                            break;
                        }
                    } else {
                        e = 1;
                        System.out.println("error");
                        break;
                    }
                } else {
                    e = 1;
                    System.out.println("error"); break;
                }
                
                //xor
            } else if (i != input.length() && pecahan[i] == 'x'){
                i++;
                if(i != input.length() && pecahan[i] == 'o'){
                    i++;
                    if(i != input.length() && pecahan[i] == 'r'){
                        i++;
                        if(i != input.length()){
                            if(pecahan[i]==' '){
                                token.add(5);
                                i++;
                            }else {
                                System.out.println("error");
                                i++;
                            }
                        } else {
                            token.add(3);
                            i++;
                        }
                    } else {
                        System.out.println("error");
                        break;
                        }
                } else {
                    System.out.println("error");
                    break;
                    }
                
                //or
            } else if (i != input.length() && pecahan[i] == 'o'){
                i++;
                if(i != input.length() && pecahan[i] == 'r'){
                    i++;
                    if(i !=input.length()){
                        if (pecahan[i]==' '){
                            token.add(4);
                            i++;
                        } else {
                            e = 1;
                            System.out.println("error");
                             break;
                        }
                    } else {
                        token.add(4);
                        i++;
                    }
                } else {
                    e = 1;
                    System.out.println("error");
                    break;
                }
                
                //if
            } else if (i != input.length() && pecahan[i] == 'i'){
                i++;
                if(i != input.length() && pecahan[i] == 'f'){
                    i++;
                    if(i != input.length()){
                        
                        //iff
                        if(pecahan[i]=='f'){
                            i++;
                            if(i!=input.length()){
                                if(pecahan[i]==' '){
                                    token.add(8);
                                    i++;
                            } else {
                                    e = 1;
                                    System.out.println("error");
                                    break;
                                }
                        } else {
                                token.add(8);
                                i++;
                            }
                    } else if(i!=input.length()){
                        if(pecahan[i]==' '){
                            token.add(6);
                            i++;
                        } else {
                            e = 1;
                            System.out.println("error");
                            break;
                        }
                    } else {
                        token.add(6);
                        i++;
                    }
                } else {
                        e = 1;
                        System.out.println("error");
                        break;
                    }
                } else {
                    e = 1;
                    System.out.println("error");
                    break;
                }
                
                //then
            }  else if(i != input.length() && pecahan[i] == 't'){
                i++;
                if(i != input.length() && pecahan[i] == 'h'){
                    i++;
                    if(i != input.length() && pecahan[i] == 'e'){
                        i++;
                        if(i != input.length() && pecahan[i] == 'n'){
                            i++;
                            if(i!= input.length()){
                                if(pecahan[i]==' '){
                                    token.add(7);
                                    i++;
                                } else {
                                    e = 1;
                                    System.out.println("error");
                                    break;
                                }
                            } else {
                                token.add(7);
                                break;
                            }
                        } else {
                            e = 1;
                            System.out.println("error");
                            break;
                        }
                    } else {
                        e = 1;
                        System.out.println("error");
                        break;
                }
            } else {
                    e = 1;
                    System.out.println("error");
                    break;
                }
                
                //kurung buka
        } else if (i != input.length() && pecahan[i] == '('){
            i++;
            if(i!=input.length()){
                if(pecahan[i]==' '){
                    token.add(9);
                    int x = getCek2();
                    x++;
                    setCek2(x);
                    i++;
                } else {
                    e = 1;
                    System.out.println("error");
                    break;
                }
        } else {
                token.add(9);
                int x = getCek2();
                    x++;
                    setCek2(x);
                i++;
            }
            
            //kurung tutup
        } else if(i != input.length() && pecahan[i] == ')'){
            i++;
            if(i!=input.length()){
                if(pecahan[i]==' '){
                    token.add(10);
                    int x = getCek3();
                    x++;
                    setCek3(x);
                    i++;
                } else {
                    e = 1;
                    System.out.println("error");
                    break;
                }
            } else {
                token.add(10);
                int x = getCek3();
                    x++;
                    setCek3(x);
                i++;
            }
        } else {
                e = 1;
                System.out.println("error");
                break;
        }
    }
        
        
        //menerapkan aturan lexic dengan melihat token selanjutnya
        int p = 0;
        urutan.add("-");
        
        //selama urutan belum mencapai ukuran token
         while(p<token.size()){
             
             //mengambil token integer dan diubah string untuk dibaca case
            switch(token.get(p).toString()){
                
                case "1" : //proposisi
                    p++;
                    if(p!= token.size()){
                        if (token.get(p).toString().equals("1") ){
                            urutan.add("x");
                            p++;
                        } else if(token.get(p).toString().equals("4") || token.get(p).toString().equals("5") ||
                                token.get(p).toString().equals("3") || token.get(p).toString().equals("8")){ //and xor or if iff then
                            p++;
                        } 
                    } else if (urutan.size() == 1 && urutan.get(0).equals("-")) { //hanya proposisi saja
                        urutan.clear();
                        System.out.println("case 1 clear");
                    }
                    break;
                    
                case "2" : //not
                    System.out.println("masuk not");
                    p++;
                    if(p!=token.size()){
                        if(token.get(p).toString().equals("1")){ //proposisi
                            p++;
                        } else if (token.get(p).toString().equals("9")){ //kurung buka
                            urutan.add("(");
                            p++;
                        } else if (token.get(p).toString().equals("2")){ //not
                            p++;
                        }
                    } else {
                        valid = "NOT VALID";
                    }
                    break;
                    
                case "3" : //and 
                    p++;
                   if (token.get(p).toString().equals("3")||token.get(p).toString().equals("5")||
                            token.get(p).toString().equals("4")||token.get(p).toString().equals("6")||
                            token.get(p).toString().equals("8")||token.get(p).toString().equals("7")){ //and xor or if iff then
                        urutan.add("x");
                        p++;
                    }
                    else if(token.get(p).toString().equals("2")){ //not
                        p++;
                    } else if(token.get(p).toString().equals("1")){ //proposisi
                        p++;
                    } else if(token.get(p).toString().equals("9")){// (
                        urutan.add("(");
                        p++;
                    } else if (token.get(p).toString().isEmpty()){ //jika and merupakan end of string
                        urutan.add("eos");
                    }
                    break;
                case "4" : //or
                    p++;
                    if(token.get(p).toString().equals("2")){ //not
                        p++;
                    } else if(token.get(p).toString().equals("1")){ //proposisi
                        p++;
                    } else if(token.get(p).toString().equals("9")){ // (
                        urutan.add("(");
                        p++;
                    } else if (token.get(p).toString().equals("3")||token.get(p).toString().equals("5")||
                            token.get(p).toString().equals("4")||token.get(p).toString().equals("6")||
                            token.get(p).toString().equals("8")||token.get(p).toString().equals("7")){ //and xor or if iff then
                        urutan.add("x");
                        p++;
                    } else if (token.get(p).toString().isEmpty()){ //jika or merupakan end of string
                        urutan.add("eos");
                    }
                    break;
                case "5" : //xor
                    p++;
                    System.out.println("5" + token.get(p).toString());
                    if(token.get(p).toString().equals("2")){ // not
                        p++;
                    } else if(token.get(p).toString().equals("1")){ // proposisi
                        p++;
                    } else if(token.get(p).toString().equals("9")){ // (
                        urutan.add("(");
                        p++;
                    } else if (token.get(p).toString().equals("3")||token.get(p).toString().equals("5")||
                            token.get(p).toString().equals("4")||token.get(p).toString().equals("6")||
                            token.get(p).toString().equals("8")||token.get(p).toString().equals("7")){ //and xor if iff then
                        urutan.add("x");
                        p++;
                    } else if (token.get(p).toString().isEmpty()){ //jika xor merupakan end of string
                        urutan.add("eos");
                    }
                    break;
                case "6" : //if
                    p++;
                    if (token.get(p).toString().equals("3")||token.get(p).toString().equals("5")||
                            token.get(p).toString().equals("4")||token.get(p).toString().equals("6")||
                            token.get(p).toString().equals("8")||token.get(p).toString().equals("7")){ //and xor if iff then
                        urutan.add("x");
                        p++;
                    } else if (token.get(p).toString().isEmpty()){ //jika if merupakan end of string
                        urutan.add("eos");
                    } else {
                    urutan.add("if"); //normalnya
                    p++;
                    } 
                    break;
                case "7" : //then
                    p++;
                    int cek = urutan.size();
                    if (token.get(p).toString().equals("3")||token.get(p).toString().equals("5")||
                            token.get(p).toString().equals("4")||token.get(p).toString().equals("6")||
                            token.get(p).toString().equals("8")||token.get(p).toString().equals("7")){ //and xor if iff then
                        urutan.add("x");
                        p++;
                    } else if (token.get(p).toString().isEmpty()){ //jika if merupakan end of string
                        urutan.add("eos");
                    } else {
                        for (int a = 0; a < cek; a++){
                            if((a == (cek-1)) && urutan.get(a).equals("if")){ //jika sebelum then token if
                                urutan.remove(a);
                            } else if ((a == (cek-1)) && urutan.get(a).equals("#")){ //jika sebelum then token tagar
                                urutan.clear();
                            }
                        }
                    }
                    p++;
                    break;
                case "8" : //iff
                    p++;
                    if(token.get(p).toString().equals("2")){ // not
                        p++;
                    } else if(token.get(p).toString().equals("1")){ // proposisi
                        p++;
                    } else if(token.get(p).toString().equals("9")){ // kurung buka
                        urutan.add("(");
                        p++;
                    } else if (token.get(p).toString().equals("3")||token.get(p).toString().equals("5")||
                            token.get(p).toString().equals("4")||token.get(p).toString().equals("6")||
                            token.get(p).toString().equals("8")||token.get(p).toString().equals("7")){ //and xor if iff then
                        urutan.add("x");
                        p++;
                    } else if (token.get(p).toString().isEmpty()){ //jika iff merupakan end of string
                        urutan.add("eos");
                    }
                    break;
                case "9" : // (
                    if (token.get(p).toString().isEmpty()){ //jika kurung buka merupakan end of string
                        urutan.add("eos");
                    } else { //normalnya
                    urutan.add("(");
                    p++;
                    System.out.println("9" + token.get(p).toString());
                    break;
                    }
                case "10" : // )
                    if (token.get(p).toString().isEmpty()){ //jika kurung tutup merupakan end of string
                        urutan.add("eos");
                    } else {
                    urutan.add("-");
                    for (int x = 0; x < urutan.size(); x++){
                        if((x == (urutan.size()-1)) && urutan.get(x).equals("(")){ // jika ada input " ( ) " saja
                            urutan.remove(x);
                            System.out.println("remove");
                        } else if((x == (urutan.size()-1)) && urutan.get(x).equals("-")){ //jika diinput " ) " saja
                            urutan.clear();
                            System.out.println("clear");
                        }
                    }
                    p++;
                    }
                    break;
                default :
                    System.out.println("error");
                    break;
            }
        }
         
         //menghapus tagar atau si initial state agar empty
         for (int a = 0; a < urutan.size(); a++){
             if ((a == urutan.size()-1) && urutan.get(a).equals("-") ){
                 urutan.clear();
                 System.out.println("clear looping");
             }
         }
         
         //validasi
         if(urutan.isEmpty()){
             if(cek2==cek3){
             if(e!=1){
                 valid = "valid";
             } else {
                 valid = "not valid";
             }
         } else {
             valid="NOT VALID";
         }    
         } else  {
             System.out.println("not empty");              
             valid = "NOT VALID";
         }
        
         //menampilkan data ditabel
         TabelManager(token,tabel);
         conditionLabel.setText(valid);
         
         //untuk debug
         for(int q = 0; q< urutan.size(); q++){
             System.out.println(urutan.get(q));
         }
    }//GEN-LAST:event_parserButtonActionPerformed

    //untuk ke menu
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        MainMenu m = new MainMenu();
        this.setVisible(false);
        m.setVisible(true);
        m.setLocationRelativeTo(null);
    }//GEN-LAST:event_backButtonActionPerformed

    //untuk reset
    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        inputField.setText("");
        conditionLabel.setText("No Input");
        valid = "NO VALID";
        DefaultTableModel tab = (DefaultTableModel) tabel.getModel();
        tab.setRowCount(0);
    }//GEN-LAST:event_resetButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Tahap2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tahap2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tahap2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tahap2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            Tahap2 h = new Tahap2();
            public void run() {
                h.setVisible(true);
                h.setResizable(false);
            }
        });
    }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel conditionLabel;
    private javax.swing.JTextField inputField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jgnGanti;
    private javax.swing.JButton parserButton;
    private javax.swing.JButton resetButton;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables
}
