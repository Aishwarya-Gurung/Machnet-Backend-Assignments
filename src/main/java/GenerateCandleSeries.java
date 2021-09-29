import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class GenerateCandleSeries {
    LocalDateTime currentTime= LocalDateTime.parse("2021-09-21T10:00:00.255");
    List<CandleSeriesData> listOfCandleSeriesData= new ArrayList<>();
    List<CandleSeriesData> listOfFilteredData= new ArrayList<>();
    List<CandleDTO> listOfCandleDTO=new ArrayList<>();

    public static String symbolGenerator(){
        String[] symbols= {"USD","POUND"};
        Random random=new Random();
        int symbol=random.nextInt(symbols.length);
        return symbols[symbol];
    }

    public static double priceGenerator(double price){
        Random random= new Random();
        double[] priceChange= {-(random.nextInt(5)),(random.nextInt(5))};
        int index=random.nextInt(priceChange.length);
        price=price+((price*priceChange[index])/100);
        return price;
    }

    public List<CandleSeriesData> candleSeriesDataGenerator(){
        Random random=new Random();
        double price =random.nextInt( 700) + 200 ;
        while(listOfCandleSeriesData.size()<90000) {
            if (currentTime.getHour() >= 10 && currentTime.getHour() < 15) {
                listOfCandleSeriesData.add(new CandleSeriesData(currentTime, symbolGenerator(), priceGenerator(price)));
            }
            currentTime = currentTime.plusSeconds(1);
        }
        return listOfCandleSeriesData;
    }

    public List<CandleDTO> getCandles(String symbol, LocalDateTime startDate, LocalDateTime endDate, int granularity) {

        listOfFilteredData=listOfCandleSeriesData.stream()
                .filter(n->n.getTime().isAfter(startDate)&&n.getTime().isBefore(endDate))
                .collect(Collectors.toList());

        int skip=0;
        int candelLength=listOfFilteredData.size()/granularity;
        List<CandleSeriesData> singleCandel=null;
        List<CandleSeriesData> singleCandelFiltered = null;
        double closingPrice=0;

        for(int i=0;i<candelLength;i++){

            singleCandel = listOfFilteredData.stream().skip(skip)
                    .limit(granularity).collect(Collectors.toList());

            singleCandelFiltered=singleCandel.stream().filter(n->n.getSymbol()==symbol).collect(Collectors.toList());

            List<Double> singleCandelPrice= singleCandelFiltered.stream().map(n -> n.getPrice()).collect(Collectors.toList());

            List<LocalDateTime> singleCandelTime= singleCandelFiltered.stream().map(n -> n.getTime()).collect(Collectors.toList());

            double lowPrice = Collections.min(singleCandelPrice);
            double highPrice = Collections.max(singleCandelPrice);
            double sumPrice = singleCandelPrice.stream().reduce(0d, (acc, element) -> acc + element);
            double openingPrice;

            if(skip==0){
                openingPrice =singleCandelPrice.get(0);
                closingPrice =singleCandelPrice.get(singleCandelPrice.size()-1);
            }
            else{
                openingPrice=closingPrice;
                closingPrice =singleCandelPrice.get(singleCandelPrice.size()-1);
            }

            listOfCandleDTO.add(new CandleDTO(singleCandelTime.get(0), lowPrice, highPrice, openingPrice, closingPrice, sumPrice));
            skip+=granularity;
        }

        return listOfCandleDTO ;
    }

    public static void main(String[] args) {
        GenerateCandleSeries  GenerateCandleSeries=new GenerateCandleSeries();

         GenerateCandleSeries.candleSeriesDataGenerator();

        List<CandleDTO> candleDTOList= GenerateCandleSeries.getCandles("USD",LocalDateTime
                .parse("2021-09-21T10:00:00.00"),LocalDateTime
                .parse("2021-09-21T14:59:59.256"),30);

        int count=1;

        for(int i=0;i<candleDTOList.size();i++){
            System.out.println("Candle"+count+" Time: "+candleDTOList.get(i).getTime()+"  Highest Price:"+candleDTOList.get(i).getHigh()+"  Lowest Price:"+candleDTOList.get(i).getLow()+"  Opening Price:"+candleDTOList.get(i).getOpen()+" Closing Price:"+candleDTOList.get(i).getClose()+ " Volume: "+candleDTOList.get(i).getVolume());
            count++;
        }
    }
}
