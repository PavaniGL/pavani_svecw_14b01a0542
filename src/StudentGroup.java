import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation throws IllegalArgumentException {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		if(students == NULL)
			throw IllegalArgumentException;
		else
			return students;
	}

	@Override
	public void setStudents(Student[] students) {
		if(students == NULL)
			throw IllegalArgumentException;
		
		// Add your implementation here
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		//int length = students.length;
		if(index < 0 || index >= students.length)
			throw IllegalArgumentException;
		return students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		if(student == NULL || index < 0 || index >= students.length)
			throw IllegalArgumentException;
		students[index] = student;
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		if(student == NULL)
			throw IllegalArgumentException;
		int length = students.length, i;
		Student temp = new Student[length+1];
		for(i = 0; i < students.length; i++) {
			temp[i+1] = students[i];
		}
		temp[0] = student;
		students = temp;
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		if(student == NULL)
			throw IllegalArgumentException;
		int length = students.length, i;
		Student temp = new Student[length+1];
		for(i = 0; i < students.length; i++) {
			temp[i] = students[i];
		}
		temp[i] = student;
		students = temp;
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		if(index < 0 || student == NULL || index >= students.length)
			throw IllegalArgumentException;
		Student temp = new Student[students.length+1];
		for(i = 0; i < index; i++) {
			temp[i] = students[i];
		}
		temp[i] = student;
		for(i = index; i < students.length; i++) {
			temp[i+1] = students[i];
		}
		students = temp;
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		if(index < 0 || index >= students.length)
			throw IllegalArgumentException;
		Student[] temp = new Student[students.length-1];
		int i;
		for(i = 0; i < index; i++)
			temp[i] = students[i];
		for(i = index+1; i < students.length; i++) {
			temp[i-1] = students[i];
		}
		students = temp;
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		if(student == NULL)
			throw IllegalArgumentException;
		int index = -1;
		Student[] temp = new Student[students.length-1];
		for(i = 0; i < students.length; i++) {
			temp[i] = students[i];
			if(students[i] == student) {
				index = i;
				break;
			}
		}
		if(index != -1) {
			for(i = index+1; i < students.length; i++) {
				temp[i-1] = students[i];
			}
			students = temp;
		}
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		if(index < 0 || index >= students.length)
			throw IllegalArgumentException;
		Student temp = new Student[index];
		int i;
		for(i = 0; i < index; i++) {
			temp[i] = students[i];
		}
		students = temp;
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		if(student == NULL)
			throw IllegalArgumentException;
		int index = -1;
		for(i = 0; i < students.length; i++) {
			if(students[i] == student) {
				index = i;
				break;
			}
		}
		if(index != -1) {
			Student[] temp = new Student[index];
			for(i = 0; i < index; i++) {
				temp[i] = students[i];
			}
			students = temp;
		}
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		if(index < 0 || index >= students.length)
			throw IllegalArgumentException;
		int i, k = 0;
		Student[] temp = new Student[students.length-index];
		for(i = index; i < students.length; i++) {
			temp[k] = students[i];
			k++;
		}
		students = temp;
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		if(student == NULL)
			throw IllegalArgumentException;
		int index = -1;
		Student[] temp = new Student[students.length-1];
		for(i = 0; i < students.length; i++) {
			temp[i] = students[i];
			if(students[i] == student) {
				index = i;
				break;
			}
		}
		if(index != -1) {
			int k = 0;
			for(i = index+1; i < students.length; i++) {
				temp[k] = students[i];
				k++;
			}
			students = temp;
		}
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
