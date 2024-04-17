package f;

public class cal1 extends cal{
    cal1 (String name, int a){
        this.name=name;
        this.a=a;
    }

    public static void main(String[] args) {

        cal1 Child= new cal1("나의 라임오렌지 나무", 10000);
        System.out.println("[구현 결과 1]");
        Child.Print();
    }


}
