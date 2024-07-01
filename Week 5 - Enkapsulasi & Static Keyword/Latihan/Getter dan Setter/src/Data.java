class Data{
    public int intPublic;
    private int intPrivate;
    private double doublePrivate;

    public Data(){
        this.intPublic = 0;
        this.intPrivate = 10;
    }
    
    // getter
    
    public int getIntPrivate(){
        return this.intPrivate;
    }

    public void setDoublePrivate (double value) {
        this.doublePrivate = value;
    }

    void display(){
        System.out.println(this.intPublic);
        System.out.println(this.intPrivate);
        System.out.println(this.doublePrivate);
    }
}