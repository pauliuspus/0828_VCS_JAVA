package lt.vcs.andrius.interfacepvz2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SodininkystesImone {
	
	
	public List<SiltnamisInterface> siltnamiai = new ArrayList<>();
	
	public int darbuotojuSk = 99;
	
	
	public SodininkystesImone(List<SiltnamisInterface> siltnamiai){
		this.siltnamiai = siltnamiai;
	}
	
	public SodininkystesImone(){
	}
	
	public void pridekSiltnami(SiltnamisInterface s){
		siltnamiai.add(s);
	}
	
	public void laistykSiltnamius(){
		for(SiltnamisInterface s : siltnamiai){
			if(s.arReikiaLaistyti()){
				
				try {
					s.laistykSiltnami();
					System.out.println("palaistytas");
				} catch (TrukstaVandens e) {
					System.out.println(s.getId() + " Siltnamiui truksta vandens, reikia papildyti");
					// TODO igyvendinti vandens papildyma
				}
				
				
			} else {
				System.out.println("nereikia laistyti");
			}
			
		}
	}
	

	
}
