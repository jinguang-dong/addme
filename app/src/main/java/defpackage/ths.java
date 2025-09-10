package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum ths implements tpk {
    DETECTION_SKIP_REASON_UNKNOWN(0),
    DETECTION_SKIP_REASON_NONE(1),
    DETECTION_SKIP_REASON_DISABLED(2),
    DETECTION_SKIP_REASON_NOT_INITIALIZED(3),
    DETECTION_SKIP_REASON_NOT_PRIMARY(4),
    DETECTION_SKIP_REASON_WRONG_ZOOM(5),
    g(6),
    DETECTION_SKIP_REASON_INVALID_RESULT(7),
    DETECTION_SKIP_REASON_BAD_THERMALS(8),
    DETECTION_SKIP_REASON_MISSING_INFO(9),
    DETECTION_SKIP_REASON_BAD_REGION_SIZE(10),
    DETECTION_SKIP_REASON_GCAM_DECISION(11);

    public static final thr n = new Object() { // from class: thr
    };
    public final int m;

    ths(int i) {
        this.m = i;
    }

    public static ths b(int i) {
        switch (i) {
            case 0:
                return DETECTION_SKIP_REASON_UNKNOWN;
            case 1:
                return DETECTION_SKIP_REASON_NONE;
            case 2:
                return DETECTION_SKIP_REASON_DISABLED;
            case 3:
                return DETECTION_SKIP_REASON_NOT_INITIALIZED;
            case 4:
                return DETECTION_SKIP_REASON_NOT_PRIMARY;
            case 5:
                return DETECTION_SKIP_REASON_WRONG_ZOOM;
            case 6:
                return g;
            case 7:
                return DETECTION_SKIP_REASON_INVALID_RESULT;
            case 8:
                return DETECTION_SKIP_REASON_BAD_THERMALS;
            case 9:
                return DETECTION_SKIP_REASON_MISSING_INFO;
            case 10:
                return DETECTION_SKIP_REASON_BAD_REGION_SIZE;
            case 11:
                return DETECTION_SKIP_REASON_GCAM_DECISION;
            default:
                return null;
        }
    }

    @Override // defpackage.tpk
    public final int a() {
        return this.m;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.m);
    }
}
