import javax.swing.JOptionPane;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class W13_Function {
    static Customer[] C = new Customer[100];
    static W13_Function F = new W13_Function();
    static int countC = 0;

    public void InputDataCustomer() {
        String Cname,Caddress,Cnumber,output = "             Customer Data             ";
  
      Cname = JOptionPane.showInputDialog("Enter Your Name");
      Caddress = JOptionPane.showInputDialog("Enter Your Address");
      Cnumber = JOptionPane.showInputDialog("Enter Your Phone Number");
  
      C[countC] = new Customer(Cname,Caddress,Cnumber);
      countC++;

        for(int i=0;i<countC;i++) {
            output += "\nCustomer Name : " + C[i].getCname();
            output += "\nCustomer Address : " + C[i].getCaddress();
            output += "\nCustomer Phone Number : " + C[i].getCnumber();
        }
        JOptionPane.showMessageDialog(null,output);
    }
    public int SelectProduct() {
        int sp = Integer.parseInt(JOptionPane.showInputDialog("Choose Product"));
        return sp;
    }
    public void ChooseProductAndPay() {
        int i,change,price;
        i = F.SelectProduct();
        if(i==1) {
            price = 20;
            JOptionPane.showMessageDialog(null,"1.Lays price 20 Bath");
        }
        else if(i==2) {
            price = 17;
            JOptionPane.showMessageDialog(null,"2.Coke price 17 Bath");
        }
        else if(i==3) {
            price = 20;
            JOptionPane.showMessageDialog(null,"3.Taro price 20 Bath");
        }
        else if(i==4) {
            price = 17;
            JOptionPane.showMessageDialog(null,"4.Pepsi price 17 Bath");
        }
        else if(i==5) {
            price = 12;
            JOptionPane.showMessageDialog(null,"5.Kitkat price 12 Bath");
        }
        else if(i==6) {
            price = 10;
            JOptionPane.showMessageDialog(null,"6.Oreo price 10 Bath");
        }
        else if(i==7) {
            price = 20;
            JOptionPane.showMessageDialog(null,"7.Pocky price 20 Bath");
        }
        else if(i==8) {
            price = 5;
            JOptionPane.showMessageDialog(null,"8.ChupaChup price 5 Bath");
        }
        else {
            price = 119;
            JOptionPane.showMessageDialog(null,"9.Arsenal Cookie price 119 Bath");
        }
        int pay = Integer.parseInt(JOptionPane.showInputDialog("Pay Product : "));
        change = pay-price;
        if(change<0)
            JOptionPane.showMessageDialog(null,"Error");
        else
            JOptionPane.showMessageDialog(null,"Your Change : " + change);
    }
    public void ShowProduct() {
        LoadImage();
    }
    public void LoadImage() {
        JPanel boardPanel = new JPanel();
        ImageIcon[] imageIcons = new ImageIcon[9];
        JLabel[] labels = new JLabel[9];
        boardPanel.setLayout(new GridLayout(3, 3));

        for (int i = 0; i < imageIcons.length; i++) {
            imageIcons[i] = new ImageIcon("image" + (i + 1) + ".jpg");
        }
        
        for (int i = 0; i < labels.length; i++) {
            labels[i] = new JLabel(imageIcons[i]);
        }

        for (JLabel label : labels) {
            boardPanel.add(label);
        }

        JOptionPane.showMessageDialog(null,boardPanel);
    }
}