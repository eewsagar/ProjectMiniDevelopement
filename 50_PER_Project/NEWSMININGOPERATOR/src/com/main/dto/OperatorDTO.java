package com.main.dto;

public  class OperatorDTO{
public OperatorDTO(){

}	 private String id;
	 private String fullName;
	 private String userName;
	 private String codeNumber;
	 private String contatNo;
	 private String password;
	 private String entryDate;
	 private String emailId;

public String getID(){
return id;
}
public String getFullName(){
return fullName;
}
public String getUserName(){
return userName;
}
public String getCodeNumber(){
return codeNumber;
}
public String getContatNo(){
return contatNo;
}
public String getPassword(){
return password;
}
public String getEntryDate(){
return entryDate;
}
public String getEmailId(){
return emailId;
}

public void setID(String id){
this.id=id;
}
public void setFullName(String fullName){
this.fullName=fullName;
}
public void setUserName(String userName){
this.userName=userName;
}
public void setCodeNumber(String codeNumber){
this.codeNumber=codeNumber;
}
public void setContatNo(String contatNo){
this.contatNo=contatNo;
}
public void setPassword(String password){
this.password=password;
}
public void setEntryDate(String entryDate){
this.entryDate=entryDate;
}
public void setEmailId(String emailId){
this.emailId=emailId;
}
}