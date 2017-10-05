package lt.vcs.laivumusis.USSENTERPRISE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lt.vcs.laivumusis.USSENTERPRISE.langelis.Langelis;

public class test {

	public static void main(String[] args) {
		public Map<String, List<Langelis>> zaidimoLentele = new HashMap<String, List<Langelis>>();
		public List<Langelis> langas = new ArrayList<Langelis>();

		private void lentosKurimas() {
			for (int kordinateY = 1; kordinateY <= 10; kordinateY++) {
				langas.add(new Langelis(kordinateY));
			}
			for (char kordinateY = 'A'; kordinateY <= 'J'; kordinateY++) {
				zaidimoLentele.put(String.valueOf(kordinateY), langas);
			}
		}
	}
}
