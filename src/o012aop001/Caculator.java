package o012aop001;

import org.springframework.stereotype.Component;

/**
 * Created by liguohua on 4/7/16.
 */
@Component
public class Caculator {
    public double add(int i, int j) {
        return i + j;
    }

    public double sub(int i, int j) {
        return i - j;
    }

    public double mul(int i, int j) {
        return i * j;
    }

    public double div(int i, int j) {
        return i / j;
    }
}
