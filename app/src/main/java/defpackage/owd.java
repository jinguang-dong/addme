package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class owd {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;

    public owd(got gotVar, hls hlsVar, apm apmVar) {
        this.b = gotVar;
        this.c = hlsVar;
        this.d = apmVar;
        this.a = true;
    }

    public final boolean a() {
        return ((hbj) this.c).p(gze.n);
    }

    public final boolean b() {
        if (!a()) {
            return false;
        }
        return ((Boolean) ((luj) this.b).b(luf.aY)).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection] */
    public final List c() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList((Collection) this.c);
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final void d(lsz lszVar) {
        boolean zF;
        synchronized (this) {
            this.c.add(lszVar);
            zF = f();
        }
        if (zF) {
            e();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, pbn] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, pbn] */
    public final void e() {
        ArrayList arrayList;
        this.d.f("#notifyPipelineFinished");
        synchronized (this) {
            ?? r1 = this.c;
            arrayList = new ArrayList((Collection) r1);
            r1.clear();
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((lsz) arrayList.get(i)).a();
        }
        this.d.g();
    }

    public final boolean f() {
        return this.a && ((HashSet) this.b).isEmpty();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void g() {
        ojl.ck(((mgp) this.b).a(), new iyn(this, 4), this.c);
    }

    public final synchronized boolean h() {
        return this.a;
    }

    public owd(hbj hbjVar, luj lujVar, luj lujVar2) {
        this.c = hbjVar;
        this.b = lujVar;
        this.d = lujVar2;
    }

    public owd(mgp mgpVar, hbj hbjVar, Executor executor) {
        this.a = true;
        this.b = mgpVar;
        this.d = hbjVar;
        this.c = executor;
    }

    public owd() {
        this(new pbl());
    }

    public owd(int i) {
        this.b = new ReentrantLock();
        this.d = new long[i];
        this.c = new boolean[i];
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    public owd(owe oweVar, pau pauVar, Executor executor) {
        this.c = pauVar;
        this.d = executor;
        this.b = new ArrayList();
        for (int i = 0; i < oweVar.a.size(); i++) {
            this.b.add(null);
        }
        this.a = false;
    }

    public owd(pbn pbnVar) {
        this.b = new HashSet();
        this.a = false;
        this.c = new ArrayList();
        this.d = pbnVar;
    }
}
