package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class esn implements Iterable {
    public final List a;

    public esn(List list) {
        this.a = list;
    }

    final int a() {
        return this.a.size();
    }

    final esn b() {
        return new esn(new ArrayList(this.a));
    }

    final boolean c() {
        return this.a.isEmpty();
    }

    final boolean d(ezt eztVar) {
        return this.a.contains(new esm(eztVar, fap.b));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }

    public esn() {
        this(new ArrayList(2));
    }
}
