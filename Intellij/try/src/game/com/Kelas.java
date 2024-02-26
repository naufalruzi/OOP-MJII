package game.com;

public class Kelas
{
public static void main(String[] args) {
        // object
        //class object = new class ()
        weapon rifle = new weapon();
        shield penahan = new shield();

        //object.function
        //object.virable

        rifle.setnama("M4");
        System.out.println(rifle.name);
        }
        }

class weapon
{
    //virable
    String name;
    int atck;
    int firing_qty;
    //function
    //access return_type namafunction ( parameter, pameter,....)
    //{
    //}
    public void setnama (String x)
    {
        name = x;
    }
}

class shield
{
    int tahan;
    String kebal;
    public void orang (String x)
    {
        kebal = x;
    }
}
