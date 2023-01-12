package bll;

public class Visit {
	
	private String name;
	private double price;
	private String result;
	private int duration;
	
	public Visit() {
		
	}
	
	public Visit(String n, double p) {
		name = n;
		price = p;
		result = null;
		duration = -1;
		
	}
	
	public String getName() {
		return name;
	}


	public double getPrice() {
		return price;
	}
	
	public void visit (String res, int dur) {
		if(result == null) {
			this.result = res;
			this.duration = dur;
		}
	}

	public String getResult() {
		return result;
	}

	public int getDuration() {
		return duration;
	}
	
	public boolean hasTakenPlace() {
		return result != null;
	}
	
	@Override
	public String toString() {
		return "Visit [name=" + name + ", price=" + price + ", "
				+ "result=" + result + ", duration=" + duration + "]";
	}
	
	
}
