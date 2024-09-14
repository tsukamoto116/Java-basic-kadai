package kadai_017;

abstract public class Kato_Chapter17 { 
	
	 String familyName;
	 String givenName;
	 String address;
	
	public void commonIntroduce() {
		familyName = "加藤";
		address = "東京都中央区〇×";
	}
	abstract public void eachIntroduce();
	
	public void execIntroduce() {
		commonIntroduce();
		setGivenName();
		eachIntroduce();
	}
	abstract public void setGivenName();
	
	
	
	
}

