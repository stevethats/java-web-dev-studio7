package org.launchcode.studio7;

public class CD extends BasicDisk implements OptimalDisk {

    public CD(String name, String content, double rpm, String diskType) {
        super(name, content, rpm, diskType);
    }

    @Override
    public void spinDisk() {
        System.out.println("A " + this.getDiskType() + " spins at a rate of " + this.getRpm() + " rpm.");
    }

    @Override
    public void startMedia() {
        System.out.println(this.getName() + "\n" + this.getContent());
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.


}
