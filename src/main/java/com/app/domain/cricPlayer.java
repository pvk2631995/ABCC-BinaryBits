package com.app.domain;


import org.mongojack.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "player_info")
public class cricPlayer {
	
	@Id
	private String PlayeremailId;
	
	private String name;
	private String age;
	private String GENDER;
	private long contactno;
	private String Country;
	private String City;
	
	private String sport;
	private String CricketLevel;
	private boolean Test;
	private boolean ODI;
	private boolean T20;
	private boolean terms;
	
	
	private String Achievement_Cricket;
	
	//@Field("Cricketer_type")
	private String Cricket;
	
	private String Highest_Score;
	private String Half_Centuries;
	private String Centuries;
	private String Innings_Played;
	
	public boolean isTerms() {
		return terms;
	}
	public void setTerms(boolean terms) {
		this.terms = terms;
	}
	
	public String getPlayeremailId() {
		return PlayeremailId;
	}
	public void setPlayeremailId(String playeremailId) {
		PlayeremailId = playeremailId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return GENDER;
	}
	public void setGender(String gender) {
		GENDER = gender;
	}
	public long getContactno() {
		return contactno;
	}
	public void setContactno(long contactno) {
		this.contactno = contactno;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getSport() {
		return sport;
	}
	public void setSport(String sport) {
		this.sport = sport;
	}
	public String getCricketLevel() {
		return CricketLevel;
	}
	public void setCricketLevel(String cricketLevel) {
		CricketLevel = cricketLevel;
	}
	public boolean isTest() {
		return Test;
	}
	public void setTest(boolean test) {
		Test = test;
	}
	public boolean isODI() {
		return ODI;
	}
	public void setODI(boolean oDI) {
		ODI = oDI;
	}
	public boolean isT20() {
		return T20;
	}
	public void setT20(boolean t20) {
		T20 = t20;
	}
	public String getAchievement_Cricket() {
		return Achievement_Cricket;
	}
	public void setAchievement_Cricket(String achievement_Cricket) {
		Achievement_Cricket = achievement_Cricket;
	}
	public String getCricket() {
		return Cricket;
	}
	public void setCricket(String cricket) {
		Cricket = cricket;
	}
	public String getHighest_Score() {
		return Highest_Score;
	}
	public void setHighest_Score(String highest_Score) {
		Highest_Score = highest_Score;
	}
	public String getHalf_Centuries() {
		return Half_Centuries;
	}
	public void setHalf_Centuries(String half_Centuries) {
		Half_Centuries = half_Centuries;
	}
	public String getCenturies() {
		return Centuries;
	}
	public void setCenturies(String centuries) {
		Centuries = centuries;
	}
	public String getInnings_Played() {
		return Innings_Played;
	}
	public void setInnings_Played(String innings_Played) {
		Innings_Played = innings_Played;
	}

}
