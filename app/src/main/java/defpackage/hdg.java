package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class hdg implements pau {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ hdg(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11, types: [android.hardware.SensorEventListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object, owq] */
    @Override // defpackage.pau
    public final void a(Object obj) {
        krj krjVar;
        cto ctoVar = null;
        ConstraintLayout constraintLayout = null;
        ConstraintLayout constraintLayout2 = null;
        ConstraintLayout constraintLayout3 = null;
        switch (this.b) {
            case 0:
                ((hdm) this.a).c((nkw) obj);
                break;
            case 1:
                ((gwv) this.a).w(((Boolean) obj).booleanValue() ? gwq.a : gwq.b, true);
                break;
            case 2:
                ((hjy) this.a).d();
                break;
            case 3:
                ((hro) this.a).b(500);
                break;
            case 4:
                ((hro) this.a).b(300);
                break;
            case 5:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ?? r6 = this.a;
                if (!zBooleanValue) {
                    ((hro) r6).i.unregisterListener((SensorEventListener) r6);
                    break;
                } else {
                    SensorManager sensorManager = ((hro) r6).i;
                    Sensor defaultSensor = sensorManager.getDefaultSensor(36);
                    defaultSensor.getClass();
                    sensorManager.registerListener((SensorEventListener) r6, defaultSensor, 3);
                    break;
                }
            case 6:
                ((hrv) this.a).m();
                break;
            case 7:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                Object obj2 = this.a;
                if (!zBooleanValue2) {
                    gzi gziVar = gzp.a;
                    ((ovx) obj2).a(lnm.CONTINUOUS_PICTURE);
                    break;
                } else {
                    ((ovx) obj2).a(lnm.AUTO);
                    break;
                }
            case 8:
                this.a.a((lcy) obj);
                break;
            case 9:
                huw huwVar = (huw) obj;
                hsr hsrVar = (hsr) this.a;
                if (hsrVar.a.b != huwVar.b && (krjVar = hsrVar.b) != null) {
                    krjVar.m(false, krs.SERENGETI_MODE);
                }
                hsrVar.a = huwVar;
                break;
            case 10:
                hti htiVar = (hti) this.a;
                if (htiVar.W.Y()) {
                    htiVar.U.h(htiVar.p.getText(((huw) htiVar.r.dL()).a(false).g));
                    break;
                }
                break;
            case 11:
                ((hti) this.a).n.a(Boolean.valueOf(!a.ao((String) obj, "off")));
                break;
            case 12:
                hti htiVar2 = (hti) this.a;
                if (htiVar2.K.f()) {
                    htiVar2.c();
                    break;
                }
                break;
            case 13:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue3 = bool.booleanValue();
                Object obj3 = this.a;
                if (zBooleanValue3) {
                    hti htiVar3 = (hti) obj3;
                    htiVar3.L.f(htiVar3.D);
                    htiVar3.l.n();
                } else {
                    hti htiVar4 = (hti) obj3;
                    htiVar4.L.f(htiVar4.E);
                    htiVar4.l.m();
                }
                hti htiVar5 = (hti) obj3;
                htiVar5.d();
                bool.getClass();
                htiVar5.f(bool.booleanValue());
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((hti) this.a).e(((Boolean) obj).booleanValue());
                break;
            case 15:
                Object obj4 = this.a;
                huc hucVar = (huc) obj4;
                mxj mxjVar = (mxj) hucVar.b.dL();
                mxjVar.getClass();
                if (huc.i(mxjVar)) {
                    View view = hucVar.n;
                    if (view == null) {
                        ujp.c("background");
                        view = null;
                    }
                    view.setVisibility(0);
                } else {
                    View view2 = hucVar.n;
                    if (view2 == null) {
                        ujp.c("background");
                        view2 = null;
                    }
                    view2.setVisibility(8);
                    View view3 = hucVar.n;
                    if (view3 == null) {
                        ujp.c("background");
                        view3 = null;
                    }
                    view3.setAlpha(0.0f);
                }
                hucVar.g();
                ImageView imageView = hucVar.m;
                if (imageView == null) {
                    ujp.c("livePreview");
                    imageView = null;
                }
                imageView.addOnLayoutChangeListener(new fjt(obj4, 2, null));
                ConstraintLayout constraintLayout4 = hucVar.l;
                if (constraintLayout4 == null) {
                    ujp.c("container");
                    constraintLayout4 = null;
                }
                constraintLayout4.addOnLayoutChangeListener(new fjt(obj4, 3, null));
                break;
            case 16:
                huw huwVar2 = (huw) obj;
                huc hucVar2 = (huc) this.a;
                cto ctoVar2 = hucVar2.s;
                if (ctoVar2 == null) {
                    ujp.c("ghostViewfinderAnimation");
                } else {
                    ctoVar = ctoVar2;
                }
                ctoVar.m(hucVar2.a(huwVar2.c));
                break;
            case 17:
                List list = (List) obj;
                Object obj5 = list.get(0);
                obj5.getClass();
                huw huwVar3 = (huw) obj5;
                Object obj6 = list.get(1);
                obj6.getClass();
                mxm mxmVar = (huwVar3.b() || ((mxj) obj6) == mxj.PHONE_LAYOUT) ? mxm.PORTRAIT : huwVar3.b;
                ConstraintLayout constraintLayout5 = ((huc) this.a).l;
                if (constraintLayout5 == null) {
                    ujp.c("container");
                } else {
                    constraintLayout3 = constraintLayout5;
                }
                qpt.aP(constraintLayout3, mxmVar);
                break;
            case 18:
                boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                Object obj7 = this.a;
                if (!zBooleanValue4) {
                    ConstraintLayout constraintLayout6 = ((huc) obj7).l;
                    if (constraintLayout6 == null) {
                        ujp.c("container");
                    } else {
                        constraintLayout2 = constraintLayout6;
                    }
                    constraintLayout2.setImportantForAccessibility(0);
                    break;
                } else {
                    ConstraintLayout constraintLayout7 = ((huc) obj7).l;
                    if (constraintLayout7 == null) {
                        ujp.c("container");
                    } else {
                        constraintLayout = constraintLayout7;
                    }
                    constraintLayout.setImportantForAccessibility(4);
                    break;
                }
            case 19:
                mxm mxmVar2 = (mxm) obj;
                mxmVar2.getClass();
                ((hup) this.a).K.b(mxmVar2);
                break;
            default:
                Float f = (Float) obj;
                hup hupVar = (hup) this.a;
                float fB = hupVar.b();
                f.getClass();
                int iX = ukj.x(fB * f.floatValue());
                hupVar.j = Math.min(iX, ((Number) ukc.h(hupVar.M.a(gzp.d), Integer.valueOf(hupVar.b()))).intValue());
                hupVar.k = 360.0f / iX;
                hupVar.l = 60.0f / f.floatValue();
                break;
        }
    }
}
