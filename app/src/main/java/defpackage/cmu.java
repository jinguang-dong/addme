package defpackage;

import android.opengl.GLSurfaceView;
import android.os.Process;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.camera.legacy.lightcycle.ui.PhotoSphereMessageOverlay;
import com.google.android.gms.common.internal.oQFY.clFzVRcygwbq;
import com.google.ar.core.R;
import j$.time.Clock;
import j$.time.Duration;
import j$.time.Instant;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cmu implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ cmu(int i, Object obj, int i2) {
        this.c = i2;
        this.a = i;
        this.b = obj;
    }

    public cmu(PhotoSphereMessageOverlay photoSphereMessageOverlay, int i, int i2) {
        this.c = i2;
        this.a = i;
        this.b = photoSphereMessageOverlay;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r3v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17, types: [android.widget.ImageView] */
    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        boolean zIsEmpty;
        ?? r3 = 0;
        ImageView imageView = null;
        ConstraintLayout constraintLayout = null;
        switch (this.c) {
            case 0:
                ((coi) this.b).h(this.a);
                return;
            case 1:
                int i = this.a;
                int[] iArr = uy.a;
                Process.setThreadPriority(i);
                this.b.run();
                return;
            case 2:
                ((emx) this.b).b.a(this.a);
                return;
            case 3:
                ((ena) this.b).c().obtainMessage(502, this.a, 0).sendToTarget();
                return;
            case 4:
                ((enr) this.b).a.a(this.a);
                return;
            case 5:
                ((fjz) this.b).n(this.a);
                return;
            case 6:
                ((fpy) this.b).c(this.a, "Acquiring semaphore");
                Thread.currentThread().interrupt();
                return;
            case 7:
                Object obj = this.b;
                try {
                    ((fpy) obj).h();
                    return;
                } catch (InterruptedException unused) {
                    ((fpy) obj).b.post(new cmu(obj, this.a, 6, r3));
                    return;
                }
            case 8:
                gbe gbeVar = (gbe) this.b;
                gbeVar.c(gbeVar.a.a(this.a));
                return;
            case 9:
                gbe gbeVar2 = (gbe) this.b;
                gbeVar2.c(gbeVar2.a.a(this.a));
                return;
            case 10:
                ((gln) this.b).a.set(this.a, true);
                return;
            case 11:
                Object obj2 = this.b;
                synchronized (obj2) {
                    zIsEmpty = ((heb) obj2).i.isEmpty();
                }
                int i2 = this.a;
                if (zIsEmpty) {
                    heb hebVar = (heb) obj2;
                    hebVar.d.b(a.bE(i2, "watchdog (iteration ", "): no shots in flight; stop watching."));
                    hebVar.c.set(false);
                    return;
                }
                heb hebVar2 = (heb) obj2;
                hebVar2.d.b(a.bE(i2, "watchdog (iteration ", "): checking for stuck shots."));
                Clock clock = hebVar2.f;
                Duration duration = hebVar2.g;
                Instant instant = clock.instant();
                Instant instantMinus = instant.minus(duration);
                ArrayList arrayList = new ArrayList();
                synchronized (obj2) {
                    for (hdz hdzVar : ((heb) obj2).i.values()) {
                        if (!hdzVar.f && hdzVar.g.isBefore(instantMinus)) {
                            arrayList.add(hdzVar);
                        }
                    }
                }
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    hdz hdzVar2 = (hdz) arrayList.get(i3);
                    hebVar2.d.b(ojl.bI("marking shot %d as newly stuck", Long.valueOf(hdzVar2.a)));
                    hdzVar2.d.ifPresent(new fio(obj2, 18));
                    hdzVar2.h(instant);
                }
                if (!arrayList.isEmpty()) {
                    hebVar2.d.h(ojl.bI("Detected %d newly stuck shots", Integer.valueOf(arrayList.size())));
                    hebVar2.o(((hdz) arrayList.get(0)).c);
                }
                hebVar2.n(i2 + 1);
                return;
            case 12:
                String str = "Panorama#takePictureNow: " + this.a;
                Object obj3 = this.b;
                hti htiVar = (hti) obj3;
                pbn pbnVar = htiVar.i;
                pbnVar.f(str);
                jth jthVar = htiVar.O;
                if (jthVar == null) {
                    ((sgt) hti.a.b().M(1525)).s("No active camera");
                    pbnVar.g();
                    return;
                }
                if (!((Boolean) jthVar.b().dL()).booleanValue()) {
                    ((sgt) hti.a.c().M(1524)).s(clFzVRcygwbq.WwyoAl);
                    pbnVar.g();
                    return;
                }
                Boolean bool = (Boolean) htiVar.G.dL();
                if (bool.booleanValue()) {
                    htiVar.l.ak();
                }
                hup hupVar = htiVar.Q;
                if (hupVar != null) {
                    bool.getClass();
                    hupVar.A = bool.booleanValue();
                }
                htiVar.k.c(jthVar, htiVar.I, htiVar.z, htiVar.y).c(new hdk(obj3, bool, 13), htiVar.g);
                htiVar.y.a();
                htiVar.y.d();
                htiVar.y = (meu) htiVar.j.a();
                htiVar.z = false;
                pbnVar.g();
                return;
            case 13:
                int i4 = this.a;
                Object obj4 = this.b;
                int i5 = i4 - 1;
                if (i5 == 0) {
                    huc hucVar = (huc) obj4;
                    View view = hucVar.r;
                    if (view == null) {
                        ujp.c("ghostViewfinderContainer");
                        view = null;
                    }
                    view.setVisibility(0);
                    GLSurfaceView gLSurfaceView = hucVar.q;
                    if (gLSurfaceView == null) {
                        ujp.c("ghostViewfinder");
                        gLSurfaceView = null;
                    }
                    gLSurfaceView.onResume();
                    ConstraintLayout constraintLayout2 = hucVar.l;
                    if (constraintLayout2 == null) {
                        ujp.c("container");
                        constraintLayout2 = null;
                    }
                    constraintLayout2.setClickable(true);
                    ImageView imageView2 = hucVar.m;
                    if (imageView2 == null) {
                        ujp.c("livePreview");
                    } else {
                        r3 = imageView2;
                    }
                    r3.setVisibility(8);
                    return;
                }
                if (i5 == 1) {
                    ConstraintLayout constraintLayout3 = ((huc) obj4).l;
                    if (constraintLayout3 == null) {
                        ujp.c("container");
                    } else {
                        constraintLayout = constraintLayout3;
                    }
                    constraintLayout.setClickable(false);
                    return;
                }
                huc hucVar2 = (huc) obj4;
                View view2 = hucVar2.r;
                if (view2 == null) {
                    ujp.c("ghostViewfinderContainer");
                    view2 = null;
                }
                view2.setVisibility(8);
                GLSurfaceView gLSurfaceView2 = hucVar2.q;
                if (gLSurfaceView2 == null) {
                    ujp.c("ghostViewfinder");
                    gLSurfaceView2 = null;
                }
                gLSurfaceView2.onPause();
                ImageView imageView3 = hucVar2.m;
                if (imageView3 == null) {
                    ujp.c("livePreview");
                } else {
                    imageView = imageView3;
                }
                imageView.setVisibility(0);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((ijo) this.b).h(true, this.a);
                return;
            case 15:
                final int i6 = this.a;
                final ijo ijoVar = (ijo) this.b;
                ijoVar.e.execute(new Runnable() { // from class: ijk
                    /* JADX WARN: Removed duplicated region for block: B:15:0x007d  */
                    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
                    /* JADX WARN: Removed duplicated region for block: B:19:0x0089  */
                    /* JADX WARN: Removed duplicated region for block: B:39:0x00fb  */
                    /* JADX WARN: Type inference failed for: r4v3, types: [sgt, shi] */
                    /* JADX WARN: Type inference failed for: r5v6, types: [sgt, shi] */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void run() {
                        /*
                            Method dump skipped, instructions count: 516
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.ijk.run():void");
                    }
                });
                return;
            case 16:
                ivo ivoVar = (ivo) this.b;
                pbn pbnVar2 = ivoVar.i;
                pbnVar2.f("MotionBlur#beginShot");
                ivt ivtVar = ivoVar.c;
                int i7 = this.a;
                if (!ivtVar.f(i7)) {
                    ivoVar.d(i7);
                }
                pbnVar2.g();
                return;
            case 17:
                Object obj5 = this.b;
                ivo ivoVar2 = (ivo) obj5;
                ivoVar2.e.a(false);
                int i8 = this.a;
                try {
                    ((ivo) obj5).i.f("MotionBlur#analyzeShot");
                    ivt ivtVar2 = ((ivo) obj5).c;
                    iwt iwtVar = ((ivo) obj5).n;
                    synchronized (ivtVar2.b) {
                        long j = ivtVar2.d;
                        if (j != 0) {
                            ivtVar2.c.analyzeShot(j, i8, iwtVar.ordinal());
                            if (!((ivo) obj5).k.c(i8, new cmu(obj5, i8, 16, r3))) {
                                ((ivo) obj5).d(i8);
                            }
                        } else {
                            ((sgt) ivt.a.c().M(2393)).s("analyzeShot(): processor hasn't been initialized.");
                            ((sgt) ivo.a.c().M(2369)).t("Error analyzing shot %s.", i8);
                            ((ivo) obj5).d(i8);
                        }
                    }
                    return;
                } finally {
                    ivoVar2.i.g();
                    ivoVar2.e.a(true);
                }
            case 18:
                int i9 = this.a;
                ((ivx) this.b).c.remove(Integer.valueOf(i9));
                return;
            case 19:
                PhotoSphereMessageOverlay photoSphereMessageOverlay = (PhotoSphereMessageOverlay) this.b;
                TextView textView = (TextView) photoSphereMessageOverlay.findViewById(R.id.short_info_message);
                int i10 = this.a;
                textView.setText(i10);
                textView.setVisibility(0);
                photoSphereMessageOverlay.c.h(photoSphereMessageOverlay.getResources().getString(i10));
                return;
            default:
                ((kqy) this.b).j(true, this.a, false);
                return;
        }
    }

    public cmu(Object obj, int i, int i2) {
        this.c = i2;
        this.b = obj;
        this.a = i;
    }

    public /* synthetic */ cmu(Object obj, int i, int i2, byte[] bArr) {
        this.c = i2;
        this.b = obj;
        this.a = i;
    }
}
