package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        CD2 myCD2 = new CD2 ("Pray for the Wicked", 700, "CD-R", 350);
        DVD2 myDVD2 = new DVD2 ("Frozen", 4700, "DVD-R", 1450);

        myCD2.spinDisk();
        myCD2.startMedia();

        myDVD2.spinDisk();
        myDVD2.startMedia();

//        CD myCD = new CD ("Pray for the Wicked", "Song List: \n1. (Nut A) Silver Lining\n2. Say Amen (Saturday Night)\n3. Hey Look Ma, I Made It\n4. High Hopes\n5. Roaring 20s", 500, "CD");
//        DVD myDVD = new DVD ("Frozen", "Run time of 1 hour and 42 minutes.", 570, "DVD");
//
//        myDVD.spinDisk();
//        myDVD.startMedia();
//
//        myCD.spinDisk();
//        myCD.startMedia();

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

    }
}
