
package doa;

import connection.Connect;
import domain.Customer;
import domain.Freelancer;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Doa {
    private Connection con;
    private PreparedStatement ps;

    public Doa() {
        try {
            con=Connect.DBConnect();
        } catch (SQLException ex) {
           System.out.println("erorr connectiong");
        }
    }
    
    
    
    
       public Customer Csave(Customer s){
    String sql="INSERT INTO CUSTOMER VALUES(?,?,?,?)";
        try {
            
            ps=this.con.prepareStatement(sql);
            ps.setString(1,s.getName());
            ps.setString(2,s.getEmail());
             ps.setString(3,s.getContact());
            ps.setString(4,s.getPassword());
            
            int ok= ps.executeUpdate();
             if(ok>0){
             return s;
             }else{
              return null;
             }
           
        } catch (SQLException ex) {
            System.out.println("errorr insert");
        }
        finally{if(ps!=null)
                {try {
                    ps.close();
            } catch (SQLException ex) {
              System.out.println("errorr insert end");
            }
}}
        return null;
   
    }
       public Freelancer Fsave(Freelancer s){
    String sql="INSERT INTO FREELANCER VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            
            ps=this.con.prepareStatement(sql);
            ps.setString(1,s.getFullname());
            ps.setString(2,s.getEmail());
             ps.setString(3,s.getContact());
            ps.setString(4,s.getTypeofwork());
              ps.setString(5,s.getWorkdscript());
            ps.setString(6,s.getArea());
             ps.setString(7,s.getHourr());
            ps.setString(8,s.getFlatr());
               ps.setString(9,s.getPromo());
             ps.setString(10,s.getBook());
            ps.setString(11,s.getResponse());
            ps.setString(12,s.getXp()); 
            ps.setString(13,s.getPassword()); 
          
            int ok= ps.executeUpdate();
             if(ok>0){
             return s;
             }else{
              return null;
             }
           
        } catch (SQLException ex) {
            System.out.println("errorr insert");
        }
        finally{if(ps!=null)
                {try {
                    ps.close();
            } catch (SQLException ex) {
              System.out.println("errorr insert end");
            }
}}
        return null;
   
    }   
       public ArrayList<Customer> CgetAll(){
    ArrayList<Customer> s= new ArrayList();
        String sql= "select * from customer";
    
        try {
            ps=this.con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            if(rs!=null){
            while(rs.next()){
            s.add(new Customer(rs.getString("name"),rs.getString("email"),rs.getString("contact"),rs.getString("password")));
            }
            rs.close();
            }
        } catch (SQLException ex) {
             System.out.println("errorr getall");
        }
        return s;

    }
    public ArrayList<Freelancer> FgetAll(){
    ArrayList<Freelancer> s= new ArrayList();
        String sql= "select * from freelancer";
    
        try {
            ps=this.con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            if(rs!=null){
            while(rs.next()){
            s.add(new Freelancer(rs.getString("fullname"),rs.getString("email"),rs.getString("contact"),rs.getString("typeofwork")
            ,rs.getString("workdescript"),rs.getString("area"),rs.getString("hourr"),rs.getString("flatr"),rs.getString("promo")
                    ,rs.getString("book"),rs.getString("response"),rs.getString("xp"),rs.getString("password") ));
           
            }
            rs.close();
            }
        } catch (SQLException ex) {
             System.out.println("errorr getall");
        }
        return s;

    }
}
