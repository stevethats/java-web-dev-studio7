package org.launchcode.studio7;

public class DVD2 extends BaseDisk implements OptimalDisk {
    public DVD2(String aName, int maxCapacity, String aType, int someUsedCapacity) {
        super(aName, maxCapacity, aType, someUsedCapacity);
    }

    @Override
    public void spinDisk() {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm");
    }

    @Override
    public void startMedia() {
        System.out.println("Go watch a movie or something");
    }
}
