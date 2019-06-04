package test;

import org.dalton.polyfun.Coef;
import org.dalton.polyfun.Polynomial;

import java.util.Random;

public class PolyPair {
    public polyfun.Polynomial polynomial_v6;
    public Polynomial polynomial_v11;

    /**
     * Default constructor creates a random pair of matching polynomials, one for v6 and one for v11.
     * Uses Coefs[] constructor to make Polynomials.
     */
    public PolyPair() {
        Random random = new Random();

        // Get random length from 2 - 6 (so they will be at least a 1 degree poly)
        int numCoefficients = random.nextInt(5) + 2;

        // Create 2 identical Coef arrays.
        polyfun.Coef[] oldCoefs = new polyfun.Coef[numCoefficients];
        Coef[] newCoefs = new Coef[numCoefficients];

        // Fill them using randomly selected numericalCoefficients.
        for (int j = 0; j < oldCoefs.length; j++) {
            double numericalCoefficient = random.nextDouble() * random.nextInt(10);
            oldCoefs[j] = new polyfun.Coef(numericalCoefficient);
            newCoefs[j] = new Coef(numericalCoefficient);
        }

        // Finally, create 2 (hopefully) identical Polynomials
        this.polynomial_v6 = new polyfun.Polynomial(oldCoefs);
        this.polynomial_v11 = new Polynomial(newCoefs);
    }

    /**
     * Construct with given numericalCoefficients array.
     * Uses double[] constructor to make Polynomials.
     */
    public PolyPair(double[] numericalCoefficients) {

        // Finally, create 2 (hopefully) identical Polynomials
        this.polynomial_v6 = new polyfun.Polynomial(numericalCoefficients);
        this.polynomial_v11 = new Polynomial(numericalCoefficients);
    }

    /**
     * Construct with given polyfun.Polynomial and Polynomial
     * Uses double[] constructor to make Polynomials.
     */
    public PolyPair(polyfun.Polynomial p6, Polynomial p11) {
        this.polynomial_v6 = p6;
        this.polynomial_v11 = p11;
    }
}
