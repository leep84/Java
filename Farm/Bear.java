abstract class Bear {

    boolean knows_kung_fu;
    String eats;
    public Bear(boolean knows_kung_fu, String eats){
        this.knows_kung_fu = knows_kung_fu;
        this.eats = eats;
    }

    public boolean getKungFu() {
        return knows_kung_fu;
    }

    public String getEats() {
        return eats;
    }

    public void setKungFu(boolean knows_kung_fu){
        this.knows_kung_fu = knows_kung_fu;
    }

    public void setEats(String eats) {
        this.eats = eats;
    }

    public void  about(){
       System.out.println("I like to eat "+this.eats);
    }

}
