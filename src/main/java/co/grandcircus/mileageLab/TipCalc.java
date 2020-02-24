package co.grandcircus.mileageLab;

public class TipCalc {
	private double bill;
	
	
	public TipCalc(double bill) {
		this.bill=bill;
	}
	
	public double tipper(double percent) {
		double tip;	
		tip = bill*percent;
		tip = ((int)(Math.round(tip*100))/100.0);
		return tip;
	}
	
	
}
