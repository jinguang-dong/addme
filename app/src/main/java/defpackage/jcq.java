package defpackage;

import android.content.Context;
import android.location.LocationManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.camera.legacy.lightcycle.ui.PhotoSphereMessageOverlay;
import com.google.android.apps.camera.ui.hotshot.HotshotController;
import com.google.ar.core.R;
import j$.time.Duration;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class jcq implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public jcq(View view, int i) {
        this.b = i;
        this.a = view;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, owf] */
    @Override // java.lang.Runnable
    public final void run() {
        paq jkfVar;
        int i = 0;
        int i2 = 4;
        switch (this.b) {
            case 0:
                jcv jcvVar = (jcv) this.a;
                pbn pbnVar = jcvVar.b;
                pbnVar.f("changeCamera#startHotshot");
                jcvVar.z.m();
                pbnVar.g();
                break;
            case 1:
                jcv jcvVar2 = (jcv) this.a;
                pbn pbnVar2 = jcvVar2.b;
                pbnVar2.f("resume#startHotshot");
                jcvVar2.z.m();
                pbnVar2.g();
                break;
            case 2:
                jcv jcvVar3 = (jcv) this.a;
                jth jthVar = jcvVar3.U;
                if (jthVar != null) {
                    jcvVar3.j.d(jthVar.c, jthVar.a);
                    break;
                }
                break;
            case 3:
                Object obj = this.a;
                ((jcv) obj).f.d();
                ((fqf) obj).eB();
                break;
            case 4:
                ((fqf) this.a).eB();
                break;
            case 5:
                Object obj2 = this.a;
                ((jcv) obj2).c.h(new jcq(obj2, i2));
                break;
            case 6:
                Object obj3 = this.a;
                ((jcv) obj3).c.h(new jcq(obj3, i2));
                break;
            case 7:
                jcv jcvVar4 = ((jcr) this.a).a;
                if (jcvVar4.t) {
                    jtq jtqVar = jcvVar4.G;
                    if (jtqVar != null) {
                        jtqVar.b(true ^ jcvVar4.c.i());
                    }
                    if (jcvVar4.X.p(gzt.a)) {
                        HotshotController hotshotController = jcvVar4.z;
                        hotshotController.n();
                        if (hotshotController.t()) {
                            jcvVar4.e.execute(new jcq(jcvVar4, i));
                        }
                    }
                    rwc rwcVar = jcvVar4.C;
                    if (rwcVar.h()) {
                        ((hko) rwcVar.c()).e();
                    }
                    jcvVar4.eB();
                    break;
                }
                break;
            case 8:
                jcv jcvVar5 = ((jcu) this.a).a;
                jcvVar5.Q.K.o();
                jcvVar5.R.c(R.raw.camera_shutter);
                break;
            case 9:
                ((TextView) ((PhotoSphereMessageOverlay) this.a).findViewById(R.id.short_info_message)).setVisibility(4);
                break;
            case 10:
                ((TextView) this.a).setVisibility(4);
                break;
            case 11:
                PhotoSphereMessageOverlay photoSphereMessageOverlay = (PhotoSphereMessageOverlay) this.a;
                if (photoSphereMessageOverlay.a) {
                    photoSphereMessageOverlay.a = false;
                    photoSphereMessageOverlay.findViewById(R.id.rotate_device_icon).setVisibility(4);
                    break;
                }
                break;
            case 12:
                ((ovx) this.a).a(true);
                break;
            case 13:
                ((ovx) this.a).a(false);
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                out.a();
                Object obj4 = this.a;
                jib jibVar = (jib) obj4;
                if (jibVar.b == null) {
                    jibVar.b = ((inf) jibVar.a).a();
                }
                LocationManager locationManager = jibVar.b;
                if (locationManager != null) {
                    try {
                        locationManager.requestLocationUpdates("network", 1000L, 0.0f, ((jib) obj4).c[1]);
                    } catch (IllegalArgumentException e) {
                        e.getMessage();
                    } catch (SecurityException unused) {
                    }
                    try {
                        ((jib) obj4).b.requestLocationUpdates("gps", 1000L, 0.0f, ((jib) obj4).c[0]);
                        break;
                    } catch (IllegalArgumentException e2) {
                        e2.getMessage();
                        return;
                    } catch (SecurityException unused2) {
                        return;
                    }
                }
                break;
            case 15:
                jiu jiuVar = (jiu) this.a;
                jiuVar.c(false);
                jiuVar.a();
                break;
            case 16:
                Object obj5 = this.a;
                nhz nhzVar = ((jjx) obj5).a;
                nhzVar.getClass();
                nhzVar.g(((Float) ((ovx) ((jkl) obj5).l).d).floatValue(), false, niz.a);
                break;
            case 17:
                ((jkx) this.a).s();
                break;
            case 18:
                ((jmo) this.a).k();
                break;
            case 19:
                ((jmp) this.a).a();
                break;
            default:
                jmp jmpVar = (jmp) this.a;
                rah rahVar = jmpVar.e;
                if (((Boolean) rahVar.c.dL()).booleanValue()) {
                    jkfVar = new fhf(19);
                } else {
                    Context context = (Context) rahVar.b;
                    FrameLayout frameLayout = new FrameLayout(context);
                    View.inflate(context, R.layout.longshot_edu_toast_view, frameLayout);
                    ImageView imageView = (ImageView) frameLayout.findViewById(R.id.longshot_edu_image);
                    TextView textView = (TextView) frameLayout.findViewById(R.id.longshot_edu_zoom_text);
                    TextView textView2 = (TextView) frameLayout.findViewById(R.id.longshot_edu_handsfree_text);
                    if (rahVar.a && rahVar.e.dL() == mxj.PHONE_LAYOUT) {
                        int iOrdinal = ((mxm) rahVar.d.dL()).ordinal();
                        if (iOrdinal == 1) {
                            textView.setText(context.getText(R.string.longshot_edu_panel_zoom_landscape));
                            textView2.setText(context.getText(R.string.longshot_edu_panel_lock_landscape));
                            imageView.setImageDrawable(context.getDrawable(R.drawable.ic_ls_useredu_landscape_a));
                        } else if (iOrdinal != 2) {
                            textView.setText(context.getText(R.string.longshot_edu_panel_zoom));
                            textView2.setText(context.getText(R.string.longshot_edu_panel_lock));
                            imageView.setImageDrawable(context.getDrawable(R.drawable.ic_ls_useredu_portrait));
                        } else {
                            textView.setText(context.getText(R.string.longshot_edu_panel_zoom_reverse_landscape));
                            textView2.setText(context.getText(R.string.longshot_edu_panel_lock_reverse_landscape));
                            imageView.setImageDrawable(context.getDrawable(R.drawable.ic_ls_useredu_landscape_b));
                        }
                    } else {
                        textView.setText(context.getText(R.string.longshot_edu_panel_zoom));
                        textView2.setText(context.getText(R.string.longshot_edu_panel_lock));
                        imageView.setImageDrawable(context.getDrawable(R.drawable.ic_ls_useredu_portrait));
                    }
                    ngw ngwVar = jmpVar.a;
                    imi imiVar = jmpVar.d;
                    mld mldVar = new mld();
                    mldVar.c = frameLayout;
                    mldVar.b = (ViewGroup) ngwVar.c;
                    mldVar.a = Duration.ofSeconds(4L);
                    mldVar.j = imiVar;
                    mldVar.h = 1;
                    mle mleVarA = mldVar.a();
                    mleVarA.g = new lsn(mleVarA, new jmr(rahVar, 20), 17);
                    mleVarA.m();
                    jkfVar = new jkf(mleVarA, 12);
                }
                jmpVar.c = jkfVar;
                break;
        }
    }

    public /* synthetic */ jcq(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
