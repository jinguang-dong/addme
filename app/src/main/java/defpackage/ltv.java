package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum ltv {
    OFF(0),
    ON(1);

    public final int c;

    ltv(int i) {
        this.c = i;
    }

    public static ltv a(int i) {
        return i != 0 ? i != 1 ? OFF : ON : OFF;
    }
}
