package defpackage;

import android.graphics.Bitmap;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class hcn extends hca {
    private static final sgv d = sgv.g("hcn");
    private pas e;

    public hcn(hcb hcbVar, fqc fqcVar, ltg ltgVar) {
        super(hcbVar, fqcVar, ltgVar);
    }

    private final int j() {
        int i = this.c.c;
        return i > 0 ? i : this.b.e().b;
    }

    private final int k() {
        int i = this.c.e;
        return i > 0 ? i : this.b.e().a;
    }

    private final boolean l() {
        String str = this.c.d;
        return "90".equals(str) || "270".equals(str);
    }

    @Override // defpackage.fqb
    public final fqd b() {
        return fqd.VIDEO;
    }

    @Override // defpackage.fqb
    public final qev h(int i, int i2) {
        try {
            hcb hcbVar = this.a;
            epj epjVarA = hcbVar.a();
            eqi eqiVarI = i(this.b);
            int iJ = l() ? j() : k();
            int iK = l() ? k() : j();
            pas pasVar = this.e;
            if (pasVar == null || iJ != pasVar.a || iK != pasVar.b) {
                this.e = new pas(iJ, iK);
            }
            return new qev(rwc.i((Bitmap) epjVarA.f(hcbVar.b(eqiVarI, this.e)).f((ezs) new ezs().F()).d(this.b.c()).h().get()));
        } catch (InterruptedException | ExecutionException unused) {
            ((sgt) d.b().M(1169)).s("Fails to generate thumbnail");
            return new qev(rvk.a);
        }
    }

    public final String toString() {
        return "VideoItem: ".concat(String.valueOf(String.valueOf(this.b)));
    }
}
