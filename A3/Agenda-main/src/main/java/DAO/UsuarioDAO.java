package DAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import conexao.Conexao;
import entity.Usuario;

public class UsuarioDAO {

    public void usuarioInfo(Usuario user){



        String sql = "SELECT FROM Users (usuario, senha) WHERE usuario = ? AND senha = ?";

        PreparedStatement ps = null;

        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, user.getUsuario());
            ps.setString(2, user.getSenha());

            ResultSet rs = ps.executeQuery();
            int linhas = 0;
            while(rs.next()){
                linhas++;
            }
            System.out.println(linhas);
            ps.execute();
            ps.close();






        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

