## Stack Machine Simulator

- Time limit	2 s
- Memory limit	64 MB

### Description

A stack machine has two type of operations:
- Push an element into stack. This operation is denoted by a command string "+?" where ? is any alphabet 'a'-'z' or 'A'-'Z', it means append a character ? into stack.
- Reverse all element in stack. This operation is denoted by a command string "^". It will reverse all elements in stack, do nothing if the stack is empty.

For example, command string "+a+b+c+d^" means: push a, push b, push c, push d and reverse. After "+a+b+c+d^" executed, the stack contains "dcba". Write a program which take the command string as the input and output the stack's content after the command is executed.

### Input Format

The first line of input contains an integer T (1 ≤ T ≤ 1,000) the number of cases. Each case contains a string S denoting the command string as described above. S will be between 1 and 100 characters long.

### Output Format

For each test case, output in a line the content of the stack after the command is executed.

### Sample Input

```
2
+a+b
+A+B^+c^
```

### Sample Output

```
ab
cAB
```

### Resources

[https://tlx.toki.id/problems/inc-2010/C](https://tlx.toki.id/problems/inc-2010/C)