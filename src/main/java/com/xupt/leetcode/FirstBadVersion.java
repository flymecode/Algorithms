package com.xupt.leetcode;

/**
 * @author maxu
 * @date 2019/4/29
 */
public class FirstBadVersion {

    public static void main(String[] args) {
    }
    public int firstBadVersion(int n) {
        return firstBadVersion(0, n);
    }

    public boolean isBadVersion(int n) {
        return false;
    }


    private int firstBadVersion(int i, int n) {
        int mid = (i + n) / 2;
        if (isBadVersion(mid) == true && isBadVersion(mid - 1) == false) {
            return mid;
        } else if (isBadVersion(mid) == true && isBadVersion(mid - 1) == true) {
            firstBadVersion(i, mid - 1);
        } else if (isBadVersion(mid) == false && isBadVersion(mid + 1) == true) {
            return mid + 1;
        } else if (isBadVersion(mid) == false && isBadVersion(mid + 1) == false) {
            firstBadVersion(mid + 1, n);
        }
        return 0;
    }
}
