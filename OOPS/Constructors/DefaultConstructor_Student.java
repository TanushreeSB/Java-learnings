class DefaultConstructor_Student {
    String name;
    int age;
    
    DefaultConstructor_Student(){
        name = "tanushree";
        age = 22;
    }
    

    void display(){
        System.out.println(name + " " + age);
    }
    
    public static void main(String args[]){
        DefaultConstructor_Student s = new DefaultConstructor_Student();
        s.display();
        //System.out.println(s.name + " " + s.age);
    }
}
