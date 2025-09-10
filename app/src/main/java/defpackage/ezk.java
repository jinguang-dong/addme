package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.ar.core.ImageMetadata;
import com.google.ar.core.R;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ezk implements Cloneable {
    public int d;
    public Drawable e;
    public int f;
    public boolean k;
    public boolean p;
    public Resources.Theme q;
    public boolean r;
    public boolean s;
    public boolean u;
    private int v;
    private Drawable w;
    private Drawable x;
    private int y;
    private boolean z;
    public float a = 1.0f;
    public esh b = esh.d;
    public epb c = epb.NORMAL;
    public boolean g = true;
    public int h = -1;
    public int i = -1;
    public eqi j = fag.b;
    public boolean l = true;
    public eqm m = new eqm();
    public Map n = new fal();
    public Class o = Object.class;
    public boolean t = true;

    private final ezk a(ewu ewuVar, eqq eqqVar, boolean z) {
        ezk ezkVarZ = z ? z(ewuVar, eqqVar) : q(ewuVar, eqqVar);
        ezkVarZ.t = true;
        return ezkVarZ;
    }

    private static boolean b(int i, int i2) {
        return (i & i2) != 0;
    }

    final ezk A(Class cls, eqq eqqVar, boolean z) {
        if (this.r) {
            return clone().A(cls, eqqVar, z);
        }
        eoz.k(cls);
        eoz.k(eqqVar);
        this.n.put(cls, eqqVar);
        int i = this.v;
        this.l = true;
        this.v = 67584 | i;
        this.t = false;
        if (z) {
            this.v = i | 198656;
            this.k = true;
        }
        L();
        return this;
    }

    public final boolean B(int i) {
        return b(this.v, i);
    }

    public final boolean C() {
        return fax.l(this.i, this.h);
    }

    public final void D(ewu ewuVar) {
        eql eqlVar = ewu.g;
        eoz.k(ewuVar);
        u(eqlVar, ewuVar);
    }

    public final ezk E() {
        if (this.r) {
            return clone().E();
        }
        this.d = R.drawable.quantum_gm_ic_get_app_white_24;
        int i = this.v | 32;
        this.w = null;
        this.v = i & (-17);
        L();
        return this;
    }

    public final ezk F() {
        return u(exs.a, 0L);
    }

    public final ezk G() {
        if (this.r) {
            return clone().G();
        }
        this.s = true;
        this.v |= ImageMetadata.LENS_APERTURE;
        L();
        return this;
    }

    public final ezk H() {
        if (this.r) {
            return clone().H();
        }
        this.f = R.color.photo_placeholder;
        int i = this.v | 128;
        this.e = null;
        this.v = i & (-65);
        L();
        return this;
    }

    public final ezk I() {
        if (this.r) {
            return clone().I();
        }
        this.g = false;
        this.v |= 256;
        L();
        return this;
    }

    public final ezk J() {
        if (this.r) {
            return clone().J();
        }
        this.u = true;
        this.v |= ImageMetadata.SHADING_MODE;
        L();
        return this;
    }

    public final void K() {
        this.p = true;
    }

    protected final void L() {
        if (this.p) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof ezk) {
            ezk ezkVar = (ezk) obj;
            if (Float.compare(ezkVar.a, this.a) == 0 && this.d == ezkVar.d) {
                Drawable drawable = ezkVar.w;
                char[] cArr = fax.a;
                if (a.ao(null, null) && this.f == ezkVar.f) {
                    Drawable drawable2 = ezkVar.e;
                    if (a.ao(null, null)) {
                        int i = ezkVar.y;
                        Drawable drawable3 = ezkVar.x;
                        if (a.ao(null, null) && this.g == ezkVar.g && this.h == ezkVar.h && this.i == ezkVar.i && this.k == ezkVar.k && this.l == ezkVar.l) {
                            boolean z = ezkVar.z;
                            if (this.s == ezkVar.s && this.b.equals(ezkVar.b) && this.c == ezkVar.c && this.m.equals(ezkVar.m) && this.n.equals(ezkVar.n) && this.o.equals(ezkVar.o) && a.ao(this.j, ezkVar.j) && a.ao(this.q, ezkVar.q)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public ezk f(ezk ezkVar) {
        if (this.r) {
            return clone().f(ezkVar);
        }
        int i = ezkVar.v;
        if (b(i, 2)) {
            this.a = ezkVar.a;
        }
        if (b(i, 262144)) {
            boolean z = ezkVar.z;
            this.z = false;
        }
        if (b(i, ImageMetadata.SHADING_MODE)) {
            this.u = ezkVar.u;
        }
        if (b(i, 4)) {
            this.b = ezkVar.b;
        }
        if (b(i, 8)) {
            this.c = ezkVar.c;
        }
        if (b(i, 16)) {
            Drawable drawable = ezkVar.w;
            this.w = null;
            this.d = 0;
            this.v &= -33;
        }
        if (b(ezkVar.v, 32)) {
            this.d = ezkVar.d;
            this.w = null;
            this.v &= -17;
        }
        if (b(ezkVar.v, 64)) {
            Drawable drawable2 = ezkVar.e;
            this.e = null;
            this.f = 0;
            this.v &= -129;
        }
        if (b(ezkVar.v, 128)) {
            this.f = ezkVar.f;
            this.e = null;
            this.v &= -65;
        }
        int i2 = ezkVar.v;
        if (b(i2, 256)) {
            this.g = ezkVar.g;
        }
        if (b(i2, 512)) {
            this.i = ezkVar.i;
            this.h = ezkVar.h;
        }
        if (b(i2, 1024)) {
            this.j = ezkVar.j;
        }
        if (b(i2, 4096)) {
            this.o = ezkVar.o;
        }
        if (b(i2, 8192)) {
            Drawable drawable3 = ezkVar.x;
            this.x = null;
            this.y = 0;
            this.v &= -16385;
        }
        if (b(ezkVar.v, 16384)) {
            int i3 = ezkVar.y;
            this.y = 0;
            this.x = null;
            this.v &= -8193;
        }
        int i4 = ezkVar.v;
        if (b(i4, 32768)) {
            this.q = ezkVar.q;
        }
        if (b(i4, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE)) {
            this.l = ezkVar.l;
        }
        if (b(i4, 131072)) {
            this.k = ezkVar.k;
        }
        if (b(i4, 2048)) {
            this.n.putAll(ezkVar.n);
            this.t = ezkVar.t;
        }
        if (b(ezkVar.v, ImageMetadata.LENS_APERTURE)) {
            this.s = ezkVar.s;
        }
        if (!this.l) {
            this.n.clear();
            int i5 = this.v;
            this.k = false;
            this.v = i5 & (-133121);
            this.t = true;
        }
        this.v |= ezkVar.v;
        this.m.c(ezkVar.m);
        L();
        return this;
    }

    @Override // 
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public ezk clone() {
        try {
            ezk ezkVar = (ezk) super.clone();
            eqm eqmVar = new eqm();
            ezkVar.m = eqmVar;
            eqmVar.c(this.m);
            fal falVar = new fal();
            ezkVar.n = falVar;
            falVar.putAll(this.n);
            ezkVar.p = false;
            ezkVar.r = false;
            return ezkVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public int hashCode() {
        float f = this.a;
        char[] cArr = fax.a;
        int iC = fax.c(this.l ? 1 : 0, fax.c(this.k ? 1 : 0, fax.c(this.i, fax.c(this.h, fax.c(this.g ? 1 : 0, fax.d(null, fax.c(0, fax.d(null, fax.c(this.f, fax.d(null, fax.c(this.d, fax.c(Float.floatToIntBits(f), 17))))))))))));
        boolean z = this.s;
        return fax.d(this.q, fax.d(this.j, fax.d(this.o, fax.d(this.n, fax.d(this.m, fax.d(this.c, fax.d(this.b, fax.c(z ? 1 : 0, fax.c(0, iC)))))))));
    }

    public final ezk k() {
        return z(ewu.d, new ewi());
    }

    public final ezk l(Class cls) {
        if (this.r) {
            return clone().l(cls);
        }
        eoz.k(cls);
        this.o = cls;
        this.v |= 4096;
        L();
        return this;
    }

    public final ezk m(esh eshVar) {
        if (this.r) {
            return clone().m(eshVar);
        }
        eoz.k(eshVar);
        this.b = eshVar;
        this.v |= 4;
        L();
        return this;
    }

    public final ezk n() {
        return a(ewu.b, new exc(), true);
    }

    public final ezk o() {
        return p(ewu.c, new ewj());
    }

    public final ezk p(ewu ewuVar, eqq eqqVar) {
        return a(ewuVar, eqqVar, false);
    }

    public final ezk q(ewu ewuVar, eqq eqqVar) {
        if (this.r) {
            return clone().q(ewuVar, eqqVar);
        }
        D(ewuVar);
        return y(eqqVar, false);
    }

    public final ezk r(int i, int i2) {
        if (this.r) {
            return clone().r(i, i2);
        }
        this.i = i;
        this.h = i2;
        this.v |= 512;
        L();
        return this;
    }

    public final ezk s(epb epbVar) {
        if (this.r) {
            return clone().s(epbVar);
        }
        eoz.k(epbVar);
        this.c = epbVar;
        this.v |= 8;
        L();
        return this;
    }

    final ezk t(eql eqlVar) {
        if (this.r) {
            return clone().t(eqlVar);
        }
        this.m.b.remove(eqlVar);
        L();
        return this;
    }

    public final ezk u(eql eqlVar, Object obj) {
        if (this.r) {
            return clone().u(eqlVar, obj);
        }
        eoz.k(eqlVar);
        eoz.k(obj);
        this.m.d(eqlVar, obj);
        L();
        return this;
    }

    public final ezk v(eqi eqiVar) {
        if (this.r) {
            return clone().v(eqiVar);
        }
        eoz.k(eqiVar);
        this.j = eqiVar;
        this.v |= 1024;
        L();
        return this;
    }

    public final ezk w(Resources.Theme theme) {
        if (this.r) {
            return clone().w(theme);
        }
        this.q = theme;
        if (theme != null) {
            this.v |= 32768;
            return u(exz.a, theme);
        }
        this.v &= -32769;
        return t(exz.a);
    }

    public final ezk x(eqq eqqVar) {
        return y(eqqVar, true);
    }

    final ezk y(eqq eqqVar, boolean z) {
        if (this.r) {
            return clone().y(eqqVar, z);
        }
        exa exaVar = new exa(eqqVar, z);
        A(Bitmap.class, eqqVar, z);
        A(Drawable.class, exaVar, z);
        A(BitmapDrawable.class, exaVar, z);
        A(eyd.class, new eyg(eqqVar), z);
        L();
        return this;
    }

    public final ezk z(ewu ewuVar, eqq eqqVar) {
        if (this.r) {
            return clone().z(ewuVar, eqqVar);
        }
        D(ewuVar);
        return x(eqqVar);
    }
}
