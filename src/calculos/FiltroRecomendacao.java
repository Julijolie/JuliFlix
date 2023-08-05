package calculos;

public class FiltroRecomendacao {
	//não usamos new em interface!!
	public void filtra(Classificavel classificavel) {
		if(classificavel.getClassificacao() >=4) {
			System.out.println("Avaliacao otima. Está  entre os preferidos do momento!");
		}
		else if(classificavel.getClassificacao() >=2) {
			System.out.println("Avaliacao boa. Muito bem avaliado no momento.");
		}
		
		else {
			System.out.println("Avaliacao regular. Coloque na sua lista para assistir depois.");
		}
	}
}
