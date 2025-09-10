package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.ar.core.R;
import java.io.IOException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class lhk implements lhm {
    private static final sgv z = sgv.g("lhk");
    private final owq A;
    private final ngw B;
    private final Context C;
    private final fvu D;
    private final owf E;
    private final hbj F;
    public long c;
    public final out d;
    public final ScheduledExecutorService e;
    public final Sensor f;
    public final SensorManager h;
    public final npy i;
    public FrameLayout j;
    public nan k;
    public ObjectAnimator l;
    public ScheduledFuture m;
    public TextView n;
    public View o;
    public View p;
    public ViewGroup q;
    public ViewGroup r;
    public ViewGroup s;
    public int t;
    public double u;
    public double v;
    public long w;
    public long x;
    public final imi y;
    public final Object a = new Object();
    public final double[] b = new double[3];
    private final gsn G = new lhh(this);
    public final SensorEventListener g = new jfb(this, 2);

    public lhk(cxb cxbVar, fvu fvuVar, ngw ngwVar, Context context, hbj hbjVar, imi imiVar, out outVar, npy npyVar, owq owqVar, ScheduledExecutorService scheduledExecutorService, owq owqVar2) {
        this.B = ngwVar;
        this.C = context;
        this.F = hbjVar;
        this.D = fvuVar;
        this.y = imiVar;
        this.d = outVar;
        this.i = npyVar;
        this.E = owqVar;
        this.e = scheduledExecutorService;
        this.f = cxbVar.z().getDefaultSensor(4);
        this.h = cxbVar.z();
        this.A = owqVar2;
    }

    public static final void g() {
        gzi gziVar = haw.a;
        gzi gziVar2 = gym.a;
    }

    @Override // defpackage.lhm
    public final void a() {
        e(false);
    }

    @Override // defpackage.lhm
    public final void b() {
        e(true);
        if (this.f != null) {
            this.e.execute(new lgc(this, 11));
        }
        this.D.B(this.G);
    }

    @Override // defpackage.lhm
    public final void c() {
        e(false);
        if (f()) {
            g();
            this.m = this.e.schedule(new lgc(this, 8), true != ((nkw) this.E.dL()).equals(nkw.TIME_LAPSE) ? 300000L : 60000L, TimeUnit.MILLISECONDS);
        }
    }

    @Override // defpackage.lhm
    public final void d() throws XmlPullParserException, Resources.NotFoundException, IOException {
        ocq ocqVar = (ocq) this.B.j;
        this.q = (ViewGroup) ((ConstraintLayout) ocqVar.c(R.id.activity_root_view)).getRootView();
        this.r = (ViewGroup) ocqVar.c(R.id.uncovered_preview_layout);
        this.s = (ViewGroup) ocqVar.c(R.id.capture_overlay_layout);
        this.i.a = new lhi(this);
        Context context = this.C;
        Resources resources = context.getResources();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        View view = new View(context);
        this.o = view;
        view.setLayoutParams(layoutParams);
        this.o.setAlpha(0.0f);
        this.o.setBackgroundColor(-16777216);
        this.o.setVisibility(8);
        FrameLayout frameLayout = new FrameLayout(context);
        this.j = frameLayout;
        frameLayout.setLayoutParams(layoutParams);
        this.j.setAlpha(0.0f);
        this.j.setBackgroundColor(-16777216);
        this.j.setVisibility(8);
        byte[] bArr = null;
        this.j.setOnTouchListener(new fuo(this, 6, bArr));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        View view2 = new View(context);
        this.p = view2;
        view2.setLayoutParams(layoutParams2);
        this.p.setAlpha(0.0f);
        this.p.setBackgroundColor(-16777216);
        this.p.setOnTouchListener(new fuo(this, 7, bArr));
        TextView textView = new TextView(context);
        this.n = textView;
        textView.setText(resources.getString(R.string.notification_enter_power_saving_mode_stage_2));
        this.n.setTextColor(resources.getColor(R.color.frame_based_timer_text_color, null));
        this.n.setTextSize(resources.getDimensionPixelSize(R.dimen.frame_based_timer_text_size) / resources.getDisplayMetrics().scaledDensity);
        cme.a(context, R.font.google_sans_medium_compat, new lhj(this));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2, 49);
        layoutParams3.topMargin = resources.getDimensionPixelSize(R.dimen.power_saving_mode_indicator_top_margin);
        nao naoVar = new nao();
        naoVar.j = 8;
        naoVar.a = true;
        naoVar.h = context;
        naoVar.e = resources.getString(R.string.notification_enter_power_saving_mode);
        this.k = naoVar.a();
        this.j.addView(this.n, layoutParams3);
        this.r.addView(this.p);
        this.s.addView(this.o);
        this.q.addView(this.j);
        this.t = ((FrameLayout.LayoutParams) this.n.getLayoutParams()).topMargin;
        if (this.f != null) {
            this.e.execute(new lgc(this, 12));
        }
        this.D.A(this.G);
    }

    public final void e(boolean z2) {
        ScheduledFuture scheduledFuture = this.m;
        char[] cArr = null;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.m = null;
        }
        if (this.q == null || this.r == null || this.s == null) {
            ((sgt) z.c().M(4154)).s("Screen dimming mode has not been setup.");
        } else {
            this.d.c(new emz(this, z2, 12, cArr));
        }
    }

    public final boolean f() {
        return ((Boolean) this.A.dL()).booleanValue();
    }
}
