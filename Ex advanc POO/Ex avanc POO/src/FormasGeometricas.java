import java.util.ArrayList;
import java.util.List;

public class FormasGeometricas {

	private List<Retangulo> listaRetangulos;

	public FormasGeometricas() {
		listaRetangulos = new ArrayList<Retangulo>();
	}

	public Retangulo acharRetanguloMaiorArea() {
		double maiorArea = Double.MIN_VALUE;
		Retangulo retMaiorArea = null;

		for (Retangulo r : listaRetangulos) {
			if (r.calcularArea() > maiorArea) {
				maiorArea = r.calcularArea();
				retMaiorArea = r;
			}
		}
		return retMaiorArea;
	}

	public Retangulo acharRetanguloMaiorPerimetro() {
		double maiorPerimetro = Double.MIN_VALUE;
		Retangulo retMaiorPerimetro = null;

		for (Retangulo r : listaRetangulos) {
			if (r.calcularPerimetro() > maiorPerimetro) {
				maiorPerimetro = r.calcularPerimetro();
				retMaiorPerimetro = r;
			}
		}
		return retMaiorPerimetro;
	}
	
	
	public void adicionarRetangulo(Retangulo r) {
		listaRetangulos.add(r);
	}

}
