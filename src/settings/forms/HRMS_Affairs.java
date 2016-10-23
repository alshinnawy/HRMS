/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package settings.forms;

import admin.forms.UserDetails;
import login.forms.*;
import com.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import org.jdesktop.swingx.JXTitledPanel;
import senior.hrms.emps.exceptions.AccidentTypesDaoException;
import senior.hrms.emps.exceptions.DiseaseTypesDaoException;
import senior.hrms.emps.exceptions.DiseasesDaoException;
import senior.hrms.emps.exceptions.HospitalsDaoException;
import senior.hrms.emps.exceptions.OrganDaoException;
import settings.forms.affairs.*;

/**
 *
 * @author amal
 */
public class HRMS_Affairs extends javax.swing.JFrame
{
    Common comObj;
    
    Vector panelList;
    JXTitledPanel Pan1,Pan2,Pan3,Pan4,Pan5,Pan6,Pan7,Pan8,Pan9,
            Pan10,Pan11,Pan12,Pan13,Pan14,Pan15,Pan16,Pan17,Pan18;
    
    String PanTitle1,PanTitle2,PanTitle3,PanTitle4,PanTitle5,PanTitle6,
            PanTitle7,PanTitle8,PanTitle9,PanTitle10,PanTitle11,PanTitle12,
            PanTitle13,PanTitle14,PanTitle15,PanTitle16,PanTitle17,PanTitle18;
    /**
     * Creates new form HRMSBasics
     */
    public HRMS_Affairs() throws IOException
    {
        comObj = new Common(); // must define befor call : initComponents()
        
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
        PanTitle1 = comObj.resourceFile.getString("employType");
        PanTitle2 = comObj.resourceFile.getString("jobTitle");
        PanTitle3 = comObj.resourceFile.getString("jobLevel") ;
        PanTitle4 = comObj.resourceFile.getString("documents") ;
        PanTitle5 = comObj.resourceFile.getString("projects") ;
        PanTitle6 = comObj.resourceFile.getString("missionType") ;
        PanTitle7 = comObj.resourceFile.getString("missionSides") ;
        PanTitle8 = comObj.resourceFile.getString("trainingCourses") ;
        PanTitle9 = comObj.resourceFile.getString("responsibilities") ;
        PanTitle10 = comObj.resourceFile.getString("portingCause") ;
        PanTitle11 = comObj.resourceFile.getString("evaluationItems") ;
        PanTitle12 = comObj.resourceFile.getString("evaluationDegrees") ;
        PanTitle13 = comObj.resourceFile.getString("endServiceCause") ;
        PanTitle14 = comObj.resourceFile.getString("officialVacations") ;
        PanTitle15 = comObj.resourceFile.getString("weekendVacations") ;
        PanTitle16 = comObj.resourceFile.getString("vacationTypes") ;
        PanTitle17 = comObj.resourceFile.getString("workHours") ;
        PanTitle18 = comObj.resourceFile.getString("leaves") ;
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
        Pan1.add(new EmployTypes().getContentPane());
        Pan1.setVisible(false);
        Pan1.setFont(new Font("Traditional Arabic", Font.BOLD, 18));
        details.add(Pan1);
        panelList.addElement(Pan1);
        
        Pan2 = new JXTitledPanel(PanTitle2);
        Pan2.add(new JobTitle().getContentPane());
        Pan2.setVisible(false);
        Pan2.setFont(new Font("Traditional Arabic", Font.BOLD, 18));
        details.add(Pan2);
        panelList.addElement(Pan2);
        
        Pan3 = new JXTitledPanel(PanTitle3);
        Pan3.add(new JobLevel().getContentPane());
        Pan3.setVisible(false);
        Pan3.setFont(new Font("Traditional Arabic", Font.BOLD, 18));
        details.add(Pan3);
        panelList.addElement(Pan3);
        
        Pan4 = new JXTitledPanel(PanTitle4);
        Pan4.add(new Documents().getContentPane());
        Pan4.setVisible(false);
        Pan4.setFont(new Font("Traditional Arabic", Font.BOLD, 18));
        details.add(Pan4);
        panelList.addElement(Pan4);
        
        Pan5 = new JXTitledPanel(PanTitle5);
        Pan5.add(new Projects().getContentPane());
        Pan5.setVisible(false);
        Pan5.setFont(new Font("Traditional Arabic", Font.BOLD, 18));
        details.add(Pan5);
        panelList.addElement(Pan5);
        
        Pan6 = new JXTitledPanel(PanTitle6);
        Pan6.add(new MissionTypes().getContentPane());
        Pan6.setVisible(false);
        Pan6.setFont(new Font("Traditional Arabic", Font.BOLD, 18));
        details.add(Pan6);
        panelList.addElement(Pan6);
        
        Pan7 = new JXTitledPanel(PanTitle7);
        Pan7.add(new MissionSides().getContentPane());
        Pan7.setVisible(false);
        Pan7.setFont(new Font("Traditional Arabic", Font.BOLD, 18));
        details.add(Pan7);
        panelList.addElement(Pan7);
        
        Pan8 = new JXTitledPanel(PanTitle8);
        Pan8.add(new TrainingCourses().getContentPane());
        Pan8.setVisible(false);
        Pan8.setFont(new Font("Traditional Arabic", Font.BOLD, 18));
        details.add(Pan8);
        panelList.addElement(Pan8);
        
        Pan9 = new JXTitledPanel(PanTitle9);
        Pan9.add(new Responsibilities().getContentPane());
        Pan9.setVisible(false);
        Pan9.setFont(new Font("Traditional Arabic", Font.BOLD, 18));
        details.add(Pan9);
        panelList.addElement(Pan9);
        
        Pan10 = new JXTitledPanel(PanTitle10);
        Pan10.add(new PortingCause().getContentPane());
        Pan10.setVisible(false);
        Pan10.setFont(new Font("Traditional Arabic", Font.BOLD, 18));
        details.add(Pan10);
        panelList.addElement(Pan10);
        
        Pan11 = new JXTitledPanel(PanTitle11);
        Pan11.add(new EvaluationItems().getContentPane());
        Pan11.setVisible(false);
        Pan11.setFont(new Font("Traditional Arabic", Font.BOLD, 18));
        details.add(Pan11);
        panelList.addElement(Pan11);
        
        Pan12 = new JXTitledPanel(PanTitle12);
        Pan12.add(new EvaluationDegrees().getContentPane());
        Pan12.setVisible(false);
        Pan12.setFont(new Font("Traditional Arabic", Font.BOLD, 18));
        details.add(Pan12);
        panelList.addElement(Pan12);
        
        Pan13 = new JXTitledPanel(PanTitle13);
        Pan13.add(new EndServiceCause().getContentPane());
        Pan13.setVisible(false);
        Pan13.setFont(new Font("Traditional Arabic", Font.BOLD, 18));
        details.add(Pan13);
        panelList.addElement(Pan13);
        
        Pan14 = new JXTitledPanel(PanTitle14);
        Pan14.add(new OfficialVacations().getContentPane());
        Pan14.setVisible(false);
        Pan14.setFont(new Font("Traditional Arabic", Font.BOLD, 18));
        details.add(Pan14);
        panelList.addElement(Pan14);
        
        Pan15 = new JXTitledPanel(PanTitle15);
        Pan15.add(new WeekendVacations().getContentPane());
        Pan15.setVisible(false);
        Pan15.setFont(new Font("Traditional Arabic", Font.BOLD, 18));
        details.add(Pan15);
        panelList.addElement(Pan15);
        
        Pan16 = new JXTitledPanel(PanTitle16);
        Pan16.add(new VacationTypes().getContentPane());
        Pan16.setVisible(false);
        Pan16.setFont(new Font("Traditional Arabic", Font.BOLD, 18));
        details.add(Pan16);
        panelList.addElement(Pan16);
        
        Pan17 = new JXTitledPanel(PanTitle17);
        Pan17.add(new WorkHours().getContentPane());
        Pan17.setVisible(false);
        Pan17.setFont(new Font("Traditional Arabic", Font.BOLD, 18));
        details.add(Pan17);
        panelList.addElement(Pan17);
        
        Pan18 = new JXTitledPanel(PanTitle18);
        Pan18.add(new Leaves().getContentPane());
        Pan18.setVisible(false);
        Pan18.setFont(new Font("Traditional Arabic", Font.BOLD, 18));
        details.add(Pan18);
        panelList.addElement(Pan18);
    }
    ///////////////////////////////////////////////////////////////////////
    /**
     * create the right menu
     */
    protected void createTaskPane()
    {
        /////////////////// Jobs ////////////////////
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
        JButton bt3 = new JButton(PanTitle3);
        bt3.setFont(new Font("Traditional Arabic", Font.BOLD, 18));
        bt3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                bt3_ActionPerformed(evt);
            }
        });
        JButton bt4 = new JButton(PanTitle4);
        bt4.setFont(new Font("Traditional Arabic", Font.BOLD, 18));
        bt4.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                bt4_ActionPerformed(evt);
            }
        });
        jobs.add(bt1);
        jobs.add(bt2);
        jobs.add(bt3);
        jobs.add(bt4);
        
        JButton bt5 = new JButton(PanTitle5);
        bt5.setFont(new Font("Traditional Arabic", Font.BOLD, 18));
        bt5.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                bt5_ActionPerformed(evt);
            }
        });
        JButton bt6 = new JButton(PanTitle6);
        bt6.setFont(new Font("Traditional Arabic", Font.BOLD, 18));
        bt6.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                bt6_ActionPerformed(evt);
            }
        });
        JButton bt7 = new JButton(PanTitle7);
        bt7.setFont(new Font("Traditional Arabic", Font.BOLD, 18));
        bt7.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                bt7_ActionPerformed(evt);
            }
        });
        JButton bt8 = new JButton(PanTitle8);
        bt8.setFont(new Font("Traditional Arabic", Font.BOLD, 18));
        bt8.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                bt8_ActionPerformed(evt);
            }
        });
        JButton bt9 = new JButton(PanTitle9);
        bt9.setFont(new Font("Traditional Arabic", Font.BOLD, 18));
        bt9.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                bt9_ActionPerformed(evt);
            }
        });
        tasks.add(bt5);
        tasks.add(bt6);
        tasks.add(bt7);
        tasks.add(bt8);
        tasks.add(bt9);
        
       ///////////////////// Porting /////////////////////////
        JButton bt10 = new JButton(PanTitle10);
        bt10.setFont(new Font("Traditional Arabic", Font.BOLD, 18));
        bt10.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                bt10_ActionPerformed(evt);
            }
        });
        JButton bt11 = new JButton(PanTitle11);
        bt11.setFont(new Font("Traditional Arabic", Font.BOLD, 18));
        bt11.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                bt11_ActionPerformed(evt);
            }
        });
        JButton bt12 = new JButton(PanTitle12);
        bt12.setFont(new Font("Traditional Arabic", Font.BOLD, 18));
        bt12.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                bt12_ActionPerformed(evt);
            }
        });
        JButton bt13 = new JButton(PanTitle13);
        bt13.setFont(new Font("Traditional Arabic", Font.BOLD, 18));
        bt13.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                bt13_ActionPerformed(evt);
            }
        });
        porting.add(bt10);
        porting.add(bt11);
        porting.add(bt12);
        porting.add(bt13);
        ///////////////////// Vacations /////////////////////////
        JButton bt14 = new JButton(PanTitle14);
        bt14.setFont(new Font("Traditional Arabic", Font.BOLD, 18));
        bt14.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                bt14_ActionPerformed(evt);
            }
        });
        JButton bt15 = new JButton(PanTitle15);
        bt15.setFont(new Font("Traditional Arabic", Font.BOLD, 18));
        bt15.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                bt15_ActionPerformed(evt);
            }
        });
        JButton bt16 = new JButton(PanTitle16);
        bt16.setFont(new Font("Traditional Arabic", Font.BOLD, 18));
        bt16.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                bt16_ActionPerformed(evt);
            }
        });
        JButton bt17 = new JButton(PanTitle17);
        bt17.setFont(new Font("Traditional Arabic", Font.BOLD, 18));
        bt17.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                bt17_ActionPerformed(evt);
            }
        });
        JButton bt18= new JButton(PanTitle18);
        bt18.setFont(new Font("Traditional Arabic", Font.BOLD, 18));
        bt18.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                bt18_ActionPerformed(evt);
            }
        });
        vacations.add(bt13);
        vacations.add(bt14);
        vacations.add(bt15);
        vacations.add(bt16);
        vacations.add(bt17);
        vacations.add(bt18);
    }
    /**
     * All Buttons Action Performed
     * @param evt 
     */
    ////////////////////    Jobs     //////////////////////////////////////
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
    private void bt4_ActionPerformed(java.awt.event.ActionEvent evt)                                         
    {  
       comObj.setPanelVisible(Pan4, panelList);
    }
    ////////////////////    Tasks     //////////////////////////////////////
    private void bt5_ActionPerformed(java.awt.event.ActionEvent evt)                                         
    {  
        comObj.setPanelVisible(Pan5, panelList);
    }
    private void bt6_ActionPerformed(java.awt.event.ActionEvent evt) 
    {
        comObj.setPanelVisible(Pan6, panelList);
    }
    private void bt7_ActionPerformed(java.awt.event.ActionEvent evt) 
    {
        comObj.setPanelVisible(Pan7, panelList);
    }
    private void bt8_ActionPerformed(java.awt.event.ActionEvent evt) 
    {
        comObj.setPanelVisible(Pan8, panelList);
    }
    private void bt9_ActionPerformed(java.awt.event.ActionEvent evt) 
    {
        comObj.setPanelVisible(Pan9, panelList);
    }
    ////////////////////    Porting   ////////////////////////
    private void bt10_ActionPerformed(java.awt.event.ActionEvent evt) 
    {
        comObj.setPanelVisible(Pan10, panelList);
    }
    private void bt11_ActionPerformed(java.awt.event.ActionEvent evt) 
    {
        comObj.setPanelVisible(Pan11, panelList);
    }
    private void bt12_ActionPerformed(java.awt.event.ActionEvent evt) 
    {
        comObj.setPanelVisible(Pan12, panelList);
    }
    private void bt13_ActionPerformed(java.awt.event.ActionEvent evt) 
    {
        comObj.setPanelVisible(Pan13, panelList);
    }
    ////////////////////    Vacations   ////////////////////////
    private void bt14_ActionPerformed(java.awt.event.ActionEvent evt) 
    {
        comObj.setPanelVisible(Pan14, panelList);
    }
    private void bt15_ActionPerformed(java.awt.event.ActionEvent evt) 
    {
        comObj.setPanelVisible(Pan15, panelList);
    }
    private void bt16_ActionPerformed(java.awt.event.ActionEvent evt) 
    {
        comObj.setPanelVisible(Pan16, panelList);
    }
    private void bt17_ActionPerformed(java.awt.event.ActionEvent evt) 
    {
        comObj.setPanelVisible(Pan17, panelList);
    }
    private void bt18_ActionPerformed(java.awt.event.ActionEvent evt) 
    {
        comObj.setPanelVisible(Pan18, panelList);
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
        jobs = new org.jdesktop.swingx.JXTaskPane();
        tasks = new org.jdesktop.swingx.JXTaskPane();
        porting = new org.jdesktop.swingx.JXTaskPane();
        vacations = new org.jdesktop.swingx.JXTaskPane();
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
        financeView.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                financeViewMouseClicked(evt);
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
        jLabel1.setText(bundle.getString("affairsSettingTitle")); // NOI18N
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

        jXTaskPaneContainer1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "إعـدادات شـؤون المـوظـفين", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Traditional Arabic", 1, 18), new java.awt.Color(0, 0, 102))); // NOI18N
        org.jdesktop.swingx.VerticalLayout verticalLayout1 = new org.jdesktop.swingx.VerticalLayout();
        verticalLayout1.setGap(14);
        jXTaskPaneContainer1.setLayout(verticalLayout1);

        jobs.setCollapsed(true);
        jobs.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jobs.setTitle("الـمـهــن");
        jobs.addPropertyChangeListener(new java.beans.PropertyChangeListener()
        {
            public void propertyChange(java.beans.PropertyChangeEvent evt)
            {
                jobsPropertyChange(evt);
            }
        });
        jXTaskPaneContainer1.add(jobs);

        tasks.setCollapsed(true);
        tasks.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        tasks.setTitle("الـمـهــــام");
        tasks.addPropertyChangeListener(new java.beans.PropertyChangeListener()
        {
            public void propertyChange(java.beans.PropertyChangeEvent evt)
            {
                tasksPropertyChange(evt);
            }
        });
        jXTaskPaneContainer1.add(tasks);

        porting.setCollapsed(true);
        porting.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        porting.setTitle("التــــرقـيــات");
        porting.addPropertyChangeListener(new java.beans.PropertyChangeListener()
        {
            public void propertyChange(java.beans.PropertyChangeEvent evt)
            {
                portingPropertyChange(evt);
            }
        });
        jXTaskPaneContainer1.add(porting);

        vacations.setCollapsed(true);
        vacations.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        vacations.setTitle("الاجــــازات");
        vacations.addPropertyChangeListener(new java.beans.PropertyChangeListener()
        {
            public void propertyChange(java.beans.PropertyChangeEvent evt)
            {
                vacationsPropertyChange(evt);
            }
        });
        jXTaskPaneContainer1.add(vacations);

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

        userDetails.setForeground(new java.awt.Color(0, 0, 153));
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
            System.out.println("Exception in "+HRMS_Affairs.class.getName()+":" + ex.getMessage() );
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
             System.out.println("Exception in "+HRMS_Affairs.class.getName()+":" + ex.getMessage() );
            
        }
    }//GEN-LAST:event_homeViewMouseClicked

    private void tasksPropertyChange(java.beans.PropertyChangeEvent evt)//GEN-FIRST:event_tasksPropertyChange
    {//GEN-HEADEREND:event_tasksPropertyChange
        comObj.setJXTaskPaneSpecial(tasks);
    }//GEN-LAST:event_tasksPropertyChange

    private void jobsPropertyChange(java.beans.PropertyChangeEvent evt)//GEN-FIRST:event_jobsPropertyChange
    {//GEN-HEADEREND:event_jobsPropertyChange
        comObj.setJXTaskPaneSpecial(jobs);
    }//GEN-LAST:event_jobsPropertyChange

    private void portingPropertyChange(java.beans.PropertyChangeEvent evt)//GEN-FIRST:event_portingPropertyChange
    {//GEN-HEADEREND:event_portingPropertyChange
        comObj.setJXTaskPaneSpecial(porting);
    }//GEN-LAST:event_portingPropertyChange

    private void vacationsPropertyChange(java.beans.PropertyChangeEvent evt)//GEN-FIRST:event_vacationsPropertyChange
    {//GEN-HEADEREND:event_vacationsPropertyChange
        comObj.setJXTaskPaneSpecial(vacations);
    }//GEN-LAST:event_vacationsPropertyChange

    private void generalViewMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_generalViewMouseClicked
    {//GEN-HEADEREND:event_generalViewMouseClicked
        try
        {
            comObj.showForm(new HRMS_General(), this);
        } 
        catch (IOException ex)
        {
            System.out.println("Exception in "+HRMS_Affairs.class.getName()+":" + ex.getMessage() );
        } catch (OrganDaoException ex)
        {
            Logger.getLogger(HRMS_Affairs.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AccidentTypesDaoException ex)
        {
            Logger.getLogger(HRMS_Affairs.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DiseaseTypesDaoException ex)
        {
            Logger.getLogger(HRMS_Affairs.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DiseasesDaoException ex)
        {
            Logger.getLogger(HRMS_Affairs.class.getName()).log(Level.SEVERE, null, ex);
        } catch (HospitalsDaoException ex)
        {
            Logger.getLogger(HRMS_Affairs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_generalViewMouseClicked

    private void financeViewMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_financeViewMouseClicked
    {//GEN-HEADEREND:event_financeViewMouseClicked
        try
        {
            comObj.showForm(new HRMS_Finance(), this);
        }
        catch (IOException ex)
        {
            System.out.println("Exception in "+HRMS_Affairs.class.getName()+":" + ex.getMessage() );
        }
    }//GEN-LAST:event_financeViewMouseClicked

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
            java.util.logging.Logger.getLogger(HRMS_Affairs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(HRMS_Affairs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(HRMS_Affairs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(HRMS_Affairs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                try
                {
                    new HRMS_General().setVisible(true);
                } 
                catch (IOException ex)
                {
                    System.out.println("Exception in "+HRMS_Affairs.class.getName()+":" + ex.getMessage() );
                } catch (OrganDaoException ex)
                {
                    Logger.getLogger(HRMS_Affairs.class.getName()).log(Level.SEVERE, null, ex);
                } catch (AccidentTypesDaoException ex)
                {
                    Logger.getLogger(HRMS_Affairs.class.getName()).log(Level.SEVERE, null, ex);
                } catch (DiseaseTypesDaoException ex)
                {
                    Logger.getLogger(HRMS_Affairs.class.getName()).log(Level.SEVERE, null, ex);
                } catch (DiseasesDaoException ex)
                {
                    Logger.getLogger(HRMS_Affairs.class.getName()).log(Level.SEVERE, null, ex);
                } catch (HospitalsDaoException ex)
                {
                    Logger.getLogger(HRMS_Affairs.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private org.jdesktop.swingx.JXTaskPane jobs;
    private org.jdesktop.swingx.JXImageView logoView;
    private org.jdesktop.swingx.JXImageView logoutView;
    private org.jdesktop.swingx.JXTaskPane porting;
    private org.jdesktop.swingx.JXTaskPane tasks;
    private org.jdesktop.swingx.JXTitledPanel userDetails;
    private org.jdesktop.swingx.JXTaskPane vacations;
    // End of variables declaration//GEN-END:variables
}
