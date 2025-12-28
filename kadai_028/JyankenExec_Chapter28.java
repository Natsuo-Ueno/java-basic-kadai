package kadai_028;

public class JyankenExec_Chapter28 {
	public static void main(String[] args) {
		
		//インスタンスの作成
		Jyanken_Chapter28 Jyanken = new Jyanken_Chapter28();
		
		//getMyChoiceメソッド、getRandomメソッドの戻り値を引数に渡してplayGameメソッドを実行
		Jyanken.playGame(Jyanken.getMyChoice(), Jyanken.getRandom());
 		 
	}

}