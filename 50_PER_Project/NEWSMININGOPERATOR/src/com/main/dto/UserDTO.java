package com.main.dto;

public  class UserDTO{
public UserDTO(){

}	 private String id;
	 private String password;
	 private String userType;
	 private String entryDate;
	 private String userName;
	 private String isActive;

public String getID(){
return id;
}
public String getPassword(){
return password;
}
public String getUserType(){
return userType;
}
public String getEntryDate(){
return entryDate;
}
public String getUserName(){
return userName;
}
public String getIsActive(){
return isActive;
}

public void setID(String id){
this.id=id;
}
public void setPassword(String password){
this.password=password;
}
public void setUserType(String userType){
this.userType=userType;
}
public void setEntryDate(String entryDate){
this.entryDate=entryDate;
}
public void setUserName(String userName){
this.userName=userName;
}
public void setIsActive(String isActive){
this.isActive=isActive;
}
}