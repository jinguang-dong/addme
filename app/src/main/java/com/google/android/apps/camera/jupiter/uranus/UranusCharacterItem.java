package com.google.android.apps.camera.jupiter.uranus;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.google.android.material.card.MaterialCardView;
import com.google.ar.core.R;
import defpackage.hyq;
import defpackage.iqz;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class UranusCharacterItem extends MaterialCardView {
    public static final /* synthetic */ int k = 0;
    public iqz g;
    public String h;
    public ImageView i;
    public int j;
    private ImageView n;
    private ProgressBar o;

    public UranusCharacterItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void d(Optional optional) {
        optional.ifPresent(new hyq(this, 20));
    }

    public final void e(boolean z) {
        int i = this.j;
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            setContentDescription(getContext().getString(R.string.uranus_character_joy_not_downloaded_accessibility));
        } else if (i2 != 1) {
            setContentDescription(z ? getContext().getString(R.string.uranus_character_selected_accessibility, this.h) : this.h);
        } else {
            setContentDescription(getContext().getString(R.string.uranus_character_joy_downloading_accessibility));
        }
    }

    public final void f(int i) {
        this.j = i;
        int i2 = i - 1;
        if (i2 == 0) {
            this.n.setVisibility(0);
            this.o.setVisibility(8);
        } else if (i2 != 1) {
            this.n.setVisibility(8);
            this.o.setVisibility(8);
        } else {
            this.n.setVisibility(8);
            this.o.setVisibility(0);
        }
        e(false);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.i = (ImageView) findViewById(R.id.character_image);
        this.n = (ImageView) findViewById(R.id.download_icon);
        this.o = (ProgressBar) findViewById(R.id.download_progress_bar);
    }
}
