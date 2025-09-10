package defpackage;

import android.app.Activity;
import android.content.Intent;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jhj implements Runnable {
    private final /* synthetic */ int a;
    private final Object b;
    private final Object c;

    public jhj(Object obj, Object obj2, int i) {
        this.a = i;
        this.c = obj2;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, umk] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, java.util.concurrent.Future, syu] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, uhb] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, jhh] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, jhh] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, uhb] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, umk] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        if (i == 0) {
            ((jgt) this.b).k(this.c);
            return;
        }
        if (i == 1) {
            ((jgj) this.b).g(this.c);
            return;
        }
        if (i != 2) {
            if (i == 3) {
                this.c.execute(this.b);
                return;
            }
            if (i == 4) {
                this.b.f((una) this.c, ufg.a);
                return;
            }
            ?? r0 = this.b;
            if (r0.isCancelled()) {
                this.c.g(null);
                return;
            }
            try {
                this.c.fW(a.H(r0));
                return;
            } catch (ExecutionException e) {
                this.c.fW(rnt.aM(ung.w(e)));
                return;
            }
        }
        if (((fdy) this.c).h) {
            return;
        }
        Object obj = this.b;
        Activity activity = (Activity) obj;
        Intent intent = activity.getIntent();
        int i2 = fdo.a;
        if (("android.intent.action.MAIN".equals(intent.getAction()) && intent.getCategories() != null && intent.getCategories().contains("android.intent.category.LAUNCHER")) || fdo.l(activity.getIntent().getAction())) {
            qui quiVar = qui.a;
            if (rcc.e() && quiVar.l == null) {
                quiVar.l = qqx.a();
                qui.b("Primes-tti-end-and-length-ms", quiVar.l.a);
                try {
                    ((Activity) obj).reportFullyDrawn();
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    public jhj(Object obj, jhh jhhVar, int i) {
        this.a = i;
        this.b = obj;
        this.c = jhhVar;
    }

    public jhj(syu syuVar, umk umkVar, int i) {
        this.a = i;
        this.b = syuVar;
        this.c = umkVar;
    }

    public jhj(una unaVar, umk umkVar, int i) {
        this.a = i;
        this.c = unaVar;
        this.b = umkVar;
    }
}
