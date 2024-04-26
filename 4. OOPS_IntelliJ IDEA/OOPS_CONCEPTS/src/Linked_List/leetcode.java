package Linked_List;

public class leetcode {
    public static class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        while(temp!=null) {
            System.out.print(temp.val + " ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next==null)
            return head;
        ListNode temp = head;
        ListNode newList = null;
        ListNode cn = null;
        while(temp!=null && temp.next!=null) {
            if(temp.val == temp.next.val) {
                int value = temp.val;
                while(temp!=null) {
                    temp = temp.next;
                    if(temp.val != value)
                        break;
                    if(temp.next == null)
                        return newList;
                }
            }
            else {
                ListNode nn = new ListNode(temp.val, null);
                if(newList == null) {
                    cn = newList = nn;
                }
                else {
                    cn.next = nn;
                    cn = cn.next;
                }
                temp = temp.next;
            }
        }
        if(temp!=null) {
            if(newList==null) {
                return temp;
            }
            cn.next = temp;
        }
        return newList;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(1);
        ListNode c = new ListNode(2);
        a.next = b;
        b.next = c;
        c.next = null;

//        ListNode a = new ListNode(1);
//        ListNode b = new ListNode(1);
//        ListNode c = new ListNode(1);
//        ListNode d = new ListNode(2);
//        ListNode e = new ListNode(3);
//        a.next = b;
//        b.next = c;
//        c.next = d;
//        d.next = e;
//        e.next = null;
        printList(deleteDuplicates(a));
    }
}
