package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.apps.camera.legacy.lightcycle.ui.PhotoSphereMessageOverlay;
import com.google.android.apps.camera.ui.hotshot.HotshotController;
import com.google.ar.core.R;
import com.google.googlex.gcam.creativecamera.portraitmode.axeo.pAAtrB;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class emz implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public emz(Object obj, boolean z, int i) {
        this.c = i;
        this.b = obj;
        this.a = z;
    }

    public emz(Object obj, boolean z, int i, byte[] bArr) {
        this.c = i;
        this.a = z;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r5v7, types: [eyq, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        String str = "/enter_cuttleface";
        int i = 1;
        int i2 = 0;
        switch (this.c) {
            case 0:
                ((ena) this.b).c().obtainMessage(501, this.a ? 1 : 0, 0).sendToTarget();
                break;
            case 1:
                emj emjVar = (emj) this.b;
                emjVar.b.a(this.a, emjVar.c);
                break;
            case 2:
                fax.g();
                boolean z = this.a;
                nyr nyrVar = ((ezd) this.b).a;
                boolean z2 = nyrVar.a;
                nyrVar.a = z;
                if (z2 != z) {
                    nyrVar.b.a(z);
                    break;
                }
                break;
            case 3:
                fxm fxmVar = (fxm) this.b;
                fxmVar.g.i.a(true);
                fxmVar.o(false, 4);
                boolean z3 = this.a;
                gbb gbbVar = fxmVar.d.e;
                if (!z3) {
                    gbbVar.c.execute(new gba(gbbVar, i2));
                    break;
                } else {
                    gbbVar.c.execute(new gba(gbbVar, i));
                    break;
                }
            case 4:
                boolean z4 = this.a;
                Object obj = this.b;
                if (!z4) {
                    fyq fyqVar = (fyq) obj;
                    fyqVar.a.b(fyqVar.k);
                    break;
                } else {
                    fyq fyqVar2 = (fyq) obj;
                    fyqVar2.a.b(fyqVar2.j);
                    break;
                }
            case 5:
                boolean z5 = this.a;
                Object obj2 = this.b;
                if (!z5) {
                    ((sgt) gop.a.b().M(994)).v("Not showing \"%s\" warning since the app is in the background", obj2);
                    break;
                } else {
                    ((sgt) gop.a.b().M(993)).v(pAAtrB.YTEZPzsrUTV, obj2);
                    break;
                }
            case 6:
                Object obj3 = this.b;
                if (!this.a) {
                    hti htiVar = (hti) obj3;
                    htiVar.L.a(htiVar.C);
                    break;
                } else {
                    hti htiVar2 = (hti) obj3;
                    htiVar2.L.f(htiVar2.C);
                    break;
                }
            case 7:
                htn.b(this.a, (hto) this.b);
                break;
            case 8:
                boolean z6 = this.a;
                Object obj4 = this.b;
                if (z6) {
                    kdb kdbVar = ((jbs) obj4).a.Q;
                    kdbVar.i(kdbVar.c);
                } else {
                    ((jbs) obj4).a.Q.f();
                }
                jby jbyVar = ((jbs) obj4).a;
                if (jbyVar.H) {
                    if (jbyVar.ab.p(gzo.bw)) {
                        if (jbyVar.J) {
                            jbyVar.k.a(ltw.OFF);
                            jbyVar.J = false;
                        }
                        jbyVar.n.o();
                        jbyVar.C.r();
                    } else {
                        owq owqVar = jbyVar.k;
                        Object objDL = owqVar.dL();
                        ltw ltwVar = ltw.OFF;
                        if (objDL == ltwVar) {
                            jbyVar.n.o();
                            jbyVar.C.r();
                        } else if (jbyVar.J) {
                            owqVar.a(ltwVar);
                            jbyVar.C.r();
                            jbyVar.J = false;
                        } else {
                            jbyVar.n.az((ltw) owqVar.dL());
                            jbyVar.C.r();
                        }
                    }
                    kqy kqyVar = jbyVar.Y;
                    kqyVar.getClass();
                    jbyVar.N(kqyVar, jbyVar.J);
                    jbyVar.J(false);
                    rwc rwcVar = jbyVar.z;
                    if (rwcVar.h() && !jbyVar.I) {
                        ((ftv) rwcVar.c()).h();
                    }
                    rwc rwcVar2 = jbyVar.A;
                    if (rwcVar2.h()) {
                        ((mhe) rwcVar2.c()).s();
                        ((mhe) rwcVar2.c()).m(rvk.a);
                    }
                    jbyVar.H = false;
                    jbyVar.I = false;
                    break;
                }
                break;
            case 9:
                PhotoSphereMessageOverlay photoSphereMessageOverlay = (PhotoSphereMessageOverlay) this.b;
                ImageView imageView = (ImageView) photoSphereMessageOverlay.findViewById(R.id.rotate_device_icon);
                boolean z7 = this.a;
                if (photoSphereMessageOverlay.b != z7) {
                    photoSphereMessageOverlay.b = z7;
                    imageView.setImageResource(true != z7 ? R.drawable.ic_pano_rotate_error_ccw : R.drawable.ic_pano_rotate_error_cw);
                }
                if (!photoSphereMessageOverlay.a) {
                    photoSphereMessageOverlay.a = true;
                    imageView.setVisibility(0);
                    photoSphereMessageOverlay.c.h(photoSphereMessageOverlay.getResources().getString(true != z7 ? R.string.rotate_ccw_description : R.string.rotate_cw_description));
                    break;
                }
                break;
            case 10:
                if (this.a) {
                    ((krn) this.b).k.setVisibility(0);
                    break;
                }
                break;
            case 11:
                if (!this.a) {
                    ((krn) this.b).k.setVisibility(8);
                    break;
                }
                break;
            case 12:
                lhk lhkVar = (lhk) this.b;
                nan nanVar = lhkVar.k;
                if (nanVar != null) {
                    lhkVar.y.f(nanVar);
                }
                View view = lhkVar.o;
                if (view != null) {
                    view.setVisibility(8);
                    lhkVar.o.setAlpha(0.0f);
                }
                FrameLayout frameLayout = lhkVar.j;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                    lhkVar.j.setAlpha(0.0f);
                }
                ObjectAnimator objectAnimator = lhkVar.l;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                }
                if (this.a) {
                    lhkVar.i.e();
                    if (lhkVar.s.indexOfChild(lhkVar.o) != -1) {
                        lhkVar.s.removeView(lhkVar.o);
                    }
                    if (lhkVar.q.indexOfChild(lhkVar.j) != -1) {
                        lhkVar.q.removeView(lhkVar.j);
                    }
                    if (lhkVar.r.indexOfChild(lhkVar.p) != -1) {
                        lhkVar.r.removeView(lhkVar.p);
                        break;
                    }
                }
                break;
            case 13:
                ((mod) this.b).a.setEnabled(this.a);
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((HotshotController) this.b).h.c(!this.a);
                break;
            case 15:
                ntf ntfVar = (ntf) this.b;
                boolean z8 = ntfVar.h;
                boolean z9 = this.a;
                if (!z8 && !z9) {
                    str = "/exit_astro_mode";
                }
                ntfVar.k.d(str, String.valueOf(z9).getBytes());
                break;
            case 16:
                ((ntf) this.b).k.d("/enter_cuttleface", String.valueOf(this.a).getBytes());
                break;
            default:
                ((ntf) this.b).k.d("/shutter_button_mode_changed", String.valueOf(this.a).getBytes());
                break;
        }
    }

    public /* synthetic */ emz(Object obj, boolean z, int i, char[] cArr) {
        this.c = i;
        this.b = obj;
        this.a = z;
    }

    public /* synthetic */ emz(boolean z, Object obj, int i) {
        this.c = i;
        this.a = z;
        this.b = obj;
    }
}
