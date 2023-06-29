package Child;

public class Child {
    public byte age;
    public String name;
    public int height;

    public Child() {
        System.out.println("Появился новый ребенок: ");
    }
    public Child(String name, byte age) {
        this.name = name;
        this.age = age;
        System.out.println("Появился новый ребенок: с именем "+name);
    }

    public byte getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void GotoSchool(boolean summer) {
        if (summer==true)
            System.out.println(name+": No!");
        else
            System.out.println(name+": No! but okay");
    }
    public void ToGrandMa() {
        System.out.println("Let's go!");
    }

}
