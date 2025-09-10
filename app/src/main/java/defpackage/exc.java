package defpackage;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exc extends ewg {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(a);

    @Override // defpackage.eqi
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.ewg
    protected final Bitmap c(ete eteVar, Bitmap bitmap, int i, int i2) {
        return exm.b(eteVar, bitmap, i, i2);
    }

    @Override // defpackage.eqi
    public final boolean equals(Object obj) {
        return obj instanceof exc;
    }

    @Override // defpackage.eqi
    public final int hashCode() {
        return 1572326941;
    }
}
