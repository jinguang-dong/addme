package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class nrq implements cwr, ujl {
    private final /* synthetic */ uiq a;

    public nrq(uiq uiqVar) {
        this.a = uiqVar;
    }

    @Override // defpackage.ujl
    public final uep a() {
        return this.a;
    }

    @Override // defpackage.cwr
    public final /* synthetic */ void b(Object obj) {
        this.a.a(obj);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof cwr) && (obj instanceof ujl)) {
            return a.ao(this.a, ((ujl) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
