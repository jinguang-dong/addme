package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class enm {
    private static final eny a = new eny("CamDvcInfChar");

    public abstract int a();

    public abstract boolean b();

    public abstract boolean c();

    public final int d(int i) {
        return e(i, false);
    }

    protected final int e(int i, boolean z) {
        if (i % 90 != 0) {
            enz.a(a, "Provided display orientation is not divisible by 90");
        } else {
            if (i >= 0 && i <= 270) {
                if (c()) {
                    int iA = (a() + i) % 360;
                    return z ? (360 - iA) % 360 : iA;
                }
                if (b()) {
                    return ((a() - i) + 360) % 360;
                }
                enz.a(a, "Camera is facing unhandled direction");
                return 0;
            }
            enz.a(a, "Provided display orientation is outside expected range");
        }
        return 0;
    }
}
