package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum mly {
    UNKNOWN,
    OPTICAL_FLOW,
    GYRO,
    GPU_TEMPLATE,
    ML,
    HYBRID;

    public static mly a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? UNKNOWN : HYBRID : ML : GPU_TEMPLATE : GYRO : OPTICAL_FLOW;
    }
}
