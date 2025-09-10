package defpackage;

import android.graphics.Bitmap;
import android.graphics.Paint;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewj extends ewg {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(a);

    @Override // defpackage.eqi
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.ewg
    protected final Bitmap c(ete eteVar, Bitmap bitmap, int i, int i2) {
        Paint paint = exm.a;
        return (bitmap.getWidth() > i || bitmap.getHeight() > i2) ? exm.b(eteVar, bitmap, i, i2) : bitmap;
    }

    @Override // defpackage.eqi
    public final boolean equals(Object obj) {
        return obj instanceof ewj;
    }

    @Override // defpackage.eqi
    public final int hashCode() {
        return -670243078;
    }
}
