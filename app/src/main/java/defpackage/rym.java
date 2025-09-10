package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rym extends rzu {
    final /* synthetic */ ryn a;

    public rym(ryn rynVar) {
        this.a = rynVar;
    }

    @Override // defpackage.rzu
    /* renamed from: c */
    public final sfo b() {
        return this.a;
    }

    @Override // defpackage.rzu
    public final Iterator e() {
        return this.a.o();
    }

    @Override // defpackage.rzu, defpackage.sad, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return ujp.at(this.a.n());
    }
}
