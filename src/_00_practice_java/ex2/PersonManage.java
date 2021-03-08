package _00_practice_java.ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonManage {
    List<Person> personList=new ArrayList<>();

    public PersonManage(List<Person> personList) {
        this.personList = personList;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }
    public void deletePerson(Person person ) throws Exception {
        int index= personList.indexOf(person);
        if(index==-1){
            throw new Exception(" There no this object in list");
        }else {
            personList.remove(index);
        }
    }
}
