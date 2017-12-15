/**
 * Created by sunke on 2017/12/15.
 */


import java.math.BigInteger;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

 You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 Example

 Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 Output: 7 -> 0 -> 8
 Explanation: 342 + 465 = 807.
 */
public class _2_AddTwoNumbers {
    public static void main(String[] args) {
        int[] arr1 = {8,2,8,5,1,3,2,3,1,1};
        int[] arr2 = {1,0,9,4,2,6,2,7,1,1};
        ListNode l1 = trans(arr1);
        ListNode l2 = trans(arr2);
        ListNode l3  = addTwoNumbers(l1,l2);
        System.out.println(l3);
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode((l1.val+l2.val)%10);
        ListNode v = head;
        int add = (l1.val+l2.val)/10;
        l1 = l1.next;
        l2 = l2.next;
        while(l1!=null||l2!=null){
            int val1 = l1==null?0:l1.val;
            int val2 = l2==null?0:l2.val;
            ListNode x  = new ListNode((val1+val2+add)%10);
            add = (val1+val2+add)/10;
            v.next = x;
            v = x;
            if(l1!=null){
                l1 = l1.next;
            }
            if(l2!=null){
                l2 = l2.next;
            }
        }
        if(add>0){
            ListNode x  = new ListNode(add%10);
            v.next = x;
        }
        return  head;
    }

    public static ListNode revert(ListNode l){
        ListNode head = new ListNode(l.val);
        l = l.next;
        while(l!=null){
            ListNode newHead= new ListNode(l.val);
            newHead.next = head;
            l = l.next;
            head = newHead ;
        }
        return  head;
    }
    static ListNode trans(int[] arr){
        ListNode head = new ListNode(arr[0]);
        ListNode a  = head;
        for(int i=1; i<arr.length;i++){
            a.next =new ListNode(arr[i]);
            a = a.next;
        }
        return head;
    }
    static public class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
   }

}
