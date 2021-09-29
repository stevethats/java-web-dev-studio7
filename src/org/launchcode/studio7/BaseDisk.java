package org.launchcode.studio7;

import java.util.ArrayList;

public class BaseDisk {
    private String name;
    private int storageCapacity;
    private int remainingCapacity;
    private int capacityUsed;
    private String diskType;
    private ArrayList<String> contents;

    public BaseDisk (String aName, int maxCapacity, String aType, int someUsedCapacity) {
        this.name = aName;
        this.storageCapacity = maxCapacity;
        this.diskType = aType;
        this.capacityUsed = checkCapacity(someUsedCapacity);
    }

    private int checkCapacity (int dataWritten) {
        if (storageCapacity < dataWritten) {
            return storageCapacity;
        }
        return dataWritten;
    }

    private int spaceLeft() {
        return storageCapacity - capacityUsed;
    }

    public String diskInfo() {
        String output = String.format("\nDisk Name: %s\nMax Capacity: %d" +
                "\nSpace used: %d" +
                "\nAvailable Space: %d\n", name, storageCapacity, capacityUsed, remainingCapacity);
        return output;
    }

    public String writeData (int dataSize) {
        if (dataSize > remainingCapacity) {
            return "Not enough disc space";
        }
        capacityUsed += dataSize;
        remainingCapacity -= dataSize;

        return "Data written to disc. Remaining Space: " + remainingCapacity;
    }
}
