package kadai_021;
import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	public void serch(String[] serchWord) {
		
		//HashMapの宣言
		HashMap<String,String> dictionaryMap = new HashMap<String,String>();
	
		//要素の追加
		dictionaryMap.put("apple", "りんご");
		dictionaryMap.put("peach", "桃");
		dictionaryMap.put("banana", "バナナ");
		dictionaryMap.put("lemon", "レモン");
		dictionaryMap.put("pear", "梨");
		dictionaryMap.put("kiwi", "キウィ");
		dictionaryMap.put("strawberry", "いちご");
		dictionaryMap.put("grape", "ぶどう");
		dictionaryMap.put("muscat", "マスカット");
		dictionaryMap.put("cherry", "さくらんぼ");
		
		//英単語の検索
		for(int i = 0; i < serchWord.length ; i++) {
			if (dictionaryMap.get(serchWord[i]) == null) {
				System.out.println(serchWord[i] + "は辞書に存在しません");	
			}else {
				System.out.println(serchWord[i] + "の意味は" + dictionaryMap.get(serchWord[i]) );
			}
		}
		
	}
	
}
