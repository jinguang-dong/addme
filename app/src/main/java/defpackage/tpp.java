package defpackage;

import java.util.AbstractList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tpp extends AbstractList {
    private final tpn a;
    private final tpo b;

    public tpp(tpn tpnVar, tpo tpoVar) {
        this.a = tpnVar;
        this.b = tpoVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.b.a(this.a.d(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
