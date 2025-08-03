## Playing With Boxes

- Time limit	3 s
- Memory limit	64 MB

### Description

You may be don't know about this, but Ceemot does like to play with boxes during her free time. She has N different boxes in one pile. First, she splits them into two piles (not necessary the same size), then she picks one of the piles with at least two boxes and splits it into two again. She repeats this until each pile has only one box.

As a computer scientist, she wonders the number of different ways in which she can do this.

For example, if she begins with a pile of 3 boxes (A, B and C) then there are three ways to do her weird hobby:
- Split ABC into A and BC, split BC into B and C.
- Split ABC into B and AC, split AC into A and C.
- Split ABC into C and AB, split AB into A and B.

If she begins with a pile of 4 boxes (A, B, C and D) then there are eighteen ways to do this:
- Split ABCD into AB and CD, split AB into A and B, split CD into C and D.
- Split ABCD into AB and CD, split CD into C and D, split AB into A and B.
- Split ABCD into AC and BD, split AC into A and C, split BD into B and D.
- ...
- Split ABCD into A and BCD, split BCD into B and CD, split CD into C and D.
- Split ABCD into A and BCD, split BCD into C and BD, split BD into B and D.
- Split ABCD into A and BCD, split BCD into D and BC, split BC into B and C.
- ...

Help her to count the number of different ways in which she can carry out this splitting procedure. As the number may be very big, modulo the output with 1,000,000,007.

### Input Format

The first line of input contains an integer T (1 ≤ T ≤ 1,000) the number of cases. Each case begins with an integer N (2 ≤ N ≤ 100,000) the number of different boxes Ceemot has in one pile originally.

### Output Format

For each test case, output in a line the number of different ways in which she can carry out her splitting procedure. Modulo this number with 1,000,000,007.

### Sample Input

```
3
3
4
7
```

### Sample Output

```
3
18
56700
```

### Resources

[https://tlx.toki.id/problems/inc-2010/E](https://tlx.toki.id/problems/inc-2010/E)