public class ArmaduraDeGrafeno extends ArmamentoDecorator {
	
	public ArmaduraDeGrafeno(){
		this.soldadoDecorado = new Soldado();
	}

    public ArmaduraDeGrafeno(Batallon soldadoDecorado) {
        this.soldadoDecorado = soldadoDecorado;
    }

    @Override
    public int getDefensa() {
        return soldadoDecorado.getDefensa() + 3;
    }
    @Override
    public String getTipoDeSoldado(){
        return soldadoDecorado.getTipoDeSoldado();
    }

    @Override
    public String getDescription() {
        return soldadoDecorado.getDescription() + " + Armadura de Grafeno";
    }

    @Override
    public int getAtaque() {
        return soldadoDecorado.getAtaque();
    }

    @Override
    public int getVelocidad() {
        return soldadoDecorado.getVelocidad() - 1;
    }

    @Override
    public void setFormacionCombate(String formacionCombate) {
        soldadoDecorado.setFormacionCombate(formacionCombate);
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
