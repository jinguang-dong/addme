package defpackage;

import android.graphics.Path;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class egv implements egq, egy {
    private final boolean b;
    private final efs c;
    private final ehp d;
    private boolean e;
    private final Path a = new Path();
    private final cxb f = new cxb((short[]) null);

    public egv(efs efsVar, ejh ejhVar, ejd ejdVar) {
        this.b = ejdVar.b;
        this.c = efsVar;
        ehp ehpVarA = ejdVar.a.a();
        this.d = ehpVarA;
        ejhVar.i(ehpVarA);
        ehpVarA.h(this);
    }

    @Override // defpackage.egy
    public final void d() {
        this.e = false;
        this.c.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    @Override // defpackage.egg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(java.util.List r6, java.util.List r7) {
        /*
            r5 = this;
            r7 = 0
            r0 = 0
        L2:
            int r1 = r6.size()
            if (r7 >= r1) goto L36
            java.lang.Object r1 = r6.get(r7)
            egg r1 = (defpackage.egg) r1
            boolean r2 = r1 instanceof defpackage.egx
            if (r2 == 0) goto L23
            r2 = r1
            egx r2 = (defpackage.egx) r2
            int r3 = r2.e
            r4 = 1
            if (r3 != r4) goto L23
            cxb r1 = r5.f
            r1.i(r2)
            r2.a(r5)
            goto L33
        L23:
            boolean r2 = r1 instanceof defpackage.egu
            if (r2 == 0) goto L33
            if (r0 != 0) goto L2e
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L2e:
            egu r1 = (defpackage.egu) r1
            r0.add(r1)
        L33:
            int r7 = r7 + 1
            goto L2
        L36:
            ehp r5 = r5.d
            r5.e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.egv.f(java.util.List, java.util.List):void");
    }

    @Override // defpackage.egg
    public final String g() {
        throw null;
    }

    @Override // defpackage.egq
    public final Path i() {
        if (this.e) {
            return this.a;
        }
        Path path = this.a;
        path.reset();
        if (this.b) {
            this.e = true;
            return path;
        }
        Path path2 = (Path) this.d.e();
        if (path2 == null) {
            return path;
        }
        path.set(path2);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f.j(path);
        this.e = true;
        return path;
    }
}
