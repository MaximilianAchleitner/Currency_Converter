package sample;

public class Currency {
    String sign;
    double value;

    public Currency(String s, double v){
        this.sign = s;
        this.value = v;
    }


    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
