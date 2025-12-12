package kadai_018;

abstract public class Kato_Chapter18 {
	
	//フィールド
	public String familyName = "加藤"; //性
	public String givenName = ""; //名
	public String address = "東京都中野区〇×"; //住所
	
	
	//共通の紹介を出力するメソッド
	public void commonIntroduce() {
		System.out.println("名前は" + this.familyName + this.givenName +"です");
		System.out.println("住所は" + this.address + "です");
	}
	
	//個別の紹介を出力する抽象メソッド
	abstract public void eachIntroduce();
	
	//自己紹介を実行するメソッド
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
		System.out.print("\n");
	}

}
