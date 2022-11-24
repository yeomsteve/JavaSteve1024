package day24;
import java.io.Serializable;
import java.util.ArrayList;
import lombok.Data;

@Data
public class Student implements Serializable{

		private static final long serialVersionUID = 862686152967663503L;
	
		private int grade, classNum, num;
		private String name;

	
	public Student(int grade, int classNum, int num, String name) {
		this.name = name;
		this.grade = grade;
		this.classNum = classNum;
		this.num = num;
	}

	@Override
	public String toString() {
		return grade + "학년" + classNum + "반" + num + "번" + name;
		}
	
}
