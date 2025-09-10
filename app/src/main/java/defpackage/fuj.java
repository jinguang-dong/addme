package defpackage;

import com.google.android.apps.camera.autotimer.analysis.jni.BaseCurator;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fuj implements paq {
    public static final sgv a = sgv.g("fuj");
    public final ovx b;
    public final owq c;
    public final fuy d;
    public final uem e;
    public final Executor f;
    public final owf g;
    public final tgq h;
    public final tzj i;
    public final peo j;
    public final pbn k;
    public paq n;
    public final pfu p;
    public final jzw q;
    public final pfl r;
    public BaseCurator l = null;
    public pdn m = null;
    public boolean o = false;

    public fuj(ovx ovxVar, owq owqVar, pfl pflVar, fuy fuyVar, uem uemVar, Executor executor, pfu pfuVar, owf owfVar, tgq tgqVar, jzw jzwVar, tzj tzjVar, pbn pbnVar, peo peoVar) {
        this.b = ovxVar;
        this.c = owqVar;
        this.r = pflVar;
        this.d = fuyVar;
        this.e = uemVar;
        this.f = new szg(executor);
        this.p = pfuVar;
        this.g = owfVar;
        this.h = tgqVar;
        this.q = jzwVar;
        this.i = tzjVar;
        this.j = peoVar;
        this.k = pbnVar;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        this.f.execute(new foh(this, 9));
    }
}
