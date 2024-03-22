package task1;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
public class ArcsinFuncTest {
        double eps = 0.1;

        @ParameterizedTest
        @ValueSource(doubles = {-1.1, -10.0})
        public void negativeCheck(double value) {
            Assertions.assertEquals(Math.asin(value), ArcsinFunction.arcsin(value), eps);
        }

        @ParameterizedTest
        @ValueSource(doubles = {-0.85, -0.9})
        public void negativeCloseCheck(double value) {
            Assertions.assertEquals(Math.asin(value), ArcsinFunction.arcsin(value), eps);
        }

        @ParameterizedTest
        @ValueSource(doubles = {-0.01, -0.1})
        public void negativeZeroCloseCheck(double value) {
            Assertions.assertEquals(Math.asin(value), ArcsinFunction.arcsin(value), eps);
        }

        @ParameterizedTest
        @ValueSource(doubles = {0.01, 0.1})
        public void positiveZeroCloseCheck(double value) {
            Assertions.assertEquals(Math.asin(value), ArcsinFunction.arcsin(value), eps);
        }

        @ParameterizedTest
        @ValueSource(doubles = {0.85, 0.99})
        public void positiveCloseCheck(double value) {
            Assertions.assertEquals(Math.asin(value), ArcsinFunction.arcsin(value), eps);
        }

        @ParameterizedTest
        @ValueSource(doubles = {1.1, 10.0})
        public void positiveCheck(double value) {
            Assertions.assertEquals(Math.asin(value), ArcsinFunction.arcsin(value), eps);
        }

        @ParameterizedTest
        @ValueSource(doubles = {0.0, 0.001, -0.001})
        public void zeroCheck(double value) {
            Assertions.assertEquals(Math.asin(value), ArcsinFunction.arcsin(value), eps);
        }

        @ParameterizedTest
        @ValueSource(doubles = {1.0, 1.0 + 0.001, 1.0 - 0.001})
        public void plusOneCheck(double value) {
            Assertions.assertEquals(Math.asin(value), ArcsinFunction.arcsin(value), eps);
        }

        @ParameterizedTest
        @ValueSource(doubles = {-1.0, -1.0 - 0.001, -1.0 + 0.001})
        public void minusOneCheck(double value) {
            Assertions.assertEquals(Math.asin(value), ArcsinFunction.arcsin(value), eps * 5);
        }

        @ParameterizedTest
        @ValueSource(doubles = {2.0, -2.0})
        public void moreOneCheck(double value) {
            Assertions.assertEquals(Math.asin(value), ArcsinFunction.arcsin(value), eps * 5);
        }


    }

