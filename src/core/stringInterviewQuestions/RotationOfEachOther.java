package core.stringInterviewQuestions;

public class RotationOfEachOther {

	public static void main(String[] args) {
		System.out.println(isRotationOfEachOther("indiavsaustralia", "australiavsindia"));
	}

	private static boolean isRotationOfEachOther(String original, String rotation) {
		String concatenated = original + original;

		if (concatenated.indexOf(rotation) == -1) {
			return false;
		}
		return true;
	}

}
