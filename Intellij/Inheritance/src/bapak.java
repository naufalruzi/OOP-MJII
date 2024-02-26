public class bapak {
    public int x=1;
    public int y=2;
    public int z=3;

    bapak(){
        x=1;
        y=1;
        z=3;
    }

    public void method1()//anak override bapak
    {
        System.out.println("bapak");
    }
    public void method1(int x)//anak override bapak
    {
        System.out.println("x=" + x);
    }
    public void method1(int x, String y)//anak override bapak
    {
        System.out.println("3"+" "+ x +"" + y);
    }

}
