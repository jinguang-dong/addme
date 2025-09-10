package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CaptureRequest;
import android.util.AttributeSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pmg {
    public final Object a;
    public final Object b;
    public Object c;

    private pmg(Context context, TypedArray typedArray) {
        this.a = context;
        this.b = typedArray;
    }

    public static pmg H(Context context, int i, int[] iArr) {
        return new pmg(context, context.obtainStyledAttributes(i, iArr));
    }

    public static pmg I(Context context, AttributeSet attributeSet, int[] iArr) {
        return new pmg(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static pmg J(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new pmg(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public static final Set m(phe pheVar) {
        return scn.L(new pej(CaptureRequest.CONTROL_MODE, pheVar.d()), new pej(CaptureRequest.CONTROL_AF_MODE, pheVar.b()), new pej(CaptureRequest.CONTROL_AE_MODE, pheVar.a()), new pej(CaptureRequest.CONTROL_AWB_MODE, pheVar.c()), new pej(CaptureRequest.FLASH_MODE, pheVar.e()), new pej(CaptureRequest.CONTROL_AE_LOCK, pheVar.b), new pej(CaptureRequest.CONTROL_AWB_LOCK, pheVar.c), new pej(CaptureRequest.CONTROL_AF_REGIONS, pheVar.d), new pej(CaptureRequest.CONTROL_AE_REGIONS, pheVar.e), new pej(CaptureRequest.CONTROL_AWB_REGIONS, pheVar.f));
    }

    public static final void n(pfg pfgVar, phe pheVar) {
        pfgVar.f(m(pheVar));
    }

    public final Drawable A(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.b;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return hr.d().g((Context) this.a, resourceId);
    }

    public final CharSequence B(int i) {
        return ((TypedArray) this.b).getText(i);
    }

    public final String C(int i) {
        return ((TypedArray) this.b).getString(i);
    }

    public final void D() {
        ((TypedArray) this.b).recycle();
    }

    public final boolean E(int i, boolean z) {
        return ((TypedArray) this.b).getBoolean(i, z);
    }

    public final boolean F(int i) {
        return ((TypedArray) this.b).hasValue(i);
    }

    public final int G() {
        return ((TypedArray) this.b).getColor(0, 0);
    }

    public final long a() {
        return ((pmb) this.a).b;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, owf] */
    public final synchronized owf b() {
        if (this.c == null) {
            ovx ovxVar = new ovx(0L);
            leg legVar = new leg(this, ovxVar, 11, null);
            owf owfVarG = ((pmj) this.a).g();
            sxo sxoVar = sxo.a;
            owfVarG.dK(legVar, sxoVar);
            ((ovx) this.b).dK(legVar, sxoVar);
            this.c = ovxVar;
        }
        return this.c;
    }

    public final synchronized paq c() {
        return new pme(((owu) this.b).e(), ((pmj) this.a).f.e(), 0);
    }

    public final pmf d(long j) {
        plz plzVarA = ((pmb) this.a).a(j);
        if (plzVarA != null) {
            return new pmf(this, plzVarA);
        }
        return null;
    }

    public final pmf e(long j) {
        plz plzVarB = ((pmb) this.a).b(j);
        if (plzVarB != null) {
            return new pmf(this, plzVarB);
        }
        return null;
    }

    public final syu f(long j) {
        return swz.i(((pmb) this.a).c(j), new kve(this, 17), sxo.a);
    }

    public final void g(long j) {
        if (j != 0) {
            Object obj = this.b;
            ((ovx) obj).c.execute(new ovw(obj, new pmd(j), 0));
        }
    }

    public final paq h() {
        Object obj = this.b;
        ((ReentrantLock) obj).lock();
        return new ngh(obj, 7);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, pdj] */
    public final phd i() {
        paq paqVarH = h();
        try {
            phd phdVarA = phd.a(this.c);
            Object obj = this.c;
            phdVarA.f = ((phe) obj).a;
            phdVarA.g = ((phe) obj).b;
            phdVarA.h = ((phe) obj).c;
            paqVarH.close();
            return phdVarA;
        } catch (Throwable th) {
            try {
                paqVarH.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final phe j() {
        paq paqVarH = h();
        try {
            Object obj = this.c;
            paqVarH.close();
            return (phe) obj;
        } catch (Throwable th) {
            try {
                paqVarH.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void k(phe pheVar, boolean z) {
        paq paqVarH = h();
        try {
            this.c = pheVar;
            if (z) {
                ((pfq) this.a).c(pheVar);
            }
            paqVarH.close();
        } catch (Throwable th) {
            try {
                paqVarH.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void l(boolean z, boolean z2, boolean z3, boolean z4) {
        paq paqVarH = h();
        try {
            phd phdVarB = phd.b((phe) this.c);
            Boolean boolValueOf = Boolean.valueOf(z);
            phdVarB.f = boolValueOf;
            Boolean boolValueOf2 = Boolean.valueOf(z2);
            phdVarB.g = boolValueOf2;
            Boolean boolValueOf3 = Boolean.valueOf(z3);
            phdVarB.h = boolValueOf3;
            this.c = phdVarB.c();
            if (z4) {
                Object obj = this.a;
                phd phdVarA = ((pfq) obj).a();
                phdVarA.f = boolValueOf;
                phdVarA.g = boolValueOf2;
                phdVarA.h = boolValueOf3;
                ((pfq) obj).c(phdVarA.c());
            }
            paqVarH.close();
        } catch (Throwable th) {
            try {
                paqVarH.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, paq] */
    public final void o() {
        this.c.close();
        this.c = new fhf(10);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, owf] */
    public final String p() {
        return (String) this.a.dL();
    }

    public final Object q() {
        long jAc = byi.ac();
        if (jAc == bfp.a) {
            return this.c;
        }
        qzx qzxVar = (qzx) ((AtomicReference) this.b).get();
        int iB = qzxVar.b(jAc);
        if (iB >= 0) {
            return ((Object[]) qzxVar.c)[iB];
        }
        return null;
    }

    public final void r(Object obj) {
        long jAc = byi.ac();
        if (jAc == bfp.a) {
            this.c = obj;
            return;
        }
        synchronized (this.a) {
            Object obj2 = this.b;
            qzx qzxVar = (qzx) ((AtomicReference) obj2).get();
            int iB = qzxVar.b(jAc);
            if (iB >= 0) {
                ((Object[]) qzxVar.c)[iB] = obj;
                return;
            }
            int i = qzxVar.a;
            Object obj3 = qzxVar.c;
            int length = ((Object[]) obj3).length;
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                if (((Object[]) obj3)[i4] != null) {
                    i3++;
                }
            }
            int i5 = i3 + 1;
            long[] jArr = new long[i5];
            Object[] objArr = new Object[i5];
            if (i5 > 1) {
                int i6 = 0;
                while (true) {
                    if (i2 >= i5 || i6 >= i) {
                        break;
                    }
                    long j = ((long[]) qzxVar.b)[i6];
                    Object obj4 = ((Object[]) obj3)[i6];
                    if (j > jAc) {
                        jArr[i2] = jAc;
                        objArr[i2] = obj;
                        i2++;
                        break;
                    } else {
                        if (obj4 != null) {
                            jArr[i2] = j;
                            objArr[i2] = obj4;
                            i2++;
                        }
                        i6++;
                    }
                }
                if (i6 == i) {
                    jArr[i3] = jAc;
                    objArr[i3] = obj;
                } else {
                    while (i2 < i5) {
                        long j2 = ((long[]) qzxVar.b)[i6];
                        Object obj5 = ((Object[]) obj3)[i6];
                        if (obj5 != null) {
                            jArr[i2] = j2;
                            objArr[i2] = obj5;
                            i2++;
                        }
                        i6++;
                    }
                }
            } else {
                jArr[0] = jAc;
                objArr[0] = obj;
            }
            ((AtomicReference) obj2).set(new qzx(i5, jArr, objArr));
        }
    }

    public final int s(int i, int i2) {
        return ((TypedArray) this.b).getDimensionPixelOffset(i, i2);
    }

    public final int t(int i, int i2) {
        return ((TypedArray) this.b).getDimensionPixelSize(i, i2);
    }

    public final int u(int i, int i2) {
        return ((TypedArray) this.b).getInt(i, i2);
    }

    public final int v(int i, int i2) {
        return ((TypedArray) this.b).getInteger(i, i2);
    }

    public final int w(int i, int i2) {
        return ((TypedArray) this.b).getLayoutDimension(i, i2);
    }

    public final int x(int i, int i2) {
        return ((TypedArray) this.b).getResourceId(i, i2);
    }

    public final ColorStateList y(int i) {
        int resourceId;
        ColorStateList colorStateListB;
        TypedArray typedArray = (TypedArray) this.b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListB = clu.b((Context) this.a, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListB;
    }

    public final Drawable z(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : byi.bJ((Context) this.a, resourceId);
    }

    public pmg(gsz gszVar, owf owfVar) {
        this.c = new fgp(5);
        this.a = gszVar;
        this.b = owfVar;
    }

    public pmg(hie hieVar, uem uemVar) {
        this.c = null;
        this.b = hieVar;
        this.a = uemVar;
    }

    public pmg(mni mniVar, Context context) {
        this.c = null;
        this.b = mniVar;
        this.a = context;
    }

    public pmg(owf owfVar) {
        this.b = new Object();
        this.a = owfVar;
    }

    public pmg(owf owfVar, gsz gszVar) {
        this.c = new fgp(6);
        this.a = owfVar;
        this.b = gszVar;
    }

    public pmg(char[] cArr) {
        this.a = new iua((byte[]) null);
        this.b = new iua((byte[]) null);
        this.c = new cji[32];
    }

    public pmg() {
        this.b = new AnimatorSet();
        new Paint(1);
        new Rect();
        new Paint();
        this.a = new RectF();
    }

    public pmg(fgq fgqVar, nle nleVar) {
        this.a = fgqVar;
        this.b = nleVar;
        this.c = new nnw(0);
    }

    public pmg(pfq pfqVar) {
        this.b = new ReentrantLock();
        this.c = pfqVar.a().c();
        this.a = pfqVar;
    }

    public pmg(byte[] bArr) {
        this.b = new AtomicReference(bfo.a);
        this.a = new Object();
    }

    public pmg(pmj pmjVar) {
        this.a = pmjVar;
        this.b = new owu(0L, pmjVar.g);
    }
}
