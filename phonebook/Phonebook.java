package phonebook;

import java.util.ArrayList;
import java.util.logging.*;


public class Phonebook implements AddPersons  {
    public ArrayList<Persona> pb;

    public Phonebook (){
        this.pb = new ArrayList<>();
        LoggerClass.logger.log(Level.INFO, "Создана новая телефонная книга");
    }

    public void showAddressBook(){
        for(Persona i : pb){
            System.out.println(i.getName() + " " + i.getPhone() + " " + i.getCity());
        }
        LoggerClass.logger.log(Level.INFO, "Телефонная книга печатается в консоли");
    }

    @Override
    public void AddPersons(){
        pb.add(new phonebook.Persona("Симакова Елена Михайловна", "8905-456-12-34", "Пермь"));
        pb.add(new phonebook.Persona("Борисов Игорь Львович", "8955-557-45-88", "Нижний Тагил"));
        pb.add(new phonebook.Persona("Шемякина Ольга Борисовна", "8999-445-75-41", "Екатеринбург"));
        LoggerClass.logger.log(Level.INFO, "В телефонную книгу добавлены новые лица");
    }

    @Override
    public void AddPerson() {

    }
}
