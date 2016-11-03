package projectx.controllers;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
 
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.richfaces.model.ChartDataModel;
import org.richfaces.model.PlotClickEvent;
import org.richfaces.model.StringChartDataModel;

 
@ManagedBean
@ViewScoped
@Named("test")
public class TestController implements Serializable{
 
    private static final long serialVersionUID = 506812532467786866L;
    List<Product> products;
    List<ProfitRecord> profit;
    StringChartDataModel pie;
    String msg;
 
    @PostConstruct
    public void init() {
        msg = "no server-side event";
 
        Product redGnome = new Product("RED_GNOME");
        redGnome.put(1990, 19.1);
        redGnome.put(1991, 18.9);
        redGnome.put(1992, 18.6);
        redGnome.put(1993, 19.5);
        redGnome.put(1994, 19.5);
        redGnome.put(1995, 19.3);
        redGnome.put(1996, 19.4);
        redGnome.put(1997, 19.7);
        redGnome.put(1998, 19.5);
        redGnome.put(1999, 19.5);
        redGnome.put(2000, 20.0);
 
        Product jacuzi = new Product("Jacuzi");
        jacuzi.put(1990, 2.2);
        jacuzi.put(1991, 2.2);
        jacuzi.put(1992, 2.3);
        jacuzi.put(1993, 2.4);
        jacuzi.put(1994, 2.6);
        jacuzi.put(1995, 2.7);
        jacuzi.put(1996, 2.8);
        jacuzi.put(1997, 2.8);
        jacuzi.put(1998, 2.7);
        jacuzi.put(1999, 2.6);
        jacuzi.put(2000, 2.7);
 
        Product hotTubTimeMachine = new Product("HotTub Time Machine");
        hotTubTimeMachine.put(1990, 9.4);
        hotTubTimeMachine.put(1991, 9.4);
        hotTubTimeMachine.put(1992, 9.5);
        hotTubTimeMachine.put(1993, 9.4);
        hotTubTimeMachine.put(1994, 9.9);
        hotTubTimeMachine.put(1995, 9.9);
        hotTubTimeMachine.put(1996, 10.1);
        hotTubTimeMachine.put(1997, 10.1);
        hotTubTimeMachine.put(1998, 9.7);
        hotTubTimeMachine.put(1999, 9.5);
        hotTubTimeMachine.put(2000, 9.7);
 
        Product hoe = new Product("Hoe");
        hoe.put(1992, 14);
        hoe.put(1993, 12.8);
        hoe.put(1994, 10.9);
        hoe.put(1995, 10.5);
        hoe.put(1996, 10.4);
        hoe.put(1997, 10);
        hoe.put(1998, 9.6);
        hoe.put(1999, 9.7);
        hoe.put(2000, 9.8);
 
        products = new LinkedList<Product>();
        products.add(redGnome);
        products.add(jacuzi);
        products.add(hotTubTimeMachine);
        products.add(hoe);
 
        profit = new LinkedList<ProfitRecord>();
        profit.add(new ProfitRecord("Red Gnome", 188217, 2995787, 12500746));
        profit.add(new ProfitRecord("Jacuzi", 830931, 3726848, 3669259));
        profit.add(new ProfitRecord("HotTub Time Machine", 71568, 1640091, 4258274));
        profit.add(new ProfitRecord("Hoe", 27205, 955563, 2417812));
 
        pie = new StringChartDataModel(ChartDataModel.ChartType.pie);
        pie.put("January", 2995787);
        pie.put("February", 188217);
        pie.put("March", 12500746);
    }
 
    public String getMsg() {
        return msg;
    }
 
    public List<Product> getProducts() {
        return products;
    }
 
    public List<ProfitRecord> getProfit() {
        return profit;
    }
 
    public StringChartDataModel getPie() {
        return pie;
    }
 
    public void handler(PlotClickEvent event) {
        if (event.getSeriesIndex() >= 0) {
            msg = event.toString();
        }
    }
 
    public class Product {
        private final String name;
        // CO2 production year-> metric tons per capita
        private final List<Record> data;
 
        public Product(String name) {
            this.name = name;
            this.data = new LinkedList<Record>();
        }
 
        public void put(int year, double tons) {
            this.data.add(new Record(year, tons));
        }
 
        public List<Record> getData() {
            return data;
        }
 
        public String getName() {
            return name;
        }
 
        public class Record {
            private final int year;
            private final double tons;
 
            public Record(int year, double tons) {
                this.year = year;
                this.tons = tons;
            }
 
            public double getTons() {
                return tons;
            }
 
            public int getYear() {
                return year;
            }
        }
    }
 
    public class ProfitRecord {
        private final String product;
        private final int jan;
        private final int feb;
        private final int march;
 
        public ProfitRecord(String product, int jan, int feb, int march) {
            this.product = product;
            this.jan = jan;
            this.feb = feb;
            this.march = march;
        }
 
        public String getProduct() {
            return product;
        }
 
        public int getJan() {
            return jan;
        }
 
        public int getFeb() {
            return feb;
        }
 
        public int getMarch() {
            return march;
        }
    }


}
