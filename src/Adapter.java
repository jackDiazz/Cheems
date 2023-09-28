public class Adapter extends Batallon{

	CheemsSoldado cheems;

	public Adapter(CheemsSoldado cheems){
		this.cheems = cheems;
		this.nameID = "Cheems";
		this.ataque = (int) cheems.getAtaqueMagico();
		this.velocidad = (int) cheems.getMovimientoMagico();
		this.defensa = (int) cheems.getDefensaMagica();
		this.armas = cheems.mostrarReliquias();
		this.formacionCombate = "Soldado raso";
		this.tab = "\t\t\t";
		this.color = "\u001B[34m";
	}

	@Override
	public void print(Batallon cheems){
		cheems.printForCreateSoldier(cheems);
	}

	@Override
	public void printForCreateSoldier(Batallon cheems){
        System.out.println("\n\t\tDescripción:" + this.nameID +
                "\n\t\tAtaque: " + cheems.getAtaque() + "." +
                "\n\t\tVelocidad: " + cheems.getVelocidad() + "." +
                "\n\t\tDefensa: " + cheems.getDefensa() + "." +
                "\n\t\tFormación: " + cheems.getFormacion() + "." + "\n");
	}
}
