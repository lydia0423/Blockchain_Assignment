package HelperClass;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Transaction implements Serializable{
    private String merkleRoot = "0"; 
    
    public String getMerkleRoot() {
        return merkleRoot;
    }
    
    private List<String> dataList = new ArrayList<>();
    
    public void add(String tranx) {
        dataList.add(tranx);
    }
    
    @Override
    public String toString() {
        MerkleTree mt = MerkleTree.getInstance(dataList);
        mt.build();
        merkleRoot = mt.getRoot();
        
        return "Transaction [merkleRoot=" + merkleRoot + ", dataList=" + dataList + "]";
    }
}
