package _09;
import org.git.loganag._09.Solution;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SolutionTest {
    @Test
    void isPalindrome() {
        assertThat(new Solution().isPalindrome(121), equalTo(true));
    }

    @Test
    void isPalindrome2() {
        assertThat(new Solution().isPalindrome(-121), equalTo(false));
    }

    @Test
    void isPalindrome3() {
        assertThat(new Solution().isPalindrome(10), equalTo(false));
    }
}
