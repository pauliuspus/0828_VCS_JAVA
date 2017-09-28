package lt.vcs.andrius.exceptions;

public class PerSalta extends Exception {
	private int blogaTemperatura;
	
	
	public PerSalta(String message){
		super(message);
	}
	

	public PerSalta(int blogaTemperatura) {
		super("Per salta: " + blogaTemperatura);
		this.blogaTemperatura = blogaTemperatura;
	}

	public int getBlogaTemperatura() {
		return blogaTemperatura;
	}
}
