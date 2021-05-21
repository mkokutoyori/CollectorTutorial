import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Main {
    public static void main(String[] args) {
        var person=Person.builder()
                .age(22)
                .email("mandengemmanuelarthur100@gmail.com")
                .firstName("Emmanuel Arthur")
                .lastName("Mandeng")
                .build();
        System.out.println("person = " + person);
    }
}

@Data
@NoArgsConstructor
@Builder
class Person{
    private String firstName;
    private String lastName;
    private String email;
    private int age;
}
