package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iua {
    public int a;
    public final Object b;

    public iua() {
        this.b = new long[128];
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, pbr] */
    private final void n() {
        this.b.c(this.a);
    }

    public final synchronized void a(long j) {
        int i = this.a;
        ((long[]) this.b)[i] = j;
        this.a = (i + 1) % 128;
    }

    public final synchronized void b() {
        this.a++;
        n();
    }

    public final synchronized void c() {
        this.a--;
        n();
    }

    public final synchronized boolean d() {
        return this.a > 0;
    }

    public final Object e() {
        int i = this.a;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = (Object[]) this.b;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.a = i2;
        return obj;
    }

    public final void f(Object obj) {
        int i = this.a;
        if (i < 256) {
            ((Object[]) this.b)[i] = obj;
            this.a = i + 1;
        }
    }

    public final void g() {
        ImageView imageView = (ImageView) this.b;
        if (imageView.getDrawable() != null) {
            imageView.getDrawable().setLevel(this.a);
        }
    }

    public final void h() {
        Drawable drawable = ((ImageView) this.b).getDrawable();
        if (drawable != null) {
            je.b(drawable);
        }
    }

    public final void i(AttributeSet attributeSet, int i) {
        int iX;
        Object obj = this.b;
        ImageView imageView = (ImageView) obj;
        Context context = imageView.getContext();
        int[] iArr = fa.f;
        pmg pmgVarJ = pmg.J(context, attributeSet, iArr, i, 0);
        Object obj2 = pmgVarJ.b;
        Context context2 = imageView.getContext();
        int[] iArr2 = con.a;
        col.b((View) obj, context2, iArr, attributeSet, (TypedArray) obj2, i, 0);
        try {
            Drawable drawable = ((ImageView) obj).getDrawable();
            if (drawable == null && (iX = pmgVarJ.x(1, -1)) != -1 && (drawable = byi.bJ(((ImageView) obj).getContext(), iX)) != null) {
                ((ImageView) obj).setImageDrawable(drawable);
            }
            if (drawable != null) {
                je.b(drawable);
            }
            if (pmgVarJ.F(2)) {
                ((ImageView) obj).setImageTintList(pmgVarJ.y(2));
            }
            if (pmgVarJ.F(3)) {
                int iU = pmgVarJ.u(3, -1);
                Rect rect = je.a;
                ((ImageView) obj).setImageTintMode(a.n(iU, null));
            }
        } finally {
            pmgVarJ.D();
        }
    }

    public final void j(Drawable drawable) {
        this.a = drawable.getLevel();
    }

    public final void k(int i) {
        if (i != 0) {
            ImageView imageView = (ImageView) this.b;
            Drawable drawableBJ = byi.bJ(imageView.getContext(), i);
            if (drawableBJ != null) {
                je.b(drawableBJ);
            }
            imageView.setImageDrawable(drawableBJ);
        } else {
            ((ImageView) this.b).setImageDrawable(null);
        }
        h();
    }

    public final boolean l() {
        return !(((ImageView) this.b).getBackground() instanceof RippleDrawable);
    }

    public final synchronized tae m(long j) {
        int i;
        long j2;
        char c;
        int i2;
        int i3 = 128;
        int i4 = 0;
        long j3 = 0;
        if (this.a > 0 || rnt.al((long[]) this.b) != 0) {
            int i5 = this.a;
            int i6 = i5 > 0 ? i5 - 1 : 127;
            Object obj = this.b;
            long j4 = ((long[]) obj)[i6];
            long j5 = j4 - j;
            int i7 = rnt.al((long[]) obj) != 0 ? this.a : 0;
            int i8 = rnt.al((long[]) obj) != 0 ? 128 : this.a;
            i = 0;
            for (int i9 = 0; i9 < i8; i9++) {
                long j6 = ((long[]) obj)[(i7 + i9) % 128];
                if (j5 <= j6 && j6 <= j4) {
                    i++;
                }
            }
        } else {
            i = 0;
        }
        if (i < 2) {
            long j7 = uls.a;
            return new tae(0L, new int[0]);
        }
        int[] iArr = new int[i - 1];
        if (this.a > 0 || rnt.al((long[]) this.b) != 0) {
            int i10 = this.a;
            int i11 = i10 > 0 ? i10 - 1 : 127;
            Object obj2 = this.b;
            long j8 = ((long[]) obj2)[i11];
            long j9 = j8 - j;
            int i12 = rnt.al((long[]) obj2) != 0 ? this.a : 0;
            int i13 = rnt.al((long[]) obj2) != 0 ? 128 : this.a;
            int i14 = -1;
            j2 = 0;
            while (i4 < i13) {
                long j10 = ((long[]) obj2)[(i12 + i4) % i3];
                if (j9 > j10 || j10 > j8) {
                    c = 65535;
                    i14 = i14;
                } else {
                    int i15 = i14;
                    c = 65535;
                    if (i15 == -1) {
                        i2 = -1;
                        j2 = j10;
                    } else {
                        iArr[i15] = (int) ((j10 - j3) / 1000000);
                        i2 = i15;
                    }
                    i14 = i2 + 1;
                    j3 = j10;
                }
                i4++;
                i3 = 128;
            }
        } else {
            j2 = 0;
        }
        long j11 = uls.a;
        return new tae(ujp.k(j3 - j2, ulu.a), iArr);
    }

    public iua(ImageView imageView) {
        this.a = 0;
        this.b = imageView;
    }

    public iua(byte[] bArr) {
        this.b = new Object[256];
    }

    public iua(pbn pbnVar) {
        this.a = 0;
        this.b = pbnVar.b("AliveLock");
    }
}
