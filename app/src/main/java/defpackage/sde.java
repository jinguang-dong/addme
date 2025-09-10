package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sde extends sgb {
    final /* synthetic */ rvu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sde(Iterator it, rvu rvuVar) {
        super(it);
        this.a = rvuVar;
    }

    @Override // defpackage.sgb
    public final Object a(Object obj) {
        return this.a.apply(obj);
    }
}
