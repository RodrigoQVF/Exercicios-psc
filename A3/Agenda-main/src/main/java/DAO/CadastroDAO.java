package DAO;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import conexao.Conexao;
import entity.Usuario;

public class CadastroDAO {

    public void cadastro(Usuario user){



        String sql = "INSERT INTO Users (usuario, senha) VALUES (?, ?)";

        PreparedStatement ps = null;

        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, user.getUsuario());
            ps.setString(2, user.getSenha());
            ps.execute();
            ps.close();






        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
