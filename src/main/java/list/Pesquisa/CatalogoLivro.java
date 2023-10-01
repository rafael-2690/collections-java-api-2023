package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivro {

    private List<Livro> listaLivro;

    public CatalogoLivro(){
        this.listaLivro = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        listaLivro.add(new Livro(titulo,autor,anoPublicacao));
    }
    public List<Livro> pesquisaPorAutor(String autor){
        List<Livro> livroPOrAutor = new ArrayList<>();

        if(!listaLivro.isEmpty()){
            for (Livro l : listaLivro){
                if(l.getAutor().equalsIgnoreCase(autor)){
                     livroPOrAutor.add(l);
                }
            }
        }
        return livroPOrAutor;
    }
    public  List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livroPorIntervalor = new ArrayList<>();
        if (!listaLivro.isEmpty()){
            for (Livro l : listaLivro){
                if (l.getanoPublicacao() >= anoInicial && l.getanoPublicacao() <= anoFinal){
                    livroPorIntervalor.add(l);
                }
            }
        }
    return livroPorIntervalor;
    }
    public Livro pesquisaPorTitulos(String titulo){
        Livro livroPorTitulo = null;
        if (!listaLivro.isEmpty()){
            for (Livro l : listaLivro){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }
    public static void main(String[] args) {
        CatalogoLivro catalogoLivro = new CatalogoLivro();

        catalogoLivro.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
        catalogoLivro.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
        catalogoLivro.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
        catalogoLivro.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);

        System.out.println(catalogoLivro.pesquisaPorAutor("Robert C. Martin"));

        System.out.println(catalogoLivro.pesquisaPorTitulos("Java Guia do Programador"));
    }
}