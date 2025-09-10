package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tcb {
    public static final tcb a = new tcb();
    public static final tcb b = new tcb("kWarning");
    public static final tcb c = new tcb("kCritical");
    public static final tcb d = new tcb("kFatal");
    public static final tcb e = new tcb("kUnknown");
    public static final tcb f = new tcb("kCold");
    public static final tcb g = new tcb("kLight");
    public static final tcb h = new tcb("kModerate");
    public static final tcb i = new tcb("kShutdown");
    private static int k = 0;
    public final int j;
    private final String l;

    private tcb() {
        this.l = "kNormal";
        this.j = 0;
        k = 1;
    }

    public final String toString() {
        return this.l;
    }

    private tcb(String str) {
        this.l = str;
        int i2 = k;
        k = i2 + 1;
        this.j = i2;
    }
}
