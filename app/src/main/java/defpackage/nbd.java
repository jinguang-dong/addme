package defpackage;

import android.view.View;
import j$.util.Optional;
import j$.util.OptionalInt;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nbd {
    private Object a;
    private String b;
    private OptionalInt c;
    private OptionalInt d;
    private Optional e;
    private Optional f;
    private OptionalInt g;
    private Optional h;
    private OptionalInt i;
    private boolean j;
    private boolean k;
    private byte l;

    public nbd() {
        throw null;
    }

    public final nbe a() {
        Object obj;
        String str;
        if (this.l != 3 || (obj = this.a) == null || (str = this.b) == null) {
            throw new IllegalStateException();
        }
        return new nbe(obj, str, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
    }

    public final void b(boolean z) {
        this.k = z;
        this.l = (byte) (this.l | 2);
    }

    public final void c(String str) {
        this.e = Optional.of(str);
    }

    public final void d(String str) {
        this.f = Optional.of(str);
    }

    public final void e(int i) {
        this.g = OptionalInt.of(i);
    }

    public final void f(boolean z) {
        this.j = z;
        this.l = (byte) (this.l | 1);
    }

    public final void g(int i) {
        this.i = OptionalInt.of(i);
    }

    public final void h(int i) {
        this.c = OptionalInt.of(i);
    }

    public final void i(int i) {
        this.d = OptionalInt.of(i);
    }

    public final void j(Object obj) {
        obj.getClass();
        this.a = obj;
    }

    public final void k(View.OnClickListener onClickListener) {
        this.h = Optional.of(onClickListener);
    }

    public final void l(String str) {
        str.getClass();
        this.b = str;
    }

    public nbd(byte[] bArr) {
        this.c = OptionalInt.empty();
        this.d = OptionalInt.empty();
        this.e = Optional.empty();
        this.f = Optional.empty();
        this.g = OptionalInt.empty();
        this.h = Optional.empty();
        this.i = OptionalInt.empty();
    }

    public nbd(nbe nbeVar) {
        this.c = OptionalInt.empty();
        this.d = OptionalInt.empty();
        this.e = Optional.empty();
        this.f = Optional.empty();
        this.g = OptionalInt.empty();
        this.h = Optional.empty();
        this.i = OptionalInt.empty();
        this.a = nbeVar.a;
        this.b = nbeVar.b;
        this.c = nbeVar.c;
        this.d = nbeVar.d;
        this.e = nbeVar.e;
        this.f = nbeVar.f;
        this.g = nbeVar.g;
        this.h = nbeVar.h;
        this.i = nbeVar.i;
        this.j = nbeVar.j;
        this.k = nbeVar.k;
        this.l = (byte) 3;
    }
}
