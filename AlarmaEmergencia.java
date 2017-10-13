public class AlarmaEmergencia extends Alarma{

	/**
	* @author Javier Carpio
	* @version 13.10.2017
	*/

	/**
	* Metodo que imprime 'emergencia 1'.
	*/
	public void m1() {
		System.out.println("emergencia 1");
	}

	/**
	* Metodo que imprime 'alarma 1 / timbre 1'.
	*/
	public void m2() {
		System.out.println("alarma 1 / timbre 1");
	}

	/**
	* Metodo que imprime 'emergencia' y llama el metodo toString de la clase padre, Alarma.
	*/
	public String toString() {
		return "emergencia " + super.toString();
	}
}