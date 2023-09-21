package _344;

import org.git.loganag._344.Solution;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SolutionTest {
    @Test
    void reverseString() {
        char[] input = new char[]{'h', 'e', 'l', 'l', 'o'};
        char[] output = new char[]{'o', 'l', 'l', 'e', 'h'};
        new Solution().reverseString(input);
        assertThat(input, equalTo(output));
    }

    @Test
    void reverseString2() {
        char[] input = new char[]{'H', 'a', 'n', 'n', 'a', 'h'};
        char[] output = new char[]{'h', 'a', 'n', 'n', 'a', 'H'};
        new Solution().reverseString(input);
        assertThat(input, equalTo(output));
    }
}
