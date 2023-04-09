import java.util.LinkedList;
 
public class Program{
      
    public static void main(String[] args) {
          
        LinkedList<String> states = new LinkedList<String>();
          
        // добавим в список ряд элементов

        states.add("Germany");
        states.add("France");
        states.addFirst("Great Britain"); // добавляем на последнее место
        states.addLast("Great Britain"); // добавляем на последнее место
        states.add("Spain"); // добавляем на первое место
        states.add("Italy"); // добавляем элемент по индексу 1
     
        
        for(String state : states){
            System.out.println(state);
        }
    }
}
class Person{
      
    private String name;
    public Person(String value){
          
        name=value;
    }
    String getName(){return name;}
}