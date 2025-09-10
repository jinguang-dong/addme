package defpackage;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ovw implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ovw(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, pau] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, poe] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, pnx] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, pau] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, pau] */
    /* JADX WARN: Type inference failed for: r5v31, types: [android.view.ViewTreeObserver$OnDrawListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, pau] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                Object obj = this.a;
                owu owuVar = (owu) obj;
                ((ovx) obj).d(Long.valueOf(((Long) (owuVar.e != null ? owuVar.e : ((ovx) obj).d)).longValue() + ((pmd) this.b).a));
                break;
            case 1:
                ((ovx) this.a).d(this.b);
                break;
            case 2:
                ((oul) this.a).a(((ovx) this.b).d);
                break;
            case 3:
                this.a.a(this.b);
                break;
            case 4:
                ((owc) this.a).a.c.a(this.b);
                break;
            case 5:
                this.a.a(this.b);
                break;
            case 6:
                this.a.a(this.b);
                break;
            case 7:
                ((pew) this.b).a.l((pdo) this.a);
                break;
            case 8:
                ((pew) this.a).a.a(this.b);
                break;
            case 9:
                ((pew) this.a).a.dV(this.b);
                break;
            case 10:
                ((pew) this.a).a.dT(this.b);
                break;
            case 11:
                Object obj2 = this.a;
                String strConcat = obj2.toString().concat("#invokeListeners-non-direct");
                pfd pfdVar = (pfd) obj2;
                pbn pbnVar = pfdVar.c;
                pbnVar.f(strConcat);
                for (pdm pdmVar : pfdVar.g) {
                    String strA = pdmVar.a();
                    if (rnt.V(strA)) {
                        strA = ojl.bJ(pdmVar.getClass());
                    }
                    Object obj3 = this.b;
                    pbnVar.f(strA);
                    pdmVar.d((phc) obj3);
                    pbnVar.g();
                }
                pbnVar.g();
                break;
            case 12:
                Object obj4 = this.b;
                qfz qfzVar = (qfz) obj4;
                qfzVar.b = true;
                while (qfzVar.b) {
                    try {
                        Runnable runnable = (Runnable) ((qfz) obj4).a.take();
                        if (runnable != null) {
                            runnable.run();
                        }
                    } catch (InterruptedException unused) {
                        Log.w("BlockingEventLoop", "Event loop on " + String.valueOf(Thread.currentThread()) + " interrupted.");
                    }
                }
                Object obj5 = this.a;
                ArrayBlockingQueue arrayBlockingQueue = qfzVar.a;
                ArrayList arrayList = new ArrayList(arrayBlockingQueue.size());
                arrayBlockingQueue.drainTo(arrayList);
                ((qfy) obj5).a.i(arrayList);
                break;
            case 13:
                ((qtn) this.b).b.d.a(6, ((qna) this.a).a);
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((View) this.a).getViewTreeObserver().removeOnDrawListener(this.b);
                break;
            case 15:
                try {
                    ske.U(this.b);
                    break;
                } catch (Exception e) {
                    Log.w("FlagStore", "Failed to store account on flag read for: " + ((qzm) this.a).c + " which may lead to stale flags.", e);
                    return;
                }
            case 16:
                try {
                    ske.U(this.b);
                    break;
                } catch (Exception e2) {
                    Log.w("FlagStore", "Failed to register flag update listener on flag read for: " + ((qzm) this.a).c + " which may lead to stale flags.", e2);
                    return;
                }
            default:
                Map mapA = qzs.a(((qxf) this.a).c);
                Object obj6 = this.b;
                if (!mapA.containsKey(obj6)) {
                    Log.e("FilePhenotypeFlags", a.bw((String) obj6, "Config package ", " cannot use FILE backing without declarative registration. See go/phenotype-android-integration#phenotype for more information. This will lead to stale flags."));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ovw(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public ovw(ovx ovxVar, oul oulVar, int i) {
        this.c = i;
        this.a = oulVar;
        this.b = ovxVar;
    }

    public ovw(qfy qfyVar, qfz qfzVar, int i) {
        this.c = i;
        this.b = qfzVar;
        this.a = qfyVar;
    }
}
