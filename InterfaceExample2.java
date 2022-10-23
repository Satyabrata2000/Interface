package Interface;

class InterfaceExample2 implements InterfaceExample1{

    public void print(){
        System.out.println("String1");
    }

    public static void main(String[] args) {

        InterfaceExample2 obj = new InterfaceExample2();
        obj.print();
    }


    @Override
    public void Use() {

    }
}
