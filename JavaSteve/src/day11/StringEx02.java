package day11;

public class StringEx02 {

	public static void main(String[] args) {
		/* 문자열 str에 search가 몇번 등장하는지 확인하는 코드 작성*/
		String str = "Hello world! My name is Hong";
		String search = "o";
		
		//str에서 search가 있는 위치를 찾음
		//-1이 아니면 부분만자열 추출
		//-이면 반복문 종료
		
		String tmp = str;
		int count = 0;
		while(true) {
			System.out.println(tmp);
			int index = tmp.indexOf(search);
			if(index == -1) {
				break;
			}
			tmp = tmp.substring(index + search.length());				
			
			count++;
		}
			System.out.println(str+" 에는 " + search + "가 " + count + "번 있습니다.");
	}
				
}


