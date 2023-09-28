public abstract class ArmamentoDecorator extends Batallon {

    Batallon soldadoDecorado;

    abstract public String getDescription();

    abstract public int getAtaque();

    abstract public int getVelocidad();

    abstract public int getDefensa();

    abstract public String getFormacion();

    abstract public void print(Batallon soldado);
    
    abstract public void printForCreateSoldier(Batallon soldado);

    abstract public void setFormacionCombate(String formacionCombate);

    abstract public String getNameID();

    abstract public String getTipoDeSoldado();

}
