package defpackage;

import android.graphics.PorterDuff;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum nyu {
    NONE(PorterDuff.Mode.SRC_ATOP),
    COLOR(PorterDuff.Mode.SRC_ATOP),
    ALPHA(PorterDuff.Mode.DST_OUT);

    public final PorterDuff.Mode d;

    nyu(PorterDuff.Mode mode) {
        this.d = mode;
    }
}
