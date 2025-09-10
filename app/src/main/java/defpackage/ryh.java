package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ryh extends seh {
    final /* synthetic */ ryi a;

    public ryh(ryi ryiVar) {
        this.a = ryiVar;
    }

    @Override // defpackage.seh
    public final sed a() {
        return this.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.a.c();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.b();
    }
}
