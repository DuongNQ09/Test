import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void testProcessNumbersOdd() {
        int[] numbers = {1, 3, 5};
        Main.processNumbers(numbers);
        // Không có cách trực tiếp để kiểm tra việc in ra, nhưng bạn có thể sử dụng các kỹ thuật khác để kiểm tra.
    }

    @Test
    public void testProcessNumbersEven() {
        int[] numbers = {2, 4};
        Main.processNumbers(numbers);
        // Không có cách trực tiếp để kiểm tra việc in ra, nhưng bạn có thể sử dụng các kỹ thuật khác để kiểm tra.
    }

    @Test
    public void testProcessNumbersMixed() {
        int[] numbers = {1, 2, 3, 4, 5};
        Main.processNumbers(numbers);
        // Không có cách trực tiếp để kiểm tra việc in ra, nhưng bạn có thể sử dụng các kỹ thuật khác để kiểm tra.
    }
}
