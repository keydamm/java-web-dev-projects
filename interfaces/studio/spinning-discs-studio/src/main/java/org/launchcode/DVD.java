package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc {
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
    public DVD(String name, int storageCapacity, String discType, String contents) {
        super(name, storageCapacity, discType, contents);
    }
    @Override
    public void writeData() {
        System.out.println("This DVD is writing at 1200 kB/s");
    }

    @Override
    public void readData() {
        System.out.println("This DVD is reading at 120 kB/s");
    }

    @Override
    public void spinDisc() {
        System.out.println("CD is spinning at 1600 RPM");
    }
}
