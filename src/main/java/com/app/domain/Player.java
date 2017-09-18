package com.app.domain;

import org.mongojack.Id;
import org.mongojack.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
//import org.springframework.data.mongodb.core.mapping.Field;

/*{
	  "name": "Satyam",
	  "age": "20",
	  "gender": "Male",
	  "sport": "Cricket",
	  "level": "International",
	  "achivements": "Won the world cup"
}
	
for cricket:  nameC ageC countryC cityC 
for Football: nameF ageF countryF cityF
for Badminton:  nameB ageB countryB cityB
for Chess: nameCH ageCH countryCH cityCH
	
	///////==========Personal=======
	
	{
  "name": "Satyam",
  "email": "satyamwakekar@gmail.com",
  "password": "Asdf!1231",
  "GENDER": "Male",
  "dob": "09/08/1999",
  "age": "21",
  "contactno": "8793304023",
  "country": "India",
  "city": "Nagpur",
  "about": "dsaasf"
  "url"
    "imageurl": "https://cdn4.iconfinder.com/data/icons/flatfaces-everyday-people-circular/125/flatfaces10-512.png",
}
  
  ========cricket========
  
  
   "sport": "Cricket",
  "t20": "T20",
  "odi": "ODI",
  "test": "Test",
  "cricket": "Allrounder",
  "innings_Played": "12",
  "innings_PlayedRange": "0 TO 150",
  "highest_Score": "12",
  "half_Centuries": "12",
  "half_CenturiesRange": "0 TO 25",
  "centuries": "12",
  "centuriesRange": "0 TO 25",
  "wickets": "12",
  "wicketsRange": "0 TO 150",
  "economy_rate": "12",
  "bowling_Average": "12",
  "catches_taken": "12",
  "stumpings": "12",
  "cricketLevel": "Inter_City",
  "other": "Other",
  "achievement_Cricket": "xfs"
  
  "armbat": "Left",
  "armbowl": "Left",
  "bowlertype": "Medium"
  									
  ================================
  
  =====Football=====
  
{
  
   "football": "Forward",
  "footballLevel": "State_Level",
  "achievement_Football": "sdaas",
  "matches_Played": "12",
  "goalkeeper_Technical_Skills": "99",
  "goalkeeper_Mental_Skills": "99",
  "goalkeeper_Physical_Skills": "99",
  "matches_Played_D": "99",
  "defender_Technical_Skills": "99",
  "defender_Mental_Skills": "99",
  "defender_Physical_Skills": "99",
  "matches_Played_M": "99",
  "midfielder_Technical_Skills": "99",
  "midfielder_Mental_Skills": "99",
  "midfielder_Physical_Skills": "99",
  "matches_Played_F": "99",
  "forward_Technical_Skills": "99",
  "forward_Mental_Skills": "99",
  "forward_Physical_Skills": "99"
}
}

===============badminton============

"achievement_badminton": "ssss",
  "badminton": "Mixed_doubles",
  "matches_Playedd": "12",
  "singles_technique": "12",
  "singles_backhand": "12",
  "singles_footwork": "12",
  "singles_service": "12",
  "singles_reflexes": "12",
  "singles_agility": "12",
  "singles_speed": "12",
  "singles_power": "12",
  "singles_endurance": "12",
  "singles_flexibility": "12",
  "singles_concentration": "12",
  "badmintonlevel": "Inter_City",
  "matches_playeddd": "12",
  "doubles_technique": "12",
  "doubles_backhand": "12",
  "doubles_footwork": "12",
  "doubles_service": "12",
  "doubles_reflexes": "12",
  "doubles_agility": "12",
  "doubles_speed": "12",
  "doubles_power": "12",
  "doubles_endurance": "12",
  "doubles_flexibility": "12",
  "doubles_concentration": "12",
  "doubles_mutual_understanding": "12",
  "matches_playedddd": "12",
  "mixed_doubles_technique": "12",
  "mixed_doubles_backhand": "12",
  "mixed_doubles_footwork": "12",
  "mixed_doubles_service": "12",
  "mixed_doubles_reflexes": "12",
  "mixed_doubles_agility": "12",
  "mixed_doubles_speed": "12",
  "mixed_doubles_power": "12",
  "mixed_doubles_endurance": "12",
  "mixed_doubles_flexibility": "12",
  singles_mutual_understanding
  "mixed_doubles_concentration": "12",
  "mixed_doubles_mutual_understanding": "12"
}
												
==================chess==============

"chesslevel": "National_Level",
  "achievement_chess": "sds",
  "matches_Playeddchess": "12",
  "intelligence": "12",
  "chess_concentration": "12",
  "chess_technique": "12",
  "chess_speed": "12",
  "motivation_and_values": "12"
								_______________________________done till here___________________________________
*/	
/**
 * @author SATYAM
 *
 */
