package com.google.android.libraries.memorymonitor;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.googlex.gcam.dirtylens.PrCd.TOnSyMaYeslEl;
import defpackage.qdu;
import defpackage.qdv;
import defpackage.qdx;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MemoryMonitorView extends View {
    public static final float a;
    private static final Runtime h = Runtime.getRuntime();
    public final long b;
    public final long c;
    public final long d;
    public final float e;
    public final qdv f;
    public volatile qdu g;
    private final Resources i;
    private int j;
    private int k;
    private final Paint l;
    private final Paint m;
    private final Paint n;
    private float o;
    private final float p;
    private final float q;
    private final GestureDetector r;
    private final qdx s;

    static {
        a = b(r0.maxMemory());
    }

    public MemoryMonitorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = new qdv();
        this.g = new qdu();
        qdx qdxVar = new qdx(this);
        this.s = qdxVar;
        this.i = context.getResources();
        this.j = a(context, 45);
        this.k = a(context, 140);
        this.l = new Paint();
        Paint paint = new Paint();
        this.m = paint;
        paint.setStrokeWidth(a(context, 1));
        this.p = a(context, 2);
        float fA = a(context, 7);
        this.q = fA;
        Paint paint2 = new Paint();
        this.n = paint2;
        paint2.setColor(-16777216);
        paint2.setTextSize(fA);
        ActivityManager activityManager = (ActivityManager) getContext().getSystemService("activity");
        this.b = activityManager.getMemoryClass();
        this.c = activityManager.getLargeMemoryClass();
        this.d = h.maxMemory();
        this.e = r0.getDisplayMetrics().heightPixels / 2;
        this.r = new GestureDetector(context, qdxVar);
    }

    public static int a(Context context, int i) {
        return Math.round(i * context.getResources().getDisplayMetrics().density);
    }

    public static long b(double d) {
        return Math.round(d / 1048576.0d);
    }

    private final float c(long j) {
        long j2 = this.d;
        if (j2 == 0) {
            return 0.0f;
        }
        return (j / j2) * this.o;
    }

    private final float d(long j, int i, int i2, Canvas canvas, int i3) {
        Paint paint = this.l;
        paint.setColor(i3);
        float fC = c(j);
        float height = (getHeight() - i) - fC;
        float width = (getWidth() * i2) / 3.0f;
        RectF rectF = new RectF(width, height, (getWidth() / 3.0f) + width, height + fC);
        float f = this.p;
        canvas.drawRoundRect(rectF, f, f, paint);
        canvas.drawText(b(j) + "M", (i2 * getWidth()) / 3.0f, ((getHeight() - i) - fC) + (fC / 2.0f) + (this.q / 2.0f), this.n);
        return fC;
    }

    private final void e(int i, Canvas canvas, int i2) {
        d(0L, 0, i, canvas, i2);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        this.j = a(getContext(), 45);
        this.k = a(getContext(), 140);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.l;
        paint.setColor(-7829368);
        this.o = getHeight() * 0.5f;
        RectF rectF = new RectF(0.0f, getHeight() - this.o, getWidth(), getHeight());
        float f = this.p;
        canvas.drawRoundRect(rectF, f, f, paint);
        qdu qduVar = this.g;
        long j = this.f.c;
        long j2 = qduVar.c;
        float fD = d(-j, 0, 0, canvas, -16711936) + 0.0f;
        if (j > 0) {
            d(j, (int) fD, 0, canvas, -2998243);
        }
        long j3 = qduVar.a;
        e(1, canvas, -256);
        long j4 = qduVar.b;
        e(2, canvas, -13068292);
        float height = getHeight();
        long j5 = qduVar.d;
        float fC = height - c(0L);
        Paint paint2 = this.m;
        paint2.setColor(-16777216);
        canvas.drawLine(0.0f, fC, getWidth() / 3.0f, fC, paint2);
        float height2 = getHeight();
        long j6 = qduVar.e;
        float fC2 = height2 - c(0L);
        paint2.setColor(-2998243);
        canvas.drawLine(0.0f, fC2, getWidth() / 3.0f, fC2, paint2);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            size = mode == Integer.MIN_VALUE ? Math.min(this.j, size) : this.j;
        }
        if (mode2 != 1073741824) {
            size2 = mode2 == Integer.MIN_VALUE ? Math.min(this.k, size2) : this.k;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            qdx qdxVar = this.s;
            int i = qdx.d;
            float f = qdxVar.b;
            if (f != qdxVar.a) {
                qdxVar.a("Inflating heap utilization to %.2f%% (%.2f MB)", Float.valueOf(f * 100.0f), Float.valueOf(qdxVar.b * a));
                qdv qdvVar = qdxVar.c.f;
                long jA = qdvVar.c + ((long) ((qdxVar.b - qdv.a()) * qdvVar.a));
                while (qdvVar.c > jA) {
                    if (qdvVar.b.isEmpty()) {
                        break;
                    }
                    qdvVar.c -= ((byte[]) r0.pop()).length;
                }
                while (true) {
                    long j = qdvVar.c;
                    if (j >= jA) {
                        break;
                    }
                    int iMin = (int) Math.min(jA - j, 1048576L);
                    qdvVar.b.push(new byte[iMin]);
                    qdvVar.c += iMin;
                }
            } else {
                MemoryMonitorView memoryMonitorView = qdxVar.c;
                qdu qduVar = memoryMonitorView.g;
                long j2 = qduVar.d;
                long jB = b(0.0d);
                long j3 = qduVar.e;
                long j4 = memoryMonitorView.d;
                long j5 = memoryMonitorView.b;
                long j6 = memoryMonitorView.c;
                qdxVar.a("Red: Artificially inflated Dalvik heap alloc.\nGreen: Dalvik heap alloc.\nYellow: Native heap alloc\nBlue: Other private dirty (GL RAM)\nBlack line: Dalvik heap size: " + jB + "MB\nRed line: Max Dalvik heap memory: " + b(0.0d) + "MB\nGrey background bounds: large heap size: " + b(j4) + "MB (should be the same as the red line)\nDefault heap: " + j5 + " MB; large heap: " + j6 + TOnSyMaYeslEl.vXqxocRNsyGjOsA, new Object[0]);
            }
        }
        return this.r.onTouchEvent(motionEvent);
    }
}
