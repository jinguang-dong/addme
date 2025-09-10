package defpackage;

import android.content.res.Resources;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class eup implements eqv {
    private final Resources.Theme a;
    private final Resources b;
    private final euq c;
    private final int d;
    private Object e;

    public eup(Resources.Theme theme, Resources resources, euq euqVar, int i) {
        this.a = theme;
        this.b = resources;
        this.c = euqVar;
        this.d = i;
    }

    @Override // defpackage.eqv
    public final Class a() {
        return this.c.a();
    }

    @Override // defpackage.eqv
    public final void d() {
        Object obj = this.e;
        if (obj != null) {
            try {
                this.c.d(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.eqv
    public final void f(epb epbVar, equ equVar) {
        try {
            Object objC = this.c.c(this.a, this.b, this.d);
            this.e = objC;
            equVar.b(objC);
        } catch (Resources.NotFoundException e) {
            equVar.e(e);
        }
    }

    @Override // defpackage.eqv
    public final int g() {
        return 1;
    }

    @Override // defpackage.eqv
    public final void dE() {
    }
}
