package aleynik.sequence;

import java.util.ArrayList;

public class Number {

    private ArrayList<Integer> value = new ArrayList<>();

    public Number() {
    }

    public Number(int n) {
        value.add(n);
    }

    public Number get() {
        Number number = new Number();
        int e = this.value.get(0);
        int sum = 1;
        for (int i = 1; i < value.size(); i++) {
            if (e == this.value.get(i)) {
                sum++;
            } else {
                number.value.add(sum);
                number.value.add(e);
                sum = 1;
            }
            e = this.value.get(i);
        }
        number.value.add(sum);
        number.value.add(e);
        return number;
    }

    @Override
    public String toString() {
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < value.size(); i++) {
            line.append(value.get(i));
        }
        return line.toString();
    }

}
