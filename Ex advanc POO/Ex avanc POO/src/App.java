
public class App {

	public static void main(String[] args) {
		FormasGeometricas fg1 = new FormasGeometricas();
		Retangulo r1 = new Retangulo(5, 4);
		Retangulo r2 = new Retangulo(1, 18);
		Retangulo r3 = new Retangulo(7, 3);
		Retangulo r4 = new Retangulo(5, 7);
		Retangulo r5 = new Retangulo(2, 7);
		fg1.adicionarRetangulo(r1);
		fg1.adicionarRetangulo(r2);
		fg1.adicionarRetangulo(r3);
		fg1.adicionarRetangulo(r4);
		fg1.adicionarRetangulo(r5);

		System.out.println(fg1.acharRetanguloMaiorArea());
		System.out.println(fg1.acharRetanguloMaiorPerimetro());

	}

}
