public class A {
    int a;
    int b;

    void f(){}


    //메소드 시그니처 중요
    /*
    String f(int a){
        this.a = a;
        return null;
    }
    void f(int b){
        this.b =b;
    }
     */
    void f(int a, int b){
        this.a = a;
        this.b = b;
    }
}
