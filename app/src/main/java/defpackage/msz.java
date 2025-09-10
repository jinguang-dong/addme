package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class msz implements PointerInputEventHandler {
    final /* synthetic */ ujx a;
    final /* synthetic */ uif b;

    public msz(ujx ujxVar, uif uifVar) {
        this.a = ujxVar;
        this.b = uifVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(bqc bqcVar, uhb uhbVar) throws Throwable {
        Object objI = ung.i(new msy(this.a, bqcVar, byi.bN(bqcVar), this.b, null), uhbVar);
        return objI == uhi.a ? objI : ufg.a;
    }
}
