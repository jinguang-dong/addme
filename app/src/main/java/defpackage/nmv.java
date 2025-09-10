package defpackage;

import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nmv {
    private final nmu a;
    private final nmu b;
    private final nmu c;
    private final nmu d;
    private float e = 0.0f;
    private float f = 0.0f;
    private float g = 0.0f;
    private float h = 0.0f;

    public nmv(int i) {
        this.a = new nmu(i);
        this.b = new nmu(i);
        this.c = new nmu(i);
        this.d = new nmu(i);
    }

    public final RectF a() {
        float f = this.e;
        float f2 = this.g / 2.0f;
        float f3 = this.f;
        float f4 = this.h / 2.0f;
        return new RectF(f - f2, f3 - f4, f + f2, f3 + f4);
    }

    public final void b(RectF rectF) {
        nmu nmuVar = this.a;
        nmuVar.a(rectF.centerX());
        this.e = nmuVar.a;
        nmu nmuVar2 = this.b;
        nmuVar2.a(rectF.centerY());
        this.f = nmuVar2.a;
        nmu nmuVar3 = this.c;
        nmuVar3.a(rectF.width());
        this.g = nmuVar3.a;
        nmu nmuVar4 = this.d;
        nmuVar4.a(rectF.height());
        this.h = nmuVar4.a;
    }

    public final void c() {
        nmu nmuVar = this.a;
        nmuVar.b();
        nmuVar.b();
        nmu nmuVar2 = this.c;
        nmuVar2.b();
        nmuVar2.b();
    }
}
