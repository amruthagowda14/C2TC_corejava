package assignment2;

public class ThisKeyWord {

	int rollno;
	public  ThisKeyWord(int rollno){
		this.rollno=rollno;
	}


	public static void main(String[] args) {

		ThisKeyWord rollno=new ThisKeyWord(5);
		System.out.println("the rollno is ="+rollno.rollno);
	}

}