package defpackage;

import android.view.View;
import androidx.coordinatorlayout.widget.pcp.OPuAVreQM;
import com.google.android.apps.camera.smarts.SmartsChipView;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class lsn implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ lsn(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ lsn(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, poj] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r7v20, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r7v21, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, java.util.function.Consumer] */
    /* JADX WARN: Type inference failed for: r7v39, types: [imj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v40, types: [java.lang.Object, jhh] */
    @Override // java.lang.Runnable
    public final void run() {
        rwc rwcVarJ;
        int i = 11;
        byte[] bArr = null;
        switch (this.c) {
            case 0:
                Object obj = this.b;
                ((lsp) this.a).b(new lji(obj, i), (ltd) obj);
                return;
            case 1:
                Object obj2 = this.a;
                List list = ((lsp) obj2).b;
                ?? r7 = this.b;
                synchronized (list) {
                    ((lsp) obj2).c(r7);
                }
                return;
            case 2:
                Object obj3 = this.b;
                ((lsp) this.a).b(new lji(obj3, 13), (ltd) obj3);
                return;
            case 3:
                Object obj4 = this.b;
                ((lsp) this.a).b(new lji(obj4, 10), (ltd) obj4);
                return;
            case 4:
                ((lsp) this.a).d(new lji(this.b, 15));
                return;
            case 5:
                ((lws) this.b).a.p((ojl) this.a);
                return;
            case 6:
                Object obj5 = this.b;
                lyr lyrVar = (lyr) this.a;
                lyrVar.b = (lzl) obj5;
                if (lyrVar.d) {
                    Object obj6 = lyrVar.h.b;
                    rnt.w(obj6, "SmartsChipViewController is not yet initialized", new Object[0]);
                    SmartsChipView smartsChipView = (SmartsChipView) obj6;
                    smartsChipView.f(lyrVar);
                    if (lyrVar.a()) {
                        Runnable runnable = lyrVar.b.i;
                        if (runnable != null) {
                            runnable.run();
                        }
                        smartsChipView.setVisibility(0);
                    } else {
                        smartsChipView.setVisibility(8);
                    }
                    smartsChipView.f = lyrVar.b.j;
                    return;
                }
                return;
            case 7:
                ((lzb) this.a).k();
                this.b.run();
                return;
            case 8:
                ((lzb) this.a).k();
                this.b.run();
                return;
            case 9:
                ((lzb) this.a).k();
                this.b.run();
                return;
            case 10:
                ((lzb) this.a).d = null;
                ?? r72 = this.b;
                if (r72 != 0) {
                    r72.run();
                    return;
                }
                return;
            case 11:
                ((lzd) this.a).e();
                this.b.run();
                return;
            case 12:
                ?? r0 = this.b;
                Object obj7 = this.a;
                synchronized (obj7) {
                    if (((lzp) obj7).g) {
                        ArrayList arrayList = new ArrayList();
                        ((lzp) obj7).g = false;
                        if (((lzp) obj7).h.h()) {
                            lnl lnlVarA = ((hpa) ((lzp) obj7).h.c()).a(r0.d());
                            if (!((lzp) obj7).i.h()) {
                                return;
                            } else {
                                rwcVarJ = rwc.j((Float) ((lzq) ((lzp) obj7).i.c()).a(r0, lnlVarA).e(((lzp) obj7).f.c()));
                            }
                        } else {
                            rwcVarJ = rvk.a;
                        }
                        arrayList.addAll(((lzp) obj7).j);
                        int size = arrayList.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            ((lzs) arrayList.get(i2)).n(rwcVarJ);
                        }
                        return;
                    }
                    return;
                }
            case 13:
                mca mcaVar = (mca) this.a;
                pbn pbnVar = mcaVar.g;
                pbnVar.f("SEController#provideAudio");
                ggg gggVar = mcaVar.n;
                gggVar.getClass();
                rul rulVar = (rul) gggVar.a;
                AtomicReference atomicReference = rulVar.b;
                rnt.M((atomicReference.get() == ruk.UNINITIALIZED || atomicReference.get() == ruk.INITIALIZING) ? false : true, "'initialize()' must be called before calling 'provideRawAudio()'.");
                rnt.M(atomicReference.get() != ruk.READY, OPuAVreQM.pmfbYOdrHEn);
                rnt.M((atomicReference.get() == ruk.SHUTTING_DOWN || atomicReference.get() == ruk.SHUT_DOWN) ? false : true, "Can't call 'provideRawAudio()' after calling 'shutdown()'.");
                rnt.M(rulVar.g.k == 2, "raw audio interface type is set to 'InputStream' - calls to provideRawAudio() aren't allowed in this mode.");
                if (atomicReference.get() == ruk.PAUSED) {
                    ((ruk) atomicReference.get()).name();
                } else {
                    rulVar.a((ByteBuffer) this.b);
                }
                pbnVar.g();
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((View) this.a).scrollTo(0, 0);
                ((mck) this.b).e = true;
                return;
            case 15:
                sod sodVarB = ((kwp) this.a).b();
                tpc tpcVar = (tpc) sodVarB.a(5, null);
                tpcVar.r(sodVarB);
                mdy mdyVar = (mdy) this.b;
                mdyVar.I(tpcVar);
                mdyVar.q.arriveAndDeregister();
                return;
            case 16:
                Object obj8 = this.b;
                mgm mgmVar = (mgm) obj8;
                ScheduledExecutorService scheduledExecutorService = mgmVar.a;
                ojl.ck(mgmVar.c.b(scheduledExecutorService), new fct(obj8, this.a, i, bArr), scheduledExecutorService);
                return;
            case 17:
                this.b.run();
                ((mle) this.a).i();
                return;
            case 18:
                ((mld) this.a).j.f(this.b);
                return;
            case 19:
                ((jgt) this.a).k(this.b);
                return;
            default:
                ((mwt) this.a).a((mwv) this.b);
                return;
        }
    }
}
