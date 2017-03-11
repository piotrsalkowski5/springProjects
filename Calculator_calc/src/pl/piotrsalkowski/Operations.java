package pl.piotrsalkowski;

public class Operations {
	
	private String displayContent;
	private double v1, v2;
	
	
	public Operations(){
		displayContent = "0";
		v1 = 0;
		v2 = 0;
	}
	

	
	public void setDisplayContent(String displayContent) {
		this.displayContent = displayContent;
	}
	
	
	public void appendDisplayContent(String displayContent) {
		this.displayContent = this.displayContent + displayContent;
	}
	
	
	public int getDisplayLength() {
		return displayContent.length();
	}
	

	public void doAddition(double value1, double value2) {
		double result = value1 + value2;
		setDisplayContent(Double.toString(result));
	}
	

	public void doSubstraction(double value1, double value2) {
		double result = value1 - value2;
		setDisplayContent(Double.toString(result));
	}
	

	public void doMultiplication(double value1, double value2) {
		double result = value1 * value2;
		setDisplayContent(Double.toString(result));
	}
	

	public void doDivision(double value1, double value2) {
		if(value2 != 0) {
			double result = value1 / value2;
			setDisplayContent(Double.toString(result));
		}else {
			setDisplayContent("Divide by Zero Error");
		}
		
	}


	public String getDisplay() {
		return displayContent;
	}
	
	
}
