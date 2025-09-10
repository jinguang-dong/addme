package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.camera.debug.shottracker.db.ShotDatabase;
import com.google.android.apps.camera.rectiface.Iqz.mPfBwqXsnpXI;
import com.google.ar.core.R;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class gts implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ gts(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ gts(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.lang.Object, pjo] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, poe] */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, syu] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r11v33, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, pbc] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, pdk] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, pbn] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, uem] */
    @Override // java.lang.Runnable
    public final void run() {
        poj pojVarK;
        int i = 15;
        switch (this.d) {
            case 0:
                Object obj = this.b;
                Object obj2 = this.a;
                ((gub) obj2).c((got) obj);
                obj2.getClass();
                ((our) this.c).d(new ffy(obj2, 12));
                return;
            case 1:
                String str = (String) this.a;
                String strConcat = str.concat("#get-all");
                frd frdVar = (frd) ((jba) this.b).a;
                frdVar.b.f(strConcat);
                Set set = (Set) this.c.a();
                frdVar.b.h(str.concat("#run-all"));
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    Runnable runnableC = frdVar.b.c("#run", (mcw) it.next());
                    runnableC.getClass();
                    new goq(runnableC, 1).run();
                }
                frdVar.b.g();
                return;
            case 2:
                this.a.f(ojl.bI(mPfBwqXsnpXI.aitFtYDDdUgN, false));
                ShotDatabase shotDatabase = (ShotDatabase) this.c.a();
                hep hepVar = (hep) this.b;
                hepVar.f = shotDatabase;
                her herVarW = hepVar.f.w();
                herVarW.getClass();
                hepVar.g = herVarW;
                hfa hfaVarX = hepVar.f.x();
                hfaVarX.getClass();
                hepVar.h = hfaVarX;
                return;
            case 3:
                int i2 = ((pao) this.a).e;
                hpj hpjVar = (hpj) this.b;
                lnl lnlVarA = lnl.a(this.c, hpjVar.b, i2);
                long j = lnlVarA.c;
                hpa hpaVar = hpjVar.a;
                hpaVar.a.o(hgc.l(j), lnlVarA);
                hpaVar.e(lnlVarA);
                return;
            case 4:
                Stream streamConcat = Stream.CC.concat(Collection.EL.stream((Set) ((tzu) this.a).a), Collection.EL.stream((Set) this.c.a()).map(new jkv(i)));
                Object obj3 = this.b;
                obj3.getClass();
                streamConcat.forEach(new gok(obj3, i));
                return;
            case 5:
                paq paqVarC = ((rnn) this.b).c();
                ((our) this.a).d(paqVarC);
                this.c.c(new iyz(paqVarC, i), sxo.a);
                return;
            case 6:
                Object obj4 = this.c;
                ?? r1 = this.a;
                Object obj5 = this.b;
                synchronized (((kpi) obj5).a) {
                    if (((kpi) obj5).b) {
                        kpk kpkVar = ((kpi) obj5).c;
                        poe poeVarD = r1.d();
                        if (poeVarD != null && kpkVar.g.a(r1)) {
                            pbn pbnVar = kpkVar.h;
                            pbnVar.f("extractImage");
                            lat latVar = kpkVar.e;
                            poj pojVarP = latVar.a(r1).p();
                            pbnVar.g();
                            if (pojVarP != null) {
                                synchronized (kpkVar.c) {
                                    String strB = latVar.b(poeVarD);
                                    if (strB != null) {
                                        pjr pjrVarB = pjr.b(strB);
                                        TimeUnit.MILLISECONDS.getClass();
                                        pbnVar.f("fork");
                                        pkf pkfVar = new pkf(pojVarP);
                                        poj pojVarK2 = pkfVar.k();
                                        if (pojVarK2 != null) {
                                            pbnVar.h("viewfinderFrameToFlashDecision");
                                            kpkVar.m.a(new kiy(pojVarK2, ske.M(poeVarD)));
                                        }
                                        pbnVar.h("process");
                                        kiy kiyVar = new kiy(new pkg(pkfVar), ske.M(poeVarD));
                                        kpd kpdVar = kpkVar.l;
                                        synchronized (kpdVar.d) {
                                            if (kpdVar.h) {
                                                ((sgt) kpd.a.c().M(3340)).s("Processor closed, ignoring.");
                                                kiyVar.close();
                                            } else if (kiyVar.m()) {
                                                pkf pkfVar2 = kpdVar.f;
                                                if (pkfVar2 != null) {
                                                    pkfVar2.l();
                                                }
                                                pkf pkfVar3 = new pkf(kiyVar);
                                                kpdVar.g = poeVarD;
                                                kpdVar.e = pjrVarB;
                                                if (((Boolean) kpdVar.c.fr()).booleanValue() && (pojVarK = pkfVar3.k()) != null) {
                                                    kpdVar.b.o(pjrVarB, pojVarK, poeVarD);
                                                }
                                                kpdVar.f = pkfVar3;
                                            } else {
                                                ((sgt) kpd.a.c().M(3341)).s("No Image Data! Ignoring the metering frames.");
                                                kiyVar.close();
                                            }
                                        }
                                        pbnVar.g();
                                    }
                                }
                            } else {
                                ((sgt) kpk.a.c().M(3366)).u("Null image for frame %s, ignoring.", ((pdo) obj4).c);
                            }
                        }
                    }
                }
                r1.close();
                return;
            case 7:
                this.c.execute(new img(this.a, ((ktv) this.b).a.a(), 17, null));
                return;
            case 8:
                rwc rwcVar = (rwc) this.c;
                if (rwcVar.h()) {
                    ((our) this.b).d(((qqq) rwcVar.c()).c.dK(new kso(this.a, 5), sxo.a));
                    return;
                }
                return;
            case 9:
                ((our) this.a).d(((qrh) this.b).b.dK(new ksq(this.c, 6), sxo.a));
                return;
            case 10:
                Set setA = ((tzz) this.c).a();
                setA.size();
                ((kuj) this.b).o(pdr.b(setA, this.a, "CameraStartupListeners"));
                return;
            case 11:
                iso.p();
                ((pit) this.c).k(this.a);
                return;
            default:
                mso msoVar = new mso((FrameLayout) ocq.k((View) this.b).c(R.id.module_layout));
                ojl.bl(msoVar);
                msh mshVar = (msh) this.a;
                mshVar.m = msoVar;
                mso msoVar2 = mshVar.m;
                msoVar2.k = (mwq) this.c;
                msoVar2.j = mshVar;
                return;
        }
    }

    public /* synthetic */ gts(Object obj, Object obj2, uem uemVar, int i) {
        this.d = i;
        this.b = obj;
        this.a = obj2;
        this.c = uemVar;
    }

    public /* synthetic */ gts(rwc rwcVar, our ourVar, pfu pfuVar, int i) {
        this.d = i;
        this.c = rwcVar;
        this.b = ourVar;
        this.a = pfuVar;
    }

    public /* synthetic */ gts(uem uemVar, pbn pbnVar, kuj kujVar, int i) {
        this.d = i;
        this.c = uemVar;
        this.a = pbnVar;
        this.b = kujVar;
    }

    public /* synthetic */ gts(uem uemVar, uem uemVar2, Executor executor, int i) {
        this.d = i;
        this.a = uemVar;
        this.c = uemVar2;
        this.b = executor;
    }
}
