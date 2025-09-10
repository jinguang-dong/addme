package defpackage;

import com.google.android.apps.camera.aizoom.animation.AiZoomPreviewUserEducationView;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fbo implements pau {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ fbo(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v31, types: [fhe, java.lang.Object] */
    @Override // defpackage.pau
    public final void a(Object obj) {
        switch (this.b) {
            case 0:
                ((fbp) this.a).d.setVisibility(true != ((Boolean) obj).booleanValue() ? 0 : 4);
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                Object obj2 = this.a;
                if (!zBooleanValue) {
                    fbm fbmVar = (fbm) obj2;
                    if (fbmVar.b) {
                        fbmVar.a = System.currentTimeMillis();
                    }
                }
                ((fbm) obj2).b = bool.booleanValue();
                break;
            case 2:
                if (((Boolean) obj).booleanValue()) {
                    ((fbv) this.a).e();
                    break;
                }
                break;
            case 3:
                ((fft) this.a).o();
                break;
            case 4:
                ((fft) this.a).o();
                break;
            case 5:
                ((fft) this.a).o();
                break;
            case 6:
                ((fft) this.a).o();
                break;
            case 7:
                ((fft) this.a).o();
                break;
            case 8:
                ((fft) this.a).o();
                break;
            case 9:
                ((fft) this.a).o();
                break;
            case 10:
                ((fft) this.a).o();
                break;
            case 11:
                ((fft) this.a).o();
                break;
            case 12:
                ((fft) this.a).o();
                break;
            case 13:
                fhc fhcVar = (fhc) obj;
                Object obj3 = this.a;
                if (fhcVar != fhc.ACTIVE) {
                    ((hls) obj3).i(true);
                    break;
                } else {
                    shl shlVar = shx.a;
                    hls hlsVar = (hls) obj3;
                    ((fhj) hlsVar.e).b();
                    ((fgk) hlsVar.a).b();
                    hlsVar.d.k();
                    break;
                }
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((fgq) this.a).d();
                break;
            case 15:
                Boolean bool2 = (Boolean) obj;
                fgw fgwVar = (fgw) this.a;
                if (((fhb) fgwVar.a.dL()).b == fhd.SMALL) {
                    shl shlVar2 = shx.a;
                    fgwVar.b(bool2.booleanValue());
                    break;
                }
                break;
            case 16:
                if (((Boolean) obj).booleanValue()) {
                    ((fgw) this.a).h();
                    break;
                }
                break;
            case 17:
                if (((fhi) obj).b) {
                    ((fgw) this.a).h();
                    break;
                }
                break;
            case 18:
                fhc fhcVar2 = (fhc) obj;
                shl shlVar3 = shx.a;
                Object obj4 = this.a;
                if (fhcVar2 != fhc.ACTIVE) {
                    fgx fgxVar = (fgx) obj4;
                    fgxVar.f.J(fgxVar.i);
                    if (fhcVar2 == fhc.INACTIVE_THROTTLED) {
                        fgxVar.b(fgxVar.b);
                        break;
                    }
                } else {
                    fgx fgxVar2 = (fgx) obj4;
                    fgxVar2.f.I(fgxVar2.i);
                    if (fgxVar2.a && !((Boolean) fgxVar2.e.dL()).booleanValue()) {
                        fgxVar2.d.i();
                        break;
                    }
                }
                break;
            case 19:
                fgx fgxVar3 = (fgx) this.a;
                luj lujVar = fgxVar3.g;
                lus lusVar = luf.aG;
                int iIntValue = ((Integer) lujVar.b(lusVar)).intValue();
                if (((Boolean) obj).booleanValue() && iIntValue < 2) {
                    shl shlVar4 = shx.a;
                    fgxVar3.h.d(lusVar, Integer.valueOf(iIntValue + 1));
                    fgxVar3.b(fgxVar3.c);
                    break;
                }
                break;
            default:
                ((AiZoomPreviewUserEducationView) this.a).b();
                break;
        }
    }
}
