
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package javaapplicationjunit;

import org.junit.Test;
import org.junit.*;
/**
 *
 * @author andre
 */
public class BibliotecaTest {
    
    public BibliotecaTest() {
       
    }
       
    //1
    @Test
    public void criarPergunta() throws Exception{
        
        //Cria e inicializa os objetos necessários para o teste
        Usuario u = new Usuario("Pedro", "Pedro@gmail.com", "Estudante" );
        Pergunta p = new Pergunta("Pedir com licença", "Como posso gesticular para pedir licença a alguem");
        u.criarPergunta(p);
        Assert.assertNotNull("O usuário não pode ser nulo", u);
        Assert.assertNotNull("O pergunta não pode ser nula", p);
        Assert.assertNotNull("O relacionamento de usuário x pergunta não foi feito corretamente!", p.autor);
        Assert.assertEquals("Pedro", p.autor.nome);

    }
    
    //2
    @Test
    public void responderPergunta() throws Exception{
        //Cria e inicializa os objetos necessários para o teste de adicionar uma resposta há uma pergunta
        Usuario u = new Usuario("Pedro", "Pedro@gmail.com", "Estudante" );
        Usuario u2 = new Usuario("Lucas", "Lucas@gmail.com", "Professor" );
        Pergunta p = new Pergunta("Pedir com licença", "Como posso gesticular para pedir licença a alguem");
        u.criarPergunta(p);
        Assert.assertNotNull("O usuário não pode ser nulo", u);
        Assert.assertNotNull("O pergunta não pode ser nula", p);
        Assert.assertNotNull("O relacionamento de usuário x pergunta não foi feito corretamente!", p.autor);
        Assert.assertEquals("Pedro", p.autor.nome);
        Resposta r = new Resposta("Abane a mão", "Balance a mão no sentido anti-horário na altura da cabeça", u2);
        u2.criarResposta(r, p);
        Assert.assertNotNull("O resposta não pode ser nulo", r);
        p = p.adicionaResposta(r);
        Assert.assertEquals(r, p.respostas.get(0));
        
        
        //adiciona mais uma resposta a pergunta e testa se a pergunta tem 2 respostas
        Resposta r2 = new Resposta("Teste resposta 2", "teste 2 resposta do corpo", u2);
        u2.criarResposta(r2, p);
        Assert.assertNotNull("O resposta não pode ser nulo", r2);
        p = p.adicionaResposta(r2);
        Assert.assertTrue(p.respostas.size() == 2);
        
        
        
    }
    
    //3
    @Test
    public void excluirPergunta() throws Exception {
        //Inicializa os objetos para teste
        Usuario u = new Usuario("Pedro", "Pedro@gmail.com", "Estudante" );
        Usuario u2 = new Usuario("Lucas", "Lucas@gmail.com", "Professor" );
        Pergunta p = new Pergunta("Pedir com licença", "Como posso gesticular para pedir licença a alguem");
        u.criarPergunta(p);
        Resposta r = new Resposta("Abane a mão", "Balance a mão no sentido anti-horário na altura da cabeça", u2);
        u2.criarResposta(r, p);
        p = p.adicionaResposta(r);
        Resposta r2 = new Resposta("Teste resposta 2", "teste 2 resposta do corpo", u2);
        u2.criarResposta(r2, p);
        p = p.adicionaResposta(r2);
        
        //chama o método de exluir e faz os testes
        p = p.excluirPergunta(p);
        Assert.assertNull("O usuário deve ser nulo", p.autor);
        Assert.assertTrue(p.respostas.isEmpty());

        
    }
    
    //4
    @Test
    public void testEmprestarLivroEmprestado() throws Exception{
        //Cria uma resposta e adiciona 10 curtidas a ela
        Usuario u = new Usuario("Pedro", "Pedro@gmail.com", "Estudante" );
        Resposta r = new Resposta("Teste resposta 2", "teste 2 resposta do corpo", u);
        for(int i = 0; i < 10; i++){
            r.curtirResposta(r);
        }
        Assert.assertTrue("O número de curtidas é diferente de 10", r.curtidas == 10);
         
    }

}
