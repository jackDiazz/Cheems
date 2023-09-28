import java.util.Scanner;

/**
 * Clase Batallon funciona como "Component" del patrón Decorator
 * declara una clase abstracta común tanto para los objetos Decoradores
 * como para los objetos a decorar.
 */
public abstract class Batallon {
    public String nameID;
    public String description = "soldado desconocido";
    public String tab;
    public String color;
    public int ataque = 1;
    public int velocidad = 1;
    public int defensa = 1;
    public String armas;
    public String formacionCombate;
    public boolean fueIronCheems = false;
    //Variable para guardar el tipo de soldado, se usa para Capitan y Cheems
    public String tipoDeSoldado;
    //Colores de personalización de la terminal
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String BLUE = "\u001B[34m";
    public static final String YELLOW = "\u001B[33m";
    public static final String NEG = "\u001b[1m";
    public static final String CYAN = "\u001b[36m";

    /**
     * Método para agregar soldados a un arreglo
     * @param soldado
     */
    public void addSoldado(Batallon soldado) {
        throw new UnsupportedOperationException();
    }
    /**
     * Método para obtener la formacion de combate del soldado, teniente o capitán
     * 
     * @return formacion de combate del personaje
     */
    public String getFormacion() {
        return this.formacionCombate;
    }
    
    /**
     * Método para obtener el tipo de soldado que es
     * @return
     */
    public String getTipoDeSoldado(){
        return this.tipoDeSoldado;
    }
    /**
     * Método para obtener la descripción del soldado
     * @return
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * Método para colocar la formación de combate
     * @param object
     */
    public void setFormacionCombate(String object) {

    }

    /**
     * Método para obtener el nombre(ID) del soldado,teniente o capitán
     * 
     * @return nombre(ID)
     */
    public String getNameID() {
        return this.nameID;
    }
    /**
     * Método para colocar el nombre 
     * @param nameID
     */
    public void setNameID(String nameID) {
        this.nameID = nameID;
    }

    /**
     * Método para obtener qué armas tiene el soldado,teniente o capitán
     * 
     * @return las armas
     */
    public String getArmament() {
        return this.armas;
    }

    /**
     * Método para obtener los puntos de ataque que tiene el soldado, teniente o
     * capitán
     * 
     * @return puntos de ataque
     */
    public int getAtaque() {
        return this.ataque;
    }

    /**
     * Método para obtener los puntos de velocidad
     * 
     * @return puntos de velocidad
     */
    public int getVelocidad() {
        return this.velocidad;
    }

    /**
     * Método para obtener los puntos de defensa del personaje
     * 
     * @return puntos de defensa
     */
    public int getDefensa() {
        return this.defensa;
    }

    /**
     * Método para imprimir todos los detalles del soldado, teniente o capitán
     * 
     * @param soldado recibe un objeto de tipo Batallon, puede ser soldado, teniente
     *                o capitan
     */
    abstract public void print(Batallon soldado);

    /**
     * Método para imprimir todos los detalles (sin la formación) del soldado, teniente o capitán
     */
    abstract void printForCreateSoldier(Batallon soldado);
        /**
     * Método para colocar todas las armas (que el usuario quiera) al soldado
     * @param soldado que es el personaje elegido por el usuario (capitan, teniente o soldado)
     * @return el soldado equipado de armas (o no).
     */
    public Batallon setArmament(Batallon soldado){
        int opcionUsuario=0;
        do {
         System.out.println("Selecciona el arma que quieres: ");
                System.out.println("\n0. Salir de creación."+"\n1. Armadura de Kevlar(obtienes +2 defensa,-1 velocidad)"+
                "\n2. Armadura de Grafeno (obtienes +3 defensa, -1 velocidad)."+
                "\n3. Armadura de Tanque (obtienes +5 defensa,-5 velocidad)."+
                "\n4. Espada gigante de Anime (obtienes +3 ataque, -1 defensa)."+
                "\n5. Pistola de papas (obtienes +2 ataque, -1 defensa)."+
                "\n6. Rasho Laser (obtienes +2 ataque,-1 velocidad)."+
                "\n7. Alas de Gallina (obtienes +2 velocidad, -1 defensa)."+
                "\n8. Piernas de rana gigante (obtienes +3 velocidad, -1 defensa)."+
                "\n9. Turbinas (obtienes +5 velocidad, -2 ataque).");
                if(soldado.getTipoDeSoldado()=="Capitan" && !fueIronCheems){
                    System.out.println("10. Iron Cheems (obtienes +2 ataque, +2 defensa, +2 velocidad).");
                    
                }

                    opcionUsuario=recibirOpcion();
                    switch (opcionUsuario) {
                        case 0:
                            System.out.println("\nMe alegra haberte ayudado a armar tu soldado:\n");
                            break;
                        case 1:
                            soldado= new ArmaduraDeKevlar(soldado);
                            break;
                        case 2:
                            soldado= new ArmaduraDeGrafeno(soldado);
                            break;
                        case 3:
                            soldado= new ArmaduraDeTanque(soldado);
                            break;
                        case 4:
                            soldado= new EspadaGiganteAnime(soldado);
                            break;
                        case 5:
                            soldado= new PistolaDePapas(soldado);
                            break;
                        case 6:
                            soldado= new RashoLaser(soldado);
                            break;
                        case 7:
                            soldado= new AlasDeGallina(soldado);
                            break;
                        case 8:
                            soldado= new PiernasDeRanaGigante(soldado);
                            break;
                        case 9:
                            soldado= new Turbinas(soldado);
                            break;
                        case 10:
                            if(soldado.getTipoDeSoldado()=="Capitan" && !fueIronCheems){
                                soldado= new IronCheems(soldado);
                                this.fueIronCheems=true;
                                break;
                            }else{
                                opcionUsuario=-1;
                            }
                        default:
                            System.out.println(RED+"\nEsa opción no es válida. Vuelve a elegir."+RESET);
                            break;
                    }
                    if(opcionUsuario!=0){
                        System.out.println(NEG+"\nActualmente, éste es tu soldado:"+RESET);
                        soldado.printForCreateSoldier(soldado);
                        System.out.print(RESET);
                    System.out.println(NEG+CYAN+"\n**¿Deseas seguir agregando armamento?**"+RESET);
                    System.out.println("\nSí: continua eligiendo tu armamento"+"\nNo, ya puedes mostrarme a mi soldado: Presiona 0.\n");
                    }
                } while (opcionUsuario!=0);
                return soldado;
    }
    /**
     * método para recibir una opción del usuario y validar que sea un entero.
     * EL motivo de este método es para evitar validar la condición dentro de setArmament
     * y acortar la implementación de ese método.
     * @return -1 si no se recibe una opción válida (arbitrariamente es -1)
     */

    public static int recibirOpcion(){
        Scanner sc= new Scanner(System.in);
        int opcion=0;
        try {
            opcion= sc.nextInt();
        } catch (Exception e) {
            // TODO: handle exception
            sc.nextLine();
            return -1;
        }
        return opcion;
    }

}