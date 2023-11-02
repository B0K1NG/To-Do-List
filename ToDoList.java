import java.util.ArrayList;
import java.util.Scanner;
public class ToDoList{

    public static void main(String[]args){

        //Creating an arrayList for tasks

        ArrayList<String> DominykoToDo = new ArrayList<String>();

        System.out.println("8:00");

        //Adding tasks to the list
        DominykoToDo.add("Wake up");
        DominykoToDo.add("Eat breakfeast");
        DominykoToDo.add("Work in the tyre repair shop");
        DominykoToDo.add("Study Java");
        DominykoToDo.add("Eat lunch");
        DominykoToDo.add("Go back to the tyre repair Shop");
        DominykoToDo.add("Catch up with friends over discord");
        DominykoToDo.add("Play some games");
        
        //Checking my toDoList Size
        System.out.println("Size of todays list: " + DominykoToDo.size());
        
        //Deleting some toDo's that I have already done
        try{
            Thread.sleep(2000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(" ");
        System.out.println("12:15");
        DominykoToDo.remove(0);
        DominykoToDo.remove(1);
        DominykoToDo.remove(2);

        //Adding 0th to do to be Study JAVA
        DominykoToDo.set(0, "Study Java");
        System.out.println("What to do now?: " + DominykoToDo.get(0));

        //Checking how many to Do's untill I catch up with my friends
        try{
            Thread.sleep(3000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("\n14:00");
        int friends = DominykoToDo.indexOf("Catch up with friends over discord");
        System.out.println(friends + " Tasks");

        //Changing Catchup with friends to meet them at Vilnius and playing games to be playing games at LITEXPO
        try{
            Thread.sleep(4000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(" ");
        System.out.println("17:00");
        DominykoToDo.remove(0);
        DominykoToDo.remove(1);
        DominykoToDo.remove(2);
        DominykoToDo.set(0, "Meet with friends at Vilnius");
        DominykoToDo.set(1, "LITEXPO LAN to play CS:GO 2 ");
        System.out.println("What now?: " + DominykoToDo.get(0));
        System.out.println("Where to now?: " +DominykoToDo.get(1));
       
        //Checking if I did all the tasks for today
        try{
            Thread.sleep(1000);
        } 
        catch(InterruptedException e){
            e.printStackTrace();
        }
        Scanner day = new Scanner(System.in);
        System.out.println("\nWere all the tasks completed?: ");
        boolean complete = day.nextBoolean();

        if (complete==true){
            System.out.println("All tasks were completed!");
        }
        else{
            System.out.println("Not all tasks were completed.");
                }
        day.close();
    }
}