package defpackage;

import android.animation.ValueAnimator;
import android.util.AndroidRuntimeException;
import com.google.vr.audio.Cf.qcjAcSmlN;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ctj implements css {
    public static final cti a = new csz();
    public static final cti b = new cta();
    public static final cti c = new ctb();
    public static final cti d = new ctc();
    public static final cti e = new ctd();
    public static final cti f = new cte();
    public static final cti g = new csw();
    public static final cti h = new csx();
    public float i;
    float j;
    boolean k;
    final Object l;
    final ctm m;
    public boolean n;
    public float o;
    public float p;
    public final ArrayList q;
    public final ArrayList r;
    private long s;
    private float t;

    public ctj(ctn ctnVar) {
        this.i = 0.0f;
        this.j = Float.MAX_VALUE;
        this.k = false;
        this.n = false;
        this.o = Float.MAX_VALUE;
        this.p = -3.4028235E38f;
        this.s = 0L;
        this.q = new ArrayList();
        this.r = new ArrayList();
        this.l = null;
        this.m = new csy(ctnVar);
        this.t = 1.0f;
    }

    public static void d(ArrayList arrayList, Object obj) {
        int iIndexOf = arrayList.indexOf(obj);
        if (iIndexOf >= 0) {
            arrayList.set(iIndexOf, null);
        }
    }

    private final void m(boolean z) {
        int i = 0;
        this.n = false;
        csv csvVarA = csv.a();
        csvVarA.a.remove(this);
        ArrayList arrayList = csvVarA.b;
        int iIndexOf = arrayList.indexOf(this);
        if (iIndexOf >= 0) {
            arrayList.set(iIndexOf, null);
            csvVarA.d = true;
        }
        this.s = 0L;
        this.k = false;
        while (true) {
            ArrayList arrayList2 = this.q;
            if (i >= arrayList2.size()) {
                n(arrayList2);
                return;
            } else {
                if (arrayList2.get(i) != null) {
                    ((ctg) arrayList2.get(i)).a(z, this.j);
                }
                i++;
            }
        }
    }

    private static void n(ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    @Override // defpackage.css
    public final void a(long j) {
        long j2 = this.s;
        if (j2 == 0) {
            this.s = j;
            e(this.j);
            return;
        }
        long j3 = j - j2;
        this.s = j;
        float f2 = csv.a().e;
        boolean zH = h(f2 == 0.0f ? 2147483647L : (long) (j3 / f2));
        float fMin = Math.min(this.j, this.o);
        this.j = fMin;
        float fMax = Math.max(fMin, this.p);
        this.j = fMax;
        e(fMax);
        if (zH) {
            m(false);
        }
    }

    final float b() {
        return this.t * 0.75f;
    }

    public void c() {
        if (!csv.a().b()) {
            throw new AndroidRuntimeException("Animations may only be canceled from the same thread as the animation handler");
        }
        if (this.n) {
            m(true);
        }
    }

    final void e(float f2) {
        this.m.b(this.l, f2);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.r;
            if (i >= arrayList.size()) {
                n(arrayList);
                return;
            } else {
                if (arrayList.get(i) != null) {
                    ((cth) arrayList.get(i)).l(this.j);
                }
                i++;
            }
        }
    }

    public abstract void f(float f2);

    /* JADX WARN: Type inference failed for: r0v12, types: [android.animation.ValueAnimator$DurationScaleChangeListener, java.lang.Object] */
    public void g() {
        if (!csv.a().b()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.n) {
            return;
        }
        this.n = true;
        if (!this.k) {
            this.j = this.m.a(this.l);
        }
        float f2 = this.j;
        if (f2 > this.o || f2 < this.p) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        csv csvVarA = csv.a();
        ArrayList arrayList = csvVarA.b;
        if (arrayList.size() == 0) {
            csvVarA.h.i(csvVarA.c);
            csvVarA.e = ValueAnimator.getDurationScale();
            if (csvVarA.f == null) {
                csvVarA.f = new csu(csvVarA);
            }
            final csu csuVar = csvVarA.f;
            if (csuVar.a == null) {
                csuVar.a = new ValueAnimator.DurationScaleChangeListener() { // from class: cst
                    @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                    public final void onChanged(float f3) {
                        ((csv) csuVar.b).e = f3;
                    }
                };
                ValueAnimator.registerDurationScaleChangeListener(csuVar.a);
            }
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public abstract boolean h(long j);

    public final void i(ctg ctgVar) {
        ArrayList arrayList = this.q;
        if (arrayList.contains(ctgVar)) {
            return;
        }
        arrayList.add(ctgVar);
    }

    public final void k(float f2) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum visible change must be positive.");
        }
        this.t = f2;
        f(f2 * 0.75f);
    }

    public final void l(float f2) {
        this.j = f2;
        this.k = true;
    }

    public final void j(cth cthVar) {
        if (this.n) {
            throw new UnsupportedOperationException(qcjAcSmlN.MLSHtEqBLdtfp);
        }
        ArrayList arrayList = this.r;
        if (arrayList.contains(cthVar)) {
            return;
        }
        arrayList.add(cthVar);
    }

    public ctj(Object obj, ctm ctmVar) {
        this.i = 0.0f;
        this.j = Float.MAX_VALUE;
        this.k = false;
        this.n = false;
        this.o = Float.MAX_VALUE;
        this.p = -3.4028235E38f;
        this.s = 0L;
        this.q = new ArrayList();
        this.r = new ArrayList();
        this.l = obj;
        this.m = ctmVar;
        float f2 = 0.1f;
        if (ctmVar != d && ctmVar != e && ctmVar != f) {
            if (ctmVar == g) {
                f2 = 0.00390625f;
            } else {
                f2 = 0.002f;
                if (ctmVar != b && ctmVar != c) {
                    f2 = 1.0f;
                }
            }
        }
        this.t = f2;
    }
}
