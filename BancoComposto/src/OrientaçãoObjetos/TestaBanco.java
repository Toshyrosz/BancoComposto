package OrientaçãoObjetos;

public class TestaBanco {

	public static void main(String[] args) {
		Cliente daniel= new Cliente();
		daniel.nome= "daniel venancio";
		daniel.cpf= "222.222.222-22";
		daniel.profissao = "programador";
		
		Conta contaDaniel = new Conta();
		contaDaniel.deposita(100);
		
		
		contaDaniel.titular = daniel;
		System.out.println(contaDaniel.titular.nome);
	}

}
