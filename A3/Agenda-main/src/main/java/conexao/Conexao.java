package conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static final String url = "jdbc:mysql://root:vigByaCUepouDjUrWhpyHdQWszsvHJxK@mysql.railway.internal:3306/railway";
    private static final String user = "root";
    private static final String password = "vigByaCUepouDjUrWhpyHdQWszsvHJxK";

    private static Connection con;

    public static Connection getConexao(){
        try{
        if(con == null){
            con = DriverManager.getConnection(url, user, password);
            return con;
        } else{
            return con;
        }
    } catch (SQLException e){
            e.printStackTrace();
            return null;
        }
        
        }

    }

