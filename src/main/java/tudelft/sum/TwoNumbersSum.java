package tudelft.sum;

import java.util.ArrayList;
import java.util.Collections;

// Source: https://leetcode.com/problems/add-two-numbers/description/
class TwoNumbersSum {

    public ArrayList<Integer> addTwoNumbers(ArrayList<Integer> first, ArrayList<Integer> second) {
        ArrayList<Integer> revFirst = new ArrayList<>(first);
        ArrayList<Integer> revSecond = new ArrayList<>(second);

        Collections.reverse(revFirst);
        Collections.reverse(revSecond);

        int carry = 0;
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i < Math.max(revFirst.size(), revSecond.size()); i++){
            int val1 = i < revFirst.size() ? revFirst.get(i) : 0;
            int val2 = i < revSecond.size() ? revSecond.get(i) : 0;

            int sum = val1 + val2 + carry;
            carry = sum / 10;
            result.add(sum % 10);
        }

        if (carry > 0) {
            result.add(carry);
        }

        Collections.reverse(result);
        return result;
    }

}
