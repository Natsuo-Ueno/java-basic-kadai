package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	String[] handArray = {"r", "s", "p"} ;
	String myChoice = null;
	String opponentChoice = null;
	
	//自分のじゃんけんの手を入力するメソッド
	public String getMyChoice() {
		
		//Scannerクラスのオブジェクトを生成する
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 1; i <= 3; i++) {
	
			//メッセージを表示
			System.out.println("自分のじゃんけんの手を入力しましょう\nグーはrockのrを入力しましょう\nチョキはscissorsのsを入力しましょう\nパーはpaperのpを入力しましょう");
			
			//入力した内容を取得する
			myChoice = scanner.nextLine();
		
			//入力した内容が正しいか判定する
			for(String hand : handArray) {
				if(myChoice.equals(hand)) {
					scanner.close();//scannerクラスを閉じる
					return myChoice;//入力内容を返す
				}
			}
			//誤った入力だった場合の出力メッセージ
			System.out.println("入力内容が正しくありません。r、s、pのいずれかを入力してください");
		}
		//誤った入力が3回行われた場合の出力メッセージ
		System.out.println("誤った入力回数が3回に達したため強制終了します");
		scanner.close();//scannerクラスを閉じる
		System.exit(0);//プログラムを終了する
		return null;
	}		
	
	//対戦相手のじゃんけんの手を乱数で選ぶメソッド
	public String getRandom() {
		opponentChoice = handArray[(int) Math.floor(Math.random() * 3)];
		return opponentChoice;
	}
	
	//じゃんけんを行うメソッド
	public void playGame(String myHand, String opponentHand) {
		
		//HashMapの宣言
		HashMap<String,String> handMap = new HashMap<String,String>();
			
		//要素の追加
		handMap.put("r", "グー");
		handMap.put("s", "チョキ");
		handMap.put("p", "パー");
		
		//じゃんけんの手を出力
		System.out.println("自分の手は" + handMap.get(myHand) + ",対戦相手の手は" + handMap.get(opponentHand));
		
		//HashMapの宣言
		HashMap<String,Integer> handNumMap = new HashMap<String,Integer>();
		
		//要素の追加
		handNumMap.put("r", 1);
		handNumMap.put("s", 2);
		handNumMap.put("p", 3);
		
		//じゃんけんの手を比較する
		if(myHand.equals(opponentHand)) {
			System.out.println("あいこです");	
		} else if((handNumMap.get(myHand) - handNumMap.get(opponentHand) == -1) || (handNumMap.get(myHand) - handNumMap.get(opponentHand) == 2)) {
			System.out.println("自分の勝ちです");
		} else {
			System.out.println("自分の負けです");
		}
	}
	
}
