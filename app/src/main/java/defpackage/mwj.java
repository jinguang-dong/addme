package defpackage;

import j$.util.Collection;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mwj {
    public final sbp a;
    public final muy b;
    public final int c;
    public final int d;

    public mwj() {
        throw null;
    }

    public static mwj a(sbp sbpVar) {
        muy muyVarA = muy.NO_CROPPED;
        int size = sbpVar.size();
        for (int i = 0; i < size; i++) {
            mwk mwkVar = (mwk) sbpVar.get(i);
            if (mwkVar.a.a.a()) {
                muyVarA = muyVarA.a(mwkVar.b);
            }
        }
        return new mwj(sbpVar, muyVarA, (int) Collection.EL.stream(sbpVar).filter(new hsj(15)).count(), (int) Collection.EL.stream(sbpVar).filter(new hsj(16)).count());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mwj) {
            mwj mwjVar = (mwj) obj;
            if (ujp.aH(this.a, mwjVar.a) && this.b.equals(mwjVar.b) && this.c == mwjVar.c && this.d == mwjVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003);
    }

    public final String toString() {
        muy muyVar = this.b;
        return "{" + this.a.toString() + ", " + muyVar.toString() + ", " + this.c + ", " + this.d + "}";
    }

    public mwj(sbp sbpVar, muy muyVar, int i, int i2) {
        sbpVar.getClass();
        this.a = sbpVar;
        muyVar.getClass();
        this.b = muyVar;
        this.c = i;
        this.d = i2;
    }
}
