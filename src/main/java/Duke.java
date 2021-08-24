import java.util.Scanner;
import java.util.Arrays;
public class Duke {


    public static void main(String[] args) {

        String user_input;
        Scanner in = new Scanner(System.in);
        Task[] t = new Task[100];

        int list_index = 0;
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println("Hello from\n" + logo);

        user_input = in.nextLine();

        while (!(user_input.contentEquals("bye"))) {
            if(user_input.contentEquals("list")){
                System.out.println("List so far: ");
                for(int i = 0; i < list_index; i++) {
                    System.out.println( (i+1) + "[" + t[i].getStatus() + "]" + t[i].name);
                }
                user_input = in.nextLine();
            }
            else {
                if(user_input.contains("done")){
                    int task_index = Integer.parseInt(String.valueOf(user_input.charAt(0)));
                    t[task_index - 1].task_done();
                    System.out.println("List so far: ");
                    for(int i = 0; i < list_index; i++) {
                        System.out.println(i + "[" + t[i].getStatus() + "]" + t[i].name);
                    }
                    user_input = in.nextLine();
                }
                else {
                    System.out.println("added: " + user_input);
                    t[list_index] = new Task(user_input);
                    list_index++;
                    user_input = in.nextLine();
                }
            }
        }

        System.out.println("byee");
    }
}
