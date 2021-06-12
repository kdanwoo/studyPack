package testdome;

public class Platformer {
    public int[] arr;
    public boolean[] visit;
    public int position;
    public static final int LIMIT = 2;


    public Platformer(int n, int position) {
        this.arr = new int[n];
        this.visit = new boolean[n];
        this.position = position;
//        this.visit[position] = true;
    }

    public void jumpLeft() {
        int from = position();
        this.visit[from] = true;
        int jumpCount = 0;
        int next = from;
        while (jumpCount < LIMIT) {
            next = findNextLeft(next);
            if (next > 0 && !visit[next]) {
                jumpCount++;
                this.position = next;


            }
        }
    }

    public void jumpRight() {
        int from = position();
        this.visit[from] = true;
        int jumpCount = 0;
        int next = from;
        while (jumpCount < LIMIT) {
            next = findNextRight(next);

            if (next < this.arr.length && !visit[next]) {
                jumpCount++;
                this.position = next;
            }
        }
    }

    public int findNextRight(int from) {
        int nextPos = from;
        for (int i = from+1; i < arr.length; i++) {
            if (visit[i]) {
                continue;
            } else {
                nextPos = i;
                break;
            }
        }

        return nextPos;
    }

    public int findNextLeft(int from) {
        int nextPos = from;
        for (int i = from-1; i>=0; i--) {
            if (visit[i]) {
                continue;
            } else {
                nextPos = i;
                break;
            }
        }

        return nextPos;
    }


    public int position() {
        return this.position;
    }

    public static void main(String[] args) {
        Platformer platformer = new Platformer(6, 3);
        System.out.println(platformer.position()); // should print 3

        platformer.jumpLeft();
        System.out.println(platformer.position()); // should print 1

        platformer.jumpRight();
        System.out.println(platformer.position()); // should print 4
    }
}
