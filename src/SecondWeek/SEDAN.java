package SecondWeek;

import java.math.BigDecimal;

public class SEDAN extends Cars implements MonhltyHireService{
    private double monthlyPrice;

    

    public SEDAN(String carId, double monthlyPrice, double dailyPrice, int modelYear, CarColor color, double baggageCapacity,
			short numberOfSeats) {
		super(carId,dailyPrice, modelYear, color, baggageCapacity, numberOfSeats);
		this.monthlyPrice=monthlyPrice;
	}

	public double hireCarMonthly(int numberofMonth){
        return  numberofMonth*monthlyPrice;
    }

    public double getMonthlyPrice() {
        return monthlyPrice;
    }
    public void setMonthlyPrice(double monthlyPrice) {
        this.monthlyPrice = monthlyPrice;
    }
}
