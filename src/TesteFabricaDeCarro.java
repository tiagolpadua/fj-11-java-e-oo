
public class TesteFabricaDeCarro {
	public static void main(String[] args) {
		// O c�digo abaixo apresenta erro pois o construtor � privado!
		// FabricaDeCarro fabricaDeCarro = new FabricaDeCarro();
		
		FabricaDeCarro fabricaDeCarro = FabricaDeCarro.getInstance();
		fabricaDeCarro.fabricar();
	}
}
