class KidsPlayBlock{

    private int id;
    private String type;
    private float discount;
    private char block;

    public KidsPlayBlock(int id, String type, float discount, char block ){
        this.id = id;
        this.type = type;
        this.discount = discount;
        this.block = block;
    }

    public int getId(){
        return id;
    }

    public String getType(){
        return type;
    }

    public float getDiscount(){
        return discount;
    }

    public char getBlock(){
        return block;
    }
}