public class Personagem {
  private String nome;
  private int energia = 10;
  private int fome = 10;
  private int sono = 0;
  private int item = 4;

  Personagem(String nome){
    this.nome = nome;
  }
  Personagem(String nome, int energia, int fome, int sono){
    this.nome = nome;
    if (energia >= 0 && energia <= 10)
      this.energia = energia;
    if (fome >= 0 && fome <= 10)
      this.fome = fome;
    if(sono >= 0 && sono <= 10)
      this.sono = sono;  
  }

  void cacar(){
    if(energia >= 2){
      System.out.println(nome + " caçando");
      energia -= 2; 
      item += 1;
    }
    else{
      System.out.println (nome + " sem energia para caçar");
    }
    fome = Math.min(fome + 1, 10);
    sono = Math.min(sono + 1 ,10);
  }
  void comer(){
    if (fome >= 1 && item>0){
      System.out.println(nome + " comendo");
      energia = energia + 1 > 10 ? 10 : energia + 1;
      fome--;
      item--;
    }
    else{
      System.out.println(nome + " sem fome");
    }
  }
  void dormir(){
    if(sono > 0){
      System.out.println(nome + " dormindo");
      sono -= 1;
      energia = Math.min(10, energia + 1);
    }
    else{
      System.out.println(nome + " sem sono");
    }
  }
  void exibirEstado(){
    System.out.printf(
      "%s: e: %d, f: %d, s: %d, qt: %d\n",
      nome,
      energia,
      fome,
      sono,
      item
    );
  }
  void morreu(){
    System.out.println(nome + " morreu");
  }

  void atacar(Personagem alvo){
    System.out.println(nome + " atacando " + alvo.nome);
    alvo.energia--;
    if(alvo.energia == 0){
        System.out.println(alvo.nome+ " foi morto");
    }
  }
  
  boolean vivo(){
    return energia>0;
   }
}