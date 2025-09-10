package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tig extends tkv {
    public tiv a = null;

    @Override // defpackage.tiv
    public final Object a(tml tmlVar) {
        tiv tivVar = this.a;
        if (tivVar != null) {
            return tivVar.a(tmlVar);
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }
}
