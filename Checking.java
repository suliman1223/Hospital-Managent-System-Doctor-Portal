/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hospitalgui;
import java.util.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import javax.swing.JOptionPane;


/**
 *
 * @author hp
 */
public class Checking extends javax.swing.JFrame {
 ArrayList<Medicine> allMedicines=new ArrayList<>();
   ArrayList<Pateint> allPateints=new ArrayList<>();
    /**
     * Creates new form Checking
     */
    public Checking() {
        initComponents();
        readAllMedicineData();
        readAllpateintData();
        loadmed();
    }
    void loadmed()
    {
        allm.removeAllItems();
        for(int i=0;i<allMedicines.size();i++){
            allm.addItem(allMedicines.get(i).getId()+"-"+allMedicines.get(i).getName());
            
        }
    }
    void readAllMedicineData(){
    try {
        File pfile=new File("mdata.txt");
        Scanner sc=new Scanner(pfile);
        while(sc.hasNextLine()){
            String data=sc.nextLine();
            String[] curData=data.split(";");
            Medicine medicine=new Medicine();
            medicine.setId(Integer.parseInt(curData[0]));
            medicine.setName(curData[1]);
            medicine.setSellingPrice(Integer.parseInt(curData[2]));
            medicine.setBuyingPrice(Integer.parseInt( curData[3]));
            medicine.setQuantity(Integer.parseInt( curData[4]));
            medicine.setDescription(curData[5]);
            
            
            allMedicines.add(medicine);
            sc.close();
        }
    } catch (Exception e) {
        
    }
}

