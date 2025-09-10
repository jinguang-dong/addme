package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class scb extends sbp {
    final /* synthetic */ sbp a;

    public scb(sbp sbpVar) {
        this.a = sbpVar;
    }

    @Override // defpackage.sbe
    public final boolean fA() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return ((Map.Entry) this.a.get(i)).getValue();
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
