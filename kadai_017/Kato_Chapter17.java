package kadai_017;

abstract public class Kato_Chapter17 { //親クラス
	
	final public String familyName = "加藤";
	public String givenName = "";
	final public String address = "東京都中央区〇×";
	
	public void commonIntroduce() {
		System.out.println(familyName);
	}
	abstract public void eachIntroduce();
	
	public void execIntroduce() {
		
	}
	
	
	
}

