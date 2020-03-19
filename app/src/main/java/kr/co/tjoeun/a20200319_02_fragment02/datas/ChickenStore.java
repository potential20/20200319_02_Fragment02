package kr.co.tjoeun.a20200319_02_fragment02.datas;

import java.io.Serializable;

public class ChickenStore implements Serializable {

    private String storeName;

    public ChickenStore(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }
}
