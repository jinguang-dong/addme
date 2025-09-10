package defpackage;

import android.animation.FloatEvaluator;
import android.animation.IntEvaluator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.Interpolator;
import com.google.ar.core.R;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class huq extends View {
    private float A;
    private final mmx B;
    private final mmp C;
    private final mmp D;
    public final ScheduledExecutorService a;
    public final owf b;
    public final int c;
    public ScheduledFuture d;
    private final hup e;
    private final Paint f;
    private final Paint g;
    private final Paint h;
    private final Paint i;
    private final Paint j;
    private final int k;
    private final int l;
    private final int m;
    private final int n;
    private final float o;
    private final float p;
    private final float q;
    private final float r;
    private final float s;
    private final float t;
    private final Drawable u;
    private final mmp v;
    private final mmp w;
    private final mmp x;
    private final mmp y;
    private final FloatEvaluator z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public huq(Context context, hup hupVar, ScheduledExecutorService scheduledExecutorService, ktx ktxVar, hbj hbjVar, owf owfVar) throws Resources.NotFoundException {
        super(context);
        hupVar.getClass();
        scheduledExecutorService.getClass();
        ktxVar.getClass();
        hbjVar.getClass();
        owfVar.getClass();
        this.e = hupVar;
        this.a = scheduledExecutorService;
        this.b = owfVar;
        int color = getResources().getColor(R.color.serengeti_active, null);
        this.k = color;
        int color2 = getResources().getColor(R.color.serengeti_inactive, null);
        this.l = color2;
        this.m = getResources().getColor(R.color.serengeti_drop_shadow, null);
        int color3 = getResources().getColor(R.color.serengeti_scrim, null);
        this.n = color3;
        float dimension = getResources().getDimension(R.dimen.line_width);
        this.o = dimension;
        this.p = getResources().getDimension(R.dimen.horizon_line_length);
        this.q = getResources().getDimension(R.dimen.level_indicator_length);
        this.r = getResources().getDimension(R.dimen.target_initial_radius);
        float dimension2 = getResources().getDimension(R.dimen.reticle_radius);
        this.s = dimension2;
        float dimension3 = getResources().getDimension(R.dimen.completion_pulse_max_radius);
        this.t = dimension3;
        this.c = getResources().getDimensionPixelSize(R.dimen.arrow_max_size);
        this.u = getResources().getDrawable(R.drawable.pano_arrow, null);
        this.z = new FloatEvaluator();
        this.A = dimension2;
        Paint paint = new Paint();
        paint.setColor(color2);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(dimension);
        paint.setAntiAlias(true);
        this.h = paint;
        Paint paint2 = new Paint();
        paint2.setColor(color2);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(dimension);
        paint2.setAntiAlias(true);
        this.f = paint2;
        Paint paint3 = new Paint();
        paint3.setColor(color2);
        paint3.setAntiAlias(true);
        this.g = paint3;
        Paint paint4 = new Paint();
        paint4.setColor(color3);
        paint4.setAntiAlias(true);
        this.i = paint4;
        Paint paint5 = new Paint();
        paint5.setColor(color);
        paint5.setStyle(Paint.Style.STROKE);
        paint5.setStrokeWidth(dimension);
        paint5.setAlpha(0);
        paint5.setAntiAlias(true);
        this.j = paint5;
        Interpolator interpolator = mmq.a;
        Interpolator interpolator2 = mmq.b;
        this.v = new mmp(interpolator2, dimension, dimension + dimension, 300L);
        this.w = new mmp(interpolator2, dimension + dimension, dimension, 300L);
        Interpolator interpolator3 = mmq.c;
        this.x = new mmp(interpolator3, dimension2, (dimension2 + dimension3) / 2.0f, 500L);
        this.y = new mmp(interpolator3, dimension, dimension3 - dimension2, 500L);
        Interpolator interpolator4 = mmq.a;
        interpolator4.getClass();
        this.B = new mmx(new IntEvaluator(), interpolator4, 255, 0, 400L);
        this.C = new mmp(interpolator4, color2, color);
        this.D = new mmp(interpolator4, color, color2);
    }

    private final int b() {
        return getWidth() / 2;
    }

    private final int c() {
        return getHeight() / 2;
    }

    private final int d() {
        return getWidth() / 8;
    }

    public final int a() {
        return getWidth() / 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01e3  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onDraw(android.graphics.Canvas r30) {
        /*
            Method dump skipped, instructions count: 1380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.huq.onDraw(android.graphics.Canvas):void");
    }
}
