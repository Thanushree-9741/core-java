class MallKidsRunner{
    public static void main(String[] args){

        Mall mall = new Mall("RMNT Mall","Kolar");
        System.out.println("1st class data ------------------------------------------");
        System.out.println(mall.getName());
        System.out.println(mall.getAddress());
        System.out.println();

        KidsPlayBlock kid1 = new KidsPlayBlock(21, "Baby dall", 20f, 'A');

        mall.setKids(kid1);

        KidsPlayBlock kids1 = mall.getKids();
        System.out.println("2st class data ------------------------------------------");

        System.out.println(kids1.getId());
        System.out.println(kids1.getType());
        System.out.println(kids1.getDiscount());
        System.out.println(kids1.getBlock());
    }
}