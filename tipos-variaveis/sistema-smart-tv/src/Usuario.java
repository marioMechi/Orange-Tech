public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smarttv = new SmartTv();

        System.out.println("TV ligada?" + smarttv.ligada);
        System.out.println("Canal atual?" + smarttv.canal);
        System.out.println("Volume atual?" + smarttv.volume);

        smarttv.ligar();
        System.out.println("Novo Status -> TV ligada?" + smarttv.ligada);
        smarttv.desligar();
        System.out.println("Novo Status -> TV ligada?" + smarttv.ligada);

        smarttv.diminuirVolume();
        smarttv.diminuirVolume();
        smarttv.diminuirVolume();
        smarttv.aumentarVolume();
        System.out.println("Volume atual " + smarttv.volume);

        smarttv.mudarCanal(45);
        smarttv.diminuirCanal();
        smarttv.diminuirCanal();
        smarttv.aumentarCanal();
        System.out.println("Canal autual "+ smarttv.canal);
    }
}
