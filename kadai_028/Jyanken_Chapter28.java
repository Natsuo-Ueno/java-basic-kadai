package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	String[] handArray = {"r", "s", "p"} ;
	String myChoice = null;
	String opponentChoice = null;
	int cnt = 0;
	
	//自分のじゃんけんの手を入力するメソッド
	public String getMyChoice() {
		
		for(int i = 1; i <= 3; i++) {
	
			//メッセージを表示
			System.out.println("自分のじゃんけんの手を入力しましょう\nグーはrockのrを入力しましょう\nチョキはscissorsのsを入力しましょう\nパーはpaperのpを入力しましょう");
		
			//Scannerクラスのオブジェクトを生成する
			Scanner scanner = new Scanner(System.in);
			
			//入力した内容を取得する
			myChoice = scanner.nextLine();
		
			//入力した内容が正しいか判定する
			for(String hand : handArray) {
				if(myChoice.equals(hand)) {
					//入力内容を返す
					return myChoice;
				}
			}
			
			//誤った入力だった場合の出力メッセージ
			System.out.println("入力内容が正しくありません。r、s、pのいずれかを入力してください");
		}
		System.out.println("誤った入力回数が3回に達したため強制終了します");
		System.exit(0);
		return null;
	}		
	
	//対戦相手のじゃんけんの手を乱数で選ぶメソッド
	public String getRandom() {
		opponentChoice = handArray[(int) Math.round(Math.random() * 2)];
		return opponentChoice;
	}
	
	//じゃんけんを行うメソッド
	public void playGame() {
		
		//HashMapの宣言
		HashMap<String,String> handMap = new HashMap<String,String>();
			
		//要素の追加
		handMap.put("r", "グー");
		handMap.put("s", "チョキ");
		handMap.put("p", "パー");
		
		//じゃんけんの手を出力
		System.out.println("自分の手は" + handMap.get(myChoice) + ",対戦相手の手は" + handMap.get(opponentChoice));
		
		//HashMapの宣言
		HashMap<String,Integer> handNumMap = new HashMap<String,Integer>();
		
		//要素の追加
		handNumMap.put("r", 1);
		handNumMap.put("s", 2);
		handNumMap.put("p", 3);
		
		//じゃんけんの手を比較する
		if(myChoice.equals(opponentChoice)) {
			System.out.println("引き分けです");	
		} else if((handNumMap.get(myChoice) - handNumMap.get(opponentChoice) == -1) || (handNumMap.get(myChoice) - handNumMap.get(opponentChoice) == 2)) {
			System.out.println("自分の勝ちです");
		} else {
			System.out.println("相手の勝ちです");
		}
	}
	
}