package com.art.avoid.allocations;

public class StringConcat {
    public String concatPlus(int n) {
        String s = "";
        for (int i = 0; i < n; i++) {
            s = s + i; // สร้าง String ใหม่ตลอด (ช้ามาก)
        }
        return s;
    }

    public String concatBuilder(int n) {
        StringBuilder sb = new StringBuilder(n * 3);
        for (int i = 0; i < n; i++) {
            sb.append(i);
        }
        return sb.toString();
    }
}
