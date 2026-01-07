package LeetCode;

public class MIddleOfLInkedList_876 {

	// Middle of the Linked List
	public static ListNode middleNode(ListNode head) {
		ListNode middle = head;
		ListNode end = head;
		while (end != null && end.next != null) {
			middle = middle.next;
			end = end.next.next;
		}
		return middle;
	}

	public static void main(String[] args) {

		// 1. Manually build a linked list: 1 -> 2 -> 3 -> 4 -> 5
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		ListNode node = MIddleOfLInkedList_876.middleNode(head);
		System.out.println("Middle of the Linked List " + node.val);
	}

}

//Standard ListNode class definition
class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
