package hsf302.lab02.pojo;

/**
 * Task 2 — Student POJO
 *
 * Hoàn thiện class Student với đầy đủ fields, constructor và getter/setter.
 */
public class Student {

    // TODO 2.1
    private String name;
    // TODO 2.2
    private int age;

    // TODO 2.3
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // TODO 2.4
    public String getName() {
        return name;
    }

    // TODO 2.5
    public int getAge() {
        return age;
    }

    // TODO 2.6
    public void setName(String name) {
        this.name = name;
    }

    // TODO 2.7
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * KHÔNG sửa method toString() này.
     */
    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}
