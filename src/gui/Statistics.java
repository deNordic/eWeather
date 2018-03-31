package gui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import eweather.*;

public class Statistics extends javax.swing.JFrame {

    //String []cityname = {"Αθήνα","Θεσσαλονίκη","Πάτρα","Λάρισα","Ηράκλειο"};
    //int []id_codes = {264371,734077,8133690,8133786,261745};
    

    public Statistics() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        statisticsCityNameJComboBox = new javax.swing.JComboBox<>();
        tempJButton = new javax.swing.JButton();
        cityTempJButton = new javax.swing.JButton();
        statisticsReturnJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane01 = new javax.swing.JScrollPane();
        statisticsJTable1 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        statisticsCityNameJComboBox.setMaximumRowCount(5);
        statisticsCityNameJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Athens", "Thessaloniki", "Patra", "Larisa", "Heraklion" }));
        statisticsCityNameJComboBox.setSelectedItem(null);
        statisticsCityNameJComboBox.setToolTipText("");
        statisticsCityNameJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statisticsCityNameJComboBoxActionPerformed(evt);
            }
        });

        tempJButton.setText("Temperatures min/max for single city");
        tempJButton.setPreferredSize(new java.awt.Dimension(160, 60));
        tempJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempJButtonActionPerformed(evt);
            }
        });
        tempJButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tempJButtonKeyPressed(evt);
            }
        });

        cityTempJButton.setText("Temperatures for all cities");
        cityTempJButton.setPreferredSize(new java.awt.Dimension(160, 60));
        cityTempJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityTempJButtonActionPerformed(evt);
            }
        });

        statisticsReturnJButton.setText("Back");
        statisticsReturnJButton.setPreferredSize(new java.awt.Dimension(60, 30));
        statisticsReturnJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statisticsReturnJButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Statistics menu");

        jLabel3.setText("Select a city:");

        statisticsJTable1.getTableHeader().setReorderingAllowed(false);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, statisticsJTable1, org.jdesktop.beansbinding.ObjectProperty.create(), statisticsJTable1, org.jdesktop.beansbinding.BeanProperty.create("elements"));
        bindingGroup.addBinding(binding);
        binding.bind();
        jScrollPane01.setViewportView(statisticsJTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane01, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(statisticsReturnJButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(statisticsCityNameJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cityTempJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(tempJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(122, 122, 122)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tempJButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(statisticsCityNameJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(cityTempJButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane01, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(statisticsReturnJButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void statisticsReturnJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statisticsReturnJButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_statisticsReturnJButtonActionPerformed

   
/*-----------------------------------------------------------------------------/ 
    Event για το κουμπί "Θερμοκρασία min/max" για κάθε επιλεγμένη πόλη      
/-----------------------------------------------------------------------------*/
    
    private void tempJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempJButtonActionPerformed
        if (statisticsCityNameJComboBox.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null,"No city is selected from the list","Display Message",JOptionPane.INFORMATION_MESSAGE);
        }
        
        else { //δημιουργία custom JTable με 3 στήλες
            
            statisticsJTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
            "City", "Min Temp (°C)", "Max Temp (°C)"
            }
            ));
            
            DefaultTableModel model = (DefaultTableModel)statisticsJTable1.getModel();
            model.setRowCount(0); //αρχικοποίηση των γραμμών του JTable
            
            for(int i=0; i<5; i++)    {
                
                if(statisticsCityNameJComboBox.getSelectedItem() == CityIndex.getCityName(i)) { //αντιστοίχιση της επιλογής (cityname με id_codes) με βάση τους πίνακες στην αρχή  
                    //Query για επιλογή ελάχιστης και μέγιστης θερμοκρασίας από τον πίνακα DBWEATHERNOW της ΒΔ 
                    showStatisticsJTable("SELECT CITYNAME, MIN(TEMP) AS MINTEMP, MAX(TEMP) AS MAXTEMP FROM DBWEATHERNOW WHERE CITYID=" +CityIndex.getCityCode(i)+ " GROUP BY CITYNAME");   
                }    
            }
        }
    }//GEN-LAST:event_tempJButtonActionPerformed
                                         
    
    private void statisticsCityNameJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statisticsCityNameJComboBoxActionPerformed
        
    }//GEN-LAST:event_statisticsCityNameJComboBoxActionPerformed

    
/*-----------------------------------------------------------------------------/ 
    Event για το κουμπί "Θερμοκρασία ανά πόλη" για όλες τις πόλεις     
/-----------------------------------------------------------------------------*/   
    
    private void cityTempJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityTempJButtonActionPerformed
            
            //Δημιουργία custom JTable με 3 στήλες
            statisticsJTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
            "City", "Min Temp (°C)", "Max Temp (°C)", "Average Temp (°C)"
            }
            ));
            
            //Αρχικοποίηση γραμμών του JTable
            DefaultTableModel model = (DefaultTableModel)statisticsJTable1.getModel();
            model.setRowCount(0);
            
            for(int i=0; i<5; i++) {
                //Query για επιλογή ελάχιστης, μέγιστης και μέσης θερμοκρασίας από τον πίνακα DBWEATHERNOW της ΒΔ για όλες τις πόλεις
                showAllCitiesStatisticsJTable("SELECT CITYNAME, MIN(TEMP) AS MINTEMP, MAX(TEMP) AS MAXTEMP, CAST(AVG(TEMP) AS DECIMAL(5,2)) AS AVGTEMP FROM DBWEATHERNOW WHERE CITYID= "+CityIndex.getCityCode(i)+" GROUP BY CITYNAME");      
            
            }      
    }//GEN-LAST:event_cityTempJButtonActionPerformed

       
    private void tempJButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tempJButtonKeyPressed

    }//GEN-LAST:event_tempJButtonKeyPressed
    
       
    private void showStatisticsJTable(String query)    {
        
        //Πέρασμα δεδομένων από τη ΒΔ σε λίστα αντικειμένων της κλάσης Temp
        ArrayList <Temp> list = getSingleCityTemps(query);
            
        DefaultTableModel model = (DefaultTableModel)statisticsJTable1.getModel(); 
        Object[] row = new Object [3];
        row[0] = list.get(0).getCityName(); //Πλήρωση της 1ης στήλης με το όνομα της πόλης
        row[1] = list.get(0).getMinTemp();  //Πλήρωση της 2ης στήλης με ελάχιστη θερμοκρασία
        row[2] = list.get(0).getMaxTemp();  //Πλήρωση της 3ης στήλης με μέγιστη θερμοκρασία
        
        model.addRow(row); //Συμπλήρωση του μοντέλου του JTable 
    }    
    
    private void showAllCitiesStatisticsJTable(String query)    {
        
        //Πέρασμα δεδομένων από τη ΒΔ σε λίστα αντικειμένων της κλάσης Temp
        ArrayList <Temp> list = getAllCitiesTemps(query);
       
        DefaultTableModel model = (DefaultTableModel)statisticsJTable1.getModel();
        Object[] row = new Object [4];       
        row[0] = list.get(0).getCityName(); //Πλήρωση της 1ης στήλης με το όνομα της πόλης
        row[1] = list.get(0).getMinTemp();  //Πλήρωση της 2ης στήλης με ελάχιστη θερμοκρασία
        row[2] = list.get(0).getMaxTemp();  //Πλήρωση της 3ης στήλης με μέγιστη θερμοκρασία
        row[3] = list.get(0).getAvgTemp();  //Πλήρωση της 4ης στήλης με μέση θερμοκρασία
        
        model.addRow(row); //Συμπλήρωση του μοντέλου του JTable 
    }        
    
