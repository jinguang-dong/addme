package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class kdx implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kdx(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, lzm] */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, paq] */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.lang.Object, paq] */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.lang.Object, pbp] */
    @Override // java.lang.Runnable
    public final void run() {
        lzm lzmVar;
        switch (this.b) {
            case 0:
                kdz kdzVar = (kdz) this.a;
                kdzVar.h = true;
                kdzVar.d.b(nkw.NIGHT_SIGHT);
                return;
            case 1:
                ((kcs) this.a).b.set(true);
                return;
            case 2:
                kdz kdzVar2 = (kdz) this.a;
                if (!kdzVar2.a.compareAndSet(true, false) || (lzmVar = kdzVar2.b) == null) {
                    return;
                }
                lzmVar.a();
                return;
            case 3:
                this.a.a();
                return;
            case 4:
                throw new RuntimeException((Throwable) this.a);
            case 5:
                this.a.close();
                return;
            case 6:
                throw new RuntimeException((Throwable) this.a);
            case 7:
                this.a.close();
                return;
            case 8:
                this.a.a();
                return;
            case 9:
                kmh kmhVar = (kmh) this.a;
                if (kmhVar.c.getAndSet(false)) {
                    kmhVar.a.a.b();
                    return;
                }
                return;
            case 10:
                ((kmf) this.a).i();
                return;
            case 11:
                ((kmf) this.a).d();
                return;
            case 12:
                ((kmf) this.a).c();
                return;
            case 13:
                ((kmf) this.a).d();
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((kmf) this.a).i();
                return;
            case 15:
                ((kmf) this.a).c();
                return;
            case 16:
                kmg kmgVar = (kmg) this.a;
                if (kmgVar.a) {
                    return;
                }
                kmh kmhVar2 = kmgVar.b;
                if (kmhVar2.c.get()) {
                    kmgVar.a = true;
                    kmhVar2.g();
                    return;
                }
                return;
            case 17:
                int i = sbp.d;
                Object obj = this.a;
                sbp sbpVar = sex.a;
                ((kpy) obj).a.t(1, "api2_lost_images", null, -1, -1, 0, sbpVar, sbpVar, pbw.CAMERA_ERROR_CODE_UNKNOWN, false);
                return;
            case 18:
                ((kqy) this.a).h(ltr.OFF);
                return;
            case 19:
                ((krj) this.a).x(12);
                return;
            default:
                krj krjVar = (krj) this.a;
                krjVar.M.i(krjVar.q());
                return;
        }
    }

    public kdx(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
