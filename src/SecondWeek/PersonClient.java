package SecondWeek;

import java.util.ArrayList;

public class PersonClient extends Client{
   

	private String TcNo;
    private String surname;
    private Gender gender;
    private short age;

    public PersonClient(String name, int registirationYear, boolean isClientCompany,String TcNo,String surname,Gender gender,short age ) {
		super(name, registirationYear, isClientCompany);
		this.TcNo=TcNo;
		this.surname=surname;
		this.gender=gender;
		this.age=age;
	}

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }
    public String getTcNo() {
        return TcNo;
    }

    public void setTcNo(String tcNo) {
        TcNo = tcNo;
    }
}
