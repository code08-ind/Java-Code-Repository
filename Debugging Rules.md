# Debugging Rules & Options

## 1. Understand the Error
- Check the console for exception messages (e.g., `NullPointerException`, `ArrayIndexOutOfBounds`).
- Read the stack trace: it tells you *where* and *what* went wrong.

## 2. Use Print Statements
- Add `System.out.println("Debug: variable = " + value);`
- Helps trace the program flow and values at runtime.
- Example: before loop, inside loop, after loop.

## 3. Breakpoints (IDE Debugger)
- In editors like IntelliJ, Eclipse, VS Code:
  - Click next to the line number to add a breakpoint.
  - Run program in Debug mode.
  - **Step Over (F8)**, **Step Into (F7)**, **Step Out (Shift+F8)**.
- Inspect variable values in real-time.

## 4. Common Runtime Error Checks
- Division by zero → check denominator before dividing.
- Null references → ensure object is initialized before using.
- Array/Loop boundaries → ensure `index < array.length`.
- Infinite loops → verify exit condition.

## 5. Modularize Code
- Break large methods into smaller ones (like `printNumbers`).
- Easier to isolate and debug small sections.

## 6. Use Logging (Better than Print)
- For bigger projects, prefer `java.util.logging` or frameworks like **Log4j**.
- Allows log levels: `INFO`, `DEBUG`, `ERROR`.

## 7. Code Navigation in Editors
- IntelliJ / Eclipse:
  - `Ctrl + Click` → jump to method definition.
  - `Alt + Enter` → quick fixes.
- VS Code:
  - `F12` → go to definition.
  - `Ctrl+Shift+O` → search functions in file.

## 8. Test Edge Cases
- Try `printNumbers(0)`, `printNumbers(-1)`, `printNumbers(100)`.
- Check how your program behaves outside the *happy path*.
"""

with open("/mnt/data/Debugging_Rules.md", "w") as f:
    f.write(content)

"/mnt/data/Debugging_Rules.md"
