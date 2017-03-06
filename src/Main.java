import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        try{
            Class.forName ("oracle.jdbc.OracleDriver");
            Connection conn = DriverManager.getConnection (
                    "jdbc:oracle:thin:@172.16.0.20 :1521:orcl","pbarabe","PBARABE");
            Statement stmt = conn.createStatement ();
            ResultSet rset = stmt.executeQuery ("select ENAME from EMP");
            while (rset.next ()){
                System.out.println (rset.getString (1));
            }
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
