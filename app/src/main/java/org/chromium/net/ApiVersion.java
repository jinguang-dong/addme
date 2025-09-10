package org.chromium.net;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ApiVersion {
    private static final int API_LEVEL = 34;
    private static final String CRONET_VERSION = "136.0.7091.2";
    private static final String LAST_CHANGE = "44ebe40ee63791a3db1d894e82ea8996ae1e6763-refs/branch-heads/7091@{#5}";
    private static final int MIN_COMPATIBLE_API_LEVEL = 3;

    private ApiVersion() {
    }

    public static int getApiLevel() {
        return 3;
    }

    public static String getCronetVersion() {
        return CRONET_VERSION;
    }

    public static String getCronetVersionWithLastChange() {
        return "136.0.7091.2@".concat("44ebe40e");
    }

    public static String getLastChange() {
        return LAST_CHANGE;
    }

    public static int getMaximumAvailableApiLevel() {
        return API_LEVEL;
    }
}
