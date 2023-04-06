package lesson1_18;
import java.util.Arrays;
import java.util.Random;
public class Curriculum_New_1_18{
	
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	public static void hello(){
		System.out.println("Hello JavaSE " + 11);
	}
	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	private static void kakezan(int x,int y) {
		System.out.println(x*y);
	}
	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	public static void hairetu(int[] data) {
			        for (int i = 0; i < data.length; i++) {
			        	System.out.println(data[i]);
			        }
			    }
	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	private static void kakezan(double x,double y) {
		System.out.println(x+y);
	}
	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	public static int[] number(int y) {
		int[] nums =new int[y];
		Random rnd =new Random();
		for (int i = 0; i< nums.length;i++) {
		nums[i] = rnd.nextInt(100) + 1;
		}
		return  nums;
		}
	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	public static void heikinti(int[] nums) {
		double average = Arrays.stream(nums).average().getAsDouble();
		System.out.println(average);
	}
	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	public static void hantei(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] >= 50) {
				System.out.println("true");
			}else {
				System.out.println("false");
			}
        }
	}
	public static void main(String[] args) {
    // 作成したメソッドをここで呼び出してください
	int [] data = {1,2,3,4,5,6};
	int[] nums;
	hello();
	kakezan(4,5);
	hairetu(data);
	kakezan(2.1,3.4);
	nums = number(5);
	for(int i: nums) {
		System.out.println(i);
	}
	heikinti(nums);
	hantei(nums);
}}