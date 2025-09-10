package defpackage;

import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ehu extends ehd {
    private final Object e;

    public ehu(elq elqVar) {
        this(elqVar, null);
    }

    @Override // defpackage.ehd
    public final float a() {
        return 1.0f;
    }

    @Override // defpackage.ehd
    public final Object e() {
        elq elqVar = this.d;
        Object obj = this.e;
        float f = this.c;
        return elqVar.b(0.0f, 0.0f, obj, obj, f, f, f);
    }

    @Override // defpackage.ehd
    public final Object f(elo eloVar, float f) {
        return e();
    }

    @Override // defpackage.ehd
    public final void i() {
        if (this.d != null) {
            super.i();
        }
    }

    @Override // defpackage.ehd
    public final void j(float f) {
        this.c = f;
    }

    public ehu(elq elqVar, Object obj) {
        super(Collections.EMPTY_LIST);
        this.d = elqVar;
        this.e = obj;
    }
}
