package cineminha;

import calculos.CalculadoraDeTempo;
import calculos.FiltroRecomendacao;

public class Principal {

	public static void main(String[] args) {
		Filme meuFilme = new Filme();
		meuFilme.setNome("Sing Street");
		meuFilme.setAnoDeLancamento(2016);
		meuFilme.setDuracaoEmMinutos(106);
		 
		meuFilme.exibeFichaTecnica();
		meuFilme.avalia(8);
		meuFilme.avalia(5);
		meuFilme.avalia(10);
		System.out.println("Total de avaliacoes: " + meuFilme.getTotalDeAvaliacoes());
		System.out.println(meuFilme.pegaMedia());
		
		Filme outroFilme = new Filme();
		outroFilme.setNome("Avatar: O caminho das aguas");
		outroFilme.setAnoDeLancamento(2022);
		outroFilme.setDuracaoEmMinutos(192);
		
		outroFilme.exibeFichaTecnica();
		outroFilme.avalia(3);
		outroFilme.avalia(3);
		outroFilme.avalia(5);
		
		Serie minhaSerie = new Serie();
		minhaSerie.setNome("The last of us");
		minhaSerie.setAnoDeLancamento(2023);
		minhaSerie.setTemporadas(1);
		minhaSerie.setMinutosPorEpisodio(55);
		minhaSerie.setEpisodiosPorTemporada(9);
		minhaSerie.setDuracaoEmMinutos(0);
		
		CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
		calculadora.inclui(meuFilme);
		calculadora.inclui(outroFilme);
		calculadora.inclui(minhaSerie);
		System.out.println(calculadora.getTempoTotal());
		
		FiltroRecomendacao filtro = new FiltroRecomendacao();
		filtro.filtra(meuFilme);
		filtro.filtra(outroFilme);
	//	filtro.filtra(minhaSerie);
		
		Episodio episodio = new Episodio();
		episodio.setNumero(1);
		episodio.setSerie(minhaSerie);
		episodio.setTotalVisualizacoes(300);
		filtro.filtra(episodio);
		
		 
	}

}
