public class AVLTREE{
    static class Node{
        int data;
        int height;
        Node left,right;

        Node(int data){
            this.data=data;
            height=1;
            left=right=null;
        }
    }

    //getheight funtioin
    static int getheight(Node root){
        if(root==null) return 0;

        return root.height;
    }


    //getbalance
    static int getbalance(Node root){
        return getheight(root.left)-getheight(root.right);
    }

    //rightRotation function
    static Node rightRotation(Node root){

        Node child=root.left;
        Node childRight=child.right;

        child.right=root;
        root.left=childRight;

        //Update the height
        root.height=1+Math.max(getheight(root.left),getheight(root.right));
        child.height=1+Math.max(getheight(child.left),getheight(child.right));
        return child;
    }


    //lefttRotation function
    static Node leftRotation(Node root){
        Node child=root.right;
        Node childLeft=child.left;

        child.left=root;
        root.right=childLeft;
        
        //Update the height;
        root.height=1+Math.max(getheight(root.left),getheight(root.right));
        child.height=1+Math.max(getheight(child.left),getheight(child.right));
        return child;
    }


    //insert function
    static Node insert(Node root,int key){
        //Doesn't exist
        if(root==null){
            root=new Node(key);
            return root;
        }

        //Exist hai
        if(key<root.data){  //left side me insert kra do
            root.left=insert(root.left, key);
        }
        else if(key>root.data){  //right side me insert kra do
            root.right=insert(root.right, key);
        }
        else{
            return root; //Duplicate element are not allowed.
        }


        //update height;
        root.height=1+Math.max(getheight(root.left),getheight(root.right));

        //Balancing check
        int balance=getbalance(root);

        //left left case unbalance
        if(balance > 1 && key <root.left.data){
            return rightRotation(root);  //top
        }

        //right right case unbalance
        else if(balance < -1 && root.right.data < key){
            return leftRotation(root); //top
        }

        //left right case unbalance
        else if(balance > 1 && key > root.left.data){
            root.left=leftRotation(root.left);//middle 
            return rightRotation(root); //top
        }

        //right left case unbalance
        else if(balance < -1 && root.right.data > key){
            root.right=rightRotation(root.right);  //middle
            return leftRotation(root);   //top
        }

        //No unbalance
        else{
            return root;
        }
    }


    //preoder fun
    static void preorder(Node root){
        if(root==null) return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    //inoder fun
    static void inoder(Node root){
        if(root==null) return;

        inoder(root.left);
        System.out.print(root.data+" ");
        inoder(root.right);
    }

    public static void main(String args[]){
        //Duplicate element not present

        Node root=null;
        root=insert(root,10);
        root=insert(root,20);
        root=insert(root,30);
        root=insert(root,50);
        root=insert(root,70);
        root=insert(root,5);
        root=insert(root,100);
        root=insert(root,95);

        System.out.println("preorder funtion");
        preorder(root);

        System.out.println();
        System.out.println("inoder funtion");
        inoder(root);
    }
    
}





/* 
//Deletion of avl tree TC=O(logN);

class Sol
{
    
    
    //getheight funtioin
    static int getheight(Node root){
        if(root==null) return 0;

        return root.height;
    }


    //getbalance
    static int getbalance(Node root){
        return getheight(root.left)-getheight(root.right);
    }

    //rightRotation function
    static Node rightRotation(Node root){

        Node child=root.left;
        Node childRight=child.right;

        child.right=root;
        root.left=childRight;

        //Update the height
        root.height=1+Math.max(getheight(root.left),getheight(root.right));
        child.height=1+Math.max(getheight(child.left),getheight(child.right));
        return child;
    }


    //lefttRotation function
    static Node leftRotation(Node root){
        Node child=root.right;
        Node childLeft=child.left;

        child.left=root;
        root.right=childLeft;
        
        //Update the height;
        root.height=1+Math.max(getheight(root.left),getheight(root.right));
        child.height=1+Math.max(getheight(child.left),getheight(child.right));
        return child;
    }
    
    
    
    public static Node deleteNode(Node root, int key)
    {
        if(root==null) return null;
        
        if(key < root.data){ //left side
            root.left=deleteNode(root.left,key);
        }
        else if(key > root.data){ //right side
            root.right=deleteNode(root.right,key);
        }
        else{
            //leaf node;
            if(root.left==null && root.right==null){
                return null;
            }
            
            //only one child  exist
            else if(root.left==null){
                return root.right;
            }
            
            else if(root.right==null){
                return root.left;
            }
            
            //both child exist
            else{
                //right side smallest element
                Node curr=root.right;
                while(curr.left!=null){
                    curr=curr.left;
                }
                root.data=curr.data;
                root.right=deleteNode(root.right,curr.data);
                
            }
        }
        
        
        //update the height
        root.height=1+Math.max(getheight(root.left),getheight(root.right));
        
        //check the balance
        int balance=getbalance(root);
        
        //left side
        if(balance > 1){
            //LL
            if(getbalance(root.left)>=0){
                return rightRotation(root);
            }
            //LR
            else{
                root.left=leftRotation(root.left);
                return rightRotation(root);
            }
        }
        //right side
        else if(balance < -1){
            //RR
            if(getbalance(root.right)<=0){
                return leftRotation(root);
            }
            //RL
            else{
                root.right=rightRotation(root.right);
                return leftRotation(root);
            }
        }
        else{
            return root;
        }
        
        
        
    }
}
*/