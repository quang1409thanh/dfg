package org.ex;

public class Calculator {

    public static String calculatePrice(int type, int KwhUsed) {
        String name;
        double result;
        if (KwhUsed < 0) {
            return "Invalid error";
        }
        if (type == 1) {
            name = "Gia Dinh: ";
            if (KwhUsed <= 50) {
                result = KwhUsed * 1728;
            } else if (KwhUsed <= 100) {
                result = (KwhUsed - 50) * 1786 + 86400;
            } else if (KwhUsed <= 200) {
                result = (KwhUsed - 100) * 2074 + 175700;
            } else if (KwhUsed <= 300) {
                result = (KwhUsed - 200) * 2612 + 383100;
            } else if (KwhUsed <= 400) {
                result = (KwhUsed - 300) * 2919 + 644300;
            } else result = (KwhUsed - 400) * 3015 + 936200;
        } else if (type == 2) {
            name = "San Xuat: ";
            result = KwhUsed * 1738;
        } else if (type == 3) {
            name = "Hanh Chinh: ";
            result = KwhUsed * 1940;
        } else if (type == 4) {
            name = "Kinh Doanh: ";
            result = KwhUsed * 2746;
        } else {
            return "Invalid error";
        }
        result = result * 1.08;
        return name + (int) result;
    }
}