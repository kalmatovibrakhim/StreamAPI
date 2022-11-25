import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Random random =new Random();

        List<Integer>numbers = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            numbers.add(random.nextInt(40));
        }
        System.out.println(numbers);
        numbers=numbers.stream()
                .filter(f->f%2==0)
                .map(m->m*m)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(numbers);
        System.out.println("Max number of List is "+numbers.get(numbers.size()-1));
    }
}