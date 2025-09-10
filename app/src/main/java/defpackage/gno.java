package defpackage;

import android.os.ParcelFileDescriptor;
import com.google.android.apps.camera.jni.gxp.Caan.yoGAhrpjU;
import com.google.android.play.core.install.rwb.GAQqzWiWWcYOgy;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gno {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public gno(cxb cxbVar, cxp cxpVar, cxy cxyVar) {
        this.a = cxbVar;
        this.b = cxpVar;
        this.c = cxyVar;
        this.d = new cqh(null);
    }

    public final synchronized gcc a(ParcelFileDescriptor parcelFileDescriptor) {
        return new gbx(parcelFileDescriptor);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.concurrent.ExecutorService] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, pbn] */
    public final synchronized gcc b(ppo ppoVar, lsw lswVar) {
        ppoVar.getClass();
        return new gby(lswVar, lswVar.a(ppoVar.k), this.c, this.d);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.concurrent.ExecutorService] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, pbn] */
    public final synchronized gcc c(ppo ppoVar, lsw lswVar) {
        return new gby(lswVar, lswVar.b(ppoVar.k), this.c, this.d);
    }

    public final synchronized gcc d(ppo ppoVar) {
        ppoVar.getClass();
        return c(ppoVar, ((qqq) this.b).p(System.currentTimeMillis(), hqp.NONE, "NS"));
    }

    public final synchronized gcc e(ppo ppoVar) {
        ppoVar.getClass();
        return b(ppoVar, ((qqq) this.b).w(System.currentTimeMillis(), false));
    }

    public final synchronized gcc f(ppo ppoVar) {
        ppoVar.getClass();
        return c(ppoVar, ((qqq) this.b).w(System.currentTimeMillis(), true));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, uem] */
    public final Executor g(Executor executor) {
        ftj ftjVar;
        Object obj = this.a;
        synchronized (obj) {
            ftjVar = new ftj(executor, this.c, (AtomicBoolean) this.d, obj);
        }
        return ftjVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, rww] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, rww] */
    public final syu i(int i) {
        return i + (-1) != 0 ? (syu) this.d.fr() : (syu) this.c.fr();
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [cxp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Map] */
    public final cxm j(ukx ukxVar, String str) {
        cxm cxmVarB;
        synchronized (this.d) {
            Object obj = this.a;
            cxmVarB = ((cxb) obj).b(str);
            if (ukxVar.d(cxmVarB)) {
                Object obj2 = this.b;
                if (obj2 instanceof cxr) {
                    cxmVarB.getClass();
                    ((cxr) obj2).e(cxmVarB);
                }
                cxmVarB.getClass();
            } else {
                cxz cxzVar = new cxz((cxy) this.c);
                cxzVar.b(cxs.a, str);
                cxmVarB = cpe.f(this.b, ukxVar, cxzVar);
                cxmVarB.getClass();
                cxm cxmVar = (cxm) ((cxb) obj).a.put(str, cxmVarB);
                if (cxmVar != null) {
                    cxmVar.fe();
                }
            }
        }
        return cxmVarB;
    }

    public final ArrayList k(Object obj) {
        return (ArrayList) ((aaa) this.d).get(obj);
    }

    public final void l(Object obj) {
        aaa aaaVar = (aaa) this.d;
        if (aaaVar.containsKey(obj)) {
            return;
        }
        aaaVar.put(obj, null);
    }

    public gno() {
        this.c = new cnk(10);
        this.d = new aaa();
        this.a = new ArrayList();
        this.b = new HashSet();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, pbn] */
    public final syu h(final uem uemVar, Executor executor, String str) {
        ?? r2 = this.a;
        final pbs pbsVar = new pbs(executor, r2, str);
        return ske.R(new sxh() { // from class: fqo
            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Collection] */
            @Override // defpackage.sxh
            public final syu a() {
                ?? A = uemVar.a();
                A.getClass();
                return ske.I(Collection.EL.stream(A).map(new gwl(pbsVar, 1)).toList());
            }
        }, new pbs(executor, r2, str.concat(GAQqzWiWWcYOgy.EWDvGbcZqcMMxdR)));
    }

    public final void m(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (!hashSet.contains(obj)) {
            hashSet.add(obj);
            ArrayList arrayList2 = (ArrayList) ((aaa) this.d).get(obj);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    m(arrayList2.get(i), arrayList, hashSet);
                }
            }
            hashSet.remove(obj);
            arrayList.add(obj);
            return;
        }
        throw new RuntimeException(yoGAhrpjU.uvPfxYoCKq);
    }

    public gno(uem uemVar, uem uemVar2, uem uemVar3, final Executor executor, final Executor executor2, out outVar, pbn pbnVar) {
        this.b = outVar;
        this.a = pbnVar;
        final uem uemVarBw = qpt.bw(uemVar);
        final uem uemVarBw2 = qpt.bw(uemVar2);
        final uem uemVarBw3 = qpt.bw(uemVar3);
        int i = 1;
        this.d = rnt.y(new kpm(this, 2, new rww() { // from class: fqp
            @Override // defpackage.rww
            public final Object fr() {
                gno gnoVar = this.d;
                uem uemVar4 = uemVarBw2;
                Executor executor3 = executor;
                return ske.J(gnoVar.h(uemVar4, executor3, "Warmup.Prewarm"), gnoVar.h(uemVarBw, executor3, "Warmup.MaybePrewarm"));
            }
        }, i));
        this.c = rnt.y(new kpm(this, i, new rww() { // from class: fqq
            @Override // defpackage.rww
            public final Object fr() {
                gno gnoVar = this.f;
                uem uemVar4 = uemVarBw3;
                Executor executor3 = executor2;
                return ske.J(gnoVar.h(uemVarBw2, executor, "Warmup.Prewarm.Activity"), gnoVar.h(uemVar4, executor3, "Warmup.FI.Activity"), gnoVar.h(uemVarBw, executor3, "Warmup.MaybePrewarm.Activity"));
            }
        }, i));
    }

    public gno(und undVar, uiq uiqVar, uiu uiuVar, uiu uiuVar2) {
        this.a = undVar;
        this.c = uiuVar2;
        this.b = ukc.P(Integer.MAX_VALUE, 0, null, 6);
        this.d = new pfl((char[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
        uol uolVar = (uol) undVar.c().get(uol.c);
        if (uolVar != null) {
            uolVar.o(new bft(uiqVar, this, uiuVar, 2));
        }
    }

    public gno(hbj hbjVar, uem uemVar) {
        this.d = new AtomicBoolean(false);
        this.a = new Object();
        this.b = hbjVar;
        this.c = uemVar;
    }

    public gno(uem uemVar, uem uemVar2, uem uemVar3, uem uemVar4) {
        uemVar.getClass();
        this.b = uemVar;
        uemVar2.getClass();
        this.a = uemVar2;
        uemVar3.getClass();
        this.c = uemVar3;
        uemVar4.getClass();
        this.d = uemVar4;
    }

    public gno(nnq nnqVar, qqq qqqVar, ExecutorService executorService, pbn pbnVar) {
        qqqVar.getClass();
        pbnVar.getClass();
        this.a = nnqVar;
        this.b = qqqVar;
        this.c = executorService;
        this.d = pbnVar;
    }
}
