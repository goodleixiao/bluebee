package com.bluebee.ui.widget;

import com.bluebee.SysEnv;
import com.bluebee.moudle.MoudleContentFactry;
import com.bluebee.moudle.UserMoudle;
import com.bluebee.pojo.User;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dialog.ModalityType;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class PasswordDialog extends JDialog
{
  private JPasswordField passwordField;
  private JPasswordField passwordField_1;
  private JLabel label_2;

  public PasswordDialog(Component owner)
  {
    setResizable(false);
    setTitle("��������");
    setSize(new Dimension(338, 210));
    setLocationRelativeTo(owner);

    setModalityType(JDialog.ModalityType.APPLICATION_MODAL);
    setDefaultCloseOperation(2);
    getContentPane().setLayout(null);

    JLabel label = new JLabel("������");
    label.setBounds(52, 47, 42, 15);
    getContentPane().add(label);

    this.passwordField = new JPasswordField();

    this.passwordField.setBounds(104, 44, 156, 21);
    getContentPane().add(this.passwordField);
    this.passwordField.setColumns(10);

    JLabel label_1 = new JLabel("ȷ������");
    label_1.setBounds(45, 85, 54, 15);
    getContentPane().add(label_1);

    this.passwordField_1 = new JPasswordField();
    this.passwordField_1.setBounds(104, 82, 156, 21);
    getContentPane().add(this.passwordField_1);
    this.passwordField_1.setColumns(10);

    JButton button = new JButton("ȷ��");
    button.addMouseListener(new MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        String p1 = String.valueOf(PasswordDialog.this.passwordField.getPassword());
        String p2 = String.valueOf(PasswordDialog.this.passwordField_1.getPassword());

        if ("".equals(p1.trim())) {
          PasswordDialog.this.label_2.setText("������������");
          PasswordDialog.this.passwordField.requestFocus();
          return;
        }
        if ("".equals(p2.trim())) {
          PasswordDialog.this.label_2.setText("������ȷ������");
          PasswordDialog.this.passwordField_1.requestFocus();
          return;
        }
        if (!p1.equals(p2)) {
          PasswordDialog.this.label_2.setText("������������벻һ�£�����������");
          PasswordDialog.this.passwordField.setText("");
          PasswordDialog.this.passwordField_1.setText("");
          PasswordDialog.this.passwordField.requestFocus();
          return;
        }
        UserMoudle serMoudle = MoudleContentFactry.getUserMoudle();
        String id = SysEnv.getInstance().getLoginUser();
        User user = serMoudle.getUserByid(id);
        user.setPassword(p2);
        serMoudle.updateUser(user);
        PasswordDialog.this.label_2.setText("�����޸ĳɹ������μ�");
      }
    });
    button.setBounds(88, 128, 81, 30);
    getContentPane().add(button);

    JButton button_1 = new JButton("ȡ��");
    button_1.addMouseListener(new MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        PasswordDialog.this.dispose();
      }
    });
    button_1.setBounds(179, 128, 81, 30);
    getContentPane().add(button_1);

    this.label_2 = new JLabel("");
    this.label_2.setFont(new Font("����", 0, 12));
    this.label_2.setForeground(Color.RED);
    this.label_2.setBounds(52, 10, 247, 27);
    getContentPane().add(this.label_2);
  }
}