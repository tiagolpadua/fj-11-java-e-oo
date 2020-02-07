
public class TesteFabricaDeCarro {
	public static void main(String[] args) {
		// O código abaixo apresenta erro pois o construtor é privado!
		// FabricaDeCarro fabricaDeCarro = new FabricaDeCarro();
		
		FabricaDeCarro fabricaDeCarro = FabricaDeCarro.getInstance();
		fabricaDeCarro.fabricar();
	}
}
