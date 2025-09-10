package defpackage;

import android.content.SharedPreferences;
import android.widget.TextView;
import com.google.ar.core.R;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class gku implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ gku(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                Object obj = this.a;
                ((gkv) obj).a.execute(new gku(obj, 3));
                break;
            case 1:
                Object obj2 = this.a;
                ((gkv) obj2).a.execute(new gku(obj2, 2));
                break;
            case 2:
                gkv gkvVar = (gkv) this.a;
                gkvVar.f = true;
                if (gkvVar.e) {
                    gkvVar.c.e();
                    gkvVar.c();
                    break;
                }
                break;
            case 3:
                gkv gkvVar2 = (gkv) this.a;
                gkvVar2.e = true;
                if (gkvVar2.f) {
                    gkvVar2.d.e();
                    gkvVar2.c();
                    break;
                }
                break;
            case 4:
                ((gky) this.a).c();
                break;
            case 5:
                glb glbVar = (glb) this.a;
                glbVar.g = true;
                if (glbVar.f) {
                    glbVar.d.e();
                    glbVar.b();
                    break;
                }
                break;
            case 6:
                glb glbVar2 = (glb) this.a;
                glbVar2.f = true;
                if (glbVar2.g) {
                    glbVar2.e.e();
                    glbVar2.b();
                    break;
                }
                break;
            case 7:
                Object obj3 = this.a;
                ((glb) obj3).c.execute(new gku(obj3, 5));
                break;
            case 8:
                Object obj4 = this.a;
                ((glb) obj4).c.execute(new gku(obj4, 6));
                break;
            case 9:
                glt gltVar = ((gls) this.a).a;
                if (gltVar.g && ((Boolean) gltVar.e.dL()).booleanValue() && !((Boolean) gltVar.d.dL()).booleanValue() && gltVar.b.i() && ((nkw) gltVar.c.dL()).a()) {
                    imi imiVar = gltVar.h;
                    nan nanVar = gltVar.f;
                    nanVar.getClass();
                    imiVar.a(nanVar);
                    break;
                }
                break;
            case 10:
                int i = gmm.q;
                gml gmlVar = (gml) this.a;
                ((gky) gmlVar.e).e();
                ((TextView) gmlVar.c).setVisibility(0);
                break;
            case 11:
                gmo gmoVar = (gmo) this.a;
                SharedPreferences sharedPreferences = gmoVar.c;
                sharedPreferences.edit().putInt("perf_key_show_p11_smarts_dismiss_count", sharedPreferences.getInt("perf_key_show_p11_smarts_dismiss_count", 0) + 1).apply();
                lzm lzmVar = gmoVar.f;
                if (lzmVar != null) {
                    lzmVar.a();
                }
                paq paqVar = gmoVar.g;
                if (paqVar != null) {
                    paqVar.close();
                    break;
                }
                break;
            case 12:
                gmo gmoVar2 = (gmo) this.a;
                if (!hax.a(gmoVar2.i)) {
                    gmoVar2.h.y(11, krs.SAPPHIRE);
                    break;
                } else {
                    gmoVar2.e.b(nkw.VIDEO_NIGHT_SIGHT);
                    break;
                }
            case 13:
                Object obj5 = this.a;
                gmo gmoVar3 = (gmo) obj5;
                gmoVar3.b.a(true);
                gmoVar3.g = gmoVar3.d.dK(new gmd(obj5, 10), gmoVar3.a);
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Object obj6 = this.a;
                gmp gmpVar = (gmp) obj6;
                gmpVar.d.a(luf.af).a(true);
                gmpVar.a = true;
                break;
            case 15:
                gmq gmqVar = (gmq) this.a;
                SharedPreferences sharedPreferences2 = gmqVar.b;
                sharedPreferences2.edit().putInt("pref_key_p11_5x_zoom_smarts_dismiss_count", sharedPreferences2.getInt("pref_key_p11_5x_zoom_smarts_dismiss_count", 0) + 1).apply();
                lzm lzmVar2 = gmqVar.c;
                if (lzmVar2 != null) {
                    lzmVar2.a();
                    break;
                }
                break;
            case 16:
                Object obj7 = this.a;
                ((gmq) obj7).d.y(11, krs.SAPPHIRE);
                break;
            case 17:
                ((gmq) this.a).a.a(true);
                break;
            case 18:
                gmy gmyVar = (gmy) this.a;
                gmyVar.p.e();
                gmyVar.f.findViewById(R.id.nsv_edu_caption_boosted).setVisibility(0);
                gmyVar.f.findViewById(R.id.nsv_edu_caption_initial).setVisibility(0);
                break;
            case 19:
                Object obj8 = this.a;
                ((gmy) obj8).d.execute(new gku(obj8, 18));
                break;
            default:
                gnx gnxVar = (gnx) this.a;
                pka pkaVar = gnxVar.c;
                gnt gntVar = gnxVar.a;
                gntVar.e(pkaVar);
                gntVar.h(gnxVar.b);
                break;
        }
    }
}
