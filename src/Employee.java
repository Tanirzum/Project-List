public class Employee {
    private String surName;
    private String name;
    private int age;
    private String men;
    private String Education;
    private String post;
    private String Separately;

    public Employee(String surName, String name, int age, String men, String education, String post, String separately) {
        this.surName = surName;
        this.name = name;
        this.age = age;
        this.men = men;
        Education = education;
        this.post = post;
        Separately = separately;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
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

    public String getMen() {
        return men;
    }

    public void setMen(String men) {
        this.men = men;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String education) {
        Education = education;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getSeparately() {
        return Separately;
    }

    public void setSeparately(String separately) {
        Separately = separately;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "surName='" + surName + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", men='" + men + '\'' +
                ", Education='" + Education + '\'' +
                ", post='" + post + '\'' +
                ", Separately='" + Separately + '\'' +
                '}';
    }
}
