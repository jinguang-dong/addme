package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class scw extends sbp {
    final /* synthetic */ scx a;

    public scw(scx scxVar) {
        this.a = scxVar;
    }

    @Override // defpackage.sbe
    public final boolean fA() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.a.a(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.sbp, defpackage.sbe
    public Object writeReplace() {
        return super.writeReplace();
    }
}
