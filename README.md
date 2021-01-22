# operation_check
ポリテクセンターの授業中に作ったコードを少し改造して掲載し、マークダウンページの動作確認をする。

## 入力した整数が50以上で真となるコード

早速、Rubyの授業で作成したコードを載せてみる。
```ruby
# 待ち時間に書き換えした部分
# 入力した数値を、以下の条件式で判定する
puts "整数を入力してください。"
num = gets.chomp.to_i

# 以下が授業で作成するよう指示のあった課題
# 50以上かどうか真偽値で返却
def large_50?(num)
  if num >= 50
    true
  else
    false
  end
end

p large_50?(num)
```

なお、上記をJavaで書くと以下のコードになる。
```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 授業で習った内容で簡単に作成できる。
class Ifelse {
	public static void main(String[] args) throws IOException {
		System.out.println("整数を入力してください。");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int num = Integer.parseInt(str);

		if (num >= 50) {
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
	}
}
```
