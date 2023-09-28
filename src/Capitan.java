import java.util.ArrayList;

/**
 * La clase Capitan representa a un capitán dentro de un batallón militar.
 * Un capitán puede tener tenientes bajo su mando y tiene atributos como nombre,
 * formación de combate, ataque, velocidad y defensa.
 */
public class Capitan extends Batallon {

    /**
     * ArrayList que almacena los tenientes que están bajo el mando del capitán.
     */
    ArrayList<Batallon> arregloSoldado = new ArrayList<>();

    /**
     * Constructor de la clase Capitan.
     *
     * @param tab             La etiqueta del capitán.
     * @param color           El color asociado al capitán.
     * @param name            El nombre del capitán.
     * @param formacionCombate La formación de combate del capitán.
     */
    public Capitan(String tab, String color, String name, String formacionCombate) {
        this.formacionCombate = formacionCombate;
        this.nameID = name;
        this.tab = tab;
        this.color = color;
        description = "Capitán";
        this.tipoDeSoldado= "Capitan";
    }

    /**
     * Constructor sin parámetros de la clase Capitan.
     */
    public Capitan() {
    }

    /**
     * Agrega un teniente al arregloSoldado del capitán y establece la misma formación de combate.
     *
     * @param teniente El teniente a agregar al arregloSoldado.
     */
    @Override
    public void addSoldado(Batallon teniente) {
        teniente.setFormacionCombate(this.formacionCombate);
        arregloSoldado.add(teniente);
    }

    /**
     * Establece la formación de combate del capitán.
     *
     * @param formacionCombate La formación de combate a establecer.
     */
    @Override
    public void setFormacionCombate(String formacionCombate) {
        this.formacionCombate = formacionCombate;
    }

    /**
     * Obtiene la formación de combate del capitán.
     *
     * @return La formación de combate del capitán.
     */
    @Override
    public String getFormacion() {
        return formacionCombate;
    }

    /**
     * Obtiene el valor de ataque del capitán.
     *
     * @return El valor de ataque del capitán.
     */
    @Override
    public int getAtaque() {
        return ataque;
    }

    /**
     * Obtiene el valor de velocidad del capitán.
     *
     * @return El valor de velocidad del capitán.
     */
    @Override
    public int getVelocidad() {
        return velocidad;
    }

    /**
     * Obtiene el valor de defensa del capitán.
     *
     * @return El valor de defensa del capitán.
     */
    @Override
    public int getDefensa() {
        return defensa;
    }

    /**
     * Obtiene el nombre del capitán.
     *
     * @return El nombre del capitán.
     */
    @Override
    public String getNameID() {
        return this.nameID;
    }

    /**
     * Obtiene la descripción del capitán.
     *
     * @return La descripción del capitán.
     */
    @Override
    public String getDescription() {
        return description;
    }

    /**
     * Obtiene el armamento del capitán.
     *
     * @return El armamento del capitán.
     */
    @Override
    public String getArmament() {
        return armas;
    }

    /**
     * Imprime la información del capitán y sus tenientes.
     *
     * @param capitan Método que imprime todos los datos del capitán, inclutendo su formación.
     */
    @Override
    public void print(Batallon capitan) {
        System.out.print(color + "Nombre: " + "**" + capitan.getNameID() + "**. ");
        System.out.println("\nDescripción: " + capitan.getDescription() + "." +
                "\nAtaque: " + capitan.getAtaque() + "." +
                "\nVelocidad: " + capitan.getVelocidad() + "." +
                "\nDefensa: " + capitan.getDefensa() + "." +
                "\nFormación: " + capitan.getFormacion() + "." + "\n");
        for (Batallon soldado : arregloSoldado) {
            soldado.print(soldado);
        }
    }

    /**
     * Método que imprime todos los datos del capitán creado, a diferencia del método print, este no imprime
     *               la formación de combate ya que al momento de crearlo, no se le asigna una.
     * @param capitan Recibe el capitan creado a imprimir.
     */
    @Override
    public void printForCreateSoldier(Batallon capitan) {
        System.out.print(color + "Nombre: " + "**" + capitan.getNameID() + "**. ");
        System.out.println("\nDescripción: " + capitan.getDescription() + "." +
                "\nAtaque: " + capitan.getAtaque() + "." +
                "\nVelocidad: " + capitan.getVelocidad() + "." +
                "\nDefensa: " + capitan.getDefensa() + ".");
        for (Batallon soldado : arregloSoldado) {
            capitan.print(soldado);
        }
    }
}
