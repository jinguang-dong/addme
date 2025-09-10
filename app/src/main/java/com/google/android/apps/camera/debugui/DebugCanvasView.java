package com.google.android.apps.camera.debugui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.RectF;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.AttributeSet;
import defpackage.hfo;
import defpackage.rvb;
import defpackage.sbp;
import defpackage.sex;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class DebugCanvasView extends hfo {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public volatile boolean d;
    private final Paint f;
    private final Paint g;
    private final Paint h;
    private final Paint i;
    private final Paint j;
    private final Paint k;
    private final Paint l;
    private volatile List m;
    private volatile List n;
    private volatile List o;
    private volatile MeteringRectangle p;
    private volatile rvb q;
    private volatile List r;
    private volatile List s;
    private volatile List t;
    private volatile List u;

    public DebugCanvasView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.a = paint;
        Paint paint2 = new Paint();
        this.b = paint2;
        Paint paint3 = new Paint();
        this.c = paint3;
        Paint paint4 = new Paint();
        this.f = paint4;
        Paint paint5 = new Paint();
        this.g = paint5;
        Paint paint6 = new Paint();
        this.h = paint6;
        Paint paint7 = new Paint();
        this.i = paint7;
        Paint paint8 = new Paint();
        this.j = paint8;
        Paint paint9 = new Paint();
        this.k = paint9;
        Paint paint10 = new Paint();
        this.l = paint10;
        int i = sbp.d;
        sbp sbpVar = sex.a;
        this.m = sbpVar;
        this.n = sbpVar;
        this.o = sbpVar;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(3.0f);
        paint.setColor(-256);
        paint.setTextSize(48.0f);
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setPathEffect(new DashPathEffect(new float[]{4.0f, 4.0f}, 0.0f));
        paint2.setStrokeWidth(3.0f);
        paint2.setColor(-16711936);
        paint3.setAntiAlias(true);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(3.0f);
        paint3.setColor(-1);
        paint3.setTextSize(30.0f);
        paint4.setAntiAlias(true);
        paint4.setStyle(Paint.Style.STROKE);
        paint4.setStrokeWidth(6.0f);
        paint4.setStrokeMiter(0.6f);
        paint4.setColor(-16776961);
        paint4.setTextSize(64.0f);
        paint5.setColor(-65536);
        paint5.setStrokeWidth(16.0f);
        paint5.setStyle(Paint.Style.STROKE);
        paint6.setColor(-16711936);
        paint6.setStrokeWidth(3.0f);
        paint6.setStyle(Paint.Style.STROKE);
        paint6.setTextSize(48.0f);
        paint7.setColor(-1);
        paint7.setStrokeWidth(3.0f);
        paint7.setStyle(Paint.Style.STROKE);
        paint7.setTextSize(48.0f);
        paint8.setColor(-65536);
        paint8.setStrokeWidth(4.0f);
        paint8.setStyle(Paint.Style.STROKE);
        paint9.setColor(-1);
        paint9.setStrokeWidth(2.0f);
        paint9.setStyle(Paint.Style.STROKE);
        paint10.setColor(-1);
        paint10.setStrokeWidth(2.0f);
        paint10.setStyle(Paint.Style.STROKE);
        paint10.setTextSize(24.0f);
        new RectF();
        this.p = null;
        this.q = null;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        this.e.f();
    }
}
