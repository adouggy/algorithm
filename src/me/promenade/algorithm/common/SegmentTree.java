package me.promenade.algorithm.common;

public class SegmentTree {

    public class TreeNode {

        int start = 0;
        int end = 0;
        int sum = 0;

        TreeNode left = null;
        TreeNode right = null;

    }

    private TreeNode root = null;
    private int[] data = null;

    public SegmentTree(int[] data) {
        init(data);
    }

    public void init(int[] data) {
        if (data == null || data.length == 0) return;
        this.data = data;
        this.root = build(0, data.length - 1);
    }

    private TreeNode build(int start, int end) {
        TreeNode node = new TreeNode();
        node.start = start;
        node.end = end;

        if (start == end) {
            node.sum = data[start];
            return node;
        }

        int mid = start + (end - start) / 2;
        node.left = build(start, mid);
        node.right = build(mid + 1, end);

        node.sum = node.left.sum + node.right.sum;
        return node;
    }

    private void update(TreeNode node, int index, int num) {
        if (node == null) return;
        if (node.start == node.end) {
            if (node.start != index) {
                System.out.println("!!!");
            }
            node.sum = num;
            return;
        }
        int mid = node.start + (node.end - node.start) / 2;
        if (index <= mid) {
            update(node.left, index, num);
        } else {
            update(node.right, index, num);
        }
        node.sum = node.left.sum + node.right.sum;
    }

    public void update(int index, int sum) {
        update(root, index, sum);
    }

    private int getSum(TreeNode node, int start, int end) {
        if (start < node.start || end > node.end) {
            return -1;
        }

        if (start == node.start && end == node.end) {
            return node.sum;
        }

        int mid = node.start + (node.end - node.start) / 2;

        if (start > mid) {
            return getSum(node.right, start, end);
        }
        if (end <= mid) {
            return getSum(node.left, start, end);
        }
        
        return getSum(node.left, start, mid) + getSum(node.right, mid+1, end);
    }

    public int getSum(int start, int end) {
        return getSum(root, start, end);
    }

    private void print(TreeNode node) {
        if (node == null) return;
        System.out.println("[" + node.start + "," + node.end + "->" + node.sum + "]");
        print(node.left);
        print(node.right);
    }

    public void print() {
        print(root);
    }

    public static void main(String args[]) {
        int[] d = { 0, 9, 5, 7, 3 };
        SegmentTree tree = new SegmentTree(d);
        tree.print();

        System.out.println(tree.getSum(2, 4));

    }
}
