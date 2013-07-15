/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author yuricampos
 */
public class Horario {
    private Date dia;
    private Time hora;
    private String status;
    private int medico;
    private int paciente;
    private int clinica;

    /**
     * @return the dia
     */
    public Date getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(Date dia) {
        this.dia = dia;
    }

    /**
     * @return the hora
     */
    public Time getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(Time hora) {
        this.hora = hora;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the medico
     */
    public int getMedico() {
        return medico;
    }

    /**
     * @param medico the medico to set
     */
    public void setMedico(int medico) {
        this.medico = medico;
    }

    /**
     * @return the paciente
     */
    public int getPaciente() {
        return paciente;
    }

    /**
     * @param paciente the paciente to set
     */
    public void setPaciente(int paciente) {
        this.paciente = paciente;
    }

    /**
     * @return the clinica
     */
    public int getClinica() {
        return clinica;
    }

    /**
     * @param clinica the clinica to set
     */
    public void setClinica(int clinica) {
        this.clinica = clinica;
    }
    
    
}
