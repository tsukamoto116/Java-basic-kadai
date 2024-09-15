package kadai_020;

import java.util.HashMap;

public class Dictionary_Chapter20 {
	

    
	public void seachWord(String[] word) {
		//英単語の辞書として機能する
		HashMap<String, String> dictionary = new HashMap<>();

		String result = "";

		
		dictionary.put("apple", "りんご");
		dictionary.put("peach", "桃");
		dictionary.put("banana", "バナナ");
		dictionary.put("lemon", "レモン");
		dictionary.put("pear", "梨");
		dictionary.put("kiwi", "キウィ");
		dictionary.put("strawberry", "いちご");
		dictionary.put("grape", "ぶどう");
		dictionary.put("muscat", "マスカット");
		dictionary.put("cherry", "さくらんぼ");

		
		for (int i = 0; i < word.length; i++) {
			result = dictionary.get(word[i]);

			if (result == null) {
				System.out.println(word[i] + "は辞書に存在しません");
			} else {
				System.out.println(word[i] + "の意味は" + result);
			}
		}

	}
}
