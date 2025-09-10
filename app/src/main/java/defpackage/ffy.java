package defpackage;

import android.graphics.RectF;
import android.os.Looper;
import android.util.Pair;
import j$.util.Optional;
import java.util.concurrent.ScheduledFuture;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ffy implements paq {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ffy(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, tzj] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r3v35, types: [java.lang.Object, syu] */
    /* JADX WARN: Type inference failed for: r3v38, types: [java.lang.Object, java.util.concurrent.ExecutorService] */
    /* JADX WARN: Type inference failed for: r3v39, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r3v40, types: [hwh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v41, types: [java.lang.Object, owq] */
    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        ScheduledFuture scheduledFuture;
        switch (this.b) {
            case 0:
                ((fgr) this.a.a()).a = new owi(new RectF());
                shl shlVar = shx.a;
                return;
            case 1:
                ((mlw) ((fbp) this.a).b.c()).l(mlv.FACE_TRACKING);
                return;
            case 2:
                ((hls) this.a).h();
                return;
            case 3:
                ((fgw) this.a).m();
                return;
            case 4:
                this.a.cancel(false);
                return;
            case 5:
                ((fvu) this.a).m(false);
                return;
            case 6:
                ((fvu) this.a).n(1);
                return;
            case 7:
                ((fvu) this.a).l(true);
                return;
            case 8:
                this.a.cancel(false);
                return;
            case 9:
                Object obj = this.a;
                synchronized (obj) {
                    ((gqk) obj).c = gqk.a;
                    scheduledFuture = ((gqk) obj).d;
                    if (scheduledFuture != null) {
                        ((gqk) obj).d = null;
                    } else {
                        scheduledFuture = null;
                    }
                }
                gqk.b(scheduledFuture);
                return;
            case 10:
                ((gqx) this.a).d = Optional.empty();
                return;
            case 11:
                grd grdVar = (grd) this.a;
                grdVar.a();
                grdVar.a = new grc() { // from class: gra
                    @Override // defpackage.grc
                    public final void j() {
                    }
                };
                return;
            case 12:
                ((gub) this.a).b();
                return;
            case 13:
                this.a.cancel(false);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((hla) this.a).b();
                return;
            case 15:
                this.a.shutdown();
                return;
            case 16:
                this.a.a(true);
                return;
            case 17:
                this.a.b();
                return;
            case 18:
                this.a.a(Float.valueOf(-999.0f));
                return;
            case 19:
                Object obj2 = this.a;
                synchronized (obj2) {
                    Pair pair = ((hyi) obj2).b;
                    if (pair != null) {
                        hyi.c((pdk) pair.first);
                    }
                }
                return;
            default:
                ((Looper) this.a).quitSafely();
                return;
        }
    }
}
