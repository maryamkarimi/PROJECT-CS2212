package systemUsers;

public interface ISystemUser{
	
	void setName(String name);
	void setSurname(String surname);
	void setID(String ID);
	void setBirthday(String birthday);
	
	String getName();
	String getSurname();
	String getID();
	String getBirthday();
	
}
