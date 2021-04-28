import java.util.List;
import java.util.ArrayList;

public class ClienteRepository {





public List<Cliente> clientes;

public ClientesRespository() {

	clientes = new ArrayList<>(); //Inferencia de tipos

	clientes.add(new cliente(1, "Diaz", "jorgito"));
	clientes.add(new cliente(2, "Toledo", "Lucas"));
	clientes.add(new cliente(3, "Hageleit", "Flaco Gay"));

}

public List<Cliente> getClientes(){
	return clientes;
	}



}