    void readAllpateintData(){
    try {
        File pfile=new File("pdata.txt");
        Scanner sc=new Scanner(pfile);
        while(sc.hasNextLine()){
            String data=sc.nextLine();
            String[] curData=data.split(";");
            Pateint pateint=new Pateint();
            pateint.setId(Integer.parseInt(curData[0]));
            pateint.setName(curData[1]);
            pateint.setAge(Integer.parseInt(curData[2]));
            pateint.setGender(curData[3]);
            pateint.setAddress(curData[4]);
            pateint.setContact(curData[5]);
            allPateints.add(pateint);
            sc.close();
        }
    } catch (Exception e) {
        
    }
}
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Hbutton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        allm = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalgui/checkup.jpeg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 204, 0));
        jLabel2.setText("CHECKUP MENUE");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Khyber PukhtoonKhwa Hospital Association & Pharmacuticals");

        Hbutton.setBackground(new java.awt.Color(153, 153, 255));
        Hbutton.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        Hbutton.setForeground(new java.awt.Color(255, 255, 255));
        Hbutton.setText("Home");
        Hbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HbuttonMouseExited(evt);
            }
        });
        Hbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Hbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Hbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel4.setText("PateintID");

        jTextField1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel5.setText("Medicine");

        allm.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        allm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "panadol", "disprene" }));
        allm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allmActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 255));
        jButton1.setText("Add Medicine");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel6.setText("Medicine List");

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel7.setText("Fee");

        jTextField2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Recommendations");

        jButton2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 153, 0));
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel9.setText("Quantity");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(430, 430, 430)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel7)))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(193, 193, 193)
                                .addComponent(allm, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(88, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(437, 437, 437))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1)
                                        .addGap(197, 197, 197))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(192, 192, 192)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))))))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(440, 440, 440)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(allm, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HbuttonMouseEntered
        // TODO add your handling code here:
      
    }//GEN-LAST:event_HbuttonMouseEntered

    private void HbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HbuttonMouseExited
        // TODO add your handling code here:
        
    }//GEN-LAST:event_HbuttonMouseExited

    private void HbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HbuttonActionPerformed
        // TODO add your handling code here:
        Home ob=new Home();
        this.setVisible(false);
        ob.setVisible(true);
    }//GEN-LAST:event_HbuttonActionPerformed

    private void allmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allmActionPerformed
   // Clear all items from the JComboBox
    allm.removeAllItems();
    
    // File path for mdata.txt
    String filePath = "mdata.txt"; // Adjust the path if necessary

    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
        String line;

        // Read each line in the file
        while ((line = br.readLine()) != null) {
            // Split the line by spaces and extract the medicine name
            String[] data = line.split("\\s+");
            if (data.length > 1) {
                String medicineName = data[1]; // Assuming medicine name is the second field
                // Add the medicine name to the JComboBox
                allm.addItem(medicineName);
            }
        }

        // Check if the JComboBox now has items
        if (allm.getItemCount() > 0) {
            // Set the first item as the default selected item
            allm.setSelectedIndex(0); // Select the first item
        }

    } catch (IOException e) {
        // Handle exceptions, e.g., file not found or read error
        JOptionPane.showMessageDialog(null, "Error reading medicine data: " + e.getMessage(),
                "Error", JOptionPane.ERROR_MESSAGE);
    }

    // Remove all existing ActionListeners to avoid duplication
    for (java.awt.event.ActionListener listener : allm.getActionListeners()) {
        allm.removeActionListener(listener);
    }

    // Add a single ActionListener to handle item selection
    allm.addActionListener(e -> {
        // Get the selected item
        String selectedItem = (String) allm.getSelectedItem();
        if (selectedItem != null) {
            System.out.println("Selected Medicine: " + selectedItem);
//            JOptionPane.showMessageDialog(null, "You selected: " + selectedItem,
//                    "Selection", JOptionPane.INFORMATION_MESSAGE);
        }
    });

    // Optional debugging: Print loaded items
    System.out.println("Loaded items:");
    for (int i = 0; i < allm.getItemCount(); i++) {
        System.out.println(allm.getItemAt(i));
    }
    System.out.println("Selected item: " + allm.getSelectedItem());
    }//GEN-LAST:event_allmActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         // Get the selected medicine from the JComboBox
    String selectedMedicine = (String) allm.getSelectedItem();
    
    // Get the quantity entered in the JTextField
    String quantity = jTextField3.getText().trim();
    
    // Validate input
    if (selectedMedicine == null || selectedMedicine.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please select a medicine!", 
                                      "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (quantity.isEmpty() || !quantity.matches("\\d+")) {
        JOptionPane.showMessageDialog(null, "Please enter a valid quantity!", 
                                      "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Append the selected medicine and quantity to the medicine list (jTextArea1)
    String existingText = jTextArea1.getText();
    String newEntry = selectedMedicine + " - Quantity: " + quantity;
    
    // Update jTextArea1
    if (existingText.isEmpty()) {
        jTextArea1.setText(newEntry);
    } else {
        jTextArea1.setText(existingText + "\n" + newEntry);
    }
    
    // Clear the quantity field for convenience
    jTextField3.setText("");  // Clear the quantity input field
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       // File path for the medicine prices file
    String filePath = "mdata.txt"; // Adjust the path if necessary

    // Read the medicine prices into a HashMap
    HashMap<String, Integer> medicinePrices = new HashMap<>();
    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
        String line;

        while ((line = br.readLine()) != null) {
            String[] data = line.split("\\s+");
            if (data.length >= 3) {
                String medicineName = data[1]; // Medicine name
                try {
                    int price = Integer.parseInt(data[2]); // Price
                    medicinePrices.put(medicineName, price);
                } catch (NumberFormatException e) {
                    System.err.println("Invalid price for medicine: " + data[1]);
                }
            }
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error reading medicine data: " + e.getMessage(),
                                      "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Get the patient ID
    String patientID = jTextField2.getText().trim();
    if (patientID.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Patient ID is required!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Get the fee from the fee text field
    String feeText = jTextField1.getText().trim();
    int fee = 0;
    if (!feeText.isEmpty() && feeText.matches("\\d+")) {
        fee = Integer.parseInt(feeText);
    } else {
        JOptionPane.showMessageDialog(null, "Invalid fee amount!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Get the medicine list from the text area
    String medicineList = jTextArea1.getText().trim();
    if (medicineList.isEmpty()) {
        JOptionPane.showMessageDialog(null, "No medicines added!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Calculate the total cost of medicines
    int totalMedicineCost = 0;
    String[] medicines = medicineList.split("\\n");
    for (String medicineEntry : medicines) {
        String[] parts = medicineEntry.split(" - Quantity: ");
        if (parts.length == 2) {
            String medicineName = parts[0].trim();
            int quantity = Integer.parseInt(parts[1].trim());

            // Check if the medicine exists in the price list
            if (medicinePrices.containsKey(medicineName)) {
                int price = medicinePrices.get(medicineName);
                totalMedicineCost += price * quantity;
            } else {
                JOptionPane.showMessageDialog(null, "Price not found for medicine: " + medicineName,
                                              "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
    }

    // Calculate the total bill
    int totalBill = fee + totalMedicineCost;

    // Save the information in a text file
    try (BufferedWriter bw = new BufferedWriter(new FileWriter("Record.txt", true))) {
        // Save the ID and all related fields in a single line
        bw.write("Patient ID: " + patientID + ", Fee: " + fee + ", Medicine Bill: " + totalMedicineCost 
                 + ", Total Bill: " + totalBill + "\n");
        JOptionPane.showMessageDialog(null, "Record saved successfully!",
                                      "Success", JOptionPane.INFORMATION_MESSAGE);
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error saving record: " + e.getMessage(),
                                      "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Display the total bill to the user
    JOptionPane.showMessageDialog(null, "Total Bill: " + totalBill + " (Fee: " + fee +
                                          ", Medicine Cost: " + totalMedicineCost + ")",
                                  "Bill Summary", JOptionPane.INFORMATION_MESSAGE);

    // Reset all fields
    jTextField2.setText("");
    jTextField1.setText(""); // Reset fee field
    jTextField3.setText(""); // Reset fee field
    jTextArea1.setText("");  // Reset medicine list
    jTextArea2.setText("");  // Reset medicine list
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(Checking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Checking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Checking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Checking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Checking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Hbutton;
    private javax.swing.JComboBox<String> allm;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
