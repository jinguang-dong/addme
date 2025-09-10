package defpackage;

import android.graphics.Paint;
import com.google.android.apps.camera.coach.CameraCoachHudView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gua {
    public static final float a = nlj.b(18.0f);
    public static final float b = nlj.b(2.0f);
    public static final float c = nlj.b(12.0f);
    public static final float d = nlj.b(7.0f);
    public final CameraCoachHudView e;
    public final Paint f;
    public final Paint g;
    public final Paint h;
    public boolean i;
    public boolean j;
    public float k;
    public float l;
    public float m = 9.424778f;
    public float n = 9.424778f;
    public float o = 4.0f;

    public gua(CameraCoachHudView cameraCoachHudView) {
        this.e = cameraCoachHudView;
        Paint paint = new Paint();
        this.f = paint;
        paint.setColor(-1);
        paint.setStrokeWidth(nlj.b(1.0f));
        paint.setAntiAlias(true);
        paint.setAlpha(153);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.SQUARE);
        Paint paint2 = new Paint();
        this.g = paint2;
        paint2.setColor(-1);
        paint2.setAntiAlias(true);
        paint2.setAlpha(153);
        Paint paint3 = new Paint();
        this.h = paint3;
        paint3.setColor(-1);
        paint3.setAntiAlias(true);
        paint3.setAlpha(153);
    }

    public final void a() {
        boolean z = this.i;
        this.i = false;
        if (z) {
            this.m = 9.424778f;
            this.n = 9.424778f;
            this.e.invalidate();
        }
    }
}
