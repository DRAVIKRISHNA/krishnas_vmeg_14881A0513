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
public class StudentGroup implements StudentArrayOperation {

	private Student[] students 
        
	ArrayList al=new ArrayList();
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}
         
        ArrayList al=new ArrayList();
	@Override
	public Student[] getStudents() 
        {
               
         }
	@Override
	public void setStudents(Student[] students)
        { 
           
		
	}

	@Override
	public Student getStudent(int index) {
		int k;
                k=index;
                for(i=0;i<students;i++)
                 {
                   if(students[i]==k)
                    {
                      int c=i;
                    }
		return i;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
	}

	@Override
	public void addFirst(Student student) {
		al.addFirst("student");
	}

	@Override
	public void addLast(Student student) 
           {
                v=student;
		al.addLast("student");
	}

	@Override
	public void add(Student student, int index) 
        {
		al.put(index,"student");
	}

	@Override
	public void remove(int index)
           {
		al.remove(1);
	}

	@Override
	public void remove(Student student) {
		al.remove("student");
	}

	@Override
	public void removeFromIndex(int index) {
		al.removeFromIndex(2);
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() 
        {
		int i,j;
               for(i=0;i<students;i++)
                {
                  for(j=0;j<students-1;j++)
                   {
			if(students[j]>students[j+1])
                          {
                            temp=students[j];	
			    students[j]=students[j+1];
			    students[j+1]=temp;
	}
         }
}
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
