
public class soccerplayers {
	private String name;
	private String position;
	private String nteam;
	private String cteam;
	private int number;
	
	public soccerplayers(String name, String nteam, String cteam, String position, int number) 
	{
		this.name = name;
		this.nteam = nteam;
		this.cteam = cteam;
		this.position = position;
		this.number = number;
		
	}
	
	void display()
	{
		System.out.println("Name: " + this.name + "\nNational Team: " + this.nteam + "\nClub Team: " + this.cteam + "\nPosition: " +  this.position + "\nJersey Name: " + this.number);
	}

}
