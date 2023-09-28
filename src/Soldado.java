import java.util.Iterator;

/**
 * La clase Soldado representa a un soldado raso dentro de un batallón militar.
 * Un soldado tiene atributos como nombre, ataque, velocidad y defensa.
 */
public class Soldado extends Batallon {

    /**
     * Constructor de la clase Soldado.
     *
     * @param tab   La tabulación para la impresión en consola.
     * @param color El color para la impresión en consola.
     * @param name  El nombre del soldado.
     */
    public Soldado(String tab, String color, String name) {
        this.nameID = name;
        this.tab = tab;
        this.color = color;
        description = "Soldado raso";
    }

    /**
     * Constructor de la clase Soldado.
     */
	public Soldado(){
	}
   
    /**
     * Establece la formación de combate del soldado.
     *
     * @param formacionCombate La formación de combate a establecer.
     */
    @Override
    public void setFormacionCombate(String formacionCombate) {
        this.formacionCombate = formacionCombate;
    }

    /**
     * Obtiene el valor de ataque del soldado.
     *
     * @return El valor de ataque del soldado.
     */
    @Override
    public int getAtaque() {
        return ataque;
    }

    /**
     * Obtiene el valor de velocidad del soldado.
     *
     * @return El valor de velocidad del soldado.
     */
    @Override
    public int getVelocidad() {
        return velocidad;
    }

    /**
     * Obtiene el valor de defensa del soldado.
     *
     * @return El valor de defensa del soldado.
     */
    @Override
    public int getDefensa() {
        return defensa;
    }

    /**
     * Obtiene el nombre del soldado.
     *
     * @return El nombre del soldado.
     */
    @Override
    public String getNameID() {
        return nameID;
    }

    /**
     * Obtiene la descripción del soldado.
     *
     * @return La descripción del soldado.
     */
    @Override
    public String getDescription() {
        return description;
    }

    /**
     * Obtiene la formación de combate del soldado.
     *
     * @return La formación de combate del soldado.
     */
    @Override
    public String getFormacion() {
        return formacionCombate;
    }

    /**
     * Obtiene el armamento del soldado.
     *
     * @return El armamento del soldado.
     */
    @Override
    public String getArmament() {
        return armas;
    }

    /**
     * Imprime la información del soldado.
     *
     * @param soldado El soldado cuya información se va a imprimir.
     */
    @Override
    public void print(Batallon soldado) {
        System.out.print(tab + color + "**" + soldado.getNameID() + "**: ");
        System.out.println("\n\t\t\tDescripción: " + soldado.getDescription() + "." +
                "\n\t\t\tAtaque: " + soldado.getAtaque() + "." +
                "\n\t\t\tVelocidad: " + soldado.getVelocidad() + "." +
                "\n\t\t\tDefensa: " + soldado.getDefensa() + "." +
                "\n\t\t\tFormación: " + soldado.getFormacion() + "." + "\n");
    }

    /**
     * Método que imprime todos los datos del Soldado creado, a diferencia del método print, este no imprime
     *               la formación de combate ya que al momento de crearlo, no se le asigna una.  
     *
     * @param soldado Recibe el Soldado creado*/
    @Override
    public void printForCreateSoldier(Batallon soldado) {
        System.out.print(color + "Nombre: " + "**" + soldado.getNameID() + "**. ");
        System.out.println("\nDescripción: " + soldado.getDescription() + "." +
                "\nAtaque: " + soldado.getAtaque() + "." +
                "\nVelocidad: " + soldado.getVelocidad() + "." +
                "\nDefensa: " + soldado.getDefensa() + ".");
    }
    @Override
    public String getTipoDeSoldado(){
        return this.tipoDeSoldado;
    }

}
