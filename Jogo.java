import java.util.Random;
public class Jogo {
  public static void main(String[] args) throws Exception {
    var gerador = new Random();
    var personagem = new Personagem("Victor");
    var personagem2 = new Personagem("Kenji",3,3,3);
   
    while(personagem.vivo()&&personagem2.vivo()){
      if(!personagem.vivo() && !personagem2.vivo()){
          System.out.println("morreu");
          break;
      }
      int oQueFazer = gerador.nextInt(3);
        
      switch(oQueFazer){
        case 0:
          personagem.cacar();
          personagem2.dormir();
          break;
        case 1:
        personagem.comer();
        personagem2.cacar();
          break;
        case 2:
        personagem.dormir();
        personagem2.comer();
        break;
      }
    
      personagem.exibirEstado();
      System.out.println("-------------------------");
      personagem2.exibirEstado();
      System.out.println("-------------------------");
       Thread.sleep(3000);
    }
    if(!personagem.vivo() && !personagem2.vivo()){
        System.out.println("morreu");
    }
  }
}