package defpackage;

import com.google.android.apps.camera.facemetadata.conversions.jni.HM.oUZhwRhE;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mhs {
    private mhp a;
    private Runnable b;
    private Runnable c;
    private Executor d;
    private String e;

    public mhs() {
    }

    public final mhp b() {
        mhp mhpVar = this.a;
        if (mhpVar != null) {
            return mhpVar;
        }
        throw new IllegalStateException();
    }

    public final void c(Executor executor) {
        executor.getClass();
        this.d = executor;
    }

    public final void d(String str) {
        str.getClass();
        this.e = str;
    }

    public final void e(Runnable runnable) {
        runnable.getClass();
        this.c = runnable;
    }

    public final void f(Runnable runnable) {
        runnable.getClass();
        this.b = runnable;
    }

    public final void g(mhp mhpVar) {
        mhpVar.getClass();
        this.a = mhpVar;
    }

    public mhs(mht mhtVar) {
        this.a = mhtVar.b;
        this.b = mhtVar.c;
        this.c = mhtVar.d;
        this.d = mhtVar.e;
        this.e = mhtVar.f;
    }

    public final mht a() {
        Runnable runnable;
        Runnable runnable2;
        Executor executor;
        String str;
        rnt.F(b().a(mhp.HEAT_LIGHT), oUZhwRhE.omlKRZALlnAxeOd, b());
        if (this.e != null) {
            rnt.B(!rnt.V(r0), "featureName cannot be blank.");
            mhp mhpVar = this.a;
            if (mhpVar != null && (runnable = this.b) != null && (runnable2 = this.c) != null && (executor = this.d) != null && (str = this.e) != null) {
                return new mht(mhpVar, runnable, runnable2, executor, str);
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }
}
