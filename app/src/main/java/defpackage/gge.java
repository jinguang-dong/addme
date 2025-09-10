package defpackage;

import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.facedeblur.deeprestore.jni.DeepRestoreNative;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class gge implements paq {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ gge(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, pdn] */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.lang.Object, java.util.concurrent.ScheduledFuture] */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.lang.Object, png] */
    /* JADX WARN: Type inference failed for: r4v25, types: [java.lang.Object, png] */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.lang.Object, png] */
    /* JADX WARN: Type inference failed for: r4v29, types: [java.lang.Object, syu] */
    /* JADX WARN: Type inference failed for: r4v30, types: [java.lang.Object, syu] */
    /* JADX WARN: Type inference failed for: r4v42, types: [java.lang.Object, owq] */
    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        switch (this.b) {
            case 0:
                ggf ggfVar = (ggf) this.a;
                ovt.a(ggfVar.e, ggfVar.c, "OneCameraLifetime");
                return;
            case 1:
                ((AtomicLong) ((lta) this.a).b).set(-1L);
                return;
            case 2:
                ((AmbientMode.AmbientController) this.a).g();
                return;
            case 3:
                this.a.close();
                return;
            case 4:
                Object obj = this.a;
                synchronized (((gkq) obj).b) {
                    ExecutorService executorService = ((gkq) obj).c;
                    if (executorService != null) {
                        executorService.shutdown();
                        ((gkq) obj).c = null;
                    }
                }
                return;
            case 5:
                ((gqm) this.a).a = null;
                return;
            case 6:
                rwc rwcVar = ((gqx) this.a).a;
                if (rwcVar.h()) {
                    ((mlw) rwcVar.c()).k(mlv.QR_GLEAMING);
                    return;
                }
                return;
            case 7:
                this.a.cancel(false);
                return;
            case 8:
                ?? r4 = this.a;
                ((gtx) r4).q.h(r4);
                return;
            case 9:
                ((gux) this.a).b();
                return;
            case 10:
                ?? r42 = this.a;
                ((gue) r42).o.h(r42);
                return;
            case 11:
                ?? r43 = this.a;
                ((gun) r43).i.h(r43);
                return;
            case 12:
                ((gux) this.a).b();
                return;
            case 13:
                this.a.cancel(false);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                this.a.cancel(false);
                return;
            case 15:
                Object obj2 = this.a;
                synchronized (obj2) {
                    if (((hkn) obj2).d.h()) {
                        DeepRestoreNative.releaseHandle(((Long) ((hkn) obj2).d.c()).longValue());
                    }
                    ((hkn) obj2).d = rvk.a;
                }
                return;
            case 16:
                this.a.a(lcy.WIDE);
                return;
            case 17:
                hti htiVar = (hti) this.a;
                htiVar.m.g(htiVar.R);
                htiVar.e.O = null;
                htiVar.Q = null;
                htiVar.q.c();
                htiVar.K.o = null;
                htiVar.f(false);
                htiVar.B = false;
                htiVar.w = null;
                htiVar.v = null;
                return;
            case 18:
                Object obj3 = this.a;
                ((hti) obj3).J.a(obj3);
                return;
            case 19:
                hti htiVar2 = (hti) this.a;
                htiVar2.x = null;
                htiVar2.O = null;
                return;
            default:
                hto htoVar = (hto) this.a;
                htoVar.b().dismiss();
                htoVar.g = null;
                return;
        }
    }
}
