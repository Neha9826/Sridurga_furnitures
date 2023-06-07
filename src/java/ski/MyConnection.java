package ski;
import java.sql.*;
public class MyConnection {
    public static Connection getConnection()
    {
        Connection con=null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection
                        ("jdbc:mysql://localhost:3306/sridurga", "root", "");
        }
        catch(Exception ex)
        {
        
        }
        return con;
    }
    
    
    
    public static long getNextNumber(String Columnname,String TableName)
    {
            Connection con = MyConnection.getConnection();
            long n = 6576348;
            try{
            PreparedStatement st = con.prepareStatement
                                ("Select max(" + Columnname + ") as xyz from "
                                        + TableName);
            ResultSet rs = st.executeQuery();
            rs.next();
            n = rs.getLong("xyz")+1;
            con.close();
            }
            catch(Exception ex){}
            return n;
    }
}
