package DataStructure.HashTable;

import java.util.Arrays;

public class HashTableImpl<K,V> {

  private float loadfactor;
  private ListNode<?,?>[] elements;
  private int threshold;
  private int count = 0;

  public HashTableImpl(int initialCapacity, float loadfactor)
  {
    elements = new ListNode<?,?>[initialCapacity];
    this.loadfactor = loadfactor;
    threshold = (int)(loadfactor*initialCapacity);
  }

  public HashTableImpl()
  {
    this(11,0.75f);
  }

  @Override
  public String toString() {
    return "HashTableImpl{" +
        "loadfactor=" + loadfactor +
        ", elements=" + Arrays.toString(elements) +
        ", threshold=" + threshold +
        ", count=" + count +
        '}';
  }

  public void put(K key, V value)
  {
    //is the key already present? if yes update. else add the entry
    int hash = key.hashCode();
    int index = hash % elements.length;
    @SuppressWarnings("unchecked")
    ListNode<K,V> listNode = (ListNode<K,V>)elements[index];
    while(listNode!=null)
    {
      if(listNode.hash == hash && key.equals(listNode.key))
      {
        listNode.setValue(value);
        return;
      }
      listNode = listNode.next;

    }
    addEntry(hash, key, value, index);
    return;
  }

  private void addEntry(int hash, K key, V value, int index) {
    if(threshold <= count)
    {
      rehash();
      index = hash%elements.length;
    }
    @SuppressWarnings("unchecked")
    ListNode<K,V> listNode = (ListNode<K,V>)elements[index];
    ListNode<K,V> newListnode = new ListNode(key, value, key.hashCode(), listNode);
    elements[index] = newListnode;
    count++;


  }

  private void rehash() {
    ListNode<?,?>[] oldElements = elements;

    elements = new ListNode[oldElements.length*2];
    for(ListNode ln:oldElements)
    {
      if(ln!=null) {
        while (ln != null) {
          int hash = ln.key.hashCode();
          int index = hash % elements.length;
          ListNode<K, V> listNode = (ListNode<K, V>) elements[index];
          ListNode<K, V> newListnode = new ListNode((K) ln.key, (V) ln.value,
              ((K) ln.key).hashCode(), listNode);
          elements[index] = newListnode;
          ln = ln.next;
        }
      }
    }
    threshold = (int)(loadfactor*elements.length);

  }

  public V get(K key)
  {
    int hash = key.hashCode();
    int index = hash % elements.length;
    ListNode<K,V> listNode = (ListNode<K,V>)elements[index];
    while(listNode!=null)
    {
      if(listNode.key.equals(key) && listNode.hash == key.hashCode())
      {
        return listNode.getValue();
      }
      listNode = listNode.next;
    }
    return null;
  }


  private static class ListNode<K, V>
  {

    @Override
    public String toString() {
      return "ListNode{" +
          "key=" + key +
          ", value=" + value +
          ", hash=" + hash +
          ", next=" + next +
          '}';
    }

    final K key;
    private V value;
    final int hash;
    private ListNode<K,V> next;

    public ListNode(K key, V value, int hashCode, ListNode next) {
      this.key = key;
      this.value = value;
      this.hash = hashCode;
      this.next = next;
    }

    public K getKey() {
      return key;
    }




    public V getValue() {
      return value;
    }

    public void setValue(V value) {
      this.value = value;
    }



    public ListNode getNext() {
      return next;
    }

    public void setNext(ListNode next) {
      this.next = next;
    }
  }

}
