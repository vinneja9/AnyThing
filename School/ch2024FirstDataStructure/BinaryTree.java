package School.ch2024FirstDataStructure;

import java.util.Stack;

class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int item) {
        data = item;
        left = right = null;
    }
}

public class BinaryTree {
    TreeNode root;

    void iterativeInOrder() {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root; // 현재 방문하는 노드를 가리킵니다.

        while (current != null || !stack.isEmpty()) {
            // 왼쪽 서브트리 순회
            while (current != null) {
                stack.push(current);
                current = current.left; // 왼쪽 자식으로 이동
            }

            // 노드 방문
            current = stack.pop(); // 스택에서 노드를 꺼냅니다.
            System.out.print(current.data + " ");

            // 오른쪽 서브트리 순회
            current = current.right; // 오른쪽 자식으로 이동
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        System.out.println("In-order traversal of binary tree is:");
        tree.iterativeInOrder();
    }
}