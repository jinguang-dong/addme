package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum oxi {
    MPEG_4(2, 0, ppo.f),
    WEBM(9, 1, ppo.h),
    THREE_GPP(1, 2, ppo.g);

    public final int d;
    public final int e;
    public final ppo f;

    oxi(int i, int i2, ppo ppoVar) {
        this.d = i;
        this.e = i2;
        this.f = ppoVar;
    }

    public static boolean a(oxy oxyVar) {
        int i = oxyVar.e;
        return i == 2 || i == 1;
    }
}
