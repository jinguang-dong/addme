package defpackage;

import android.widget.FrameLayout;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class khc implements paq {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ khc(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, syw] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.concurrent.ExecutorService] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, java.util.concurrent.ExecutorService] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object, poj] */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r4v42, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.util.concurrent.ExecutorService] */
    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        switch (this.b) {
            case 0:
                this.a.shutdown();
                return;
            case 1:
                Object obj = this.a;
                synchronized (((khb) obj).a) {
                    ?? r1 = ((khb) obj).e;
                    if (r1 != 0) {
                        r1.shutdownNow();
                    }
                    ((khb) obj).e = null;
                    ((khb) obj).b = true;
                }
                return;
            case 2:
                this.a.shutdownNow();
                return;
            case 3:
                ((FrameLayout) ((krj) this.a).G.d).setImportantForAccessibility(1);
                return;
            case 4:
                ((kzo) this.a).d();
                return;
            case 5:
                this.a.shutdownNow();
                return;
            case 6:
                ((lbg) this.a).d();
                return;
            case 7:
                this.a.close();
                return;
            case 8:
                Object obj2 = this.a;
                synchronized (obj2) {
                    ((lpm) obj2).c = false;
                }
                return;
            case 9:
                this.a.cancel(false);
                return;
            case 10:
                dv dvVar = ((mgh) this.a).c;
                if (dvVar != null) {
                    dvVar.dismiss();
                    return;
                }
                return;
            case 11:
                Object obj3 = this.a;
                ((mgt) obj3).a.a(mhg.INACTIVE);
                return;
            case 12:
                rwc rwcVar = ((mhe) this.a).k;
                if (rwcVar.h()) {
                    ((mlw) rwcVar.c()).l(mlv.TAXI);
                    return;
                }
                return;
            case 13:
                moy moyVar = ((mow) this.a).a;
                moyVar.a.execute(new mub(moyVar, 1, null));
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((hjb) ((mpe) this.a).b.e.a()).h();
                return;
            case 15:
                this.a.a("torch");
                return;
            case 16:
                ((msi) this.a).b = null;
                return;
            case 17:
                ((msi) this.a).a = null;
                return;
            case 18:
                ((mte) this.a).r(false);
                return;
            case 19:
                ((mtm) this.a).k.i = null;
                return;
            default:
                ((mwp) this.a).a();
                return;
        }
    }

    public khc(mow mowVar, int i) {
        this.b = i;
        this.a = mowVar;
    }
}
