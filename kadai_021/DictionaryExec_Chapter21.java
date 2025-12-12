package kadai_021;

public class DictionaryExec_Chapter21 {
	
	public static void main(String[] args) {
		
	//インスタンスの作成
	Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
	
	//調べる英単語を配列にセット
	String[] serchWordArray = {"apple", "banana", "grape", "orange"};
	
	//serchメソッドを実行して検索
	dictionary.serch(serchWordArray);
	
	}

}
