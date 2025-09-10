package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.google.ar.core.R;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nfk extends ViewGroup implements AutoCloseable {
    private final int A;
    private final int B;
    private final int C;
    private final int D;
    private final int E;
    private final int F;
    private boolean G;
    private int H;
    private int I;
    public final int[] a;
    public final Paint b;
    public final Paint c;
    public final List d;
    public final AtomicInteger e;
    public PopupWindow f;
    public boolean g;
    public Runnable h;
    public View i;
    public int j;
    public View k;
    public Rect l;
    public int m;
    public int n;
    public int o;
    public int p;
    public final Object q;
    public long r;
    public long s;
    public long t;
    public List u;
    public final List v;
    public final DisplayManager.DisplayListener w;
    private final Path x;
    private final RectF y;
    private final int z;

    public nfk(Context context) throws Resources.NotFoundException {
        super(context);
        this.d = DesugarCollections.synchronizedList(new ArrayList());
        this.e = new AtomicInteger(Integer.MIN_VALUE);
        this.q = new Object();
        this.v = new ArrayList();
        this.w = new nfj(this, 0);
        this.a = new int[2];
        this.x = new Path();
        this.y = new RectF();
        Paint paint = new Paint();
        this.b = paint;
        Paint paint2 = new Paint();
        this.c = paint2;
        this.A = context.getResources().getDimensionPixelSize(R.dimen.ui_tooltip_horizontal_container_padding);
        this.z = context.getResources().getDimensionPixelSize(R.dimen.ui_tooltip_vertical_container_padding);
        context.getResources().getDimensionPixelSize(R.dimen.ui_tooltip_vertical_animation_movement);
        this.B = context.getResources().getDimensionPixelSize(R.dimen.ui_tooltip_vertical_animation_padding);
        this.p = context.getResources().getDimensionPixelSize(R.dimen.ui_tooltip_margin);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.ui_tooltip_shadow_offset);
        this.C = dimensionPixelSize;
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.ui_tooltip_shadow_radius);
        this.D = context.getResources().getDimensionPixelSize(R.dimen.ui_tooltip_arrow_length);
        this.E = context.getResources().getDimensionPixelSize(R.dimen.ui_tooltip_arrow_base_width);
        this.F = context.getResources().getDimensionPixelSize(R.dimen.ui_tooltip_container_corner_radius);
        int iP = qpt.P(this, R.attr.colorTertiaryContainer);
        int color = context.getColor(R.color.tooltip_container_shadow);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(iP);
        paint.setAntiAlias(true);
        float f = dimensionPixelSize;
        paint.setShadowLayer(dimensionPixelSize2, f, f, color);
        paint2.set(paint);
        paint2.setPathEffect(new CornerPathEffect(getResources().getDimensionPixelSize(R.dimen.ui_tooltip_arrow_radius)));
        this.g = true;
        this.r = 0L;
    }

    private static int c(int i, int i2, int i3) {
        return Math.min(i3, Math.max(i2, i));
    }

    private final Point d() {
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return point;
    }

    private final void e(Canvas canvas) {
        getLocationOnScreen(this.a);
        canvas.save();
        int i = this.j;
        if (nfe.l(i)) {
            canvas.translate(this.p - r0[0], 0.0f);
        } else if (i == 5 || i == 6) {
            canvas.translate(0.0f, this.p - r0[1]);
        }
        canvas.drawPath(this.x, this.c);
        canvas.restore();
    }

    public final int a() {
        View view = this.k;
        if (view == null || view.getDisplay() == null) {
            return this.e.get();
        }
        return this.e.getAndSet(nlj.i(this.k.getDisplay(), this.k.getContext()).e);
    }

    public final void b(boolean z) {
        if (!z) {
            setVisibility(4);
        }
        clearAnimation();
        PopupWindow popupWindow = this.f;
        if (popupWindow != null) {
            popupWindow.dismiss();
        } else {
            setVisibility(4);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        b(false);
        setOnClickListener(null);
        removeAllViews();
        this.d.clear();
        PopupWindow popupWindow = this.f;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        this.f = null;
        this.i = null;
        this.k = null;
        setVisibility(8);
        List list = this.v;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        list.clear();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        if (getVisibility() != 0) {
            return;
        }
        canvas.save();
        int i = this.j;
        if (i == 2 || i == 6) {
            e(canvas);
        }
        RectF rectF = this.y;
        float f = this.F;
        canvas.drawRoundRect(rectF, f, f, this.b);
        int i2 = this.j;
        if (i2 == 1 || i2 == 5) {
            e(canvas);
        }
        canvas.restore();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d5  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onLayout(boolean r18, int r19, int r20, int r21, int r22) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 591
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nfk.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        if (!this.G && (i3 = this.j) != 0) {
            this.j = nfe.a(i3, this);
            this.G = true;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i4 = this.A;
        int i5 = i4 + i4;
        int i6 = this.C;
        int i7 = this.z;
        int i8 = i7 + i7;
        int i9 = this.j;
        int i10 = (size2 - i8) - i6;
        int i11 = (size - i5) - i6;
        if (nfe.l(i9)) {
            i10 -= this.D;
        } else if (i9 == 5 || i9 == 6) {
            i11 -= this.D;
        }
        int iMin = Math.min(d().x, i11);
        View view = this.i;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i10, 0));
            if (this.i.getMeasuredHeight() > i10) {
                this.i.measure(View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE));
            }
        }
        View view2 = this.i;
        if (view2 != null) {
            int measuredWidth = view2.getMeasuredWidth() + i5;
            int measuredHeight = this.i.getMeasuredHeight() + i8;
            RectF rectF = this.y;
            int i12 = this.j;
            rectF.set(i12 == 6 ? this.D : 0.0f, i12 == 2 ? this.D : 0.0f, measuredWidth + (i12 == 6 ? this.D : 0), measuredHeight + (i12 == 2 ? this.D : 0));
        }
        RectF rectF2 = this.y;
        int iWidth = (int) rectF2.width();
        int iHeight = (int) rectF2.height();
        int i13 = this.j;
        int i14 = iHeight + i6;
        int i15 = iWidth + i6;
        if (nfe.l(i13)) {
            i14 += this.D;
        } else if (i13 == 5 || i13 == 6) {
            i15 += this.D;
        }
        setMeasuredDimension(i15, i14);
    }
}
