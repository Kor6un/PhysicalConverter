package domain.service_models;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Distance extends Essence implements Comparable<Distance>  {
    private String unit;
    public Distance(Double value, String unit) {
        super(value);
        this.unit = unit;
    }

    @Override
    public String toString() {
        Locale locale = new Locale("en", "UK");
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(locale);

        String formatDouble = "##0.00";
        
        DecimalFormat decimalFormat = new DecimalFormat(formatDouble, decimalFormatSymbols);
        String format = decimalFormat.format(getValue());
        
        return  format + " m";
    }

    @Override
    public int compareTo(Distance o) {
        return Double.compare(getValue(), o.getValue());
    }
}

