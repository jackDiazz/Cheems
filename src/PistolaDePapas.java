public class PistolaDePapas extends ArmamentoDecorator {

	public PistolaDePapas(){
		this.soldadoDecorado = new Soldado(); 
	}

    public PistolaDePapas(Batallon soldadoDecorado) {
        this.soldadoDecorado = soldadoDecorado;
    }

    @Override
    public int getDefensa() {
        return soldadoDecorado.getDefensa() - 1;
    }

    @Override
    public String getDescription() {
        return soldadoDecorado.getDescription() + " + Pistola de papas";
    }
    @Override
    public String getTipoDeSoldado(){
        return soldadoDecorado.getTipoDeSoldado();
    }

    @Override
    public int getAtaque() {
        return soldadoDecorado.getAtaque() + 2;
    }

    @Override
    public void setFormacionCombate(String formacionCombate) {
        soldadoDecorado.setFormacionCombate(formacionCombate);
    }

    @Override
    public int getVelocidad() {
        return soldadoDecorado.getVelocidad();
    }

    @Override
    public String getFormacion() {
        return soldadoDecorado.getFormacion();
    }

    @Override
    public void print(Batallon soldado) {
        soldadoDecorado.print(soldado);
    }

    @Override
    public String getNameID() {
        return soldadoDecorado.getNameID();
    }

    @Override
    public void printForCreateSoldier(Batallon soldado) {        
        soldadoDecorado.printForCreateSoldier(soldado);

    }
}
