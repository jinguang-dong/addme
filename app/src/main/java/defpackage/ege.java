package defpackage;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.LocaleList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ege extends Paint {
    public ege() {
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i) {
        super.setAlpha(eli.e(i));
    }

    public ege(int i) {
        super(i);
    }

    public ege(PorterDuff.Mode mode, byte[] bArr) {
        super(1);
        setXfermode(new PorterDuffXfermode(mode));
    }

    public ege(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public final void setTextLocales(LocaleList localeList) {
    }
}
