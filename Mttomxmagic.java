
package com.dkreators.mttomxmagic;

/**
 *
 * @author Twofold
 */
public class Mttomxmagic {

    public static void main(String[] args) {
        String datamt = "{1:F01ESPBESMMARMS8286723799}\n" +
"\n" +
"{2:O1030841140130CGDIPTPLBXXX12702744781401300942N}\n" +
"\n" +
"{3:{103:TGT}{113:URGT}{108:10092119}{115:094206094206PT0000000515798425}{121:180f1e65-90e0-44d5-a49a-92b55eb3025f}}\n" +
"\n" +
"{4: :20:PGE0428000000183 :23B:CRED :32A:200205EUR2451,74 :50A:/NL293456125434982 VISTUS31 :59:/CH90290000000096 BANCO CENTRAL DEL EQUADOR :71A:SHA :72:/INS/RETN -}\n" +
"\n" +
"{5:{CHK:5AE1AA935421}}";
        System.out.println("incoming data is "+datamt);
        
        MarioMagic msh = new MarioMagic();
       String mymx = msh.convert(datamt);
       
       System.out.println(mymx);
    }
