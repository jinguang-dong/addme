package defpackage;

import android.os.Handler;
import android.os.HandlerThread;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class emr extends ene {
    public static final eny a = new eny("AndCamAgntImp");
    private static final enr h = new emg();
    public enm b;
    public ems c;
    public final emn d;
    public final ent e;
    public final enu f;
    public enr g;
    private final HandlerThread j;

    public emr() {
        this.g = h;
        HandlerThread handlerThread = new HandlerThread("Camera Handler Thread");
        this.j = handlerThread;
        handlerThread.start();
        emn emnVar = new emn(this, this, handlerThread.getLooper());
        this.d = emnVar;
        this.g = new enr(emnVar);
        this.e = new ent();
        enu enuVar = new enu(emnVar, handlerThread);
        this.f = enuVar;
        enuVar.start();
    }

    @Override // defpackage.ene
    public final Handler a() {
        return this.d;
    }

    @Override // defpackage.ene
    public final enn b() {
        return emi.c();
    }

    @Override // defpackage.ene
    public final enr c() {
        return this.g;
    }

    @Override // defpackage.ene
    protected final ent d() {
        return this.e;
    }

    @Override // defpackage.ene
    public final enu e() {
        return this.f;
    }

    @Override // defpackage.ene
    public final void f(enr enrVar) {
        this.g = enrVar;
    }
}
