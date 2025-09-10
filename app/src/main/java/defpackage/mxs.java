package defpackage;

import android.graphics.RectF;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mxs {
    public Size a;
    public Size b;
    public Size c;
    public Integer d;
    public RectF e;
    private Size f;
    private mxm g;
    private nkw h;
    private mxj i;
    private byte j;

    public mxs() {
    }

    public final mxt a() {
        Size size = this.c;
        Integer num = this.d;
        if (size != null && num != null) {
            mxm mxmVar = this.g;
            if (mxmVar == null) {
                throw new IllegalStateException();
            }
            pao paoVarB = pao.b(mxmVar.e + num.intValue());
            boolean z = paoVarB.equals(pao.CLOCKWISE_90) || paoVarB.equals(pao.CLOCKWISE_270);
            this.f = new Size(z ? size.getHeight() : size.getWidth(), z ? size.getWidth() : size.getHeight());
        }
        if (this.j != 1 || this.e == null || this.g == null || this.h == null || this.i == null) {
            throw new IllegalStateException();
        }
        return new mxt(this.a, this.b, this.c, this.f, this.d, this.e, this.g, this.h, this.i);
    }

    public final void b(mxj mxjVar) {
        mxjVar.getClass();
        this.i = mxjVar;
    }

    public final void c() {
        this.j = (byte) 1;
    }

    public final void d(nkw nkwVar) {
        nkwVar.getClass();
        this.h = nkwVar;
    }

    public final void e(mxm mxmVar) {
        mxmVar.getClass();
        this.g = mxmVar;
    }

    public mxs(mxt mxtVar) {
        this.a = mxtVar.b;
        this.b = mxtVar.c;
        this.c = mxtVar.d;
        this.f = mxtVar.e;
        this.d = mxtVar.f;
        this.e = mxtVar.g;
        this.g = mxtVar.h;
        this.h = mxtVar.i;
        this.i = mxtVar.j;
        this.j = (byte) 1;
    }
}
