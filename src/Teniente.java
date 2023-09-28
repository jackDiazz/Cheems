import java.util.ArrayList;

/**
 * La clase Teniente representa a un teniente dentro de un batallón militar.
 * Un teniente puede tener soldados bajo su mando y tiene atributos como nombre,
 * formación de combate, ataque, velocidad y defensa.
 */
public class Teniente extends Batallon {

    /**
     * ArrayList que almacena a los soldados bajo el mando del teniente.
     */
    ArrayList<Batallon> arregloSoldado = new ArrayList<>();

    /**
     * Constructor de la clase Teniente.
     *
     * @param tab   La tabulación para la impresión en consola.
     * @param color El color para la impresión en consola.
     * @param name  El nombre del teniente.
     */
    public Teniente(String tab, String color, String name) {
        this.nameID = name;
        this.tab = tab;
        this.color = color;
        description = "Teniente";
    }

    /**
     * Constructor sin parámetros de la clase Teniente.
     */
    public Teniente() {
    }

    /**
     * Agrega un soldado al arregloSoldado del teniente.
     *
     * @param soldado El soldado a agregar al arregloSoldado.
     */
    @Override
    public void addSoldado(Batallon soldado) {
        arregloSoldado.add(soldado);
    }

    /**
     * Establece la formación de combate del teniente.
     *
     * @param formacionCombate La formación de combate a establecer.
     */
    @Override
    public void setFormacionCombate(String formacionCombate) {
        this.formacionCombate = formacionCombate;
    }

    /**
     * Obtiene el valor de ataque del teniente.
     *
     * @return El valor de ataque del teniente.
     */
    @Override
    public int getAtaque() {
        return ataque;
    }

    /**
     * Obtiene el valor de velocidad del teniente.
     *
     * @return El valor de velocidad del teniente.
     */
    @Override
    public int getVelocidad() {
        return velocidad;
    }

    /**
     * Obtiene el valor de defensa del teniente.
     *
     * @return El valor de defensa del teniente.
     */
    @Override
    public int getDefensa() {
        return defensa;
    }

    /**
     * Obtiene el nombre del teniente.
     *
     * @return El nombre del teniente.
     */
    @Override
    public String getNameID() {
        return this.nameID;
    }

    /**
     * Obtiene la descripción del teniente.
     *
     * @return La descripción del teniente.
     */
    @Override
    public String getDescription() {
        return description;
    }

    /**
     * Obtiene la formación de combate del teniente.
     *
     * @return La formación de combate del teniente.
     */
    @Override
    public String getFormacion() {
        return formacionCombate;
    }

    /**
     * Obtiene el armamento del teniente.
     *
     * @return El armamento del teniente.
     */
    @Override
    public String getArmament() {
        return armas;
    }

    /**
     * Imprime la información del teniente y sus soldados.
     *
     * @param teniente El teniente cuya información se va a imprimir.
     */
    public void print(Batallon teniente) {
        System.out.print(tab + color + "*" + teniente.getNameID() + "*: ");
        System.out.println("\n\t\tDescripción: " + teniente.getDescription() + "." +
                "\n\t\tAtaque: " + teniente.getAtaque() + "." +
                "\n\t\tVelocidad: " + teniente.getVelocidad() + "." +
                "\n\t\tDefensa: " + teniente.getDefensa() + "." +
                "\n\t\tFormación: " + teniente.getFormacion() + "." + "\n");
        for (Batallon soldado : arregloSoldado) {
            soldado.setFormacionCombate(teniente.getFormacion());
            soldado.print(soldado);
        }
    }

    /**
     * Método que imprime todos los datos del Teniente creado, a diferencia del método print, este no imprime
     *               la formación de combate ya que al momento de crearlo, no se le asigna una.
     * @param teniente El teniente cuya información se va a imprimir.
     */
    @Override
    public void printForCreateSoldier(Batallon teniente) {
        System.out.print(color + "Nombre: " + "**" + teniente.getNameID() + "**. ");
        System.out.println("\nDescripción: " + teniente.getDescription() + "." +
                "\nAtaque: " + teniente.getAtaque() + "." +
                "\nVelocidad: " + teniente.getVelocidad() + "." +
                "\nDefensa: " + teniente.getDefensa() + ".");
        for (Batallon soldado : arregloSoldado) {
            teniente.print(soldado);
        }
    }
    @Override
    public String getTipoDeSoldado(){
        return this.tipoDeSoldado;
    }
}
