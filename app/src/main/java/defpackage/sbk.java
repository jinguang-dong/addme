package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sbk extends sbd {
    public sbk() {
        super(4);
    }

    @Override // defpackage.sbd
    public final /* synthetic */ void d(Object obj) {
        super.c(obj);
    }

    public final sbp g() {
        this.c = true;
        return sbp.g(this.a, this.b);
    }

    public final void h(Object obj) {
        super.c(obj);
    }

    public final void i(Object... objArr) {
        super.e(objArr);
    }

    public final void j(Iterable iterable) {
        super.f(iterable);
    }

    public final void k(Iterator it) {
        while (it.hasNext()) {
            super.c(it.next());
        }
    }

    public sbk(int i) {
        super(i);
    }
}
