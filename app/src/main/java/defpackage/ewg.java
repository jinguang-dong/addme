package defpackage;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ewg implements eqq {
    @Override // defpackage.eqq
    public final esw b(Context context, esw eswVar, int i, int i2) {
        if (!fax.l(i, i2)) {
            throw new IllegalArgumentException(a.bD(i2, i, "Cannot apply transformation on width: ", " or height: ", " less than or equal to zero and not Target.SIZE_ORIGINAL"));
        }
        ete eteVar = eox.b(context).a;
        Bitmap bitmap = (Bitmap) eswVar.c();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap bitmapC = c(eteVar, bitmap, i, i2);
        return bitmap.equals(bitmapC) ? eswVar : exg.g(bitmapC, eteVar);
    }

    protected abstract Bitmap c(ete eteVar, Bitmap bitmap, int i, int i2);
}
