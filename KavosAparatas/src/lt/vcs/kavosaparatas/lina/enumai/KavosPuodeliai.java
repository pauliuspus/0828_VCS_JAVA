package lt.vcs.kavosaparatas.lina.enumai;
import lt.vcs.kavosaparatas.lina.Kavos.*;

public enum KavosPuodeliai {
	KavaSuPienu(new KavaSuPienu()), Latte(new Latte()), JuodaKava(new JuodaKava());
	
	private Object kavosTipas;
	
	KavosPuodeliai(Object o) {	
		this.kavosTipas = o;
	}
	
	public Object getKavosPuodelis() {
		return kavosTipas ;
	}
}
