package modelo;
// Generated 15/07/2013 11:58:05 by Hibernate Tools 3.2.1.GA



/**
 * Paciente generated by hbm2java
 */
public class Paciente  implements java.io.Serializable {


     private int pacienteId;
     private Plano plano;
     private String pacienteNome;
     private String pacienteLogin;
     private String pacienteSenha;
     private String pacienteEmail;

    public Paciente() {
    }

	
    public Paciente(int pacienteId, String pacienteNome, String pacienteLogin, String pacienteSenha, String pacienteEmail) {
        this.pacienteId = pacienteId;
        this.pacienteNome = pacienteNome;
        this.pacienteLogin = pacienteLogin;
        this.pacienteSenha = pacienteSenha;
        this.pacienteEmail = pacienteEmail;
    }
    public Paciente(int pacienteId, Plano plano, String pacienteNome, String pacienteLogin, String pacienteSenha, String pacienteEmail) {
       this.pacienteId = pacienteId;
       this.plano = plano;
       this.pacienteNome = pacienteNome;
       this.pacienteLogin = pacienteLogin;
       this.pacienteSenha = pacienteSenha;
       this.pacienteEmail = pacienteEmail;
    }
   
    public int getPacienteId() {
        return this.pacienteId;
    }
    
    public void setPacienteId(int pacienteId) {
        this.pacienteId = pacienteId;
    }
    public Plano getPlano() {
        return this.plano;
    }
    
    public void setPlano(Plano plano) {
        this.plano = plano;
    }
    public String getPacienteNome() {
        return this.pacienteNome;
    }
    
    public void setPacienteNome(String pacienteNome) {
        this.pacienteNome = pacienteNome;
    }
    public String getPacienteLogin() {
        return this.pacienteLogin;
    }
    
    public void setPacienteLogin(String pacienteLogin) {
        this.pacienteLogin = pacienteLogin;
    }
    public String getPacienteSenha() {
        return this.pacienteSenha;
    }
    
    public void setPacienteSenha(String pacienteSenha) {
        this.pacienteSenha = pacienteSenha;
    }
    public String getPacienteEmail() {
        return this.pacienteEmail;
    }
    
    public void setPacienteEmail(String pacienteEmail) {
        this.pacienteEmail = pacienteEmail;
    }




}

