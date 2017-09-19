package lt.vcs.andrius.klasiuhierarchija;

public class Main {
	
	public static void migdykGyvuna(Gyvunas g){
		g.miegok();

		
	/*
		if(g instanceof Gyvunas){
			Gyvunas gyvunas = (Gyvunas) g;
			gyvunas.miegok();
			//((Gyvunas) g).miegok();
		}
			
		
		if(g instanceof VaikstantisGyvunas){
			
			System.out.println("migdau vaikstanti gyvuna");
			VaikstantisGyvunas vg =  (VaikstantisGyvunas) g;
			
			vg.bek();
			
		
			
			Gyvunas atgalPaverstasGyvunas = vg;
		}*/
		
	}
	
	public static void main(String[] args) {
		
		

		migdykGyvuna(new Gyvunas());
		
		migdykGyvuna(new VaikstantisGyvunas());

		migdykGyvuna(new PlaukiantisGyvunas());
		

	}

}
