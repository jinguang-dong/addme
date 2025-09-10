package defpackage;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class jpd implements qez {
    public static final sgv a = sgv.g("jpd");
    public final qez b;
    public final Set c = new HashSet();
    public final AtomicInteger d = new AtomicInteger(0);
    public final Object e = new Object();
    public boolean f = false;

    public jpd(qez qezVar) {
        this.b = qezVar;
    }

    @Override // defpackage.qez
    public final qfc a() {
        jpc jpcVar;
        rnt.L(!this.f);
        synchronized (this.e) {
            jpcVar = new jpc(this, this.b.a());
            this.c.add(jpcVar);
            this.d.getAndIncrement();
        }
        return jpcVar;
    }

    @Override // defpackage.qez
    public final syu b() {
        return this.b.b();
    }

    @Override // defpackage.qez
    public final void c() {
        this.b.c();
    }

    @Override // defpackage.qez
    public final void d() {
        this.b.d();
        this.f = true;
    }
}
