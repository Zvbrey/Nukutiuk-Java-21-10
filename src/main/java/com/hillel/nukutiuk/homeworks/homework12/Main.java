package com.hillel.nukutiuk.homeworks.homework12;

public class Main {
    public static void main(String[] args) {
        String firstPerson = Person.personInfo("Eren", "Eger", "Sigansina", "0930909374");
        String secondPerson = Person.personInfo("Mikasa", "Akerman",
                "Sigansina", "0930907263");
        String thirdPerson = Person.personInfo("Armin", "Arlert", "Sigansina", "0930903463");

        System.out.println(Person.personInfo("Braun", "Rainer", "Rebelio", "0930863743"));
        System.out.println(Person.personInfo("Joe", "Hanjy", "Roza", "0939862359"));
        System.out.println(Person.personInfo("Zig", "Eger", "Rebelio", "09397360258"));
        System.out.println();
        System.out.println(firstPerson +"\n"+ secondPerson +"\n"+ thirdPerson);
        //Не зрозумів що сама мається на увазі під  "Повинен вийти висновок такого типу" тому зробив два варіанта
    }

}

