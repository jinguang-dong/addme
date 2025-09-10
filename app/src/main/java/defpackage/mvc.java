package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mvc {
    public final mwj a;
    public final mwj b;
    public final int c;
    public final boolean d;
    public final muv e;

    public mvc() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mvc) {
            mvc mvcVar = (mvc) obj;
            if (this.a.equals(mvcVar.a) && this.b.equals(mvcVar.b) && this.c == mvcVar.c && this.d == mvcVar.d && this.e.equals(mvcVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() ^ ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003);
    }

    public final String toString() {
        muv muvVar = this.e;
        mwj mwjVar = this.b;
        return "{" + String.valueOf(this.a) + ", " + String.valueOf(mwjVar) + ", " + this.c + ", " + this.d + ", " + String.valueOf(muvVar) + "}";
    }

    public mvc(mwj mwjVar, mwj mwjVar2, int i, boolean z, muv muvVar) {
        this.a = mwjVar;
        this.b = mwjVar2;
        this.c = i;
        this.d = z;
        this.e = muvVar;
    }
}
