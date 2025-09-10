package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.apps.camera.coach.CameraCoachHudView;
import com.google.ar.core.R;
import java.util.concurrent.TimeUnit;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class gto implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ gto(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r9v37, types: [sgt, shi] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        switch (this.b) {
            case 0:
                ((gua) ((CameraCoachHudView) this.a).d.c()).a();
                break;
            case 1:
                ((guq) ((CameraCoachHudView) this.a).c.c()).b();
                break;
            case 2:
                ((guq) ((CameraCoachHudView) this.a).c.c()).b();
                break;
            case 3:
                ((gua) ((CameraCoachHudView) this.a).d.c()).a();
                break;
            case 4:
                ((guj) ((CameraCoachHudView) this.a).b.c()).a();
                break;
            case 5:
                ((gtx) this.a).j();
                break;
            case 6:
                gtx gtxVar = (gtx) this.a;
                gtxVar.c.a();
                gtxVar.d();
                break;
            case 7:
                ((gtx) this.a).k();
                break;
            case 8:
                gue gueVar = (gue) this.a;
                gueVar.n.g();
                gueVar.d.b();
                gueVar.d();
                gueVar.l = SystemClock.uptimeMillis() + 1000;
                break;
            case 9:
                gue gueVar2 = (gue) this.a;
                hms hmsVar = (hms) ((rwg) gueVar2.c).a;
                if (!hmsVar.g()) {
                    jra jraVarA = jra.a(hmsVar.d());
                    float radians = (float) Math.toRadians(jraVarA.b);
                    float radians2 = (float) Math.toRadians(jraVarA.c);
                    gueVar2.k = rwc.j(jraVarA);
                    if (!((Boolean) gueVar2.e.dL()).booleanValue()) {
                        if (!gueVar2.m) {
                            ((sgt) gue.a.c().M(1052)).G("Can not update PitchRollIndicator: cameraCoachHudController = %s, inAppNotificationController = %s, isHintEnabled = %s,", true, true, Boolean.valueOf(gueVar2.m));
                            break;
                        } else {
                            long jUptimeMillis = SystemClock.uptimeMillis();
                            if (jUptimeMillis >= gueVar2.l) {
                                gueVar2.l = jUptimeMillis + gue.b;
                                gux guxVar = gueVar2.n;
                                guxVar.f();
                                guh guhVar = gueVar2.d;
                                guhVar.a(radians, radians2, SystemClock.uptimeMillis());
                                if (!guhVar.b.c()) {
                                    guxVar.g();
                                    gueVar2.d();
                                    break;
                                } else {
                                    gtn gtnVar = (gtn) ((rwg) gueVar2.f).a;
                                    if (gtnVar.b && gtnVar.c && gtnVar.d.h()) {
                                        CameraCoachHudView cameraCoachHudView = (CameraCoachHudView) gtnVar.d.c();
                                        cameraCoachHudView.post(new gtq(cameraCoachHudView, radians2, radians, i));
                                    }
                                    boolean z = Math.toDegrees((double) Math.abs(radians2)) < 1.0d || Math.toDegrees((double) Math.abs(radians)) < 1.0d;
                                    gueVar2.j = z;
                                    if (z && gueVar2.h) {
                                        if (!gueVar2.i) {
                                            guxVar.d();
                                        }
                                        gueVar2.i = true;
                                    } else {
                                        gueVar2.i = false;
                                    }
                                    if (!gueVar2.h) {
                                        ((gtn) ((rwg) gueVar2.f).a).e();
                                        ((imi) ((rwg) gueVar2.g).a).g(imk.SECOND_RUN_TOAST);
                                        gueVar2.h = true;
                                        guxVar.e(gueVar2.k);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    ((sgt) ((sgt) gue.a.c().g((char) 1, TimeUnit.SECONDS)).M((char) 1048)).s("Can not update pitch roll indicator because camera orientation feature is empty.");
                    break;
                }
                break;
            case 10:
                gue gueVar3 = (gue) this.a;
                gueVar3.j();
                gueVar3.d();
                break;
            case 11:
                ((gue) this.a).h();
                break;
            case 12:
                ((gum) this.a).a();
                break;
            case 13:
                guk gukVar = (guk) this.a;
                gukVar.b.c();
                tpc tpcVarM = sod.a.m();
                soc socVar = soc.ADVICE_SHOWN;
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                sod sodVar = (sod) tpcVarM.b;
                sodVar.f = socVar.aJ;
                sodVar.b |= 1;
                tpc tpcVarM2 = snk.a.m();
                if (!tpcVarM2.b.C()) {
                    tpcVarM2.o();
                }
                snk snkVar = (snk) tpcVarM2.b;
                snkVar.c = 4;
                snkVar.b |= 1;
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                mdy mdyVar = gukVar.h;
                sod sodVar2 = (sod) tpcVarM.b;
                snk snkVar2 = (snk) tpcVarM2.l();
                snkVar2.getClass();
                sodVar2.E = snkVar2;
                sodVar2.c |= 8;
                mdyVar.I(tpcVarM);
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                guk gukVar2 = (guk) this.a;
                if (gukVar2.f.h() && gukVar2.c) {
                    Object objC = gukVar2.f.c();
                    View.OnClickListener onClickListener = gukVar2.e;
                    View.OnClickListener onClickListener2 = gukVar2.d;
                    iso isoVar = (iso) objC;
                    Context context = (Context) isoVar.b;
                    FrameLayout frameLayout = new FrameLayout(context);
                    View.inflate(context, R.layout.selfie_angle_bottom_sheet, frameLayout);
                    Button button = (Button) frameLayout.findViewById(R.id.selfie_angle_bottom_sheet_setting_button);
                    Button button2 = (Button) frameLayout.findViewById(R.id.selfie_angle_bottom_sheet_turn_off_button);
                    button.setOnClickListener(onClickListener2);
                    button2.setOnClickListener(onClickListener);
                    ((mni) isoVar.a).m(4, R.string.selfie_angle_bottom_sheet_title, frameLayout);
                    break;
                }
                break;
            case 15:
                ((gum) this.a).b();
                break;
            case 16:
                gun gunVar = (gun) this.a;
                hms hmsVar2 = (hms) ((rwg) gunVar.a).a;
                if (!hmsVar2.g()) {
                    jrc jrcVar = new jrc(hmsVar2.d().a);
                    nng nngVar = new nng();
                    float[] fArr = new float[16];
                    ojl.bc(jrcVar.a, nngVar);
                    nngVar.b(fArr);
                    float fAsin = (float) Math.asin(fArr[5]);
                    float f = (float) (-Math.asin(fArr[4]));
                    if (fArr[6] > 0.0f) {
                        fAsin = -fAsin;
                        f = -f;
                    }
                    Pair pair = new Pair(Float.valueOf(fAsin), Float.valueOf(f));
                    float fFloatValue = ((Float) pair.first).floatValue();
                    float fFloatValue2 = ((Float) pair.second).floatValue();
                    if (gunVar.c.h() && gunVar.d.h() && gunVar.h) {
                        gup gupVar = gunVar.b;
                        gupVar.a(fFloatValue, fFloatValue2, SystemClock.uptimeMillis());
                        gux guxVar2 = gunVar.j;
                        guxVar2.f();
                        if (gupVar.f.h() && ((gvb) gupVar.f.c()).c()) {
                            gtn gtnVar2 = (gtn) gunVar.d.c();
                            if (gtnVar2.b && gtnVar2.c && gtnVar2.d.h()) {
                                CameraCoachHudView cameraCoachHudView2 = (CameraCoachHudView) gtnVar2.d.c();
                                cameraCoachHudView2.post(new gtq(cameraCoachHudView2, fFloatValue, fFloatValue2, 2));
                            }
                            if (!gunVar.e) {
                                ((gtn) gunVar.d.c()).e();
                                ((imi) gunVar.c.c()).g(imk.SECOND_RUN_TOAST);
                                gunVar.e = true;
                                guxVar2.e(rvk.a);
                            }
                        } else {
                            gunVar.d();
                        }
                        if (gunVar.e) {
                            if (!gun.k(fFloatValue, fFloatValue2)) {
                                gunVar.g = false;
                            } else if (!gunVar.g) {
                                guxVar2.d();
                                gunVar.g = true;
                            }
                        }
                    }
                    gunVar.f = gun.k(((Float) pair.first).floatValue(), ((Float) pair.second).floatValue());
                    break;
                }
                break;
            case 17:
                ((gun) this.a).h();
                break;
            case 18:
                ((gun) this.a).j();
                break;
            case 19:
                gun gunVar2 = (gun) this.a;
                gunVar2.b.b();
                gunVar2.d();
                break;
            default:
                ((hbz) this.a).a();
                break;
        }
    }
}
