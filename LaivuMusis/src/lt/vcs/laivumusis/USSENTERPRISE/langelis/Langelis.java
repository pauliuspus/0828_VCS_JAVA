package lt.vcs.laivumusis.USSENTERPRISE.langelis;

<<<<<<< Updated upstream
import lt.vcs.laivumusis.USSENTERPRISE.zaidimoLenta.ZaidimoLenta;
import lt.vcs.laivumusis.common.Laivas;

public class Langelis implements lt.vcs.laivumusis.common.Langelis {
	private int suviuSkaicius; // naudojam nustatyti kiek kartu sauta i viena langeli
	private boolean langelioBusena;
	private String x;
	private int y;
	public Langelis(Integer y) {
		this.y = y;
	}
	public Langelis(String x) {
		this.x = x;
	}
	
	
	
	public Langelis(String x, Integer y) {
		this.x = x;
		this.y = y;
	}
	
	// kiekvienas langelis turi buti zaidimo lentos bendrame mape
	@Override
	public void sauk() { // turim langeli padaryti nusauta ir pradeti skaiciuoti jo suviu skaiciu,
		langelioBusena = true;
		suviuSkaicius++;
=======
import java.util.Scanner;

import lt.vcs.laivumusis.common.Laivas;

public class Langelis implements lt.vcs.laivumusis.common.Langelis{
	
	private int suviuSkaicius;
	private String x;
	private int y;
	boolean arSaut;
	

	@Override
	public void sauk() {
		
		Scanner sc = new Scanner(System.in);
        
        System.out.print("Eilute: ");
        x = sc.nextLine();
             
        System.out.print("Stulpelis: ");
        y = sc.nextInt();
		
>>>>>>> Stashed changes
	}

	@Override
	public Laivas getLaivas() { // kreipiames i laiva kalse
		
		return null;
	}

	@Override
	public boolean arSauta() {
<<<<<<< Updated upstream
		return langelioBusena;
=======
		return arSaut;
>>>>>>> Stashed changes
	}

	@Override
	public int sakykKiekKartuSauta() {
		return suviuSkaicius;
	}

	@Override
<<<<<<< Updated upstream
	public String getX() { // pagal ideja turim grazinti is zaidimo lentos x o poto Y
		
		return null;
=======
	public String getX() {
		return x;
>>>>>>> Stashed changes
	}

	@Override
	public int getY() {
<<<<<<< Updated upstream

		return 0;
=======
		return y;
>>>>>>> Stashed changes
	}

}
