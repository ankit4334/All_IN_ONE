/* 
01.Level order traversa


//User function Template for Java

/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node root) 
    {
        ArrayList <Integer> a=new ArrayList<>();
        
        
        if(root==null){
            return a;
        }
        
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        
        
    
        while(!q.isEmpty()) {
            Node temp = q.poll();
            a.add(temp.data);
            
        if(temp.left!=null) {
            q.add(temp.left);
        }
    
        if(temp.right!=null) {
            q.add(temp.right);
        }
            
        }
        
        return a;
        
    }
}



















//02.Reverse Level Order Traversal



class Tree
{
   
    public ArrayList<Integer> reverseLevelOrder(Node root) 
    {
        ArrayList <Integer> a=new ArrayList<>();
        
        
        if(root==null){
            return a;
        }
        
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        
        
    
        while(!q.isEmpty()) {
            Node temp = q.poll();
            a.add(temp.data);
        
        if(temp.right!=null) {
            q.add(temp.right);
        }
           
        if(temp.left!=null) {
            q.add(temp.left);
        }
    
    }
    
        Collections.reverse(a); 
        
        return a;
    }
}      










//3.Height of Binary Tree

//User function Template for Java

/* 
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
 */

class Solution {
    
    int height(Node node) 
    {
        if(node==null){
            return 0;
        }
        
        int l=height(node.left);
        int r=height(node.right);
        int ans=Math.max(l,r)+1;
        return ans;
        
    }
}





















//04.Diameter of a Binary Tree

class Solution {
    int ans= 0  ; 
    int height( Node root){
        if(root == null) return 0;
        
        int lh = height( root.left);
        int rh = height( root.right);
        
        ans =  Math.max ( ans , 1+lh+ rh);
        return 1+ Math.max(lh , rh);
    }
    
    int diameter(Node root) {
        int data   = height (root);
        return ans;
    }
}


*/