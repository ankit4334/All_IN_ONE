//Question 1:-Is Binary Tree Heap

class Solution {
    public static int countNode(Node root){
        if(root==null){
            return 0;
        }
        return countNode(root.left)+countNode(root.right)+1;
    }
    
    public static boolean isCBT(Node root,int i,int c){
        if(root==null){
            return true;
        }
        if(i >=c){
            return false;
        }
        else{
            boolean left=isCBT(root.left,2*i+1,c);
            boolean right=isCBT(root.right,2*i+2,c);
            return (left && right);
        }
    }
    
    public static boolean isMaxOrder(Node root){
        //leaf node
        if(root.left==null && root.right==null){
            return true;
        }
        if(root.right==null){
            return (root.data > root.left.data);
        }
        else{
            boolean left=isMaxOrder(root.left);
            boolean right=isMaxOrder(root.right);
            return (left && right && 
            (root.data > root.left.data && root.data > root.right.data));
        }
    }
    
    boolean isHeap(Node root) {
        
        int index=0;
        int totalCount=countNode(root);
        
        if(isCBT(root,index,totalCount) && isMaxOrder(root)){
            return true;
        }
        return false;
        
    }
}