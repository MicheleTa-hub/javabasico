package cursoJava.basico;

public class VariaveisEconstantes {

	public static void main(String[]args) {
		// Variaveis constantes
		final double ACELERACAO_GRAVIDADE_NA_TERRA = 9.80665;
		
		
		// cria��o de variaveis
		String nome = "Jose"; 
		int idade = 48;
		double peso = 73.40, altura = 1.73;
		char sexo = 'm',cnh = 'a';
		boolean doardorOrgao = true;
		
		System.out.println("Nome:" +nome);
		System.out.println("Idade:" +idade);
		System.out.println("Peso:" +peso);
		System.out.println("Altura:" +altura);
		System.out.println("Sexo:" +sexo);
		System.out.println("Habilita��o:" +cnh);
		System.out.println("Doador de org�o:" +doardorOrgao);
		System.out.println("Gravidade na terra �:" +ACELERACAO_GRAVIDADE_NA_TERRA+" m/s2");
		
		
		
	}
}
