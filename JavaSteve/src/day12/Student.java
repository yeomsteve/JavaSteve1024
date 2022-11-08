package day12;

public class Student {
	public int grade, classNum, num;
	public String name;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + classNum;
		result = prime * result + grade;
		result = prime * result + num;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		
		//같은 객체 공유
		if (this == obj)
			return true;
		//null과 비교 불가능
		if (obj == null)
			return false;
		//obj가 같은 클래스의 객체가 아닌 경우
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (classNum != other.classNum)
			return false;
		if (grade != other.grade)
			return false;
		if (num != other.num)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Student [grade=" + grade + ", classNum=" + classNum + ", num=" + num + ", name=" + name + "]";
	}
	
	
}

/*Object클래스
 * -모든 클래스의 조상클래스
 * Object 클래스에 있는 메소드들을 오버라이딩하여 활용할수있다.
 * -equals(Object obj)
 * Object의 equals는 주소를 비교
 * -오버라이딩해서 사용.
 * */
