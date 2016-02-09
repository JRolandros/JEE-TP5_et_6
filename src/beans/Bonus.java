package beans;

public class Bonus {
	
	private String ssn;
	private String bonus;
	private String result;
	
	
	public void calculateBonus(){
		int b=0;
		if(!bonus.equals("")&& bonus!=null)
		b=Integer.parseInt(bonus)*100;
		result=""+b;
	}
	
	
	/**
	 * @return the ssn
	 */
	public String getSsn() {
		return ssn;
	}
	/**
	 * @param ssn the ssn to set
	 */
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	/**
	 * @return the bonus
	 */
	public String getBonus() {
		return bonus;
	}
	/**
	 * @param bonus the bonus to set
	 */
	public void setBonus(String bonus) {
		this.bonus = bonus;
	}
	
	public String getResult(){
		return result;
	}
	
	
}
