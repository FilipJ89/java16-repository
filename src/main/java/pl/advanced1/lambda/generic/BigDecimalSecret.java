package pl.advanced1.lambda.generic;

import java.math.BigDecimal;

public class BigDecimalSecret {

    private BigDecimal mySecret;

    public BigDecimalSecret(BigDecimal mySecret) {
        this.mySecret = mySecret;
    }

    public BigDecimal getMySecret() {
        return mySecret;
    }

    @Override
    public String toString() {
        return "BigDecimalSecret{" +
                "mySecret=" + mySecret +
                '}';
    }
}
