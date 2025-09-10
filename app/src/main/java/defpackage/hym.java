package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class hym implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ hym(ihn ihnVar, gnt gntVar, luj lujVar, krj krjVar, owq owqVar, nas nasVar, int i) {
        this.g = i;
        this.b = ihnVar;
        this.e = gntVar;
        this.f = lujVar;
        this.a = krjVar;
        this.d = owqVar;
        this.c = nasVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, pbn] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, pbn] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, tzj] */
    /* JADX WARN: Type inference failed for: r5v9, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, syu] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, syu] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object, uem] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = this.g;
        if (i == 0) {
            Object obj = this.f;
            Object obj2 = this.e;
            ojl.ck(this.a, new hyr(this.b, this.c, this.d, (Context) obj2, (String) obj, 2), sxo.a);
            return;
        }
        if (i == 1) {
            paq paqVarG = ((hls) ((rwc) this.c).c()).g();
            our ourVar = (our) this.b;
            ourVar.d(paqVarG);
            fhe fheVarA = ((kic) this.d).a();
            pae paeVar = (pae) this.f;
            ourVar.d(fheVarA.a(paeVar));
            this.a.a(((fgs) this.e).a(paeVar));
            return;
        }
        if (i == 2) {
            Object obj3 = this.f;
            Object obj4 = this.e;
            ojl.ck(this.a, new hyr(this.b, this.c, this.d, (Context) obj4, (String) obj3, 1), sxo.a);
            return;
        }
        int i2 = 3;
        if (i == 3) {
            if (ihn.f((gnt) this.e, (luj) this.f, (krj) this.a, this.d)) {
                ((nas) this.c).d();
            }
            ((ihn) this.b).a(false);
            return;
        }
        int i3 = 5;
        int i4 = 4;
        if (i == 4) {
            ?? r0 = this.c;
            Object obj5 = this.b;
            Object obj6 = this.e;
            paq paqVarDK = this.f.dK(new fcd(obj6, obj5, (Object) r0, i4), this.d);
            our ourVar2 = (our) this.a;
            ourVar2.d(paqVarDK);
            ourVar2.d(new iew(r0, i3));
            ((icd) obj6).b(r0);
            return;
        }
        if (i == 5) {
            Object obj7 = this.b;
            lzp lzpVar = (lzp) ((lzr) obj7).b().c();
            rwc rwcVarJ = rwc.j((hpa) this.a.a());
            ?? r4 = this.f;
            paq paqVarA = lzpVar.a(rwcVarJ, rwc.j((joc) r4.a()), (rwc) this.c.a());
            our ourVar3 = (our) this.e;
            ourVar3.d(paqVarA);
            ourVar3.d(((joc) r4.a()).b(new jqf(obj7, i2), (Executor) this.d.a()));
            return;
        }
        Context context = (Context) this.e;
        boolean zG = prt.g(context);
        ?? r5 = this.f;
        Object obj8 = this.b;
        if (zG) {
            ((qvr) obj8).a(r5);
        } else {
            prt.c(context, new qej((qvr) obj8, (tzj) r5, (Executor) this.c, 2));
        }
        qvr qvrVar = (qvr) obj8;
        if (qvrVar.b) {
            ?? r02 = this.d;
            Object obj9 = this.a;
            if (r02 == 0) {
                tpc tpcVarM = uyz.a.m();
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                uyz uyzVar = (uyz) tpcVarM.b;
                uyzVar.d = 2;
                uyzVar.b |= 4;
                qvrVar.a = ((qvu) obj9).a((uyz) tpcVarM.l());
                return;
            }
            try {
                ((qvr) obj8).a = ((qvu) obj9).a((uyz) r02.a());
            } catch (Throwable th) {
                ((sgt) ((sgt) qnj.a.c().i(th)).M((char) 5793)).s("Couldn't get sampling strategy");
                tpc tpcVarM2 = uyz.a.m();
                if (!tpcVarM2.b.C()) {
                    tpcVarM2.o();
                }
                tph tphVar = tpcVarM2.b;
                uyz uyzVar2 = (uyz) tphVar;
                uyzVar2.b = 2 | uyzVar2.b;
                uyzVar2.c = 1L;
                if (!tphVar.C()) {
                    tpcVarM2.o();
                }
                uyz uyzVar3 = (uyz) tpcVarM2.b;
                uyzVar3.d = 3;
                uyzVar3.b |= 4;
                qvrVar.a = ((qvu) obj9).a((uyz) tpcVarM2.l());
            }
        }
    }

    public /* synthetic */ hym(our ourVar, owf owfVar, icd icdVar, ixm ixmVar, owq owqVar, Executor executor, int i) {
        this.g = i;
        this.a = ourVar;
        this.f = owfVar;
        this.e = icdVar;
        this.b = ixmVar;
        this.c = owqVar;
        this.d = executor;
    }

    public /* synthetic */ hym(our ourVar, rwc rwcVar, uem uemVar, pae paeVar, fgs fgsVar, owq owqVar, int i) {
        this.g = i;
        this.b = ourVar;
        this.c = rwcVar;
        this.d = uemVar;
        this.f = paeVar;
        this.e = fgsVar;
        this.a = owqVar;
    }

    public /* synthetic */ hym(our ourVar, uem uemVar, uem uemVar2, uem uemVar3, uem uemVar4, uem uemVar5, int i) {
        this.g = i;
        this.e = ourVar;
        this.b = uemVar;
        this.a = uemVar2;
        this.f = uemVar3;
        this.c = uemVar4;
        this.d = uemVar5;
    }

    public /* synthetic */ hym(qvr qvrVar, Context context, tzj tzjVar, Executor executor, qvu qvuVar, uem uemVar, int i) {
        this.g = i;
        this.b = qvrVar;
        this.e = context;
        this.f = tzjVar;
        this.c = executor;
        this.a = qvuVar;
        this.d = uemVar;
    }

    public /* synthetic */ hym(syu syuVar, pbn pbnVar, uem uemVar, uem uemVar2, Context context, String str, int i) {
        this.g = i;
        this.a = syuVar;
        this.b = pbnVar;
        this.c = uemVar;
        this.d = uemVar2;
        this.e = context;
        this.f = str;
    }
}
