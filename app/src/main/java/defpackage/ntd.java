package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Looper;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.ui.gridlines.gBW.mNLbzhCxd;
import com.google.android.clockwork.common.wearable.wearmaterial.picker.CenteredRecyclerView;
import com.google.android.clockwork.common.wearable.wearmaterial.slider.WearInlineSlider;
import java.nio.charset.StandardCharsets;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ntd implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ntd(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    public ntd(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, syu] */
    @Override // java.lang.Runnable
    public final void run() throws PackageManager.NameNotFoundException {
        jw jwVar;
        RecyclerView recyclerView;
        kq kqVar;
        View viewB;
        boolean zH;
        boolean z = true;
        boolean z2 = false;
        switch (this.b) {
            case 0:
                tpc tpcVarM = nqt.a.m();
                String str = Build.MANUFACTURER;
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                nqt nqtVar = (nqt) tpcVarM.b;
                str.getClass();
                nqtVar.b = str;
                String str2 = Build.DEVICE;
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                nqt nqtVar2 = (nqt) tpcVarM.b;
                str2.getClass();
                nqtVar2.c = str2;
                String str3 = Build.FINGERPRINT;
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                nqt nqtVar3 = (nqt) tpcVarM.b;
                str3.getClass();
                nqtVar3.d = str3;
                int i = Build.VERSION.SDK_INT;
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                ((nqt) tpcVarM.b).e = i;
                String str4 = Build.ID;
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                Object obj = this.a;
                nqt nqtVar4 = (nqt) tpcVarM.b;
                str4.getClass();
                nqtVar4.f = str4;
                ((ntf) obj).k.d("/phone_properties", ((nqt) tpcVarM.l()).h());
                return;
            case 1:
                ntf ntfVar = (ntf) this.a;
                ntfVar.k.d("/support_camera_modes", jsv.o(ntfVar.y).getBytes(StandardCharsets.UTF_8));
                return;
            case 2:
                ntf ntfVar2 = (ntf) this.a;
                ntfVar2.k.d("/manual_lens_selection_enabled", ((Boolean) ntfVar2.A.dL()).booleanValue() ? "true".getBytes(StandardCharsets.UTF_8) : "false".getBytes(StandardCharsets.UTF_8));
                return;
            case 3:
                ((ntr) this.a).l.setVisibility(0);
                return;
            case 4:
                ((ntr) this.a).l.setVisibility(8);
                return;
            case 5:
                ((ntt) this.a).fg(true);
                return;
            case 6:
                nxh nxhVar = (nxh) this.a;
                CenteredRecyclerView centeredRecyclerView = nxhVar.a;
                if (centeredRecyclerView != null) {
                    if (centeredRecyclerView.ai) {
                        kq kqVar2 = centeredRecyclerView.m;
                        nxp nxpVar = (nxp) centeredRecyclerView.l;
                        if (kqVar2 != null && nxpVar != null) {
                            centeredRecyclerView.aH();
                            View viewO = kqVar2.O(-1);
                            if (viewO != null) {
                                nxt nxtVar = centeredRecyclerView.ag;
                                int iD = (nxtVar.d(centeredRecyclerView) / 2) - nxtVar.b(viewO);
                                if (iD == 0) {
                                    throw null;
                                }
                                nxtVar.e(centeredRecyclerView, iD);
                                centeredRecyclerView.forceLayout();
                                centeredRecyclerView.invalidate();
                                throw null;
                            }
                        }
                    }
                    nxhVar.c();
                    return;
                }
                return;
            case 7:
                Object obj2 = this.a;
                CenteredRecyclerView centeredRecyclerView2 = (CenteredRecyclerView) obj2;
                nxt nxtVar2 = centeredRecyclerView2.ag;
                View view = (View) obj2;
                int iC = nxtVar2.c(view);
                int i2 = centeredRecyclerView2.aj;
                if (iC != i2) {
                    nxtVar2.f(view, i2);
                    z2 = true;
                }
                if (centeredRecyclerView2.ai && centeredRecyclerView2.ak == null) {
                    centeredRecyclerView2.ak = new nxj(centeredRecyclerView2.al, centeredRecyclerView2.am);
                } else {
                    z = z2;
                }
                RecyclerView recyclerView2 = (RecyclerView) obj2;
                nxp nxpVar2 = (nxp) recyclerView2.l;
                if (nxpVar2 != null) {
                    kk kkVar = nxpVar2.e;
                    recyclerView2.aA(kkVar);
                    nxj nxjVar = centeredRecyclerView2.ak;
                    if (nxjVar != null) {
                        nxjVar.e(null);
                    }
                    if (centeredRecyclerView2.ai) {
                        recyclerView2.az(kkVar);
                        nxj nxjVar2 = centeredRecyclerView2.ak;
                        if (nxjVar2 != null) {
                            nxjVar2.e(recyclerView2);
                        }
                    }
                }
                if (z) {
                    centeredRecyclerView2.aE();
                    return;
                }
                return;
            case 8:
                nxn nxnVar = (nxn) this.a;
                if (nxnVar.h != 0) {
                    nxnVar.c.postDelayed(nxnVar.d, 100L);
                    return;
                }
                CenteredRecyclerView centeredRecyclerView3 = nxnVar.c;
                centeredRecyclerView3.aH();
                if (nxnVar.g >= 0) {
                    centeredRecyclerView3.aG(0);
                    return;
                }
                return;
            case 9:
                nxn nxnVar2 = (nxn) this.a;
                if (nxnVar2.f) {
                    if (nxnVar2.h == 0) {
                        nxnVar2.f = false;
                        return;
                    } else {
                        nxnVar2.c.postDelayed(nxnVar2.e, 100L);
                        return;
                    }
                }
                return;
            case 10:
                ((nxz) this.a).a.aw(0, 1);
                return;
            case 11:
                nyg nygVar = (nyg) this.a;
                if (!nygVar.d || (jwVar = nygVar.b) == null || (kqVar = (recyclerView = nygVar.a).m) == null || (viewB = jwVar.b(kqVar)) == null) {
                    return;
                }
                int[] iArrC = jwVar.c(kqVar, viewB);
                int i3 = iArrC[0];
                if (i3 != 0) {
                    recyclerView.aw(i3, iArrC[1]);
                } else if (iArrC[1] != 0) {
                    i3 = 0;
                    recyclerView.aw(i3, iArrC[1]);
                }
                nygVar.e = false;
                return;
            case 12:
                ((WearInlineSlider) this.a).j();
                return;
            case 13:
                obu obuVar = (obu) this.a;
                if (obuVar.b.isCancelled()) {
                    ((UrlRequest) obuVar.a).cancel();
                    return;
                }
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((nzv) this.a).b();
                return;
            case 15:
                Object obj3 = this.a;
                synchronized (((nzv) obj3).f) {
                    ((nzv) obj3).h--;
                    ((nzv) obj3).d();
                }
                return;
            case 16:
                ((oam) this.a).a.F();
                return;
            case 17:
                Object obj4 = this.a;
                ((oao) obj4).z();
                oak.a();
                oan oanVar = (oan) obj4;
                Context context = oanVar.b.a;
                if (!obr.a(context)) {
                    oanVar.t("AnalyticsReceiver is not registered or is disabled. Register the receiver for reliable dispatching on non-Google Play devices. See http://goo.gl/8Rd3yj for instructions.");
                } else if (!obu.d(context)) {
                    oanVar.n(mNLbzhCxd.cKRXPlFrPRFCz);
                }
                ojl.ay(context);
                Boolean bool = oab.a;
                if (bool != null) {
                    zH = bool.booleanValue();
                } else {
                    zH = nwj.h(context, "com.google.android.gms.analytics.CampaignTrackingReceiver", true);
                    oab.a = Boolean.valueOf(zH);
                }
                if (!zH) {
                    oanVar.t("CampaignTrackingReceiver is not registered, not exported or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.");
                }
                obq obqVarJ = oanVar.j();
                oak.a();
                obqVarJ.z();
                if (obqVarJ.c == 0) {
                    long j = obqVarJ.a.getLong("first_run", 0L);
                    if (j != 0) {
                        obqVarJ.c = j;
                    } else {
                        obqVarJ.y();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        SharedPreferences.Editor editorEdit = obqVarJ.a.edit();
                        editorEdit.putLong("first_run", jCurrentTimeMillis);
                        if (!editorEdit.commit()) {
                            obqVarJ.t("Failed to commit first run time");
                        }
                        obqVarJ.c = jCurrentTimeMillis;
                    }
                }
                oba obaVar = (oba) obj4;
                if (!obaVar.G("android.permission.ACCESS_NETWORK_STATE")) {
                    oanVar.n("Missing required android.permission.ACCESS_NETWORK_STATE. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
                    obaVar.E();
                }
                if (!obaVar.G("android.permission.INTERNET")) {
                    oanVar.n("Missing required android.permission.INTERNET. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
                    obaVar.E();
                }
                if (obu.d(oanVar.d())) {
                    oanVar.q("AnalyticsService registered in the app manifest and enabled");
                } else {
                    oanVar.t("AnalyticsService not registered in the app manifest. Hits might not be delivered reliably. See http://goo.gl/8Rd3yj for instructions.");
                }
                if (!obaVar.f && !obaVar.c.H()) {
                    obaVar.C();
                }
                obaVar.F();
                return;
            case 18:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    ((obd) this.a).b.a().b(this);
                    return;
                }
                obd obdVar = (obd) this.a;
                boolean zE = obdVar.e();
                obdVar.d = 0L;
                if (zE) {
                    obdVar.a();
                    return;
                }
                return;
            case 19:
                ((oga) this.a).h();
                return;
            default:
                oeo oeoVar = ((oga) ((AmbientModeSupport.AmbientController) this.a).a).b;
                oeoVar.j(String.valueOf(oeoVar.getClass().getName()).concat(" disconnecting because it was signed out."));
                return;
        }
    }
}
