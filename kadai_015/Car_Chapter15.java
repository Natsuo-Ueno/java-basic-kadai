package kadai_015;

public class Car_Chapter15 {
	private int gear  = 0; //ギア
	private int speed = 0; //速度
	
	//コンストラクタ
	public Car_Chapter15(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}
	
	
	//【メソッド】ギアの値により速度を変える
	public void changeGear(final int afterGear) {
		
		System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました");
		
		this.speed = switch(afterGear) {
			case 1 -> 10;
			case 2 -> 20;
			case 3 -> 30;
			case 4 -> 40;
			case 5 -> 50;
		   default -> 60;
		};
		
	}
	
	//【メソッド】ギアチェンジ後の速度を表示する
	public void run() {
			
		System.out.println("速度は時速" + this.speed + "kmです");
	}

}
