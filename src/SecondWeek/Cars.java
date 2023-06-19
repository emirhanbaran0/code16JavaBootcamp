package SecondWeek;

import java.math.BigDecimal;

public abstract class Cars {


    private double dailyPrice;
    private int modelYear;
    private  CarColor color;
    private  double baggageCapacity;
    private short numberOfSeats;
    public String carId;

    public Cars(String carId, double dailyPrice,int modelYear,CarColor color,double baggageCapacity,short numberOfSeats) {
        this.carId=carId;
    	this.dailyPrice = dailyPrice;
        this.modelYear = modelYear;
        this.color = color;
        this.baggageCapacity = baggageCapacity;
        this.numberOfSeats=numberOfSeats;
    }

    public  double hireCarDaily(int numberofDay){
  
        return numberofDay*dailyPrice;
    }


    
    public CarColor getColor() {
		return color;
	}

	public void setColor(CarColor color) {
		this.color = color;
	}

	public String getCarId() {
		return carId;
	}

	public void setCarId(String carId) {
		this.carId = carId;
	}

	public double getDailyPrice() {
        return dailyPrice;
    }

    public void setDailyPrice(double dailyPrice) {
        this.dailyPrice = dailyPrice;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public double getBaggageCapacity() {
        return baggageCapacity;
    }

    public void setBaggageCapacity(double baggageCapacity) {
        this.baggageCapacity = baggageCapacity;
    }
    
    public short getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(short numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}
