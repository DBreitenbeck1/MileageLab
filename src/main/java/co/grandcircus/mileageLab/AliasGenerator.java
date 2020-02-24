package co.grandcircus.mileageLab;

public class AliasGenerator {
	private String fname;
	private String lname;

	public AliasGenerator(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	}

	public String firstAlias() {
		String alisF;
		String a = fname.substring(0, 1);
		alisF = a + "rink"; 

		return alisF;

	}

	public String lastAlias() {
		String alisL;
		
		String a = lname.substring(0, 1);
		alisL = a + "adinkalopsolice"; 

		return alisL;

	}

}
