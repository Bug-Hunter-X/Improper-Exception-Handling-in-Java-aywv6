# Improper Exception Handling in Java

This repository demonstrates an uncommon bug in Java: improper exception handling. The `UncommonBug.java` file contains code that attempts to divide by zero.  The ArithmeticException is caught, but the program continues execution without addressing the problem. This can lead to unexpected behavior or incorrect results.

The solution, provided in `UncommonBugSolution.java`, addresses this issue by properly handling the exception, preventing unexpected program behavior.

## How to Run

1. Clone this repository.
2. Compile and run `UncommonBug.java`.
3. Observe the output and note the unexpected behavior.
4. Compile and run `UncommonBugSolution.java`.
5. Compare the output to see the corrected behavior.