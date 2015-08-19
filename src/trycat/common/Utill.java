package trycat.common;

public class Utill {
	public static String sayNumber(int number){
		String numName = "";
		
		switch(number){
		case 0:
			numName = "¿µ";
			break;
		case 1:
			numName = "ÀÏ";
			break;
		case 2:
			numName = "ÀÌ";
			break;
		case 3:
			numName = "»ï";
			break;
		case 4:
			numName = "»ç";
			break;
		case 5:
			numName = "¿À";
			break;
		case 6:
			numName = "À°";
			break;
		case 7:
			numName = "Ä¥";
			break;
		case 8:
			numName = "ÆÈ";
			break;
		case 9:
			numName = "±¸";
			break;
		}
		
		return numName;
	}
}
