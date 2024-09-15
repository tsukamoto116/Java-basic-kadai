package kadai_024;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter24 {

	//自分のじゃんけんの手を入力する
	public String getMyChoice() {
		
	    //Scannerクラスのオブジェクトを生成する
	    Scanner scanner = new Scanner(System.in);
	     
	    String s = "p";
	     
	    while(true) { 
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
	      
	    //入力した内容を取得する
	      s = scanner.next();
	      
	    //正しいじゃんけんの手であるか判定
	    if(s.equals("r") || s.equals("s") || s.equals("p")) {
	    	break;
	    } else {
	    	System.out.println("エラーです。再度入力してください。");
	    	
	    }
	  }
	  //Scannerクラスのオブジェクトをクローズする
		scanner.close();
		return s;
	}

    //対戦相手のじゃんけんの手の乱数
    public String getRandom() {
    	
    	//乱数で3未満の数を取得
    	String[] pcHands = {"r", "s", "p"};
    	
    	//取得した3未満の数をfloorメソッドで切り捨て0から2を取得
    	String h =pcHands[(int)Math.floor(Math.random() * 3)];
    	return h;
    }
    
    //じゃんけんを行う
    public void playGame() {
    	String c =getMyChoice();
    	String r =getRandom();
    	
    	//自分と対戦相手のじゃんけんの手を出力する
    	HashMap<String, String> play = new HashMap<String, String>();
    	
    	//入力値r,s,pをグー、チョキ、パーに置き換える
    	play.put("r", "グー");
		play.put("s", "チョキ");
		play.put("p", "パー");
		
	System.out.println("自分の手は" + play.get(c) + "対戦相手の手は" + play.get(r));
	
	//自分と対戦相手のじゃんけんの手の比較
	if ((c.equals("r") && r.equals("r")) || (c.equals("s") && r.equals("s")) || (c.equals("p") && r.equals("p"))){
		System.out.println("あいこです");
	}
	
	
	if ((c.equals("r") && r.equals("s")) || (c.equals("s") && r.equals("p")) || (c.equals("p") && r.equals("r"))){
		System.out.println("自分の勝ちです");
	}
	
	if ((c.equals("r") && r.equals("p")) || (c.equals("s") && r.equals("r")) || (c.equals("p") && r.equals("s"))){
		System.out.println("自分の負けです");		
	}
	
 };
}
	
    
  