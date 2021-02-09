import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Array1kadai {

	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("テストの点数を入力してください。(国語・数学・英語)");
		int [] test = new int[3];

		/*String str = br.readLine();
		test[i] = Integer.parseInt(str);*/

		String str1 = br.readLine();
		String str2 = br.readLine();
		String str3 = br.readLine();
		int n1 = Integer.parseInt(str1);
		int n2 = Integer.parseInt(str2);
		int n3 = Integer.parseInt(str3);

		test[0] = n1;
		test[1] = n2;
		test[2] = n3;


		System.out.println("国語の点数は" + test[0] + "です。");
		System.out.println("数学の点数は" + test[1] + "です。");
		System.out.println("英語の点数は" + test[2] + "です。");
		System.out.println("合計点は" + (test[0]+test[1]+test[2]) + "です。");

	}

}
