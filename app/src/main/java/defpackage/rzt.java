package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rzt extends seh {
    final /* synthetic */ rzu a;

    public rzt(rzu rzuVar) {
        this.a = rzuVar;
    }

    @Override // defpackage.seh
    public final sed a() {
        return this.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.a.e();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.b().g().size();
    }
}
