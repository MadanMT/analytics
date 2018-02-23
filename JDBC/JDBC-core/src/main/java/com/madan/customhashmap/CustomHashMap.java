package com.avanseus.customhashmap;

import org.apache.xerces.dom.ElementNSImpl;
import org.bytedeco.javacpp.opencv_core;
import org.omg.IOP.ENCODING_CDR_ENCAPS;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by madan on 23/2/18
 */
public class CustomHashMap<K,V> {
    private int capacity = 10;
    private Entry<K,V>[] table;
    static class Entry<K,V>{
        private K key;

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public Entry<K, V> getNext() {
            return next;
        }

        public void setNext(Entry<K, V> next) {
            this.next = next;
        }

        private V value;
        private Entry<K,V> next;

        public Entry(K key, V value, Entry<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    public CustomHashMap() {
        table = new Entry[capacity];
    }

    public int hashcode(K key){
        return Math.abs(key.hashCode()) % capacity;
    }

    public V get(K key){
        if (key == null) return null;
        int hashcode = hashcode(key);
        if (table[hashcode] != null){
            Entry<K,V> current = table[hashcode];
            while (current != null){
                if (current.key.equals(key)){
                    return current.value;
                }
                current = current.next;
            }
        }
        return null;
    }

    public void put(K key, V value){
        if (key == null ) return;
        int hashcode = hashcode(key);
        Entry<K,V> newEntry = new Entry<>(key,value,null);
        if (table[hashcode] == null){
            table[hashcode] = newEntry;
        }else {
            Entry<K,V> previous = null;
            Entry<K,V> current = table[hashcode];
            while (current != null){
                if (current.key.equals(key)){
                    if (previous == null){
                        table[hashcode] = newEntry;
                        newEntry.next = current.next;
                        return;
                    }else {
                        previous.next = newEntry;
                        newEntry.next = current.next;
                    }
                }
                previous = current;
                current = current.next;
            }
            previous.next = newEntry;
        }
    }

    public boolean remove(K deleteKey){
        if (deleteKey == null) return false;
        int hashcode = hashcode(deleteKey);
        if (table[hashcode] != null){
            Entry<K,V> previous = null;
            Entry<K,V> current = table[hashcode];
            while (current != null){
                if (current.key.equals(deleteKey)){
                    if (previous == null){
                        table[hashcode] = table[hashcode].next;
                    }else {
                        previous.next = current.next;
                        return true;

                    }
                }
                previous = current;
                current = current.next;
            }
        }
        return  false;
    }

    public Set<CustomHashMap.Entry<K,V>> entrySet(){
        Set<CustomHashMap.Entry<K,V>> entries = null;
        if (table == null) return null;
        entries = new LinkedHashSet<>();
        System.out.println(table.length);
        for (Entry<K,V> entry : table){
            if (entry != null)entries.add(entry);
        }
        return entries;
    }

    public String toString(){
        String defaultString = "{}";
        StringBuilder string = new StringBuilder();
        if (table == null) return defaultString;
        string.append("{");
        for (Entry<K,V> entry : table){
            if (entry != null){
                string.append(entry.getKey()+"="+entry.getValue()+", ");
            }
        }
        string.delete(string.lastIndexOf(","),string.length());
        string.append("}");
        return string.toString();
    }
}