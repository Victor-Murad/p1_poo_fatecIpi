import java.util.Random;
public class Jogo {
  public static void main(String[] args) throws Exception {
    var gerador = new Random();
    var personagem = new Personagem("Victor");
    var personagem2 = new Personagem("Kenji",10,10,0);
   
    while(personagem.vivo()||personagem2.vivo()){
      if(!personagem.vivo()){
          personagem.morreu();
          break;
      }
      if(!personagem2.vivo()){
        personagem2.morreu();
        break;
      }
      int oQueFazer = gerador.nextInt(4);
        
      switch(oQueFazer){
        case 0:
          personagem.cacar();
          personagem2.dormir();
          System.out.println("-------------------------");
          break;
        case 1:
        personagem.comer();
        personagem2.cacar();
        System.out.println("-------------------------");
          break;
        case 2:
        personagem.dormir();
        personagem2.comer();
        System.out.println("-------------------------");
        break;
        case 3: 
        int qmAtaca = gerador.nextInt(3);
        if(qmAtaca == 0){
          personagem.atacar(personagem2);
        }
        else{
          personagem2.atacar(personagem);
        }
        System.out.println("-------------------------");
      }
    
      personagem.exibirEstado();
      System.out.println("-------------------------");
      personagem2.exibirEstado();
      System.out.println("-------------------------\n");
      
       Thread.sleep(3000);
    }
  }
}