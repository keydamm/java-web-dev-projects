package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc {
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
    public CD(String name, int storageCapacity, String discType, String contents) {
        super(name, storageCapacity, discType, contents);
    }

    @Override
    public void writeData() {
        System.out.println("This CD is writing at 800 kB/s");
    }

    @Override
    public void readData() {
        System.out.println("This CD is reading at 240 kB/s");
    }

    @Override
    public void spinDisc() {
        System.out.println("CD is spinning at 500 RPM");
    }

}
