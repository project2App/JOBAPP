
import doa.Doa;
import domain.Customer;
import domain.Freelancer;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.*;
import javax.swing.JTextField;

public class Loggin extends JFrame implements ActionListener {

    JPanel panel1, panel2,panel3;
    JLabel user_label, password_label, login;
    JTextField userName_text;
    JPasswordField password_text;
    JButton submit, cancel, signup;
    JRadioButton customer, freelancer;
    JComboBox box;
    Customer c;
    Doa doa;

    public Loggin() {
         panel1=new JPanel();
        panel2=new JPanel();
        panel3=new JPanel();
        
        login = new JLabel("LOGIN");
        login.setBackground(Color.red);
        login.setFont(new Font("Arial", Font.BOLD, 30));
        user_label = new JLabel();
        user_label.setText("Email :");
        userName_text = new JTextField();

        password_label = new JLabel();
        password_label.setText("Password :");
        password_text = new JPasswordField();

        customer = new JRadioButton();
        customer.setText("Customer");
        freelancer = new JRadioButton();
        freelancer.setText("Freelancer");

        submit = new JButton("Login");
        submit.setBackground(Color.green);
         cancel = new JButton("cancel");
         signup = new JButton("signup");
         signup.setBackground(Color.green);
         doa=new Doa();
    }
    
    public void setGui(){
    this.setTitle("Login Form");
         this.setLayout(new GridLayout(3,1,0,20));
        panel1.add(login);
    
    panel2.setLayout(new GridLayout(6,2,5,15));
    panel2.add(user_label);
    panel2.add(userName_text);
    panel2.add(password_label);
    panel2.add(password_text);
    panel2.add(submit);
    String[] a={"Customer","Freelancer"};
    box=new JComboBox(a);
    panel2.add(box);
    
    panel3.setLayout(new GridLayout(3,1,5,15));
    panel3.add(signup);
   panel3.add(customer);
    panel3.add(freelancer);
//    
    submit.addActionListener(this);
    signup.addActionListener(this);
    
    this.add(panel1,BorderLayout.PAGE_START);
    this.add(panel2,BorderLayout.CENTER);
    this.add(panel3,BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==signup && customer.isSelected()){
       CustomerSignup c=new CustomerSignup();
       c.runGui();
       this.setVisible(false);
       }
          if(e.getSource()==signup && freelancer.isSelected()){
       FreelancerSignup c=new FreelancerSignup();
       c.runGui();
       this.setVisible(false);
       }
       if(e.getSource()==submit && box.getSelectedItem().equals("Customer")){
           
       ArrayList<Customer> s= new ArrayList();
       s=doa.CgetAll();
   
       for(int i=0;i<s.size();i++){
        String name=s.get(i).getEmail();
      String pass=s.get(i).getPassword();
     
      if(userName_text.getText().equals(name) && password_text.getText().equals(pass) && box.getSelectedItem().equals("Customer")){
      JOptionPane.showMessageDialog(rootPane, "logged in");
      }else{ JOptionPane.showMessageDialog(rootPane, "incorrect details");}
      }
       
       }
       if(e.getSource()==submit && box.getSelectedItem().equals("Freelancer")){
        ArrayList<Freelancer> s= new ArrayList();
       s=doa.FgetAll();
   
       for(int i=0;i<s.size();i++){
            System.out.println(s);
           String name=s.get(i).getEmail();
      String pass=s.get(i).getPassword();
     
      System.out.println(name+pass);
      if(userName_text.getText().equals(name) && password_text.getText().equals(pass) && box.getSelectedItem().equals("Freelancer")){
      JOptionPane.showMessageDialog(rootPane, "logged in");
      }else{ JOptionPane.showMessageDialog(rootPane, "incorrect details");}
      }
       }
       }
    
    public void runGui(){
     Loggin l=new Loggin();
    l.setSize(400,700);
    l.setVisible(true);
    l.setDefaultCloseOperation(EXIT_ON_CLOSE);
    l.setGui();
    l.setLocationRelativeTo(null);
    }

    public static void main(String[] args){
    Loggin l=new Loggin();
    l.runGui();
    }
    
    
}
