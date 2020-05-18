package com.practice.leetcode.challenge;

public class Trie {

	public static void main(String[] args) {
		Trie trie = new Trie();
		trie.insert("apple");
		System.out.println(trie.search("apples"));
	}
	TrieNode root;
    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
    	TrieNode node = root;
        for(Character c : word.toCharArray()){
        	TrieNode child = node.trie[c-'a'];
        	if(child ==null){
        		child = new TrieNode();
        		node.trie[c-'a']= child;
        	}
        	node = child;
        }
        node.isEndofWord = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
    	TrieNode node = root;
        for(Character c : word.toCharArray()){
        	TrieNode child = node.trie[c-'a'];
        	if(child ==null){
        		return false;
        	}
        	node = child;
        }
        return node.isEndofWord;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
    	TrieNode node = root;
        for(Character c : prefix.toCharArray()){
        	TrieNode child = node.trie[c-'a'];
        	if(child ==null){
        		return false;
        	}
        	node = child;
        }
        return true;
    }
}

class TrieNode{
	TrieNode trie[];
	boolean isEndofWord;
	public TrieNode() {
		trie = new TrieNode[26];
		isEndofWord = false;
	}
}