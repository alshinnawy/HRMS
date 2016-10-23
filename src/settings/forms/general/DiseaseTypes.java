
package settings.forms.general;

import com.Common;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import senior.hrms.emps.exceptions.DiseaseTypesDaoException;
import settings.handler.general.DiseaseTypesHandler;


public class DiseaseTypes extends javax.swing.JFrame
{
    Common comObj;

    /**
     * Creates new form DiseaseTypes
     */
    public DiseaseTypes() throws DiseaseTypesDaoException
    {
        initComponents();
        
        comObj = new Common();
        
        // Max frame width //
        int width =Integer.parseInt( comObj.resourceFile.getString("innerFrameSize") );
        comObj.setMaxFrameWidth(this, width);
        
         newNameLabel.setVisible(false);
        ButtonConfirm.setVisible(false);
        textfieldUpdate.setVisible(false);
        update.setVisible(false);
        cancelButton.setVisible(false);
        
        // put data into table
        DiseaseTypesHandler oh = new DiseaseTypesHandler();
        senior.hrms.emps.dto.DiseaseTypes[] list = oh.getAllDiseaseTypes();
        DefaultTableModel dtm = (DefaultTableModel) showTable.getModel();
        dtm.setRowCount(0);
        for(int i=0;i<list.length;i++)
        {
        senior.hrms.emps.dto.DiseaseTypes or = list[i];
        Vector row= new Vector();
        row.add(or.getDiseaseTypeName());
        row.add(or.getDiseaseTypeId());
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
        addButton = new javax.swing.JButton();
        SearchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        showTable = new javax.swing.JTable();
        ButtonDelete = new javax.swing.JButton();
        ButtonUpdate = new javax.swing.JButton();
        newNameLabel = new javax.swing.JLabel();
        textfieldUpdate = new javax.swing.JTextField();
        ButtonConfirm = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        update = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Label1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label1.setText("أنواع الامراض");

        showAll.setText("عرض الكل");
        showAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAllActionPerformed(evt);
            }
        });

        addButton.setText("اضافة جديد\n");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        SearchButton.setText("بحث");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        showTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "الاسم ", "مسلسل"
            }
        ));
        jScrollPane1.setViewportView(showTable);

        ButtonDelete.setText("حذف");
        ButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDeleteActionPerformed(evt);
            }
        });

        ButtonUpdate.setText("اختر للتحديث");
        ButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonUpdateActionPerformed(evt);
            }
        });

        newNameLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        newNameLabel.setText("الاسم الجديد");

        ButtonConfirm.setText("تعديل");
        ButtonConfirm.setActionCommand("");
        ButtonConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonConfirmActionPerformed(evt);
            }
        });

        cancelButton.setText("الغاء");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        update.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        update.setForeground(new java.awt.Color(204, 0, 0));
        update.setText("تم الحفظ بنجاح");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(showAll, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(ButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146)
                        .addComponent(ButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(textfieldUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(newNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showAll)
                    .addComponent(addButton)
                    .addComponent(SearchButton))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonDelete)
                    .addComponent(ButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textfieldUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonConfirm)
                    .addComponent(cancelButton))
                .addGap(35, 35, 35)
                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
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

    private void showAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAllActionPerformed
        newNameLabel.setVisible(false);
        ButtonConfirm.setVisible(false);
        textfieldUpdate.setVisible(false);
        update.setVisible(false);
        cancelButton.setVisible(false);

        // put data into table
        try{
             DiseaseTypesHandler oh = new  DiseaseTypesHandler();
             senior.hrms.emps.dto.DiseaseTypes[] list = oh.getAllDiseaseTypes();
            DefaultTableModel dtm = (DefaultTableModel) showTable.getModel();
            dtm.setRowCount(0);
            for(int i=0;i<list.length;i++)
            {
                 senior.hrms.emps.dto.DiseaseTypes or = list[i];
                Vector row= new Vector();
                row.add(or.getDiseaseTypeName());
                row.add(or.getDiseaseTypeId());
                dtm.addRow(row);

            }
            showTable.setModel(dtm);
            showTable.updateUI();
            jScrollPane1.setViewportView(showTable);
        }
        catch(Exception ex){  }

        // TODO add your handling code here:
    }//GEN-LAST:event_showAllActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        newNameLabel.setVisible(false);
        ButtonConfirm.setVisible(false);
        textfieldUpdate.setVisible(false);
        cancelButton.setVisible(false);
        if(TextFieldSearch.getText().length() == 0)
        {
            update.setVisible(false);
        }
        else
        {
            try{
                String keyword = TextFieldSearch.getText();
                senior.hrms.emps.dto.DiseaseTypes dto =new senior.hrms.emps.dto.DiseaseTypes();
                dto.setDiseaseTypeName(keyword);
                DiseaseTypesHandler oh = new DiseaseTypesHandler();
                oh.addDiseaseTypes(dto);
                update.setText("تم الاضافه بنجاح");
                update.setVisible(true);
            }
            catch(Exception ex){  }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_addButtonActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        newNameLabel.setVisible(false);
        ButtonConfirm.setVisible(false);
        textfieldUpdate.setVisible(false);
        cancelButton.setVisible(false);
        update.setVisible(false);

        try{
            String keyword = TextFieldSearch.getText();
            DiseaseTypesHandler oh = new DiseaseTypesHandler();
            senior.hrms.emps.dto.DiseaseTypes[] list = oh.getDiseaseTypeByName(keyword);

            DefaultTableModel dtm = (DefaultTableModel) showTable.getModel();
            dtm.setRowCount(0);
            for(int i=0;i<list.length;i++)
            {
                senior.hrms.emps.dto.DiseaseTypes or = list[i];
                Vector row= new Vector();
                row.add(or.getDiseaseTypeName());
                row.add(or.getDiseaseTypeId());
                dtm.addRow(row);

            }
            showTable.setModel(dtm);
            showTable.updateUI();
            jScrollPane1.setViewportView(showTable);
        }
        catch(Exception ex) {}

        // TODO add your handling code here:
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void ButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDeleteActionPerformed
        try{
            if(showTable.getSelectedRow()>=0)
            {
                newNameLabel.setVisible(false);
                ButtonConfirm.setVisible(false);
                textfieldUpdate.setVisible(false);
                cancelButton.setVisible(false);
                int row = showTable.getSelectedRow();
                int culumn = 1;
                int valueOfId = Integer.parseInt(showTable.getValueAt(row, culumn).toString());
                int confirm= JOptionPane.showConfirmDialog(rootPane, "هل انت متاكد بالحذف !");
                if(confirm==0)
                {
                    senior.hrms.emps.dto.DiseaseTypes or=new senior.hrms.emps.dto.DiseaseTypes();
                    or.setDiseaseTypeId(valueOfId);
                    senior.hrms.emps.dto.DiseaseTypesPk pk=or.createPk();
                    DiseaseTypesHandler oh = new DiseaseTypesHandler();
                    oh.deleteDiseaseTypes(pk);
                    JOptionPane.showMessageDialog(rootPane,"تم الحذف بنجاح");
                    newNameLabel.setVisible(false);
                    ButtonConfirm.setVisible(false);
                    textfieldUpdate.setVisible(false);
                    cancelButton.setVisible(false);
                }
            }

        }
        catch(Exception ex){  }
        

    }//GEN-LAST:event_ButtonDeleteActionPerformed

    private void ButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonUpdateActionPerformed

        if(showTable.getSelectedRow()>=0)
        {
            newNameLabel.setVisible(true);
            ButtonConfirm.setVisible(true);
            cancelButton.setVisible(true);
            textfieldUpdate.setVisible(true);
            update.setVisible(false);
        }

        
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonUpdateActionPerformed

    private void ButtonConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonConfirmActionPerformed
        try{
            if(showTable.getSelectedRow()>=0)
            {
                int row = showTable.getSelectedRow();
                int culumn = 1;
                int valueOfId = Integer.parseInt(showTable.getValueAt(row, culumn).toString());
                String newName= textfieldUpdate.getText();
                senior.hrms.emps.dto.DiseaseTypes or=new senior.hrms.emps.dto.DiseaseTypes();
                or.setDiseaseTypeId(valueOfId);
                or.setDiseaseTypeName(newName);
                senior.hrms.emps.dto.DiseaseTypesPk pk=or.createPk();
                DiseaseTypesHandler oh = new DiseaseTypesHandler();
                oh.updateDiseaseTypes(pk, or);
                newNameLabel.setVisible(false);
                ButtonConfirm.setVisible(false);
                cancelButton.setVisible(false);
                textfieldUpdate.setVisible(false);
                update.setVisible(true);
                update.setText("تم التعديل بنجاح");
            }
        }
        catch(Exception ex){  }

    }//GEN-LAST:event_ButtonConfirmActionPerformed


    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        newNameLabel.setVisible(false);
        ButtonConfirm.setVisible(false);
        textfieldUpdate.setVisible(false);
        textfieldUpdate.setText("");
        cancelButton.setVisible(false);

        update.setVisible(false);// TODO add your handling code here:

    }//GEN-LAST:event_cancelButtonActionPerformed

   
    public static void main(String args[])
    {
        
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
            java.util.logging.Logger.getLogger(DiseaseTypes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(DiseaseTypes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(DiseaseTypes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(DiseaseTypes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      

        
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                try {
                    new DiseaseTypes().setVisible(true);
                } catch (DiseaseTypesDaoException ex) {
                    Logger.getLogger(DiseaseTypes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonConfirm;
    private javax.swing.JButton ButtonDelete;
    private javax.swing.JButton ButtonUpdate;
    private javax.swing.JLabel Label1;
    private javax.swing.JButton SearchButton;
    private javax.swing.JTextField TextFieldSearch;
    private javax.swing.JButton addButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel newNameLabel;
    private javax.swing.JButton showAll;
    private javax.swing.JTable showTable;
    private javax.swing.JTextField textfieldUpdate;
    private javax.swing.JLabel update;
    // End of variables declaration//GEN-END:variables

}

