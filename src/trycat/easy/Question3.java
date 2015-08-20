package trycat.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/******************************************************************************
  NAME:     �Ҽ� ã��
  PURPOSE:  �ش��ϴ� ��� �Ҽ��� ����϶� 
			�Ҽ��� 1�� �ڱ� �ڽŸ��� ����� ������ ���̴�. 100������ �ڿ��� �� ��� �Ҽ��� ����Ͻÿ�
  CONDISTIONS: 
  			Time Limit : 100ms, Memory Limit : 512kb 
  			�Ҽ��� ������������ ����Ѵ�. �� ��°� ���̴� �������� �����ϰ�, ��°� 5�� ���� �ٹٲ��� �Ѵ�. 
  REVISIONS:
  Ver        Date        Author           Description
  ---------  ----------  ---------------  ------------------------------------
  1.0        2015-08-20  sykim3112        1. Created this class.  
******************************************************************************/
public class Question3 {

	public static void main(String[] args) {
		
		List<Integer> primeNumbers = new ArrayList<Integer>();
		int tempPrimeNum;
		boolean isPrime;
		
		for (int i = 1 ; i < 100 ; i++){
			isPrime = true;
			
			tempPrimeNum = i + 1;
			
			for (int j = 2 ; j < i ; j++){
				if(tempPrimeNum % j == 0 && j !=1){
					isPrime = false;
					break;
				}
			}
			
			if(isPrime)
				primeNumbers.add(tempPrimeNum);
		}
		
		
		// for������ ���
		System.out.println("���print - for �����������");
		for (int i = 0 ; i < primeNumbers.size() ; i++){
			System.out.print(primeNumbers.get(i));
			
			if (i % 5 == 4)
				System.out.print(" \n");
			else
				System.out.print(" ");
		}
		System.out.println("�������������������������\n");
		
		// forEach������ ���
		System.out.println("���print - forEach �������");
		for (Integer prmNum : primeNumbers) {
			System.out.print(prmNum);
			
			if(primeNumbers.indexOf(prmNum) % 5 == 4)
				System.out.print(" \n");
			else
				System.out.print(" ");
		}
		System.out.println("�������������������������\n");
		
		// Iterator�� ���
		
		/**
		 * Iterator(��ȸ)
		 ������������������������������������������������������������������������������������������������������������������������������������������������������
		 Iterator.hasNext() -- ������ �о�� ��Ұ� �ִ��� ��ȯ.
		 Iterator.next() -- ���� ��Ҹ� �о��.
		 Iterator.remove() -- �о�� ��Ҹ� ������.(next �޼��尡 ���� �Ǿ�� �Ѵ�.)
		 
		 *ListIterator - ArrayList�� LinkedList�� ���� List������ Collection���� ����.
		 ������������������������������������������������������������������������������������������������������������������������������������������������������
		 Iterator ���
		 ListIterator.hasNext() -- ������ �о�� ��Ұ� �ִ��� ��ȯ.
		 ListIterator.next() -- ���� ��Ҹ� �о��.
		 */
		System.out.println("���print - Iterator ������");
		ListIterator<Integer> iter= primeNumbers.listIterator();
		int iterIndex;
		
		System.out.println("���� ��Ҹ� �����ش�.");
		iterIndex = 0;
		while(iter.hasNext())
		{
			System.out.print(iter.next());
			if (iterIndex % 5 == 4)
				System.out.print(" \n");
			else
				System.out.print(" ");
			iterIndex++;
		}
		
		System.out.println("���� ��Ҹ� �����ش�.");
		iterIndex = 0;
		while(iter.hasPrevious())
		{
			System.out.print(iter.previous());
			if (iterIndex % 5 == 4)
				System.out.print(" \n");
			else
				System.out.print(" ");
			iterIndex++;
		}
		System.out.println("�������������������������\n");
	}
}
