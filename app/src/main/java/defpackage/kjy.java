package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kjy implements lmc {
    private static final par a = par.b;
    private static final par b = par.c(25);
    private static final par c = par.c(95);
    private final lss d;
    private final pao e;

    public kjy(lss lssVar, pao paoVar) {
        this.d = lssVar;
        this.e = paoVar;
    }

    @Override // defpackage.lmc
    public final void b(lmo lmoVar) {
        if (lmoVar.b - 1 != 0) {
            return;
        }
        this.d.c(a);
    }

    @Override // defpackage.lmc
    public final void c(lmo lmoVar, lpa lpaVar) {
        if (lmoVar.b == 3) {
            this.d.c(c);
        }
    }

    @Override // defpackage.lmc
    public final void d(lmo lmoVar, ggg gggVar) {
        int i = lmoVar.b - 1;
        if (i == 0) {
            Object obj = gggVar.a;
            nw nwVar = lmoVar.c;
            this.d.ae(Bitmap.createBitmap((int[]) obj, nwVar.a, nwVar.b, Bitmap.Config.ARGB_8888), this.e.e);
            return;
        }
        if (i != 1) {
            return;
        }
        Object obj2 = gggVar.a;
        nw nwVar2 = lmoVar.c;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int[]) obj2, nwVar2.a, nwVar2.b, Bitmap.Config.ARGB_8888);
        Matrix matrix = new Matrix();
        matrix.postRotate(this.e.e);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix, true);
        lss lssVar = this.d;
        lssVar.af(bitmapCreateBitmap2);
        lssVar.X(new nfp(R.string.session_saving_image, new Object[0]));
        lssVar.c(b);
    }

    @Override // defpackage.lmc
    public final void a(lmo lmoVar, ltd ltdVar) {
    }
}
