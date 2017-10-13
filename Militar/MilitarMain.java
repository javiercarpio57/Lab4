public class MilitarMain {
	public static void main(String[] args) {

		//Teniente
		Teniente teniente = new Teniente();
		teniente.tomaOrdenCoronel("Javier");
		System.out.println("----------------------------------------------------------");

		//General
		General general = new General();
		System.out.println("Los dias de vacaciones del General es: " + general.getDiasVacaciones() + " dias");
		System.out.println("El formulario de vacaciones del General es de color: " + general.getFormularioVacaciones());
		System.out.print("La planificaciones: ");
		general.planificaEstrategia();
		System.out.println("----------------------------------------------------------");

		//Coronel
		Coronel coronel = new Coronel();
		System.out.println("El salario del coronel es: " + coronel.getSalario());
		coronel.ejecutaOrdenManiobra();
		System.out.println("----------------------------------------------------------");

		//Soldado
		Soldado soldado = new Soldado();
		System.out.println("Las horas de trabajo del soldado es: " + soldado.getHoras());
		System.out.println("El salario del soldado es: " + soldado.getSalario());
		System.out.println("Las vacaciones del soldado son: " + soldado.getDiasVacaciones());
		System.out.println(soldado.recibeOrden());
		System.out.println("----------------------------------------------------------");



	}
}