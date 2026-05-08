## Disconnected Graph

- Time limit	10 s
- Memory limit	64 MB

### Description

Diberikan sebuah graf terhubung yang tidak berarah dengan N node dan E edge. Terdapat Q node yang dipilih dari N node, yang mana node tersebut dikatakan "khusus". Misalkan terdapat R edge yang dihilangkan, tugas Anda adalah menentukan banyaknya pasangan node A-B yang mana A dan B merupakan node khusus dan keduanya tidak lagi terhubung (tidak ada serangkaian edge yang menghubungkan A dan B setelah R edge dihilangkan).

### Input Format

Baris pertama berisi sebuah bilangan bulat T (1 ≤ T ≤ 50) yang menyatakan banyaknya kasus uji.

Setiap kasus uji dimulai dengan empat bilangan bulat: N, E, Q and R (1 ≤ Q ≤ N ≤ 50.000; 0 ≤ R ≤ E ≤ 200.000) yang menyatakan banyaknya node, banyaknya edge, banyaknya node khusus, dan banyaknya edge yang akan dihilangkan.

Setiap node dinomori dari 1 sampai dengan N.

E baris berikutnya berisi dua bilangan bulat Ai and Bi (1 ≤ Ai, Bi ≤ N) yang menyatakan terdapat edge yang menghubungkan Ai and Bi.

Baris berikutnya berisi Q bilangan bulat Pi (1 ≤ Pi ≤ N) yang menyatakan nomor untuk node-node khusus.

Baris berikutnya berisi R bilangan bulat Ti (1 ≤ Ti ≤ E) yang menyatakan nomor untuk edge yang akan dihilangkan (edge dinomori dari 1 sampai dengan E berdasarkan urutan masukan).

### Output Format

Untuk setiap kasus uji, keluarkan sebuah baris berisi bilangan yang menyatakan banyaknya pasangan node khusus yang tidak lagi terhubung setelah R edge dihilangkan.

### Sample Input

```
2
4 4 4 3
1 2
1 4
2 4
3 4
1 2 3 4
1 2 3
2 1 1 1
1 2
2
1
```

### Sample Output

```
5
0
```

### Explanation

_Penjelasan untuk contoh masukan pertama_

Terdapat 5 pasang node khusus yang tidak lagi terhubung: 1-2, 1-3, 1-4, 2-3 and 2-4.

_Penjelasan untuk contoh masukan kedua_

Hanya terdapat sebuah node khusus, sehingga tidak mungkin dibuat pasangan node khusus.

### Resources

[https://tlx.toki.id/problems/inc-2010/H](https://tlx.toki.id/problems/inc-2010/H)
