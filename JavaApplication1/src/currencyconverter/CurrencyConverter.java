/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currencyconverter;
import java.sql.*;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import javax.swing.JOptionPane;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import org.json.JSONObject;

/**
 *
 * @author vandana
 */
public class CurrencyConverter extends javax.swing.JFrame {
    String[] currencyUnits = {
            "units",
            "US Dollar",
            "Nigerian Naira",
            "Brazilian Real",
            "Canadian Dollar",
            "Kenyan Shilling",
            "Indonesian Rupiah",
            "Indian Rupee",
            "Philippine Pisco",
            "Pakistani Rupee"
    };
    static double US_Dollar = 0;
    static double Nigerian_Naira = 0;
    static double Brazilian_Real = 0;
    static double Canadian_Dollar = 0;
    static double Kenyan_Shilling = 0;
    static double Indonesian_Rupiah = 0;
    static double Indian_Rupee = 0;
    static double Philippine_Pisco = 0;
    static double Pakistani_Rupee = 0;

    /**
     * Creates new form CurrencyConverter
     */
    public CurrencyConverter() {
        initComponents();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
            Statement st = (Statement) cn.createStatement();
           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"not connected");
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        firstcountry = new javax.swing.JComboBox<>();
        secondcountry = new javax.swing.JComboBox<>();
        t2 = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        secondcurrencyUnit = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        firstcurrencyUnit = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
                jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE));
        jFrame1Layout.setVerticalGroup(
                jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CURRENCY CONVERTER");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED,
                new java.awt.Color(0, 51, 153), new java.awt.Color(0, 204, 204), new java.awt.Color(51, 102, 255),
                new java.awt.Color(102, 255, 204)));

        firstcountry.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        firstcountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose ", "USA", "Nigeria",
                "Brazil", "Canada", "Kenyan", "Indonesia", "India", "Philippine", "Pakistan" }));
        firstcountry.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                firstcountryItemStateChanged(evt);
            }
        });
        firstcountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstcountryActionPerformed(evt);
            }
        });

        secondcountry.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        secondcountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose ", "USA", "Nigeria",
                "Brazil", "Canada", "Kenyan", "Indonesia", "India", "Philippine", "Pakistan" }));
        secondcountry.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                secondcountryItemStateChanged(evt);
            }
        });
        secondcountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secondcountryActionPerformed(evt);
            }
        });

        t2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });

        t1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });

        secondcurrencyUnit.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        secondcurrencyUnit.setForeground(new java.awt.Color(255, 255, 255));
        secondcurrencyUnit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        secondcurrencyUnit.setText("Units");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("From Currency");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("To Currency");

        firstcurrencyUnit.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        firstcurrencyUnit.setForeground(new java.awt.Color(255, 255, 255));
        firstcurrencyUnit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        firstcurrencyUnit.setText("                              Units");

        jButton1.setBackground(new java.awt.Color(102, 255, 102));
        jButton1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButton1.setText("Convert Currency");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 255, 255));
        jButton2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(153, 255, 255));
        jButton3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(182, 182, 182)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 131,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(firstcountry, 0, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        Short.MAX_VALUE)
                                                .addComponent(t1)
                                                .addComponent(firstcurrencyUnit, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        242, Short.MAX_VALUE)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(secondcountry, 0, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        Short.MAX_VALUE)
                                                .addComponent(t2)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                                                .addComponent(secondcurrencyUnit, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 129,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(166, 166, 166))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(359, 359, 359)
                                .addComponent(jLabel1)
                                .addContainerGap(358, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 226,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(473, 473, 473)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(firstcountry, javax.swing.GroupLayout.DEFAULT_SIZE, 53,
                                                Short.MAX_VALUE)
                                        .addComponent(secondcountry))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(secondcurrencyUnit))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(firstcurrencyUnit, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40,
                                        Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstcountryActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_firstcountryActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_firstcountryActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_t1ActionPerformed

    }// GEN-LAST:event_t1ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_t2ActionPerformed

    private void secondcountryActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_secondcountryActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_secondcountryActionPerformed

    private void firstcountryItemStateChanged(java.awt.event.ItemEvent evt) {// GEN-FIRST:event_firstcountryItemStateChanged
        int position = firstcountry.getSelectedIndex();

        firstcurrencyUnit.setText(currencyUnits[position]);

    }// GEN-LAST:event_firstcountryItemStateChanged

    private void secondcountryItemStateChanged(java.awt.event.ItemEvent evt) {// GEN-FIRST:event_secondcountryItemStateChanged
        int position = secondcountry.getSelectedIndex();

        secondcurrencyUnit.setText(currencyUnits[position]);

    }// GEN-LAST:event_secondcountryItemStateChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
         String arr[]= {"USA","BRL","NGN","CAD","KES","IDR","INR","PHP","PKR"};
            Double arr2[]= {US_Dollar,Brazilian_Real,Nigerian_Naira,Canadian_Dollar,Kenyan_Shilling, Indonesian_Rupiah,Indian_Rupee,Philippine_Pisco,Pakistani_Rupee};
        try {
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
            for(int i=0;i<arr.length;i++){
                //String query ="insert into score values('"+arr[i]+"', '"+arr2[i]+"')";
                 String updateque="UPDATE score SET previous_result='"+arr2[i]+"' where enter='"+arr[i]+"'";
            PreparedStatement st= cn.prepareStatement(updateque);
          int rows = st.executeUpdate(updateque);
          if(rows>0){
              System.out.println("success");
              for(int j=0;j<arr.length;j++){
               String up="UPDATE score SET current_data='' where enter='"+arr[j]+"'";
               int rows2 = st.executeUpdate(up);
               if(rows2>0){
                   System.out.println("updated");
               }
              }
              
          }}
        } catch (SQLException ex) {
            System.err.print(ex);
        }
        finally{
       System.exit(0); }
        
    }// GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        // convert Currency
        if (firstcountry.getSelectedIndex() == 0 || secondcountry.getSelectedIndex() == 0 || t1.getText().equals("")) {
            JOptionPane.showMessageDialog(null,
                    "Must SELECT Both Countries and input the amount", "Error",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        if (t1.getText().equals("@")) {
            JOptionPane.showMessageDialog(null,
                    "input the valid amount", "Error",
                    JOptionPane.WARNING_MESSAGE);
        }
        double amountToChange = Double.parseDouble(t1.getText());
        double amountInPounds = 0.0;
        switch (firstcountry.getSelectedItem().toString()) {
            case "USA":
                amountInPounds = amountToChange / US_Dollar;
                break;
            case "Nigerian":
                amountInPounds = amountToChange / Nigerian_Naira;
                break;
            case "Brazil":
                amountInPounds = amountToChange / Brazilian_Real;
                break;
            case "Canada":
                amountInPounds = amountToChange / Canadian_Dollar;
                break;
            case "Kenyan":
                amountInPounds = amountToChange / Kenyan_Shilling;
                break;
            case "Indonesia":
                amountInPounds = amountToChange / Indonesian_Rupiah;
                break;
            case "India":
                amountInPounds = amountToChange / Indian_Rupee;
                break;
            case "Philippine":
                amountInPounds = amountToChange / Philippine_Pisco;
                break;
            case "Pakistan":
                amountInPounds = amountToChange / Pakistani_Rupee;
                break;
            default:
                amountInPounds = 0.0;
        }
        double amountChanged = 0.0;
        switch (secondcountry.getSelectedItem().toString()) {
            case "USA":
                amountChanged = amountInPounds * US_Dollar;
                break;
            case "Nigerian":
                amountChanged = amountInPounds * Nigerian_Naira;
                break;
            case "Brazil":
                amountChanged = amountInPounds * Brazilian_Real;
                break;
            case "Canada":
                amountChanged = amountInPounds * Canadian_Dollar;
                break;
            case "Kenyan":
                amountChanged = amountInPounds * Kenyan_Shilling;
                break;
            case "Indonesia":
                amountChanged = amountInPounds * Indonesian_Rupiah;
                break;
            case "India":
                amountChanged = amountInPounds * Indian_Rupee;
                break;
            case "Philippine":
                amountChanged = amountInPounds * Philippine_Pisco;
                break;
            case "Pakistan":
                amountChanged = amountInPounds * Pakistani_Rupee;
                break;
            default:
                amountChanged = amountInPounds * 0;

        }
        String value = String.format("%.2f", amountChanged);
        t2.setText(value);
        String query ="insert into currency values('"+firstcountry.getSelectedItem().toString() + "->"+secondcountry.getSelectedItem().toString()+"','"+t1.getText()+"', '"+t2.getText()+"')";
        try {
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
            PreparedStatement st= cn.prepareStatement(query);
          int rows = st.executeUpdate(query);
          if(rows>0){
              System.out.println("currency table updated");
          }
        } catch (SQLException ex) {
            System.err.print(ex);
        }
    }// GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
        firstcountry.setSelectedIndex(0);
        secondcountry.setSelectedIndex(0);
        t1.setText(null);
        t2.setText(null);
    }// GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         * 
         */

        String url = "https://freecurrencyapi.net/api/v2/latest?apikey=8e06f530-8a36-11ec-b691-4b75042bb420";
        try {
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("GET");
            int responseCode = con.getResponseCode();
            System.out.println("Response Code " + responseCode);
            BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line + "\n");
            }
            br.close();
            System.out.println("API Data \n" + sb.toString());
            JSONObject json = new JSONObject(sb.toString());
            CurrencyConverter classObj = new CurrencyConverter();
            US_Dollar = 1;            
            Brazilian_Real = json.getJSONObject("data").getDouble("BRL");
            Nigerian_Naira = json.getJSONObject("data").getDouble("NGN");
            Canadian_Dollar = json.getJSONObject("data").getDouble("CAD");
            Kenyan_Shilling = json.getJSONObject("data").getDouble("KES");
            Indonesian_Rupiah = json.getJSONObject("data").getDouble("IDR");
            Indian_Rupee = json.getJSONObject("data").getDouble("INR");
            Philippine_Pisco = json.getJSONObject("data").getDouble("PHP");
            Pakistani_Rupee = json.getJSONObject("data").getDouble("PKR");
           String arr[]= {"USA","BRL","NGN","CAD","KES","IDR","INR","PHP","PKR"};
            Double arr2[]= {US_Dollar,Brazilian_Real,Nigerian_Naira,Canadian_Dollar,Kenyan_Shilling, Indonesian_Rupiah,Indian_Rupee,Philippine_Pisco,Pakistani_Rupee};
        try {
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
            String select="SELECT * FrOM score";
            ArrayList<String> prdata=new ArrayList();
            Statement st1=(Statement) cn.createStatement();
            ResultSet re=st1.executeQuery(select);
            while(re.next()){
                prdata.add(re.getString("previous_result"));
                
            }
            
            for(int i=0;i<arr.length;i++){
                double rate=(arr2[i])-Double.parseDouble(prdata.get(i));
                String newrate=String.format("%.2f", rate);
                //String query ="insert into score values('"+arr[i]+"', '"+arr2[i]+"')";
                 String updateque="UPDATE score SET current_data='"+arr2[i]+"', Rate='"+newrate+"' where enter='"+arr[i]+"'";
            PreparedStatement st= cn.prepareStatement(updateque);
          int rows = st.executeUpdate(updateque);
          if(rows>0){
              System.out.println("success");
          }}
        } catch (SQLException ex) {
            System.err.print(ex);
        }

        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CurrencyConverter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> firstcountry;
    private javax.swing.JLabel firstcurrencyUnit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> secondcountry;
    private javax.swing.JLabel secondcurrencyUnit;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    // End of variables declaration//GEN-END:variables
}
