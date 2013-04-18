package com.bluebee.ui.widget;

import com.bluebee.moudle.MoudleContentFactry;
import com.bluebee.moudle.UserMoudle;
import com.bluebee.moudle.UserRightMoudle;
import com.bluebee.pojo.User;
import com.bluebee.pojo.UserRight;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dialog.ModalityType;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class AuthorityDialog extends JDialog
{
  private static AuthorityDialog authorityPanel;
  private boolean isDefaultPage = false;
  private JTextField textField;
  private JPasswordField passwordField;
  private JCheckBox xiaohelper;
  private JCheckBox flow;
  private JCheckBox guketh;
  private JCheckBox caigjh;
  private JCheckBox caigth;
  private JCheckBox riczc;
  private JCheckBox gudzc;
  private JCheckBox guctj;
  private JCheckBox zhictj;
  private JCheckBox yingyeetj;
  private JCheckBox xiaoshph;
  private JLabel label_8;
  private JLabel label_9;
  private JCheckBox xtsz;
  private JCheckBox quanx;
  private JCheckBox leixsz;
  private JButton button_1;
  private JButton button_2;
  private JTable tablex;
  private JCheckBox kehugmtj;
  private JCheckBox kehzl;
  private JCheckBox gyszl;
  private JCheckBox rcsr;

  public AuthorityDialog(Component owner, String tilte, String id, String name, String ps, JTable table)
  {
    setResizable(false);
    setTitle(tilte);
    setSize(new Dimension(543, 507));
    setLocationRelativeTo(owner);
    setModalityType(JDialog.ModalityType.APPLICATION_MODAL);
    setDefaultCloseOperation(2);
    String username = name;
    this.tablex = table;

    getContentPane().setLayout(new BorderLayout(0, 0));
    JPanel panel_4 = new JPanel();
    getContentPane().add(panel_4, "North");
    panel_4.setPreferredSize(new Dimension(250, 100));
    panel_4.setBorder(new TitledBorder(null, "�û�����", 4, 2, null, null));
    panel_4.setLayout(null);

    JLabel label_4 = new JLabel("�û���");
    label_4.setBounds(26, 57, 54, 15);
    panel_4.add(label_4);

    JLabel label = new JLabel("����");
    label.setBounds(247, 57, 54, 15);
    panel_4.add(label);

    this.textField = new JTextField();
    if (username != null) {
      this.textField.setEditable(false);
      this.textField.setText(username);
    }
    this.textField.setBounds(72, 57, 142, 21);
    panel_4.add(this.textField);
    this.textField.setColumns(10);

    this.passwordField = new JPasswordField();
    if (username != null) {
      this.passwordField.setText(ps);
    }
    this.passwordField.setBounds(290, 57, 142, 21);
    panel_4.add(this.passwordField);

    this.label_8 = new JLabel("");
    this.label_8.setForeground(Color.RED);
    this.label_8.setBounds(25, 26, 473, 21);
    panel_4.add(this.label_8);

    JPanel panel_3 = new JPanel();
    panel_3.setBorder(new TitledBorder(null, "����Ȩ��", 4, 2, null, null));
    getContentPane().add(panel_3, "Center");
    panel_3.setLayout(null);

    JLabel label_2 = new JLabel("����");
    label_2.setBounds(42, 26, 54, 15);
    panel_3.add(label_2);

    this.xiaohelper = new JCheckBox("���۰���");
    this.xiaohelper.setBounds(42, 47, 103, 23);
    panel_3.add(this.xiaohelper);

    this.flow = new JCheckBox("ÿ����ˮ��");
    this.flow.setBounds(163, 47, 103, 23);
    panel_3.add(this.flow);

    this.guketh = new JCheckBox("�˿��˻�");
    this.guketh.setBounds(268, 47, 103, 23);
    panel_3.add(this.guketh);

    JLabel label_3 = new JLabel("����");
    label_3.setBounds(42, 77, 54, 15);
    panel_3.add(label_3);

    this.caigjh = new JCheckBox("�ɹ�����");
    this.caigjh.setBounds(42, 98, 103, 23);
    panel_3.add(this.caigjh);

    this.caigth = new JCheckBox("�ɹ��˻�");
    this.caigth.setBounds(163, 98, 103, 23);
    panel_3.add(this.caigth);

    JLabel label_5 = new JLabel("֧��");
    label_5.setBounds(42, 123, 54, 15);
    panel_3.add(label_5);
    this.riczc = new JCheckBox("�ճ�֧��");
    this.riczc.setBounds(42, 145, 103, 23);
    panel_3.add(this.riczc);

    this.gudzc = new JCheckBox("�̶�֧��");
    this.gudzc.setBounds(163, 145, 103, 23);
    panel_3.add(this.gudzc);

    JLabel label_6 = new JLabel("ͳ��");
    label_6.setBounds(42, 174, 54, 15);
    panel_3.add(label_6);

    this.guctj = new JCheckBox("���ͳ��");
    this.guctj.setBounds(42, 195, 103, 23);
    panel_3.add(this.guctj);

    this.zhictj = new JCheckBox("��֧ͳ��");
    this.zhictj.setBounds(163, 195, 103, 23);
    panel_3.add(this.zhictj);

    this.yingyeetj = new JCheckBox("Ӫҵ��ͳ��");
    this.yingyeetj.setBounds(268, 195, 103, 23);
    panel_3.add(this.yingyeetj);

    this.xiaoshph = new JCheckBox("��������ͳ��");
    this.xiaoshph.setBounds(384, 195, 103, 23);
    panel_3.add(this.xiaoshph);

    this.label_9 = new JLabel("����");
    this.label_9.setBounds(42, 253, 54, 15);
    panel_3.add(this.label_9);

    this.xtsz = new JCheckBox("ϵͳ����");
    this.xtsz.setBounds(42, 274, 103, 23);
    panel_3.add(this.xtsz);

    this.quanx = new JCheckBox("�û�Ȩ��");
    this.quanx.setBounds(163, 274, 103, 23);
    panel_3.add(this.quanx);

    this.leixsz = new JCheckBox("��������");
    this.leixsz.setBounds(268, 274, 103, 23);
    panel_3.add(this.leixsz);

    this.button_1 = new JButton("����");
    this.button_1.addMouseListener(new MouseAdapter()
    {
      public void mouseClicked(MouseEvent e) {
        AuthorityDialog.this.subbmmit();
      }
    });
    this.button_1.setBounds(150, 318, 93, 33);
    panel_3.add(this.button_1);

    this.button_2 = new JButton("ȡ��");
    this.button_2.addMouseListener(new MouseAdapter()
    {
      public void mouseClicked(MouseEvent e) {
        AuthorityDialog.this.dispose();
      }
    });
    this.button_2.setBounds(285, 318, 93, 33);
    panel_3.add(this.button_2);

    this.kehugmtj = new JCheckBox("�ͻ�����ͳ��");
    this.kehugmtj.setBounds(42, 222, 115, 25);
    panel_3.add(this.kehugmtj);

    this.kehzl = new JCheckBox("�ͻ�����");
    this.kehzl.setBounds(384, 47, 103, 23);
    panel_3.add(this.kehzl);

    this.gyszl = new JCheckBox("��Ӧ������");
    this.gyszl.setBounds(268, 98, 103, 23);
    panel_3.add(this.gyszl);

    this.rcsr = new JCheckBox("�ճ�����");
    this.rcsr.setBounds(268, 145, 103, 23);
    panel_3.add(this.rcsr);

    if ("����Ա".equals(username)) {
      seletAll();
      seletAllEnabled(false);
    }
    else if (id != null) {
      UserRightMoudle userRightMoudle = MoudleContentFactry.getUserRightMoudle();
      UserRight userRight = userRightMoudle.get(id);
      if (userRight != null)
        seletAll(userRight.getRight());
    }
  }

  private void seletAll(String right)
  {
    if (right != null) {
      String[] aa = right.split(",");
      this.xiaohelper.setSelected(aa[0].equals("true"));
      this.flow.setSelected(aa[1].equals("true"));
      this.guketh.setSelected(aa[2].equals("true"));
      this.caigjh.setSelected(aa[3].equals("true"));
      this.caigth.setSelected(aa[4].equals("true"));
      this.riczc.setSelected(aa[5].equals("true"));
      this.gudzc.setSelected(aa[6].equals("true"));
      this.guctj.setSelected(aa[7].equals("true"));
      this.zhictj.setSelected(aa[8].equals("true"));
      this.yingyeetj.setSelected(aa[9].equals("true"));
      this.xiaoshph.setSelected(aa[10].equals("true"));
      this.kehzl.setSelected(aa[11].equals("true"));
      this.xtsz.setSelected(aa[12].equals("true"));
      this.quanx.setSelected(aa[13].equals("true"));
      this.leixsz.setSelected(aa[14].equals("true"));
      if (aa.length == 16) {
        this.gyszl.setSelected(aa[15].equals("true"));
      }
      if (aa.length == 17) {
        this.rcsr.setSelected(aa[16].equals("true"));
      }
      if (aa.length == 18)
        this.kehugmtj.setSelected(aa[17].equals("true"));
    }
  }

  private void seletAll()
  {
    this.xiaohelper.setSelected(true);
    this.flow.setSelected(true);
    this.guketh.setSelected(true);
    this.caigjh.setSelected(true);
    this.caigth.setSelected(true);
    this.riczc.setSelected(true);
    this.gudzc.setSelected(true);
    this.guctj.setSelected(true);
    this.zhictj.setSelected(true);
    this.yingyeetj.setSelected(true);
    this.xiaoshph.setSelected(true);
    this.kehzl.setSelected(true);
    this.xtsz.setSelected(true);
    this.quanx.setSelected(true);
    this.gyszl.setEnabled(true);
    this.rcsr.setEnabled(true);
    this.kehugmtj.setEnabled(true);
  }

  private boolean isSelect() {
    boolean iss = false;
    if ((this.xiaohelper.isSelected()) || 
      (this.flow.isSelected()) || 
      (this.guketh.isSelected()) || 
      (this.caigjh.isSelected()) || 
      (this.caigth.isSelected()) || 
      (this.riczc.isSelected()) || 
      (this.gudzc.isSelected()) || 
      (this.guctj.isSelected()) || 
      (this.zhictj.isSelected()) || 
      (this.yingyeetj.isSelected()) || 
      (this.xiaoshph.isSelected()) || 
      (this.kehzl.isSelected()) || 
      (this.xtsz.isSelected()) || 
      (this.quanx.isSelected()) || 
      (this.leixsz.isSelected()) || 
      (this.kehugmtj.isSelected()) || 
      (this.gyszl.isSelected()) || 
      (this.rcsr.isSelected()))
    {
      iss = true;
    }

    return iss;
  }

  private void seletAllEnabled(boolean isEnabled) {
    this.xiaohelper.setEnabled(isEnabled);
    this.flow.setEnabled(isEnabled);
    this.guketh.setEnabled(isEnabled);
    this.caigjh.setEnabled(isEnabled);
    this.caigth.setEnabled(isEnabled);
    this.riczc.setEnabled(isEnabled);
    this.gudzc.setEnabled(isEnabled);
    this.guctj.setEnabled(isEnabled);
    this.zhictj.setEnabled(isEnabled);
    this.yingyeetj.setEnabled(isEnabled);
    this.xiaoshph.setEnabled(isEnabled);
    this.kehzl.setEnabled(isEnabled);
    this.xtsz.setEnabled(isEnabled);
    this.quanx.setEnabled(isEnabled);
    this.leixsz.setEnabled(isEnabled);
    this.gyszl.setEnabled(true);
    this.rcsr.setEnabled(true);
    this.kehugmtj.setEnabled(true);
  }

  public void subbmmit() {
    String username = this.textField.getText();
    if (username.trim().length() == 0) {
      this.label_8.setText("�������û�����");
      return;
    }
    if (!isSelect()) {
      this.label_8.setText("�������û�����Ȩ��");
      return;
    }
    String pas = String.valueOf(this.passwordField.getPassword());
    UserMoudle userMoudle = MoudleContentFactry.getUserMoudle();
    UserRightMoudle rightMoudle = MoudleContentFactry.getUserRightMoudle();
    User userold = userMoudle.getUserByName(username);
    UserRight userRight = new UserRight();
    StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(String.valueOf(this.xiaohelper.isSelected()));
    stringBuffer.append(",");
    stringBuffer.append(String.valueOf(this.flow.isSelected()));
    stringBuffer.append(",");
    stringBuffer.append(String.valueOf(this.guketh.isSelected()));
    stringBuffer.append(",");
    stringBuffer.append(String.valueOf(this.caigjh.isSelected()));
    stringBuffer.append(",");
    stringBuffer.append(String.valueOf(this.caigth.isSelected()));
    stringBuffer.append(",");
    stringBuffer.append(String.valueOf(this.riczc.isSelected()));
    stringBuffer.append(",");
    stringBuffer.append(String.valueOf(this.gudzc.isSelected()));
    stringBuffer.append(",");
    stringBuffer.append(String.valueOf(this.guctj.isSelected()));
    stringBuffer.append(",");
    stringBuffer.append(String.valueOf(this.zhictj.isSelected()));
    stringBuffer.append(",");
    stringBuffer.append(String.valueOf(this.yingyeetj.isSelected()));
    stringBuffer.append(",");
    stringBuffer.append(String.valueOf(this.xiaoshph.isSelected()));
    stringBuffer.append(",");
    stringBuffer.append(String.valueOf(this.kehzl.isSelected()));
    stringBuffer.append(",");
    stringBuffer.append(String.valueOf(this.xtsz.isSelected()));
    stringBuffer.append(",");
    stringBuffer.append(String.valueOf(this.quanx.isSelected()));
    stringBuffer.append(",");
    stringBuffer.append(String.valueOf(this.leixsz.isSelected()));
    stringBuffer.append(",");
    stringBuffer.append(String.valueOf(this.gyszl.isSelected()));
    stringBuffer.append(",");
    stringBuffer.append(String.valueOf(this.rcsr.isSelected()));
    stringBuffer.append(",");
    stringBuffer.append(String.valueOf(this.kehugmtj.isSelected()));

    String dd = String.valueOf(stringBuffer);
    String userId = String.valueOf(System.currentTimeMillis());
    if (userold != null)
    {
      userId = userold.getId();
      userold.setPassword(pas);
      userMoudle.updateUser(userold);
      DefaultTableModel tableModel = (DefaultTableModel)this.tablex.getModel();
      tableModel.removeRow(this.tablex.getSelectedRow());
      insertRow(userold, this.tablex.getSelectedRow());
      userRight.setUserName(userId);
      userRight.setRight(dd);
      this.label_8.setText("�û�[" + userold.getUsernmae() + "] ���³ɹ�");
    } else {
      User user = new User();
      user.setId(userId);
      user.setUsernmae(username);
      user.setPassword(pas.trim());
      user.setType("Manage");
      userMoudle.add(user);
      insertRow(user, 0);
      userRight.setUserName(userId);
      userRight.setRight(dd);
      this.label_8.setText("�û�[" + user.getUsernmae() + "] ��ӳɹ�");
    }

    if (!"����Ա".equals(username)) {
      UserRight userRights = rightMoudle.get(userId);
      if (userRights != null)
        rightMoudle.update(userRight);
      else
        rightMoudle.add(userRight);
    }
  }

  private void insertRow(User user, int row)
  {
    DefaultTableModel tableModel = (DefaultTableModel)this.tablex.getModel();

    if (user.getUsernmae().equals("����Ա")) {
      Object[] rewdata = { 
        user.getId(), 
        user.getPassword(), 
        user.getUsernmae(), 
        "" };

      tableModel.insertRow(0, rewdata);
    } else {
      Object[] rewdata = { 
        user.getId(), 
        user.getPassword(), 
        user.getUsernmae(), 
        "ɾ��" };

      tableModel.insertRow(this.tablex.getRowCount(), rewdata);
    }
  }

  public void disposePage()
  {
  }

  public String getPageId() {
    return getClass().getName();
  }

  public String getPageName() {
    return ">>>�û�Ȩ��";
  }

  public boolean isDefaultPage()
  {
    return this.isDefaultPage;
  }

  public void setDefaultPage(boolean bool)
  {
    this.isDefaultPage = bool;
  }
}