package day29;

import lombok.Data;

public class Problem03 {

	public static void main(String[] args) {
		/*게시글 제목에 공지가 있는지 확인하는 ㅋ노드입니다. 아래코드결과를 작성하고, 왜그렇게
		 * 결과가 나오는지 설명하세요. 원래 목적에 맞게 동작시키려면 어느 부분을 수정해야하는지
		 * 작성하고 수정해보세요*/
		Board2 board2 = new Board2();
		board2.setTitle("공지사항");
		String search = "공지";
		if(board2.equals(search)) {
			System.out.println("제목에 공지가 포함되었습니다.");
		}else {
			System.out.println("제목에 공지가 포함되어 있지 않습니다.");
		}

	}

}
@Data
class Board2{
	String title, contents;
}