package SecondWeek;

import java.util.ArrayList;

public class CompanyClient extends Client{
    

	private String sector;
    private String location;

    // we can add more feature of company....

    public CompanyClient(String name, int registirationYear, boolean isClientCompany,String sector,String location) {
		super(name, registirationYear, isClientCompany);
		this.sector=sector;
		this.location=location;
	}

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
