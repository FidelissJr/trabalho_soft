
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package javaapplicationjunit;

import org.junit.Test;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

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
        //Cria e inicializa os objetos necessários para o teste
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
        Assert.assertEquals(r, p.respostas.get(0));
        
        
    }
    
    //3
    /*@Test
    public void testEmprestimoEDevolucao() throws Exception {
        //Cria e inicializa os objetos necessários para o teste
        Repositorio r = new Repositorio();
        Biblioteca b = new Biblioteca(r);
        Usuario u = new Usuario("1", "user1");
        Livro l1 = new Livro("123", "Moby Dick");
        Livro l2 = new Livro("456", "Planejamento Sprint");
        Livro l3 = new Livro("789", "Java Completo");
        
        //Adiciona os livros a biblioteca
        b.adicionarLivroAcervo(l1);
        b.adicionarLivroAcervo(l2);
        b.adicionarLivroAcervo(l3);
        
        //Empresta os livros ao usuário
        b.emprestarLivro(l1, u);
        b.emprestarLivro(l2, u);
        b.emprestarLivro(l3, u);
        
        //Cria uma lista de livros e adiciona todos os livros emprestados
        List<Livro> listLivros = new ArrayList<Livro>();
        listLivros.add(l1);
        listLivros.add(l2);
        listLivros.add(l3);
        
        //Recebe a devolução dos 2 livros
        b.receberLivroEmprestado(l1);
        b.receberLivroEmprestado(l2);
        
        //Lista de livros emprestados ao usuário
        List<Livro> livrosEmprestados = new ArrayList<Livro>();
        livrosEmprestados = b.livrosEmprestadosUsuario(u);
       
        //Primeiro valida se os livros estão disponível para emprestimo
        Assert.assertFalse("O livro deveria estar disponível para emprestimo", b.estaEmprestado(l1));
        Assert.assertFalse("O livro deveria estar disponível para emprestimo", b.estaEmprestado(l2));
        
        //Compara a lista de livros com a lista de livros emprestados
        Assert.assertFalse("A devulução dos livros não funcionou corretamente!", listLivros.size() == livrosEmprestados.size() && livrosEmprestados.containsAll(listLivros));
            
    }
    
    //4
    @Test
    public void testEmprestarLivroEmprestado() throws Exception{
        //Cria e inicializa os objetos necessários para o teste
        Repositorio r = new Repositorio();
        Biblioteca b = new Biblioteca(r);
        Usuario u1 = new Usuario("1", "user1");
        Livro l1 = new Livro("123", "Moby Dick");
        
        b.adicionarLivroAcervo(l1);
        b.emprestarLivro(l1, u1);
        
        Assert.assertTrue("O livro deveria estar emprestado para outro usuário", b.estaEmprestado(l1));
         
    }
*/
}
