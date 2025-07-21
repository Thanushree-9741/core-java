class DomasticRunner{

    public static void main(String[] args){

        Domastic dom = new Domastic();
         System.out.println(dom.getName());

         dom.setName("rat");
         String name = dom.getName();
         System.out.println(name);
    }
}