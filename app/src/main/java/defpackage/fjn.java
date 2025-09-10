package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fjn implements Closeable {
    public final tgh a;
    public final boolean b;
    private final sbp c;

    public fjn() {
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        sbp sbpVar = this.c;
        int size = sbpVar.size();
        for (int i = 0; i < size; i++) {
            ((Closeable) sbpVar.get(i)).close();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fjn) {
            fjn fjnVar = (fjn) obj;
            if (this.a.equals(fjnVar.a) && this.b == fjnVar.b && ujp.aH(this.c, fjnVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iJ;
        tgh tghVar = this.a;
        if (tghVar.C()) {
            iJ = tghVar.j();
        } else {
            int iJ2 = tghVar.aT;
            if (iJ2 == 0) {
                iJ2 = tghVar.j();
                tghVar.aT = iJ2;
            }
            iJ = iJ2;
        }
        return this.c.hashCode() ^ ((((iJ ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003);
    }

    public final String toString() {
        sbp sbpVar = this.c;
        return "{" + this.a.toString() + ", " + this.b + ", " + sbpVar.toString() + "}";
    }

    public fjn(tgh tghVar, boolean z, sbp sbpVar) {
        tghVar.getClass();
        this.a = tghVar;
        this.b = z;
        sbpVar.getClass();
        this.c = sbpVar;
    }
}
