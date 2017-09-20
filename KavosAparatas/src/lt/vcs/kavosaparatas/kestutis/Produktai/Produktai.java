package lt.vcs.kavosaparatas.kestutis.produktai;

import lt.vcs.kavosaparatas.common.Products;

public class Produktai implements Products {
	
	 private int cukrus = 0;
	 private int kava = 0;
	 private int vanduo = 0;
	 
	 public Produktai gaukKopija() {
			return new Produktai(cukrus, kava, vanduo);
		}
	
	    public Produktai (int cukrus, int kava, int vanduo) {
		this.cukrus = cukrus;
		this.kava = kava;
		this.vanduo = vanduo;
	     }
	    
	    
	public int getCukrus() {
			return cukrus;
		}


		public void setCukrus(int cukrus) {
			this.cukrus = cukrus;
		}


		public int getKava() {
			return kava;
		}


		public void setKava(int kava) {
			this.kava = kava;
		}


		public int getVanduo() {
			return vanduo;
		}


		public void setVanduo(int vanduo) {
			this.vanduo = vanduo;
		}


	public static void main(String[] args) {
	

	}

}
