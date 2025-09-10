package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fpj {
    public final int a;
    public final fpa b;

    public fpj() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fpj) {
            fpj fpjVar = (fpj) obj;
            if (this.a == fpjVar.a && this.b.equals(fpjVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        return this.b.hashCode() ^ ((i ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "{" + this.a + ", " + this.b.toString() + "}";
    }

    public fpj(int i, fpa fpaVar) {
        this.a = i;
        fpaVar.getClass();
        this.b = fpaVar;
    }
}
