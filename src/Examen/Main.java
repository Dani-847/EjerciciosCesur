import model.Manuscrito;
import model.dao.ManuscritoDAO;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;

import model.Grimorio;
import model.ManuscritoMaldito;
import model.Profecia;
import model.TratadoAlquimico;

public class Main {
    private static int idCnt = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        ManuscritoDAO dao = new ManuscritoDAO();
        Set<Manuscrito> manuscritos = new LinkedHashSet<>(dao.getManuscritos());
        Optional<Integer> maxId = manuscritos.stream()
                .map(Manuscrito::getId)
                .max(Integer::compareTo);
        idCnt = maxId.orElse(0) + 1;

        do {
            System.out.println();
            System.out.println("--- El Archivo de las Sombras ---");
            System.out.println("1. Dar de alta manuscrito");
            System.out.println("2. Eliminar manuscrito");
            System.out.println("3. Listar todos los manuscritos");
            System.out.println("4. Mostrar manuscritos consultables");
            System.out.println("5. Filtrar manuscritos por tipo");
            System.out.println("6. Actualizar manuscrito");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1 -> {
                    System.out.print("Tipo (Grimorio, Profecía, Tratado, Maldito): ");
                    String tipo = sc.nextLine();
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();
                    System.out.print("Autor: ");
                    String autor = sc.nextLine();
                    System.out.print("Año: ");
                    int anio = Integer.parseInt(sc.nextLine());
                    System.out.print("Nivel de acceso: ");
                    String nivelAcceso = sc.nextLine();

                    Manuscrito nuevo = null;
                    if (tipo.equalsIgnoreCase("Grimorio")) {
                        System.out.print("Nivel de peligro: ");
                        String nivelPeligro = sc.nextLine();
                        nuevo = new Grimorio(idCnt++, titulo, autor, anio, nivelAcceso, nivelPeligro);
                    } else if (tipo.equalsIgnoreCase("Profecía")) {
                        System.out.print("¿Está descifrada? (true/false): ");
                        boolean estaDescifrada = Boolean.parseBoolean(sc.nextLine());
                        nuevo = new Profecia(idCnt++, titulo, autor, anio, nivelAcceso, estaDescifrada);
                    } else if (tipo.equalsIgnoreCase("Tratado")) {
                        System.out.print("¿Está completo? (true/false): ");
                        boolean estaCompleto = Boolean.parseBoolean(sc.nextLine());
                        nuevo = new TratadoAlquimico(idCnt++, titulo, autor, anio, nivelAcceso, estaCompleto);
                    } else if (tipo.equalsIgnoreCase("Maldito")) {
                        System.out.print("¿Está sellado? (true/false): ");
                        boolean estaSellado = Boolean.parseBoolean(sc.nextLine());
                        nuevo = new ManuscritoMaldito(idCnt++, titulo, autor, anio, nivelAcceso, estaSellado);
                    } else {
                        System.out.println("Tipo de manuscrito no reconocido.");
                    }

                    if (nuevo != null && manuscritos.add(nuevo)) {
                        System.out.println("Manuscrito agregado correctamente.");
                    } else {
                        System.out.println("El manuscrito ya existe o no se pudo agregar.");
                    }
                }

                case 2 -> {
                    System.out.print("ID del manuscrito a eliminar: ");
                    int idEliminar = sc.nextInt();
                    if (manuscritos.removeIf(m -> m.getId() == idEliminar)) {
                        System.out.println("Manuscrito eliminado correctamente.");
                    } else {
                        System.out.println("No se encontró el manuscrito.");
                    }
                }

                case 3 -> {
                    for (Manuscrito m : manuscritos) {
                        System.out.println(m);
                    }
                }

                case 4 -> {
                    for (Manuscrito m : manuscritos) {
                        if (m.esConsultable()) {
                            System.out.println(m);
                        }
                    }
                }

                case 5 -> {
                    System.out.print("Tipo a filtrar (grimorio/profecia/tratado/maldito): ");
                    String tipoFiltro = sc.nextLine();
                    for (Manuscrito m : manuscritos) {
                        if (m.getTipo().equalsIgnoreCase(tipoFiltro)) {
                            System.out.println(m);
                        }
                    }
                }

                case 6 -> {
                    System.out.print("ID del manuscrito a actualizar: ");
                    int idActualizar = sc.nextInt();
                    Manuscrito mActualizar = manuscritos.stream()
                            .filter(m -> m.getId() == idActualizar)
                            .findFirst()
                            .orElse(null);

                    if (mActualizar != null) {
                        System.out.print("Nuevo título: ");
                        String nuevoTitulo = sc.nextLine();
                        System.out.print("Nuevo autor: ");
                        String nuevoAutor = sc.nextLine();
                        System.out.print("Nuevo año: ");
                        int nuevoAnio = Integer.parseInt(sc.nextLine());
                        System.out.print("Nuevo nivel de acceso: ");
                        String nuevoNivelAcceso = sc.nextLine();
                        System.out.println("Tipo (Grimorio, Profecía, Tratado, Maldito): ");
                        String nuevoTipo = sc.nextLine();

                        Manuscrito nuevoManuscrito = null;

                        if (nuevoTipo.equalsIgnoreCase("Grimorio")) {
                            System.out.print("Nuevo nivel de peligro: ");
                            String nuevoNivelPeligro = sc.nextLine();
                            nuevoManuscrito = new Grimorio(mActualizar.getId(), nuevoTitulo, nuevoAutor, nuevoAnio, nuevoNivelAcceso, nuevoNivelPeligro);
                        } else if (nuevoTipo.equalsIgnoreCase("Profecía")) {
                            System.out.print("¿Está descifrada? (true/false): ");
                            boolean descifrada = Boolean.parseBoolean(sc.nextLine());
                            nuevoManuscrito = new Profecia(mActualizar.getId(), nuevoTitulo, nuevoAutor, nuevoAnio, nuevoNivelAcceso, descifrada);
                        } else if (nuevoTipo.equalsIgnoreCase("Tratado")) {
                            System.out.print("¿Está completo? (true/false): ");
                            boolean nuevoCompleto = Boolean.parseBoolean(sc.nextLine());
                            nuevoManuscrito = new TratadoAlquimico(mActualizar.getId(), nuevoTitulo, nuevoAutor, nuevoAnio, nuevoNivelAcceso, nuevoCompleto);
                        } else if (nuevoTipo.equalsIgnoreCase("Maldito")) {
                             System.out.print("¿Está sellado? (true/false): ");
                             boolean nuevoSellado = Boolean.parseBoolean(sc.nextLine());
                             nuevoManuscrito = new ManuscritoMaldito(mActualizar.getId(), nuevoTitulo, nuevoAutor, nuevoAnio, nuevoNivelAcceso, nuevoSellado);
                        } else {
                            System.out.println("Tipo de manuscrito no reconocido.");
                        }

                        if (nuevoManuscrito != null) {
                            manuscritos.remove(mActualizar);
                            manuscritos.add(nuevoManuscrito);
                            System.out.println("Manuscrito actualizado correctamente.");
                        }
                    } else {
                        System.out.println("Manuscrito no encontrado.");
                    }
                }

                case 0 -> {
                    System.out.println("Saliendo del archivo. Que los dioses antiguos te guarden...");
                }

                default -> {
                    System.out.println("Opción no válida.");
                }
            }
        } while (opcion != 0);

        sc.close();
        //a
    }
}