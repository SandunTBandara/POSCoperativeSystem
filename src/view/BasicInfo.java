/*\
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import view.BasicInformation.DepartmentInformation;
import com.mysql.cj.xdevapi.Result;
import controller.ManageBin;
import controller.ManageDepartment;
import controller.ManageItem;
import controller.ManageSupplies;
import controller.ManageUser;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import static javax.swing.UIManager.getString;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import model.frontlogin;
import view.BasicInformation.BinInformation;
import view.BasicInformation.BinLocation;
import view.BasicInformation.CategoryInfomation;
import view.BasicInformation.DepartmentInformation;
import view.BasicInformation.ItemAlerttoBinLocation;
import view.BasicInformation.ItemInformation;
import view.BasicInformation.LoyalityCards;
import view.BasicInformation.LoyalityMemberInformation;
import view.BasicInformation.StoresDetails;
import view.BasicInformation.creditCustomer;
import view.BasicInformation.credittypeInfor;
import view.BasicInformation.Suppliers;
import view.EntryNotes.GoodReceiveNote;


public class BasicInfo extends javax.swing.JInternalFrame {

    public BasicInfo() throws FontFormatException, IOException {
        initComponents();
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        
        
        InputStream is = BasicInfo.class.getResourceAsStream("3 FM_Abhaya  sinhala font by Aluth.com.ttf");
        Font font = Font.createFont(Font.TRUETYPE_FONT, is);
        Font sizedFont = font.deriveFont(24f);
        btndepartmentdetails.setFont(sizedFont);
        btncategorydetails.setFont(sizedFont);
         btnsupplierdetails1.setFont(sizedFont);
         btnrackdetails.setFont(sizedFont);
         btnitemdetails1.setFont(sizedFont);
         btnItemAlertBin.setFont(sizedFont);
         btnsubloc1.setFont(sizedFont);
         btnloandetails1.setFont(sizedFont);
         btnloancusdetails1.setFont(sizedFont);
         btnmembercards1.setFont(sizedFont);
         btncusname.setFont(sizedFont);
         lbldepartmentcount.setFont(sizedFont);
         lblsupplierscount.setFont(sizedFont);
         lblItemCount.setFont(sizedFont);
         lblRackcount.setFont(sizedFont);
         
         
         
        
         lbldisplay();
         lblnamedisplay();
         lblsupplierdisplay();
         lblItemDisplay();
         lblbinDisplay();
         

    }
    
    
    public void lbldisplay()
    {
      
          ManageDepartment dep = new ManageDepartment();
          lbldepartmentdet.setText(dep.getNo());
    
    }
    
    public void lblnamedisplay()
    {
        ManageDepartment dep = new ManageDepartment();
     
     
    }
    
    public void lblsupplierdisplay()
    {
        ManageSupplies sup = new ManageSupplies();
        lblsupplier.setText(sup.loadCount());
        
    }
    
    public void lblItemDisplay()
    {
        ManageItem it = new ManageItem();
        lblItem.setText(it.loadItemCount());
        
    }
    
    public void lblbinDisplay()
    {
     ManageBin bin = new ManageBin();
     lblrack.setText(bin.loadCountBin());
     
    
    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        btndepartmentdetails = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnrackdetails = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnitemdetails1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnsupplierdetails1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnsubloc1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btncategorydetails = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        btnmembercards1 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        btncusname = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        btnItemAlertBin = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        btnloancusdetails1 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        btnloandetails1 = new javax.swing.JButton();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        lbldepartmentdet = new javax.swing.JLabel();
        lbldepartmentcount = new javax.swing.JLabel();
        kGradientPanel4 = new keeptoo.KGradientPanel();
        kGradientPanel6 = new keeptoo.KGradientPanel();
        kGradientPanel7 = new keeptoo.KGradientPanel();
        kGradientPanel8 = new keeptoo.KGradientPanel();
        kGradientPanel9 = new keeptoo.KGradientPanel();
        kGradientPanel10 = new keeptoo.KGradientPanel();
        kGradientPanel11 = new keeptoo.KGradientPanel();
        kGradientPanel12 = new keeptoo.KGradientPanel();
        lblrack = new javax.swing.JLabel();
        lblRackcount = new javax.swing.JLabel();
        kGradientPanel5 = new keeptoo.KGradientPanel();
        lblsupplier = new javax.swing.JLabel();
        lblsupplierscount = new javax.swing.JLabel();
        kGradientPanel13 = new keeptoo.KGradientPanel();
        kGradientPanel14 = new keeptoo.KGradientPanel();
        kGradientPanel15 = new keeptoo.KGradientPanel();
        kGradientPanel16 = new keeptoo.KGradientPanel();
        kGradientPanel17 = new keeptoo.KGradientPanel();
        kGradientPanel18 = new keeptoo.KGradientPanel();
        kGradientPanel19 = new keeptoo.KGradientPanel();
        kGradientPanel20 = new keeptoo.KGradientPanel();
        lblItem = new javax.swing.JLabel();
        lblItemCount = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1000, 860));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setBackground(new java.awt.Color(51, 51, 51));
        kGradientPanel1.setkEndColor(new java.awt.Color(153, 153, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(51, 0, 51));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btndepartmentdetails.setFont(new java.awt.Font("Nirmala UI", 1, 13)); // NOI18N
        btndepartmentdetails.setText("fomd¾;fïka;= f;dr;=re");
        btndepartmentdetails.setBorder(null);
        btndepartmentdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndepartmentdetailsActionPerformed(evt);
            }
        });
        jPanel1.add(btndepartmentdetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 360, 50));

        kGradientPanel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 400, 70));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnrackdetails.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnrackdetails.setText("NdKav rdlal úia;r");
        btnrackdetails.setBorder(null);
        btnrackdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrackdetailsActionPerformed(evt);
            }
        });
        jPanel2.add(btnrackdetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 360, 50));

        kGradientPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 40, 400, 70));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnitemdetails1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnitemdetails1.setText("NdKav j, úia;r");
        btnitemdetails1.setBorder(null);
        btnitemdetails1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnitemdetails1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnitemdetails1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 360, 50));

        kGradientPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 140, 400, 70));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnsupplierdetails1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnsupplierdetails1.setText("iemhqï lrejkaf.a úia;r");
        btnsupplierdetails1.setBorder(null);
        btnsupplierdetails1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsupplierdetails1ActionPerformed(evt);
            }
        });
        jPanel4.add(btnsupplierdetails1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 360, 50));

        kGradientPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 400, 70));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnsubloc1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnsubloc1.setText("wf,úie,a j, úia;r");
        btnsubloc1.setToolTipText("");
        btnsubloc1.setBorder(null);
        btnsubloc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubloc1ActionPerformed(evt);
            }
        });
        jPanel5.add(btnsubloc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 360, 50));

        kGradientPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 400, 70));

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btncategorydetails.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btncategorydetails.setText("NdKav LdKav úia;r");
        btncategorydetails.setBorder(null);
        btncategorydetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncategorydetailsActionPerformed(evt);
            }
        });
        jPanel6.add(btncategorydetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 360, 50));

        kGradientPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 400, 70));

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnmembercards1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnmembercards1.setText("idudðl ldâm;a j¾.");
        btnmembercards1.setToolTipText("");
        btnmembercards1.setBorder(null);
        btnmembercards1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmembercards1ActionPerformed(evt);
            }
        });
        jPanel7.add(btnmembercards1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 450, 50));

        kGradientPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 490, 70));

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btncusname.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btncusname.setText("iudðl ldâm;a kï we;=,;a lsÍu");
        btncusname.setToolTipText("");
        btncusname.setBorder(null);
        btncusname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncusnameActionPerformed(evt);
            }
        });
        jPanel8.add(btncusname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 450, 50));

        kGradientPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 360, 490, 70));

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnItemAlertBin.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnItemAlertBin.setText("NdKav rdlal j, weiqreï úia;r");
        btnItemAlertBin.setBorder(null);
        btnItemAlertBin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnItemAlertBinActionPerformed(evt);
            }
        });
        jPanel9.add(btnItemAlertBin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 360, 50));

        kGradientPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 250, 400, 70));

        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnloancusdetails1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnloancusdetails1.setText("Kh .kqfokq lrejkaf.a úia;r");
        btnloancusdetails1.setToolTipText("");
        btnloancusdetails1.setBorder(null);
        btnloancusdetails1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloancusdetails1ActionPerformed(evt);
            }
        });
        jPanel10.add(btnloancusdetails1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 360, 50));

        kGradientPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, 400, 70));

        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnloandetails1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnloandetails1.setText("Kh j¾. j, úia;r");
        btnloandetails1.setToolTipText("");
        btnloandetails1.setBorder(null);
        btnloandetails1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloandetails1ActionPerformed(evt);
            }
        });
        jPanel11.add(btnloandetails1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 360, 50));

        kGradientPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 400, 70));

        kGradientPanel3.setkEndColor(new java.awt.Color(51, 255, 204));
        kGradientPanel3.setkStartColor(new java.awt.Color(204, 255, 255));
        kGradientPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbldepartmentdet.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbldepartmentdet.setText("s");
        kGradientPanel3.add(lbldepartmentdet, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 210, 50));

        lbldepartmentcount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbldepartmentcount.setText("fomd¾;fïka;= .Kk");
        kGradientPanel3.add(lbldepartmentcount, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 220, 50));

        kGradientPanel1.add(kGradientPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 600, 260, 180));

        kGradientPanel4.setkEndColor(new java.awt.Color(51, 255, 204));
        kGradientPanel4.setkStartColor(new java.awt.Color(204, 255, 255));
        kGradientPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel6.setkEndColor(new java.awt.Color(51, 255, 204));
        kGradientPanel6.setkStartColor(new java.awt.Color(204, 255, 255));
        kGradientPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        kGradientPanel4.add(kGradientPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 540, 260, 180));

        kGradientPanel7.setkEndColor(new java.awt.Color(51, 255, 204));
        kGradientPanel7.setkStartColor(new java.awt.Color(204, 255, 255));
        kGradientPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel8.setkEndColor(new java.awt.Color(51, 255, 204));
        kGradientPanel8.setkStartColor(new java.awt.Color(204, 255, 255));
        kGradientPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        kGradientPanel7.add(kGradientPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 540, 260, 180));

        kGradientPanel4.add(kGradientPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 540, 260, 180));

        kGradientPanel9.setkEndColor(new java.awt.Color(51, 255, 204));
        kGradientPanel9.setkStartColor(new java.awt.Color(204, 255, 255));
        kGradientPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel10.setkEndColor(new java.awt.Color(51, 255, 204));
        kGradientPanel10.setkStartColor(new java.awt.Color(204, 255, 255));
        kGradientPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        kGradientPanel9.add(kGradientPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 540, 260, 180));

        kGradientPanel11.setkEndColor(new java.awt.Color(51, 255, 204));
        kGradientPanel11.setkStartColor(new java.awt.Color(204, 255, 255));
        kGradientPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel12.setkEndColor(new java.awt.Color(51, 255, 204));
        kGradientPanel12.setkStartColor(new java.awt.Color(204, 255, 255));
        kGradientPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        kGradientPanel11.add(kGradientPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 540, 260, 180));

        kGradientPanel9.add(kGradientPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 540, 260, 180));

        kGradientPanel4.add(kGradientPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 540, 260, 180));

        lblrack.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblrack.setText("jLabel1");
        kGradientPanel4.add(lblrack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 200, 40));

        lblRackcount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblRackcount.setText("rdlal .Kk");
        kGradientPanel4.add(lblRackcount, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 210, 40));

        kGradientPanel1.add(kGradientPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 600, 260, 180));

        kGradientPanel5.setkEndColor(new java.awt.Color(51, 255, 204));
        kGradientPanel5.setkStartColor(new java.awt.Color(204, 255, 255));
        kGradientPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblsupplier.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblsupplier.setText("jLabel3");
        kGradientPanel5.add(lblsupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 200, 40));

        lblsupplierscount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblsupplierscount.setText("iemhqïlrejka .Kk");
        kGradientPanel5.add(lblsupplierscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 230, 40));

        kGradientPanel1.add(kGradientPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 600, 260, 180));

        kGradientPanel13.setkEndColor(new java.awt.Color(51, 255, 204));
        kGradientPanel13.setkStartColor(new java.awt.Color(204, 255, 255));
        kGradientPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel14.setkEndColor(new java.awt.Color(51, 255, 204));
        kGradientPanel14.setkStartColor(new java.awt.Color(204, 255, 255));
        kGradientPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        kGradientPanel13.add(kGradientPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 540, 260, 180));

        kGradientPanel15.setkEndColor(new java.awt.Color(51, 255, 204));
        kGradientPanel15.setkStartColor(new java.awt.Color(204, 255, 255));
        kGradientPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel16.setkEndColor(new java.awt.Color(51, 255, 204));
        kGradientPanel16.setkStartColor(new java.awt.Color(204, 255, 255));
        kGradientPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        kGradientPanel15.add(kGradientPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 540, 260, 180));

        kGradientPanel13.add(kGradientPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 540, 260, 180));

        kGradientPanel17.setkEndColor(new java.awt.Color(51, 255, 204));
        kGradientPanel17.setkStartColor(new java.awt.Color(204, 255, 255));
        kGradientPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel18.setkEndColor(new java.awt.Color(51, 255, 204));
        kGradientPanel18.setkStartColor(new java.awt.Color(204, 255, 255));
        kGradientPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        kGradientPanel17.add(kGradientPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 540, 260, 180));

        kGradientPanel19.setkEndColor(new java.awt.Color(51, 255, 204));
        kGradientPanel19.setkStartColor(new java.awt.Color(204, 255, 255));
        kGradientPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel20.setkEndColor(new java.awt.Color(51, 255, 204));
        kGradientPanel20.setkStartColor(new java.awt.Color(204, 255, 255));
        kGradientPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        kGradientPanel19.add(kGradientPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 540, 260, 180));

        kGradientPanel17.add(kGradientPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 540, 260, 180));

        kGradientPanel13.add(kGradientPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 540, 260, 180));

        lblItem.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblItem.setText("jLabel1");
        kGradientPanel13.add(lblItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 200, 40));

        lblItemCount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblItemCount.setText("NdKav .Kk");
        kGradientPanel13.add(lblItemCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 220, 40));

        kGradientPanel1.add(kGradientPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 600, 260, 180));

        jPanel12.setBackground(new java.awt.Color(0, 0, 0));
        kGradientPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 1460, 10));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Live Update Informations");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 510, 470, 40));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 870));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btndepartmentdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndepartmentdetailsActionPerformed
        try {    
           
            ManageUser user = new ManageUser();
            ResultSet rs = user.getUsersPrivilage("bi_dep", frontlogin.uid);

            while(rs.next()){
                String type = rs.getString("Type");
                int status = rs.getInt("bi_dep");

                if(status == 1){
                    DepartmentInformation dj = new DepartmentInformation(null,true);      
                    dj.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, type +" don't have permission to access this!", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
        
    }//GEN-LAST:event_btndepartmentdetailsActionPerformed

    private void btnItemAlertBinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItemAlertBinActionPerformed
        try {    
           
            ManageUser user = new ManageUser();
            ResultSet rs = user.getUsersPrivilage("bi_itemAlert", frontlogin.uid);

            while(rs.next()){
                String type = rs.getString("Type");
                int status = rs.getInt("bi_itemAlert");

                if(status == 1){
                    ItemAlerttoBinLocation alert = new ItemAlerttoBinLocation(null, true);
                    alert.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, type +" don't have permission to access this!", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
        
    }//GEN-LAST:event_btnItemAlertBinActionPerformed

    private void btncategorydetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncategorydetailsActionPerformed
        try {    
           
            ManageUser user = new ManageUser();
            ResultSet rs = user.getUsersPrivilage("bi_cat", frontlogin.uid);

            while(rs.next()){
                String type = rs.getString("Type");
                int status = rs.getInt("bi_cat");

                if(status == 1){
                    CategoryInfomation ca = new CategoryInfomation(null,true);
                    ca.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, type +" don't have permission to access this!", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
       
    }//GEN-LAST:event_btncategorydetailsActionPerformed

    private void btnrackdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrackdetailsActionPerformed
        try {    
           
            ManageUser user = new ManageUser();
            ResultSet rs = user.getUsersPrivilage("bi_binLoc", frontlogin.uid);

            while(rs.next()){
                String type = rs.getString("Type");
                int status = rs.getInt("bi_binLoc");

                if(status == 1){
                    BinInformation ca = new BinInformation(null,true);
                    ca.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, type +" don't have permission to access this!", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
        
    }//GEN-LAST:event_btnrackdetailsActionPerformed

    private void btnitemdetails1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnitemdetails1ActionPerformed
        try {    
           
            ManageUser user = new ManageUser();
            ResultSet rs = user.getUsersPrivilage("bi_item", frontlogin.uid);

            while(rs.next()){
                String type = rs.getString("Type");
                int status = rs.getInt("bi_item");

                if(status == 1){
                    ItemInformation IM = new ItemInformation(null,true);
                    IM.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, type +" don't have permission to access this!", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
        
    }//GEN-LAST:event_btnitemdetails1ActionPerformed

    private void btnloancusdetails1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloancusdetails1ActionPerformed
        try {    
           
            ManageUser user = new ManageUser();
            ResultSet rs = user.getUsersPrivilage("bi_cus", frontlogin.uid);

            while(rs.next()){
                String type = rs.getString("Type");
                int status = rs.getInt("bi_cus");

                if(status == 1){
                    creditCustomer Cm = new creditCustomer(null,true);
                    Cm.setVisible(true);  
                }else{
                    JOptionPane.showMessageDialog(null, type +" don't have permission to access this!", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
        
    }//GEN-LAST:event_btnloancusdetails1ActionPerformed

    private void btnsupplierdetails1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsupplierdetails1ActionPerformed
        try {    
           
            ManageUser user = new ManageUser();
            ResultSet rs = user.getUsersPrivilage("bi_sup", frontlogin.uid);

            while(rs.next()){
                String type = rs.getString("Type");
                int status = rs.getInt("bi_sup");

                if(status == 1){
                    Suppliers sup = new Suppliers(null,true);
                    sup.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, type +" don't have permission to access this!", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
        
        
    }//GEN-LAST:event_btnsupplierdetails1ActionPerformed

    private void btnsubloc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubloc1ActionPerformed
        try {    
           
            ManageUser user = new ManageUser();
            ResultSet rs = user.getUsersPrivilage("bi_store", frontlogin.uid);

            while(rs.next()){
                String type = rs.getString("Type");
                int status = rs.getInt("bi_store");

                if(status == 1){
                     StoresDetails StoresDetails1 = new StoresDetails(null,true);
                     StoresDetails1.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, type +" don't have permission to access this!", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
       
    }//GEN-LAST:event_btnsubloc1ActionPerformed

    private void btnloandetails1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloandetails1ActionPerformed
        try {    
           
            ManageUser user = new ManageUser();
            ResultSet rs = user.getUsersPrivilage("bi_credit", frontlogin.uid);

            while(rs.next()){
                String type = rs.getString("Type");
                int status = rs.getInt("bi_credit");

                if(status == 1){
                    credittypeInfor credittypeInfor1 = new credittypeInfor(null,true);
                    credittypeInfor1.setVisible(true); 
                }else{
                    JOptionPane.showMessageDialog(null, type +" don't have permission to access this!", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
        
    }//GEN-LAST:event_btnloandetails1ActionPerformed

    private void btncusnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncusnameActionPerformed
        try {    
           
            ManageUser user = new ManageUser();
            ResultSet rs = user.getUsersPrivilage("bi_loyMember", frontlogin.uid);

            while(rs.next()){
                String type = rs.getString("Type");
                int status = rs.getInt("bi_loyMember");

                if(status == 1){
                    LoyalityMemberInformation LoyalityMemberInformation1 = new LoyalityMemberInformation(null,true);
                    LoyalityMemberInformation1.setVisible(true);  
                }else{
                    JOptionPane.showMessageDialog(null, type +" don't have permission to access this!", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
        
       
    }//GEN-LAST:event_btncusnameActionPerformed

    private void btnmembercards1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmembercards1ActionPerformed
        try {    
           
            ManageUser user = new ManageUser();
            ResultSet rs = user.getUsersPrivilage("bi_loyCard", frontlogin.uid);

            while(rs.next()){
                String type = rs.getString("Type");
                int status = rs.getInt("bi_loyCard");

                if(status == 1){
                    LoyalityCards ca = new LoyalityCards(null,true);
                    ca.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, type +" don't have permission to access this!", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
    }//GEN-LAST:event_btnmembercards1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnItemAlertBin;
    private javax.swing.JButton btncategorydetails;
    private javax.swing.JButton btncusname;
    private javax.swing.JButton btndepartmentdetails;
    private javax.swing.JButton btnitemdetails1;
    private javax.swing.JButton btnloancusdetails1;
    private javax.swing.JButton btnloandetails1;
    private javax.swing.JButton btnmembercards1;
    private javax.swing.JButton btnrackdetails;
    private javax.swing.JButton btnsubloc1;
    private javax.swing.JButton btnsupplierdetails1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel10;
    private keeptoo.KGradientPanel kGradientPanel11;
    private keeptoo.KGradientPanel kGradientPanel12;
    private keeptoo.KGradientPanel kGradientPanel13;
    private keeptoo.KGradientPanel kGradientPanel14;
    private keeptoo.KGradientPanel kGradientPanel15;
    private keeptoo.KGradientPanel kGradientPanel16;
    private keeptoo.KGradientPanel kGradientPanel17;
    private keeptoo.KGradientPanel kGradientPanel18;
    private keeptoo.KGradientPanel kGradientPanel19;
    private keeptoo.KGradientPanel kGradientPanel20;
    private keeptoo.KGradientPanel kGradientPanel3;
    private keeptoo.KGradientPanel kGradientPanel4;
    private keeptoo.KGradientPanel kGradientPanel5;
    private keeptoo.KGradientPanel kGradientPanel6;
    private keeptoo.KGradientPanel kGradientPanel7;
    private keeptoo.KGradientPanel kGradientPanel8;
    private keeptoo.KGradientPanel kGradientPanel9;
    private javax.swing.JLabel lblItem;
    private javax.swing.JLabel lblItemCount;
    private javax.swing.JLabel lblRackcount;
    private javax.swing.JLabel lbldepartmentcount;
    private javax.swing.JLabel lbldepartmentdet;
    private javax.swing.JLabel lblrack;
    private javax.swing.JLabel lblsupplier;
    private javax.swing.JLabel lblsupplierscount;
    // End of variables declaration//GEN-END:variables
}
