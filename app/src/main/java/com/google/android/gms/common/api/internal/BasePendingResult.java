package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import defpackage.lpa;
import defpackage.oew;
import defpackage.oey;
import defpackage.oez;
import defpackage.ofa;
import defpackage.ofc;
import defpackage.ofr;
import defpackage.ofs;
import defpackage.oft;
import defpackage.ofy;
import defpackage.ogy;
import defpackage.ojl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class BasePendingResult extends oez {
    public static final ThreadLocal b = new ofr();
    public ofc c;
    private Status h;
    private volatile boolean i;
    private boolean j;
    private volatile lpa k;
    private oft resultGuardian;
    private final Object a = new Object();
    private final CountDownLatch e = new CountDownLatch(1);
    private final ArrayList f = new ArrayList();
    private final AtomicReference g = new AtomicReference();
    public boolean d = false;

    @Deprecated
    BasePendingResult() {
        new ofs(Looper.getMainLooper());
        new WeakReference(null);
    }

    public static void j(ofc ofcVar) {
        if (ofcVar instanceof ofa) {
            try {
                ((ofa) ofcVar).fi();
            } catch (RuntimeException e) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(String.valueOf(ofcVar))), e);
            }
        }
    }

    protected abstract ofc a(Status status);

    @Override // defpackage.oez
    public final void e(oey oeyVar) {
        ojl.aq(true, "Callback cannot be null.");
        synchronized (this.a) {
            if (l()) {
                oeyVar.a(this.h);
            } else {
                this.f.add(oeyVar);
            }
        }
    }

    @Override // defpackage.oez
    public final ofc f(TimeUnit timeUnit) {
        ofc ofcVar;
        ojl.av(!this.i, "Result has already been consumed.");
        ojl.av(true, "Cannot await if then() has been called.");
        try {
            if (!this.e.await(0L, timeUnit)) {
                i(Status.c);
            }
        } catch (InterruptedException unused) {
            i(Status.b);
        }
        ojl.av(l(), "Result is not ready.");
        synchronized (this.a) {
            ojl.av(!this.i, "Result has already been consumed.");
            ojl.av(l(), "Result is not ready.");
            ofcVar = this.c;
            this.c = null;
            this.i = true;
        }
        ogy ogyVar = (ogy) this.g.getAndSet(null);
        if (ogyVar != null) {
            ogyVar.a();
        }
        ojl.ay(ofcVar);
        return ofcVar;
    }

    @Deprecated
    public final void i(Status status) {
        synchronized (this.a) {
            if (!l()) {
                k(a(status));
                this.j = true;
            }
        }
    }

    public final void k(ofc ofcVar) {
        synchronized (this.a) {
            if (this.j) {
                j(ofcVar);
                return;
            }
            l();
            ojl.av(!l(), "Results have already been set");
            ojl.av(!this.i, "Result has already been consumed");
            this.c = ofcVar;
            this.h = ofcVar.a();
            this.e.countDown();
            if (this.c instanceof ofa) {
                this.resultGuardian = new oft(this);
            }
            ArrayList arrayList = this.f;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((oey) arrayList.get(i)).a(this.h);
            }
            arrayList.clear();
        }
    }

    public final boolean l() {
        return this.e.getCount() == 0;
    }

    protected BasePendingResult(oew oewVar) {
        new ofs(((ofy) oewVar).a.f);
        new WeakReference(oewVar);
    }
}
