package defpackage;

import android.os.SystemClock;
import android.view.accessibility.AccessibilityManager;
import j$.util.Map;
import j$.util.Optional;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class fis implements paq {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ fis(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v17, types: [fel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.lang.Object, paq] */
    /* JADX WARN: Type inference failed for: r7v35, types: [java.lang.Object, mcz] */
    /* JADX WARN: Type inference failed for: r7v51, types: [java.lang.Object, java.util.concurrent.ScheduledFuture] */
    /* JADX WARN: Type inference failed for: r7v54, types: [java.lang.Object, java.util.concurrent.ScheduledFuture] */
    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        switch (this.b) {
            case 0:
                Object obj = this.a;
                synchronized (obj) {
                    our ourVar = ((fly) obj).e;
                    if (ourVar != null && !((fly) obj).f) {
                        Map.EL.forEach(((fly) obj).c, new glv(obj, 1));
                        tpc tpcVar = ((fly) obj).i;
                        if ((((spj) tpcVar.b).b & 1) != 0) {
                            tpc tpcVar2 = ((fly) obj).h;
                            spj spjVar = (spj) tpcVar.l();
                            if (!tpcVar2.b.C()) {
                                tpcVar2.o();
                            }
                            spk spkVar = (spk) tpcVar2.b;
                            spk spkVar2 = spk.a;
                            spjVar.getClass();
                            spkVar.h = spjVar;
                            spkVar.b |= 32;
                        }
                        tpc tpcVar3 = ((fly) obj).h;
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        if (!tpcVar3.b.C()) {
                            tpcVar3.o();
                        }
                        spk spkVar3 = (spk) tpcVar3.b;
                        spk spkVar4 = spk.a;
                        spkVar3.b |= 4;
                        spkVar3.e = jElapsedRealtime;
                        spk spkVar5 = (spk) tpcVar3.l();
                        ourVar.close();
                        ((fly) obj).f = true;
                        mdy mdyVar = ((fly) obj).g;
                        tpc tpcVarM = sod.a.m();
                        soc socVar = soc.COTTAGE_MODE_EVENT;
                        if (!tpcVarM.b.C()) {
                            tpcVarM.o();
                        }
                        tph tphVar = tpcVarM.b;
                        sod sodVar = (sod) tphVar;
                        sodVar.f = socVar.aJ;
                        sodVar.b |= 1;
                        if (!tphVar.C()) {
                            tpcVarM.o();
                        }
                        sod sodVar2 = (sod) tpcVarM.b;
                        spkVar5.getClass();
                        sodVar2.aD = spkVar5;
                        sodVar2.d |= Integer.MIN_VALUE;
                        mdyVar.I(tpcVarM);
                        return;
                    }
                    ((sgt) fly.a.b().M(271)).s("Mode not started, or already ended.");
                    return;
                }
            case 1:
                ((ffk) this.a).m = null;
                return;
            case 2:
                fiv fivVar = (fiv) this.a;
                fivVar.i.g(fivVar.p);
                return;
            case 3:
                this.a.c();
                return;
            case 4:
                this.a.close();
                return;
            case 5:
                ((fks) this.a).d(null);
                return;
            case 6:
                fpl fplVar = (fpl) this.a;
                fplVar.b.a(Optional.empty());
                fplVar.d(Optional.empty());
                return;
            case 7:
                ftv ftvVar = (ftv) this.a;
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = ftvVar.q;
                if (touchExplorationStateChangeListener != null) {
                    ftvVar.v.X(touchExplorationStateChangeListener);
                    return;
                }
                return;
            case 8:
                Object obj2 = this.a;
                ftv ftvVar2 = (ftv) obj2;
                ftvVar2.i(false);
                if (!((hne) ftvVar2.j.a()).d()) {
                    ftvVar2.f(false);
                }
                synchronized (obj2) {
                    ((ftv) obj2).r = false;
                }
                ftvVar2.n = nkw.UNINITIALIZED;
                return;
            case 9:
                ((ftv) this.a).p.close();
                return;
            case 10:
                ftv ftvVar3 = (ftv) this.a;
                ftvVar3.s.a.remove(ftvVar3.u);
                return;
            case 11:
                this.a.b();
                return;
            case 12:
                fwn fwnVar = (fwn) this.a;
                fwnVar.h.g(fwnVar.i);
                return;
            case 13:
                ujp.S(((fxa) this.a).c, null);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ujp.S(((fxa) this.a).d, null);
                return;
            case 15:
                ((fxa) this.a).g.a();
                return;
            case 16:
                ((fxm) this.a).D.c = 419430400L;
                return;
            case 17:
                this.a.cancel(false);
                return;
            case 18:
                ((fyq) this.a).b();
                return;
            case 19:
                this.a.cancel(false);
                return;
            default:
                ((gda) this.a).c.set(-1L);
                return;
        }
    }
}
