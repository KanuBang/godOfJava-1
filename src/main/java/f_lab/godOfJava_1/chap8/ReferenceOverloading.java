package f_lab.godOfJava_1.chap8;

public class ReferenceOverloading {

    public static void main(String[] args) {
        ReferenceOverloading referenceOverloading = new ReferenceOverloading();
    }

    public void print(int data){

    }

    public void print(String data){

    }

    public void print(int intData, String stringData){

    }

    public void print(String stringData, int intData){

    }
    /*
    'print(int, String)' is already defined in 'f_lab.godOfJava_1.chap8.ReferenceOverloading'
    public void print(int a, String  x) {

    }
    */
}

