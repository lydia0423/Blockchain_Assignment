package HelperClass;

import java.util.ArrayList;
import java.util.List;

public class MerkleTree {
    private List<String> tranxList;
    private static MerkleTree instance;
    private String root = "0";
    
    public String getRoot() {
        return root;
    }
    
    private MerkleTree(List<String> tranxList) {
        super();
        this.tranxList = tranxList;
    }

    public static MerkleTree getInstance(List<String> tranxList) {
        if(instance == null) {
            return new MerkleTree(tranxList);
        }
        
        return instance;
    }
    
    public void build() {
        List<String> tempList = new ArrayList<>();
        
        for(String tranx : this.tranxList) {
            tempList.add(tranx);
        }
        
        List<String> hashes = getTranxHashList(tempList);
        while(hashes.size() != 1){
            hashes = getTranxHashList(hashes);
        }
        
        this.root = hashes.get(0);
    }
    
    private List<String> getTranxHashList(List<String> tranxList) {
        List<String> hashList = new ArrayList<>();
        int i = 0;
        
        while(i < tranxList.size()) {
            String left = tranxList.get(i);
            i++;
            
            String right = "";
            if(i != tranxList.size()){
                right = tranxList.get(i);
            }
            
            String hash = Hasher.sha256(left.concat(right));
            hashList.add(hash);
            i++;
        }
        
        return hashList;
    }
    
}
