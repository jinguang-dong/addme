package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.ConditionVariable;
import android.os.SystemClock;
import androidx.wear.ambient.AmbientDelegate;
import com.google.android.apps.camera.ui.accessibility.AccessibilityAnnouncer;
import com.google.ar.core.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ijo {
    private static final sgv N = sgv.g("ijo");
    public long A;
    public long B;
    public final llj D;
    public iix E;
    public final iiu F;
    public final ijh G;
    public final luj H;
    public final luj I;
    public final hbj J;
    public final mdy K;
    public final cxb L;
    public final AmbientDelegate M;
    private final uem O;
    private final Set P;
    private final Activity Q;
    private final ScheduledExecutorService R;
    private final ilf S;
    private final our T;
    private final ikp U;
    private final imi V;
    private final mbj W;
    private final syj X;
    public final Context a;
    public final ile b;
    public final ikm c;
    public final ijj d;
    public final out e;
    public final owq f;
    public final pbn g;
    public final ndj h;
    public final AccessibilityAnnouncer i;
    public final Set j;
    public final ijb k;
    public final ija l;
    public final iki m;
    public final nan r;
    public final nan s;
    public final nan t;
    public final nan u;
    public final nan v;
    public final nqa w;
    public long y;
    public long z;
    public float n = 0.0f;
    public final AtomicBoolean o = new AtomicBoolean(false);
    public final AtomicInteger p = new AtomicInteger(0);
    public final ConditionVariable q = new ConditionVariable(true);
    public boolean x = false;
    public int C = 1;

    public ijo(Context context, ile ileVar, uem uemVar, llj lljVar, ikm ikmVar, ijj ijjVar, out outVar, imi imiVar, iiu iiuVar, iki ikiVar, hbj hbjVar, owq owqVar, mdy mdyVar, ikp ikpVar, ijh ijhVar, our ourVar, pbn pbnVar, Activity activity, mbj mbjVar, ndj ndjVar, ScheduledExecutorService scheduledExecutorService, AccessibilityAnnouncer accessibilityAnnouncer, Set set, ijb ijbVar, nqa nqaVar, ija ijaVar, ilf ilfVar, cxb cxbVar, syj syjVar, luj lujVar, luj lujVar2) {
        this.a = context;
        this.b = ileVar;
        this.O = uemVar;
        this.D = lljVar;
        this.c = ikmVar;
        this.d = ijjVar;
        this.e = outVar;
        this.V = imiVar;
        this.F = iiuVar;
        this.m = ikiVar;
        this.J = hbjVar;
        this.f = owqVar;
        this.K = mdyVar;
        this.U = ikpVar;
        this.G = ijhVar;
        this.g = pbnVar;
        this.Q = activity;
        this.W = mbjVar;
        this.h = ndjVar;
        this.R = scheduledExecutorService;
        this.i = accessibilityAnnouncer;
        this.j = set;
        this.k = ijbVar;
        this.w = nqaVar;
        this.l = ijaVar;
        this.T = ourVar;
        this.S = ilfVar;
        this.L = cxbVar;
        this.X = syjVar;
        this.H = lujVar;
        this.I = lujVar2;
        ileVar.f();
        this.M = new AmbientDelegate(pbnVar, set);
        ourVar.d(ijaVar.f.dK(new ijl(this, 0), outVar));
        ijbVar.requestLayout();
        ijaVar.o = this;
        nao naoVar = new nao();
        naoVar.h = context;
        naoVar.a = false;
        naoVar.j = 10;
        naoVar.b = 1500;
        naoVar.b();
        naoVar.e = context.getString(R.string.accessibility_imax_too_fast);
        this.r = naoVar.a();
        naoVar.e = context.getString(R.string.accessibility_imax_backtracking);
        this.s = naoVar.a();
        naoVar.e = context.getString(R.string.accessibility_imax_too_much_roll);
        this.t = naoVar.a();
        naoVar.e = context.getString(R.string.imax_too_much_vertical_tilt);
        this.u = naoVar.a();
        naoVar.e = context.getString(R.string.imax_too_much_horizontal_tilt);
        this.v = naoVar.a();
        this.P = new HashSet();
    }

    private final void i(boolean z, float f, int i) {
        this.l.a(false);
        if (!this.o.get()) {
            this.W.c(R.raw.video_stop);
            if (i != 2) {
                if (!z) {
                    this.X.g(1);
                } else if (f >= 1.0f || i != 1) {
                    this.X.g(0);
                }
            }
        }
        this.p.set(0);
    }

    private final void j(Runnable runnable) {
        try {
            this.R.schedule(runnable, 250L, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException unused) {
        }
    }

    public final float a() {
        float fA = (float) this.U.a();
        float f = this.n;
        if (f < 0.0f) {
            fA = -fA;
        }
        return ((360.0f - fA) * f) + fA;
    }

    public final void b() {
        Set set = this.P;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.V.f((imj) it.next());
        }
        set.clear();
    }

    public final void c(String str) {
        nao naoVar = new nao();
        naoVar.h = this.a;
        naoVar.e = str;
        naoVar.j = 12;
        naoVar.a = false;
        nan nanVarA = naoVar.a();
        this.V.a(nanVarA);
        this.P.add(nanVarA);
    }

    public final void d(nan nanVar) {
        this.V.a(nanVar);
        this.P.add(nanVar);
    }

    public final void e() {
        if (this.x) {
            return;
        }
        AtomicInteger atomicInteger = this.p;
        if (atomicInteger.get() == 0) {
            ija ijaVar = this.l;
            if (ijaVar.b()) {
                this.q.close();
                atomicInteger.set(1);
                this.y = SystemClock.uptimeMillis() + 250;
                ijaVar.a(true);
                out outVar = this.e;
                ikm ikmVar = this.c;
                ikmVar.getClass();
                byte[] bArr = null;
                outVar.c(new hvm(ikmVar, 18, bArr));
                this.W.c(R.raw.video_start);
                this.E = ((ilz) this.O).a();
                int rotation = this.Q.getWindowManager().getDefaultDisplay().getRotation() * 90;
                this.S.d(rotation);
                j(new cmu(this, rotation, 15, bArr));
            }
        }
    }

    final void f() {
        out.a();
        if (this.p.get() != 3) {
            e();
        } else {
            b();
            h(true, 1);
        }
    }

    public final void g(int i) {
        b();
        c(ezh.O(i, this.a, this.d.k()));
        ((sgt) N.c().M(2079)).v("Capture stopped reason: %s", new ijm(this, i));
        this.e.execute(new cmu(this, i, 14, null));
    }

    public final void h(boolean z, int i) {
        ilx ilxVar;
        out.a();
        AtomicInteger atomicInteger = this.p;
        int i2 = atomicInteger.get();
        if (this.o.get()) {
            if (i2 != 3 && i2 != 2) {
                return;
            }
        } else if (i2 != 3 || (ilxVar = this.b.c.b) == null || ilxVar.a() == 0) {
            return;
        }
        atomicInteger.set(4);
        this.z = SystemClock.uptimeMillis();
        ijj ijjVar = this.d;
        float fG = ijjVar.g();
        ijjVar.e.set(false);
        this.C = i;
        this.c.d();
        this.g.f("record#prepareToStop");
        ile ileVar = this.b;
        synchronized (ileVar) {
            ileVar.g = true;
        }
        ilc ilcVar = ileVar.c;
        ilcVar.d();
        ilx ilxVar2 = ilcVar.b;
        if (ilxVar2 != null) {
            ilxVar2.a();
        }
        pbn pbnVar = this.g;
        pbnVar.g();
        if (z) {
            pbn pbnVar2 = this.g;
            pbnVar2.f("record#getCapturePreview");
            ile ileVar2 = this.b;
            ileVar2.l.a(new imf(ileVar2, new fym(this, 6), 1, (byte[]) null));
            this.F.b(new fij(13));
            pbnVar2.g();
            i(true, fG, this.C);
            return;
        }
        pbnVar.f("record#stopCapture");
        this.b.g(this.E.a());
        pbnVar.g();
        long j = this.z - this.y;
        mdy mdyVar = this.K;
        long jMax = Math.max(j, 0L);
        int iP = ezh.P(this.C);
        this.E.c();
        mdyVar.L(iP, 0L, jMax, a(), ((Boolean) this.f.dL()).booleanValue());
        i(false, fG, i);
        Set set = this.j;
        synchronized (set) {
            set.remove(this.E.a());
        }
    }
}
