import java.util.Stack;

public class SimpleVM {
    private Stack<Integer> stack = new Stack<>(); // Stack to store values

    // Method to execute a set of instructions
    public void execute(String[] instructions) {
        for (String instr : instructions) {
            String[] parts = instr.split(" "); // Split instruction into parts
            switch (parts[0]) {
                case "PUSH":
                    // Push the given number onto the stack
                    stack.push(Integer.parseInt(parts[1]));
                    break;
                case "ADD":
                    // Pop the top two values from the stack, add them, and push the result
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "PRINT":
                    // Print the top value of the stack
                    System.out.println(stack.peek());
                    break;
                default:
                    // Handle invalid instructions
                    System.out.println("Invalid instruction: " + instr);
            }
        }
    }

    public static void main(String[] args) {
        // Create an instance of the SimpleVM
        SimpleVM vm = new SimpleVM();
        
        // Define a sequence of instructions
        String[] program = {
            "PUSH 5",  // Push 5 onto the stack
            "PUSH 3",  // Push 3 onto the stack
            "ADD",      // Add the top two values (5 + 3)
            "PRINT"     // Print the result (8)
        };
        
        // Execute the program
        vm.execute(program);
    }
}
