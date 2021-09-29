package org.launchcode.studio7;

public class CD2 extends BaseDisk implements OptimalDisk {
    public CD2(String aName, int maxCapacity, String aType, int someUsedCapacity) {
        super(aName, maxCapacity, aType, someUsedCapacity);
    }

    @Override
    public void spinDisk() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm");
    }

    @Override
    public void startMedia() {
        System.out.println("Would you like to play a game?");
    }
}
