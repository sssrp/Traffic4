package com.example.pc.traffic;

/**
 * Created by Pc on 26/9/2559.
 */
public class MyData {


    public String[] titile(){
        String[] strTitel = new String[20];
        strTitel[0] = "ห้ามเลี้ยวซ้าย";
        strTitel[1] = "ห้ามเลี้ยวขวา";
        strTitel[2] = "ให้ตรงไป";
        strTitel[3] = "เลี้ยวขวา";
        strTitel[4] = "เลี้ยวซ้าย";
        strTitel[5] = "ทางออก";
        strTitel[6] = "ทางเข้า";
        strTitel[7] = "ทางออก";
        strTitel[8] = "หยุดรถ";
        strTitel[9] = "จำกัดความสูง 2.5 เมตร";
        strTitel[10] = "แยกซ้ายขวา";
        strTitel[11] = "ห้ามกลับรถ";
        strTitel[12] = "ห้ามจอด";
        strTitel[13] = "รถสวน";
        strTitel[14] = "ห้ามแซง";
        strTitel[15] = "ทางเข้า";
        strTitel[16] = "โปรดหยุดรถ";
        strTitel[17] = "โปรดหยุดรถ";
        strTitel[18] = "จำกัดความสูง 2.5 เมตร";
        strTitel[19] = "จำกัดความสูง 5 เมตร";


    return strTitel;

    } //Title
    public int[] icon(){
        int[] intIcon = {R.drawable.traffic_01, R.drawable.traffic_02, R.drawable.traffic_03, R.drawable.traffic_04,
                R.drawable.traffic_05, R.drawable.traffic_06, R.drawable.traffic_07, R.drawable.traffic_08
                , R.drawable.traffic_09, R.drawable.traffic_10, R.drawable.traffic_11, R.drawable.traffic_12,
                R.drawable.traffic_13, R.drawable.traffic_14, R.drawable.traffic_15, R.drawable.traffic_16
                , R.drawable.traffic_17, R.drawable.traffic_18, R.drawable.traffic_19, R.drawable.traffic_20};
        return intIcon;

    } //icon
} //Main class
