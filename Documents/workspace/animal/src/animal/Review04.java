package animal;

public class Review04 {
    /*Humanクラスのインスタンスを3つ作成。インスタンスは個性。
    name = new name();
    age = new age();
    hobby = new hobby();

    //フィールド
    private String name;
    protected int age;
    protected String hobby;

    //引数ありコンストラクタ
    public Human(String name,int age,String hobby) {
    this.name = name;
    this.age = age;
    this.hobby = hobby;*/

    public static void main(String[] args) {
        Human tanaka = new Human("田中 太郎", 25, "電車");
        tanaka.say();
        tanaka.think();
        Human suzuki = new Human("鈴木 次郎", 30, "野球");
        suzuki.say();
        suzuki.think();
        Human sato = new Human("佐藤 花子", 20, "映画");
        sato.say();
        sato.think();
    }
}