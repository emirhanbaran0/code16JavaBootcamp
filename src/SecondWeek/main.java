package SecondWeek;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		CarHireService chs=new CarHireService();
		CarColor carColor=null;
		Gender gender=null;
		Cars car=new SEDAN("34 SDR 1234",5000,200,2016,carColor.BLUE,20.5,(short) 4);
		Client client=new PersonClient("Mehmet",2015,false,"243242","Kaya",gender.MAN,(short)30);
		
		chs.companyHireCar(car, client);

	}

}
