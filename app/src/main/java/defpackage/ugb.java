package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ugb implements Iterable, ukd {
    private final uif a;

    public ugb(uif uifVar) {
        this.a = uifVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Iterator] */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ugc(this.a.a());
    }
}
