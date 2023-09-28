public class EspadaGiganteAnime extends ArmamentoDecorator {
    public EspadaGiganteAnime(Batallon soldadoDecorado) {
        this.soldadoDecorado = soldadoDecorado;
    }

    @Override
    public String getNameID() {
        return soldadoDecorado.getNameID();
    }

    @Override
    public int getDefensa() {
        return soldadoDecorado.getDefensa() - 1;
    }
    @Override
    public String getTipoDeSoldado(){
        return soldadoDecorado.getTipoDeSoldado();
    }
    @Override
    public String getDescription() {
        return soldadoDecorado.getDescription() + " + Espada gigante de Anime uwu";
    }

    @Override
    public int getAtaque() {
        return soldadoDecorado.getAtaque() + 3;
    }

    @Override
    public int getVelocidad() {
        return soldadoDecorado.getVelocidad();
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
    public void printForCreateSoldier(Batallon soldado) {
        soldadoDecorado.printForCreateSoldier(soldado);

    }

}
