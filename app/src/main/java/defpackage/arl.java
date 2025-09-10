package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arl implements PointerInputEventHandler {
    final /* synthetic */ aqy a;
    final /* synthetic */ aqx b;

    public arl(aqy aqyVar, aqx aqxVar) {
        this.a = aqyVar;
        this.b = aqxVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(bqc bqcVar, uhb uhbVar) {
        Object objU = e.u(bqcVar, new gwf(this.a, new ogk(bqcVar.m()), this.b, (uhb) null, 1), uhbVar);
        return objU == uhi.a ? objU : ufg.a;
    }
}
