package pl.advanced1.lambda.null_handling;

public class Chipset {

    private String vendorname;

    public Chipset(String vendorname) {
        this.vendorname = vendorname;
    }

    @Override
    public String toString() {
        return "Chipset{" +
                "vendorname='" + vendorname + '\'' +
                '}';
    }

    public String getVendorname() {
        return vendorname;
    }
}
