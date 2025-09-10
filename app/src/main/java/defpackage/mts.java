package defpackage;

import android.content.Context;
import android.hardware.SensorEventListener;
import android.os.Vibrator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mts implements jhh, jgz, jhe, jhc {
    public static final long[] a = {0, 150, 75, 150};
    public final mdy b;
    private SensorEventListener c;
    private boolean d;
    private boolean e;
    private boolean f;
    private final lat g;
    private final ocq h;

    public mts(Context context, fvu fvuVar, lat latVar, mdy mdyVar, owf owfVar) {
        ocq ocqVar = new ocq(context);
        this.f = true;
        this.g = latVar;
        this.h = ocqVar;
        this.e = ocqVar.V();
        this.c = new mtr(this, owfVar, (Vibrator) context.getSystemService("vibrator"), fvuVar);
        this.b = mdyVar;
    }

    public final void d(boolean z) {
        this.d = z;
        if (this.f) {
            return;
        }
        if (this.e && z) {
            this.g.h(this.c);
        } else {
            this.g.g(this.c);
        }
    }

    @Override // defpackage.jhc
    public final void ea() {
        this.f = true;
        if (this.d) {
            this.g.g(this.c);
        }
    }

    @Override // defpackage.jhe
    public final void eb() {
        boolean zV = this.h.V();
        this.e = zV;
        if (zV && this.d) {
            this.g.h(this.c);
        }
        this.f = false;
    }

    @Override // defpackage.jgz
    public final void et() {
        this.g.g(this.c);
        this.c = null;
    }
}
