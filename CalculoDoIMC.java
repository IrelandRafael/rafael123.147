
public class CalculoDoIMC {
	
	private String nome;
	private double altura;
	private double peso;
	
	public CalculoDoIMC(String nome, double altura, double peso) {
		super();
		this.nome = nome;
		this.altura = altura;
		this.peso = peso;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double CalculoImc(){

			double imc;
			imc=(peso)/(altura*altura);
			return imc;

	}

	@Override
	public String toString() {
		return "nome = " + nome + "\naltura = " + altura + "\npeso = " + peso +"\nIMC = "+CalculoImc();
	}
	
	
	public static void main(String[] args) {
		
		CalculoDoIMC p1 = new CalculoDoIMC("Rafael", 1.84 , 90.0);
		System.out.println(p1);
	
	}	
}
