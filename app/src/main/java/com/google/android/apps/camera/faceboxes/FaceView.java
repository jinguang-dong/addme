package com.google.android.apps.camera.faceboxes;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.google.ar.core.R;
import defpackage.hkh;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FaceView extends hkh {
    private final Paint b;

    public FaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = getResources();
        Paint paint = new Paint();
        this.b = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(resources.getDimension(R.dimen.face_rectangle_stroke));
        paint.setColor(resources.getColor(R.color.face_rectangle_color, null));
        new HashMap();
    }
}
