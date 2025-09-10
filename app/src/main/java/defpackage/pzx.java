package defpackage;

import android.content.Context;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pzx implements qai {
    public final Context a;
    public final pwt b;
    private final Executor c;
    private final puu d;
    private final ren e;

    public pzx(Context context, pwt pwtVar, ren renVar, Executor executor, puu puuVar) {
        this.a = context;
        this.b = pwtVar;
        this.e = renVar;
        this.c = executor;
        this.d = puuVar;
    }

    @Override // defpackage.qai
    public final syu a() {
        return this.e.b(new pzw(3), this.c);
    }

    public final syu b(pzj pzjVar, int i) {
        syu syuVarB;
        int i2 = 1;
        if (i > pzjVar.d) {
            return ske.M(true);
        }
        pzj pzjVarA = pzj.a(i);
        int iOrdinal = pzjVarA.ordinal();
        int i3 = 4;
        if (iOrdinal == 1) {
            ren renVar = this.e;
            pzu pzuVar = new pzu(this, 6);
            Executor executor = this.c;
            syuVarB = qdp.e(renVar.b(pzuVar, executor)).f(new pzw(4), executor).b(IOException.class, new pzu(this, i2), executor);
        } else if (iOrdinal != 2) {
            syuVarB = ske.L(new UnsupportedOperationException("Upgrade to version " + pzjVarA.name() + "not supported!"));
        } else {
            ren renVar2 = this.e;
            pzu pzuVar2 = new pzu(this, 3);
            Executor executor2 = this.c;
            syuVarB = qdp.e(renVar2.b(pzuVar2, executor2)).f(new pzw(2), executor2).b(IOException.class, new pzu(this, i3), executor2);
        }
        return qsz.n(syuVarB, new pzv(this, i, pzjVar, 0), this.c);
    }

    @Override // defpackage.qai
    public final syu c() {
        AtomicReference atomicReference = new AtomicReference(new ArrayList());
        hve hveVar = new hve(this, atomicReference, 19);
        ren renVar = this.e;
        Executor executor = this.c;
        return qsz.m(renVar.b(hveVar, executor), new pzu(atomicReference, 5), executor);
    }

    @Override // defpackage.qai
    public final syu d() {
        Context context = this.a;
        if (!prh.k(context)) {
            int i = qbu.a;
            prh.m(context);
            prh.l(context, pzj.a(this.d.h()));
            return ske.M(false);
        }
        pzj pzjVarA = pzj.a(this.d.h());
        pwt pwtVar = this.b;
        pzj pzjVarJ = prh.j(context, pwtVar);
        int i2 = pzjVarA.d;
        int i3 = pzjVarJ.d;
        if (i2 == i3) {
            return ske.M(true);
        }
        if (i2 >= i3) {
            qdp qdpVarE = qdp.e(b(pzjVarA, i3 + 1));
            pzn pznVar = new pzn(this, pzjVarA, 2, null);
            Executor executor = this.c;
            return qdpVarE.d(Exception.class, pznVar, executor).g(new pzn(this, pzjVarA, 3, null), executor);
        }
        qbu.e("%s Cannot migrate back from value %s to %s. Clear everything!", "ProtoDataStoreSharedFilesMetadata", pzjVarJ, pzjVarA);
        new Exception("Downgraded file key from " + String.valueOf(pzjVarJ) + " to " + String.valueOf(pzjVarA) + ".");
        pwtVar.a();
        prh.l(context, pzjVarA);
        return ske.M(false);
    }

    @Override // defpackage.qai
    public final syu e(pvp pvpVar) {
        return qsz.m(f(new sfm(pvpVar)), new pzu(pvpVar, 0), sxo.a);
    }

    @Override // defpackage.qai
    public final syu f(scn scnVar) {
        return qsz.m(this.e.a(), new hve(this, scnVar, 17), sxo.a);
    }

    @Override // defpackage.qai
    public final syu g(pvp pvpVar) {
        pzu pzuVar = new pzu(qsp.H(pvpVar, this.a, this.b), 2);
        Executor executor = this.c;
        return qdp.e(this.e.b(pzuVar, executor)).f(new pzw(1), executor).b(IOException.class, new pzw(0), executor);
    }

    @Override // defpackage.qai
    public final syu h(pvp pvpVar, pvr pvrVar) {
        hve hveVar = new hve(qsp.H(pvpVar, this.a, this.b), pvrVar, 18, null);
        Executor executor = this.c;
        return qdp.e(this.e.b(hveVar, executor)).f(new pzg(19), executor).b(IOException.class, new pzg(20), executor);
    }

    public final void i(pzj pzjVar) {
        Context context = this.a;
        pwt pwtVar = this.b;
        if (prh.j(context, pwtVar).d == pzjVar.d || prh.l(context, pzjVar)) {
            return;
        }
        qbu.b(mn.i(pzjVar, "Failed to commit migration version to disk. Fail to set target version to ", "."));
        new Exception(mn.i(pzjVar, "Fail to set target version ", "."));
        pwtVar.a();
    }
}
