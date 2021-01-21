package id.ten.latihan.binaryTree;

class TreeNode1 {
    int data;
    TreeNode1 left;
    TreeNode1 right;

    public TreeNode1(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class BinarySearchTree {

    TreeNode1 root;

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(5);
    }

    private void insert(int i) {

        TreeNode1 newNode = new TreeNode1(i);


        if(root == null) {
            root = newNode;
        }else {
            TreeNode1 current = root;
            TreeNode1 parent =  null;
            boolean isLeft = false;

            while (current != null) {
                if(i < current.data) {
                    current = current.left;
                    isLeft = true;
                }else if(i > current.data) {
                    current = current.right;
                    isLeft = false;
                }else{
                    System.out.println("Data sudah tersimpan");
                }
            }

            if(isLeft) {
                current.left = newNode;
            }else{
                current.right = newNode;
            }
        }
    }

}
