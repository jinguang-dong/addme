package com.bumptech.glide.manager;

import androidx.lifecycle.OnLifecycleEvent;
import defpackage.cwa;
import defpackage.cwb;
import defpackage.cwc;
import defpackage.cwg;
import defpackage.cwh;
import defpackage.eyt;
import defpackage.eyu;
import defpackage.fax;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class LifecycleLifecycle implements eyt, cwg {
    private final Set a = new HashSet();
    private final cwc b;

    public LifecycleLifecycle(cwc cwcVar) {
        this.b = cwcVar;
        cwcVar.a(this);
    }

    @Override // defpackage.eyt
    public final void a(eyu eyuVar) {
        this.a.add(eyuVar);
        cwb cwbVar = this.b.a;
        if (cwbVar == cwb.a) {
            eyuVar.f();
        } else if (cwbVar.a(cwb.d)) {
            eyuVar.g();
        } else {
            eyuVar.h();
        }
    }

    @Override // defpackage.eyt
    public final void b(eyu eyuVar) {
        this.a.remove(eyuVar);
    }

    @OnLifecycleEvent(a = cwa.ON_DESTROY)
    public void onDestroy(cwh cwhVar) {
        Iterator it = fax.f(this.a).iterator();
        while (it.hasNext()) {
            ((eyu) it.next()).f();
        }
        cwhVar.getLifecycle().c(this);
    }

    @OnLifecycleEvent(a = cwa.ON_START)
    public void onStart(cwh cwhVar) {
        Iterator it = fax.f(this.a).iterator();
        while (it.hasNext()) {
            ((eyu) it.next()).g();
        }
    }

    @OnLifecycleEvent(a = cwa.ON_STOP)
    public void onStop(cwh cwhVar) {
        Iterator it = fax.f(this.a).iterator();
        while (it.hasNext()) {
            ((eyu) it.next()).h();
        }
    }
}
