package defpackage;

import java.io.File;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class eru implements erx, equ {
    private final List a;
    private final ery b;
    private final erw c;
    private int d = -1;
    private eqi e;
    private List f;
    private int g;
    private File h;
    private volatile tdy i;

    public eru(List list, ery eryVar, erw erwVar) {
        this.a = list;
        this.b = eryVar;
        this.c = erwVar;
    }

    private final boolean d() {
        return this.g < this.f.size();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [eqv, java.lang.Object] */
    @Override // defpackage.erx
    public final void a() {
        tdy tdyVar = this.i;
        if (tdyVar != null) {
            tdyVar.b.dE();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [eqv, java.lang.Object] */
    @Override // defpackage.equ
    public final void b(Object obj) {
        this.c.d(this.e, obj, this.i.b, 3, this.e);
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [eqv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [eqv, java.lang.Object] */
    @Override // defpackage.erx
    public final boolean c() {
        while (true) {
            boolean z = false;
            if (this.f != null && d()) {
                this.i = null;
                while (!z && d()) {
                    List list = this.f;
                    int i = this.g;
                    this.g = i + 1;
                    evg evgVar = (evg) list.get(i);
                    File file = this.h;
                    ery eryVar = this.b;
                    this.i = evgVar.b(file, eryVar.e, eryVar.f, eryVar.h);
                    if (this.i != null && eryVar.g(this.i.b.a())) {
                        this.i.b.f(eryVar.n, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.d + 1;
            this.d = i2;
            List list2 = this.a;
            if (i2 >= list2.size()) {
                return false;
            }
            eqi eqiVar = (eqi) list2.get(this.d);
            ery eryVar2 = this.b;
            File fileA = eryVar2.c().a(new erv(eqiVar, eryVar2.m));
            this.h = fileA;
            if (fileA != null) {
                this.e = eqiVar;
                this.f = eryVar2.f(fileA);
                this.g = 0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [eqv, java.lang.Object] */
    @Override // defpackage.equ
    public final void e(Exception exc) {
        this.c.b(this.e, exc, this.i.b, 3);
    }
}
