/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Kernel.ActualPC;
import Kernel.EstimatedPC;
import Kernel.Validation;
import java.awt.Color;
import java.sql.Date;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;

/**
 *
 * @author Asus
 */
public class ActualBudget extends javax.swing.JFrame {
    int row=0;
    boolean clickable =true;
    Vector CampaignDetails = ActualPC.getCampaignTable();
    
    /**
     * Creates new form ActualBudget
     */
    public ActualBudget() {
        initComponents();
        if(!Login.admin){
            lb_Admin.setEnabled(false);
            lb_Camp.setEnabled(false);
            lb_Pro.setEnabled(false);
        }
        this.setTitle("CIS-Actual Budget Master");
        this.setSize(810, 636);
        this.setResizable(false);
        refresh();
        fillTable();
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
        lb_SignOut = new javax.swing.JLabel();
        lb_Acc = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lb_Stt = new javax.swing.JLabel();
        lb_Act = new javax.swing.JLabel();
        lb_Est = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lb_Camp = new javax.swing.JLabel();
        lb_Pro = new javax.swing.JLabel();
        lb_Admin = new javax.swing.JLabel();
        lb_Home = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_campName = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt_CampDes = new javax.swing.JTextArea();
        lb_estVar = new javax.swing.JLabel();
        lb_estSale = new javax.swing.JLabel();
        lb_estBud = new javax.swing.JLabel();
        lb_per = new javax.swing.JLabel();
        lb_end = new javax.swing.JLabel();
        lb_start = new javax.swing.JLabel();
        lb_proid = new javax.swing.JLabel();
        lb_id = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_camp = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btn_save = new javax.swing.JButton();
        btn_rs = new javax.swing.JButton();
        btn_refresh = new javax.swing.JButton();
        txt_actBud = new javax.swing.JTextField();
        txt_actSale = new javax.swing.JTextField();
        txt_actVar = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Menu_Home = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        Menu_Exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(150, 580));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_SignOut.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lb_SignOut.setForeground(new java.awt.Color(51, 153, 255));
        lb_SignOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconLogout.png"))); // NOI18N
        lb_SignOut.setText("Sign Out");
        lb_SignOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_SignOutMouseClicked(evt);
            }
        });
        jPanel1.add(lb_SignOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 110, -1));

        lb_Acc.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lb_Acc.setForeground(new java.awt.Color(51, 153, 255));
        lb_Acc.setText("My Account");
        lb_Acc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_AccMouseClicked(evt);
            }
        });
        jPanel1.add(lb_Acc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 90, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 146, 10));

        lb_Stt.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lb_Stt.setForeground(new java.awt.Color(51, 153, 255));
        lb_Stt.setText("Statistics");
        lb_Stt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_SttMouseClicked(evt);
            }
        });
        jPanel1.add(lb_Stt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 70, -1));

        lb_Act.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lb_Act.setForeground(new java.awt.Color(51, 153, 255));
        lb_Act.setText("Actual Budget");
        lb_Act.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_ActMouseClicked(evt);
            }
        });
        jPanel1.add(lb_Act, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 106, -1));

        lb_Est.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lb_Est.setForeground(new java.awt.Color(51, 153, 255));
        lb_Est.setText("Estimate Budget");
        lb_Est.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_EstMouseClicked(evt);
            }
        });
        jPanel1.add(lb_Est, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 120, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 146, 10));

        lb_Camp.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lb_Camp.setForeground(new java.awt.Color(51, 153, 255));
        lb_Camp.setText("Campaign Master");
        lb_Camp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_CampMouseClicked(evt);
            }
        });
        jPanel1.add(lb_Camp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 130, -1));

        lb_Pro.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lb_Pro.setForeground(new java.awt.Color(51, 153, 255));
        lb_Pro.setText("Product Master");
        lb_Pro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_ProMouseClicked(evt);
            }
        });
        jPanel1.add(lb_Pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 114, -1));

        lb_Admin.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lb_Admin.setForeground(new java.awt.Color(51, 153, 255));
        lb_Admin.setText("Administration");
        lb_Admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_AdminMouseClicked(evt);
            }
        });
        jPanel1.add(lb_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 114, -1));

        lb_Home.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lb_Home.setForeground(new java.awt.Color(51, 153, 255));
        lb_Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconHome.png"))); // NOI18N
        lb_Home.setText("Home");
        lb_Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_HomeMouseClicked(evt);
            }
        });
        jPanel1.add(lb_Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 90, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bgMenu.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 580));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Actual Budget");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Details"));

        jLabel15.setText("Campaign Name:");

        txt_campName.setColumns(20);
        txt_campName.setRows(5);
        jScrollPane2.setViewportView(txt_campName);

        jLabel16.setText("Campaign ID:");

        jLabel17.setText("Product ID:");

        jLabel18.setText("Start Date:");

        jLabel19.setText("End Date: ");

        jLabel20.setText("Period:");

        jLabel21.setText("Estimated Budget:");

        jLabel22.setText("Estimated Sale:");

        jLabel23.setText("Estimated Variance:");

        jLabel24.setText("Description:");

        txt_CampDes.setColumns(20);
        txt_CampDes.setRows(5);
        jScrollPane3.setViewportView(txt_CampDes);

        lb_estVar.setText("jLabel1");

        lb_estSale.setText("jLabel2");

        lb_estBud.setText("jLabel3");

        lb_per.setText("jLabel4");

        lb_end.setText("jLabel5");

        lb_start.setText("jLabel6");

        lb_proid.setText("jLabel7");

        lb_id.setText("jLabel8");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel15))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(lb_id))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel17)
                        .addGap(16, 16, 16)
                        .addComponent(lb_proid))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel18)
                        .addGap(16, 16, 16)
                        .addComponent(lb_start))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addComponent(lb_end))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel20)
                        .addGap(18, 18, 18)
                        .addComponent(lb_per))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel21)
                        .addGap(18, 18, 18)
                        .addComponent(lb_estBud))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel22)
                        .addGap(18, 18, 18)
                        .addComponent(lb_estSale))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel23)
                        .addGap(18, 18, 18)
                        .addComponent(lb_estVar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel24)
                            .addGap(165, 165, 165))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(9, 9, 9)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_id)
                    .addComponent(jLabel16))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(lb_proid))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(lb_start))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_end)
                    .addComponent(jLabel19))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_per)
                    .addComponent(jLabel20))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_estBud)
                    .addComponent(jLabel21))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_estSale)
                    .addComponent(jLabel22))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_estVar)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel24)
                .addGap(9, 9, 9)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 260, 460));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Campaign List"));

        tb_camp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Campaign ID", "Campaign Name", "Actual Status"
            }
        ));
        tb_camp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_campMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_camp);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        jLabel11.setText("Actual Budget:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, -1, -1));

        jLabel12.setText("Actual Sale:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, -1, -1));

        jLabel13.setText("Actual Variance:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, -1, -1));

        btn_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnUpdate.png"))); // NOI18N
        btn_save.setText("Update Actual Data");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        getContentPane().add(btn_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 510, 164, -1));

        btn_rs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnReset.png"))); // NOI18N
        btn_rs.setText("Reset");
        btn_rs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rsActionPerformed(evt);
            }
        });
        getContentPane().add(btn_rs, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, -1, -1));

        btn_refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnRefresh.png"))); // NOI18N
        btn_refresh.setText("Refresh");
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });
        getContentPane().add(btn_refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 510, -1, -1));
        getContentPane().add(txt_actBud, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 110, -1));

        txt_actSale.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_actSaleFocusLost(evt);
            }
        });
        getContentPane().add(txt_actSale, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 110, -1));
        getContentPane().add(txt_actVar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, 110, -1));

        jLabel14.setText("(%)");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 470, -1, -1));

        jLabel31.setText("$");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, -1, -1));

        jLabel32.setText("$");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, -1, -1));

        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("(*)");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("(*)");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bgTemplete.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 650, 580));

        jMenuBar1.setPreferredSize(new java.awt.Dimension(72, 20));

        jMenu1.setText("Menu");

        Menu_Home.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        Menu_Home.setText("Home");
        Menu_Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_HomeMouseClicked(evt);
            }
        });
        Menu_Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_HomeActionPerformed(evt);
            }
        });
        jMenu1.add(Menu_Home);
        jMenu1.add(jSeparator3);

        Menu_Exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        Menu_Exit.setText("Exit");
        Menu_Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_ExitMouseClicked(evt);
            }
        });
        Menu_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_ExitActionPerformed(evt);
            }
        });
        jMenu1.add(Menu_Exit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");

        jMenuItem1.setText("User Guide is temporarily not available");
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setBlank()
    {
        Validation.setBlankField(new JTextComponent[] {txt_actBud, txt_actSale,txt_actVar});
    }
    
    private void refresh()
    {
        CampaignDetails = ActualPC.getCampaignTable();
        txt_campName.setText(null);
        txt_CampDes.setText(null);
        lb_id.setText(null);
        lb_proid.setText(null);
        lb_start.setText(null);
        lb_end.setText(null);
        lb_per.setText(null);
        lb_estBud.setText(null);
        lb_estSale.setText(null);
        lb_estVar.setText(null);
        
        txt_CampDes.setEnabled(false);
        txt_campName.setEnabled(false);
        txt_actVar.setEnabled(false);
        txt_actBud.setText(null);
        txt_actBud.setEnabled(false);
        txt_actSale.setText(null);
        txt_actSale.setEnabled(false);
        btn_rs.setEnabled(false);
        btn_save.setText("Update Actual Data");
        clickable = true;
        row = 0;
        fillTable();
        setBlank();
    }
    
      private Entity.Campaign getCampaign()
    {
        Entity.Campaign camp = new Entity.Campaign();
                     
        camp.setCampaignID(Integer.parseInt(lb_id.getText().trim()));
        camp.setActualBudget(Float.parseFloat(txt_actBud.getText().trim()));
        camp.setActualSales(Float.parseFloat(txt_actSale.getText().trim()));        
        camp.setActualVariance(CAL());
        camp.setDescription(txt_CampDes.getText().trim());
        return camp;
    }
    
      private Float CAL(){
          Float estSaleCAL = Float.parseFloat(lb_estSale.getText().trim());
          Float actSaleCAL = Float.parseFloat(txt_actSale.getText());
          Float VAR = Validation.round(((actSaleCAL-estSaleCAL)/(estSaleCAL)), 1);
          return VAR;
      }
      
    private boolean validateData()
    {
         if(Validation.isEmpty(txt_actBud.getText().trim())){
                Validation.showMess("Empty value is not allowed");
                txt_actBud.requestFocus();
                txt_actBud.setBackground(new Color(255,153,153));
                return false;
            }
         else if(!Validation.isFloat(txt_actBud.getText().trim())){
                Validation.showMess("Only Float value is accepted");
                txt_actBud.requestFocus();
                txt_actBud.setBackground(new Color(255,153,153));
                return false;
            }
         else if((Float.parseFloat(txt_actBud.getText().trim())<0)){
                Validation.showMess("Only Positive value is accepted");
                txt_actBud.requestFocus();
                txt_actBud.setBackground(new Color(255,153,153));
                return false;
        }
         else if((Float.parseFloat(txt_actBud.getText().trim())>100000)||(Float.parseFloat(txt_actBud.getText().trim())==0)){
            
            Validation.showMess("Value must be in between of 0 and 100000");
            txt_actBud.setBackground(new Color(255,153,153));
            txt_actBud.requestFocus();
            return false;
        }
        if(Validation.isEmpty(txt_actSale.getText().trim())){
                Validation.showMess("Empty value is not allowed");
                txt_actSale.requestFocus();
                txt_actSale.setBackground(new Color(255,153,153));
                return false;
            }
       else if(!Validation.isFloat(txt_actSale.getText().trim())){
                Validation.showMess("Only Float value is accepted");
                txt_actSale.requestFocus();
                txt_actSale.setBackground(new Color(255,153,153));
                return false;
            }
       else if((Float.parseFloat(txt_actSale.getText().trim())<0)){
                Validation.showMess("Only Positive value is accepted");
                txt_actSale.requestFocus();
                txt_actSale.setBackground(new Color(255,153,153));
                return false;
        }
       else  if((Float.parseFloat(txt_actSale.getText().trim())>100000)||(Float.parseFloat(txt_actBud.getText().trim())==0)){
            
            Validation.showMess("Value must be in between of 0 and 100000");
            txt_actSale.setBackground(new Color(255,153,153));
            txt_actSale.requestFocus();
            return false;
        }
                
        return true;
    }
    
    private void reset(){       
        txt_actBud.setText(null);
        txt_actSale.setText(null);
        txt_actVar.setText(null);
        txt_actBud.requestFocus();
    }
    
    private void fillTable()
    {
        Vector title = new Vector();
        title.add("Campaign ID");
        title.add("Campaign Name");
        title.add("Actual Status");


        Vector campaigns = ActualPC.readCampaign();
        if(campaigns.size()>0)
        {
            tb_camp.setModel(new DefaultTableModel(campaigns, title));
            tb_camp.getColumnModel().getColumn(0).setPreferredWidth(70);
            tb_camp.getColumnModel().getColumn(1).setPreferredWidth(90);
            tb_camp.getColumnModel().getColumn(2).setPreferredWidth(90);
            tb_camp.setDragEnabled(false);
        }

    }
    
     private void readCampaignDetail(String CampaignID)
    {
        if(CampaignDetails.size()>0)
        {
            for(int i=0; i<CampaignDetails.size(); i++)
            {
                Vector temp=(Vector)CampaignDetails.elementAt(i);
                if(CampaignID.equals(temp.elementAt(0).toString()))
                {
                    lb_id.setText(temp.elementAt(0).toString());
                    txt_campName.setText(temp.elementAt(1).toString());
                    lb_proid.setText(temp.elementAt(2).toString());                   
                    lb_start.setText(Validation.convertDateToString((Date)temp.elementAt(4)));
                    lb_end.setText(Validation.convertDateToString((Date)temp.elementAt(5)));
                    lb_per.setText(temp.elementAt(6).toString()+" day(s)");
                                       
                    lb_estBud.setText(temp.elementAt(9).toString());
                    lb_estSale.setText(temp.elementAt(11).toString());
                    lb_estVar.setText(temp.elementAt(13).toString());
                    txt_CampDes.setText(temp.elementAt(16).toString());
                    
                    txt_actBud.setText(temp.elementAt(10).toString());
                    txt_actSale.setText(temp.elementAt(12).toString());
                    txt_actVar.setText(temp.elementAt(14).toString());
                    
                    break;
                }
            }
        }
    }
    private void tb_campMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_campMouseClicked
         if(clickable == true){
        if (tb_camp.getSelectedRow() == -1) {
            new ShowMessageDialog(null, true, "Please choose a row",  ShowMessageDialog.MESSAGE);
            return;
        }
        row = tb_camp.getSelectedRow();
        readCampaignDetail((String)tb_camp.getValueAt(row, 0));
         }
        if(!(lb_estBud.getText().trim().equals("0.0"))&&!(lb_estSale.getText().trim().equals("0.0"))&&!(lb_estVar.getText().trim().equals("0.0")))
        {
            btn_save.setEnabled(true);
        }else{
            btn_save.setEnabled(false);
        }           
    }//GEN-LAST:event_tb_campMouseClicked

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
         if(evt.getActionCommand().equals("Update Actual Data")){
            if (tb_camp.getSelectedRow() == -1) {
            new ShowMessageDialog(null, true, "Please choose a row",  ShowMessageDialog.MESSAGE);
            return;
            }else{
            clickable = false;    
            btn_save.setText("Save Actual Data");
            txt_actBud.setEnabled(true);
            txt_actSale.setEnabled(true);
            btn_rs.setEnabled(true);
            btn_refresh.setEnabled(true);
            txt_actBud.requestFocus();
            }
        }else if(evt.getActionCommand().equals("Save Actual Data")){
                
            if(!validateData()) {
                return;
            }
             
            String mess = ActualPC.updateCampaign(this.getCampaign());
            new ShowMessageDialog(null, true, mess, ShowMessageDialog.MESSAGE);
            btn_save.setText("Update Actual Data");
            clickable = true;
            btn_refresh.setEnabled(false);
            reset();
            refresh();
        }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void txt_actSaleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_actSaleFocusLost
        if( ! validateData()) {
                return;
            }
        txt_actVar.setText(String.valueOf(CAL()));
    }//GEN-LAST:event_txt_actSaleFocusLost

    private void btn_rsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rsActionPerformed
        reset();
    }//GEN-LAST:event_btn_rsActionPerformed

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        refresh();
    }//GEN-LAST:event_btn_refreshActionPerformed

    private void Menu_HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_HomeMouseClicked

    }//GEN-LAST:event_Menu_HomeMouseClicked

    private void Menu_HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_HomeActionPerformed
        this.setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_Menu_HomeActionPerformed

    private void Menu_ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_ExitMouseClicked

    }//GEN-LAST:event_Menu_ExitMouseClicked

    private void Menu_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_ExitActionPerformed
        new ShowMessageDialog(this, true, "Do you want to exit the program ?",ShowMessageDialog.CONFIRM);
        if(ShowMessageDialog.STATUS==ShowMessageDialog.OK)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_Menu_ExitActionPerformed

    private void lb_SignOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_SignOutMouseClicked
        new ShowMessageDialog(this, true, "Loging Out ?",ShowMessageDialog.CONFIRM);
        if(ShowMessageDialog.STATUS==ShowMessageDialog.OK)
        {
            this.setVisible(false);
            new Login().setVisible(true);
            Login.status =false;
            Login.admin = false;
            Login.config = true;
        }
    }//GEN-LAST:event_lb_SignOutMouseClicked

    private void lb_AccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_AccMouseClicked
        new Account().setVisible(true);
    }//GEN-LAST:event_lb_AccMouseClicked

    private void lb_SttMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_SttMouseClicked
        this.setVisible(false);
        new Statistics().setVisible(true);
    }//GEN-LAST:event_lb_SttMouseClicked

    private void lb_ActMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_ActMouseClicked
        this.setVisible(false);
        new ActualBudget().setVisible(true);
    }//GEN-LAST:event_lb_ActMouseClicked

    private void lb_EstMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_EstMouseClicked
        this.setVisible(false);
        new EstimateBudget().setVisible(true);
    }//GEN-LAST:event_lb_EstMouseClicked

    private void lb_CampMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_CampMouseClicked
        if(lb_Camp.isEnabled())
        {
            this.setVisible(false);
            new CampaignMaster().setVisible(true);
        }
    }//GEN-LAST:event_lb_CampMouseClicked

    private void lb_ProMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_ProMouseClicked
        if(lb_Pro.isEnabled()){
            this.setVisible(false);
            new ProductMaster().setVisible(true);
        }
    }//GEN-LAST:event_lb_ProMouseClicked

    private void lb_AdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_AdminMouseClicked
        if(lb_Admin.isEnabled()){
            this.setVisible(false);
            new Administration().setVisible(true);
        }
    }//GEN-LAST:event_lb_AdminMouseClicked

    private void lb_HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_HomeMouseClicked
        this.setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_lb_HomeMouseClicked
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Menu_Exit;
    private javax.swing.JMenuItem Menu_Home;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JButton btn_rs;
    private javax.swing.JButton btn_save;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JLabel lb_Acc;
    private javax.swing.JLabel lb_Act;
    private javax.swing.JLabel lb_Admin;
    private javax.swing.JLabel lb_Camp;
    private javax.swing.JLabel lb_Est;
    private javax.swing.JLabel lb_Home;
    private javax.swing.JLabel lb_Pro;
    private javax.swing.JLabel lb_SignOut;
    private javax.swing.JLabel lb_Stt;
    private javax.swing.JLabel lb_end;
    private javax.swing.JLabel lb_estBud;
    private javax.swing.JLabel lb_estSale;
    private javax.swing.JLabel lb_estVar;
    private javax.swing.JLabel lb_id;
    private javax.swing.JLabel lb_per;
    private javax.swing.JLabel lb_proid;
    private javax.swing.JLabel lb_start;
    private javax.swing.JTable tb_camp;
    private javax.swing.JTextArea txt_CampDes;
    private javax.swing.JTextField txt_actBud;
    private javax.swing.JTextField txt_actSale;
    private javax.swing.JTextField txt_actVar;
    private javax.swing.JTextArea txt_campName;
    // End of variables declaration//GEN-END:variables
}