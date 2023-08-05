package cineminha;

import java.util.ArrayList;

import calculos.CalculadoraDeTempo;
import calculos.FiltroRecomendacao;

public class Principal {

	public static void main(String[] args) {
		Filme meuFilme = new Filme();
		meuFilme.setNome("Sing Street");
		meuFilme.setAnoDeLancamento(2016);
		meuFilme.setDuracaoEmMinutos(106);
		 
		meuFilme.exibeFichaTecnica();
		meuFilme.avalia(5);
		meuFilme.avalia(5);
		meuFilme.avalia(5);
		System.out.println("Total de avaliacoes: " + meuFilme.getTotalDeAvaliacoes());
		System.out.println(meuFilme.pegaMedia());
		
		Filme filme1 = new Filme();
		filme1.setNome("Avatar: O caminho das aguas");
		filme1.setAnoDeLancamento(2022);
		filme1.setDuracaoEmMinutos(192);
		
		filme1.exibeFichaTecnica();
		filme1.avalia(2);
		filme1.avalia(2);
		filme1.avalia(2);
		
		Filme filme2 = new Filme();
		filme2.setNome("DogVille");
		filme2.setAnoDeLancamento(2003);
		filme2.setDuracaoEmMinutos(180);
		
		filme2.exibeFichaTecnica();
		filme2.avalia(1);
		
		Serie minhaSerie = new Serie();
		minhaSerie.setNome("The last of us");
		minhaSerie.setAnoDeLancamento(2023);
		minhaSerie.setTemporadas(1);
		minhaSerie.setMinutosPorEpisodio(55);
		minhaSerie.setEpisodiosPorTemporada(9);
		minhaSerie.setDuracaoEmMinutos(0);
		
		CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
		calculadora.inclui(meuFilme);
		calculadora.inclui(filme2);
		calculadora.inclui(minhaSerie);
		System.out.println(calculadora.getTempoTotal());
		
		FiltroRecomendacao filtro = new FiltroRecomendacao();
		filtro.filtra(meuFilme);
		filtro.filtra(filme2);
	//	filtro.filtra(minhaSerie);
		
		Episodio episodio = new Episodio();
		episodio.setNumero(1);
		episodio.setSerie(minhaSerie);
		episodio.setTotalVisualizacoes(300);
		filtro.filtra(episodio);
		
		//criando uma lista com os filmes criados
		ArrayList<Filme> listaDeFilmes = new ArrayList<>();
		listaDeFilmes.add(meuFilme);
		listaDeFilmes.add(filme1);
		listaDeFilmes.add(filme2);
		System.out.println("Tamanho da lista: " + listaDeFilmes.size()); //imprime o tamanho da lista
		System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome()); //imprime o primeiro item da lista
		System.out.println(listaDeFilmes); 
		/*a inteção era imprimir a lista, mas ele apenas mostra o caminho "gera um lixo", esse
		problema eu corrijo sobrescreveno o toString na classe Filme*/
		System.out.println(listaDeFilmes.get(0));
		 
	}

}
