import java.time.*;

public class CandleSeriesData {
    private double price;
    private String symbol;
    private LocalDateTime time;

    public CandleSeriesData(LocalDateTime time, String symbol, double price){
        this.time= time;
        this.symbol= symbol;
        this.price= price;
    }

    public LocalDateTime getTime(){

        return time;
    }
    public String getSymbol(){
        return symbol;
    }
    public double getPrice(){

        return price;
    }

}