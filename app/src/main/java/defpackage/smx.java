package defpackage;

import j$.util.Spliterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class smx {
    public final smu a = new smu();
    public final smu b = new smu();
    public final Spliterator c;
    public final Spliterator d;
    final /* synthetic */ smy e;

    public smx(smy smyVar) {
        this.e = smyVar;
        this.c = smyVar.a.spliterator();
        this.d = smyVar.b.spliterator();
    }

    public final boolean a() {
        return this.c.tryAdvance(this.a) && this.d.tryAdvance(this.b);
    }
}
