/*
①配列int test[][]に以下の成績を格納し、表示してください。
	出力結果：生徒1：国語64点、数学73点、英語69点
			  生徒2：国語58点、数学81点、英語75点
			  生徒3：国語86点、数学68点、英語79点
			  生徒4：国語72点、数学55点、英語80点
	
②それぞれの教科の平均点を表示してください。
	出力結果：国語の平均点は○○点です。
			  数学の平均点は○○点です。
			  英語の平均点は○○点です。
*/
package lesson1_15;

public class Practice {

	public static void main(String[] args) {
		int test [][] = {{1,64,73,69},{2,58,81,75},{3,86,68,79},{4,72,55,80}};
		System.out.println("生徒" + test[0][0] + ":国語" + test[0][1] + "点、" + "数学" + test[0][2] + "点、" +"英語" + test[0][3] + "点");
		System.out.println("生徒" + test[1][0] + ":国語" + test[1][1] + "点、" + "数学" + test[1][2] + "点、" +"英語" + test[1][3] + "点");
		System.out.println("生徒" + test[2][0] + ":国語" + test[2][1] + "点、" + "数学" + test[2][2] + "点、" +"英語" + test[2][3] + "点");
		System.out.println("生徒" + test[3][0] + ":国語" + test[3][1] + "点、" + "数学" + test[3][2] + "点、" +"英語" + test[3][3] + "点");
		
		int sum = 0;
		int count = 0;
		for (int j = 1; j < test.length; j++) {
			for (int i = 0; i < test.length; i++) {
				sum += test[i][j];
				count ++;	
			}
			if(j == 1) {
				System.out.println("国語の平均点は" + sum / count + "点です。");
			}
			else if(j == 2){
				System.out.println("数学の平均点は" + sum / count + "点です。");
			}
			else if(j == 3){
				System.out.println("英語の平均点は" + sum / count + "点です。");
			}
		
	}
}}




