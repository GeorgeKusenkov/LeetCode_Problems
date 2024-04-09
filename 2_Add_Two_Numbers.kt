class AddTwoNumbers {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var list1 = l1
        var list2 = l2

        val result = ListNode(0)
        var current = result
        var count = 0

        while (list1 != null || list2 != null || count != 0) {
            val sum = (list1?.`val` ?: 0) + (list2?.`val` ?: 0) + count
            count = sum / 10
            current.next = ListNode(sum % 10)
            current = current.next!!

            list1 = list1?.next
            list2 = list2?.next
        }
        return result.next
    }
}
