//問題	箇所　Java基礎A_1
package e4_4;

public class Sample_1 {
	public static void main(String[] args) {


		// 整数の変数宣言をする。
		int num1 = 88;
		System.out.println("1つ目→" + num1);
		int num2 = 8;
		System.out.println("2つ目→" + num2);

		// 計算を行う
		int wa = num1 + num2;
		int sa = num1 - num2;
		int seki = num1 * num2;
		int sho = num1 / num2;
		int amari = num1 % num2;

		// 計算結果を表示する
		System.out.println("和＝" + w);
		System.out.println("差＝" + sa);
		System.out.println("積＝" + seki);
		System.out.println("商＝" + sho);
		System.out.println("余り＝" + amari);
	}
}
// wwwwwwwwwwwwwwwwwwwwwwwwww
/*エラーコード
Exception in thread "main" java.lang.Error: Unresolved compilation problem:
	w を変数に解決できません

	at e4_4.Sample_1.main(Sample_1.java:22)
エラー内容
変数名wという変数が存在していないため。

解決方法
int w = num1 + num2;
という変数wを
System.out.println("和＝" + w);
の前に定義しておかなければいけなかった。
*/