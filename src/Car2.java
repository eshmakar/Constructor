
public class Car2 {


    //это конструктор с двумя параметрами. По умолчанию создается пустой конструктор Car2(){}
    Car2(String cvet, String motor) {
        color = cvet;
        engine = motor;
    }

    String color, engine;
}


class Car2Test {
    public static void main(String[] args) {

        //Здесь уже не можем вызвать пустой конструктор Car2 c2 = new Car2()
        //так как конструктора по умолчанию уже нет, мы создали с двумя параметрами
        Car2 c2 = new Car2("yellow", "V4");
        System.out.println(c2.color);
        System.out.println(c2.engine);
    }
}