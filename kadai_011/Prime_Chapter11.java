package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		boolean[] primeJudge = new boolean[101];

		for (int i = 1; i < primeJudge.length; i++) {
			primeJudge[i] = true;
		}

		//割る数
		int numberDivided = 2;
		while (numberDivided < primeJudge.length) {
			//素数であるかを判別
			for (int i = numberDivided + 1; i < primeJudge.length; i++) {
				if (i % numberDivided == 0) {
					primeJudge[i] = false;
	                                continue;
				}
			}

			numberDivided += 1;
		}

		    // 素数を出力
		    for (int i = 2; i < primeJudge.length; i++) {
			if (primeJudge[i]) {
			System.out.println(i);
			}
		} System.out.println(57 + "も素数...");
	}
}
			

	


