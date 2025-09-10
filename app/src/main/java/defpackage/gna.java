package defpackage;

import android.content.Context;
import android.hardware.camera2.CaptureResult;
import com.google.android.apps.camera.ui.gridlines.gBW.mNLbzhCxd;
import com.google.ar.core.R;
import java.util.Timer;
import java.util.TimerTask;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gna extends ojl {
    public boolean a;
    public boolean b;
    public paq c;
    public final nan d;
    public final imi e;
    private final Context f;
    private final Timer g;
    private boolean h;
    private TimerTask i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gna(imi imiVar, Context context, Timer timer) {
        super((short[]) null);
        imiVar.getClass();
        this.e = imiVar;
        this.f = context;
        this.g = timer;
        nao naoVar = new nao();
        naoVar.j = 2;
        naoVar.e = context.getString(R.string.works_best_with_light);
        naoVar.a = true;
        naoVar.h = context;
        this.d = naoVar.a();
    }

    private final void cn() {
        paq paqVar = this.c;
        if (paqVar == null) {
            ujp.c("notificationChipCloseable");
            paqVar = null;
        }
        paqVar.close();
        this.a = false;
    }

    @Override // defpackage.ojl
    public final synchronized void a(poe poeVar) {
        if (this.h) {
            CaptureResult.Key key = nvo.A;
            Float f = (Float) poeVar.a(key);
            if (f == null) {
                key.getName();
                return;
            }
            if (jsv.G(f.floatValue()) >= 1.0d) {
                if (this.b) {
                    cm();
                }
                if (this.a) {
                    cn();
                }
            } else if (!this.a && !this.b) {
                this.b = true;
                gmz gmzVar = new gmz(this);
                this.i = gmzVar;
                this.g.schedule(gmzVar, 1000L);
            }
        }
    }

    public final synchronized void f() {
        this.h = true;
    }

    public final synchronized void g() {
        if (this.a) {
            cn();
        }
        if (this.b) {
            cm();
        }
        this.h = false;
    }

    private final void cm() {
        TimerTask timerTask = this.i;
        if (timerTask == null) {
            ujp.c(mNLbzhCxd.LwUo);
            timerTask = null;
        }
        timerTask.cancel();
        this.g.purge();
        this.b = false;
    }
}
