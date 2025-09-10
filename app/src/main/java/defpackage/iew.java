package defpackage;

import android.hardware.SensorEventListener;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class iew implements paq {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ iew(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36, types: [android.hardware.SensorEventListener, java.lang.Object, png] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, syw] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r3v11, types: [fel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r3v52, types: [java.lang.Object, syu] */
    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        switch (this.b) {
            case 0:
                ((iex) this.a).i();
                return;
            case 1:
                this.a.a(false);
                return;
            case 2:
                ((itl) this.a).k(3);
                return;
            case 3:
                ((iun) this.a).a().c();
                return;
            case 4:
                Object obj = this.a;
                synchronized (obj) {
                    ((qwz) obj).b = true;
                }
                return;
            case 5:
                this.a.a(ixq.INACTIVE);
                return;
            case 6:
                this.a.j(null);
                return;
            case 7:
                ((ovx) this.a).a(false);
                return;
            case 8:
                jka jkaVar = (jka) this.a;
                if (!jkaVar.f.compareAndSet(true, false)) {
                    ((sgt) jka.c.c().M(2796)).s("Already unbound.");
                }
                jkaVar.g.close();
                return;
            case 9:
                jkd jkdVar = (jkd) this.a;
                if (!jkdVar.d.compareAndSet(true, false)) {
                    ((sgt) jkd.c.c().M(2798)).s("Already unbound.");
                }
                jkdVar.e();
                jkdVar.m.close();
                return;
            case 10:
                jkj jkjVar = (jkj) this.a;
                if (!jkjVar.d.compareAndSet(true, false)) {
                    ((sgt) jkj.c.c().M(2802)).s("Already unbound.");
                    return;
                } else {
                    jkjVar.e();
                    jkjVar.k.close();
                    return;
                }
            case 11:
                jkl jklVar = (jkl) this.a;
                if (!jklVar.d.compareAndSet(true, false)) {
                    ((sgt) jkl.c.c().M(2803)).s("Already unbound.");
                }
                jklVar.e();
                jklVar.p.close();
                return;
            case 12:
                jkm jkmVar = (jkm) this.a;
                if (!jkmVar.e.compareAndSet(true, false)) {
                    ((sgt) jkm.c.c().M(2806)).s("Already unbound.");
                }
                jkmVar.j.close();
                return;
            case 13:
                ?? r0 = this.a;
                synchronized (r0) {
                    ((jrd) r0).a.unregisterListener((SensorEventListener) r0);
                    ((jrd) r0).d.c(r0);
                }
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((qkp) this.a).close();
                return;
            case 15:
                if (((kdd) this.a).b.compareAndSet(true, false)) {
                    return;
                }
                ((sgt) kdd.a.c().M(3246)).s("Already unbound.");
                return;
            case 16:
                ((hyh) this.a).h();
                return;
            case 17:
                this.a.cancel(true);
                return;
            case 18:
                ((kgt) this.a).f("Detected leftover OneCamera onStop.");
                return;
            case 19:
                ((kgt) this.a).f("Detected leftover OneCamera onDestroy.");
                return;
            default:
                Object obj2 = this.a;
                synchronized (((khb) obj2).a) {
                    ?? r1 = ((khb) obj2).e;
                    if (r1 != 0) {
                        r1.shutdown();
                    }
                    ((khb) obj2).b = true;
                }
                return;
        }
    }
}
