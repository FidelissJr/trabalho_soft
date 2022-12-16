/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplicationjunit;

/**
 *
 * @author andre
 */
public class Resposta {
    public String titulo;
    public String corpo;
    public String imagem;
    public Enum status;
    public Usuario autor;
    public int curtidas;
    public int denuncias;
    public int visitas;
    
    public enum situacao{
    AGUARDANDO_LEITURA,
    VISUALIZADA,
    EXCLUIDA,
    }
    
    
    
    public Resposta(String titulo, String corpo, Usuario autor){
        this.titulo = titulo;
        this.corpo = corpo;
        this.autor = autor;
        this.status = situacao.AGUARDANDO_LEITURA;

    }

        

}

