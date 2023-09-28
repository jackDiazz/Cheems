import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    //Personalización de la terminal
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String BLUE = "\u001B[34m";
    public static final String YELLOW = "\u001B[33m";
    public static final String PURPLE = "\u001B[35m";
    public static final String NEG = "\u001b[1m";
    public static final String CYAN = "\u001b[36m";

    /**
     * Método main
     * @param args
     */
    public static void main(String[] args) {
        menu();
    }
    /*Método menú donde se crean los batallones y después se mandan a llamar de acuerdo a las entradas del usuario
     *
     */
    public static void menu(){
        Batallon razo1 = new Soldado("\t\t\t", BLUE, "Soldado Ricardin");
        razo1 = new AlasDeGallina(razo1);
        razo1 = new PistolaDePapas(razo1);
        razo1 = new Turbinas(razo1);

        // Soldado 2
        Batallon razo2 = new Soldado("\t\t\t", BLUE, "Soldado Mantecado");
        razo2 = new ArmaduraDeKevlar(razo2);
        razo2 = new EspadaGiganteAnime(razo2);
        razo2 = new PiernasDeRanaGigante(razo2);

        // Soldado 3
        Batallon razo3 = new Soldado("\t\t\t", BLUE, "Soldado Lyn");
        razo3 = new ArmaduraDeGrafeno(razo3);
        razo3 = new ArmaduraDeTanque(razo3);
        razo3 = new RashoLaser(razo3);

        // Soldado 4
        Batallon razo4 = new Soldado("\t\t\t", BLUE, "Soldado Squirtle");
        razo4 = new PistolaDePapas(razo4);
        razo4 = new PistolaDePapas(razo4);
        razo4 = new Turbinas(razo4);

        // Soldado 5
        Batallon razo5 = new Soldado("\t\t\t", BLUE, "Soldado Ryu");
        razo5 = new Turbinas(razo5);
        razo5 = new PistolaDePapas(razo5);
        razo5 = new Turbinas(razo5);

        // Soldado 6
        Batallon razo6 = new Soldado("\t\t\t", BLUE, "Soldado Refugio");
        razo6 = new ArmaduraDeKevlar(razo6);
        razo6 = new ArmaduraDeGrafeno(razo6);
        razo6 = new Turbinas(razo6);

        // Soldado 7
        Batallon razo7 = new Soldado("\t\t\t", BLUE, "Soldado Yeri");
        razo7 = new PiernasDeRanaGigante(razo7);
        razo7 = new PistolaDePapas(razo7);
        razo7 = new AlasDeGallina(razo7);

        // Soldado 8
        Batallon razo8 = new Soldado("\t\t\t", BLUE, "Soldado Mandarino");
        razo8 = new AlasDeGallina(razo8);
        razo8 = new ArmaduraDeGrafeno(razo8);
        razo8 = new ArmaduraDeKevlar(razo8);

        // Soldado 9
        Batallon razo9 = new Soldado("\t\t\t", BLUE, "Soldado Roberta ");
        razo9 = new ArmaduraDeKevlar(razo9);
        razo9 = new AlasDeGallina(razo9);
        razo9 = new Turbinas(razo9);

        // Soldado 10
        Batallon razo10 = new Soldado("\t\t\t", BLUE, "Soldado Cortana");
        razo10 = new PistolaDePapas(razo10);
        razo10 = new PistolaDePapas(razo10);
        razo10 = new Turbinas(razo10);

        // Soldado 11
        Batallon razo11 = new Soldado("\t\t\t", BLUE, "Soldado Silent");
        razo11 = new ArmaduraDeKevlar(razo11);
        razo11 = new ArmaduraDeGrafeno(razo11);
        razo11 = new ArmaduraDeKevlar(razo11);

        // Soldado 12
        Batallon razo12 = new Soldado("\t\t\t", BLUE, "Soldado Greasy");
        razo12 = new RashoLaser(razo12);
        razo12 = new Turbinas(razo12);
        razo12 = new Turbinas(razo12);

        // Soldado 13
        Batallon razo13 = new Soldado("\t\t\t", BLUE, "Soldado William");
        razo13 = new RashoLaser(razo13);
        razo13 = new PistolaDePapas(razo13);
        razo13 = new AlasDeGallina(razo13);

        // Soldado 14
        Batallon razo14 = new Soldado("\t\t\t", BLUE, "Soldado Blanca");
        razo14 = new ArmaduraDeKevlar(razo14);
        razo14 = new ArmaduraDeTanque(razo14);
        razo14 = new PistolaDePapas(razo14);

        // Soldado 15
        Batallon razo15 = new Soldado("\t\t\t", BLUE, "Soldado Deri");
        razo15 = new PiernasDeRanaGigante(razo15);
        razo15 = new PistolaDePapas(razo15);
        razo15 = new Turbinas(razo15);

        // Teniente 1
        Batallon teniente1 = new Teniente("\t\t", BLUE, "Teniente Nyan Cat");
        teniente1.addSoldado(razo1);
        teniente1.addSoldado(razo2);
        teniente1 = new PiernasDeRanaGigante(teniente1);
        teniente1 = new ArmaduraDeGrafeno(teniente1);
        teniente1 = new PistolaDePapas(teniente1);

        // Teniente 2
        Batallon teniente2 = new Teniente("\t\t", BLUE, "Teniente Rigo");
        teniente2.addSoldado(razo2);
        teniente2.addSoldado(razo3);
        teniente2.addSoldado(razo4);
        teniente2 = new Turbinas(teniente2);
        teniente2 = new ArmaduraDeKevlar(teniente2);
        teniente2 = new ArmaduraDeTanque(teniente2);

        // Teniente 3
        Batallon teniente3 = new Teniente("\t\t", BLUE, "Teniente Cheems");
        teniente3.addSoldado(razo5);
        teniente3.addSoldado(razo6);
        teniente3 = new Turbinas(teniente3);
        teniente3 = new RashoLaser(teniente3);
        teniente3 = new AlasDeGallina(teniente3);

        // Teniente 4
        Batallon teniente4 = new Teniente("\t\t", BLUE, "Teniente Floppa");
        teniente4.addSoldado(razo7);
        teniente4.addSoldado(razo8);
        teniente4.addSoldado(razo9);
        teniente4 = new RashoLaser(teniente4);
        teniente4 = new PiernasDeRanaGigante(teniente4);
        teniente4 = new PistolaDePapas(teniente4);

        // Teniente 5
        Batallon teniente5 = new Teniente("\t\t", BLUE, "Teniente Chiquito");
        teniente5.addSoldado(razo10);
        teniente5.addSoldado(razo11);
        teniente5.addSoldado(razo12);
        teniente5 = new PistolaDePapas(teniente5);
        teniente5 = new Turbinas(teniente5);
        teniente5 = new ArmaduraDeKevlar(teniente5);

        // Teniente 6
        Batallon teniente6 = new Teniente("\t\t", BLUE, "Teniente Inquieto");
        teniente6.addSoldado(razo13);
        teniente6.addSoldado(razo14);
        teniente6.addSoldado(razo15);
        teniente6 = new RashoLaser(teniente6);
        teniente6 = new ArmaduraDeGrafeno(teniente6);
        teniente6 = new PistolaDePapas(teniente6);

        // Crear un Capitán y agregar el Teniente como subordinado
        Batallon capitan = new Capitan("\t", BLUE, "Kirby Capitan", "Formación de combate Alfa");
        capitan.addSoldado(teniente1);
        capitan.addSoldado(teniente2);
        capitan = new IronCheems(capitan);
        capitan = new PiernasDeRanaGigante(capitan);

        Batallon capitan2 = new Capitan("\t", BLUE, "Gato Capitan", "Formación de combate Gamma");
        capitan2.addSoldado(teniente3);
        capitan2.addSoldado(teniente4);
        capitan2 = new IronCheems(capitan2);
        capitan2 = new PistolaDePapas(capitan2);

        Batallon capitan3 = new Capitan("\t", BLUE, "Cuyito Capitan", "Formación de combate Beta");
        capitan3.addSoldado(teniente5);
        capitan3.addSoldado(teniente6);
        capitan3 = new Turbinas(capitan3);
        capitan3 = new ArmaduraDeKevlar(capitan3);

		// Soldado cheems
		CuartelCheems cuartel = new CuartelCheems();
		CheemsSoldado cheems = cuartel.desplegarCheems();
		cheems.activarReliquias();
		Batallon cheemsAdaptado = new Adapter(cheems);
		boolean cheemsEquipado = false;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(NEG+PURPLE+"\n*****Bienvenido al menú del ejército*****"+RESET);
            System.out.println("Escoje una opción por favor.");
            System.out.println("1. Crear soldado (No se integra al batallón)");
            System.out.println("2. Reportar Batallones");
            System.out.println("3. Equipar a Cheems");
            System.out.println("0. Salir");
            try {
                int i = scanner.nextInt();
                switch (i) {
                    /**
                     *Aquí se despliega el menú para la creación del soldado del usuario
                     */
                    case 1:
                    try {
                        System.out.println(NEG+CYAN+"Hora de crear un soldado!");
                        System.out.print(RESET);
                        createSoldier();

                    } catch (InputMismatchException e) {
                        System.out.println("Error: Ingresa un número válido.");
                        scanner.next(); // Limpiar el búfer de entrada para evitar un bucle infinito
                    }
                        break;

                    case 2:
                        boolean verBatallon = true;
                        while (verBatallon) {
                            try {
                                System.out.println(RESET + "Bienvenido al menú del ejército");
                                System.out.println("1. Reporte Completo");
                                System.out.println("2. Reporte de Batallon 2");
                                System.out.println("3. Reporte de Soldado Mantecado");
                                System.out.println("4. Reporte de soldado Cheems");
                                System.out.println("5. Regresar al menú principal");
                                System.out.println("0. Salir");
                                int opcionBatallon = scanner.nextInt();
                                if (opcionBatallon == 1) {
                                    System.out.println("Reporte completo");
                                    capitan.print(capitan);
                                    capitan2.print(capitan2);
                                    capitan3.print(capitan3);
                                } else if (opcionBatallon == 2) {
                                    System.out.println("Reporte de batallon 2");
                                    capitan2.print(capitan2);
                                } else if (opcionBatallon == 3) {
                                    razo2.setFormacionCombate(capitan.getFormacion());
                                    razo2.print(razo2);
                                } else if (opcionBatallon == 4) {
                                    System.out.println("Reporte de soldado Cheems");
									System.out.println(cheemsAdaptado);
                                } else if (opcionBatallon == 5) {
                                    verBatallon = false;
                                } else if (opcionBatallon == 0) {
                                    System.out.println("Saliendo del programa.");
                                    scanner.close();
                                    return;
                                } else {
                                    System.out.println("Por favor selecciona una opción válida");
                                }

                            } catch (InputMismatchException e) {
                                System.out.println("Error: Ingresa un número válido.");
                                scanner.next();
                            }
                        }
                        break;

					case 3:
						try {
                        	System.out.println(NEG+CYAN+"Hora de equipar a Cheems!");
                        	System.out.print(RESET);
                        	equiparCheems(cheemsAdaptado, capitan);

                    	} catch (InputMismatchException e) {
                        	System.out.println("Error: Ingresa un número válido.");
                        	scanner.next(); // Limpiar el búfer de entrada para evitar un bucle infinito
                    	}
                        break;

                    case 0:
                        System.out.println("Saliendo del programa.");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Por favor selecciona una opción válida");
                        break;

                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingresa un número válido.");
                scanner.next(); // Limpiar el búfer de entrada para evitar un bucle infinito

            }
        }

    }
    public static void createSoldier(){
        Batallon soldado= new Soldado("\t",RED,"");
        boolean soldierCreated=false;
        int opcionUsuario=0;
        try {
                Scanner scanner= new Scanner(System.in);
                //System.out.println("Menú de creación de soldado");
                System.out.println("Por favor, ingresa el nombre de tu soldado:");
                String nombre=scanner.nextLine();
                //
                System.out.println(NEG+"\nPor favor, elige tu rol."+RESET);

                System.out.println("1. Soldado razo."+"\n2. Teniente."+"\n3. Capitan. (Ventajas: Puedes usar Iron Cheems.)"+"\n0. Salir al menú principal");


                do {
                    opcionUsuario=recibirOpcion();
                    switch (opcionUsuario) {
                        case 1:
                            soldado= new Soldado("\t\t", YELLOW, nombre);
                            soldierCreated=true;
                            break;
                        case 2:
                            soldado= new Teniente("\t\t", BLUE, nombre);
                            soldierCreated=true;
                            break;
                        case 3:
                            soldado= new Capitan("\t\t", RED , nombre,"");
                            soldierCreated=true;
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println(RED+"\nEsa opción no es válida. Vuelve a elegir."+RESET);
                            break;
                    }
                } while (opcionUsuario>3 && opcionUsuario<0);

                if(soldierCreated){
                System.out.println(CYAN+"\nAhora eres un "+ soldado.getDescription()+"!\n"+RESET);
                soldado=soldado.setArmament(soldado);
                soldado.printForCreateSoldier(soldado);
                }
        } catch (Exception e) {

            // TODO: handle exception
        }


    }

	public static void equiparCheems(Batallon cheemsAdaptado, Batallon capitan){
		boolean cheemsListo = false;
		List<Integer> opciones = new ArrayList<Integer>();
		int opcionUsuario = 0;
		try{
			do{
                System.out.println("Por favor, elige con que armas lo quieres equipar:");
				 System.out.println("1. Alas de Gallina." + "\n2. Armadura de Grafeno." + "\n3. Armadura de Kevlar." + "\n4. Armadura de Tanque." + "\n5. Espada Gigante de Anime." + "\n6. IronCheems." + "\n7. Piernas de Rana Gigante" + "\n8. Pistola de Papas." + "\n9. Rasho Laser" + "\n10. Turbinas." + "\n11. Cheems está listo.");
				 opcionUsuario = recibirOpcion();
				 switch(opcionUsuario){
					case 1:
						if(!opciones.contains(1)){
							cheemsAdaptado = new AlasDeGallina(cheemsAdaptado);
							opciones.add(1);
							System.out.println("¿Algo más?");
						} else {
							System.out.println("Ya lo equipaste con ésta opción!");
						}
						break;
				 	case 2:
						if(!opciones.contains(2)){
							cheemsAdaptado = new ArmaduraDeGrafeno(cheemsAdaptado);
							opciones.add(2);
							System.out.println("¿Algo más?");
						} else {
							System.out.println("Ya lo equipaste con ésta opción!");
						}
						break;
				 	case 3:
						if(!opciones.contains(3)){
							cheemsAdaptado = new ArmaduraDeKevlar(cheemsAdaptado);
							opciones.add(3);
						} else {
							System.out.println("Ya lo equipaste con ésta opción!");
						}
						break;
				 	case 4:
						if(!opciones.contains(4)){
							cheemsAdaptado = new ArmaduraDeTanque(cheemsAdaptado);
							opciones.add(4);
						} else {
							System.out.println("Ya lo equipaste con ésta opción!");
						}
						break;
				 	case 5:
						if(!opciones.contains(5)){
							cheemsAdaptado = new EspadaGiganteAnime(cheemsAdaptado);
							opciones.add(5);
						} else {
							System.out.println("Ya lo equipaste con ésta opción!");
						}
						break;
				 	case 6:
						if(!opciones.contains(6)){
							cheemsAdaptado = new IronCheems(cheemsAdaptado);
							opciones.add(6);
						} else {
							System.out.println("Ya lo equipaste con ésta opción!");
						}
						break;
				 	case 7:
						if(!opciones.contains(7)){
							cheemsAdaptado = new EspadaGiganteAnime(cheemsAdaptado);
							opciones.add(7);
						} else {
							System.out.println("Ya lo equipaste con ésta opción!");
						}
						break;
				 	case 8:
						if(!opciones.contains(8)){
							cheemsAdaptado = new PistolaDePapas(cheemsAdaptado);
							opciones.add(8);
						} else {
							System.out.println("Ya lo equipaste con ésta opción!");
						}
						break;
				 	case 9:
						if(!opciones.contains(9)){
							cheemsAdaptado = new RashoLaser(cheemsAdaptado);
							opciones.add(9);
						} else {
							System.out.println("Ya lo equipaste con ésta opción!");
						}
						break;
				 	case 10:
						if(!opciones.contains(10)){
							cheemsAdaptado = new Turbinas(cheemsAdaptado);
							opciones.add(10);
						} else {
							System.out.println("Ya lo equipaste con ésta opción!");
						}
						break;
				 	case 11:
						System.out.println("Tu cheems está listo");
						cheemsAdaptado.print(cheemsAdaptado);
						capitan.addSoldado(cheemsAdaptado);
            System.out.println("he llegado aquí");
						System.out.println("Cheems se ha integrado al batallón de Kirby Capitan");
						break;
					default:
                    	System.out.println(RED+"\nEsa opción no es válida. Vuelve a elegir."+RESET);
				}
			} while (cheemsListo == false);
		} catch (Exception e) {}
	}

    public static int recibirOpcion() {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        try {
            opcion = sc.nextInt();
        } catch (Exception e) {
            // TODO: handle exception
            sc.nextLine();
            return -1;
        }
        return opcion;
    }

}
