package defpackage;

import android.graphics.Color;
import android.graphics.Paint;
import com.google.android.apps.camera.coach.CameraCoachHudView;
import java.util.function.BooleanSupplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class guj {
    public final Paint e;
    public final CameraCoachHudView f;
    public final BooleanSupplier g;
    public gui j;
    public gui k;
    public final iso m;
    public final iso n;
    public final iso o;
    public final iso p;
    public final float a = nlj.b(3.0f);
    public final float b = nlj.b(0.0f);
    public final float c = nlj.b(53.0f);
    public final float d = nlj.b(4.0f);
    public boolean h = false;
    public boolean i = false;
    public boolean l = false;

    public guj(CameraCoachHudView cameraCoachHudView, BooleanSupplier booleanSupplier) {
        this.f = cameraCoachHudView;
        this.g = booleanSupplier;
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setStrokeWidth(nlj.b(1.0f));
        paint.setAntiAlias(true);
        paint.setAlpha(255);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setShadowLayer(nlj.b(4.0f), 0.0f, nlj.b(1.0f), -16777216);
        Paint paint2 = new Paint();
        paint2.setColor(Color.parseColor("#FDD663"));
        paint2.setStrokeWidth(nlj.b(1.0f));
        paint2.setAntiAlias(true);
        paint2.setAlpha(255);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.SQUARE);
        paint2.setShadowLayer(nlj.b(4.0f), 0.0f, nlj.b(1.0f), -16777216);
        Paint paint3 = new Paint();
        paint3.setColor(-1);
        paint3.setStrokeWidth(nlj.b(2.0f));
        paint3.setAntiAlias(true);
        paint3.setAlpha(255);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeCap(Paint.Cap.SQUARE);
        paint3.setShadowLayer(nlj.b(4.0f), 0.0f, nlj.b(1.0f), -16777216);
        Paint paint4 = new Paint();
        paint4.setColor(Color.parseColor("#FDD663"));
        paint4.setStrokeWidth(nlj.b(2.0f));
        paint4.setAntiAlias(true);
        paint4.setAlpha(255);
        paint4.setStyle(Paint.Style.STROKE);
        paint4.setStrokeCap(Paint.Cap.SQUARE);
        paint4.setShadowLayer(nlj.b(4.0f), 0.0f, nlj.b(1.0f), -16777216);
        Paint paint5 = new Paint();
        paint5.setColor(-1);
        paint5.setAntiAlias(true);
        paint5.setAlpha(255);
        paint5.setTextAlign(Paint.Align.CENTER);
        paint5.setTextSize(cameraCoachHudView.getResources().getDisplayMetrics().scaledDensity * 14.0f);
        paint5.setShadowLayer(nlj.b(4.0f), 0.0f, nlj.b(1.0f), -16777216);
        Paint paint6 = new Paint();
        paint6.setColor(Color.parseColor("#FDD663"));
        paint6.setAntiAlias(true);
        paint6.setAlpha(255);
        paint6.setTextAlign(Paint.Align.CENTER);
        paint6.setTextSize(cameraCoachHudView.getResources().getDisplayMetrics().scaledDensity * 14.0f);
        paint6.setShadowLayer(nlj.b(4.0f), 0.0f, nlj.b(1.0f), -16777216);
        this.m = new iso(paint2, paint6);
        this.n = new iso(paint4, paint6);
        this.o = new iso(paint, paint5);
        this.p = new iso(paint3, paint5);
        Paint paint7 = new Paint();
        this.e = paint7;
        paint7.setColor(Color.parseColor("#FDD663"));
        paint7.setStrokeWidth(nlj.b(1.0f));
        paint7.setAntiAlias(true);
        paint7.setAlpha(255);
        paint7.setStyle(Paint.Style.STROKE);
        paint7.setStrokeCap(Paint.Cap.SQUARE);
    }

    public final void a() {
        boolean z = this.h;
        this.h = false;
        if (z) {
            this.j = null;
            this.k = null;
            this.l = false;
            this.f.invalidate();
        }
    }
}
