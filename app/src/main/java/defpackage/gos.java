package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gos {
    final int a;
    public int b;
    public int c;
    public int d;
    public long e;

    public gos(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gos)) {
            return false;
        }
        gos gosVar = (gos) obj;
        return this.a == gosVar.a && this.b == gosVar.b && this.c == gosVar.c && this.d == gosVar.d && this.e == gosVar.e;
    }
}
