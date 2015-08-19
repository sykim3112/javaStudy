package trycat.easy;

import java.util.Scanner;

import trycat.common.Utill;

/******************************************************************************
  NAME:     ���� �б�
  PURPOSE:  �־��� ���ڸ� �ѱ۷� �о�� 
			���ڴ����� ���� �̼��� � ���̵��� ������� ���ڰ� �ѱ۷� ��µǴ� ���α׷��� ������� �Ѵ�.
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
		// �����Է¹ޱ�
		do{
			Scanner scan = new Scanner(System.in);
			System.out.println("���ڸ� �Է����ּ���.");
			System.out.print(">");
			
			if (scan.hasNextLong()){
				inputNum = scan.nextLine();
				// �Է¹��� ���ڸ� �м�
				System.out.printf("�Է¹��� ���ڴ� %s �Դϴ�. \n", inputNum);
				numFL = true;
				scan.close();
			}
			else {
				System.out.println("�߸��Է��Ͽ����ϴ�.");
			}
		}while(!numFL);
		
		// �Է¹��� ���� ��ȯ
		switch (inputNum.length()){
		case 9:
			if (Integer.parseInt(inputNum) % 1000000000 / 100000000 != 0)
				outputNum += Utill.sayNumber(Integer.parseInt(inputNum) % 1000000000 / 100000000);
			
			outputNum += "��";
		case 8:
			if (Integer.parseInt(inputNum) % 100000000 / 10000000 == 1 && inputNum.length() == 8)
				outputNum += "õ";
			else if (Integer.parseInt(inputNum) % 100000000 / 10000000 != 0)
				outputNum += Utill.sayNumber(Integer.parseInt(inputNum) % 100000000 / 10000000) + "õ";
		case 7:
			if (Integer.parseInt(inputNum) % 10000000 / 1000000 == 1 && inputNum.length() == 7)
				outputNum += "��";
			else if (Integer.parseInt(inputNum) % 10000000 / 1000000 != 0)
				outputNum += Utill.sayNumber(Integer.parseInt(inputNum) % 10000000 / 1000000) + "��";
		case 6:
			if (Integer.parseInt(inputNum) % 1000000 / 1000000 == 1 && inputNum.length() == 6)
				outputNum += "��";
			else if (Integer.parseInt(inputNum) % 1000000 / 100000 != 0)
				outputNum += Utill.sayNumber(Integer.parseInt(inputNum) % 1000000 / 100000) + "��";
		case 5:
			if (Integer.parseInt(inputNum) % 100000 / 10000 != 0)
				outputNum += Utill.sayNumber(Integer.parseInt(inputNum) % 100000 / 10000);
			
			outputNum += "��";
		case 4:
			if (Integer.parseInt(inputNum) % 10000 / 1000 == 1 && inputNum.length() == 4)
				outputNum += "õ";
			else if (Integer.parseInt(inputNum) % 10000 / 1000 != 0)
				outputNum += Utill.sayNumber(Integer.parseInt(inputNum) % 10000 / 1000) + "õ";
		case 3:
			if (Integer.parseInt(inputNum) % 1000 / 100 == 1 && inputNum.length() == 3)
				outputNum += "��";
			else if (Integer.parseInt(inputNum) % 1000 / 100 != 0)
				outputNum += Utill.sayNumber(Integer.parseInt(inputNum) % 1000 / 100) + "��";
		case 2:
			if (Integer.parseInt(inputNum) % 100 / 10 == 1 && inputNum.length() == 2)
				outputNum += "��";
			else if (Integer.parseInt(inputNum) % 100 / 10 != 0)
				outputNum += Utill.sayNumber(Integer.parseInt(inputNum) % 100 / 10) + "��";
		case 1:
			if (Integer.parseInt(inputNum) % 10 != 0)
				outputNum += Utill.sayNumber(Integer.parseInt(inputNum) % 10);
		}
		
		// ���
		System.out.println(outputNum);
	}
}
