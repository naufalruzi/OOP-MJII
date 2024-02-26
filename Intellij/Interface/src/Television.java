public class Television implements Remote{
    static void volumeUp() {
//super.volumeUp();//NOT ALLOWED CALL SUPER while implementing a class as Interface
        System.out.println("_リモートから音量を上げる_");// WAJIB override.so kita buat in japanese
    }
    static void volumeDown() {
        System.out.println("_リモートから音量を下げる_");// WAJIB override.so kita buat in japanese
    }

}
