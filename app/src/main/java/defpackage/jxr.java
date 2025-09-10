package defpackage;

import com.google.android.apps.camera.moments.FastMomentsHdrImpl;
import com.google.ar.core.R;
import com.google.googlex.gcam.Gcam;
import java.util.concurrent.TimeUnit;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class jxr implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ jxr(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v27, types: [java.lang.Object, kao] */
    /* JADX WARN: Type inference failed for: r5v66, types: [java.lang.Object, owq] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                jxt jxtVar = (jxt) this.a;
                jxtVar.c.m();
                jxtVar.c();
                return;
            case 1:
                Object obj = this.a;
                ((jxp) obj).g.h(new juc(obj, 19));
                return;
            case 2:
                Object obj2 = this.a;
                synchronized (((jxt) obj2).d) {
                    if (!((jxt) obj2).f) {
                        ((jxt) obj2).b();
                    }
                    ((fwn) ((jxt) obj2).b).m();
                }
                return;
            case 3:
                nkw nkwVar = nkw.VIDEO_NIGHT_SIGHT;
                boolean zEquals = nkwVar.equals(nkwVar);
                jxv jxvVar = (jxv) this.a;
                got gotVar = jxvVar.g;
                if ((zEquals ? ((mgh) gotVar.b).b(R.string.night_sight_video_turn_off_storage_saver_dialog_body) : ((mgh) gotVar.b).a()) || gotVar.h(nkwVar)) {
                    jxvVar.e.a(false);
                    return;
                }
                return;
            case 4:
                jyb jybVar = ((jya) this.a).a;
                synchronized (jybVar.e) {
                    nan nanVar = jybVar.g;
                    if (nanVar != null && jybVar.h) {
                        jybVar.j.a(nanVar);
                        rwu rwuVar = jybVar.f;
                        if (rwuVar.a) {
                            ((sgt) jyb.a.c().M(3159)).s("Stopwatch was already running, skipping start.");
                        } else {
                            rwuVar.e();
                        }
                    }
                }
                return;
            case 5:
                FastMomentsHdrImpl fastMomentsHdrImpl = (FastMomentsHdrImpl) this.a;
                fastMomentsHdrImpl.initializeProcessingQueueNative(fastMomentsHdrImpl.b, Gcam.a(fastMomentsHdrImpl.c));
                return;
            case 6:
                ((kai) this.a).m();
                return;
            case 7:
                this.a.c();
                return;
            case 8:
                Object obj3 = this.a;
                kai kaiVar = (kai) obj3;
                kaiVar.g.d(kaiVar.f.dK(new juf(obj3, 7), sxo.a));
                return;
            case 9:
                ((kai) this.a).o();
                return;
            case 10:
                Object obj4 = this.a;
                synchronized (obj4) {
                    int i = ((kai) obj4).m - 1;
                    ((kai) obj4).m = i;
                    rnt.L(i >= 0);
                    ((kai) obj4).n();
                }
                return;
            case 11:
                Object obj5 = this.a;
                synchronized (obj5) {
                    ((kai) obj5).h = false;
                    ((kai) obj5).n();
                }
                return;
            case 12:
                Object obj6 = this.a;
                synchronized (obj6) {
                    ((kai) obj6).m++;
                }
                return;
            case 13:
                Object obj7 = this.a;
                synchronized (obj7) {
                    try {
                        ((kas) obj7).e.b("Signaling EOS (Hardware)");
                        ((kas) obj7).c.signalEndOfInputStream();
                    } finally {
                        return;
                    }
                }
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Object obj8 = this.a;
                kas kasVar = (kas) obj8;
                kasVar.c("heart beat");
                try {
                    ((kas) obj8).i.postDelayed(((kas) obj8).j, TimeUnit.SECONDS.toMillis(1L));
                    return;
                } catch (IllegalStateException e) {
                    kasVar.e.c("heart beat handler exception", e);
                    return;
                }
            case 15:
                kas kasVar2 = ((kar) this.a).a;
                synchronized (kasVar2) {
                    kasVar2.g = true;
                    kasVar2.c("ImageSink-close");
                }
                return;
            case 16:
                this.a.a(-1);
                return;
            case 17:
                ((kcn) this.a).d.e();
                return;
            case 18:
                kco kcoVar = (kco) this.a;
                kcoVar.c.d(((ftv) kcoVar.d.c()).b(nkw.TIME_LAPSE, kcoVar.e, kcoVar.f));
                return;
            case 19:
                ((kcq) this.a).b();
                return;
            default:
                kcs kcsVar = (kcs) this.a;
                ((kcn) kcsVar.a.c()).a();
                kcsVar.c.set(true);
                return;
        }
    }
}
