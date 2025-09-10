package defpackage;

import android.content.Context;
import android.net.Uri;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hcl {
    private static final sgv e = sgv.g("hcl");
    private static final pas f = new pas(1, 1);
    public final Context a;
    public final hcb b;
    public final hcf c;
    public final mfq d;
    private final lrp g;

    public hcl(Context context, hcb hcbVar, hcf hcfVar, lrp lrpVar, mfq mfqVar) {
        this.a = context;
        this.b = hcbVar;
        this.c = hcfVar;
        this.g = lrpVar;
        this.d = mfqVar;
    }

    public final hck a(ltd ltdVar, lsy lsyVar, ltg ltgVar, boolean z) {
        mfq mfqVar = this.d;
        tym tymVar = (tym) mfqVar.b.get(ltdVar);
        Object obj = tymVar != null ? tymVar.b : null;
        if (obj == null) {
            obj = f;
            ((sgt) e.c().M(1168)).G("Size not set for in-progress item %s with mediaStoreRecord %s. Assuming %s", ltdVar, lsyVar, obj);
        }
        lss lssVarA = this.g.a(ltdVar);
        Instant instantNow = lssVarA == null ? Instant.now() : Instant.ofEpochMilli(lssVarA.f());
        hcd hcdVarL = hce.l();
        hcdVarL.a = ltdVar;
        hcdVarL.c(instantNow);
        hcdVarL.e(instantNow);
        hcdVarL.b = (pas) obj;
        hcdVarL.d(z);
        hcdVarL.b(lsyVar.a);
        hcdVarL.i(lsyVar.b);
        return new hck(this.b, hcdVarL.a(), mfqVar, ltgVar);
    }

    public final hck b(Uri uri, ltd ltdVar, ltg ltgVar) {
        return new hck(this.b, this.c.c(uri, ltdVar), this.d, ltgVar);
    }
}
