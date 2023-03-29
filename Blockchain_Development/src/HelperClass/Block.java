package HelperClass;

import java.io.Serializable;

public class Block implements Serializable {

    public Header blockHeader;

    public Header getBlockHeader() {
        return blockHeader;
    }

    public Block(String previousHash, String merkleRoot, String userIdHash) {
        super();
        long now = System.currentTimeMillis();
        this.blockHeader = new Header();
        this.blockHeader.setPreviousHash(previousHash);
        this.blockHeader.setTimestamp(now);
        this.blockHeader.setUserIdHash(userIdHash);
        // hashing with sha256 - the input is joined with previousHas + merkle root + userId
        String currentHash = Hasher.sha256(
                String.join("+", previousHash, userIdHash, String.valueOf(now), merkleRoot)
        );
        this.blockHeader.setCurrentHash(currentHash);
    }

    public class Header implements Serializable {

        private int index;
        private String currentHash, previousHash, userIdHash;
        private long timestamp;

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public String getCurrentHash() {
            return currentHash;
        }

        public void setCurrentHash(String currentHash) {
            this.currentHash = currentHash;
        }

        public String getPreviousHash() {
            return previousHash;
        }

        public void setPreviousHash(String previousHash) {
            this.previousHash = previousHash;
        }

        public String getUserIdHash() {
            return userIdHash;
        }

        public void setUserIdHash(String userIdHash) {
            this.userIdHash = userIdHash;
        }

        public long getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(long timestamp) {
            this.timestamp = timestamp;
        }

        @Override
        public String toString() {
            return "Header [index=" + index + ", currentHash=" + currentHash + ", previousHash=" + previousHash
                    + ", userIdHash=" + userIdHash + ", timestamp=" + timestamp + "]";
        }
    }

    public Transaction tranxList;

    public void setTranxList(Transaction tranxList) {
        this.tranxList = tranxList;
    }

    @Override
    public String toString() {
        return "Block [blockHeader=" + blockHeader + ", tranxList=" + tranxList + "]";
    }
}
