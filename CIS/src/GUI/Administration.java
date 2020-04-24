/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Kernel.ActualPC;
import Kernel.AdminPC;
import Kernel.CampaignPC;
import Kernel.EstimatedPC;
import Kernel.LoginPC;
import Kernel.Validation;
import Kernel.dataPC;
import java.awt.Color;
import java.sql.Date;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;

/**
 *
 * @author Asus
 */
public class Administration extends javax.swing.JFrame {
int row=0;
boolean values;
boolean clickable = true;
Vector EmployeeDetails = AdminPC.readEmployee();
    /**
     * Creates new form Administration
     */
    public Administration() {
        initComponents();
        txt_EmpID.setEnabled(false);
        txt_EmpName.setEnabled(false);
        txt_Age.setEnabled(false);
        txt_Email.setEnabled(false);
        txt_Phone.setEnabled(false);
        txt_Pass.setEnabled(false);
        txt_repass.setEnabled(false);
        cmb_Type.setEnabled(false);
        if(!Login.admin){
           
            lb_Admin.setEnabled(false);
            lb_Camp.setEnabled(false);
            lb_Pro.setEnabled(false);
        }
        this.setTitle("CIS-Administration");
        this.setSize(800, 636);
        this.setResizable(false);
        fillTable();
        
    }
private void fillTable()
    {
        Vector title = new Vector();
        title.add("Employee ID");
        title.add("Type");
        title.add("Name");


        Vector admins = AdminPC.readEmployee();
      
      
      if(admins.size()>0)
        {
            tb_emp.setModel(new DefaultTableModel(admins, title));
            tb_emp.getColumnModel().getColumn(0).setPreferredWidth(70);
            tb_emp.getColumnModel().getColumn(1).setPreferredWidth(90);
            tb_emp.getColumnModel().getColumn(2).setPreferredWidth(90);
            tb_emp.setDragEnabled(false);
        }

    }
  private void readEmployeeDetail(String EmployeeID)
    {
        if( EmployeeDetails.size()>0)
        {
            for(int i=0; i< EmployeeDetails.size(); i++)
            {
                Vector temp=(Vector) EmployeeDetails.elementAt(i);
                if(EmployeeID.equals(temp.elementAt(0).toString()))
                {
                   
                    txt_EmpID.setText(temp.elementAt(0).toString());
                    cmb_Type.setSelectedItem(temp.elementAt(1).toString());
                    txt_EmpName.setText(temp.elementAt(2).toString());
                    txt_Age.setText(temp.elementAt(3).toString());
                    txt_Email.setText(temp.elementAt(4).toString());                    
                    txt_Phone.setText(temp.elementAt(5).toString());
                    txt_Pass.setText(temp.elementAt(6).toString());
                    break;
                }
            }
        }
    }
 private void setBlank()
    {
        Validation.setBlankField(new JTextComponent[] {txt_EmpID,txt_EmpName ,txt_Age,txt_Email,txt_Phone,txt_Pass,txt_repass});
    }
     private void refresh()
    {
        EmployeeDetails = AdminPC.readEmployee();
        cmb_Type.setSelectedIndex(0);
        cmb_Type.setEnabled(false);
        fillTable();
        setBlank();
        txt_EmpID.setEnabled(false);
        txt_EmpName.setEnabled(false);
        txt_Age.setEnabled(false);
        txt_Email.setEnabled(false);
        txt_Phone.setEnabled(false);
        txt_Pass.setEnabled(false);
        txt_repass.setEnabled(false);
        row=0;
        clickable = true;
        btn_create.setText("Create");
        btn_create.setEnabled(true);
        btn_Find.setEnabled(true);
        btn_update.setEnabled(true);
        btn_update.setText("Update");
        txt_search.setBackground(Color.white);
    }
        private Entity.Employee getAdmin()
    {
        Entity.Employee emp = new Entity.Employee();
        emp.setEmloyeeID(txt_EmpID.getText().trim());
        emp.setEmployeeType(values);
        emp.setEmployeeName(txt_EmpName.getText().trim());
        emp.setEmail(txt_Email.getText().trim());
        emp.setPhone(txt_Phone.getText().trim());
        emp.setAge(Integer.parseInt(txt_Age.getText().trim()));
        emp.setPassword(txt_Pass.getText().trim());
        return emp;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lb_Home = new javax.swing.JLabel();
        lb_Admin = new javax.swing.JLabel();
        lb_Pro = new javax.swing.JLabel();
        lb_Camp = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lb_Est = new javax.swing.JLabel();
        lb_Act = new javax.swing.JLabel();
        lb_Stt = new javax.swing.JLabel();
        lb_Acc = new javax.swing.JLabel();
        lb_SignOut = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_emp = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_EmpID = new javax.swing.JTextField();
        txt_EmpName = new javax.swing.JTextField();
        txt_Age = new javax.swing.JTextField();
        txt_Email = new javax.swing.JTextField();
        btn_create = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_refresh = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txt_Phone = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_Pass = new javax.swing.JPasswordField();
        cmb_Type = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        txt_repass = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btn_Find = new javax.swing.JButton();
        txt_search = new javax.swing.JTextField();
        rd_ID = new javax.swing.JRadioButton();
        rd_Name = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
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
        jPanel1.setFocusCycleRoot(true);
        jPanel1.setPreferredSize(new java.awt.Dimension(150, 580));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        lb_Admin.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lb_Admin.setForeground(new java.awt.Color(51, 153, 255));
        lb_Admin.setText("Administration");
        lb_Admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_AdminMouseClicked(evt);
            }
        });
        jPanel1.add(lb_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 114, -1));

        lb_Pro.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lb_Pro.setForeground(new java.awt.Color(51, 153, 255));
        lb_Pro.setText("Product Master");
        lb_Pro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_ProMouseClicked(evt);
            }
        });
        jPanel1.add(lb_Pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 114, -1));

        lb_Camp.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lb_Camp.setForeground(new java.awt.Color(51, 153, 255));
        lb_Camp.setText("Campaign Master");
        lb_Camp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_CampMouseClicked(evt);
            }
        });
        jPanel1.add(lb_Camp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 130, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 146, 10));

        lb_Est.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lb_Est.setForeground(new java.awt.Color(51, 153, 255));
        lb_Est.setText("Estimate Budget");
        lb_Est.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_EstMouseClicked(evt);
            }
        });
        jPanel1.add(lb_Est, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 120, -1));

        lb_Act.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lb_Act.setForeground(new java.awt.Color(51, 153, 255));
        lb_Act.setText("Actual Budget");
        lb_Act.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_ActMouseClicked(evt);
            }
        });
        jPanel1.add(lb_Act, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 106, -1));

        lb_Stt.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lb_Stt.setForeground(new java.awt.Color(51, 153, 255));
        lb_Stt.setText("Statistics");
        lb_Stt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_SttMouseClicked(evt);
            }
        });
        jPanel1.add(lb_Stt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 70, -1));

        lb_Acc.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lb_Acc.setForeground(new java.awt.Color(51, 153, 255));
        lb_Acc.setText("My Account");
        lb_Acc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_AccMouseClicked(evt);
            }
        });
        jPanel1.add(lb_Acc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 90, -1));

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
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 146, 10));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bgMenu.jpg"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 580));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administration");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tb_emp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Employee ID", "Type", "Name"
            }
        ));
        tb_emp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_empMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tb_emp);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, 450));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Employee ID:");

        jLabel3.setText("Employee Name:");

        jLabel7.setText("Age:");

        jLabel8.setText("Email:");

        btn_create.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnInsert.png"))); // NOI18N
        btn_create.setText("Create");
        btn_create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_createActionPerformed(evt);
            }
        });

        btn_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnUpdate.png"))); // NOI18N
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnDelete.png"))); // NOI18N
        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnRefresh.png"))); // NOI18N
        btn_refresh.setText("Refresh");
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });

        jLabel6.setText("Employee Tel:");

        jLabel10.setText("Employee Type:");

        jLabel4.setText("Password:");

        cmb_Type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Select>", "Admin", "Employee" }));
        cmb_Type.setToolTipText("");
        cmb_Type.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_TypeItemStateChanged(evt);
            }
        });

        jLabel9.setText("Pass Retype:");

        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("(*)");

        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("(*)");

        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("(*)");

        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText("(*)");

        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setText("(*)");

        jLabel17.setForeground(new java.awt.Color(255, 0, 0));
        jLabel17.setText("(*)");

        jLabel18.setForeground(new java.awt.Color(255, 0, 0));
        jLabel18.setText("(*)");

        jLabel19.setForeground(new java.awt.Color(255, 0, 0));
        jLabel19.setText("(*)");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmb_Type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Phone)
                    .addComponent(txt_EmpName, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt_EmpID, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_repass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                    .addComponent(txt_Pass, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(txt_Age, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel15))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(txt_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel16))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel12))))
                        .addGap(35, 35, 35))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_create)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_update)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_delete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_refresh)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cmb_Type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_EmpName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_EmpID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_repass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_create)
                    .addComponent(btn_delete)
                    .addComponent(btn_refresh)
                    .addComponent(btn_update))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 390, 450));

        btn_Find.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnSearch.png"))); // NOI18N
        btn_Find.setText("Find");
        btn_Find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FindActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Find, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, -1));
        getContentPane().add(txt_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 130, -1));

        rd_ID.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rd_ID);
        rd_ID.setSelected(true);
        rd_ID.setText("Employee ID");
        getContentPane().add(rd_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, -1, -1));

        rd_Name.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rd_Name);
        rd_Name.setText("Employee Name");
        getContentPane().add(rd_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bgTemplete.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 650, 580));

        jMenuBar1.setPreferredSize(new java.awt.Dimension(56, 20));

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

    private void tb_empMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_empMouseClicked
      if(clickable == true ){
          if (tb_emp.getSelectedRow() == -1) {
          new ShowMessageDialog(null, true, "Please choose a row",  ShowMessageDialog.MESSAGE);
           return;
       }
        row = tb_emp.getSelectedRow();
        readEmployeeDetail((String)tb_emp.getValueAt(row, 0));
      }
    }//GEN-LAST:event_tb_empMouseClicked

    private void btn_createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_createActionPerformed
        int cr_row = 0;
        if(evt.getActionCommand().equals("Create")){
            refresh();
            clickable = false;
            btn_create.setText("Save");
            //Deactivate buttons
            btn_delete.setEnabled(false);
            btn_Find.setEnabled(false);
            btn_refresh.setEnabled(true);
            btn_update.setEnabled(false);
            //Activate Edit for textbox and combobox and checkbox
            txt_EmpName.setEnabled(true);
            txt_EmpID.setEnabled(true);
            txt_EmpName.setEditable(true);
            txt_EmpID.setEditable(true);
            txt_Email.setEnabled(true);
            txt_Age.setEnabled(true);
            txt_Phone.setEnabled(true);
            txt_Pass.setEnabled(true);
            txt_repass.setEnabled(true);
            cmb_Type.setEnabled(true); 
            cmb_Type.setSelectedIndex(0);

        }
        if(evt.getActionCommand().equals("Save")){
            if(cmb_Type.getSelectedIndex()==0){
                Validation.showMess("EmpType must be defined");
                cmb_Type.requestFocus();
                return;
            }
            
            if(!Validation.validateComponents(new JTextComponent[]{txt_Phone,txt_EmpName,txt_Age,txt_Email,txt_EmpID,txt_Pass,txt_repass}))
        {
            return;
        }
            if(((txt_EmpName.getText().trim()).length()>50))
        {
            Validation.showMess("Employee Name is restricted to 50 characters");
            txt_EmpName.requestFocus();
            txt_EmpName.setBackground(new Color(255,153,153));
            return;
        }
             if(!Validation.isInt(txt_Phone.getText().trim())){
                Validation.showMess("Only numbers are allowed");
                txt_Phone.requestFocus();
                txt_Phone.setBackground(new Color(255,153,153));
                return;
            }else if(((txt_Phone.getText().trim()).length()<8)||((txt_Phone.getText().trim()).length()>15)){
                Validation.showMess("Phone numbers must be between 8 and 15 digits");
                txt_Phone.requestFocus();
                txt_Phone.setBackground(new Color(255,153,153));
                return;
            }
            else if(Long.parseLong(txt_Phone.getText().toString().trim())==0){
                Validation.showMess("Invalid Phone numbers");
                txt_Phone.requestFocus();
                txt_Phone.setBackground(new Color(255,153,153));
                return;
            }
            if(!Validation.isInt(txt_Age.getText().trim())){
                Validation.showMess("Only numbers are allowed");
                txt_Age.requestFocus();
                txt_Age.setBackground(new Color(255,153,153));
                return;
            }
            else if(((Integer.parseInt(txt_Age.getText().trim()))<18)||((Integer.parseInt(txt_Age.getText().trim()))>60)){
                Validation.showMess("Employee's Age must be in between of 18 and 60");
                txt_Age.requestFocus();
                txt_Age.setBackground(new Color(255,153,153));
                return;
            }if(((txt_Email.getText().trim()).length()>50))
        {
            Validation.showMess("Employee Email is restricted to 50 characters");
            txt_Email.requestFocus();
            txt_Email.setBackground(new Color(255,153,153));
            return;
        }
           else if(!Validation.isValidEmail(txt_Email.getText().trim()))
            {
                Validation.showMess("Invalid Email");
                txt_Email.requestFocus();
                txt_Email.setBackground(new Color(255,153,153));
                return;
            }
            if(((txt_EmpID.getText().trim()).length()>10))
        {
            Validation.showMess("Employee ID is restricted to 10 characters");
            txt_EmpID.requestFocus();
            txt_EmpID.setBackground(new Color(255,153,153));
            return;
        }
           else if(!Validation.checkContent(txt_EmpID.getText().trim())){
                Validation.showMess("Invalid Employee's ID");
                txt_EmpID.requestFocus();
                txt_EmpID.setBackground(new Color(255,153,153));
                return;
            }
           if(new String(txt_Pass.getPassword().toString().trim()).length()>40)
        {
            Validation.showMess("Employee Password is restricted to 40 characters");
            txt_Pass.requestFocus();
            txt_Pass.setBackground(new Color(255,153,153));
            return;
        } 
           else if(new String(txt_Pass.getPassword().toString().trim()).contains(" ")){
                Validation.showMess("Invalid Employee's Pass");
                txt_Pass.requestFocus();
                txt_Pass.setBackground(new Color(255,153,153));
                return;
            }
            
            if(!(new String(txt_repass.getPassword())).equals(new String(txt_Pass.getPassword()))){
            
            Validation.showMess("Password Confirmation is not matched");
            txt_repass.setBackground(new Color(255,153,153));
            txt_repass.requestFocus();
            return;
       }
    
       
        
        String mess=AdminPC.insertEmployee(getAdmin());
       new ShowMessageDialog(null, true, mess, ShowMessageDialog.MESSAGE);
        refresh();
        btn_create.setText("Create");
        clickable = true;
        //Deactivate buttons
            btn_delete.setEnabled(true);
            btn_Find.setEnabled(true);
            btn_refresh.setEnabled(true);
            btn_update.setEnabled(true);
            //Activate Edit for textbox and combobox and checkbox
            txt_EmpName.setEnabled(false);
            txt_EmpID.setEnabled(false);
            cmb_Type.setEnabled(false);
            txt_Email.setEnabled(false);
            txt_Age.setEnabled(false);
            txt_Phone.setEnabled(false);
            txt_Pass.setEnabled(false);
            txt_repass.setEnabled(false);
            cmb_Type.setSelectedIndex(0);
        }
    }//GEN-LAST:event_btn_createActionPerformed

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
  refresh();
  fillTable();
    }//GEN-LAST:event_btn_refreshActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
          if(evt.getActionCommand().equals("Update")){
              if (tb_emp.getSelectedRow() == -1) {
            new ShowMessageDialog(null, true, "Please choose a row",  ShowMessageDialog.MESSAGE);
            return;
            }else{                  
            clickable= false;
            btn_update.setText("Save");
            //Deactivate buttons
            btn_delete.setEnabled(false);
            btn_Find.setEnabled(false);
            btn_refresh.setEnabled(true);
            btn_create.setEnabled(false);
            txt_Pass.setEditable(false);
            txt_repass.setEditable(false);
            txt_EmpID.setEditable(false);
            //Activate Edit for textbox and combobox and checkbox
            
            txt_EmpName.setEnabled(true);
            txt_EmpName.setEditable(true);
            
            txt_EmpID.setEnabled(true);
            txt_Email.setEnabled(true);
            txt_Age.setEnabled(true);
            txt_Phone.setEnabled(true);
            txt_Pass.setEnabled(false);
            txt_repass.setEnabled(false);
            cmb_Type.setEnabled(true);    
        }
          }
        if(evt.getActionCommand().equals("Save")){
            if(!Validation.validateComponents(new JTextComponent[]{txt_EmpName,txt_Phone,txt_Email,}))
        {
            return;
        }if(((txt_EmpName.getText().trim()).length()>50))
        {
            Validation.showMess("Employee Name is restricted to 50 characters");
            txt_EmpName.requestFocus();
            txt_EmpName.setBackground(new Color(255,153,153));
            return;
        }
             if(!Validation.isInt(txt_Phone.getText().trim())){
                Validation.showMess("Only numbers are allowed");
                txt_Phone.requestFocus();
                txt_Phone.setBackground(new Color(255,153,153));
                return;
            }else if(((txt_Phone.getText().trim()).length()<8)||((txt_Phone.getText().trim()).length()>15)){
                Validation.showMess("Phone numbers must be between 8 and 15 digits");
                txt_Phone.requestFocus();
                txt_Phone.setBackground(new Color(255,153,153));
                return;
            }
            else if(Long.parseLong(txt_Phone.getText().toString().trim())==0){
                Validation.showMess("Invalid Phone numbers");
                txt_Phone.requestFocus();
                txt_Phone.setBackground(new Color(255,153,153));
                return;
            }
            if(!Validation.isInt(txt_Age.getText().trim())){
                Validation.showMess("Only numbers are allowed");
                txt_Age.requestFocus();
                txt_Age.setBackground(new Color(255,153,153));
                return;
            }
            else if(((Integer.parseInt(txt_Age.getText().trim()))<18)||((Integer.parseInt(txt_Age.getText().trim()))>60)){
                Validation.showMess("Employee's Age must be in between of 18 and 60");
                txt_Age.requestFocus();
                txt_Age.setBackground(new Color(255,153,153));
                return;
            }if(((txt_Email.getText().trim()).length()>50))
        {
            Validation.showMess("Employee Email is restricted to 50 characters");
            txt_Email.requestFocus();
            txt_Email.setBackground(new Color(255,153,153));
            return;
        }
           else if(!Validation.isValidEmail(txt_Email.getText().trim()))
            {
                Validation.showMess("Email invalid");
                txt_Email.requestFocus();
                txt_Email.setBackground(new Color(255,153,153));
                return;
            }
            if(((txt_EmpID.getText().trim()).length()>10))
        {
            Validation.showMess("Employee ID is restricted to 10 characters");
            txt_EmpID.requestFocus();
            txt_EmpID.setBackground(new Color(255,153,153));
            return;
        }
           else if(!Validation.checkContent(txt_EmpID.getText().trim())){
                Validation.showMess("Invalid Employee's ID");
                txt_EmpID.requestFocus();
                txt_EmpID.setBackground(new Color(255,153,153));
                return;
            }
                        
     
        String mess=AdminPC.updateEmployee(getAdmin());
        new ShowMessageDialog(null, true, mess, ShowMessageDialog.MESSAGE);
        refresh();
        btn_update.setText("Update");
        clickable = true;
        //Reactivate buttons
            btn_delete.setEnabled(true);
            btn_Find.setEnabled(true);
            btn_refresh.setEnabled(false);
            btn_create.setEnabled(true);
            //Detivate Edit for textbox and combobox and checkbox
           txt_Pass.setEditable(true);
           txt_repass.setEditable(true);
            
            txt_EmpName.setEnabled(false);
            txt_EmpID.setEnabled(false);
            txt_Email.setEnabled(false);
            txt_Age.setEnabled(false);
            txt_Phone.setEnabled(false);
            txt_Pass.setEnabled(false);
            txt_repass.setEnabled(false);
            cmb_Type.setEnabled(false); 
            cmb_Type.setSelectedIndex(0);
        
              }
          
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
            if(tb_emp.getSelectedRow()==-1)
        {
            new ShowMessageDialog(null, true,"Please chose a row",ShowMessageDialog.MESSAGE);
            return;
        }
        new ShowMessageDialog(null, true,"Do you want delete employee",ShowMessageDialog.CONFIRM);
        if(ShowMessageDialog.STATUS==ShowMessageDialog.OK)
        {
           String mess= AdminPC.deleteEmployee(txt_EmpID.getText());
           new ShowMessageDialog(null, true, mess, ShowMessageDialog.MESSAGE);
           refresh();
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_FindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FindActionPerformed
        int ByID=1;
        int ByName=2;
        Vector vt;
        if(Validation.isEmpty(txt_search.getText()))
        {
            Validation.showMess("Please enter any words to find");
            txt_search.requestFocus();
            txt_search.setBackground(new Color(255,153,153));
            return;
        }
        if(rd_ID.isSelected())
        {
            vt=AdminPC.FindEmployee(txt_search.getText(), ByID);
        }
        else
        {
            vt=AdminPC.FindEmployee(txt_search.getText(), ByName);
        }
        Vector tit=new Vector();
        tit.add("Employee ID");
        tit.add("Type");
        tit.add("Name");
        
        
        tb_emp.setModel(new DefaultTableModel(vt, tit));
        txt_search.setText("");
    }//GEN-LAST:event_btn_FindActionPerformed

    private void cmb_TypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_TypeItemStateChanged
        // TODO add your handling code here:
        if(cmb_Type.getSelectedIndex()==0){
            
        }else{
            String getValues=(String)cmb_Type.getSelectedItem();
            if("Admin".equals(getValues)){
                values = true;
            }
            else{
                values = false;
            }
        }
    }//GEN-LAST:event_cmb_TypeItemStateChanged

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

    private void lb_HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_HomeMouseClicked
        this.setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_lb_HomeMouseClicked

    private void lb_AdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_AdminMouseClicked
        if(lb_Admin.isEnabled()){
            this.setVisible(false);
            new Administration().setVisible(true);
        }
    }//GEN-LAST:event_lb_AdminMouseClicked

    private void lb_ProMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_ProMouseClicked
        if(lb_Pro.isEnabled()){
            this.setVisible(false);
            new ProductMaster().setVisible(true);
        }
    }//GEN-LAST:event_lb_ProMouseClicked

    private void lb_CampMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_CampMouseClicked
        if(lb_Camp.isEnabled())
        {
            this.setVisible(false);
            new CampaignMaster().setVisible(true);
        }
    }//GEN-LAST:event_lb_CampMouseClicked

    private void lb_EstMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_EstMouseClicked
        this.setVisible(false);
        new EstimateBudget().setVisible(true);
    }//GEN-LAST:event_lb_EstMouseClicked

    private void lb_ActMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_ActMouseClicked
        this.setVisible(false);
        new ActualBudget().setVisible(true);
    }//GEN-LAST:event_lb_ActMouseClicked

    private void lb_SttMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_SttMouseClicked
        this.setVisible(false);
        new Statistics().setVisible(true);
    }//GEN-LAST:event_lb_SttMouseClicked

    private void lb_AccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_AccMouseClicked
        new Account().setVisible(true);
    }//GEN-LAST:event_lb_AccMouseClicked

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Menu_Exit;
    private javax.swing.JMenuItem Menu_Home;
    private javax.swing.JButton btn_Find;
    private javax.swing.JButton btn_create;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JButton btn_update;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cmb_Type;
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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
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
    private javax.swing.JRadioButton rd_ID;
    private javax.swing.JRadioButton rd_Name;
    private javax.swing.JTable tb_emp;
    private javax.swing.JTextField txt_Age;
    private javax.swing.JTextField txt_Email;
    private javax.swing.JTextField txt_EmpID;
    private javax.swing.JTextField txt_EmpName;
    private javax.swing.JPasswordField txt_Pass;
    private javax.swing.JTextField txt_Phone;
    private javax.swing.JPasswordField txt_repass;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
