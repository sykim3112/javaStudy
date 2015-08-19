package trycat.easy;

import java.util.Scanner;

import trycat.common.Utill;

/******************************************************************************
  NAME:     숫자 읽기
  PURPOSE:  주어진 숫자를 한글로 읽어보자 
			숫자단위에 아직 미숙한 어린 아이들을 대상으로 숫자가 한글로 출력되는 프로그램을 만들고자 한다.
  CONDISTIONS: 
  			Time Limit : 100ms, Memory Limit : 512kb 
  REVISIONS:
  Ver        Date        Author           Description
  ---------  ----------  ---------------  ------------------------------------
  1.0        2015-08-18  sykim3112        1. Created this class.  
******************************************************************************/
public class Question2 {

	public static void main(String[] args) {
		
		String inputNum;
		String outputNum;
		boolean numFL;
		
		inputNum = "";
		outputNum = "";
		numFL = false;
		// 숫자입력받기
		do{
			Scanner scan = new Scanner(System.in);
			System.out.println("숫자를 입력해주세요.");
			System.out.print(">");
			
			if (scan.hasNextLong()){
				inputNum = scan.nextLine();
				// 입력받은 숫자를 분석
				System.out.printf("입력받은 숫자는 %s 입니다. \n", inputNum);
				numFL = true;
				scan.close();
			}
			else {
				System.out.println("잘못입력하였습니다.");
			}
		}while(!numFL);
		
		// 입력받은 숫자 변환
		switch (inputNum.length()){
		case 9:
			if (Integer.parseInt(inputNum) % 1000000000 / 100000000 != 0)
				outputNum += Utill.sayNumber(Integer.parseInt(inputNum) % 1000000000 / 100000000);
			
			outputNum += "억";
		case 8:
			if (Integer.parseInt(inputNum) % 100000000 / 10000000 == 1 && inputNum.length() == 8)
				outputNum += "천";
			else if (Integer.parseInt(inputNum) % 100000000 / 10000000 != 0)
				outputNum += Utill.sayNumber(Integer.parseInt(inputNum) % 100000000 / 10000000) + "천";
		case 7:
			if (Integer.parseInt(inputNum) % 10000000 / 1000000 == 1 && inputNum.length() == 7)
				outputNum += "백";
			else if (Integer.parseInt(inputNum) % 10000000 / 1000000 != 0)
				outputNum += Utill.sayNumber(Integer.parseInt(inputNum) % 10000000 / 1000000) + "백";
		case 6:
			if (Integer.parseInt(inputNum) % 1000000 / 1000000 == 1 && inputNum.length() == 6)
				outputNum += "십";
			else if (Integer.parseInt(inputNum) % 1000000 / 100000 != 0)
				outputNum += Utill.sayNumber(Integer.parseInt(inputNum) % 1000000 / 100000) + "십";
		case 5:
			if (Integer.parseInt(inputNum) % 100000 / 10000 != 0)
				outputNum += Utill.sayNumber(Integer.parseInt(inputNum) % 100000 / 10000);
			
			outputNum += "만";
		case 4:
			if (Integer.parseInt(inputNum) % 10000 / 1000 == 1 && inputNum.length() == 4)
				outputNum += "천";
			else if (Integer.parseInt(inputNum) % 10000 / 1000 != 0)
				outputNum += Utill.sayNumber(Integer.parseInt(inputNum) % 10000 / 1000) + "천";
		case 3:
			if (Integer.parseInt(inputNum) % 1000 / 100 == 1 && inputNum.length() == 3)
				outputNum += "백";
			else if (Integer.parseInt(inputNum) % 1000 / 100 != 0)
				outputNum += Utill.sayNumber(Integer.parseInt(inputNum) % 1000 / 100) + "백";
		case 2:
			if (Integer.parseInt(inputNum) % 100 / 10 == 1 && inputNum.length() == 2)
				outputNum += "십";
			else if (Integer.parseInt(inputNum) % 100 / 10 != 0)
				outputNum += Utill.sayNumber(Integer.parseInt(inputNum) % 100 / 10) + "십";
		case 1:
			if (Integer.parseInt(inputNum) % 10 != 0)
				outputNum += Utill.sayNumber(Integer.parseInt(inputNum) % 10);
		}
		
		// 출력
		System.out.println(outputNum);
	}
}
