public class RashoLaser extends ArmamentoDecorator {

    public RashoLaser(Batallon soldadoDecorado){
        this.soldadoDecorado=soldadoDecorado;
    }
    @Override
    public int getDefensa(){
        return soldadoDecorado.getDefensa();
    }
    @Override
    public String getDescription(){
        return soldadoDecorado.getDescription()+"+ Rasho Laser";
    }
    @Override
    public int getAtaque(){
        return soldadoDecorado.getAtaque()+2;
    }
    @Override
    public String getTipoDeSoldado(){
        return soldadoDecorado.getTipoDeSoldado();
    }
    @Override
    public int getVelocidad(){
        return soldadoDecorado.getVelocidad()-1;
    }
    @Override
    public void print(Batallon soldado){
        soldadoDecorado.print(soldado);
    }
    @Override
    public String getNameID(){
        return soldadoDecorado.getNameID();
    }
    @Override
    public String getFormacion() {
        return soldadoDecorado.getFormacion();
    }
    @Override
    public void printForCreateSoldier(Batallon soldado) {
        soldadoDecorado.printForCreateSoldier(soldado);

    }
    @Override
    public void setFormacionCombate(String formacionCombate) {
        soldadoDecorado.setFormacionCombate(formacionCombate);
    }
}
