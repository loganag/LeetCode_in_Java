package _66;

import org.git.loganag._66.Solution;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SolutionTest {
    @Test
    public void plusOne() { assertThat(new Solution().plusOne(new int[]{1, 2, 3}), equalTo(new int[]{1, 2, 4})); }

    @Test
    void plusOne2() {
        assertThat(new Solution().plusOne(new int[]{4, 3, 2, 1}), equalTo(new int[]{4, 3, 2, 2}));
    }

    @Test
    void plusOne3() {
        assertThat(new Solution().plusOne(new int[]{0}), equalTo(new int[]{1}));
    }

    @Test
    void plusOne4() {
        assertThat(new Solution().plusOne(new int[]{9}), equalTo(new int[]{1, 0}));
    }
}