package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qwf {
    public final AtomicReference a = new AtomicReference();
    private final AtomicBoolean b = new AtomicBoolean(false);
    private volatile oet c;

    public final syu a(Context context, boolean z, boolean z2) {
        if (!z) {
            return ske.M(true);
        }
        Boolean bool = (Boolean) this.a.get();
        if (bool != null) {
            return ske.M(bool);
        }
        oet oetVar = this.c;
        if (oetVar == null) {
            synchronized (this) {
                oetVar = this.c;
                if (oetVar == null) {
                    oetVar = new oet(context, new opj());
                    this.c = oetVar;
                }
            }
        }
        if (z2 && !this.b.getAndSet(true)) {
            ogn ognVarAE = ojl.aE(new opl() { // from class: qwe
                @Override // defpackage.opl
                public final void a() {
                    this.a.a.set(null);
                }
            }, oetVar.f, opl.class.getSimpleName());
            opc opcVar = new opc(oetVar, ognVarAE, ((opj) oetVar.d).b, 0);
            ojb ojbVar = new ojb(oetVar, 4);
            ogs ogsVar = new ogs();
            ogsVar.a = opcVar;
            ogsVar.b = ojbVar;
            ogsVar.c = ognVarAE;
            ogsVar.d = new odl[]{opb.a};
            ogsVar.f = 4507;
            oetVar.l(ogsVar.a());
        }
        syn synVarV = syn.v(qpt.av(oetVar.j()));
        rvu rvuVarA = rsx.a(new qcj(this, 5));
        sxo sxoVar = sxo.a;
        return swf.i(swz.i(synVarV, rvuVarA, sxoVar), Throwable.class, new qpl(7), sxoVar);
    }
}
