/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package settings.forms;


import settings.forms.finance.SalaryTypes;
import settings.forms.finance.Banks;
import settings.forms.finance.FinancialYear;
import admin.forms.UserDetails;
import login.forms.MainParts;
import login.forms.HRLogin;
import com.*;
import java.awt.*;
import java.io.*;;
import java.util.*;
import javax.swing.JButton;
import org.jdesktop.swingx.JXTitledPanel;import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import org.jdesktop.swingx.JXTitledPanel;
import senior.hrms.emps.exceptions.AccidentTypesDaoException;
import senior.hrms.emps.exceptions.DiseaseTypesDaoException;
import senior.hrms.emps.exceptions.DiseasesDaoException;
import senior.hrms.emps.exceptions.HospitalsDaoException;
import senior.hrms.emps.exceptions.OrganDaoException;

/**
 *
 * @author amal
 */
public class HRMS_Finance extends javax.swing.JFrame
{
    Common comObj;
    
    Vector panelList;
    JXTitledPanel Pan1,Pan2,Pan3;
    
    String PanTitle1,PanTitle2,PanTitle3;
    /**
     * Creates new form HRMSBasics
     */
    public HRMS_Finance() throws IOException
    {
        comObj = new Common();  // must define befor call : initComponents()
        
        initComponents();
        
        comObj.setFrameTitle(this);
        // full screen //
        comObj.setFrameFullScreen(this);
        // load : logo Icon //
        comObj.loadLogoIcon(logoView);
        // load : Top Icons //
        loadTopIconImages();
         // load: Lables name //
        loadItemText() ; 
        // create right menu: taskpane //
        createTaskPane();
        // create middel panel:  detailes panel //
        panelList = new Vector();
        createDetailedPane();
        // load: left panel: user details //
        loadUserDetails();
    }
    /////////////////////////////////////////////////////////////
    /**
     * 
     */
    private void loadUserDetails()
    {
        userDetails.add(new UserDetails().getContentPane());
    }
    /**
     * get button and titledPanel text from resource file
     */
    protected void loadItemText()
    {
        PanTitle1 = comObj.resourceFile.getString("banks");
        PanTitle2 = comObj.resourceFile.getString("financialYear");
        PanTitle3 = comObj.resourceFile.getString("salaryTypes") ;
    }
    /**
     * 
     * @throws IOException 
     */
    private void loadTopIconImages() throws IOException
    {
       int imgWidth = Integer.parseInt(comObj.resourceFile.getString("iconWidth"));
       int imgHeight= Integer.parseInt(comObj.resourceFile.getString("iconHeight"));
       
       String generalIcon = comObj.resourceFile.getString("iconPath")
               + comObj.resourceFile.getString("generalIcon");

       String affairsIcon = comObj.resourceFile.getString("iconPath")
               + comObj.resourceFile.getString("affairsIcon");
       
       String financeIcon = comObj.resourceFile.getString("iconPath")
               + comObj.resourceFile.getString("financeIcon");
       
       String homeIcon = comObj.resourceFile.getString("iconPath")
               + comObj.resourceFile.getString("homeIcon");
       
       String logoutIcon = comObj.resourceFile.getString("iconPath")
               + comObj.resourceFile.getString("logoutIcon");
       
       generalView.setSize(imgWidth, imgHeight);
       affairView.setSize(imgWidth, imgHeight);
       financeView.setSize(imgWidth, imgHeight);
       homeView.setSize(imgWidth, imgHeight);
       logoutView.setSize(imgWidth, imgHeight);
       
       generalView.setImage(new File(generalIcon));
       affairView.setImage(new File(affairsIcon));
       financeView.setImage(new File(financeIcon));
       homeView.setImage(new File(homeIcon));
       logoutView.setImage(new File(logoutIcon));
       
       generalView.setEditable(false);
       affairView.setEditable(false);
       financeView.setEditable(false);
       homeView.setEditable(false);
       logoutView.setEditable(false);
    }
    /////////////////////////////////////////////////////////////////
    /**
     * create the middle detailed pane
     */
    protected void createDetailedPane()
    {
        // load the contents of the panels //
        Pan1 = new JXTitledPanel(PanTitle1);
        Pan1.add(new Banks().getContentPane());
        Pan1.setVisible(false);
        Pan1.setFont(new Font("Traditional Arabic", Font.BOLD, 18));
        details.add(Pan1);
        panelList.addElement(Pan1);
        
        Pan2 = new JXTitledPanel(PanTitle2);
        Pan2.add(new FinancialYear().getContentPane());
        Pan2.setVisible(false);
        Pan2.setFont(new Font("Traditional Arabic", Font.BOLD, 18));
        details.add(Pan2);
        panelList.addElement(Pan2);
        
        Pan3 = new JXTitledPanel(PanTitle3);
        Pan3.add(new SalaryTypes().getContentPane());
        Pan3.setVisible(false);
        Pan3.setFont(new Font("Traditional Arabic", Font.BOLD, 18));
        details.add(Pan3);
        panelList.addElement(Pan3);
    }
    ///////////////////////////////////////////////////////////////////////
    /**
     * create the right menu
     */
    protected void createTaskPane()
    {
        /////////////////// Accounts ////////////////////
        JButton bt1 = new JButton(PanTitle1);
        bt1.setFont(new Font("Traditional Arabic", Font.BOLD, 18));
        bt1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                bt1_ActionPerformed(evt);
            }
        });
        JButton bt2 = new JButton(PanTitle2);
        bt2.setFont(new Font("Traditional Arabic", Font.BOLD, 18));
        bt2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                bt2_ActionPerformed(evt);
            }
        });
        accounts.add(bt1);
        accounts.add(bt2);
        
        ///////////////////// Salaries /////////////////////////
        JButton bt3 = new JButton(PanTitle3);
        bt3.setFont(new Font("Traditional Arabic", Font.BOLD, 18));
        bt3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                bt3_ActionPerformed(evt);
            }
        });
        salary.add(bt3);
    }
    /**
     * All Buttons Action Performed
     * @param evt 
     */
    ////////////////////    Qualifications_ActionPerformed     //////////////////////////////////////
    private void bt1_ActionPerformed(java.awt.event.ActionEvent evt)                                         
    {  
       comObj.setPanelVisible(Pan1, panelList);
    }
    private void bt2_ActionPerformed(java.awt.event.ActionEvent evt)                                         
    {  
       comObj.setPanelVisible(Pan2, panelList);
    }
    private void bt3_ActionPerformed(java.awt.event.ActionEvent evt)                                         
    {  
       comObj.setPanelVisible(Pan3, panelList);
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        logoView = new org.jdesktop.swingx.JXImageView();
        affairView = new org.jdesktop.swingx.JXImageView();
        financeView = new org.jdesktop.swingx.JXImageView();
        homeView = new org.jdesktop.swingx.JXImageView();
        generalView = new org.jdesktop.swingx.JXImageView();
        logoutView = new org.jdesktop.swingx.JXImageView();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jXTaskPaneContainer1 = new org.jdesktop.swingx.JXTaskPaneContainer();
        accounts = new org.jdesktop.swingx.JXTaskPane();
        salary = new org.jdesktop.swingx.JXTaskPane();
        jPanel4 = new javax.swing.JPanel();
        userDetails = new org.jdesktop.swingx.JXTitledPanel();
        details = new org.jdesktop.swingx.JXTaskPaneContainer();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        logoView.setBackground(new java.awt.Color(234, 233, 231));

        javax.swing.GroupLayout logoViewLayout = new javax.swing.GroupLayout(logoView);
        logoView.setLayout(logoViewLayout);
        logoViewLayout.setHorizontalGroup(
            logoViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 222, Short.MAX_VALUE)
        );
        logoViewLayout.setVerticalGroup(
            logoViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        affairView.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseMoved(java.awt.event.MouseEvent evt)
            {
                affairViewMouseMoved(evt);
            }
        });
        affairView.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                affairViewMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout affairViewLayout = new javax.swing.GroupLayout(affairView);
        affairView.setLayout(affairViewLayout);
        affairViewLayout.setHorizontalGroup(
            affairViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );
        affairViewLayout.setVerticalGroup(
            affairViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        financeView.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseMoved(java.awt.event.MouseEvent evt)
            {
                financeViewMouseMoved(evt);
            }
        });

        javax.swing.GroupLayout financeViewLayout = new javax.swing.GroupLayout(financeView);
        financeView.setLayout(financeViewLayout);
        financeViewLayout.setHorizontalGroup(
            financeViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );
        financeViewLayout.setVerticalGroup(
            financeViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        homeView.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseMoved(java.awt.event.MouseEvent evt)
            {
                homeViewMouseMoved(evt);
            }
        });
        homeView.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                homeViewMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout homeViewLayout = new javax.swing.GroupLayout(homeView);
        homeView.setLayout(homeViewLayout);
        homeViewLayout.setHorizontalGroup(
            homeViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );
        homeViewLayout.setVerticalGroup(
            homeViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        generalView.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseMoved(java.awt.event.MouseEvent evt)
            {
                generalViewMouseMoved(evt);
            }
        });
        generalView.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                generalViewMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout generalViewLayout = new javax.swing.GroupLayout(generalView);
        generalView.setLayout(generalViewLayout);
        generalViewLayout.setHorizontalGroup(
            generalViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );
        generalViewLayout.setVerticalGroup(
            generalViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        logoutView.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseMoved(java.awt.event.MouseEvent evt)
            {
                logoutViewMouseMoved(evt);
            }
        });
        logoutView.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                logoutViewMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout logoutViewLayout = new javax.swing.GroupLayout(logoutView);
        logoutView.setLayout(logoutViewLayout);
        logoutViewLayout.setHorizontalGroup(
            logoutViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );
        logoutViewLayout.setVerticalGroup(
            logoutViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("com/resource"); // NOI18N
        jLabel1.setText(bundle.getString("financeSettingTitle")); // NOI18N
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(logoutView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(homeView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(financeView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(affairView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(generalView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logoView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(generalView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(affairView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(financeView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(homeView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoutView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 1, true));
        jPanel2.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N

        jXTaskPaneContainer1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "إعـدادات مــالـية", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Traditional Arabic", 1, 18), new java.awt.Color(0, 0, 102))); // NOI18N
        org.jdesktop.swingx.VerticalLayout verticalLayout1 = new org.jdesktop.swingx.VerticalLayout();
        verticalLayout1.setGap(14);
        jXTaskPaneContainer1.setLayout(verticalLayout1);

        accounts.setCollapsed(true);
        accounts.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        accounts.setTitle("الـحســـابـــات");
        accounts.addPropertyChangeListener(new java.beans.PropertyChangeListener()
        {
            public void propertyChange(java.beans.PropertyChangeEvent evt)
            {
                accountsPropertyChange(evt);
            }
        });
        jXTaskPaneContainer1.add(accounts);

        salary.setCollapsed(true);
        salary.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        salary.setTitle("المــــرتـبـات");
        salary.addPropertyChangeListener(new java.beans.PropertyChangeListener()
        {
            public void propertyChange(java.beans.PropertyChangeEvent evt)
            {
                salaryPropertyChange(evt);
            }
        });
        jXTaskPaneContainer1.add(salary);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jXTaskPaneContainer1, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jXTaskPaneContainer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 1, true));
        jPanel4.setAutoscrolls(true);
        jPanel4.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N

        userDetails.setAutoscrolls(true);
        userDetails.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        userDetails.setTitle("المـسـتـخــدم");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(userDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(userDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        details.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 1, true));
        org.jdesktop.swingx.VerticalLayout verticalLayout2 = new org.jdesktop.swingx.VerticalLayout();
        verticalLayout2.setGap(14);
        details.setLayout(verticalLayout2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(details, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(details, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutViewMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_logoutViewMouseMoved
    {//GEN-HEADEREND:event_logoutViewMouseMoved
        logoutView.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_logoutViewMouseMoved

    private void homeViewMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_homeViewMouseMoved
    {//GEN-HEADEREND:event_homeViewMouseMoved
        homeView.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_homeViewMouseMoved

    private void financeViewMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_financeViewMouseMoved
    {//GEN-HEADEREND:event_financeViewMouseMoved
        financeView.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_financeViewMouseMoved

    private void affairViewMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_affairViewMouseMoved
    {//GEN-HEADEREND:event_affairViewMouseMoved
        affairView.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_affairViewMouseMoved

    private void generalViewMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_generalViewMouseMoved
    {//GEN-HEADEREND:event_generalViewMouseMoved
        generalView.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_generalViewMouseMoved

    private void logoutViewMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_logoutViewMouseClicked
    {//GEN-HEADEREND:event_logoutViewMouseClicked
        try
        {
            comObj.showForm(new HRLogin(), this);
        } 
        catch (IOException ex)
        {
            System.out.println("Exception in "+HRMS_Finance.class.getName()+":" + ex.getMessage() );
        }
    }//GEN-LAST:event_logoutViewMouseClicked

    private void homeViewMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_homeViewMouseClicked
    {//GEN-HEADEREND:event_homeViewMouseClicked
        try
        {
            comObj.showForm(new MainParts(), this);
        } 
        catch (IOException ex)
        {
            System.out.println("Exception in "+HRMS_Finance.class.getName()+":" + ex.getMessage() );
        }
    }//GEN-LAST:event_homeViewMouseClicked

    private void accountsPropertyChange(java.beans.PropertyChangeEvent evt)//GEN-FIRST:event_accountsPropertyChange
    {//GEN-HEADEREND:event_accountsPropertyChange
        comObj.setJXTaskPaneSpecial(accounts);
    }//GEN-LAST:event_accountsPropertyChange

    private void salaryPropertyChange(java.beans.PropertyChangeEvent evt)//GEN-FIRST:event_salaryPropertyChange
    {//GEN-HEADEREND:event_salaryPropertyChange
        comObj.setJXTaskPaneSpecial(salary);
    }//GEN-LAST:event_salaryPropertyChange

    private void affairViewMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_affairViewMouseClicked
    {//GEN-HEADEREND:event_affairViewMouseClicked
        try
        {
            comObj.showForm(new HRMS_Affairs(), this);
        }
        catch (IOException ex)
        {
            System.out.println("Exception in "+HRMS_Finance.class.getName()+":" + ex.getMessage() );
        }
    }//GEN-LAST:event_affairViewMouseClicked

    private void generalViewMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_generalViewMouseClicked
    {//GEN-HEADEREND:event_generalViewMouseClicked
        try
        {
            comObj.showForm(new HRMS_General(), this);
        } 
        catch (IOException ex)
        {
            System.out.println("Exception in "+HRMS_Finance.class.getName()+":" + ex.getMessage() );
        } catch (OrganDaoException ex)
        {
            Logger.getLogger(HRMS_Finance.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AccidentTypesDaoException ex)
        {
            Logger.getLogger(HRMS_Finance.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DiseaseTypesDaoException ex)
        {
            Logger.getLogger(HRMS_Finance.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DiseasesDaoException ex)
        {
            Logger.getLogger(HRMS_Finance.class.getName()).log(Level.SEVERE, null, ex);
        } catch (HospitalsDaoException ex)
        {
            Logger.getLogger(HRMS_Finance.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_generalViewMouseClicked

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
            java.util.logging.Logger.getLogger(HRMS_Finance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(HRMS_Finance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(HRMS_Finance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(HRMS_Finance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                try
                {
                    new HRMS_Finance().setVisible(true);
                } 
                catch (IOException ex)
                {
                    System.out.println("Exception in "+HRMS_Finance.class.getName()+":" + ex.getMessage() );
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXTaskPane accounts;
    private org.jdesktop.swingx.JXImageView affairView;
    private org.jdesktop.swingx.JXTaskPaneContainer details;
    private org.jdesktop.swingx.JXImageView financeView;
    private org.jdesktop.swingx.JXImageView generalView;
    private org.jdesktop.swingx.JXImageView homeView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private org.jdesktop.swingx.JXTaskPaneContainer jXTaskPaneContainer1;
    private org.jdesktop.swingx.JXImageView logoView;
    private org.jdesktop.swingx.JXImageView logoutView;
    private org.jdesktop.swingx.JXTaskPane salary;
    private org.jdesktop.swingx.JXTitledPanel userDetails;
    // End of variables declaration//GEN-END:variables
}
