package vagueobjects.ir.lda.online.persistence;

import vagueobjects.ir.lda.online.matrix.Matrix;

public class LDAModel {

    private final int K;
    private final int D;
    private final int W;
    private final double alpha;
    private final double eta;
    private final double tau0;
    private double kappa;
    private int batchCount;
    private Matrix lambda;

    public LDAModel(
            int K,
            int D,
            int W,
            double alpha,
            double eta,
            double tau0,
            double kappa,
            int batchCount,
            Matrix lambda
    ) {
        this.K = K;
        this.D = D;
        this.W = W;
        this.alpha = alpha;
        this.eta = eta;
        this.tau0 = tau0;
        this.kappa = kappa;
        this.batchCount = batchCount;
        this.lambda = lambda;
    }

    public int getK() {
        return K;
    }

    public int getD() {
        return D;
    }

    public int getW() {
        return W;
    }

    public double getAlpha() {
        return alpha;
    }

    public double getEta() {
        return eta;
    }

    public double getTau0() {
        return tau0;
    }

    public double getKappa() {
        return kappa;
    }

    public int getBatchCount() {
        return batchCount;
    }

    public Matrix getLambda() {
        return lambda;
    }
}
