package entity;
public class Usuario {
    
    private String usuario;
    private String senha;


    public void setSenha(String senha) {
        this.senha = senha;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }
    public String getUsuario() {
        return usuario;
    }

}

