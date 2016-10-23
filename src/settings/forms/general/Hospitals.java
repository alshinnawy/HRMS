/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package settings.forms.general;

import com.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import senior.hrms.emps.dto.HospitalsPk;
import senior.hrms.emps.exceptions.HospitalsDaoException;
import settings.handler.general.HospitalsHandler;

/**
 *
 * @author amal
 */
public class Hospitals extends javax.swing.JFrame
{
    Common comObj;

    /**
     * Creates new form HealthCare
     */
    public Hospitals() throws HospitalsDaoException
    {
        initComponents();
        
         comObj = new Common();
        
        // Max frame width //
        int width =Integer.parseInt( comObj.resourceFile.getString("innerFrameSize") );
        comObj.setMaxFrameWidth(this, width);
        
    NameTextField.setVisible(false);
    addressLabel.setVisible(false);
 addressTextField.setVisible(false);
    responsibleTextField.setVisible(false);
    cancelNewButton.setVisible(false);
    cancelUpdateButton.setVisible(false);
   confirmLabel.setVisible(false);
     confirmNewButton.setVisible(false);
    confirmUpdateButton.setVisible(false);
    nameLabel.setVisible(false);
     newNameTextField.setVisible(false);
    newaddressLabel.setVisible(false);
    newaddressTextField.setVisible(false);
    newnameLabel.setVisible(false);
     newphone1Label.setVisible(false);
    newphone1TextField.setVisible(false);
    newphone2Label.setVisible(false);
     newphone2TextField.setVisible(false);
     newresponsibleLabel.setVisible(false);
     newresponsibleTextField.setVisible(false);
     phone1Label.setVisible(false);
     phone1TextField.setVisible(false);
      phone2Label.setVisible(false);
      phone2TextField.setVisible(false);
     responsibleLabel.setVisible(false);
     
     
    HospitalsHandler oh = new HospitalsHandler();
        senior.hrms.emps.dto.Hospitals[] list = oh.getAllHospitals();
        DefaultTableModel dtm = (DefaultTableModel) showTable.getModel();
        dtm.setRowCount(0);
        for(int i=0;i<list.length;i++)
        {
        senior.hrms.emps.dto.Hospitals or = list[i];
        Vector row= new Vector();
        row.add(or.getResponsible());
        row.add(or.getPhone2());
        row.add(or.getPhone1());
        row.add(or.getHospitalName());
        row.add(or.getHospitalId());
        
        dtm.addRow(row);
        
        }
        showTable.setModel(dtm);
        showTable.updateUI();
         jScrollPane1.setViewportView(showTable);
   
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Label1 = new javax.swing.JLabel();
        TextFieldSearch = new javax.swing.JTextField();
        showAll = new javax.swing.JButton();
        addNewButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();
        NameTextField = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        addressTextField = new javax.swing.JTextField();
        responsibleLabel = new javax.swing.JLabel();
        responsibleTextField = new javax.swing.JTextField();
        phone1Label = new javax.swing.JLabel();
        phone2Label = new javax.swing.JLabel();
        phone2TextField = new javax.swing.JTextField();
        phone1TextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        showTable = new javax.swing.JTable();
        cancelNewButton = new javax.swing.JButton();
        confirmNewButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        newresponsibleTextField = new javax.swing.JTextField();
        cancelUpdateButton = new javax.swing.JButton();
        confirmUpdateButton = new javax.swing.JButton();
        newresponsibleLabel = new javax.swing.JLabel();
        newaddressTextField = new javax.swing.JTextField();
        newphone2TextField = new javax.swing.JTextField();
        newphone2Label = new javax.swing.JLabel();
        newaddressLabel = new javax.swing.JLabel();
        newNameTextField = new javax.swing.JTextField();
        newphone1TextField = new javax.swing.JTextField();
        newnameLabel = new javax.swing.JLabel();
        newphone1Label = new javax.swing.JLabel();
        confirmLabel = new javax.swing.JLabel();

        setTitle("برنامج إدارة الموارد البشرية - Senior Consulting Co.");
        setResizable(false);

        Label1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label1.setText("المستشفيات");

        showAll.setText("عرض الكل");
        showAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAllActionPerformed(evt);
            }
        });

        addNewButton.setText("اضافة جديد");
        addNewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewButtonActionPerformed(evt);
            }
        });

        searchButton.setText("بحث");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        nameLabel.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel.setText("الاسم");

        addressLabel.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        addressLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addressLabel.setText("العنوان");

        responsibleLabel.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        responsibleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        responsibleLabel.setText("المسؤليات");

        phone1Label.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        phone1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        phone1Label.setText("تليفون1");

        phone2Label.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        phone2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        phone2Label.setText("تليفون2");

        showTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "المسؤليات", "تليفون2", "تليفون1", "الاسم", "مسلسل"
            }
        ));
        jScrollPane1.setViewportView(showTable);

        cancelNewButton.setText("الغاء");
        cancelNewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelNewButtonActionPerformed(evt);
            }
        });

        confirmNewButton.setText("اضافة");
        confirmNewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmNewButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("حذف");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        updateButton.setText("اخترللتحديث");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        cancelUpdateButton.setText("الغاء");
        cancelUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelUpdateButtonActionPerformed(evt);
            }
        });

        confirmUpdateButton.setText("تعديل");
        confirmUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmUpdateButtonActionPerformed(evt);
            }
        });

        newresponsibleLabel.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        newresponsibleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newresponsibleLabel.setText("المسؤليات");

        newphone2Label.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        newphone2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newphone2Label.setText("تليفون2");

        newaddressLabel.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        newaddressLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newaddressLabel.setText("العنوان ");

        newnameLabel.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        newnameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newnameLabel.setText("الاسم ");

        newphone1Label.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        newphone1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newphone1Label.setText("تليفون1");

        confirmLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        confirmLabel.setForeground(new java.awt.Color(255, 0, 0));
        confirmLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        confirmLabel.setText("تم الحفظ بنجاح");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(addNewButton)
                            .addGap(18, 18, 18)
                            .addComponent(showAll, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(250, 250, 250))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(342, 342, 342)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(TextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(225, 225, 225))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(213, 213, 213))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(newresponsibleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(newresponsibleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cancelUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(confirmUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(newaddressTextField)
                                    .addComponent(newphone2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(newphone2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(newphone1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(newphone1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(newaddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15)
                                        .addComponent(newNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(newnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(responsibleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(responsibleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(cancelNewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(confirmNewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(8, 8, 8)))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(addressTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                        .addComponent(phone2TextField))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(4, 4, 4)
                                            .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(phone2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(phone1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(phone1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(confirmLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(262, 262, 262))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showAll)
                    .addComponent(addNewButton)
                    .addComponent(searchButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(responsibleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(responsibleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phone1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phone2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phone1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phone2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelNewButton)
                    .addComponent(confirmNewButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newaddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newaddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newresponsibleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newresponsibleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newphone1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newphone2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newphone1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newphone2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelUpdateButton)
                    .addComponent(confirmUpdateButton))
                .addGap(33, 33, 33)
                .addComponent(confirmLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAllActionPerformed
     NameTextField.setVisible(false);
    addressLabel.setVisible(false);
    addressTextField.setVisible(false);
    responsibleTextField.setVisible(false);
    cancelNewButton.setVisible(false);
    cancelUpdateButton.setVisible(false);
   confirmLabel.setVisible(false);
     confirmNewButton.setVisible(false);
    confirmUpdateButton.setVisible(false);
    nameLabel.setVisible(false);
     newNameTextField.setVisible(false);
    newaddressLabel.setVisible(false);
    newaddressTextField.setVisible(false);
    newnameLabel.setVisible(false);
     newphone1Label.setVisible(false);
    newphone1TextField.setVisible(false);
    newphone2Label.setVisible(false);
     newphone2TextField.setVisible(false);
     newresponsibleLabel.setVisible(false);
     newresponsibleTextField.setVisible(false);
     phone1Label.setVisible(false);
     phone1TextField.setVisible(false);
      phone2Label.setVisible(false);
      phone2TextField.setVisible(false);
     responsibleLabel.setVisible(false);
     
     
   
     
     try{
     HospitalsHandler oh = new HospitalsHandler();
        senior.hrms.emps.dto.Hospitals[] list;
        
            list = oh.getAllHospitals();
        
        DefaultTableModel dtm = (DefaultTableModel) showTable.getModel();
        dtm.setRowCount(0);
        for(int i=0;i<list.length;i++)
        {
        senior.hrms.emps.dto.Hospitals or = list[i];
        Vector row= new Vector();
        row.add(or.getResponsible());
        row.add(or.getPhone2());
        row.add(or.getPhone1());
        row.add(or.getHospitalName());
        row.add(or.getHospitalId());
        
        dtm.addRow(row);
        
        }
        showTable.setModel(dtm);
        showTable.updateUI();
         jScrollPane1.setViewportView(showTable);
     }
     catch(Exception ex){}
   
    
        // TODO add your handling code here:
    }//GEN-LAST:event_showAllActionPerformed

    private void addNewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewButtonActionPerformed
         
    NameTextField.setVisible(true);
    addressLabel.setVisible(true);
    addressTextField.setVisible(true);
    responsibleTextField.setVisible(true);
    cancelNewButton.setVisible(true);
     confirmNewButton.setVisible(true);
    nameLabel.setVisible(true);
     phone1Label.setVisible(true);
     phone1TextField.setVisible(true);
      phone2Label.setVisible(true);
      phone2TextField.setVisible(true);
     responsibleLabel.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_addNewButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
     NameTextField.setVisible(false);
    addressLabel.setVisible(false);
    addressTextField.setVisible(false);
    responsibleTextField.setVisible(false);
    cancelNewButton.setVisible(false);
    cancelUpdateButton.setVisible(false);
   confirmLabel.setVisible(false);
     confirmNewButton.setVisible(false);
    confirmUpdateButton.setVisible(false);
    nameLabel.setVisible(false);
     newNameTextField.setVisible(false);
    newaddressLabel.setVisible(false);
    newaddressTextField.setVisible(false);
    newnameLabel.setVisible(false);
     newphone1Label.setVisible(false);
    newphone1TextField.setVisible(false);
    newphone2Label.setVisible(false);
     newphone2TextField.setVisible(false);
     newresponsibleLabel.setVisible(false);
     newresponsibleTextField.setVisible(false);
     phone1Label.setVisible(false);
     phone1TextField.setVisible(false);
      phone2Label.setVisible(false);
      phone2TextField.setVisible(false);
     responsibleLabel.setVisible(false);
     
        
         try{
        String keyword = TextFieldSearch.getText();
        HospitalsHandler oh = new HospitalsHandler();
        senior.hrms.emps.dto.Hospitals[] list = oh.getHospitalByName(keyword);
           
        DefaultTableModel dtm = (DefaultTableModel) showTable.getModel();
        dtm.setRowCount(0);
        for(int i=0;i<list.length;i++)
        {
        senior.hrms.emps.dto.Hospitals or = list[i];
        Vector row= new Vector();
        row.add(or.getResponsible());
        row.add(or.getPhone2());
        row.add(or.getPhone1());
        row.add(or.getHospitalName());
        row.add(or.getHospitalId());
        dtm.addRow(row);
        }
        showTable.setModel(dtm);
        showTable.updateUI();
        jScrollPane1.setViewportView(showTable);
            }
            catch(Exception ex) {}
// TODO add your handling code here:
    }//GEN-LAST:event_searchButtonActionPerformed

    private void cancelNewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelNewButtonActionPerformed
      NameTextField.setVisible(false);
    addressLabel.setVisible(false);
    addressTextField.setVisible(false);
    responsibleTextField.setVisible(false);
    cancelNewButton.setVisible(false);
     confirmNewButton.setVisible(false);
    nameLabel.setVisible(false);
     phone1Label.setVisible(false);
     phone1TextField.setVisible(false);
      phone2Label.setVisible(false);
      phone2TextField.setVisible(false);
     responsibleLabel.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelNewButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
    if(showTable.getSelectedRow()>=0)
   {
        NameTextField.setVisible(false);
    addressLabel.setVisible(false);
    addressTextField.setVisible(false);
    responsibleTextField.setVisible(false);
    cancelNewButton.setVisible(false);
    cancelUpdateButton.setVisible(true);
   confirmLabel.setVisible(false);
     confirmNewButton.setVisible(false);
    confirmUpdateButton.setVisible(true);
    nameLabel.setVisible(false);
     newNameTextField.setVisible(true);
    newaddressLabel.setVisible(true);
    newaddressTextField.setVisible(true);
    newnameLabel.setVisible(true);
     newphone1Label.setVisible(true);
    newphone1TextField.setVisible(true);
    newphone2Label.setVisible(true);
     newphone2TextField.setVisible(true);
     newresponsibleLabel.setVisible(true);
     newresponsibleTextField.setVisible(true);
     phone1Label.setVisible(false);
     phone1TextField.setVisible(false);
      phone2Label.setVisible(false);
      phone2TextField.setVisible(false);
     responsibleLabel.setVisible(false);
   }
// TODO add your handling code here:
    }//GEN-LAST:event_updateButtonActionPerformed

    private void cancelUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelUpdateButtonActionPerformed

    cancelUpdateButton.setVisible(false);
    confirmUpdateButton.setVisible(false);
     newNameTextField.setVisible(false);
    newaddressLabel.setVisible(false);
    newaddressTextField.setVisible(false);
    newnameLabel.setVisible(false);
     newphone1Label.setVisible(false);
    newphone1TextField.setVisible(false);
    newphone2Label.setVisible(false);
     newphone2TextField.setVisible(false);
     newresponsibleLabel.setVisible(false);
     newresponsibleTextField.setVisible(false);
        
// TODO add your handling code here:
    }//GEN-LAST:event_cancelUpdateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
     try{  
        if(showTable.getSelectedRow()>=0)
         {
        cancelUpdateButton.setVisible(false);
    confirmUpdateButton.setVisible(false);
     newNameTextField.setVisible(false);
    newaddressLabel.setVisible(false);
    newaddressTextField.setVisible(false);
    newnameLabel.setVisible(false);
     newphone1Label.setVisible(false);
    newphone1TextField.setVisible(false);
    newphone2Label.setVisible(false);
     newphone2TextField.setVisible(false);
     newresponsibleLabel.setVisible(false);
     newresponsibleTextField.setVisible(false);
   int row = showTable.getSelectedRow();
   int culumn = 4;
   int valueOfId = Integer.parseInt(showTable.getValueAt(row, culumn).toString());
    int confirm= JOptionPane.showConfirmDialog(rootPane, "هل انت متاكد بالحذف !");
         if(confirm==0)
         {
        senior.hrms.emps.dto.Hospitals or=new senior.hrms.emps.dto.Hospitals();
        or.setHospitalId(valueOfId);
        HospitalsPk pk=or.createPk();
        HospitalsHandler oh = new HospitalsHandler();
        oh.deleteHospitals(pk);
         JOptionPane.showMessageDialog(rootPane,"تم الحذف بنجاح");
         }
         }
       }
       catch(Exception ex){}
   
        
// TODO add your handling code here:
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void confirmNewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmNewButtonActionPerformed
   if(NameTextField.getText().length()==0)
   {
       JOptionPane.showMessageDialog(rootPane,"يجب ان تدخل الاسم");
   }
        else
   {
      String name=NameTextField.getText();
      String address=addressTextField.getText();
      String phone1=phone1TextField.getText();
      String phone2=phone2TextField.getText();
      String responsiple=responsibleTextField.getText();
        try{
         
         senior.hrms.emps.dto.Hospitals dto =new senior.hrms.emps.dto.Hospitals();
         
         dto.setHospitalName(name);
         dto.setHospitalAddress(address);
         dto.setPhone1(phone1);
         dto.setPhone2(phone2);
         dto.setResponsible(responsiple);
         HospitalsHandler oh = new HospitalsHandler();
         oh.addHospitals(dto);
         confirmLabel.setText("تم الاضافه بنجاح");
         confirmLabel.setVisible(true);
        NameTextField.setText("");
      addressTextField.setText("");
      phone1TextField.setText("");
      phone2TextField.setText("");
      responsibleTextField.setText("");
            }
            catch(Exception ex){  }
   }
// TODO add your handling code here:
    }//GEN-LAST:event_confirmNewButtonActionPerformed

    private void confirmUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmUpdateButtonActionPerformed
    try{
        if(showTable.getSelectedRow()>=0)
   {
   int row = showTable.getSelectedRow();
   int culumn = 4;
   int valueOfId = Integer.parseInt(showTable.getValueAt(row, culumn).toString());
       String newName=newNameTextField.getText();
      String newAddress=newaddressTextField.getText();
      String newPhone1=newphone1TextField.getText();
      String newPhone2=newphone2TextField.getText();
      String newResponsiple=newresponsibleTextField.getText();
        senior.hrms.emps.dto.Hospitals or=new senior.hrms.emps.dto.Hospitals();
        or.setHospitalId(valueOfId);
        or.setHospitalName(newName);
        or.setHospitalAddress(newAddress);
        or.setPhone1(newPhone1);
        or.setPhone2(newPhone2);
        or.setResponsible(newResponsiple);
        HospitalsPk pk=or.createPk();
        HospitalsHandler oh = new HospitalsHandler();
        oh.updateHospitals(pk, or);
        confirmLabel.setText("تم التعديل بنجاح");
         confirmLabel.setVisible(true);
        newNameTextField.setText("");
      newaddressTextField.setText("");
      newphone1TextField.setText("");
      newphone2TextField.setText("");
      newresponsibleTextField.setText("");
      cancelUpdateButton.setVisible(false);
    confirmUpdateButton.setVisible(false);
     newNameTextField.setVisible(false);
    newaddressLabel.setVisible(false);
    newaddressTextField.setVisible(false);
    newnameLabel.setVisible(false);
     newphone1Label.setVisible(false);
    newphone1TextField.setVisible(false);
    newphone2Label.setVisible(false);
     newphone2TextField.setVisible(false);
     newresponsibleLabel.setVisible(false);
     newresponsibleTextField.setVisible(false);
   }
        }
        catch(Exception ex){  }
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmUpdateButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Hospitals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Hospitals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Hospitals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Hospitals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                try {
                    new Hospitals().setVisible(true);
                } catch (HospitalsDaoException ex) {
                    Logger.getLogger(Hospitals.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label1;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JTextField TextFieldSearch;
    private javax.swing.JButton addNewButton;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JButton cancelNewButton;
    private javax.swing.JButton cancelUpdateButton;
    private javax.swing.JLabel confirmLabel;
    private javax.swing.JButton confirmNewButton;
    private javax.swing.JButton confirmUpdateButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField newNameTextField;
    private javax.swing.JLabel newaddressLabel;
    private javax.swing.JTextField newaddressTextField;
    private javax.swing.JLabel newnameLabel;
    private javax.swing.JLabel newphone1Label;
    private javax.swing.JTextField newphone1TextField;
    private javax.swing.JLabel newphone2Label;
    private javax.swing.JTextField newphone2TextField;
    private javax.swing.JLabel newresponsibleLabel;
    private javax.swing.JTextField newresponsibleTextField;
    private javax.swing.JLabel phone1Label;
    private javax.swing.JTextField phone1TextField;
    private javax.swing.JLabel phone2Label;
    private javax.swing.JTextField phone2TextField;
    private javax.swing.JLabel responsibleLabel;
    private javax.swing.JTextField responsibleTextField;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton showAll;
    private javax.swing.JTable showTable;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
