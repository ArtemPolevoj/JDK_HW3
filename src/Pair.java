/*
Напишите обобщенный класс Pair, который представляет собой пару значений разного
типа. Класс должен иметь методы getFirst(), getSecond() для получения значений
каждого из составляющих пары, а также переопределение метода toString(),
возвращающее строковое представление пары.
 */
public class Pair<T, U> {
    private final T first;
    private final U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "(first " + first.toString() + ", second " + second.toString() + ")";
    }

    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>(1, "one");
        System.out.println(pair1);
        System.out.println(pair1.getFirst());
        System.out.println(pair1.getSecond());

        Pair<String, Double> pair2 = new Pair<>("two", 2.0);
        System.out.println(pair2);
        System.out.println(pair2.getFirst());
        System.out.println(pair2.getSecond());
    }
}
