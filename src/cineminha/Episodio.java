package cineminha;

import calculos.Classificavel;

public class Episodio implements Classificavel{
	private int numero;
	private String nome;
	private Serie serie;//como eu explicaria essa parte do código? 
	private int totalVisualizacoes; //só para entendermos que a implementação da classificação não precisa ser a msm para dif classes
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Serie getSerie() {
		return serie;
	}
	public void setSerie(Serie serie) {
		this.serie = serie;
	}
	
	public int getTotalVisualizacoes() {
		return totalVisualizacoes;
	}
	public void setTotalVisualizacoes(int totalVisualizacoes) {
		this.totalVisualizacoes = totalVisualizacoes;
	}
	
	@Override
	public int getClassificacao() {
		if (totalVisualizacoes > 100) {
			return 4;
		}
		else {
			return numero;
		}
	}
	
	
}
