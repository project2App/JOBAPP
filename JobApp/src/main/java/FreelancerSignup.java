
import connection.Connect;
import doa.Doa;
import domain.Customer;
import domain.Freelancer;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class FreelancerSignup extends JFrame implements ActionListener{
 JPanel panel1,panel2,panel3,panel4;
    JLabel email_label, password_label, fullname_label, contact_label,signup_label
,service_descript,service_area,hourlyr,flatr,promo,booking,response_time,experience,typework;       
    JTextField email_text, fullname_text, contact_text,area_text,hour,flat,promote,book,
 response;
    JTextArea service_text,xp;
    JPasswordField password_text;
    JButton submit, cancel;
    Freelancer f;
    Doa doa;
    JComboBox box;

    public FreelancerSignup() {
    
       // this.setLayout(new GridLayout(3,1,10,20));
        
        
        doa=new Doa();
        panel1=new JPanel();
    panel2=new JPanel();
         panel3=new JPanel();
         panel4=new JPanel();
         
        email_label = new JLabel();
        email_label.setText("Email :");
        email_text = new JTextField();

        password_label = new JLabel();
        password_label.setText("Password :");
        password_text = new JPasswordField();

        fullname_label = new JLabel();
        fullname_label.setText("FullName :");
        fullname_text = new JTextField();

        contact_label = new JLabel();
        contact_label.setText("Contact :");
        contact_text = new JTextField();
        
        service_descript = new JLabel();
     service_descript.setText("description of work :");
        service_text = new JTextArea();
        service_text.setLineWrap(true);
                
       service_area = new JLabel();
          service_area.setText("City :");
        area_text = new JTextField();
        
        
      hourlyr = new JLabel();
       hourlyr.setText("Hourly rate :");
        hour = new JTextField();
        
          flatr = new JLabel();
        flatr.setText("Flat rate :");
        flat = new JTextField();
        
          promo = new JLabel();
         promo.setText("Promotions :");
        promote = new JTextField();
        
         booking = new JLabel();
        booking.setText("Booking options :");
        book = new JTextField();
         
        response_time = new JLabel();
         response_time.setText("Respond time :");
        response = new JTextField();
        
        experience = new JLabel();
        experience.setText("Experience :");
        xp = new JTextArea();
        xp.setLineWrap(true);
        
       typework=new JLabel("Type of work :");
      
    String[] s={"Programming","Digital Marketing","Graphic Design","Administrator","Sales/Customer service","Writing/Editing/Proofreading","Event planning","Home healthcare",
    "Artist","Mechanic","Language/Translation","Personal Trainer","Retail","HairStylist","Pet Groomer","Plummer","Carpenter","Consruction","Cleaner"
   };
 box=new JComboBox(s);
        
        signup_label = new JLabel();
         signup_label.setText("Sign Up");
          signup_label.setBackground(Color.red);
        signup_label.setFont(new Font("Arial", Font.BOLD, 30));
    submit = new JButton("Submit");
    submit.setPreferredSize(new Dimension(700, 150));
    cancel = new JButton("Cancel");
    cancel.setPreferredSize(new Dimension(700, 150));
//    box=new JComboBox();
//    String[] s={"Programming","Digital Marketing","Graphic Design","Administrator","Sales/Customer service","Writing/Editing/Proofreading","Event planning","Home healthcare",
//    "Artist","Mechanic","Language/Translation","Personal Trainer"
//    };
    }
    
    public void setGui(){
    panel1.setLayout(new GridLayout(7,2));
    panel1.add( fullname_label);
    panel1.add(  fullname_text);
    panel1.add( email_label);
     panel1.add( email_text);
     panel1.add( contact_label);
      panel1.add( contact_text);
      panel1.add( typework);
      panel1.add( box);
     panel1.add(service_descript);
     panel1.add(service_text);
     panel1.add(service_area);
     panel1.add(area_text);
     panel1.add(hourlyr);
     panel1.add(hour);
      panel4.setLayout(new GridLayout(6,2));
     panel4.add(flatr);
     panel4.add(flat);
      panel4.add(promo);
     panel4.add(promote);
     panel4.add(booking);
     panel4.add(book);
       panel4.add(response_time);
     panel4.add(response);
     panel4.add(experience);
     panel4.add(xp);
          panel4.add( password_label);
      panel4.add( password_text)
     
     
     
;
     
     panel2.setLayout(new BoxLayout(panel2,BoxLayout.X_AXIS));
     panel2.add(submit);
     panel2.add(cancel);
     
     panel3.add(signup_label);
     
     this.add(panel3,BorderLayout.NORTH);
     this.add(panel1,BorderLayout.WEST);
      this.add(panel4,BorderLayout.EAST);
     this.add(panel2,BorderLayout.SOUTH);
     this.setTitle("Freelancer signup");
     
     submit.addActionListener(this);
     cancel.addActionListener(this);
    }
    
    public void runGui(){
  FreelancerSignup c=new FreelancerSignup();
    c.setVisible(true);
    c.pack();
    c.setSize(600,700);
    c.setDefaultCloseOperation(EXIT_ON_CLOSE);
    c.setLocationRelativeTo(null);
    c.setGui();
    }
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
     String email = email_text.getText();
        String password = password_text.getText();
        String username = fullname_text.getText();
        String contact = contact_text.getText();
        String typework = box.getSelectedItem().toString();
        String area = area_text.getText();
        String service = service_text.getText();
        String hours =hour.getText();
        String flat = flatr.getText();
        String promo = promote.getText();
        String books = book.getText();
        String responds = response.getText();
        String exp= xp.getText();
        if(e.getSource()==submit){
           Freelancer cust=new Freelancer(username,email,contact,typework,area,service,hours,flat, promo,books,responds,exp,password);
     f=doa.Fsave(cust);
     if(f.equals(cust)){
 JOptionPane.showMessageDialog(rootPane, "Info Saved");
    }else{
     System.out.println("saved failesd");
    }
      Loggin l=new Loggin();
      FreelancerSignup c=new FreelancerSignup();
      l.runGui();
      c.setVisible(false);
     }
        if(e.getSource()==cancel){
        System.exit(0);
        }
    }
    public static void main(String[] args){
   FreelancerSignup c=new FreelancerSignup();
    c.runGui();
    
    }
}
