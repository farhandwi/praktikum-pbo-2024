class Lingkaran{

    private double diameter;

    Lingkaran (double diameter){
        this.diameter = diameter;
    }

// setter
    public void setJari2(double jari2){
        this.diameter = jari2*2;
    }

// getter
    public double getJari2(){
        return this.diameter/2;
    }

// getter
    public double getLuas(){
        return 3.14*diameter*diameter/4;
    }
}