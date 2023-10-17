package week8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Ex09 {

    public static void main(String[] args) {

        RegistrationPlate reg1 = new RegistrationPlate("FI", "ABC-123");
        RegistrationPlate reg2 = new RegistrationPlate("FI", "UXE-465");
        RegistrationPlate reg3 = new RegistrationPlate("D", "B WQ-431");


        VehicleRegister vr = new VehicleRegister();

        vr.add(reg3, "Juhan");
        vr.add(reg2, "Peeter");
        vr.add(reg1, "Jaanus");


        System.out.println("Owners:");
        System.out.println(vr.get(reg1));





    }
}