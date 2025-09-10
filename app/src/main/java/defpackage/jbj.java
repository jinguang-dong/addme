package defpackage;

import com.google.android.apps.camera.ui.remotecontrol.RemoteControlView;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jbj implements Runnable {
    public final /* synthetic */ float a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ jbj(Object obj, float f, int i) {
        this.c = i;
        this.b = obj;
        this.a = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String str2;
        int i = this.c;
        if (i == 0) {
            float f = this.a;
            jbk jbkVar = (jbk) this.b;
            jbkVar.a(f);
            jbm jbmVar = jbkVar.a;
            jbmVar.h.b();
            if (f == 1.0f) {
                jbmVar.g.s();
                jbmVar.J.c(R.raw.camera_shutter);
                return;
            }
            return;
        }
        if (i == 1) {
            float f2 = this.a;
            Object obj = this.b;
            ((ipm) obj).a.a(Float.valueOf(f2));
            return;
        }
        if (i == 2) {
            ((kfn) this.b).g(this.a, -1L);
            return;
        }
        if (i == 3) {
            float f3 = this.a;
            Object obj2 = this.b;
            ((kmn) obj2).a.c(par.b(f3));
            return;
        }
        if (i == 4) {
            ((mkr) this.b).l.J((int) (this.a * 100.0f));
            return;
        }
        if (i != 5) {
            nby nbyVar = (nby) this.b;
            RemoteControlView remoteControlView = nbyVar.c;
            if (remoteControlView != null) {
                float f4 = this.a;
                boolean z = nbyVar.h;
                if (f4 < 0.0f) {
                    remoteControlView.c.setText("");
                    return;
                }
                if (z) {
                    f4 *= 3.2808f;
                    str2 = "ft";
                } else {
                    str2 = "m";
                }
                remoteControlView.c.setText(String.valueOf(String.format("%.1f", Float.valueOf(f4))).concat(str2));
                remoteControlView.e.setVisibility(0);
                return;
            }
            return;
        }
        nby nbyVar2 = (nby) this.b;
        RemoteControlView remoteControlView2 = nbyVar2.c;
        if (remoteControlView2 != null) {
            float f5 = this.a;
            boolean z2 = nbyVar2.h;
            if (f5 < -100.0f || f5 > 200.0f) {
                remoteControlView2.d.setText("");
                return;
            }
            if (z2) {
                f5 = ((f5 * 9.0f) / 5.0f) + 32.0f;
                str = "F";
            } else {
                str = "C";
            }
            remoteControlView2.d.setText(String.valueOf(String.format("%.1f", Float.valueOf(f5))).concat(str));
            remoteControlView2.f.setVisibility(0);
        }
    }

    public jbj(kmn kmnVar, float f, int i) {
        this.c = i;
        this.a = f;
        this.b = kmnVar;
    }
}
