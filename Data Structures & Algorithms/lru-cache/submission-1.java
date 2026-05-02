class LRUCache {

    public class ListNode{

        private ListNode prev;
        private int key;
        private int value;
        private ListNode next;

        public ListNode(int key, int value){
            this.key = key;
            this.value = value;
        }
    }

    public ListNode head;
    public ListNode tail;
    public Map<Integer, ListNode> map;
    public int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head = new ListNode(0,0);
        tail = new ListNode(0,0);
        map = new HashMap<>();

        head.next = tail;
        tail.prev = head;
    }

    public void insert(ListNode node){
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
        node.prev = head;
    }

    public void remove(ListNode node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        ListNode node = map.get(key);
        remove(node);
        insert(node);

        return node.value;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            remove(map.get(key));
        }
        ListNode node = new ListNode(key, value);
        insert(node);
        map.put(key, node);

        if(map.size()>capacity){
            ListNode lru = tail.prev;
            remove(lru);
            map.remove(lru.key);
        }
    }
}
