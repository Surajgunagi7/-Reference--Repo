
public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = Thread.currentThread();
		System.out.println("Default Thread name : "+ t1.getName() +"\t Priority : " +t1.getPriority());
		System.out.println(" ");
		t1.setName("Main Thread testing");
		t1.setPriority(3);
		System.out.println("Default Thread name : "+ t1.getName()+"\t Priority : " +t1.getPriority());
	}

}