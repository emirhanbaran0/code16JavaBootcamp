package SecondWeek;

import java.util.ArrayList;
import java.util.Scanner;

public class CarHireService {
	
	Scanner scan=new Scanner(System.in);
	
    public void companyHireCar(Cars car,Client client){
    	 ArrayList<String> currentOrders=client.getOrders();    	 
        if(car instanceof SUV){
        	SUV suvCar=(SUV) car;
        	int decision=typeofHiring();
        	 if(decision==1) {
        		 System.out.println("How many months?");
        		 int time=scan.nextInt();
             	suvCar.hireCarMonthly(time);
             	System.out.println("The car with "+car.carId+" has been hired succesfully for "+time+" months. Have a nice day.");
             }else if(decision==2) {
            	 System.out.println("How many months?");
            	 int time=scan.nextInt();
             	suvCar.hireCarDaily(time);
             	System.out.println("The car with "+car.carId+" has been hired succesfully for "+time+" days. Have a nice day.");
             }else {
             	System.out.println("You made invalid decision please make a new decison!");
             	typeofHiring();
             }
        	
        }
         if(car instanceof Hatchback ){
        	 System.out.println("Hatchback is hiring only daily");
        	 int time=scan.nextInt();
        	 car.hireCarDaily(time);
        }
         if (car instanceof SEDAN){
        	 
           	 SEDAN sedanCar=(SEDAN) car;
        	 int decision=typeofHiring();
         	 if(decision==1) {
         		System.out.println("How many months?");
         		int time=scan.nextInt();
              	sedanCar.hireCarMonthly(time);
              	System.out.println("The car with "+car.carId+" has been hired succesfully for "+time+" months. Have a nice day.");
              }else if(decision==2) {
            	  System.out.println("How many months?");
            	 int time=scan.nextInt();
              	sedanCar.hireCarDaily(time);
              	System.out.println("The car with "+car.carId+" has been hired succesfully for "+time+" days. Have a nice day.");
              }else {
              	System.out.println("You made invalid decision please make a new decison!");
              	typeofHiring();
              }
         	
        }
    }
    
    public void personHireCar(SUV car,Client client){  //Person type client can hire only SUV brand car.
    	
        ArrayList<String> currentOrders=client.getOrders();
        int decision=typeofHiring();
        if(decision==1) {
        	System.out.println("How many months?");
        	int time=scan.nextInt();
        	car.hireCarMonthly(time);
        	System.out.println("The car with "+car.carId+" has been hired succesfully for "+time+" months. Have a nice day.");
        }else if(decision==2) {
        	System.out.println("How many months?");
        	int time=scan.nextInt();
        	car.hireCarDaily(time);
        	System.out.println("The car with "+car.carId+" has been hired succesfully for "+time+" days. Have a nice day.");
        }else {
        	System.out.println("You made invalid decision please make a new decison!");
        	typeofHiring();
        }
    	
    }
    public int typeofHiring() {
        System.out.println("Choose the Type of hiring.");
        System.out.println("1-Hire Monthly");
        System.out.println("2-Hire Daily");
        System.out.print("Decision"); 
        int decision=scan.nextInt();
        return decision;
    }
}
