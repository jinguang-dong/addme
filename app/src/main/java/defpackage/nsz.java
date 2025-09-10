package defpackage;

import android.graphics.Bitmap;
import android.util.Size;
import android.view.SurfaceView;
import com.bumptech.glide.qd.MyBPCgKwEjJI;
import com.google.android.apps.camera.coach.YOHg.INRGuObcrHjSQz;
import com.google.android.apps.camera.jni.saliency.tLp.KsvNaXS;
import java.nio.charset.StandardCharsets;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class nsz implements Runnable {
    public final /* synthetic */ ntf a;
    private final /* synthetic */ int b;

    public /* synthetic */ nsz(ntf ntfVar, int i) {
        this.b = i;
        this.a = ntfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmap;
        int iA;
        boolean z;
        ngk ngkVar;
        int i;
        int i2;
        pbn pbnVar;
        Object obj;
        Bitmap bitmap2;
        boolean z2 = true;
        Object obj2 = null;
        switch (this.b) {
            case 0:
                ntf ntfVar = this.a;
                nkw nkwVarG = ntfVar.G();
                nkw nkwVar = nkw.NIGHT_SIGHT;
                if (!nkwVarG.equals(nkwVar)) {
                    if (ntfVar.V()) {
                        ntfVar.k.d("/mode_ready", ntfVar.G().name().getBytes(StandardCharsets.UTF_8));
                        if (ntfVar.D) {
                            ntfVar.F().post(new nsz(ntfVar, 19));
                            if (ntfVar.H && ntfVar.r.b().d().equals(ncn.NIGHT_STOP)) {
                                ntfVar.D(0);
                            }
                        }
                        if (ntfVar.D) {
                            ntfVar.F().post(new nsz(ntfVar, 7));
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (ntfVar.D && ntfVar.f && ntfVar.h) {
                    ntfVar.k.d("/switch_to_hollywood", null);
                }
                ntfVar.k.d("/mode_ready", ntfVar.v.b >= nrd.WCA_202301_00.h ? nkwVar.name().getBytes(StandardCharsets.UTF_8) : "LONG_EXPOSURE".getBytes(StandardCharsets.UTF_8));
                if (ntfVar.D) {
                    if (!((Boolean) ntfVar.C.dL()).booleanValue() && !((Boolean) ntfVar.B.dL()).booleanValue()) {
                        z2 = false;
                    }
                    ntfVar.F().post(new emz(ntfVar, z2, 15, (char[]) null));
                    if (ntfVar.h) {
                        ndj ndjVar = ntfVar.r;
                        if (ndjVar.b().d().equals(ncn.NIGHT_CANCEL)) {
                            ntfVar.D(150);
                            ntfVar.D(0);
                        } else if (ndjVar.b().d().equals(ncn.NIGHT_STOP)) {
                            ntfVar.D(151);
                            ntfVar.D(0);
                        }
                    }
                }
                ntfVar.O();
                return;
            case 1:
                this.a.k.d(KsvNaXS.NzXJuV, null);
                return;
            case 2:
                this.a.k.d("/enable_cuttleface", null);
                return;
            case 3:
                ntf ntfVar2 = this.a;
                ntfVar2.k.d("/start_countdown_from_phone", ske.ah(ntfVar2.s.m.g));
                return;
            case 4:
                tpc tpcVarM = nqq.a.m();
                ntf ntfVar3 = this.a;
                String strName = ntfVar3.p.a().name();
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                nss nssVar = ntfVar3.k;
                nqq nqqVar = (nqq) tpcVarM.b;
                strName.getClass();
                nqqVar.b = strName;
                nssVar.d("/camera_facing", ((nqq) tpcVarM.l()).h());
                return;
            case 5:
                nss nssVar2 = this.a.k;
                if (nssVar2.a() != null) {
                    nssVar2.d("/stop_ongoing_activity", null);
                    return;
                }
                return;
            case 6:
                this.a.k.d(INRGuObcrHjSQz.HkeOJMAfXqyuu, null);
                return;
            case 7:
                ntf ntfVar4 = this.a;
                ntfVar4.k.d(true != ntfVar4.I ? "/exit_leopard" : "/enter_leopard", null);
                return;
            case 8:
                this.a.k.d("/enter_jupiter", null);
                return;
            case 9:
                this.a.k.d("/exit_astro_mode", null);
                return;
            case 10:
                this.a.k.d("/enable_autobahn", null);
                return;
            case 11:
                ntf ntfVar5 = this.a;
                ntfVar5.k.d("/video_resolution_changed", String.valueOf(ntfVar5.K).getBytes());
                return;
            case 12:
                this.a.k.d("/promote_cuttleface", null);
                return;
            case 13:
                tpc tpcVarM2 = nrb.a.m();
                ntf ntfVar6 = this.a;
                float fFloatValue = ((Float) ntfVar6.n.dL()).floatValue();
                if (!tpcVarM2.b.C()) {
                    tpcVarM2.o();
                }
                nss nssVar3 = ntfVar6.k;
                ((nrb) tpcVarM2.b).b = fFloatValue;
                nssVar3.d("/zoom_value", ((nrb) tpcVarM2.l()).h());
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ntf ntfVar7 = this.a;
                if (!ntfVar7.S() || !ntfVar7.V() || ntfVar7.J || ntfVar7.L) {
                    return;
                }
                if (!ntfVar7.F) {
                    nss nssVar4 = ntfVar7.k;
                    tpc tpcVarM3 = nqv.a.m();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (!tpcVarM3.b.C()) {
                        tpcVarM3.o();
                    }
                    ((nqv) tpcVarM3.b).c = jCurrentTimeMillis;
                    nssVar4.d("/empty_preview", ((nqv) tpcVarM3.l()).h());
                    ntfVar7.I(1000L);
                    return;
                }
                float f = 1.0f;
                if (!ntfVar7.G) {
                    long j = ntfVar7.d;
                    if (j >= 1000) {
                        f = 4.0f;
                    } else if (j >= 500) {
                        f = 3.0f;
                    } else if (j >= 300) {
                        f = 2.0f;
                    } else if (j >= 150) {
                        f = 1.5f;
                    }
                }
                try {
                    try {
                        ntfVar7.m.f("GetPreviewForWear");
                        pnk pnkVar = ntfVar7.P;
                        iA = pnkVar.a().a();
                        if (((Boolean) ntfVar7.z.dL()).booleanValue() && (pnkVar.a().equals(pao.CLOCKWISE_90) || pnkVar.a().equals(pao.CLOCKWISE_270))) {
                            iA = (iA + 180) % 360;
                            z = true;
                        } else {
                            z = false;
                        }
                        ngkVar = ntfVar7.q;
                        i = (int) (ntfVar7.e / f);
                        i2 = (int) (ntfVar7.g / f);
                        pbnVar = ngkVar.d;
                        pbnVar.f("getScreenshot");
                        obj = ngkVar.b;
                    } catch (Exception e) {
                        ((sgt) ((sgt) ntf.a.c().i(e)).M(5532)).s("Error when viewfinder.getScreenshot");
                        ntfVar7.I(60L);
                        ntfVar7.m.g();
                        bitmap = null;
                    }
                    try {
                        synchronized (obj) {
                            try {
                                ngd ngdVar = ngkVar.f;
                                ngdVar.getClass();
                                SurfaceView surfaceView = ngdVar.b;
                                Size sizeC = ngk.c(surfaceView.getWidth(), surfaceView.getHeight(), ngkVar.l.b(), 1);
                                float fMax = Math.max(sizeC.getWidth() / i, sizeC.getHeight() / i2);
                                int width = (int) (sizeC.getWidth() / fMax);
                                int height = (int) (sizeC.getHeight() / fMax);
                                bitmap2 = (Bitmap) ngkVar.d().b(new qbw(ngkVar, width, height, surfaceView, 1)).d(new ngg(ngkVar, surfaceView, width, height, 0));
                                pbnVar.g();
                            } catch (Throwable th) {
                                th = th;
                                obj2 = obj;
                                throw th;
                            }
                        }
                        if (iA != 0) {
                            pbn pbnVar2 = ngkVar.d;
                            pbnVar2.f(MyBPCgKwEjJI.FfUEEPaJzPfR);
                            Bitmap bitmapA = ngk.a(bitmap2, iA, z);
                            pbnVar2.g();
                            bitmap2.recycle();
                            bitmap = bitmapA;
                        } else {
                            bitmap = bitmap2;
                        }
                        if (bitmap != null) {
                            ntfVar7.N(bitmap, true);
                        }
                        ntfVar7.I(1000L);
                        ntfVar7.d = 1000L;
                        ntfVar7.F = false;
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } finally {
                    ntfVar7.m.g();
                }
                break;
            case 15:
                ntf ntfVar8 = this.a;
                ntfVar8.Q.e(1);
                ntfVar8.M = false;
                return;
            case 16:
                nss nssVar5 = this.a.k;
                if (nssVar5.a() == null) {
                    return;
                }
                nssVar5.d("/enable_wear_camera_app", null);
                return;
            case 17:
                tpc tpcVarM4 = nqr.a.m();
                ntf ntfVar9 = this.a;
                int i3 = ((ltw) ntfVar9.t.dL()).h;
                if (!tpcVarM4.b.C()) {
                    tpcVarM4.o();
                }
                nss nssVar6 = ntfVar9.k;
                ((nqr) tpcVarM4.b).b = i3;
                nssVar6.d("/count_down_setting_from_phone", ((nqr) tpcVarM4.l()).h());
                return;
            case 18:
                this.a.k.d("/enter_leopard", null);
                return;
            case 19:
                ntf ntfVar10 = this.a;
                ntfVar10.k.d(true != ntfVar10.H ? "/exit_auto_night_sight" : "/enter_auto_night_sight", null);
                return;
            default:
                this.a.k.d("/support_feature_version", nrc.a.h());
                return;
        }
    }
}
