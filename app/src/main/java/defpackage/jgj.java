package defpackage;

import j$.lang.Iterable$EL;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jgj implements jhh, jhc, jhe, jhf, jhg {
    public jgs d;
    private jgs f;
    private jgs g;
    final List a = new ArrayList();
    final List b = new ArrayList();
    private int e = 0;
    public int c = 0;

    public final void a(jgs jgsVar) {
        this.b.remove(jgsVar);
    }

    @Override // defpackage.jhc
    public final void ea() {
        int i = this.c - 1;
        this.c = i;
        a.I(i >= 0);
        if (this.c == 0) {
            a(this.g);
            for (jhh jhhVar : this.a) {
                if (jhhVar instanceof jgl) {
                    ((jgl) jhhVar).b();
                }
            }
        }
    }

    @Override // defpackage.jhe
    public final void eb() {
        int i = this.c + 1;
        this.c = i;
        a.I(i > 0);
        if (this.c == 1) {
            jgi jgiVar = new jgi(3);
            f(jgiVar);
            this.g = jgiVar;
        }
    }

    @Override // defpackage.jhf
    public final void ej() {
        int i = this.e + 1;
        this.e = i;
        a.I(i > 0);
        if (this.e == 1) {
            jgi jgiVar = new jgi(2);
            f(jgiVar);
            this.f = jgiVar;
        }
    }

    @Override // defpackage.jhg
    public final void eu() {
        int i = this.e - 1;
        this.e = i;
        a.I(i >= 0);
        if (this.e == 0) {
            a(this.f);
            for (jhh jhhVar : this.a) {
                if (jhhVar instanceof mhn) {
                    ((mhn) jhhVar).f();
                }
            }
        }
    }

    public final void f(jgs jgsVar) {
        Iterable$EL.forEach(this.a, new gok(jgsVar, 4));
        this.b.add(jgsVar);
    }

    public final void g(jhh jhhVar) {
        out.a();
        this.a.add(jhhVar);
        Iterable$EL.forEach(this.b, new gok(jhhVar, 5));
    }
}
