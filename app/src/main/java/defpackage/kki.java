package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kki implements lmc {
    final /* synthetic */ szh a;
    final /* synthetic */ pao b;
    final /* synthetic */ szh c;

    public kki(szh szhVar, pao paoVar, szh szhVar2) {
        this.a = szhVar;
        this.b = paoVar;
        this.c = szhVar2;
    }

    @Override // defpackage.lmc
    public final void a(lmo lmoVar, ltd ltdVar) {
        throw new IllegalStateException("No URI expected for thumbnail generation");
    }

    @Override // defpackage.lmc
    public final void c(lmo lmoVar, lpa lpaVar) {
        throw new IllegalStateException("No compressed result expected for thumbnail generation");
    }

    @Override // defpackage.lmc
    public final void d(lmo lmoVar, ggg gggVar) {
        Object obj = gggVar.a;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        nw nwVar = lmoVar.c;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int[]) obj, nwVar.a, nwVar.b, config);
        int i = lmoVar.b;
        if (i == 1) {
            this.a.e(bitmapCreateBitmap);
        } else if (i == 2) {
            Matrix matrix = new Matrix();
            matrix.postRotate(this.b.e);
            this.c.e(Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix, true));
        }
    }

    @Override // defpackage.lmc
    public final void b(lmo lmoVar) {
    }
}
