package defpackage;

import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum eog {
    FILLED_NORMAL(0, 0, R.layout.settingslib_expressive_button_filled),
    FILLED_LARGE(0, 1, R.layout.settingslib_expressive_button_filled_large),
    FILLED_EXTRA(0, 2, R.layout.settingslib_expressive_button_filled_extra),
    TONAL_NORMAL(1, 0, R.layout.settingslib_expressive_button_tonal),
    TONAL_LARGE(1, 1, R.layout.settingslib_expressive_button_tonal_large),
    TONAL_EXTRA(1, 2, R.layout.settingslib_expressive_button_tonal_extra),
    OUTLINE_NORMAL(2, 0, R.layout.settingslib_expressive_button_outline),
    OUTLINE_LARGE(2, 1, R.layout.settingslib_expressive_button_outline_large),
    OUTLINE_EXTRA(2, 2, R.layout.settingslib_expressive_button_outline_extra);

    public final int j;
    public final int k;
    public final int l;

    eog(int i, int i2, int i3) {
        this.j = i;
        this.k = i2;
        this.l = i3;
    }
}
