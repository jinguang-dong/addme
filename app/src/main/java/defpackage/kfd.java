package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kfd implements mcw {
    private static final sgv a = sgv.g("kfd");
    private final pbn b;
    private final hfy c;
    private final pkc d;
    private final hbj e;

    public kfd(pkc pkcVar, pbn pbnVar, hfy hfyVar, hbj hbjVar) {
        this.d = pkcVar;
        this.b = pbnVar;
        this.c = hfyVar;
        this.e = hbjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pbn pbnVar = this.b;
        pbnVar.f("#cacheDeviceInfo");
        hfy hfyVar = this.c;
        pkc pkcVar = this.d;
        pjr pjrVarA = hfyVar.a(pkcVar, this.e, pka.BACK);
        if (pjrVarA != null) {
            kgw kgwVarF = pkcVar.f(pjrVarA);
            kgwVarF.z();
            Iterator it = kgwVarF.C().iterator();
            while (it.hasNext()) {
                pkcVar.f((pjr) it.next()).z();
            }
            kgwVarF.A();
            kgwVarF.B();
        } else {
            ((sgt) a.c().M(3268)).s("No back-facing camera found.");
        }
        pbnVar.g();
    }
}
