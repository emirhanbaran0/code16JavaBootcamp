package SecondWeek;

import java.time.Year;
import java.util.ArrayList;



public abstract class Client {
    private String name;
    private int registirationYear;
    private  ArrayList<String> orders;
    private boolean isClientCompany;  //This attribute provide us to control if the client is company or person
    // we can add more feature of Client....
    public Client(String name) {
        this.registirationYear = Year.now().getValue();
       this.orders=new ArrayList<>();
    }

    public Client(String name, int registirationYear, boolean isClientCompany) {
		super();
		this.name = name;
		this.registirationYear = registirationYear;
		this.orders = null;
		this.isClientCompany = isClientCompany;
	}


	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRegistirationYear() {
        return registirationYear;
    }

    public void setRegistirationYear(short registirationYear) {
        this.registirationYear = registirationYear;
    }

    public ArrayList<String> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<String> orders) {
        this.orders = orders;
    }

    public boolean isClientCompany() {
        return isClientCompany;
    }

    public void setClientCompany(boolean clientCompany) {
        isClientCompany = clientCompany;
    }
}
