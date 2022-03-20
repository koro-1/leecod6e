class Animal {

    private String name;
    private int age;
    public Animal(){
        System.out.println("父类Animal中的构造。") ;// 父类的构造方法
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void eat() {
        System.out.println("Animal eat...");
    }
    public void cry() {
        System.out.println("Animal cry...");
    }
}
class Cat extends Animal {		// Cat是Animal的子类，扩展父类的功能
    private String type;			// 新定义的属性type
    public Cat(){
        System.out.println("子类Cat中的构造。") ;// 子类的构造方法
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type= type;
    }
    public void eat(){				// 覆写父类中的方法，扩大了权限
        System.out.println("猫吃鱼") ;
    }
    public void cry(){				// 覆写父类中的方法，扩大了权限
        System.out.println("喵喵") ;
    }

}
public class AnimalTest1 {
    public static void main(String[]  args) {
        Cat cat = new Cat();
        cat.eat();
        cat.cry();
        cat.setType("加菲猫");
        Animal stu = new Animal();
        stu.setName("猫");			// 此时访问的方法是父类的，子类中并没有定义
        stu.setAge(30);			// 此时访问的方法是父类的，子类中并没有定义

        // 此方法是子类定义的
        System.out.println("名称：" + stu.getName() + "，年龄：" + stu.getAge()
                + "，品种：" + cat.getType());
    }
}