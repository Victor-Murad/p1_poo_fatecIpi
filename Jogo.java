import java.util.Random;
public class Jogo {
  public static void main(String[] args) throws Exception {
    var gerador = new Random();
    var personagem = new Personagem("Victor");
   
    while(personagem.vivo()){
      if(!personagem.vivo()){
          System.out.println("morreu");
          break;
      }
      int oQueFazer = gerador.nextInt(3);
        
      switch(oQueFazer){
        case 0:
          personagem.cacar();
          break;
        case 1:
        personagem.comer();
          break;
        case 2:
        personagem.dormir();
        break;
      }
    
      personagem.exibirEstado();
       Thread.sleep(3000);
    }
    if(!personagem.vivo()){
        System.out.println("morreu");
    }
  }
}