package test.lambda;

import java.util.function.Predicate;

/**
 * @author Moritz Halbritter
 */
class AlwaysFalse implements Predicate<String> {

    @Override
    public boolean test(String value) {
        return false;
    }
}
