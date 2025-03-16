class SimpleVM:
    def __init__(self):
        self.stack = []  # Stack to store values

    def execute(self, instructions):
        for instr in instructions:
            parts = instr.split()
            if parts[0] == "PUSH":
                self.stack.append(int(parts[1]))  # Push a number onto the stack
            elif parts[0] == "ADD":
                self.stack.append(self.stack.pop() + self.stack.pop())  # Pop two values, add them, and push the result
            elif parts[0] == "PRINT":
                print(self.stack[-1])  # Print the top value of the stack
            else:
                print(f"Invalid instruction: {instr}")  # Handle unknown instructions

if __name__ == "__main__":
    vm = SimpleVM()
    program = [
        "PUSH 5",  # Push 5 onto the stack
        "PUSH 3",  # Push 3 onto the stack
        "ADD",      # Add top two values (5 + 3)
        "PRINT"     # Print the result (8)
    ]
    vm.execute(program)
