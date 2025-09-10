package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class orb implements opw {
    private final nwj a;

    public orb(nwj nwjVar) {
        this.a = nwjVar;
    }

    @Override // defpackage.opw
    public final void b(ord ordVar) {
        oet.k(ordVar);
    }

    @Override // defpackage.opw
    public final void c(ord ordVar) {
        oet.k(ordVar);
    }

    @Override // defpackage.opw
    public final void d(ord ordVar) {
        oet.k(ordVar);
    }

    @Override // defpackage.opw
    public final void e(ord ordVar) {
        oet.k(ordVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((orb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
