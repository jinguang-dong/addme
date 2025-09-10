package defpackage;

import android.os.Handler;
import com.google.googlex.gcam.StaticMetadata;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class glk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public glk(ene eneVar, int i, Handler handler, emw emwVar, int i2) {
        this.e = i2;
        this.c = eneVar;
        this.a = i;
        this.b = handler;
        this.d = emwVar;
    }

    /* JADX WARN: Type inference failed for: r13v2, types: [emw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v21, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, mzd] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        if (i == 0) {
            Object obj = this.d;
            ?? r1 = this.c;
            r1.f(new glm((gln) this.b, (glq) obj, r1));
            r1.g(this.a);
            return;
        }
        if (i == 1) {
            ((ene) this.c).a().obtainMessage(1, this.a, 0, emx.f((Handler) this.b, this.d)).sendToTarget();
            return;
        }
        if (i != 2) {
            String str = "MotionBlurQueue#" + ((String) this.c) + "-" + this.a;
            pbn pbnVar = ((ivx) this.b).e;
            pbnVar.f(str);
            this.d.run();
            pbnVar.g();
            return;
        }
        Object obj2 = this.b;
        ivu ivuVar = (ivu) obj2;
        ovx ovxVar = ivuVar.d;
        boolean zBooleanValue = ((Boolean) ovxVar.d).booleanValue();
        Object obj3 = this.d;
        if (!zBooleanValue) {
            ((sgt) ivu.a.b().M(2411)).s("Processor not available to set options!");
            return;
        }
        Object obj4 = this.c;
        int i2 = this.a;
        AtomicInteger atomicInteger = ivuVar.k;
        if (i2 == atomicInteger.get()) {
            if (((String) obj4).equals(ivuVar.j.get())) {
                return;
            }
        }
        try {
            try {
                ovxVar.a(false);
                ((ivu) obj2).e.f("MotionBlur#setOptions");
                if (!((ivu) obj2).b.i((StaticMetadata) obj3, i2, ((ivu) obj2).g, ((ivu) obj2).h, ((ivu) obj2).f.a())) {
                    throw new IllegalStateException("Processor not initialized!");
                }
                ((ivu) obj2).j.set(obj4);
                atomicInteger.set(i2);
                ((StaticMetadata) obj3).g();
                ivuVar.e.g();
                ivuVar.d.a(true);
            } catch (IllegalStateException e) {
                ((sgt) ((sgt) ivu.a.b().i(e)).M(2409)).s("Error setting options.");
                ivuVar.e.g();
                ivuVar.d.a(true);
            }
        } catch (Throwable th) {
            ivuVar.e.g();
            ivuVar.d.a(true);
            throw th;
        }
    }

    public /* synthetic */ glk(gln glnVar, mzd mzdVar, glq glqVar, int i, int i2) {
        this.e = i2;
        this.b = glnVar;
        this.c = mzdVar;
        this.d = glqVar;
        this.a = i;
    }

    public /* synthetic */ glk(ivu ivuVar, int i, String str, StaticMetadata staticMetadata, int i2) {
        this.e = i2;
        this.b = ivuVar;
        this.a = i;
        this.c = str;
        this.d = staticMetadata;
    }

    public /* synthetic */ glk(ivx ivxVar, String str, int i, Runnable runnable, int i2) {
        this.e = i2;
        this.b = ivxVar;
        this.c = str;
        this.a = i;
        this.d = runnable;
    }
}
