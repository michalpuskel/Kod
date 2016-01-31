/**
 * lexikograficke triedenie mien, pomocou boblesort :-)
 * Dve rovnako dlhÈ polia String[] meno, a String[] priezvisko obsahuj˙ menoslov triedy tak, 
 * ûe meno[i] a priezvisko[i] patria tej istej osobe. UtrieÔte tento menoslov lexikograficky. 
 * Hint: upravte nejak˝ algoritmus triedenia pre vaöe potreby. MÙûete poiûiù s˙bor (trieda.txt)
 * @author PB
 */
public class Class {
		  final static int MAX = 119;
		  static String[] meno = new String[MAX];
		  static String[] priezvisko = new String[MAX];
		  static { // staticky inicializacny blok
				meno[ 0 ] ="Daniel"; 	priezvisko[ 0 ]="BendÌk";
				meno[ 1 ] ="Peter"; 		priezvisko[ 1 ]="Bielik";
				meno[ 2 ] ="Pavol"; 		priezvisko[ 2 ]="Blaho";
				meno[ 3 ] ="Michal"; 	priezvisko[ 3 ]="Boöka";
				meno[ 4 ] ="Kristi·n"; 	priezvisko[ 4 ]="Cebecauer";
				meno[ 5 ] ="Filip"; 		priezvisko[ 5 ]="Earan";
				meno[ 6 ] ="Mari·n"; 	priezvisko[ 6 ]="Eern˝";
				meno[ 7 ] ="Patrik"; 	priezvisko[ 7 ]="Eirka";
				meno[ 8 ] ="Martin"; 	priezvisko[ 8 ]="Iatko";
				meno[ 9 ] ="Miroslav"; 	priezvisko[ 9 ]="Farkaö";
				meno[  10 ] ="Matej"; 		priezvisko[  10 ]="Ft·enik";
				meno[  11 ] ="Jakub"; 		priezvisko[  11 ]="J·noöka";
				meno[  12 ] ="Anna"; 		priezvisko[  12 ]="Machovieov·";
				meno[  13 ] ="Tom·ö"; 		priezvisko[  13 ]="Mat˙öek";
				meno[  14 ] ="Michal"; 	priezvisko[  14 ]="Miökov";
				meno[  15 ] ="Jana"; 		priezvisko[  15 ]="Perneck·";
				meno[  16 ] ="Jakub"; 		priezvisko[  16 ]="Pivooka";
				meno[  17 ] ="Adam"; 		priezvisko[  17 ]="Poldauf";
				meno[  18 ] ="D·vid"; 		priezvisko[  18 ]="Smatana";
				meno[  19 ] ="Ondrej"; 	priezvisko[  19 ]="Spev·k";
				meno[  20 ] ="Zolt·n"; 	priezvisko[  20 ]="TÛth";
				meno[  21 ] ="J·n"; 		priezvisko[  21 ]="Vallo";
				meno[  22 ] ="M·tÈ"; 		priezvisko[  22 ]="Vas";
				meno[  23 ] ="VladimÌr"; 	priezvisko[  23 ]="Vladovie";
				meno[  24 ] ="Tom·ö"; 		priezvisko[  24 ]="Ballon";
				meno[  25 ] ="Martin"; 	priezvisko[  25 ]="Bob·k";
				meno[  26 ] ="Csaba"; 		priezvisko[  26 ]="BolyÛs";
				meno[  27 ] ="J·n"; 		priezvisko[  27 ]="Bro·k";
				meno[  28 ] ="Andrej"; 	priezvisko[  28 ]="Dittrich";
				meno[  29 ] ="Miloö"; 		priezvisko[  29 ]="Fabian";
				meno[  30 ] ="Tom·ö"; 		priezvisko[  30 ]="Gramblieka";
				meno[  31 ] ="Michal"; 	priezvisko[  31 ]="H·jek";
				meno[  32 ] ="Ivan"; 		priezvisko[  32 ]="Harmady";
				meno[  33 ] ="Tatiana"; 	priezvisko[  33 ]="Herczogov·";
				meno[  34 ] ="Milan"; 		priezvisko[  34 ]="Holeö";
				meno[  35 ] ="Pavol"; 		priezvisko[  35 ]="Hudec";
				meno[  36 ] ="Peter"; 		priezvisko[  36 ]="Jariabka";
				meno[  37 ] ="Tom·ö"; 		priezvisko[  37 ]="Kameniar";
				meno[  38 ] ="Pavol"; 		priezvisko[  38 ]="Kriûan";
				meno[  39 ] ="Luk·ö"; 		priezvisko[  39 ]="Kubovie";
				meno[  40 ] ="Luk·ö"; 		priezvisko[  40 ]="Litvaj";
				meno[  41 ] ="VladimÌr"; 	priezvisko[  41 ]="Magyar";
				meno[  42 ] ="Eva"; 		priezvisko[  42 ]="Pomichalov·";
				meno[  43 ] ="Martin"; 	priezvisko[  43 ]="äeliga";
				meno[  44 ] ="Alexander"; 	priezvisko[  44 ]="Tak·cs";
				meno[  45 ] ="Pavol"; 		priezvisko[  45 ]="Tin·k";
				meno[  46 ] ="RÛbert"; 	priezvisko[  46 ]="Vilhan";
				meno[  47 ] ="Jakub"; 		priezvisko[  47 ]="Wlachovsk˝";
				meno[  48 ] ="Marek"; 		priezvisko[  48 ]="Bertovie";
				meno[  49 ] ="PatrÌcia"; 	priezvisko[  49 ]="Frankov·";
				meno[  50 ] ="Zuzana"; 	priezvisko[  50 ]="Gallusov·";
				meno[  51 ] ="Veronika"; 	priezvisko[  51 ]="Hamarov·";
				meno[  52 ] ="Rudolf"; 	priezvisko[  52 ]="Hric";
				meno[  53 ] ="Martin"; 	priezvisko[  53 ]="Keprta";
				meno[  54 ] ="Martin"; 	priezvisko[  54 ]="Klenkovie";
				meno[  55 ] ="Marek"; 		priezvisko[  55 ]="KoleneÌk";
				meno[  56 ] ="Peter"; 		priezvisko[  56 ]="Kov·e";
				meno[  57 ] ="Michal"; 	priezvisko[  57 ]="Kravec";
				meno[  58 ] ="VladimÌr"; 	priezvisko[  58 ]="Kubovie";
				meno[  59 ] ="Andrej"; 	priezvisko[  59 ]="Lang";
				meno[  60 ] ="MarÌna"; 	priezvisko[  60 ]="Madov·";
				meno[  61 ] ="Ivan"; 		priezvisko[  61 ]="Miökuf";
				meno[  62 ] ="Mari·n"; 	priezvisko[  62 ]="Mojzeö";
				meno[  63 ] ="Barbora"; 	priezvisko[  63 ]="Mor·vkov·";
				meno[  64 ] ="M·ria"; 		priezvisko[  64 ]="Nemsilajov·";
				meno[  65 ] ="Matej"; 		priezvisko[  65 ]="Pech·e";
				meno[  66 ] ="Patrik"; 	priezvisko[  66 ]="Piskay";
				meno[  67 ] ="Peter"; 		priezvisko[  67 ]="RogoûnÌk";
				meno[  68 ] ="Marcel"; 	priezvisko[  68 ]="Sarie";
				meno[  69 ] ="Richard"; 	priezvisko[  69 ]="Schnierer";
				meno[  70 ] ="Matej"; 		priezvisko[  70 ]="Sloboda";
				meno[  71 ] ="Jozef"; 		priezvisko[  71 ]="äandor";
				meno[  72 ] ="Barbora"; 	priezvisko[  72 ]="Za?kov·";
				meno[  73 ] ="Michal"; 	priezvisko[  73 ]="Danielis";
				meno[  74 ] ="Roman"; 		priezvisko[  74 ]="Danielis";
				meno[  75 ] ="Veronika"; 	priezvisko[  75 ]="Iuricov·";
				meno[  76 ] ="Michal"; 	priezvisko[  76 ]="GurnÌk";
				meno[  77 ] ="Jarmila"; 	priezvisko[  77 ]="Janeigov·";
				meno[  78 ] ="Norbert"; 	priezvisko[  78 ]="Kaniansky";
				meno[  79 ] ="Michal"; 	priezvisko[  79 ]="Kliment";
				meno[  80 ] ="Michal"; 	priezvisko[  80 ]="Kova3";
				meno[  81 ] ="KatarÌna"; 	priezvisko[  81 ]="Matysov·";
				meno[  82 ] ="Stanislav"; 	priezvisko[  82 ]="Melich";
				meno[  83 ] ="Marek"; 		priezvisko[  83 ]="Meohart";
				meno[  84 ] ="ätefan"; 	priezvisko[  84 ]="Mizer·k";
				meno[  85 ] ="Adam"; 		priezvisko[  85 ]="P·nik";
				meno[  86 ] ="Peter"; 		priezvisko[  86 ]="Pokojn˝";
				meno[  87 ] ="Michal"; 	priezvisko[  87 ]="Polkor·b";
				meno[  88 ] ="Martin"; 	priezvisko[  88 ]="Proch·zka";
				meno[  89 ] ="Peter"; 		priezvisko[  89 ]="PukaneÌk";
				meno[  90 ] ="Lenka"; 		priezvisko[  90 ]="Schmotzerov·";
				meno[  91 ] ="Samuel"; 	priezvisko[  91 ]="Sit·ö";
				meno[  92 ] ="Luk·ö"; 		priezvisko[  92 ]="Slov·k";
				meno[  93 ] ="Paula"; 		priezvisko[  93 ]="Stachov·";
				meno[  94 ] ="Zuzana"; 	priezvisko[  94 ]="SvetlÌkov·";
				meno[  95 ] ="Michal"; 	priezvisko[  95 ]="äeevlÌk";
				meno[  96 ] ="Martin"; 	priezvisko[  96 ]="Bartoö";
				meno[  97 ] ="Martin"; 	priezvisko[  97 ]="B·tora";
				meno[  98 ] ="Tam·s"; 		priezvisko[  98 ]="Fraoo";
				meno[  99 ] ="Mari·n"; 	priezvisko[  99 ]="G·lik";
				meno[  100 ] ="Boris"; 		priezvisko[  100 ]="Gergel";
				meno[  101 ] ="Samuel"; 	priezvisko[  101 ]="Kalugerov";
				meno[  102 ] ="Peter"; 		priezvisko[  102 ]="Kotulie";
				meno[  103 ] ="Zuzana"; 	priezvisko[  103 ]="Koyöov·";
				meno[  104 ] ="Mat˙ö"; 		priezvisko[  104 ]="Kudl·e";
				meno[  105 ] ="Michaela"; 	priezvisko[  105 ]="Leviusov·";
				meno[  106 ] ="RÛbert"; 	priezvisko[  106 ]="Maurer";
				meno[  107 ] ="Gabriel"; 	priezvisko[  107 ]="Mrva";
				meno[  108 ] ="¡d·m"; 		priezvisko[  108 ]="Peres";
				meno[  109 ] ="Matej"; 		priezvisko[  109 ]="Pol·k";
				meno[  110 ] ="Martin"; 	priezvisko[  110 ]="Sotelo";
				meno[  111 ] ="Jakub"; 		priezvisko[  111 ]="äkopek";
				meno[  112 ] ="Andrej"; 	priezvisko[  112 ]="äoltÈs";
				meno[  113 ] ="Tom·ö"; 		priezvisko[  113 ]="ätibran˝";
				meno[  114 ] ="Matej"; 		priezvisko[  114 ]="ävantner";
				meno[  115 ] ="Samuel"; 	priezvisko[  115 ]="Titka";
				meno[  116 ] ="Martin"; 	priezvisko[  116 ]="Tureek";
				meno[  117 ] ="1ubomÌr"; 	priezvisko[  117 ]="Vasek";
				meno[  118 ] ="Lenka"; 		priezvisko[  118 ]="Vidliekov·";			
		  }
		  /**
		   * hlavny program obsahuje buble sort z prednasky, jemne upraveny
		   */
		  public static void main(String[] args) {
			  for (int i = 0; i < MAX ; i++) {
				     for (int j = MAX-1; j>i ; j--) {
				        if ((priezvisko[j-1].compareTo(priezvisko[j])>0) || 
				        		(priezvisko[j-1].equals(priezvisko[j]) && meno[j-1].compareTo(meno[j])>0)) {
				        	// j-1 musi ist z j
				        	// tak ich vymen
				           String temp = priezvisko[j];
				           priezvisko[j] = priezvisko[j-1];
				           priezvisko[j-1] = temp;
				           
				           temp = meno[j];
				           meno[j] = meno[j-1];
				           meno[j-1] = temp;
				         }
				     }
				  }
			  for (int i = 0; i < MAX ; i++) {
				  System.out.println(priezvisko[i] + " " + meno[i]);
			  }
		  }
}
