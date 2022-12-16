/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplicationjunit;

/**
 *
 * @author andre
 */
import java.util.ArrayList;

public class Pergunta {
    public String titulo;
    public String corpo;
    public String imagem;
    public Enum status;
    public Usuario autor;
    public ArrayList<Resposta> respostas;
    
    
    public enum situacao{
        ABERTA,
        RESPONDIDA,
        FECHADA,
    }
    
    
    public Pergunta(String titulo, String corpo){
        this.titulo = titulo;
        this.corpo = corpo;
        this.status = situacao.ABERTA;
    }
}
