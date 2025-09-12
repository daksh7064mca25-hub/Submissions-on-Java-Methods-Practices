import java.util.Arrays;

class OTPGenerator {

    public static int generateOTP() {
        // Math.random() gives [0.0, 1.0)
        // multiply by 900000 and add 100000 to ensure 6-digit
        return (int)(Math.random() * 900000) + 100000;
    }

    public static boolean areUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false; // duplicate found
                }
            }
        }
        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] otpArray = new int[10];

        // generate 10 OTPs
        for (int i = 0; i < otpArray.length; i++) {
            otpArray[i] = OTPGenerator.generateOTP();
        }

        // print generated OTPs
        System.out.println("Generated OTPs: " + Arrays.toString(otpArray));

        // check uniqueness
        if (OTPGenerator.areUnique(otpArray)) {
            System.out.println("All OTPs are unique ✅");
        } else {
            System.out.println("Duplicate OTPs found ❌");
        }
    }
}
