public class ArrayToBST {
    static class Node{
        int data;
        Node right;
        Node left;

        Node(int data){
           this.data=data;
        }
   }
   public static Node insert(Node root, int val){
       if(root==null){
           root=new Node(val);
           return root;
       }
       if(val<root.data){
           root.left=insert(root.left, val);
       }
       if(val>root.data){
           root.right=insert(root.right, val);
       }
       return root;
   }

   public static void display(Node root){
       if(root==null){
           return;
       }
       System.out.print(root.data+" ");
       display(root.left);
       
       display(root.right);
   }

   public static Node sortedArrayToBST(int[] nums){
    if(nums.length==0) return null;
    return constructTreeFromArray(nums, 0, nums.length-1);
   }

   public static Node constructTreeFromArray(int nums[], int left, int right){
    if(left>right){
        return null;
    }
    int midpoint=left+(right-left)/2;
    Node node=new Node(nums[midpoint]);
    node.left=constructTreeFromArray(nums, left,midpoint-1);
    node.right=constructTreeFromArray(nums,midpoint+1,right);
    return node;

   }
   public static void main(String[] args) {
       int values[]={10,20,30,40,50};
       Node root=null;
       for(int i=0; i<values.length;i++){
           root=sortedArrayToBST(values);
       }
       display(root);
       System.out.println();

   }
}

