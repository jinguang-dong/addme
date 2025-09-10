package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class etj implements eto {
    int a;
    public Class b;
    private final etk c;

    public etj(etk etkVar) {
        this.c = etkVar;
    }

    @Override // defpackage.eto
    public final void a() {
        this.c.c(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof etj) {
            etj etjVar = (etj) obj;
            if (this.a == etjVar.a && this.b == etjVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a * 31;
        Class cls = this.b;
        return i + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "Key{size=" + this.a + "array=" + String.valueOf(this.b) + "}";
    }
}
