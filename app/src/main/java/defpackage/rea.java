package defpackage;

import androidx.wear.ambient.AmbientModeSupport;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rea implements sxi {
    public final List a;
    public final Executor b;

    public rea(List list, Executor executor) {
        this.a = list;
        this.b = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.sxi
    public final /* bridge */ /* synthetic */ syu a(Object obj) {
        List list = this.a;
        AmbientModeSupport.AmbientController ambientController = (AmbientModeSupport.AmbientController) obj;
        int i = ((sex) list).c;
        ArrayList arrayList = new ArrayList(i);
        sgk it = ((sbp) list).iterator();
        while (it.hasNext()) {
            reh rehVar = (reh) it.next();
            arrayList.add(ske.Q(new ozi(rehVar, 15), rehVar.b));
        }
        sxi sxiVarC = rsx.c(new pzv(this, arrayList, i, 2));
        rrp rrpVar = ((ren) ambientController.a).b;
        sxo sxoVar = sxo.a;
        return swz.j(qsy.f(swz.j(ske.N(rrpVar.c()), rsx.c(new qab(ambientController, sxiVarC, sxoVar, 7, null)), sxoVar)), rsx.c(new pzv(this, i, arrayList, 3)), sxoVar);
    }
}
