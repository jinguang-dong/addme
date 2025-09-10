package defpackage;

import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum eoe {
    HIGH(0, R.color.banner_background_attention_high, R.color.banner_accent_attention_high, R.color.settingslib_banner_button_background_high),
    MEDIUM(1, R.color.banner_background_attention_medium, R.color.banner_accent_attention_medium, R.color.settingslib_banner_button_background_medium),
    LOW(2, R.color.banner_background_attention_low, R.color.banner_accent_attention_low, R.color.settingslib_banner_button_background_low),
    NORMAL(3, R.color.banner_background_attention_normal, R.color.banner_accent_attention_normal, R.color.settingslib_banner_button_background_normal);

    public final int e;
    public final int f;
    public final int g;
    public final int h;

    eoe(int i2, int i3, int i4, int i5) {
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = i5;
    }
}