@Document(collection = "player_info")
public class Player {

	//@ObjectId
	//@Id
	//private String id;
	
	@ObjectId
	@Id
	private String PlayeremailId;
	
	private String name;
	private String password;
	private String dob;
	private int age;
	private String GENDER;
	private String contactno;
	private String country;
	private String city;
	private String about;
	private String url;
	private String imageurl;
	
	

	private String nameC ;
	private String ageC ;
	private String countryC ;
	private String  cityC ;
	
	private String nameF ;
	private String ageF; 
	private String countryF;
	private String cityF;
	
	private String nameB;
	private String ageB ;
	private String countryB ;
	private String cityB;
	
	private String nameCH ;
	private String ageCH ;
	private String countryCH;
	private String cityCH;
	
	
	//======cricket fields=========//
	
	private String sport;
	private String cricketLevel;
	private String test;
	private String odi;
	private String t20;
	private String other;
	private boolean terms;
	
	
	private String achievement_Cricket;
	
	//@Field("Cricketer_type")
	private String cricket;
	
	
	
	private String highest_Score;
	private String half_Centuries;
	private String half_CenturiesRange;
	private String centuries;
	private String centuriesRange;
	private String innings_Played;
	private String innings_PlayedRange;
	
	
	private String wickets;
	private String wicketsRange;
	private String economy_rate;
	private String bowling_Average;
	
	private String catches_taken;
	private String stumpings;
	
	private String armbat;
	private String armbowl;
	private String bowlertype;
	
	
	//football player field starts
	
	private String footballLevel;
	private String football;
	private String achievement_Football;
	private String footballFootball;
	private String matches_Played;
	private String goalkeeper_Technical_Skills;
	private String goalkeeper_Mental_Skills;
	private String goalkeeper_Physical_Skills;
	private String matches_Played_D;
	private String defender_Technical_Skills;
	private String defender_Physical_Skills;
	private String defender_Mental_Skills;
	private String matches_Played_M;
	private String midfielder_Technical_Skills;
	private String midfielder_Mental_Skills;
	private String midfielder_Physical_Skills;
	private String matches_Played_F;
	private String forward_Technical_Skills;
	private String forward_Mental_Skills;
	private String forward_Physical_Skills;
	//private String ;
	
	//==========badminton fields===============
	
	private String achievement_badminton;
	private String badminton;
	private String badmintonlevel;
	
	
	//singles
	
	
	private String matches_Playedd;
	private String singles_technique;
	private String singles_backhand;
	private String singles_footwork;
	private String singles_service;
	private String singles_reflexes;
	private String singles_agility;
	private String singles_speed;
	private String singles_power;
	private String singles_endurance;
	private String singles_flexibility;
	private String singles_concentration;
	
	
	//doubles
	
	
	private String matches_playeddd;
	private String doubles_technique;
	private String doubles_backhand;
	private String doubles_footwork;
	private String doubles_service;
	private String doubles_reflexes;
	private String doubles_agility;
	private String doubles_speed;
	private String doubles_power;
	private String doubles_endurance;
	private String doubles_flexibility;
	private String doubles_concentration;
	private String doubles_mutual_understanding;
	
	
	private String singles_mutual_understanding;
	
	//mixed doubles
	
	
	private String matches_playedddd;
	private String mixed_doubles_technique;
	private String mixed_doubles_backhand;
	private String mixed_doubles_footwork;
	private String mixed_doubles_service;
	private String mixed_doubles_reflexes;
	private String mixed_doubles_agility;
	private String mixed_doubles_speed;
	private String mixed_doubles_power;
	private String mixed_doubles_endurance;
	private String mixed_doubles_flexibility;
	private String mixed_doubles_concentration;
	private String mixed_doubles_mutual_understanding;
	
	
	//===========chess fields=============
	
