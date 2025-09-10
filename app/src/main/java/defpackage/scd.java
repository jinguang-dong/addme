package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class scd extends sbe {
    public final sbv a;

    public scd(sbv sbvVar) {
        this.a = sbvVar;
    }

    @Override // defpackage.sbe, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        sca scaVar = new sca(this);
        while (scaVar.hasNext()) {
            if (obj.equals(scaVar.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.sbe
    public final boolean fA() {
        throw null;
    }

    @Override // defpackage.sbe
    /* renamed from: fz */
    public final sgj listIterator() {
        return new sca(this);
    }

    @Override // defpackage.sbe, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: iterator */
    public final /* synthetic */ Iterator listIterator() {
        return new sca(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.sbe
    public final sbp v() {
        return new scb(this.a.entrySet().v());
    }

    @Override // defpackage.sbe
    public Object writeReplace() {
        return new scc(this.a);
    }
}
