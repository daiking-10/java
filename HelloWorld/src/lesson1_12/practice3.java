/*
	問題．while文を使用し、以下のプログラムを作成してください。
		・1～100を出力
		・奇数の数字に「〇は奇数です」と出力
		・偶数の数字に「○は偶数です」と出力
		  出力結果  1は奇数です
					2は偶数です
					3は奇数です
					4は偶数です
						・
						・
						・
					100は偶数です
*/
package lesson1_12;

public class practice3 {

	public static void main(String[] args) {
		int num = 0;
	    while (num < 100){
	    	num += 1;
	        System.out.println(num + "は奇数です");
	        num += 1;
	        System.out.println(num + "は偶数です");
	      }
	    
	}

}
