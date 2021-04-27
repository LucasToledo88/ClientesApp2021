class AppClientes {

	public static void main(String[] args) {
	limpiarPantalla();
	System.out.println(" Aplicacion Listado de CLientes - Ejemplo 2 git ");
	System.out.println("=================================================\n");

	}
	
	static void limpiarPantalla() {

	try {
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

	} catch (Exception ex) {
	System.out.println(ex.getMessage());
}


}


}