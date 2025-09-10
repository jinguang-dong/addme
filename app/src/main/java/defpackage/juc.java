package defpackage;

import com.google.ar.core.R;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class juc implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ juc(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        switch (this.b) {
            case 0:
                Object obj = this.a;
                if (((fqf) obj).u) {
                    ((jue) obj).b(gnm.JUPITER_SWITCH);
                    break;
                }
                break;
            case 1:
                jti jtiVar = (jti) this.a;
                if (!jtiVar.g) {
                    jtiVar.g = true;
                    jtiVar.a.a(false);
                    paq paqVar = jtiVar.e;
                    if (paqVar != null) {
                        paqVar.close();
                    }
                    paq paqVar2 = jtiVar.f;
                    if (paqVar2 != null) {
                        paqVar2.close();
                        break;
                    }
                }
                break;
            case 2:
                Object obj2 = this.a;
                ((jue) obj2).a.h(new juc(obj2, i));
                break;
            case 3:
                ((fqf) this.a).eB();
                break;
            case 4:
                jxa jxaVar = (jxa) this.a;
                if (!jxaVar.j) {
                    jxaVar.z.h();
                    break;
                }
                break;
            case 5:
                jxa jxaVar2 = (jxa) this.a;
                rkc rkcVar = new rkc(jxaVar2.n, jxaVar2.D);
                rkcVar.q(R.string.dialog_ok, new fdf(this, 8, null));
                rkcVar.n(R.string.dialog_cancel, new jdc(3));
                if (jxaVar2.B.dL() == nkw.PHOTO_SPHERE) {
                    rkcVar.l(R.string.cancel_photo_sphere);
                } else {
                    rkcVar.l(R.string.cancel_panorama);
                }
                rkcVar.k(true);
                jxaVar2.H = rkcVar.b();
                jxaVar2.H.show();
                break;
            case 6:
                jxa jxaVar3 = (jxa) this.a;
                rkc rkcVar2 = new rkc(jxaVar3.n, jxaVar3.D);
                rkcVar2.q(R.string.dialog_ok, new fdf(this, 9, null));
                rkcVar2.n(R.string.dialog_cancel, new jdc(4));
                rkcVar2.l(R.string.photosphere_fisheye_confirm_dialog);
                rkcVar2.k(true);
                jxaVar3.I = rkcVar2.b();
                jxaVar3.I.show();
                break;
            case 7:
                ((jxa) this.a).z.e();
                break;
            case 8:
                ((jxa) this.a).z.c();
                break;
            case 9:
                jxa jxaVar4 = (jxa) ((jww) this.a).a;
                jxaVar4.k();
                jxaVar4.b();
                break;
            case 10:
                jxa jxaVar5 = (jxa) this.a;
                dv dvVar = jxaVar5.H;
                if (dvVar != null) {
                    dvVar.dismiss();
                }
                dv dvVar2 = jxaVar5.I;
                if (dvVar2 != null) {
                    dvVar2.dismiss();
                    break;
                }
                break;
            case 11:
                ((jxa) ((jwq) this.a).a).g();
                break;
            case 12:
                ((jxa) ((jwq) this.a).a).c();
                break;
            case 13:
                Object obj3 = this.a;
                ((jxi) obj3).a.c(gnm.FPS_SWITCH);
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                gmm gmmVar = (gmm) this.a;
                gmmVar.o = true;
                gmmVar.a();
                break;
            case 15:
                ((jxp) this.a).G(gnm.DUAL_SCREEN_SWITCH);
                break;
            case 16:
                Object obj4 = this.a;
                ((jxp) obj4).g.h(new juc(obj4, 18));
                break;
            case 17:
                ((jxp) this.a).G(gnm.STABILIZATION_SWITCH);
                break;
            case 18:
                ((jxp) this.a).G(gnm.DUAL_SCREEN_SWITCH);
                break;
            case 19:
                ((jxp) this.a).G(gnm.JUPITER_SWITCH);
                break;
            default:
                ((jxp) this.a).G(gnm.JUPITER_SWITCH);
                break;
        }
    }

    public juc(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
