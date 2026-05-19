class ParamerterisedConstructor_Student {
    String name;
    int age;
    
    ParamerterisedConstructor_Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    

    void display(){
        System.out.println(name + " " + age);
    }
    
    public static void main(String args[]){
        ParamerterisedConstructor_Student s = new ParamerterisedConstructor_Student("Tanushree",22);
        ParamerterisedConstructor_Student s1 = new ParamerterisedConstructor_Student("Ria",21);
        s.display();
        s1.display();
    }
}
