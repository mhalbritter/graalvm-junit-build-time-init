package test.lambda;

import java.util.function.Predicate;

enum EnumWithLambda {

    VALUE((s) -> false);

    // But this would work:
    // VALUE(new AlwaysFalse());

    EnumWithLambda(Predicate<String> predicate) {
    }

}

