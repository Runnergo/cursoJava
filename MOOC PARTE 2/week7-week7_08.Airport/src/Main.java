
// Codigos OACI aeropuertos españoles

/* 
ANDALUCÍA
---------
ALMERÍA	        LEAM 	Almería
CÁDIZ	        LEAG    Algeciras (Helipuerto)
CÁDIZ	        LERT 	Base naval de Rota
CÁDIZ	        LEJR 	Jerez
CÓRDOBA	        LEBA 	Córdoba
GRANADA	        LEGR 	Federico García Lorca
MÁLAGA	        LEMG 	Málaga-Costa del Sol
SEVILLA	        LEMO 	Base aérea de Morón
SEVILLA	        LEEC    Sevilla-El Copero (Helipuerto)
SEVILLA	        LEZL 	Sevilla-San Pablo

ARAGÓN
------
HUESCA	        LEHC 	Huesca-Pirineos
TERUEL	        LETL    Teruel
ZARAGOZA        LEZG 	Zaragoza

ASTURIAS
--------
ASTURIAS        LEAS 	Asturias

CANTABRIA
---------
CANTABRIA       LEXJ 	Santander

CASTILLA Y LEÓN
---------------
BURGOS	        LEBG 	Burgos
LEÓN	        LELN 	León
SALAMANCA       LESA 	Matacán
VALLADOLID      LEVD 	Valladolid

CASTILLA-LA MANCHA
------------------
CIUDAD REAL     LEAO	Almagro (Helipuerto)
CIUDAD REAL     LERL 	Ciudad Real Central

CATALUÑA
--------
BARCELONA       LEBL 	Barcelona-El Prat
BARCELONA       LELL 	Sabadell
GERONA          LECD    La Cerdeña
GERONA	        LEGE 	Girona-Costa Brava
TARRAGONA       LERS 	Reus

CEUTA
-----
C.A. DE CEUTA	GECE 	Ceuta (Helipuerto)

MELILLA
-------
C.A. DE MELILLA	GEML 	Melilla

C. VALENCIANA
-------------
ALICANTE	LEAL 	Alicante-Elche
CASTELLÓN	LECN 	Castellón
CASTELLÓN	LEDS	Castellón-Costa Azahar
VALENCIA	LEBT	Valencia-Betera (Helipuerto)
VALENCIA	LERE	Requena
VALENCIA	LEVC 	Valencia

EXTREMADURA
-----------
EXTREMADURA	LEBZ 	Badajoz

GALICIA
-------
LA CORUÑA	LECO 	A Coruña
LA CORUÑA	LEST 	Santiago de Compostela
PONTEVEDRA	LEVX 	Vigo-Peinador

ISLAS BALEARES
--------------
IBIZA	        LEIB 	Ibiza
MALLORCA	LEPA 	Palma de Mallorca-Son Sant Joan
MALLORCA	LESB	Son Bonet
MENORCA	        LEMH 	Menorca
MENORCA	        LESL	San Luis

ISLAS CANARIAS
--------------
FUERTEVENTURA	GCFV 	Fuerteventura
EL HIERRO	GCHI 	El Hierro
LA PALMA	GCLA 	La Palma
GRAN CANARIA	GCLP 	Gran Canaria-Gando
LA GOMERA	GCGM 	La Gomera
LANZAROTE	GCRR 	Lanzarote
TENERIFE	GCTS 	Tenerife Sur-Reina Sofía
TENERIFE	GCXO 	Tenerife Norte-Los Rodeos
TENERIFE	GCXM	Tenerife Norte-Los Rodeos (Helipuerto)

LA RIOJA
--------
LA RIOJA	LELO 	Logroño-Agoncillo (Helipuerto)
LA RIOJA	LERJ 	Logroño-Agoncillo

C. DE MADRID
------------
MADRID	        LECV	Madrid-Colmenar Viejo (Helipuerto)
MADRID	        LECU 	Madrid-Cuatro Vientos
MADRID    	LEGT	Base aérea de Getafe
MADRID  	LEMD 	A. Suárez Madrid-B.
MADRID  	LETO 	Madrid-Torrejón

C. MURCIANA
-----------
MURCIA          LELC 	Murcia-San Javier
MURCIA  	LERI	Alcantarilla Base Aérea

NAVARRA
-------
NAVARRA 	LEPP 	Pamplona

PAÍS VASCO
----------
ÁLAVA   	LEVT 	Vitoria
GUIPÚZCUA 	LESO 	San Sebastián
VIZCAYA 	LEBB 	Bilbao

 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        String input="1\n" + "JJ-100\n" + "110\n" + 
                     "1\n" + "GP-101\n" + "98\n" +
                     "2\n" + "JJ-100\n" + "LEBL\n" + "LEZG\n" +
                     "2\n" + "GP-101\n" + "LEGE\n" + "LERS\n" +
                     "x\n" +              
                     "1\n" + "2\n" + 
                     "3\n" + "GP-101\n" +
                     "x\n";
        
        // Entrada automatica de datos (sustituir Scanner)
        // Scanner reader = new Scanner(input);      
        Scanner reader = new Scanner(System.in);
        Airport airport = new Airport();
        InterfaceFlight inicio = new InterfaceFlight(reader, airport);
        inicio.airportPanel();

    }
}
