
public class FabricaDeCarro {
	private static FabricaDeCarro instance = new FabricaDeCarro();

	private FabricaDeCarro() {
	}

	public static FabricaDeCarro getInstance() {
		return instance;
	}

	public void fabricar() {
		System.out.println("Novo carro fabricado!");
	}
}
