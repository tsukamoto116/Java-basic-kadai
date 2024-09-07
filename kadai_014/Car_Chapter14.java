package kadai_014;

// 車クラス
public class Car_Chapter14 {
	// フィールド（内部データ）
	private int gear =  1;	
	private int speed = 30;	
	
	// コンストラクタ（初期化処理）
	public Car_Chapter14( int gear, int speed ) {
		this.gear = gear;
		this.speed = speed;			
		
	}	
	
	
	// メソッド;ギアチェンジ
    public void gearChange(final int afterGear) {
        if (afterGear >= 1 && afterGear <= 5) {
            speed = afterGear * 10;
            System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました");
            gear = afterGear;
        } else {
        	speed = 10;
            System.out.println(afterGear + "!!This value is over the gearlimit." + "Limit the speed to a specified value.");
        }
    }
		
	public void run() {
		System.out.println("速度は時速" + this.speed + "kmです");
	}
	
}





