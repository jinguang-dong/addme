package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ita {
    public final ldi a;
    public final iby b;
    public final AtomicBoolean c;
    public final boolean d;
    public final int e;
    public final itg f;

    public ita() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ita) {
            ita itaVar = (ita) obj;
            if (this.a.equals(itaVar.a) && this.b.equals(itaVar.b) && this.c.equals(itaVar.c) && this.f.equals(itaVar.f) && this.d == itaVar.d && this.e == itaVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.f.hashCode();
        return this.e ^ (((iHashCode * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003);
    }

    public final String toString() {
        itg itgVar = this.f;
        AtomicBoolean atomicBoolean = this.c;
        iby ibyVar = this.b;
        return "{" + this.a.toString() + ", " + ibyVar.toString() + ", " + atomicBoolean.toString() + ", " + itgVar.toString() + ", " + this.d + ", " + this.e + "}";
    }

    public ita(ldi ldiVar, iby ibyVar, AtomicBoolean atomicBoolean, itg itgVar, boolean z, int i) {
        this.a = ldiVar;
        this.b = ibyVar;
        this.c = atomicBoolean;
        this.f = itgVar;
        this.d = z;
        this.e = i;
    }
}
