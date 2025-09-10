package defpackage;

import android.graphics.Bitmap;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class hck extends hca {
    private static final sgv d = sgv.g("hck");
    private final mfq e;

    public hck(hcb hcbVar, fqc fqcVar, mfq mfqVar, ltg ltgVar) {
        super(hcbVar, fqcVar, ltgVar);
        this.e = mfqVar;
    }

    @Override // defpackage.fqb
    public final fqd b() {
        return fqd.b;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [sgt, shi] */
    @Override // defpackage.fqb
    public final qev h(int i, int i2) {
        fqc fqcVar = this.b;
        if (fqcVar.k()) {
            ltd ltdVarD = fqcVar.d();
            ltdVarD.getClass();
            mfq mfqVar = this.e;
            Bitmap bitmapA = mfqVar.a(ltdVarD);
            Integer numB = mfqVar.b(ltdVarD);
            return new qev(rwc.i(bitmapA), numB != null ? numB.intValue() : 0);
        }
        pas pasVar = new pas(i, i2);
        fqcVar.c();
        try {
            hcb hcbVar = this.a;
            Bitmap bitmap = (Bitmap) hcbVar.a().f(hcbVar.b(i(fqcVar), pasVar)).d(fqcVar.c()).h().get();
            fqcVar.c();
            bitmap.getWidth();
            bitmap.getHeight();
            return new qev(rwc.j(bitmap));
        } catch (InterruptedException | ExecutionException e) {
            ((sgt) ((sgt) d.b().i(e)).M((char) 1166)).v("Failed to generate thumbnail for %s", fqcVar.c());
            return new qev(rvk.a);
        }
    }

    public final String toString() {
        return "PhotoItem: ".concat(String.valueOf(String.valueOf(this.b)));
    }
}
