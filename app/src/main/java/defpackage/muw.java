package defpackage;

import android.graphics.RectF;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class muw {
    public RectF a;
    public Optional b;
    private muz c;
    private int d;
    private int e;
    private String f;
    private String g;
    private float h;
    private float i;
    private float j;
    private byte k;
    private int l;

    public muw() {
        throw null;
    }

    public final mux a() {
        muz muzVar;
        RectF rectF;
        String str;
        String str2;
        int i;
        if (this.k != 31 || (muzVar = this.c) == null || (rectF = this.a) == null || (str = this.f) == null || (str2 = this.g) == null || (i = this.l) == 0) {
            throw new IllegalStateException();
        }
        return new mux(muzVar, this.d, this.e, rectF, str, str2, i, this.h, this.i, this.j, this.b);
    }

    public final void b(int i) {
        if (i == 0) {
            throw null;
        }
        this.l = i;
    }

    public final void c(int i) {
        this.d = i;
        this.k = (byte) (this.k | 1);
    }

    public final void d(String str) {
        str.getClass();
        this.f = str;
    }

    public final void e(String str) {
        str.getClass();
        this.g = str;
    }

    public final void f(float f) {
        this.h = f;
        this.k = (byte) (this.k | 4);
    }

    public final void g(float f) {
        this.i = f;
        this.k = (byte) (this.k | 8);
    }

    public final void h(int i) {
        this.e = i;
        this.k = (byte) (this.k | 2);
    }

    public final void i(float f) {
        this.j = f;
        this.k = (byte) (this.k | 16);
    }

    public final void j(muz muzVar) {
        muzVar.getClass();
        this.c = muzVar;
    }

    public muw(byte[] bArr) {
        this.b = Optional.empty();
    }

    public muw(mux muxVar) {
        this.b = Optional.empty();
        this.c = muxVar.a;
        this.d = muxVar.b;
        this.e = muxVar.c;
        this.a = muxVar.d;
        this.f = muxVar.e;
        this.g = muxVar.f;
        this.l = muxVar.k;
        this.h = muxVar.g;
        this.i = muxVar.h;
        this.j = muxVar.i;
        this.b = muxVar.j;
        this.k = (byte) 31;
    }
}
