import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Solution {
    static class TrieNode {
        TrieNode zero;
        TrieNode one;
    }

    static class Trie {
        TrieNode root = new TrieNode();

        public void insert(int n) {
            TrieNode curr = root;
            for (int i = 31; i >= 0; i--) {
                int num = (n >> i) & 1;
                if (num == 0) {
                    if (curr.zero == null) {
                        TrieNode newNode = new TrieNode();
                        curr.zero = newNode;
                    }
                    curr = curr.zero;
                } else {
                    if (curr.one == null) {
                        TrieNode newNode = new TrieNode();
                        curr.one = newNode;
                    }
                    curr = curr.one;
                }
            }
        }

        public int findMaxXor(int n) {
            TrieNode curr = root;
            int ans = 0;
            for (int i = 31; i >= 0; i--) {
                int num = (n >> i) & 1;
                if (num == 0) {
                    if (curr.one != null) {
                        ans = ans + (1 << i);
                        curr = curr.one;
                    } else {
                        curr = curr.zero;
                    }
                } else {
                    if (curr.zero != null) {
                        ans = ans + (1 << i);
                        curr = curr.zero;
                    } else {
                        curr = curr.one;
                    }
                }
            }
            return ans;
        }
    }

    public static ArrayList<Integer> maxXorQueries(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> queries) {
        Collections.sort(arr);

        ArrayList<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < queries.size(); i++) {
            indexes.add(i);
        }

        // Sort the indexes according to the second element of queries
        Collections.sort(indexes, new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return queries.get(i1).get(1).compareTo(queries.get(i2).get(1));
            }
        });

        Trie trie = new Trie();
        int i = 0;
        ArrayList<Integer> result = new ArrayList<>();
        for (int k = 0; k < indexes.size(); k++) {
            result.add(-1);
        }

        for (int e : indexes) {
            int ans = 0;
            while (i < arr.size() && arr.get(i) <= queries.get(e).get(1)) {
                trie.insert(arr.get(i));
                i++;
            }
            if (i == 0) {
                result.set(e, -1);
            } else {
                int getmaxxor = trie.findMaxXor(queries.get(e).get(0));
                result.set(e, getmaxxor);
            }
        }
        return result;
    }
}
