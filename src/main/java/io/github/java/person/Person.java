package io.github.java.person;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
class Person1 {
    private String name;
    private Integer age;
    private Double height;

    public static void main(String[] args) {
        Person1 person1 = Person1.builder()
                .name("Duyunjian")
                .age(21)
                .build();

        Person1 person2 =Person1.builder()
                .name("Sun")
                .age(18)
                .build();
        Person1 person3 = Person1.builder()
                .name("Tom")
                .height(1.88)
                .build();
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);


    }
}
