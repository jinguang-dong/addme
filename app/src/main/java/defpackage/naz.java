package defpackage;

import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum naz {
    TOP(R.id.popup_arrow_top, true, -1),
    LEFT(R.id.popup_arrow_left, false, -1),
    RIGHT(R.id.popup_arrow_right, false, 1),
    BOTTOM(R.id.popup_arrow_bottom, true, 1);

    public final int e;
    public final boolean f;
    public final int g;

    naz(int i, boolean z, int i2) {
        this.e = i;
        this.f = z;
        this.g = i2;
    }
}
