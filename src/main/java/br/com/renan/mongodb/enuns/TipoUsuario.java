package br.com.renan.mongodb.enuns;

public enum TipoUsuario {
	
    
    USUARIO_MASTER("Master"),
    USUARIO_ADMINISTRADOR("Administrador"),
    USUARIO_FUNCIONARIO("Funcionário");
    
    private String label;

    private TipoUsuario(String label) {
        this.label = label;
    }
     
    public String getLabel() {
        return label;
    }
 
    
     
}
