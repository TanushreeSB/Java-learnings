class CopyConstructor_Student {
    String name;
    int age;
    
    CopyConstructor_Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    CopyConstructor_Student(CopyConstructor_Student s){
        this.name = s.name;
        this.age = s.age;
    }
    
    void display(){
        System.out.println(name + " " + age);
    }
    
    public static void main(String args[]){
        Student s = new CopyConstructor_Student("Tanushree",22);
        Student s1 = new CopyConstructor_Student(s);
        s.display();
        s1.display();
    }
}
