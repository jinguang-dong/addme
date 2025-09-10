package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kbz {
    public final boolean a;
    public final Object b;

    public kbz(String str, boolean z) {
        this.b = str;
        this.a = z;
    }

    public final kbz a(kbz kbzVar) {
        if (this.a) {
            return this;
        }
        Object obj = this.b;
        if (obj == null) {
            obj = kbzVar.b;
        }
        Float.floatToRawIntBits(Float.NaN);
        return new kbz((String) obj, kbzVar.a);
    }

    public kbz(ltr ltrVar, boolean z) {
        this.b = ltrVar;
        this.a = z;
    }

    public kbz(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public /* synthetic */ kbz(String str, int i) {
        this(1 == (i & 1) ? null : str, false);
    }

    public kbz() {
        this(ltr.OFF);
    }

    public kbz(ltr ltrVar) {
        this(ltrVar, false);
    }
}
