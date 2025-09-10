package defpackage;

import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sdm extends sgc {
    final /* synthetic */ sdn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sdm(sdn sdnVar, ListIterator listIterator) {
        super(listIterator);
        this.a = sdnVar;
    }

    @Override // defpackage.sgb
    public final Object a(Object obj) {
        return this.a.b.apply(obj);
    }
}
