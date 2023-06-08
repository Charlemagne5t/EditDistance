import org.example.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void minDistanceTest1() {
        String word1 = "horse";
        String word2 = "ros";
        int output = 3;
        Assert.assertEquals(output, new Solution().minDistance(word1, word2));
    }

    @Test
    public void minDistanceTest2() {
        String word1 = "intention";
        String word2 = "execution";
        int output = 5;
        Assert.assertEquals(output, new Solution().minDistance(word1, word2));
    }
}
