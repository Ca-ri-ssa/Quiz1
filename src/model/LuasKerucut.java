package model;
public class LuasKerucut{
    public int rad, garpel;
    public double phi = 22.0/7;
    public void Kerucut() 
    {
        double luas = phi*rad+(rad+garpel);
        System.out.println("Luas Kerucut = " + luas + " cm");

        System.out.println("Deret bilangan genap dari hasil luas = ");
        for(double i = 1; i <= luas; i++)
        {
            if(i%2 == 0)
            {
                System.out.println(i + " ");
            }
        }
    }
}