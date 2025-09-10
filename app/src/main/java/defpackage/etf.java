package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class etf implements ete {
    @Override // defpackage.ete
    public final Bitmap a(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.ete
    public final Bitmap b(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.ete
    public void d(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // defpackage.ete
    public final void c() {
    }

    @Override // defpackage.ete
    public final void e(int i) {
    }
}
