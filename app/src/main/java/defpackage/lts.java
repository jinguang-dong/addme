package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum lts {
    DEFAULT(0),
    HI_RES(1);

    public final int c;

    lts(int i) {
        this.c = i;
    }

    public static lts a(int i) {
        return i != 0 ? i != 1 ? DEFAULT : HI_RES : DEFAULT;
    }
}
