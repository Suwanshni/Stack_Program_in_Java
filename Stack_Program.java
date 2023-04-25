import java.util.Scanner;

public class Stack_Program{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int size = sc.nextInt();
        int turn;
        int[] arr = new int[size];

        stack_value st = new stack_value();
        do{
        System.out.println("Enter your choice:\n 1 for push\n 2 for pop\n 3 for displaying\n 4 to peek");
        int choice = sc.nextInt();
        switch(choice){
            case 1 :
            st.push(size,arr);
            break;
            case 2 :
            st.pop();
            break;
            case 3 :
            st.display(arr);
            break;
            case 4 :
            st.peek(arr);
            break;
            default : System.out.println("Please enter the correct number");
        }
        System.out.println("To continue press 1 : ");
        turn = sc.nextInt();
    }while(turn==1);
    System.out.println("Exit");
}
}
class stack_value{
    int top = -1;
    void push(int size, int arr[]){
        if (top==size-1){
            System.out.println("Sorry the stack is overflow");
        }
        else{
            System.out.print("Enter the elements : ");
            Scanner scc = new Scanner(System.in);
                arr [top+1] = scc.nextInt(); 
                top++; 
        }
         
    }
    void pop(){
        if (top==-1){
            System.out.println("The stack is empty. So no element to pop");
        }
        else{
            top= top-1;
            System.out.println("The element is popped");
        }
    }
    void display(int arr[]){
        if (top==-1){
            System.out.println("The stack is empty.");
        }
        else{
            for(int i=0;i<top+1;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
    void peek(int arr[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the index value to peek : ");
        int value = scan.nextInt();
        if(value<=top){
            System.out.println("The value at index "+value+" is "+arr[value]);
        }
        else{
            System.out.println("The value at this index is not available");
        }
    }

}