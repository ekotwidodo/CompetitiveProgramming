package inc2010;

import java.util.*;

public class FindingTheRightSong {

    static final long BASE = 1000L; // base > max nilai not lagu
    static final long MOD = 1_000_000_007L; // prime besar biar aman
    static final int LEN = 10; // panjang subsekuens target

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short N = sc.nextShort();
        short Q = sc.nextShort();

        for (short i = 0; i < N; i++) {
            short M = sc.nextShort();
            short[] song = new short[M];
            for (short j = 0; j < M; j++) {
                song[j] = sc.nextShort();
            }

            if (M >= 10) {
                for (short start = 0; start <= M - 10; start++) {
                    StringBuilder songBuilder = new StringBuilder();
                    short commaCount = 0;
                    for (short k = 0; k < 10; k++) {
                        songBuilder.append(song[start + k]).append(",");
                        commaCount++;
                    }

                    if (commaCount == 10) {
                        String key = songBuilder.toString();
                        songs.put(key, new short[]{(short) (i + 1), (short) (start + 1)});
                    }
                }
            }
        }

        for (short q = 0; q < Q; q++){
            StringBuilder queryBuilder = new StringBuilder();
            int commaCount = 0;
            for (short i = 0; i < 10; i++){
                queryBuilder.append(sc.nextShort()).append(",");
                commaCount++;
            }

            String key = queryBuilder.toString();
            if (commaCount == 10 && songs.containsKey(key)) {
                short[] pos = songs.get(key);
                System.out.println(pos[0] + " " + pos[1]);
            } else {
                System.out.println("not found");
            }
        }
        sc.close();
    }
}
