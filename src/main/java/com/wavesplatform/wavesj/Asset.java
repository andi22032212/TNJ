package com.wavesplatform.wavesj;

public abstract class Asset {
    /**
     * Constant used to represent WAVES token in asset transactions.
     */
    public static final String WAVES = "WAVES";
    
    public static final String NATA = "79jWQxTiV925jubY2c48vwJqVN2z1hU3rXX8uqdhuQnY";

    public static final long TOKEN = 100000000L;

    public static final long MILLI = 100000L;

    static String normalize(String assetId) {
        return assetId == null || assetId.isEmpty() ? Asset.WAVES : assetId;
    }

    static boolean isWaves(String assetId) {
        return WAVES.equals(normalize(assetId));
    }

    static String toJsonObject(String assetId) {
        return isWaves(assetId) ? null : assetId;
    }
}
