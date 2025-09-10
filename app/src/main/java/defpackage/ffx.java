package defpackage;

import android.hardware.camera2.CameraManager;
import j$.util.Optional;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ffx implements paq {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public ffx(hgs hgsVar, hhc hhcVar, int i) {
        this.c = i;
        this.b = hhcVar;
        this.a = hgsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, lst] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, pdh] */
    /* JADX WARN: Type inference failed for: r0v26, types: [hpb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [imj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, lst] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, paq] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, paq] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, png] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object, png] */
    /* JADX WARN: Type inference failed for: r3v34, types: [glr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v38, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v47, types: [java.lang.Object, mmg] */
    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        switch (this.c) {
            case 0:
                ((nqm) this.a).d((nqo) ((Optional) this.b).get());
                return;
            case 1:
                ((fft) this.a).d();
                ((fgq) this.b).f(null);
                return;
            case 2:
                Object obj = this.a;
                Object obj2 = this.b;
                synchronized (obj2) {
                    ((fql) obj2).a.remove(obj);
                }
                return;
            case 3:
                Object obj3 = this.b;
                ?? r1 = ((pfl) this.a).a;
                synchronized (r1) {
                    r1.remove(obj3);
                }
                return;
            case 4:
                ((gqc) this.a).f = gqc.b;
                this.b.close();
                return;
            case 5:
                ((gri) this.a).e = gri.a;
                this.b.close();
                return;
            case 6:
                ((ktx) this.b).h(this.a);
                return;
            case 7:
                ((ktx) this.b).h(this.a);
                return;
            case 8:
                ((lzp) ((rwc) this.b).c()).j.remove(this.a);
                return;
            case 9:
                ((lsp) this.b).i(this.a);
                return;
            case 10:
                ((hfs) this.a).d(this.b);
                return;
            case 11:
                ((hgs) this.a).a.remove(this.b);
                return;
            case 12:
                ((hna) this.b).a.remove(this.a);
                return;
            case 13:
                ((hpa) this.a).f(this.b);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((imi) this.a).f(this.b);
                return;
            case 15:
                fpy fpyVar = (fpy) this.a;
                fpyVar.c = null;
                fpyVar.g.remove(((iyu) this.b).B);
                return;
            case 16:
                ((jjn) this.b).n.d(this.a);
                return;
            case 17:
                Object obj4 = this.a;
                Object obj5 = this.b;
                synchronized (obj5) {
                    ((pfl) obj5).a.remove(obj4);
                }
                return;
            case 18:
                ?? r0 = this.a;
                ((lsp) this.b).i(r0);
                jmo jmoVar = (jmo) r0;
                rwc rwcVar = jmoVar.c;
                if (rwcVar.h()) {
                    jmoVar.a.set(false);
                    ((mac) rwcVar.c()).g(jmoVar.e);
                    jmoVar.d.close();
                    return;
                }
                return;
            case 19:
                ((CameraManager) ((kgn) this.b).b).unregisterAvailabilityCallback((CameraManager.AvailabilityCallback) this.a);
                return;
            default:
                ((mlw) ((rwc) this.b).c()).g(this.a);
                return;
        }
    }

    public /* synthetic */ ffx(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ ffx(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
