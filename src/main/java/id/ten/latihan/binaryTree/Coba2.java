package id.ten.latihan.binaryTree;

import id.ten.latihan.linkedList.CobaSingleLinkedList;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Coba2 {

    TreeNode root;

    public boolean isEmpty() {
        return (root==null);
    }

    // insert
    public void insert(int data) {
        TreeNode newNode = new TreeNode(data);

        if(isEmpty()) {
            root = newNode;
        }else{
            TreeNode current = root;
            TreeNode parent = null;
            boolean isLeft = false;

            while(current != null) {
                parent = current;

                if(data < current.data) {
                    current = current.left;
                    isLeft = true;
                }else if(data > current.data) {
                    current = current.right;
                    isLeft = false;
                }else{
                    System.out.println("Data yang disimpan sudah ada");
                    break;
                }
            }

            if(isLeft) {
                parent.left = newNode;
            }else{
                parent.right = newNode;
            }

        }

    }

    public void preOrder() {
        preOrder(root);
    }

    public void inOrder() {
        inOrder(root);
    }

    public void postOrder() {
        postOrder(root);
    }


    public void preOrder(TreeNode root) {
        if(root != null) {
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public void inOrder(TreeNode root) {
        if(root != null) {
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    }

    public void postOrder(TreeNode root) {
        if(root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
    }

    public static void main(String[] args) {
        Coba2 test = new Coba2();

        test.insert(5);
        test.insert(10);
        test.insert(1);
        test.insert(100);
        test.insert(88);
        test.insert(3);

        System.out.print("Traversal dengan preorder :");
        test.preOrder();

        System.out.print("\n Traversal dengan inOrder :");
        test.inOrder();

        System.out.print("\n Traversal dengan postOrder :");
        test.postOrder();
    }
}
