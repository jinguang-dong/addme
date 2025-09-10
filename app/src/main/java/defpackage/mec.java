package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mec {
    public final int a;
    public final boolean b;
    public int c;

    public mec(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final int a() {
        int i = this.c;
        if (i == 0) {
            return 5;
        }
        if (i != 1) {
            return 4;
        }
        if (this.a == 0) {
            return this.b ? 2 : 1;
        }
        return 3;
    }
}
