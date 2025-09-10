package defpackage;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class fvr implements View.OnClickListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ fvr(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ltr ltrVar;
        int i;
        switch (this.b) {
            case 0:
                ((fvu) this.a).m.a();
                break;
            case 1:
                ((fvu) this.a).m.j();
                break;
            case 2:
                ((fvu) this.a).m.a();
                break;
            case 3:
                ((fvu) this.a).m.h();
                break;
            case 4:
                ((gkv) this.a).b();
                break;
            case 5:
                ((gkw) this.a).b();
                break;
            case 6:
                ((glb) this.a).a();
                break;
            case 7:
                gmm gmmVar = (gmm) this.a;
                if (gmmVar.c()) {
                    gmmVar.b(gmmVar.j, gmmVar.k, gmmVar.h, gmmVar.i);
                    jea.q(gmmVar.m, gmmVar.l, gmmVar.b);
                    gmmVar.n = true;
                    break;
                }
                break;
            case 8:
                gmm gmmVar2 = (gmm) this.a;
                if (gmmVar2.n) {
                    gmmVar2.b(gmmVar2.h, gmmVar2.i, gmmVar2.j, gmmVar2.k);
                    jea.q(gmmVar2.l, gmmVar2.m, gmmVar2.b);
                    gmmVar2.n = false;
                    break;
                }
                break;
            case 9:
                Object obj = this.a;
                gmm gmmVar3 = (gmm) obj;
                if (!gmmVar3.p.h(nkw.VIDEO) && !((mgh) gmmVar3.e.a()).a()) {
                    owq owqVar = gmmVar3.c;
                    if (!((Boolean) owqVar.dL()).booleanValue()) {
                        owqVar.a(true);
                    }
                }
                gmmVar3.a.h();
                if (gmmVar3.o) {
                    ((krj) gmmVar3.f.a()).y(11, krs.SAPPHIRE);
                    gmmVar3.o = false;
                    break;
                }
                break;
            case 10:
                ((gmv) this.a).a();
                break;
            case 11:
                gmy gmyVar = (gmy) this.a;
                if (gmyVar.b()) {
                    gmyVar.a(gmyVar.i, gmyVar.j, gmyVar.g, gmyVar.h);
                    jea.q(gmyVar.l, gmyVar.k, gmyVar.c);
                    gmyVar.m = true;
                    break;
                }
                break;
            case 12:
                gmy gmyVar2 = (gmy) this.a;
                if (gmyVar2.m) {
                    gmyVar2.a(gmyVar2.g, gmyVar2.h, gmyVar2.i, gmyVar2.j);
                    jea.q(gmyVar2.k, gmyVar2.l, gmyVar2.c);
                    gmyVar2.m = false;
                    break;
                }
                break;
            case 13:
                ((rwr) this.a).h();
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                hjo hjoVar = (hjo) this.a;
                switch (hjoVar.e.ordinal()) {
                    case 38:
                        ltrVar = ltr.ON_LIGHT;
                        i = ltrVar.f;
                        break;
                    case 39:
                        ltrVar = ltr.ON_STRONG;
                        i = ltrVar.f;
                        break;
                    case 40:
                        ltrVar = ltr.OFF;
                        i = ltrVar.f;
                        break;
                    default:
                        Log.e("VesperBottomSheet", "Invalid beautification option");
                        i = ltr.OFF.f;
                        break;
                }
                hjoVar.d.a(Integer.valueOf(i));
                hjoVar.b.h();
                break;
            case 15:
                Intent intent = new Intent();
                Context context = (Context) ((hrj) this.a).d;
                intent.setClassName(context, "com.google.android.apps.camera.legacy.app.settings.CameraSettingsActivity");
                intent.putExtra("list_pref_extra", "pref_camera_catcher_key");
                intent.putExtra("pref_make_setting_page_root", true);
                context.startActivity(intent);
                break;
            case 16:
                ((huc) this.a).b();
                break;
            case 17:
                ipk ipkVar = (ipk) this.a;
                ipkVar.n(iqh.JUPITER, ipkVar.h);
                break;
            case 18:
                ipk ipkVar2 = (ipk) this.a;
                ipkVar2.n(iqh.SATURN, ipkVar2.i);
                break;
            case 19:
                Object obj2 = this.a;
                ((ipk) obj2).j.ifPresent(new hyq(obj2, 16));
                break;
            default:
                ipp ippVar = (ipp) this.a;
                ippVar.c = true;
                ippVar.a.h();
                break;
        }
    }
}
