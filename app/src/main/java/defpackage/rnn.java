package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rnn {
    public int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public rnn(byte[] bArr) {
        this.d = new Object();
        this.a = 0;
        this.c = new LinkedHashMap();
        this.b = new LinkedHashSet();
    }

    public final void a(int i) {
        this.a = cmg.e(i, 68);
        cmg.e(i, 20);
        cmg.e(i, 0);
        ((Paint) this.b).setColor(this.a);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
    public final synchronized fsw b(Executor executor) {
        fsw fswVar;
        fswVar = new fsw(executor);
        if (this.a > 0) {
            fswVar.a();
        }
        this.c.add(fswVar);
        return fswVar;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, pbr] */
    public final synchronized paq c() {
        int i = this.a + 1;
        this.a = i;
        this.d.c(i);
        if (this.a == 1) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((fsw) it.next()).a();
            }
        }
        return new fss(this);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, pbr] */
    public final synchronized void d() {
        int i = this.a - 1;
        this.a = i;
        this.d.c(i);
        rnt.L(this.a >= 0);
        if (this.a == 0) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((fsw) it.next()).b();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    public final int e() {
        int i = 3;
        pb pbVar = new pb(3);
        ?? r2 = this.c;
        if (!r2.containsValue(pbVar) && !a.p(f(), 3)) {
            i = 1;
            if (!r2.containsValue(new pb(1)) && !a.p(f(), 1)) {
                return 0;
            }
        }
        return i;
    }

    public final int f() {
        int i;
        synchronized (this.d) {
            i = this.a;
        }
        return i;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Set] */
    public final void g(pb pbVar) {
        int iE = e();
        if (pb.a(iE, pbVar)) {
            return;
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((sc) it.next()).e(iE);
        }
    }

    public rnn(pbn pbnVar, ScheduledExecutorService scheduledExecutorService) {
        this.a = 0;
        this.c = new ArrayList();
        pbr pbrVarB = pbnVar.b("InteractivityReadinessLatch");
        this.d = pbrVarB;
        this.b = scheduledExecutorService;
        pbrVarB.c(this.a);
    }

    public rnn() {
        new Path();
        Paint paint = new Paint();
        this.d = paint;
        this.b = new Paint();
        a(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.c = paint2;
        paint2.setStyle(Paint.Style.FILL);
        new Paint(paint2);
    }
}
