package trycat.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/******************************************************************************
  NAME:     소수 찾기
  PURPOSE:  해당하는 모든 소수를 출력하라 
			소수란 1과 자기 자신만을 약수로 가지는 수이다. 100이하의 자연수 중 모든 소수를 출력하시오
  CONDISTIONS: 
  			Time Limit : 100ms, Memory Limit : 512kb 
  			소수를 오름차순으로 출력한다. 각 출력값 사이는 공백으로 구분하고, 출력값 5개 마다 줄바꿈을 한다. 
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
		
		
		// for문으로 출력
		System.out.println("■■print - for ■■■■■■■■■■");
		for (int i = 0 ; i < primeNumbers.size() ; i++){
			System.out.print(primeNumbers.get(i));
			
			if (i % 5 == 4)
				System.out.print(" \n");
			else
				System.out.print(" ");
		}
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■\n");
		
		// forEach문으로 출력
		System.out.println("■■print - forEach ■■■■■■");
		for (Integer prmNum : primeNumbers) {
			System.out.print(prmNum);
			
			if(primeNumbers.indexOf(prmNum) % 5 == 4)
				System.out.print(" \n");
			else
				System.out.print(" ");
		}
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■\n");
		
		// Iterator로 출력
		
		/**
		 * Iterator(순회)
		 ───────────────────────────────────────────────────────────────────────────
		 Iterator.hasNext() -- 다음에 읽어올 요소가 있는지 반환.
		 Iterator.next() -- 다음 요소를 읽어옴.
		 Iterator.remove() -- 읽어온 요소를 삭제함.(next 메서드가 선행 되어야 한다.)
		 
		 *ListIterator - ArrayList나 LinkedList와 같이 List형태의 Collection에서 얻음.
		 ───────────────────────────────────────────────────────────────────────────
		 Iterator 상속
		 ListIterator.hasNext() -- 이전에 읽어올 요소가 있는지 반환.
		 ListIterator.next() -- 이전 요소를 읽어옴.
		 */
		System.out.println("■■print - Iterator ■■■■■");
		ListIterator<Integer> iter= primeNumbers.listIterator();
		int iterIndex;
		
		System.out.println("다음 요소를 보여준다.");
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
		
		System.out.println("이전 요소를 보여준다.");
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
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■\n");
	}
}
