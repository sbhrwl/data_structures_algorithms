import java.util.ArrayList;
import java.util.List;

public class Palindrome {
    // Assignment: How can we reduce this further to space complexity as O(1)

    // Time complexity: O(n)
    // Space complexity: O(n)

    public boolean isPalindrome(ListNode head) {
        List<Integer> vals = new ArrayList<>();

        // Convert the linkedlist into arraylist
        ListNode current = head;
        while (current != null) {
            vals.add(current.val);
            current = current.next;
        }

        // Two Pointer Approach used to check the palindrome
        int low = 0;
        int high = vals.size() - 1;
        while (low < high) {
            if (!vals.get(low).equals(vals.get(high))) {
                return false;
            }
            low = low + 1;
            high = high - 1;
        }
        return true;
    }
}
