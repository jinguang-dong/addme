package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dki {
    public final int a;
    private final int b;

    public dki() {
        this(0, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dki)) {
            return false;
        }
        dki dkiVar = (dki) obj;
        if (this.a != dkiVar.a) {
            return false;
        }
        int i = dkiVar.b;
        return true;
    }

    public final int hashCode() {
        return this.a * 31;
    }

    public /* synthetic */ dki(int i, int i2) {
        this.a = i | (i2 & 1);
        this.b = 0;
    }
}
