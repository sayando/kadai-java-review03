package animal;
public class animal {
 //フィールド
    private String name; // フィールドに対する修飾子
    private int age; // フィールドに対する修飾子
 //引数ありのコンストラクタ
    public animal(String name, int age) {
        this.name = name;
        this.age = age;
}
 //メソッド this.を使用する際はvoid say の後は空欄で良い
    public void say() {
System.out.println(this.name + "です。" + this.age + "歳です。");
}
}