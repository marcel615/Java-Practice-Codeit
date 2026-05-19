package etc.api.optional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {

        Map<String, String> phoneByName = new HashMap<>();
        phoneByName.put("kim", "010-1234-5678");

        String phone = phoneByName.get("lee");   // 없음
//        System.out.println(phone.length());      // NullPointerException!


        Optional<String> name = Optional.ofNullable(phoneByName.get("d"));
        name.ifPresent(n -> System.out.println(n));
        System.out.println(name.isPresent());

        System.out.println("=================================");

        List<User> users = List.of(
                new User("kim1", "kim@gmail.com", 15),
                new User("kim2", "kim2@gmail.com", 21),
                new User("kim3", "kim3@gmail.com", 18),
                new User("kim4", "kim4@gmail.com", 19)
        );

        int max = users.stream()
                .filter(u -> u.getAge() > 30)
                .mapToInt(User::getAge)
                .max()
                .orElse(0);
        System.out.println(max);


    }
}
