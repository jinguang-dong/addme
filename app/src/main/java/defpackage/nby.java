package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.view.ViewStub;
import com.google.android.apps.camera.ui.remotecontrol.RemoteControlView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nby implements jhh, jhf, jhg {
    public final Context a;
    final Handler b;
    public RemoteControlView c;
    public ViewStub d;
    public nbv e;
    public Intent f;
    public imi j;
    private final lpd k;
    public boolean g = false;
    public boolean h = false;
    private final lpc l = new nbw(this);
    public final BroadcastReceiver i = new nbx(this);

    public nby(Context context, lpd lpdVar) {
        this.a = context;
        this.k = lpdVar;
        this.b = new Handler(context.getMainLooper());
    }

    public final void a(Intent intent) {
        int intExtra = intent.getIntExtra("level", -1) * 100;
        float intExtra2 = intent.getIntExtra("scale", -1);
        RemoteControlView remoteControlView = this.c;
        if (remoteControlView != null) {
            int i = (int) (intExtra / intExtra2);
            if (i < 0 || i > 100) {
                remoteControlView.b.setText("--");
                return;
            }
            remoteControlView.b.setText(i + "%");
        }
    }

    public final void b(int i) {
        this.b.post(new mzp(this, i, 3));
    }

    public final void c(float f) {
        this.b.post(new jbj(this, f, 6));
    }

    @Override // defpackage.jhf
    public final void ej() {
        RemoteControlView remoteControlView = this.c;
        if (remoteControlView != null) {
            remoteControlView.a();
        }
        lpd lpdVar = this.k;
        lpdVar.a(this.l);
        if (lpdVar.a) {
            this.h = lpdVar.b;
            b(lpdVar.c);
            if (lpdVar.d()) {
                c(lpdVar.d);
            }
            if (lpdVar.d()) {
                f(lpdVar.f);
            }
        }
    }

    @Override // defpackage.jhg
    public final void eu() {
        if (this.c != null && this.g) {
            this.j.f(this.e);
            this.a.unregisterReceiver(this.i);
            this.g = false;
        }
        this.k.b(this.l);
        this.j.h(imk.SMARTS);
    }

    public final void f(float f) {
        this.b.post(new jbj(this, f, 5));
    }
}
