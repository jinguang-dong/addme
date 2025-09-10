package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ehf extends elq {
    final /* synthetic */ elq a;

    public ehf(elq elqVar) {
        this.a = elqVar;
    }

    @Override // defpackage.elq
    public final /* bridge */ /* synthetic */ Object a(elp elpVar) {
        Float f = (Float) this.a.a(elpVar);
        if (f == null) {
            return null;
        }
        return Float.valueOf(f.floatValue() * 2.55f);
    }
}
