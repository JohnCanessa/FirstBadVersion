import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * 
 */
public class FirstBadVersion extends VersionControl {


    // **** auxiliary function ****
    static VersionControl vc = null;        


    /**
     * Implement a function to find the first bad version. 
     * You should minimize the number of calls to the API.
     * 
     * 22 / 22 test cases passed.
     * Status: Accepted
     * Runtime: 12 ms
     * Memory Usage: 36.1 MB
     * 
     * Execution: O(n log(n)) - Space: O(1)
     */
    static public int firstBadVersion(int n) {
        
        // // **** sanity check(s) ****
        // if (n <= 1)
        //     return 1;
        // else if (vc.isBadVersion(1))
        //     return 1;

        // **** initialization ****
        int l = 1;
        int r = n;

        // **** look for the first bad version ****
        while (l <= r) {

            // **** compute mid ****
            int m = l + (r - l) / 2;

            // ???? ????
            System.out.println("<<< m: " + m);

            // **** check if bad version found ****
            // if (!vc.isBadVersion(m - 1) && vc.isBadVersion(m)) return m;

            // **** determine which way to go ****
            if (vc.isBadVersion(m))
                r = m - 1;          // go left
            else 
                l = m + 1;          // go right

            // ???? ????
            System.out.println("<<< l: " + l + " r: " + r);
        }

        // **** first bad version ****
        return l;
    }


    /**
     * Test scaffold.
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        
        // **** open buffered reader ****
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // **** read n ****
        int n = Integer.parseInt(br.readLine().trim());

        // **** read bad ****
        int bad = Integer.parseInt(br.readLine().trim());

        // **** close buffered reader ****
        br.close();
        
        // ???? ?????
        System.out.println("main <<< n: " + n);
        System.out.println("main <<< bad: " + bad);

        // ???? set the bad version number ????
        vc = new VersionControl(bad);

        // **** call function of interest and display result ****
        System.out.println("main <<< output: " + firstBadVersion(n));
    }

}