package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sct extends scl {
    private final Comparator e;

    public sct(Comparator comparator) {
        comparator.getClass();
        this.e = comparator;
    }

    @Override // defpackage.scl, defpackage.sbd
    public final /* synthetic */ void d(Object obj) {
        super.d(obj);
    }

    @Override // defpackage.scl
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final scv g() {
        scv scvVarO = scv.O(this.e, this.b, this.a);
        this.b = scvVarO.size();
        this.c = true;
        return scvVarO;
    }

    public final void m(Object obj) {
        super.d(obj);
    }

    public final void n(Object... objArr) {
        super.i(objArr);
    }
}
