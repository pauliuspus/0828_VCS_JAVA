package lt.vcs.andrius.exceptions;

public class PerKarsta extends Exception{
	private int blogaTemperatura;
	
	public PerKarsta(int blogaTemperatura){
		super("Per karsta: " + blogaTemperatura);
		this.blogaTemperatura = blogaTemperatura;
	}
	
	public int getBlogaTemperatura(){
		return blogaTemperatura;
	}

}
