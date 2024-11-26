public class Mydata{
	private String from;
	private String to;
	private double cost;
	public Mydata (String from, String to , double cost){
		this.from = from;
		this.to = to;
		this.cost = cost;
	}
	public String getFrom(){
		return from ;
	}
	public String getTo(){
		return to ;
	}
	public double getCost(){
		return cost;
	}
}