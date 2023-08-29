
import connection.Connect;
import doa.Doa;
import domain.Customer;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class CustomerSignup extends JFrame implements ActionListener{
 JPanel panel1,panel2,panel3;
    JLabel email_label, password_label, username_label, contact_label,signup_label;
    JTextField email_text, username_text, contact_text;
    JPasswordField password_text;
    JButton submit, cancel;
    Customer c;
    Doa doa;
    

    public CustomerSignup() {
    
        this.setLayout(new GridLayout(3,1,10,20));
        
        doa=new Doa();
        panel1=new JPanel();
    panel2=new JPanel();
         panel3=new JPanel();
         
        email_label = new JLabel();
        email_label.setText("Email :");
        email_text = new JTextField();

        password_label = new JLabel();
        password_label.setText("Password :");
        password_text = new JPasswordField();

        username_label = new JLabel();
        username_label.setText("Username :");
        username_text = new JTextField();

        contact_label = new JLabel();
        contact_label.setText("Contact :");
        contact_text = new JTextField();
        
        signup_label = new JLabel();
         signup_label.setText("Sign Up");
          signup_label.setBackground(Color.red);
        signup_label.setFont(new Font("Arial", Font.BOLD, 30));
    submit = new JButton("Submit");
        submit.setPreferredSize(new Dimension(700, 150));         
    cancel = new JButton("Cancel");
     cancel.setPreferredSize(new Dimension(700, 150));
    }
    
    public void setGui(){
    panel1.setLayout(new GridLayout(4,2,10,20));
    panel1.add( username_label);
    panel1.add(  username_text);
    panel1.add( email_label);
     panel1.add( email_text);
     panel1.add( contact_label);
      panel1.add( contact_text);
      panel1.add( password_label);
      panel1.add( password_text);
     
     panel2.setLayout(new BoxLayout(panel2,BoxLayout.X_AXIS));;
     panel2.add(submit);
     panel2.add(cancel);
     
     panel3.add(signup_label);
     
     this.add(panel3,BorderLayout.NORTH);
     this.add(panel1,BorderLayout.CENTER);
     this.add(panel2,BorderLayout.SOUTH);
     this.setTitle("Customer signup");
     
     submit.addActionListener(this);
     cancel.addActionListener(this);
    }
    
    public void runGui(){
  CustomerSignup c=new CustomerSignup();
    c.setVisible(true);
    c.pack();
    c.setSize(400,700);
    c.setDefaultCloseOperation(EXIT_ON_CLOSE);
    c.setLocationRelativeTo(null);
    c.setGui();
    }
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
     String email = email_text.getText();
        String password = password_text.getText();
        String username = username_text.getText();
        String contact = contact_text.getText();
        if(e.getSource()==submit){
            Customer cust=new Customer(username,email,contact,password);
     c=doa.Csave(cust);
     if(c.equals(cust)){
   JOptionPane.showMessageDialog(rootPane, "Info Saved");
    }else{
     System.out.println("saved failesd");
    }
     Loggin l=new Loggin();
      CustomerSignup c=new CustomerSignup();
      l.runGui();
      c.setVisible(false);
     }
        if(e.getSource()==cancel){
        System.exit(0);
        }
    }
    public static void main(String[] args){
    CustomerSignup c=new CustomerSignup();
    c.runGui();
    
    }
}
