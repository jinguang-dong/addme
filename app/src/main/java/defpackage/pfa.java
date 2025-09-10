package defpackage;

import android.hardware.camera2.params.MeteringRectangle;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pfa {
    public final pfq a;
    public final pbc b;
    public pdj c;
    public boolean d;
    public boolean e;
    public boolean f;
    private final Executor g;

    public pfa(pfq pfqVar, Executor executor, pbc pbcVar) {
        this.a = pfqVar;
        this.g = executor;
        this.b = pbcVar.a("FS3aUpdater");
        Integer num = pey.a;
        MeteringRectangle[] meteringRectangleArr = pey.b;
        this.c = new pex(new pey(num, num, num, num, num, meteringRectangleArr, meteringRectangleArr, meteringRectangleArr));
        this.e = false;
    }

    public final void a(pdj pdjVar, boolean z) {
        synchronized (this) {
            phd phdVarA = phd.a(this.c);
            Integer numD = pdjVar.d();
            Integer num = pey.a;
            if (!numD.equals(num)) {
                phdVarA.a = pdjVar.d();
            }
            if (!pdjVar.b().equals(num)) {
                phdVarA.b = pdjVar.b();
            }
            if (!pdjVar.a().equals(num)) {
                phdVarA.c = pdjVar.a();
            }
            if (!pdjVar.c().equals(num)) {
                phdVarA.d = pdjVar.c();
            }
            if (!pdjVar.e().equals(num)) {
                phdVarA.e = pdjVar.e();
            }
            MeteringRectangle[] meteringRectangleArrG = pdjVar.g();
            MeteringRectangle[] meteringRectangleArr = pey.b;
            if (!Arrays.equals(meteringRectangleArrG, meteringRectangleArr)) {
                phdVarA.i = pdjVar.g();
            }
            if (!Arrays.equals(pdjVar.f(), meteringRectangleArr)) {
                phdVarA.j = pdjVar.f();
            }
            if (!Arrays.equals(pdjVar.h(), meteringRectangleArr)) {
                phdVarA.k = pdjVar.h();
            }
            this.c = phdVarA.c();
            this.e |= z;
            if (this.f) {
                this.d = true;
                return;
            }
            this.f = true;
            try {
                this.g.execute(new mvn(this, 20));
            } catch (RejectedExecutionException unused) {
                this.b.b("Task to update 3A rejected by the executor.");
            }
        }
    }
}
