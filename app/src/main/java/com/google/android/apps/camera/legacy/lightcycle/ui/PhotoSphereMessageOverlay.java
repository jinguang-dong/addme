package com.google.android.apps.camera.legacy.lightcycle.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.ar.core.R;
import defpackage.cmu;
import defpackage.jcq;
import defpackage.jfj;
import defpackage.mwq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PhotoSphereMessageOverlay extends FrameLayout {
    public boolean a;
    public boolean b;
    public mwq c;
    private final int[] d;

    public PhotoSphereMessageOverlay(Context context) {
        super(context);
        this.a = false;
        this.b = true;
        this.d = new int[]{R.id.short_info_message, R.id.long_message_overlay, R.id.rotate_device_icon};
    }

    public final void a() {
        post(new jcq((View) this, 9));
    }

    public final void b(int i) {
        int[] iArr = this.d;
        int length = iArr.length;
        for (int i2 = 0; i2 < 3; i2++) {
            ((FrameLayout.LayoutParams) findViewById(iArr[i2]).getLayoutParams()).gravity = (i == 180 ? 80 : 48) | 1;
        }
    }

    public final void c(int i) {
        post(new cmu(this, i, 19));
    }

    public final void d(boolean z, int i) {
        post(new jfj(this, z, i, 0));
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        View viewFindViewById = findViewById(R.id.short_info_message);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewFindViewById.getLayoutParams();
        int dimension = (int) getResources().getDimension(R.dimen.photosphere_overlay_message_short_layout_width);
        int dimension2 = (int) getResources().getDimension(R.dimen.photosphere_overlay_message_short_layout_height);
        int dimension3 = (int) getResources().getDimension(R.dimen.photosphere_overlay_message_short_layout_marginTop);
        layoutParams.width = dimension;
        layoutParams.height = dimension2;
        layoutParams.setMargins(0, dimension3, 0, 0);
        viewFindViewById.requestLayout();
    }

    public PhotoSphereMessageOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = false;
        this.b = true;
        this.d = new int[]{R.id.short_info_message, R.id.long_message_overlay, R.id.rotate_device_icon};
    }
}
