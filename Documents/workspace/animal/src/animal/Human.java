//Animal クラスを継承し、Thinkable インターフェイスを実装する
package animal;

public class Human extends animal implements Thinkable {
   //コンストラクタで名前・年齢・趣味の情報を格納する引数を設定し、処理内容として名前・年齢・趣味の各変数を引数の情報で初期化するようにしてください
    public Human(String name, int age,String hobby) {
        super(name,age);
        this.hobby = hobby;
    }
    //趣味の情報を保管するフィールドを定義
    private String hobby;

    // getter
    public String getHobby() {
        return hobby;
    }

    // setter
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    //thinkメソッド
    @Override
    public void think() {
        System.out.println("私は"+this.hobby+"について考えます。");
    }

}
