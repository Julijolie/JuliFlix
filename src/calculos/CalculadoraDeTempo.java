package calculos;
import cineminha.Titulo;

public class CalculadoraDeTempo {
	private int tempoTotal;

	public int getTempoTotal() {
		return tempoTotal;
	}
//sobregarga de métods 
//	public void inclui(Filme f) {
//		tempoTotal += f.getDuracaoEmMinutos();
//	}
//	public void inclui(Serie s) {
//		tempoTotal += s.getDuracaoEmMinutos();
//	}
	public void inclui(Titulo t) {
		tempoTotal += t.getDuracaoEmMinutos();
	}

}
