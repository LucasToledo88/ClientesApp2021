public class Cliente {

	private int numero;
	private String apellido;
	private String nombre;

	public Cliente() {}

	public Cliente(int_numero, String_apellido, String_nombre) {

	numero = _numero;
	apellido = _apellido;
	nombre = _nombre; 
	
	}	



	public void setNumero(int numero) {
	this.numero = numero;
	
	}
	public int getNumero(){
	return this.numero;
	
	}

	public void setApellido(String apellido) {
	this.apellido = apellido;
	
	}
	public int getApellido(){
	return this.apellido;
	
	}
	
	public void setNombre(String nombre) {
	this.nombre = nombre;
	
	}
	public int getNombre(){
	return this.nombre;
	
	}
	
	@override
public String toString() {

	return nombre + " " + apellido;
}


}





























}