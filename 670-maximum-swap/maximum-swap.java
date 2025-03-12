import java.util.Arrays;

class Solution {
    public int maximumSwap(int n) {
        int c = (int) (Math.log10(n) + 1);
        int a[] = new int[c];
        int b[] = new int[c];
        int sta = a.length - 1;

        while (n > 0) {
            a[sta] = n % 10;
            b[sta] = n % 10;
            n = n / 10;
            sta--;
        }

        Arrays.sort(b);
        for (int i = 0; i < b.length / 2; i++) {
            int temp = b[i];
            b[i] = b[b.length - 1 - i];
            b[b.length - 1 - i] = temp;
        }

        int sta4 = 0;
        int temp1 = 0;
        int temp2 = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                sta4 = i;
                temp1 = a[i];
                temp2 = b[i];
                a[i] = b[i];
                break;
            }
        }

        for (int i = a.length-1; i >=sta4; i--) {
            if (a[i] == temp2) {
                a[i] = temp1;
                break;
            }
        }
        int sum = 0;
        for (int p : a) {
            sum = sum * 10 + p;
        }
        return sum;
    }
}