/*-----------------------------------------------------------------------------/
    Σύνδεση με τη ΒΔ και άντληση δεδομένων με query
------------------------------------------------------------------------------*/
    public ArrayList<Temp> getSingleCityTemps(String query)  {
        
        ArrayList<Temp> tempList = new ArrayList<>();
    try {
        //Δημιουργία σύνδεσης με db
        Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/weatherdb","wdb","123"); 
        //query για την ανάκτηση των δεδομένων
        
        Statement st;
        ResultSet rs;
        st = conn.createStatement();
        rs = st.executeQuery(query);
        
        Temp temp;
        
        while(rs.next()) {
            
            temp = new Temp(rs.getString("cityname"),rs.getDouble("MINTEMP"),rs.getDouble("MAXTEMP"));
            tempList.add(temp);
        }
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return tempList;
    }

/*-----------------------------------------------------------------------------/
    Σύνδεση με τη ΒΔ και άντληση δεδομένων με query
------------------------------------------------------------------------------*/
    public ArrayList<Temp> getAllCitiesTemps(String query)  {
        
        ArrayList<Temp> citiesTempList = new ArrayList<>();
    try {
        //Δημιουργία σύνδεσης με db
        Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/weatherdb","wdb","123"); 
        
        //query για την ανάκτηση των δεδομένων
        Statement st;
        ResultSet rs;
        st = conn.createStatement();
        rs = st.executeQuery(query);
        
        Temp temp;
        
        while(rs.next()) {
            
            temp = new Temp(rs.getString("cityname"),rs.getDouble("MINTEMP"),rs.getDouble("MAXTEMP"),rs.getDouble("AVGTEMP"));
            citiesTempList.add(temp);
        }
            
        }
        catch(Exception e){
            e.printStackTrace();
        
        }
        return citiesTempList;
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
            java.util.logging.Logger.getLogger(Statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Statistics().setVisible(true);
            }
        });
    }   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cityTempJButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane01;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JComboBox<String> statisticsCityNameJComboBox;
    private javax.swing.JTable statisticsJTable1;
    private javax.swing.JButton statisticsReturnJButton;
    private javax.swing.JButton tempJButton;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}

