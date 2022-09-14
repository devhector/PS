package Registers;

public final class RI {

    static String value="0000000000000000";
	static String address="0000000000000000";

    public static String getValue() {
        return value;
    }

	public static String getAddress() {
		return address;
	}

    public static void setValue(String value) {
        RI.value = value;
    }

	public static void setAddress(String address) {
		RI.address = address;
	}

}
