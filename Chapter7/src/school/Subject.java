package school;

import java.util.ArrayList;

import utils.Define;

public class Subject {

	private String subjectName;
	private int subjectId;
	private int gradeType;		//���� �� ���
	
	//������û�� �л� ����Ʈ
	//register() �޼��带 ȣ���ϸ� ����Ʈ�� �߰���
	private ArrayList<Student> studentList = new ArrayList<>();
	
	public Subject(String subjectName, int subjectId) {
		this.subjectName = subjectName;
		this.subjectId = subjectId;
		this.gradeType = Define.AB_TYPE;	//�⺻������ A,BŸ��
	}

	////////////////////////////////////
	
	public void register(Student student) {	//������û
		studentList.add(student);
	}
	
	////////////////////////////////////
	
	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public int getGradeType() {
		return gradeType;
	}

	public void setGradeType(int gradeType) {
		this.gradeType = gradeType;
	}

	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}

}