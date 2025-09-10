package defpackage;

import java.util.AbstractMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sco extends sbp {
    final /* synthetic */ scp a;

    public sco(scp scpVar) {
        this.a = scpVar;
    }

    @Override // defpackage.sbe
    public final boolean fA() {
        return true;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        scs scsVar = this.a.a;
        return new AbstractMap.SimpleImmutableEntry(scsVar.a.d.get(i), scsVar.b.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.a.size();
    }

    @Override // defpackage.sbp, defpackage.sbe
    public Object writeReplace() {
        return super.writeReplace();
    }
}
