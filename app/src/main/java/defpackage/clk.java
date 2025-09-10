package defpackage;

import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class clk {
    final Bundle a;
    public final boolean b;
    boolean c;

    @Deprecated
    public int d;
    public final CharSequence e;
    public final PendingIntent f;
    public final cgh[] g;
    private IconCompat h;

    public clk(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, cgh[] cghVarArr) {
        this.c = true;
        this.h = iconCompat;
        int i = iconCompat.b;
        if ((i == -1 ? ((Icon) iconCompat.c).getType() : i) == 2) {
            this.d = iconCompat.a();
        }
        this.e = clm.c(charSequence);
        this.f = pendingIntent;
        this.a = bundle;
        this.g = cghVarArr;
        this.b = true;
        this.c = true;
    }

    public final IconCompat a() {
        int i;
        if (this.h == null && (i = this.d) != 0) {
            this.h = IconCompat.b(i);
        }
        return this.h;
    }
}
