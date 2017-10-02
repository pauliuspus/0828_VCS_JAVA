package lt.vcs.kavosaparatas.arnas.kavos;

import lt.vcs.kavosaparatas.arnas.puodeliai.Puodelis;

 public enum PuodeliaiEnum {
	JUODA(new JuodaPuodelis()), BECUKRAUS(new BeCukrausPuodelis()),PRASKIESTA(new PraskiestaPuodelis());
	
	 private Puodelis kavosPuodelis;
	 
	PuodeliaiEnum(Puodelis puodelis) {
		this.kavosPuodelis = puodelis;
	}
	public Puodelis getPuodelis() {
		return kavosPuodelis;
	}
}
