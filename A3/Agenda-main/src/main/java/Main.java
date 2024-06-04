import telas.telaLogin;
import DAO.CadastroDAO;
import DAO.UsuarioDAO;
import entity.Usuario;

public class Main {
    
    public static void main(String[] args) {
        // new telaLogin().setVisible(true);
        Usuario user = new Usuario(); //Instancia a classe do usuario (sipa eu mudo pro do gustavo)
        // CadastroDAO cadastrodao = new CadastroDAO(); //instancia o DAO que sobe os dados da classe Usuario para o database
        UsuarioDAO usuariodao = new UsuarioDAO();
        user.setUsuario("rod");
        user.setSenha("1212");
        usuariodao.usuarioInfo(user);
    //    dao.cadastro(user); //Envia para o banco de dados
    }
}
