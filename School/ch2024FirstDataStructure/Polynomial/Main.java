package School.ch2024FirstDataStructure.Polynomial;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(5);
        list.add(10);
        list.add(0, 110);
        list.add(1);
        list.remove(new Integer(1));

        System.out.println(list);

    }
}
