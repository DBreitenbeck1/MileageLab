package co.grandcircus.mileageLab;

public class TripCalc {
	private double range;
	private double miles;
	private double mpg;
	private double gallons;
	private int valid;
	
	
	
	public TripCalc(double mpg,  double gallons, double miles) {
		this.mpg=mpg;
		this.miles=miles;
		this.gallons=gallons;
		this.range=gallons*mpg;
	}
	
	public double getRange() {
		range = ((int)(Math.round(range*100))/100.0);
		return range;
	}

	
	public String makeIt() {
		String willYou;
		if (miles>range) {
			willYou="<font id = \"bad\">you aren't going to make it!</font>";
			valid=1;
		} else if (range-miles<3) {
			willYou="<font id = \"med\">you can just barely make that.</font>";
			valid=2;
		} else {
			willYou="<font id = \"good\">you should be fine.</font>";
			valid=3;
		}
		return willYou;
	}
	
	public int getValid() {
		return valid;
	}
	
	
	
	
	

}
