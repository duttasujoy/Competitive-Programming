package com.practice.leetcode.challenge.june;

import java.util.ArrayList;
import java.util.List;

public class WordSearchII {
	public static void main(String[] args) {
		WordSearchII obj = new WordSearchII();
		char[][] board = {
				  {'o','a','a','n'},
				  {'e','t','a','e'},
				  {'i','h','k','r'},
				  {'i','f','l','v'}
				};
		String[] words = {"oath","pea","eat","rain"};
		System.out.println(obj.findWords(board, words));
	}
	Trie root = new Trie();
    public List<String> findWords(char[][] board, String[] words) {
        List<String> answer = new ArrayList<>();
        for(String word :words){
        	insert(word);
        }
        Trie currNode = root;
        for (int i = 0; i < board.length; i++) {
        	for (int j = 0; j < board[0].length; j++) {
        		solve(i,j,board,answer,currNode);
			}
		}
        return answer;
    }
	private void solve(int i, int j, char[][] board, List<String> answer, Trie currNode) {

		int index = board[i][j]-'a';
		
		if(board [i][j] =='$' || currNode.trie[index] == null){
			return;
		}
		Trie curr = currNode.trie[index];
		if(curr.end>0){
			curr.end --;
			answer.add(curr.word);
		}
		char ch = board[i][j];
		board[i][j] = '$';
		if(i>0)
			solve(i-1, j, board, answer, curr);
		if(i<board.length -1)
			solve(i+1, j, board, answer, curr);
		if(j>0)
			solve(i, j-1, board, answer, curr);
		if(j<board[0].length-1)
			solve(i, j+1, board, answer, curr);
			
		board[i][j] = ch;
	}
	private void insert(String word) {

		Trie node = root;
		for(char c:word.toCharArray()){
			int index = c - 'a';
			if(node.trie[index] == null){
				node.trie[index] = new Trie();
			}
			node = node.trie[index];
		}
		node.end = 1;
		node.word = word;
	}
}

class Trie{
	Trie[] trie;
	int end;
	String word;
	public Trie() {
		trie = new Trie[26];
		end =0;
	}
}