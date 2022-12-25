 class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
public class OddEvenLinkedList {

    public ListNode oddEvenList(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return head;
        if(head.next.next==null) return head;

        ListNode temp=head;
        ListNode end=head;
        int count=0;
        while(end!=null){
            end=end.next;
            count++;
        }

        if(count%2==0) count=count/2;
        else{
            count=(count/2)+1;
        }

        while(count>0){
            end.next=temp.next;
            temp.next=temp.next.next;
            end.next.next=null;
            temp=temp.next;
            end=end.next;

            count--;
        }

        return head;
        
    }

    public static void main(String[] args) {
        
    }
}
