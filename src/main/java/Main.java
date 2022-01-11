import Entidades.Jugador;
import Entidades.Pregunta;
import Persistencia.JugadorDao;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Categoría historia de Colombia

        Pregunta pregunta1 = new Pregunta("¿Cuál fue el primer presidente de Colombia?", "Historia de Colombia", "A. Rafael Núñez", "B. Simón Bolívar", "C. Tomás Cipriano de Mosquera", "D. Francisco de Paula Santander", "b");
        Pregunta  pregunta2 = new Pregunta( "¿En qué año se consolidó Colombia como estado?", "Historia de Colombia", "A. 1810", "B. 1800", "C. 1795", "D. 1910", "a");
        Pregunta  pregunta3 = new Pregunta( "¿Cuál de estos no fue un nombre de Colombia?", "Historia de Colombia", "A. La gran Colombia", "B. Confederación Granadina", "C. República de Granada", "D. República de Colombia", "c");
        Pregunta  pregunta4 = new Pregunta( "¿Cuál es el principal producto de exportación de Colombia?", "Historia de Colombia", "A. Petróleo", "B. Banano", "C. Flores", "D. Cafe ", "a");
        Pregunta  pregunta5 = new Pregunta( "¿Cuál es el ave nacional de Colombia?", "Historia de Colombia", "A. El Cóndor de los Andes", "B. Tucán del caribe", "C. El aguila", "D. La golondrina ", "a");

        // Categoría historia de Cultura general

        Pregunta  pregunta6 = new Pregunta( "¿Cuál es el río más largo del mundo?", "Cultura general", "A. El río amazonas", "B. El río nilo", "C. El río danubio", "D. El río Mississippi", "a");
        Pregunta  pregunta7 = new Pregunta( "¿Cuánto duró la guerra de los 100 años?", "Cultura general", "A. 116 años", "B. 100 años", "C. 110 años", "D. 105 años", "a");
        Pregunta  pregunta8 = new Pregunta( "¿Cuál es el deporte más practicado del mundo?", "Cultura general", "A. El fútbol", "B. La natación", "C. El baloncesto", "D. El béisbol", "b");
        Pregunta  pregunta9 = new Pregunta( "¿Cuántos huesos tiene en total un ser humano?", "Cultura general", "A. 180", "B. 400", "C. 200", "D. 206", "d");
        Pregunta  pregunta10 = new Pregunta( "¿En qué año fue el descubrimiento de América?", "Cultura general", "A. 1512", "B. 1482", "C. 1492 ", "D. 1530", "c");

        // Categoría Ciencia Básica

        Pregunta  pregunta11 = new Pregunta( "¿Qué tipo de animales son los murciélagos?", "Ciencia Básica", "A. Mamíferos", "B. Aves", "C. Reptiles", "D. Anfibios", "a");
        Pregunta  pregunta12 = new Pregunta( "¿En la botánica el tomate es?", "Ciencia Básica", "A. una verdura", "B. Una fruta", "C. Una hortaliza", "D. Una legumbre", "b");
        Pregunta  pregunta13 = new Pregunta( "¿Cuál es el nombre de las partículas subatómicas de carga negativa?", "CCiencia Básica", "A. Electrones", "B. Protones", "C. Neutrones", "D. Negatrones", "a");
        Pregunta  pregunta14 = new Pregunta( "¿Cuál es el elemento más abundante de la Tierra?", "Ciencia Básica", "A. El oxígeno", "B. El nitrógeno", "C. El hidrógeno", "D. El agua", "d");
        Pregunta  pregunta15 = new Pregunta( "¿Cuántas patas tiene un arácnido?", "Ciencia Básica", "A. 4 patas", "B. 6 patas", "C. 8 patas", "D. No tiene patas", "c");

        // Categoría Eventos históricos

        Pregunta  pregunta16 = new Pregunta( "¿Cuál fue la causa inmediata de la primera guerra mundial?", "Eventos históricos", "A. 23", "B. 22", "C. 12", "D. 9", "c");
        Pregunta  pregunta17 = new Pregunta( "¿Cuál fue el último emperador romano de Occidente?", "Eventos históricos", "A. Flavio Zenón", "B. Julio Nepote", "C. Marco Aurelio", "D. Rómulo Augusto", "d");
        Pregunta  pregunta18 = new Pregunta( "¿Cuál se considera la mayor contienda bélica de la historia?", "Eventos históricos", "A. La primera Guerra mundial", "B. La segunda Guerra mundial ", "C. La Guerra de Siria", "D. La Guerra Fría", "b");
        Pregunta  pregunta19 = new Pregunta( "¿La caída del muro de Berlín representa además?", "Eventos históricos", "A. El fin de la guerra fría", "B. El fin de la segunda guerra mundial", "C. La unificación de francia en un solo país nuevamente", "D. El fin del capitalismo", "a");
        Pregunta  pregunta20 = new Pregunta( "¿El evento conocido como el asalto de la moneda tuvo lugar en ?", "Eventos históricos", "A. Francia", "B. Chile", "C. Estados unidos", "D. Argentina", "b");

        // Categoría Videojuegos

        Pregunta  pregunta21 = new Pregunta( "¿Qué equipo es campeón actual de League of Legends World Championship, también conocido como Worlds?", "Categoría Videojuegos", "A. SK Telecom T1 ", "B.Edward Gaming", "C. Fnatic", "D.Koi", "b");
        Pregunta  pregunta22 = new Pregunta( "¿Qué jugador rompió en 2018 el récord histórico de súbditos farmeados en una partida de competitivo de League of Legends con un total de 1465?", "Categoría Videojuegos", "A. Werlyb ", "B.Faker ", "C. Rekkles", "D. Teddy", "d");
        Pregunta  pregunta23 = new Pregunta( "¿Cuál es el récord de mayor duración de una partida de League of Legends en el campo competitivo?", "Categoría Videojuegos", "A. Giants vs Fnatic - 104 minutos en 2017", "B. nvictus Gaming vs 9z Team - 98 minutos en 2019", "C. Jin Air vs SKT - 94 minutos en 2018", "D. Mad Lions vs Koi - 86 minutos en 2021", "c");
        Pregunta  pregunta24 = new Pregunta( "¿Cual es el jugador con más partidas competitivas jugados en League of Legends?", "Categoría Videojuegos", "A. Th3Antonio", "B. Faker", "C. Dopa", "D. Perkz", "b");
        Pregunta  pregunta25 = new Pregunta( "¿Qué equipo fue el primer campeón de League of Legends World Championship, también conocido como Worlds?", "Categoría Videojuegos", "A. Fnatic en 2011", "B. PSG Talón en 2011", "C. Furious Gaming en 2010", "D. G2 en 2012", "a");


        ArrayList<Pregunta> nivel1 = new ArrayList<Pregunta>();
        nivel1.add(0, pregunta1);
        nivel1.add(1, pregunta2);
        nivel1.add(2, pregunta3);
        nivel1.add(3, pregunta4);
        nivel1.add(4, pregunta5);

        ArrayList<Pregunta> nivel2 = new ArrayList<Pregunta>();
        nivel2.add(0, pregunta6);
        nivel2.add(1, pregunta7);
        nivel2.add(2, pregunta8);
        nivel2.add(3, pregunta9);
        nivel2.add(4, pregunta10);

        ArrayList<Pregunta> nivel3 = new ArrayList<Pregunta>();
        nivel3.add(0, pregunta11);
        nivel3.add(1, pregunta12);
        nivel3.add(2, pregunta13);
        nivel3.add(3, pregunta14);
        nivel3.add(4, pregunta15);

        ArrayList<Pregunta> nivel4 = new ArrayList<Pregunta>();
        nivel4.add(0, pregunta16);
        nivel4.add(1, pregunta17);
        nivel4.add(2, pregunta18);
        nivel4.add(3, pregunta19);
        nivel4.add(4, pregunta20);

        ArrayList<Pregunta> nivel5 = new ArrayList<Pregunta>();
        nivel5.add(0, pregunta21);
        nivel5.add(1, pregunta22);
        nivel5.add(2, pregunta23);
        nivel5.add(3, pregunta24);
        nivel5.add(4, pregunta25);

        Scanner scanner = new Scanner(System.in);
        Jugador jugador = new Jugador();
        Pregunta pregunta = new Pregunta();

        // Iniciar el Juego
        System.out.println("***********************************************************************");
        System.out.println("**********BIENVENIDO AL CONCURSO DE PREGUNTAS Y RESPUESTAS **********");
        System.out.println("Pon a prueba tus conocimientos y gana maravillosos premios");
        System.out.println("");
        System.out.println("Ingresa tu nombre:");
        jugador.setNombre(scanner.nextLine());
        System.out.println("");
        System.out.println("Bienvenido al juego: " + jugador.getNombre() );
        System.out.println("La primera categoria de preguntas del juego es Historia de Colombia " +
                "si responde la pregunta de manera acertada usted obtendra $50 dolares " );
        pregunta.primeraRonda(nivel1);
        pregunta.segundaRonda(nivel2);
        pregunta.terceraRonda(nivel3);
        pregunta.cuartaRonda(nivel4);
        pregunta.quintaRonda(nivel5);
        pregunta.mapPuntosToPremio(jugador);
        System.out.println(jugador.getNombre() +", El dinero ganado en total es: $"+ jugador.getAcumuladoPremio()+" Gracias por jugar");
        JugadorDao.crearJugadorBD(jugador);
    }
}