	private String chesslevel;
	private String achievement_chess;
	private String matches_Playeddchess;
	private String intelligence;
	private String chess_concentration;
	private String chess_technique;
	private String chess_speed;
	private String motivation_and_values;

	//getters and setters
	
	
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
	public int getAge() {
		return age;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGENDER() {
		return GENDER;
	}
	public void setGENDER(String gENDER) {
		GENDER = gENDER;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	
	
	
	
	public String getNameC() {
		return nameC;
	}
	public void setNameC(String nameC) {
		this.nameC = nameC;
	}
	
	public String getCountryC() {
		return countryC;
	}
	public void setCountryC(String countryC) {
		this.countryC = countryC;
	}
	public String getCityC() {
		return cityC;
	}
	public void setCityC(String cityC) {
		this.cityC = cityC;
	}
	public String getNameF() {
		return nameF;
	}
	public void setNameF(String nameF) {
		this.nameF = nameF;
	}
	
	
	public String getCountryF() {
		return countryF;
	}
	public void setCountryF(String countryF) {
		this.countryF = countryF;
	}
	public String getCityF() {
		return cityF;
	}
	public void setCityF(String cityF) {
		this.cityF = cityF;
	}
	public String getNameB() {
		return nameB;
	}
	public void setNameB(String nameB) {
		this.nameB = nameB;
	}

	public String getCountryB() {
		return countryB;
	}
	public void setCountryB(String countryB) {
		this.countryB = countryB;
	}
	public String getCityB() {
		return cityB;
	}
	public void setCityB(String cityB) {
		this.cityB = cityB;
	}
	public String getNameCH() {
		return nameCH;
	}
	public void setNameCH(String nameCH) {
		this.nameCH = nameCH;
	}
	
	public String getAgeF() {
		return ageF;
	}
	public void setAgeF(String ageF) {
		this.ageF = ageF;
	}
	public String getAgeB() {
		return ageB;
	}
	public void setAgeB(String ageB) {
		this.ageB = ageB;
	}
	public String getAgeCH() {
		return ageCH;
	}
	public void setAgeCH(String ageCH) {
		this.ageCH = ageCH;
	}
	
	
	public String getAgeC() {
		return ageC;
	}
	public void setAgeC(String ageC) {
		this.ageC = ageC;
	}
	public String getCountryCH() {
		return countryCH;
	}
	public void setCountryCH(String countryCH) {
		this.countryCH = countryCH;
	}
	public String getCityCH() {
		return cityCH;
	}
	public void setCityCH(String cityCH) {
		this.cityCH = cityCH;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	
	public String getImageurl() {
		return imageurl;
	}
	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}
	public String getOther() {
		return other;
	}
	public void setOther(String other) {
		this.other = other;
	}
	public String getHalf_CenturiesRange() {
		return half_CenturiesRange;
	}
	public void setHalf_CenturiesRange(String half_CenturiesRange) {
		this.half_CenturiesRange = half_CenturiesRange;
	}
	public String getCenturiesRange() {
		return centuriesRange;
	}
	public void setCenturiesRange(String centuriesRange) {
		this.centuriesRange = centuriesRange;
	}
	public String getInnings_PlayedRange() {
		return innings_PlayedRange;
	}
	public void setInnings_PlayedRange(String innings_PlayedRange) {
		this.innings_PlayedRange = innings_PlayedRange;
	}
	public String getWicketsRange() {
		return wicketsRange;
	}
	public void setWicketsRange(String wicketsRange) {
		this.wicketsRange = wicketsRange;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
	public String getSport() {
		return sport;
	}
	public void setSport(String sport) {
		this.sport = sport;
	}
	public String getCricketLevel() {
		return cricketLevel;
	}
	public void setCricketLevel(String cricketLevel) {
		this.cricketLevel = cricketLevel;
	}
	
	
	public String getTest() {
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}
	public String getOdi() {
		return odi;
	}
	public void setOdi(String odi) {
		this.odi = odi;
	}
	public String getT20() {
		return t20;
	}
	public void setT20(String t20) {
		this.t20 = t20;
	}
	public boolean isTerms() {
		return terms;
	}
	public void setTerms(boolean terms) {
		this.terms = terms;
	}
	public String getAchievement_Cricket() {
		return achievement_Cricket;
	}
	public void setAchievement_Cricket(String achievement_Cricket) {
		this.achievement_Cricket = achievement_Cricket;
	}
	public String getCricket() {
		return cricket;
	}
	public void setCricket(String cricket) {
		this.cricket = cricket;
	}
	public String getHighest_Score() {
		return highest_Score;
	}
	public void setHighest_Score(String highest_Score) {
		this.highest_Score = highest_Score;
	}
	public String getHalf_Centuries() {
		return half_Centuries;
	}
	public void setHalf_Centuries(String half_Centuries) {
		this.half_Centuries = half_Centuries;
	}
	public String getCenturies() {
		return centuries;
	}
	public void setCenturies(String centuries) {
		this.centuries = centuries;
	}
	public String getInnings_Played() {
		return innings_Played;
	}
	public void setInnings_Played(String innings_Played) {
		this.innings_Played = innings_Played;
	}

	public String getWickets() {
		return wickets;
	}
	public void setWickets(String wickets) {
		this.wickets = wickets;
	}
	public String getEconomy_rate() {
		return economy_rate;
	}
	public void setEconomy_rate(String economy_rate) {
		this.economy_rate = economy_rate;
	}
	public String getBowling_Average() {
		return bowling_Average;
	}
	public void setBowling_Average(String bowling_Average) {
		this.bowling_Average = bowling_Average;
	}
	
	public String getCatches_taken() {
		return catches_taken;
	}
	public void setCatches_taken(String catches_taken) {
		this.catches_taken = catches_taken;
	}
	public String getStumpings() {
		return stumpings;
	}
	public void setStumpings(String stumpings) {
		this.stumpings = stumpings;
	}
	public String getArmbat() {
		return armbat;
	}
	public void setArmbat(String armbat) {
		this.armbat = armbat;
	}
	public String getArmbowl() {
		return armbowl;
	}
	public void setArmbowl(String armbowl) {
		this.armbowl = armbowl;
	}
	public String getBowlertype() {
		return bowlertype;
	}
	public void setBowlertype(String bowlertype) {
		this.bowlertype = bowlertype;
	}
	
	
	//football getter setters
	

	public String getFootballLevel() {
		return footballLevel;
	}
	public String getFootball() {
		return football;
	}
	public void setFootball(String football) {
		this.football = football;
	}
	public void setFootballLevel(String footballLevel) {
		this.footballLevel = footballLevel;
	}
	public String getAchievement_Football() {
		return achievement_Football;
	}
	public void setAchievement_Football(String achievement_Football) {
		this.achievement_Football = achievement_Football;
	}
	public String getFootballFootball() {
		return footballFootball;
	}
	public void setFootballFootball(String footballFootball) {
		this.footballFootball = footballFootball;
	}
	public String getMatches_Played() {
		return matches_Played;
	}
	public void setMatches_Played(String matches_Played) {
		this.matches_Played = matches_Played;
	}
	public String getGoalkeeper_Technical_Skills() {
		return goalkeeper_Technical_Skills;
	}
	public void setGoalkeeper_Technical_Skills(String goalkeeper_Technical_Skills) {
		this.goalkeeper_Technical_Skills = goalkeeper_Technical_Skills;
	}
	public String getGoalkeeper_Mental_Skills() {
		return goalkeeper_Mental_Skills;
	}
	public void setGoalkeeper_Mental_Skills(String goalkeeper_Mental_Skills) {
		this.goalkeeper_Mental_Skills = goalkeeper_Mental_Skills;
	}
	public String getGoalkeeper_Physical_Skills() {
		return goalkeeper_Physical_Skills;
	}
	public void setGoalkeeper_Physical_Skills(String goalkeeper_Physical_Skills) {
		this.goalkeeper_Physical_Skills = goalkeeper_Physical_Skills;
	}
	public String getMatches_Played_D() {
		return matches_Played_D;
	}
	public void setMatches_Played_D(String matches_Played_D) {
		this.matches_Played_D = matches_Played_D;
	}
	public String getDefender_Technical_Skills() {
		return defender_Technical_Skills;
	}
	public void setDefender_Technical_Skills(String defender_Technical_Skills) {
		this.defender_Technical_Skills = defender_Technical_Skills;
	}
	public String getDefender_Physical_Skills() {
		return defender_Physical_Skills;
	}
	public void setDefender_Physical_Skills(String defender_Physical_Skills) {
		this.defender_Physical_Skills = defender_Physical_Skills;
	}
	public String getDefender_Mental_Skills() {
		return defender_Mental_Skills;
	}
	public void setDefender_Mental_Skills(String defender_Mental_Skills) {
		this.defender_Mental_Skills = defender_Mental_Skills;
	}
	public String getMatches_Played_M() {
		return matches_Played_M;
	}
	public void setMatches_Played_M(String matches_Played_M) {
		this.matches_Played_M = matches_Played_M;
	}
	public String getMidfielder_Technical_Skills() {
		return midfielder_Technical_Skills;
	}
	public void setMidfielder_Technical_Skills(String midfielder_Technical_Skills) {
		this.midfielder_Technical_Skills = midfielder_Technical_Skills;
	}
	public String getMidfielder_Mental_Skills() {
		return midfielder_Mental_Skills;
	}
	public void setMidfielder_Mental_Skills(String midfielder_Mental_Skills) {
		this.midfielder_Mental_Skills = midfielder_Mental_Skills;
	}
	public String getMidfielder_Physical_Skills() {
		return midfielder_Physical_Skills;
	}
	public void setMidfielder_Physical_Skills(String midfielder_Physical_Skills) {
		this.midfielder_Physical_Skills = midfielder_Physical_Skills;
	}
	public String getMatches_Played_F() {
		return matches_Played_F;
	}
	public void setMatches_Played_F(String matches_Played_F) {
		this.matches_Played_F = matches_Played_F;
	}
	public String getForward_Technical_Skills() {
		return forward_Technical_Skills;
	}
	public void setForward_Technical_Skills(String forward_Technical_Skills) {
		this.forward_Technical_Skills = forward_Technical_Skills;
	}
	public String getForward_Mental_Skills() {
		return forward_Mental_Skills;
	}
	public void setForward_Mental_Skills(String forward_Mental_Skills) {
		this.forward_Mental_Skills = forward_Mental_Skills;
	}
	public String getForward_Physical_Skills() {
		return forward_Physical_Skills;
	}
	public void setForward_Physical_Skills(String forward_Physical_Skills) {
		this.forward_Physical_Skills = forward_Physical_Skills;
	}
	
	//badminton getters & setters
	
	
	public String getAchievement_badminton() {
		return achievement_badminton;
	}
	public void setAchievement_badminton(String achievement_badminton) {
		this.achievement_badminton = achievement_badminton;
	}
	public String getBadminton() {
		return badminton;
	}
	public void setBadminton(String badminton) {
		this.badminton = badminton;
	}
	public String getBadmintonlevel() {
		return badmintonlevel;
	}
	public void setBadmintonlevel(String badmintonlevel) {
		this.badmintonlevel = badmintonlevel;
	}
	public String getMatches_Playedd() {
		return matches_Playedd;
	}
	public void setMatches_Playedd(String matches_Playedd) {
		this.matches_Playedd = matches_Playedd;
	}
	public String getSingles_technique() {
		return singles_technique;
	}
	public void setSingles_technique(String singles_technique) {
		this.singles_technique = singles_technique;
	}
	public String getSingles_backhand() {
		return singles_backhand;
	}
	public void setSingles_backhand(String singles_backhand) {
		this.singles_backhand = singles_backhand;
	}
	public String getSingles_footwork() {
		return singles_footwork;
	}
	public void setSingles_footwork(String singles_footwork) {
		this.singles_footwork = singles_footwork;
	}
	public String getSingles_service() {
		return singles_service;
	}
	public void setSingles_service(String singles_service) {
		this.singles_service = singles_service;
	}
	public String getSingles_reflexes() {
		return singles_reflexes;
	}
	public void setSingles_reflexes(String singles_reflexes) {
		this.singles_reflexes = singles_reflexes;
	}
	public String getSingles_agility() {
		return singles_agility;
	}
	public void setSingles_agility(String singles_agility) {
		this.singles_agility = singles_agility;
	}
	public String getSingles_speed() {
		return singles_speed;
	}
	public void setSingles_speed(String singles_speed) {
		this.singles_speed = singles_speed;
	}
	public String getSingles_power() {
		return singles_power;
	}
	public void setSingles_power(String singles_power) {
		this.singles_power = singles_power;
	}
	public String getSingles_endurance() {
		return singles_endurance;
	}
	public void setSingles_endurance(String singles_endurance) {
		this.singles_endurance = singles_endurance;
	}
	public String getSingles_flexibility() {
		return singles_flexibility;
	}
	public void setSingles_flexibility(String singles_flexibility) {
		this.singles_flexibility = singles_flexibility;
	}
	public String getSingles_concentration() {
		return singles_concentration;
	}
	public void setSingles_concentration(String singles_concentration) {
		this.singles_concentration = singles_concentration;
	}
	public String getMatches_playeddd() {
		return matches_playeddd;
	}
	public void setMatches_playeddd(String matches_playeddd) {
		this.matches_playeddd = matches_playeddd;
	}
	public String getDoubles_technique() {
		return doubles_technique;
	}
	public void setDoubles_technique(String doubles_technique) {
		this.doubles_technique = doubles_technique;
	}
	public String getDoubles_backhand() {
		return doubles_backhand;
	}
	public void setDoubles_backhand(String doubles_backhand) {
		this.doubles_backhand = doubles_backhand;
	}
	public String getDoubles_footwork() {
		return doubles_footwork;
	}
	public void setDoubles_footwork(String doubles_footwork) {
		this.doubles_footwork = doubles_footwork;
	}
	public String getDoubles_service() {
		return doubles_service;
	}
	public void setDoubles_service(String doubles_service) {
		this.doubles_service = doubles_service;
	}
	public String getDoubles_reflexes() {
		return doubles_reflexes;
	}
	public void setDoubles_reflexes(String doubles_reflexes) {
		this.doubles_reflexes = doubles_reflexes;
	}
	public String getDoubles_agility() {
		return doubles_agility;
	}
	public void setDoubles_agility(String doubles_agility) {
		this.doubles_agility = doubles_agility;
	}
	public String getDoubles_speed() {
		return doubles_speed;
	}
	public void setDoubles_speed(String doubles_speed) {
		this.doubles_speed = doubles_speed;
	}
	public String getDoubles_power() {
		return doubles_power;
	}
	public void setDoubles_power(String doubles_power) {
		this.doubles_power = doubles_power;
	}
	public String getDoubles_endurance() {
		return doubles_endurance;
	}
	public void setDoubles_endurance(String doubles_endurance) {
		this.doubles_endurance = doubles_endurance;
	}
	public String getDoubles_flexibility() {
		return doubles_flexibility;
	}
	public void setDoubles_flexibility(String doubles_flexibility) {
		this.doubles_flexibility = doubles_flexibility;
	}
	public String getDoubles_concentration() {
		return doubles_concentration;
	}
	public void setDoubles_concentration(String doubles_concentration) {
		this.doubles_concentration = doubles_concentration;
	}
	public String getDoubles_mutual_understanding() {
		return doubles_mutual_understanding;
	}
	
	
	
	
	
	
	public String getSingles_mutual_understanding() {
		return singles_mutual_understanding;
	}
	public void setSingles_mutual_understanding(String singles_mutual_understanding) {
		this.singles_mutual_understanding = singles_mutual_understanding;
	}
	public void setDoubles_mutual_understanding(String doubles_mutual_understanding) {
		this.doubles_mutual_understanding = doubles_mutual_understanding;
	}
	
	
	
	public String getMatches_playedddd() {
		return matches_playedddd;
	}
	public void setMatches_playedddd(String matches_playedddd) {
		this.matches_playedddd = matches_playedddd;
	}
	public String getMixed_doubles_technique() {
		return mixed_doubles_technique;
	}
	public void setMixed_doubles_technique(String mixed_doubles_technique) {
		this.mixed_doubles_technique = mixed_doubles_technique;
	}
	public String getMixed_doubles_backhand() {
		return mixed_doubles_backhand;
	}
	public void setMixed_doubles_backhand(String mixed_doubles_backhand) {
		this.mixed_doubles_backhand = mixed_doubles_backhand;
	}
	public String getMixed_doubles_footwork() {
		return mixed_doubles_footwork;
	}
	public void setMixed_doubles_footwork(String mixed_doubles_footwork) {
		this.mixed_doubles_footwork = mixed_doubles_footwork;
	}
	public String getMixed_doubles_service() {
		return mixed_doubles_service;
	}
	public void setMixed_doubles_service(String mixed_doubles_service) {
		this.mixed_doubles_service = mixed_doubles_service;
	}
	public String getMixed_doubles_reflexes() {
		return mixed_doubles_reflexes;
	}
	public void setMixed_doubles_reflexes(String mixed_doubles_reflexes) {
		this.mixed_doubles_reflexes = mixed_doubles_reflexes;
	}
	public String getMixed_doubles_agility() {
		return mixed_doubles_agility;
	}
	public void setMixed_doubles_agility(String mixed_doubles_agility) {
		this.mixed_doubles_agility = mixed_doubles_agility;
	}
	public String getMixed_doubles_speed() {
		return mixed_doubles_speed;
	}
	public void setMixed_doubles_speed(String mixed_doubles_speed) {
		this.mixed_doubles_speed = mixed_doubles_speed;
	}
	public String getMixed_doubles_power() {
		return mixed_doubles_power;
	}
	public void setMixed_doubles_power(String mixed_doubles_power) {
		this.mixed_doubles_power = mixed_doubles_power;
	}
	public String getMixed_doubles_endurance() {
		return mixed_doubles_endurance;
	}
	public void setMixed_doubles_endurance(String mixed_doubles_endurance) {
		this.mixed_doubles_endurance = mixed_doubles_endurance;
	}
	public String getMixed_doubles_flexibility() {
		return mixed_doubles_flexibility;
	}
	public void setMixed_doubles_flexibility(String mixed_doubles_flexibility) {
		this.mixed_doubles_flexibility = mixed_doubles_flexibility;
	}
	public String getMixed_doubles_concentration() {
		return mixed_doubles_concentration;
	}
	public void setMixed_doubles_concentration(String mixed_doubles_concentration) {
		this.mixed_doubles_concentration = mixed_doubles_concentration;
	}
	public String getMixed_doubles_mutual_understanding() {
		return mixed_doubles_mutual_understanding;
	}
	public void setMixed_doubles_mutual_understanding(
			String mixed_doubles_mutual_understanding) {
		this.mixed_doubles_mutual_understanding = mixed_doubles_mutual_understanding;
	}
	
	//chess getters & setters
	
	
	public String getChesslevel() {
		return chesslevel;
	}
	public void setChesslevel(String chesslevel) {
		this.chesslevel = chesslevel;
	}
	public String getAchievement_chess() {
		return achievement_chess;
	}
	public void setAchievement_chess(String achievement_chess) {
		this.achievement_chess = achievement_chess;
	}
	public String getMatches_Playeddchess() {
		return matches_Playeddchess;
	}
	public void setMatches_Playeddchess(String matches_Playeddchess) {
		this.matches_Playeddchess = matches_Playeddchess;
	}
	public String getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(String intelligence) {
		this.intelligence = intelligence;
	}
	public String getChess_concentration() {
		return chess_concentration;
	}
	public void setChess_concentration(String chess_concentration) {
		this.chess_concentration = chess_concentration;
	}
	public String getChess_technique() {
		return chess_technique;
	}
	public void setChess_technique(String chess_technique) {
		this.chess_technique = chess_technique;
	}
	public String getChess_speed() {
		return chess_speed;
	}
	public void setChess_speed(String chess_speed) {
		this.chess_speed = chess_speed;
	}
	public String getMotivation_and_values() {
		return motivation_and_values;
	}
	public void setMotivation_and_values(String motivation_and_values) {
		this.motivation_and_values = motivation_and_values;
	}
	
}
