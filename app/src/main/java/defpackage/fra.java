package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fra implements mcw, jhh, jhe, jhc {
    public static final sgv a = sgv.g("fra");
    public final Context b;
    public final pbn c;
    private final jgt d;
    private final out e;
    private final Executor f;
    private syu g;
    private final hbj h;

    public fra(Context context, hbj hbjVar, jgt jgtVar, out outVar, Executor executor, pbn pbnVar) {
        this.b = context;
        this.h = hbjVar;
        this.d = jgtVar;
        this.e = outVar;
        this.f = executor;
        this.c = pbnVar;
    }

    @Override // defpackage.jhc
    public final void ea() {
        syu syuVar = this.g;
        if (syuVar == null) {
            return;
        }
        ojl.ck(syuVar, new fqz(this, 0), this.f);
        this.g = null;
    }

    @Override // defpackage.jhe
    public final void eb() {
        if (this.g != null) {
            return;
        }
        this.g = ske.R(new gea(this, 1), this.f);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.h.p(gzo.P)) {
            ins.g(this.e, this.d, this);
        }
    }
}
