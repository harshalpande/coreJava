package core.java.designPattern.chainOfResponsibility;

public class ThousandNote extends Notes {

	@Override
	int getFaceValue() {
		return Notes.THOUSAND;
	}
	
}
