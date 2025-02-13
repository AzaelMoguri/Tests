import java.util.ArrayList;
import java.util.List;

public class Todolist {
    private List<Todo> myList;

    public Todolist(){
        myList = new ArrayList<>();
    }
    public static void main(String[] args) {
        Todolist demo = new Todolist();
        Todo myFirst = new Todo();



        myFirst.desc = "Practice OOP";
        myFirst.check = false;
        demo.addTodo(myFirst);
        demo.viewTodos();
    }


    
    public void addTodo(Todo myTodo){
        myList.add(myTodo);
    }
    public void viewTodos(){
        for(Todo todo : myList){
            System.out.println(todo);
        }
    }

 }
class Todo{
    String desc;
    boolean check;

    @Override
    public String toString() {
        return "desc:" + desc + " check:" + check;
    }
    
}
