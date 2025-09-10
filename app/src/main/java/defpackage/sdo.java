package defpackage;

import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sdo extends sgc {
    final /* synthetic */ sdp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sdo(sdp sdpVar, ListIterator listIterator) {
        super(listIterator);
        this.a = sdpVar;
    }

    @Override // defpackage.sgb
    public final Object a(Object obj) {
        return this.a.b.apply(obj);
    }
}
