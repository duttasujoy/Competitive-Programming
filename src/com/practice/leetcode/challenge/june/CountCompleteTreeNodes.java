package com.practice.leetcode.challenge.june;

import java.util.concurrent.atomic.AtomicInteger;

public class CountCompleteTreeNodes {
    public int countNodes(TreeNode root) {
        AtomicInteger count = new AtomicInteger(0);
        count(root,count);
        return count.get();
    }
    public void count(TreeNode root,AtomicInteger count) {
        if(root == null){
            return;
        }
        count.getAndIncrement();
        count(root.left,count);
        count(root.right,count);
    }
}