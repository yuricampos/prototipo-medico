package modelo;
// Generated 15/07/2013 11:58:05 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Medico generated by hbm2java
 */
public class Medico  implements java.io.Serializable {


     private int medicoId;
     private String medicoCrm;
     private String medicoNome;
     private String medicoLogin;
     private String medicoSenha;
     private String medicoEmail;
     private Set planos = new HashSet(0);
     private Set clinicas = new HashSet(0);

    public Medico() {
    }

	
    public Medico(int medicoId, String medicoCrm, String medicoNome, String medicoLogin, String medicoSenha, String medicoEmail) {
        this.medicoId = medicoId;
        this.medicoCrm = medicoCrm;
        this.medicoNome = medicoNome;
        this.medicoLogin = medicoLogin;
        this.medicoSenha = medicoSenha;
        this.medicoEmail = medicoEmail;
    }
    public Medico(int medicoId, String medicoCrm, String medicoNome, String medicoLogin, String medicoSenha, String medicoEmail, Set planos, Set clinicas) {
       this.medicoId = medicoId;
       this.medicoCrm = medicoCrm;
       this.medicoNome = medicoNome;
       this.medicoLogin = medicoLogin;
       this.medicoSenha = medicoSenha;
       this.medicoEmail = medicoEmail;
       this.planos = planos;
       this.clinicas = clinicas;
    }
   
    public int getMedicoId() {
        return this.medicoId;
    }
    
    public void setMedicoId(int medicoId) {
        this.medicoId = medicoId;
    }
    public String getMedicoCrm() {
        return this.medicoCrm;
    }
    
    public void setMedicoCrm(String medicoCrm) {
        this.medicoCrm = medicoCrm;
    }
    public String getMedicoNome() {
        return this.medicoNome;
    }
    
    public void setMedicoNome(String medicoNome) {
        this.medicoNome = medicoNome;
    }
    public String getMedicoLogin() {
        return this.medicoLogin;
    }
    
    public void setMedicoLogin(String medicoLogin) {
        this.medicoLogin = medicoLogin;
    }
    public String getMedicoSenha() {
        return this.medicoSenha;
    }
    
    public void setMedicoSenha(String medicoSenha) {
        this.medicoSenha = medicoSenha;
    }
    public String getMedicoEmail() {
        return this.medicoEmail;
    }
    
    public void setMedicoEmail(String medicoEmail) {
        this.medicoEmail = medicoEmail;
    }
    public Set getPlanos() {
        return this.planos;
    }
    
    public void setPlanos(Set planos) {
        this.planos = planos;
    }
    public Set getClinicas() {
        return this.clinicas;
    }
    
    public void setClinicas(Set clinicas) {
        this.clinicas = clinicas;
    }




}


