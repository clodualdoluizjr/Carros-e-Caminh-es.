
public class Executa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Carro C1 = new Carro();
		Caminhao CP1 = new Caminhao();

		// Carro
		C1.setModelo("UNO");
		C1.setCor("Preto");
		C1.setAno("2017");
		C1.setPotencia(70);
		System.out.println("Carro");
		System.out.println("O modelo deste carro é : " + C1.getModelo());
		System.out.println("A cor deste carro é : " + C1.getCor());
		System.out.println("O ano deste carro é : " + C1.getAno());
		System.out.println("A potência deste carro é : " + C1.getPotencia() );

		System.out.println("-------------------");
		// Caminhão
		CP1.setPeso(2500);
		CP1.setComprimento(25);
		CP1.setPdaCarga(500);
		CP1.setPotencia(200);
		System.out.println("Caminhão");
		System.out.println("O peso deste caminhão é : " + CP1.getPeso());
		System.out.println("O comprimento deste caminhão é : " + CP1.getComprimento());
		System.out.println("O peso da Carga é igual a : " + CP1.getPdaCarga());
		System.out.println("A potência deste caminhão é : " + CP1.getPotencia());
		

	}

}
