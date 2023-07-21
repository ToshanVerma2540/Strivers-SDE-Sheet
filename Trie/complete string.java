import java.util.* ;
import java.io.*; 

class Solution {
static class TrieNode {
    public final TrieNode[] children;
    public boolean isEnd;

    TrieNode() {
        children = new TrieNode[26]; // Assuming lowercase English letters only
        isEnd = false;
    }
}

static class Trie {
    private final TrieNode root;

    Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode curr = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (curr.children[index] == null) {
                curr.children[index] = new TrieNode();
            }
            curr = curr.children[index];
        }
        curr.isEnd = true;
    }

    public boolean findCompleteString(String word){
        TrieNode curr = root;
        // boolean flag = true;
        for(char c : word.toCharArray()){
          int index = c-'a';
          if(curr.children[index] == null){
            return false;
          }else if(curr.children[index].isEnd == false){
            return false;
          }
          curr = curr.children[index];
        }
        return true;
    }
}
    public static String completeString(int n, String[] a) {
        Trie trie = new Trie();

        // Build the Trie with the prefixes
        for (String prefix : a) {
            trie.insert(prefix);
        }
        String ans = "";
        for(String words:a){
        if(trie.findCompleteString(words)){
          if(ans.length()<words.length()){
            ans = words;
          }else if(ans.length()==words.length()){
          int i =ans.compareTo(words);
          if(i>0){
            ans = words;
          }
          }
        }
        }
       if(ans.length()<=0){
         return "None";
       }
        return ans;
      
    }

}