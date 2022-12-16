/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplicationjunit;
import java.util.Date;
/**
 *
 * @author andre
 */
public class Usuario {
    public String nome;
    public String email;
    public Date data;
    public String experiencia;
    public String profissao;
    public Boolean surdes; 
    
    public Usuario(String nome, String email, String profissao){
        this.nome = nome;
        this.email = email;
        this.profissao = profissao;
                
    }
    
    
    public void criarPergunta(Pergunta p){
        p.autor = this;
    }
        
    public void criarResposta(Resposta r, Pergunta p){
        r.autor = this;
    }
    

    
}
