package org.launchcode;

public abstract class BaseDisc {
    private String name;
    private int storageCapacity;
    private String discType;
    private String contents;

    public BaseDisc(String name, int storageCapacity, String discType, String contents) {
        this.name = name;
        this.storageCapacity = storageCapacity;
        this.discType = discType;
        this.contents = contents;
    }
    public abstract void writeData();
    public abstract void readData();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}
