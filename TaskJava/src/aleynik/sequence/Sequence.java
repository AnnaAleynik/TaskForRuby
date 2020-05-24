package aleynik.sequence;

import java.util.ArrayList;

public class Sequence {
    private ArrayList<Number> sequence = new ArrayList<>();
    private Number number;
    private boolean isEmpty;

    public Sequence() {
        number = new Number(1);
    }

    public Sequence(int amount) {
        try {
            if (amount > 0) {
                isEmpty = false;
                number = new Number(1);
                this.give(amount);
            }
            if (amount == 0) {
                isEmpty = true;
            }
            if (amount < 0) {
                isEmpty = true;
                throw new IndexOutOfBoundsException("You can't do this sequence!");
            }
        } catch (IndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }

    }

    private void give(int amount) {
        for (int i = 0; i < amount; i++) {
            this.sequence.add(number);
            number = number.get();
        }
    }

    public String print(int index) {
        try {
            return sequence.get(index).toString();
        } catch (IndexOutOfBoundsException ex) {
            return "No such item in the sequence.";
        }
    }


    @Override
    public String toString() {
        if (isEmpty) return "Empty sequence.";

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < sequence.size(); i++) {
            result.append(sequence.get(i)).append("\n");
        }
        return result.toString();
    }

}
