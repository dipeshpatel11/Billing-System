
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.text.SimpleDateFormat;
import java.util.Calendar;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author deeppatel
 */
public class CustomerBill extends javax.swing.JFrame {
    String iTax, iSubTotal, iTotal;
    double [] itemcost = new double[20];

    /**
     * Creates new form CustomerBill
     */
    public CustomerBill() {
        initComponents();
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
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtxtFName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtLName = new javax.swing.JTextField();
        jtxtAdd = new javax.swing.JTextField();
        jtxtPC = new javax.swing.JTextField();
        jtxtCustomerid = new javax.swing.JTextField();
        jDateChooserCin = new com.toedter.calendar.JDateChooser();
        jDateChooserDOB = new com.toedter.calendar.JDateChooser();
        jDateChooserCout = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jtxtPhone = new javax.swing.JTextField();
        jtxtEmail = new javax.swing.JTextField();
        jComboBoxGender = new javax.swing.JComboBox<>();
        jComboBoxid = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        jButtonTotal = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jTextField10 = new javax.swing.JTextField();
        jCheckBox7 = new javax.swing.JCheckBox();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jtxtTaxPaid = new javax.swing.JTextField();
        jtxtSubTotal = new javax.swing.JTextField();
        jtxtTotalCost = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jTextField15 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextReciept = new javax.swing.JTextArea();
        jPanel9 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));
        setMinimumSize(new java.awt.Dimension(1290, 850));
        setPreferredSize(new java.awt.Dimension(1300, 850));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(182, 179, 175));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(14, 14, 14, 14, new java.awt.Color(147, 147, 147)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(233, 233, 233));
        jPanel6.setBorder(javax.swing.BorderFactory.createMatteBorder(14, 14, 14, 14, new java.awt.Color(147, 147, 147)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setText("Check IN Date:");
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        jtxtFName.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jtxtFName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtFNameActionPerformed(evt);
            }
        });
        jPanel6.add(jtxtFName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 140, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel2.setText("Customer ID:");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel3.setText("First Name:");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel4.setText("Last Name:");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel5.setText("Address:");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel6.setText("Postal Code:");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jtxtLName.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jPanel6.add(jtxtLName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 140, -1));

        jtxtAdd.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jPanel6.add(jtxtAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 140, -1));

        jtxtPC.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jPanel6.add(jtxtPC, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 140, -1));

        jtxtCustomerid.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jtxtCustomerid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCustomeridActionPerformed(evt);
            }
        });
        jPanel6.add(jtxtCustomerid, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 140, -1));
        jPanel6.add(jDateChooserCin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 140, 30));
        jPanel6.add(jDateChooserDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 140, 30));
        jPanel6.add(jDateChooserCout, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, 140, 30));

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel7.setText("Gender:");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel8.setText("Email:");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel9.setText("ID Type:");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel11.setText("Date of Birth:");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jLabel12.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel12.setText("Check Out Date:");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        jLabel14.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel14.setText("Phone:");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jtxtPhone.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jPanel6.add(jtxtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 140, -1));

        jtxtEmail.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jPanel6.add(jtxtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 140, -1));

        jComboBoxGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Male", "Female", "Other" }));
        jComboBoxGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxGenderActionPerformed(evt);
            }
        });
        jPanel6.add(jComboBoxGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 140, 30));

        jComboBoxid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Passport", "Driving Licence", "Other" }));
        jComboBoxid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxidActionPerformed(evt);
            }
        });
        jPanel6.add(jComboBoxid, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 140, 30));

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));
        jPanel8.setBorder(javax.swing.BorderFactory.createMatteBorder(14, 14, 14, 14, new java.awt.Color(153, 153, 153)));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonTotal.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jButtonTotal.setText("Total");
        jButtonTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTotalActionPerformed(evt);
            }
        });
        jPanel8.add(jButtonTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 120, 50));

        jButton7.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jButton7.setText("Reset");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 120, 50));

        jPanel6.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 310, 120));

        jLabel15.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel15.setText("Room Type:");
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, -1));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Regular", "Delux", "Premium" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        jPanel6.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, 140, 30));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 370, 720));

        jPanel7.setBackground(new java.awt.Color(233, 233, 233));
        jPanel7.setBorder(javax.swing.BorderFactory.createMatteBorder(14, 14, 14, 14, new java.awt.Color(147, 147, 147)));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(246, 248, 247));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(14, 14, 14, 14, new java.awt.Color(147, 147, 147)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCheckBox2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jCheckBox2.setText("Coffee");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jCheckBox3.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jCheckBox3.setText("Steak Sandwich");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jCheckBox4.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jCheckBox4.setText("Frech Fries");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jCheckBox5.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jCheckBox5.setText("Nachos");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jTextField10.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setText("0");
        jPanel2.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 80, -1));

        jCheckBox7.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jCheckBox7.setText("Grilled Cheese");
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jTextField11.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.setText("0");
        jPanel2.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 80, -1));

        jTextField12.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField12.setText("0");
        jPanel2.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 80, -1));

        jTextField13.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField13.setText("0");
        jPanel2.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 80, -1));

        jTextField14.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField14.setText("0");
        jPanel2.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 80, -1));

        jTextField16.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jTextField16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField16.setText("0");
        jPanel2.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 80, -1));

        jLabel16.setBackground(new java.awt.Color(102, 102, 102));
        jLabel16.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Tax and Total Sum");
        jLabel16.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(102, 102, 102)));
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 300, -1));

        jLabel17.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel17.setText("Sub Total");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, -1, -1));

        jLabel18.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel18.setText("Total Cost");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, -1, -1));

        jtxtTaxPaid.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jtxtTaxPaid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtTaxPaid.setText("0");
        jPanel2.add(jtxtTaxPaid, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, 100, -1));

        jtxtSubTotal.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jtxtSubTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtSubTotal.setText("0");
        jtxtSubTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtSubTotalActionPerformed(evt);
            }
        });
        jPanel2.add(jtxtSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 510, 100, -1));

        jtxtTotalCost.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jtxtTotalCost.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtTotalCost.setText("0");
        jPanel2.add(jtxtTotalCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 550, 100, -1));

        jLabel19.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel19.setText("Tax Paid");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, -1, -1));

        jCheckBox8.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jCheckBox8.setText("Caesar");
        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jCheckBox1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jCheckBox1.setText("Rice Bowl");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        jTextField15.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jTextField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField15.setText("0");
        jPanel2.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 80, -1));

        jPanel7.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 360, 610));

        jLabel10.setFont(new java.awt.Font("Copperplate", 1, 36)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Sunrise Kichen");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 360, -1));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 420, 720));

        jPanel4.setBackground(new java.awt.Color(233, 233, 233));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(14, 14, 14, 14, new java.awt.Color(147, 147, 147)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextReciept.setColumns(20);
        jTextReciept.setRows(5);
        jScrollPane1.setViewportView(jTextReciept);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 310, 540));

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));
        jPanel9.setBorder(javax.swing.BorderFactory.createMatteBorder(14, 14, 14, 14, new java.awt.Color(153, 153, 153)));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 120, 50));

        jButton4.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jButton4.setText("Print");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 120, 50));

        jPanel4.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 310, 120));

        jLabel13.setText("jLabel13");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 30, 370, 720));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 1280, 780));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtFNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtFNameActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jtxtFNameActionPerformed

    private void jtxtCustomeridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCustomeridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCustomeridActionPerformed

    private void jComboBoxGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxGenderActionPerformed

    private void jComboBoxidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxidActionPerformed
    private JFrame frame;
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Customer Billing System", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox8.isSelected()){
            jTextField10.setEnabled(true);
            jTextField10.setText("");
            jTextField10.requestFocus();
        }
        else{
            jTextField10.setEnabled(false);
            jTextField10.setText("0");
        }
    }//GEN-LAST:event_jCheckBox8ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        jTextField16.setEnabled(false);
        jTextField10.setEnabled(false);
        jTextField11.setEnabled(false);
        jTextField12.setEnabled(false);
        jTextField13.setEnabled(false);
        jTextField14.setEnabled(false);
        jTextField15.setEnabled(false);
        
        jtxtCustomerid.setEnabled(false);
        int id = 2468 + (int) (Math.random()*13579);
        String cid ="";
        cid += id + 1234;
        
        
        jtxtCustomerid.setText(cid);
        jtxtFName.setText(null);
        jtxtLName.setText(null);
        jtxtAdd.setText(null);
        jtxtPC.setText(null);
        jtxtPhone.setText(null);
        jtxtEmail.setText(null);
        
    }//GEN-LAST:event_formWindowActivated

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        jTextField16.setEnabled(false);
        jTextField10.setEnabled(false);
        jTextField11.setEnabled(false);
        jTextField12.setEnabled(false);
        jTextField13.setEnabled(false);
        jTextField14.setEnabled(false);
        jTextField15.setEnabled(false);
        
        
        jTextField16.setText("0");
        jTextField10.setText("0");
        jTextField11.setText("0");
        jTextField12.setText("0");
        jTextField13.setText("0");
        jTextField14.setText("0");
        jTextField15.setText("0");
        jtxtSubTotal.setText("0");
        jtxtTaxPaid.setText("0");
        jtxtTotalCost.setText("0");
        
        jCheckBox2.setSelected(false);
        jCheckBox8.setSelected(false);
        jCheckBox7.setSelected(false);
        jCheckBox3.setSelected(false);
        jCheckBox4.setSelected(false);
        jCheckBox5.setSelected(false);
        jCheckBox1.setSelected(false);
        
        jtxtCustomerid.setText(null);
        jtxtCustomerid.setEnabled(false);
        int id = 2468 + (int) (Math.random()*13579);
        String cid ="";
        cid += id + 1234;
        
        
        jtxtCustomerid.setText(cid);
        jtxtFName.setText(null);
        jtxtLName.setText(null);
        jtxtAdd.setText(null);
        jtxtPC.setText(null);
        jtxtPhone.setText(null);
        jtxtEmail.setText(null);
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButtonTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTotalActionPerformed
        // TODO add your handling code here:
        itemcost[0] = Double.parseDouble(jTextField16.getText()) * 2.00;
        itemcost[1] = Double.parseDouble(jTextField10.getText()) * 5.00;
        itemcost[2] = Double.parseDouble(jTextField11.getText()) * 6.50;
        itemcost[3] = Double.parseDouble(jTextField12.getText()) * 12.50;
        itemcost[4] = Double.parseDouble(jTextField13.getText()) * 7.50;
        itemcost[5] = Double.parseDouble(jTextField14.getText()) * 12.50;
        itemcost[6] = Double.parseDouble(jTextField15.getText()) * 9.50;
        
        itemcost[7] = itemcost[0] + itemcost[1] + itemcost[2] + itemcost[3] + itemcost[4] + itemcost[5] + itemcost[6];
        iTax = String.format("$ %.2f", itemcost[7]*15/100);
        iSubTotal = String.format("$ %.2f", itemcost[7]);
        iTotal = String.format("$ %.2f", itemcost[7] + itemcost[7]/100);
        
        jtxtTaxPaid.setText(iTax);
        jtxtSubTotal.setText(iSubTotal);
        jtxtTotalCost.setText(iTotal);
        
        
        
        //~~~~~~~~~~~~~~~~~~~~~~Receiept~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // . ==============================
        
        
        

        
        jTextReciept.setEnabled(true);
        
        //~~~~~~~~~~~~~~~~~~~~~~id generator~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        
        int id = 1111 + (int) (Math.random()* 4238);  
        
        //~~~~~~~~~~~~~~~~~~~~~~ Formatting Time ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        
        Calendar timer = Calendar.getInstance();
        timer.getTime();
        SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
        tTime.format(timer.getTime());
        SimpleDateFormat Tdate = new SimpleDateFormat("dd-MMM-yyyy");
        Tdate.format(timer.getTime());
        
        //~~~~~~~~~~~~~~~~~~~~~~Receiept~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        jTextReciept.append("\tCustomer Bill\n" + 
        "   Reference:\t\t" + id + 
        "  \n   =========================\t " + 
                
                
                "  \n   =========================\t " +
                "  \n   Customer ID:\t\t" + jtxtCustomerid.getText() + 
                "  \n   First Name:\t\t" + jtxtFName.getText() + 
                "  \n   Last Name:\t\t" + jtxtLName.getText() + 
                "  \n   Coffee:\t\t" + jTextField16.getText() + 
                "  \n   Caesar:\t\t" + jTextField10.getText() + 
                "  \n   Grilled Sandwich:\t\t" + jTextField11.getText() + 
                "  \n   Steak Sandwich:\t\t" + jTextField12.getText() + 
                "  \n   French Fries:\t\t" + jTextField13.getText() + 
                "  \n   Nachos:\t\t" + jTextField14.getText() + 
                "  \n   Rice Bowl:\t\t" + jTextField15.getText() + 
                
                
                "  \n   =========================\t " + 
                
                
                "  \n   Tax:\t\t" + iTax + 
                "  \n   Sub Total:\t\t" + iSubTotal + 
                "  \n   Total:\t\t" + iTotal + 
                "  \n   =========================\t " +
                "  \n   Date: " + Tdate.format(timer.getTime()) +
                        "  \t   Tme: " + tTime.format(timer.getTime()) + 
        "\n\n\tThank You for Choosing Us\n" );
        
        
        
        
        
        
    }//GEN-LAST:event_jButtonTotalActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // ********** print function **********
        // TODO add your handling code here:
        
        try {
            jTextReciept.print();
        }
        catch(java.awt.print.PrinterException e){
            System.err.format("No Printer Found", e.getMessage());
        }
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox2.isSelected()){
            jTextField16.setEnabled(true);
            jTextField16.setText("");
            jTextField16.requestFocus();
        }
        else{
            jTextField16.setEnabled(false);
            jTextField16.setText("0");
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox7.isSelected()){
            jTextField11.setEnabled(true);
            jTextField11.setText("");
            jTextField11.requestFocus();
        }
        else{
            jTextField11.setEnabled(false);
            jTextField11.setText("0");
        }
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        if (jCheckBox3.isSelected()){
            jTextField12.setEnabled(true);
            jTextField12.setText("");
            jTextField12.requestFocus();
        }
        else{
            jTextField12.setEnabled(false);
            jTextField12.setText("0");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        if (jCheckBox4.isSelected()){
            jTextField13.setEnabled(true);
            jTextField13.setText("");
            jTextField13.requestFocus();
        }
        else{
            jTextField13.setEnabled(false);
            jTextField13.setText("0");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        if (jCheckBox5.isSelected()){
            jTextField14.setEnabled(true);
            jTextField14.setText("");
            jTextField14.requestFocus();
        }
        else{
            jTextField14.setEnabled(false);
            jTextField14.setText("0");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jtxtSubTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtSubTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtSubTotalActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox1.isSelected()){
            jTextField15.setEnabled(true);
            jTextField15.setText("");
            jTextField15.requestFocus();
        }
        else{
            jTextField15.setEnabled(false);
            jTextField15.setText("0");
        }   
    }//GEN-LAST:event_jCheckBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerBill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButtonTotal;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBoxGender;
    private javax.swing.JComboBox<String> jComboBoxid;
    private com.toedter.calendar.JDateChooser jDateChooserCin;
    private com.toedter.calendar.JDateChooser jDateChooserCout;
    private com.toedter.calendar.JDateChooser jDateChooserDOB;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextArea jTextReciept;
    private javax.swing.JTextField jtxtAdd;
    private javax.swing.JTextField jtxtCustomerid;
    private javax.swing.JTextField jtxtEmail;
    private javax.swing.JTextField jtxtFName;
    private javax.swing.JTextField jtxtLName;
    private javax.swing.JTextField jtxtPC;
    private javax.swing.JTextField jtxtPhone;
    private javax.swing.JTextField jtxtSubTotal;
    private javax.swing.JTextField jtxtTaxPaid;
    private javax.swing.JTextField jtxtTotalCost;
    // End of variables declaration//GEN-END:variables
}
