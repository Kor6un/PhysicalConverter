package xernja;

import domain.Essence;
import domain.Speed;
import services.Converter;

import java.util.List;

public class MultipleConverter extends Converter {
    private List<Speed> speeds;
    public MultipleConverter(Essence essence) {
        super(essence);

    }


}
