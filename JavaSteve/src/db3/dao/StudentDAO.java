package db3.dao;

import db3.vo.StudentVO;

public interface StudentDAO {

	void insertStudent(StudentVO std);
	
	void updateStudent(StudentVO std);
}