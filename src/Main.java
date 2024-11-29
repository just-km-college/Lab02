public class Main {
    public static void main(String[] args) {

        Color color1 = new Color(100,255,255,255);
        Color color2 = new Color(120,120,120);
        Color color3 = new Color(90,-100,300,4000);
        Color color4 = new Color(-200,5000,300);

        // toString showcase
        System.out.printf("Color 1: %s \n",color1);
        System.out.printf("Color 2: %s \n",color2);
        System.out.printf("Color 3: %s \n",color3);
        System.out.printf("Color 4: %s \n",color4);

        // getters showcase
        System.out.printf("Color 1: a: %d, R: %d, G: %d, B: %d\n",color1.alfa(), color1.red(), color1.green(), color1.blue());
        System.out.printf("Color 2: a: %d, R: %d, G: %d, B: %d\n",color2.alfa(), color2.red(), color2.green(), color2.blue());
        System.out.printf("Color 3: a: %d, R: %d, G: %d, B: %d\n",color3.alfa(), color3.red(), color3.green(), color3.blue());
        System.out.printf("Color 4: a: %d, R: %d, G: %d, B: %d\n",color4.alfa(), color4.red(), color4.green(), color4.blue());
    }
}

