package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ulm implements Iterable, ukd {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ulm(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.b;
        Object obj = this.a;
        return i != 0 ? new ufz((float[]) obj) : new ulp((ulq) obj);
    }
}
