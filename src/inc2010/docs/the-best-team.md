## The Best Team

- Time limit	2 s
- Memory limit	64 MB

### Description

ACM-ICPC 2010 is drawing near and your university want to select three out of N students to form the best team. The university however, has a limited budget, so they can only afford to send one team. The coach wants his best team to be the best in term of compatibility. The compatibility of a team which member is student A, B and C is calculated by PA,B * PA,C * PB,C, where Pi,j is the compatibility of student i and student j.

Given Pi,j for all pair of students, calculate the highest compatibility value that can be achieved by any team of three students.

### Input Format

The first line of input contains an integer T (1 ≤ T ≤ 100) the number of cases. Each case begins with an integer N (3 ≤ N ≤ 50) the number of students. The next N lines each contains N integers Pi,j (0 ≤ Pi,j ≤ 100). The ith line and jth integer denotes the compatibility of student i with student j. You may assume Pi,j = Pj,i and Pi,i = 0.

### Output Format

For each test case, output in a line the highest compatibility value that can be achieved by any team of three students.

### Sample Input

```
2
3
0 2 5
2 0 8
5 8 0
4
0 3 5 4
3 0 2 6
5 2 0 8
4 6 8 0
```

### Sample Output

```
80
160
```

### Explanation

_Explanation for the 1st sample input._

There are only three students so the coach has no choice but to select them.

_Explanation for the 2nd sample input._

The best combination would be choosing student 1, 3 and 4.

### Resources

[https://tlx.toki.id/problems/inc-2010/A](https://tlx.toki.id/problems/inc-2010/A)
