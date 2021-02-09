import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Array2kadai {
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));


	int[] num = new int[10];
	System.out.println(num.length + "回整数を入力してください。");

	for(int i=0; i<num.length; i++) {
		String str = br.readLine();
		num[i] = Integer.parseInt(str);
		}
	for(int s=0; s<num.length-1; s++) {
		for(int t=s+1; t<num.length; t++) {
			if(num[t] < num[s]) {
				int tmp = num[t];
				num[t] = num[s];
				num[s] = tmp;
			}
		}
	}
	for(int j=0; j<num.length; j++) {
		System.out.println((j+1) + "番目に小さい数は"  + num[j] + "です。");
	}
}

}
