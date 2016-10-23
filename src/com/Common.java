/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com;

import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import org.jdesktop.swingx.*;

/**
 *
 * @author amal
 */
public class Common
{
   public ResourceBundle resourceFile;
   
   public String imgFolder, iconFolder, title, copyRight;
   
   public static String userName ="" , userPrivilege = "" ;
   
   public Common()
   {
       resourceFile = ResourceBundle.getBundle("com.resource");
       
       imgFolder =  resourceFile.getString("imagesPath");
       iconFolder =  resourceFile.getString("iconPath");
       
       title = resourceFile.getString("frameTitle");
       copyRight = resourceFile.getString("copyRights");
   }
    /**
     * Load another JFrame
     * @param visibleForm : to be loaded
     * @param hiddenForm : to be hide
     */
    public void showForm(JFrame visibleForm , JFrame hiddenForm)
    {
        visibleForm.setVisible(true);
        visibleForm.setEnabled(true);
       
        hiddenForm.setVisible(false);
        hiddenForm.setEnabled(false);
    }
    /**
     * Display the Frame in a Full Screen
     * @param form
     * @throws HeadlessException 
     */
    public void setFrameFullScreen(JFrame form) throws HeadlessException
    {
        form.setResizable(false);
        Toolkit tk = Toolkit.getDefaultToolkit();
        int width = (int) tk.getScreenSize().getWidth();
        int height = (int) tk.getScreenSize().getHeight();
        form.setSize(width, height);
        
    }
    /**
     * set the max JFrame width 
     * @param form
     * @param width
     * @throws HeadlessException 
     */
    public void setMaxFrameWidth(JFrame form , int width) throws HeadlessException
    {
        form.setResizable(false);
        Toolkit tk = Toolkit.getDefaultToolkit();
        int height = (int) tk.getScreenSize().getHeight();
        form.setSize(width, height);
    }
    /**
     * Display the Panel in a Full Screen
     * @param panel
     * @throws HeadlessException 
     */
    public void setPanelFullScreen(JPanel panel) throws HeadlessException
    {
        panel.setAutoscrolls(false);
        Toolkit tk = Toolkit.getDefaultToolkit();
        int width = (int) tk.getScreenSize().getWidth();
        int height = (int) tk.getScreenSize().getHeight();
        panel.setSize(width, height);
    }
    /**
     * load Logo image
     * @param logoView
     * @throws IOException 
     */
    public void loadLogo(JXImageView logoView) throws IOException
    {
       String filePath = imgFolder + resourceFile.getString("logoFileName");
       int logoWidth = Integer.parseInt(resourceFile.getString("logoWidth")); 
       int logoHeight = Integer.parseInt(resourceFile.getString("logoHeight")); 
       logoView.setSize(logoWidth, logoHeight);
       logoView.setImage(new File(filePath));
       logoView.setEditable(false);
    }
    /**
     * Load Logo Icon
     * @param logoView
     * @throws IOException 
     */
    public void loadLogoIcon(JXImageView logoView) throws IOException
    {
       String filePath = iconFolder + resourceFile.getString("logoFileName");
       int logoWidth = Integer.parseInt(resourceFile.getString("logoIconWidth")); // w=129
       int logoHeight = Integer.parseInt(resourceFile.getString("logoIconHeight"));  
       logoView.setSize(logoWidth, logoHeight);
       logoView.setImage(new File(filePath));
       logoView.setEditable(false);
    }
    /**
     * set JXTaskPane Special (heighLighted)
     * @param taskPane 
     */
    public void setJXTaskPaneSpecial(JXTaskPane taskPane)
    {
        if( ! taskPane.isCollapsed() ) // open //
            taskPane.setSpecial(true);
        else
            taskPane.setSpecial(false);
    }
    /**
     * show only selected TitlePanel , and hide the other
     * @param panl : the selected panel to be visible
     * @param list : vector of all other panel to be invisible
     */
    public void setPanelVisible(JXTitledPanel panl , Vector list)
    {
       for(int v=0; v < list.size(); v++)
       {
           JXTitledPanel tPanl = (JXTitledPanel) list.elementAt(v);
           if(tPanl.equals(panl))
               tPanl.setVisible(true);
           else
              tPanl.setVisible(false); 
       }
    }
    /**
     * 
     * @param form
     * @param title 
     */
    public void setFrameTitle(JFrame form)
    {
        form.setTitle(title);
    }
    public void setFrameCopyRight(JLabel jLabel1)
    {
        jLabel1.setText(copyRight);
    }
}

