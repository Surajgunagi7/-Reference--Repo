
import java.util.*;

class Students {
	int rollNo;
	String USN;
	int semester;
	long mobileNo;

	public Students(int rollNo, String USN, int semester, long mobileNo) {
		this.rollNo = rollNo;
		this.USN = USN;
		this.semester = semester;
		this.mobileNo = mobileNo;
	}

	public void display() {
		System.out.println(
				"Roll No: " + this.rollNo + " USN: " + this.USN + " SEM: " + this.semester + " Phone: " + this.mobileNo);
	}

}

public class PostgraduateDemo {

	public static void main(String[] args) {
		Vector<Students> vStudents = new Vector<Students>(20, 5);
		Scanner sc = new Scanner(System.in);
		System.out.println("Request to Increase Capacity of the Student:(y/n)");
		char response = sc.next().charAt(0);
		if (response == 'y' || response == 'n') {
			if (response == 'y') {
				vStudents.ensureCapacity(25);
				System.out.println("The Current Capacity: " + vStudents.capacity());
			}
		} else {
			System.out.println("Invalid Respnose");
		}

		vStudents.addElement(new Students(1, "2SD22CS115", 4, 1452369876L));
		vStudents.addElement(new Students(2, "2SD22CS005", 4, 1452365856L));
		vStudents.addElement(new Students(3, "2SD22CS634", 4, 1452369854L));
		System.out.println("Three Students Enrolled");
		for (Students st : vStudents) {
			st.display();
		}
		
		vStudents.removeElementAt(1);
		vStudents.removeElementAt(1);
		System.out.println("\nRoll no : 2 and Roll No: 3 Voluntarily unrolled from the course");
		
		vStudents.addElement(new Students(2, "2SD22CS021", 4, 8752365856L));
		vStudents.addElement(new Students(3, "2SD22CS022", 4, 1478369854L));
		System.out.println("After a Month two students are enrolled");
		
		System.out.println("Current Infomation of all the Students Enrolled");
		for (Students st : vStudents) {
			st.display();
		}
	}

}
