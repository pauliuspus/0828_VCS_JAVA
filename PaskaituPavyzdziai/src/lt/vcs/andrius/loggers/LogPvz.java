package lt.vcs.andrius.loggers;

import org.apache.log4j.Logger;

public class LogPvz {
	
	static Logger log = Logger.getLogger(LogPvz.class.getName());
	
	public static void metodas1(String param){
		log.trace(param);
		try{
			//
			param.trim();
		}catch (Exception e) {
			log.error("Netiketa klaida", e);
		}
	}

	public static void main(String[] args) {
		
		log.info("programa startuoja");
		
		metodas1(null);
		
	
		log.info("programa issijungia");

	}

}
