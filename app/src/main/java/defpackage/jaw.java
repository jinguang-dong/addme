package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jaw implements itm {
    final /* synthetic */ ndj a;
    final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ jbc c;
    final /* synthetic */ jbe d;
    final /* synthetic */ nks e;
    final /* synthetic */ mdy f;

    public jaw(jbc jbcVar, mdy mdyVar, jbe jbeVar, nks nksVar, ndj ndjVar, AtomicBoolean atomicBoolean) {
        this.f = mdyVar;
        this.d = jbeVar;
        this.e = nksVar;
        this.a = ndjVar;
        this.b = atomicBoolean;
        this.c = jbcVar;
    }

    @Override // defpackage.itm
    public final syu a(int i) {
        this.c.k(false);
        if (i - 1 != 1) {
            this.f.D(5, System.currentTimeMillis());
        } else {
            this.f.D(4, System.currentTimeMillis());
        }
        return this.d.a(i);
    }

    @Override // defpackage.itm
    public final syu b(int i) {
        nks nksVar = this.e;
        if (!nksVar.i) {
            syu syuVarB = this.d.b(i);
            new Handler(Looper.getMainLooper()).post(new ivi(this, 17));
            return syuVarB;
        }
        this.f.D(2, System.currentTimeMillis());
        nksVar.b();
        this.a.Y();
        if (!this.b.get()) {
            this.c.v.c();
        }
        return ske.M(true);
    }
}
